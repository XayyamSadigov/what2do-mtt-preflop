package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Database {

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    static {
        Connect();
    }

    private static void Connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + Main.db);
            statement = connection.createStatement();
            System.out.println("Connection created.");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }

    private static void Close() {
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }

    public static boolean add(int stack,
            String position,
            String hand,
            String rfi,
            String vs_rfi,
            String vs_3bet,
            String vs_4bet,
            String push,
            String vs_push,
            String info) {

        if (!isExists(stack, position, hand)) {
            try {
                String sql = "INSERT INTO 'hands' VALUES (" + stack + ","
                        + "'" + position + "',"
                        + "'" + hand + "',"
                        + "'" + rfi + "',"
                        + "'" + vs_rfi + "',"
                        + "'" + vs_3bet + "',"
                        + "'" + vs_4bet + "',"
                        + "'" + push + "',"
                        + "'" + vs_push + "',"
                        + "'" + info + "'"
                        + "); ";
                System.out.println(sql);
                statement.execute(sql);

                System.out.println("Row inserted.");

                return true;
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        }
        return false;
    }

    public static boolean update(int stack,
            String position,
            String hand,
            String rfi,
            String vs_rfi,
            String vs_3bet,
            String vs_4bet,
            String push,
            String vs_push,
            String info) {

        try {

            String sql = "UPDATE 'hands' set "
                    + "position='" + position + "',"
                    + "hand='" + hand + "',"
                    + "rfi='" + rfi + "',"
                    + "vs_rfi='" + vs_rfi + "',"
                    + "vs_3bet='" + vs_3bet + "',"
                    + "vs_4bet='" + vs_4bet + "',"
                    + "push='" + push + "',"
                    + "vs_push='" + vs_push + "',"
                    + "info='" + info + "'"
                    + " where position = '" + position + "' "
                    + "and hand='" + hand + "' "
                    + "and stack = " + get(stack, position, hand).getStack()
                    + "; ";
            System.out.println(sql);
            statement.execute(sql);
            System.out.println("Row updated.");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        return false;
    }

    public static Hand get(int stack,
            String position,
            String hand) {
        System.out.println("get = stack:" + stack + " position:" + position + " hand:" + hand);
        try {
            int lowerStack = 0;
            int upperStack = 0;
            int getStack = 0;
            Hand handObj = null;
            String sql = "";
            sql = "SELECT min(stack) stack FROM 'hands' "
                    + " where position = '" + position + "' "
                    + "and hand ='" + hand + "'  and stack >=" + stack;
            System.out.println(sql);
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("Setting upperStack to " + resultSet.getInt("stack"));
                upperStack = resultSet.getInt("stack");
            }

            sql = "SELECT max(stack) stack FROM 'hands' "
                    + " where position = '" + position + "' "
                    + "and hand ='" + hand + "'  and stack <=" + stack;
            System.out.println(sql);
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("Setting lowerStack to " + resultSet.getInt("stack"));
                lowerStack = resultSet.getInt("stack");
            }
            System.out.println("lowerStack:" + lowerStack + " upperStack:" + upperStack + " stack:" + stack);

            if (lowerStack == 0 && upperStack != 0) {
                getStack = upperStack;
            } else if (upperStack == 0 && lowerStack != 0) {
                getStack = lowerStack;
            } else if (stack - lowerStack > upperStack - stack) {
                getStack = lowerStack;
            } else {
                getStack = upperStack;
            }

            sql = "SELECT * FROM 'hands' "
                    + " where position = '" + position + "' "
                    + "and hand ='" + hand + "' "
                    + "and stack = " + getStack;
            System.out.println(sql);
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                handObj = new Hand(resultSet.getInt("stack"),
                        resultSet.getString("position"),
                        resultSet.getString("hand"),
                        resultSet.getString("rfi"),
                        resultSet.getString("vs_rfi"),
                        resultSet.getString("vs_3bet"),
                        resultSet.getString("vs_4bet"),
                        resultSet.getString("push"),
                        resultSet.getString("vs_push"),
                        resultSet.getString("info"));
            }

            return handObj;

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }

        return null;
    }

    public static boolean isExists(int stack,
            String position,
            String hand) {

        try {

            String sql = "SELECT * FROM 'hands' "
                    + " where position = '" + position + "' "
                    + "and hand ='" + hand + "'  and stack=" + stack;

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("Exists");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Not exists");
        return false;
    }

}

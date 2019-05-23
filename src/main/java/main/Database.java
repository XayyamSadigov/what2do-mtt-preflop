package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
    public static void Conn() throws ClassNotFoundException, SQLException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:db.s3db");

        System.out.println("База Подключена!");
    }

    // --------Заполнение таблицы--------
    public static void WriteDB() throws SQLException {
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Petya', 125453); ");
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Vasya', 321789); ");
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Masha', 456123); ");

        System.out.println("Таблица заполнена");
    }

    // -------- Вывод таблицы--------
    public static void ReadDB() throws ClassNotFoundException, SQLException {
        statmt = conn.createStatement();

        resSet = statmt.executeQuery("SELECT * FROM users where name = 'Petya'");

        while (resSet.next()) {
            int id = resSet.getInt("id");
            String name = resSet.getString("name");
            String phone = resSet.getString("phone");
            System.out.println("ID = " + id);
            System.out.println("name = " + name);
            System.out.println("phone = " + phone);
            System.out.println();
        }

        System.out.println("Таблица выведена");
    }

    public static void run() {
        try {
            Database.Conn();
//            Database.CreateDB();
//            Database.WriteDB();
            Database.ReadDB();
//            Database.CloseDB();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

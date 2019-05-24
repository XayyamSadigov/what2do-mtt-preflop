package main;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private int stack;
    private String position;
    private String hand;
    private String rfi;
    private String vs_rfi;
    private String vs_3bet;
    private String vs_4bet;
    private String push;
    private String vs_push;
    private String info;

    public Hand(int stack, String position, String hand, String rfi, String vs_rfi, String vs_3bet, String vs_4bet, String push, String vs_push, String info) {
        this.stack = stack;
        this.position = position;
        this.hand = hand;
        this.rfi = rfi;
        this.vs_rfi = vs_rfi;
        this.vs_3bet = vs_3bet;
        this.vs_4bet = vs_4bet;
        this.push = push;
        this.vs_push = vs_push;
        this.info = info;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getRfi() {
        return rfi;
    }

    public Option getOption(int id) {
        for (Option o : Option.values()) {
            if (o.id == id) {
                return o;
            }
        }
        return null;
    }

    public List<Option> getRfiOptions() {
        List<Option> list = new ArrayList<>();
        for (String s : getRfi().split(",")) {
            try {
                list.add(getOption(Integer.parseInt(s)));
            } catch (NumberFormatException e) {

            }
        }
        return list;
    }

    public void setRfi(String rfi) {
        this.rfi = rfi;
    }

    public String getVs_rfi() {
        return vs_rfi;
    }

    public List<Option> getVs_rfiOptions() {
        List<Option> list = new ArrayList<>();
        for (String s : getVs_rfi().split(",")) {
            try {
                list.add(getOption(Integer.parseInt(s)));
            } catch (NumberFormatException e) {

            }
        }
        return list;
    }

    public void setVs_rfi(String vs_rfi) {
        this.vs_rfi = vs_rfi;
    }

    public String getVs_3bet() {
        return vs_3bet;
    }

    public List<Option> getVs_3betOptions() {
        List<Option> list = new ArrayList<>();
        for (String s : getVs_3bet().split(",")) {
            try {
                list.add(getOption(Integer.parseInt(s)));
            } catch (NumberFormatException e) {

            }
        }
        return list;
    }

    public void setVs_3bet(String vs_3bet) {
        this.vs_3bet = vs_3bet;
    }

    public String getVs_4bet() {
        return vs_4bet;
    }

    public List<Option> getVs_4betOptions() {
        List<Option> list = new ArrayList<>();
        for (String s : getVs_4bet().split(",")) {
            try {
                list.add(getOption(Integer.parseInt(s)));
            } catch (NumberFormatException e) {

            }
        }
        return list;
    }

    public void setVs_4bet(String vs_4bet) {
        this.vs_4bet = vs_4bet;
    }

    public String getPush() {
        return push;
    }

    public List<Option> getPushOptions() {
        List<Option> list = new ArrayList<>();
        for (String s : getPush().split(",")) {
            try {
                list.add(getOption(Integer.parseInt(s)));
            } catch (NumberFormatException e) {

            }
        }
        return list;
    }

    public void setPush(String push) {
        this.push = push;
    }

    public String getVs_push() {
        return vs_push;
    }

    public List<Option> getVs_pushOptions() {
        List<Option> list = new ArrayList<>();
        for (String s : getVs_push().split(",")) {
            try {
                list.add(getOption(Integer.parseInt(s)));
            } catch (NumberFormatException e) {

            }
        }
        return list;
    }

    public void setVs_push(String vs_push) {
        this.vs_push = vs_push;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}

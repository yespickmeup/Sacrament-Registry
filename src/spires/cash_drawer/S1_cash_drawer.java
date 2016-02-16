/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.cash_drawer;

import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Ronald
 */
public class S1_cash_drawer {

    public static class to_cash_drawer {

        public final int id;
        public final String user_id;
        public final String user_name;
        public final String screen_name;
        public final double cash_in;
        public final String time_in;
        public final String time_out;
        public final double thousand;
        public final double five_hundred;
        public final double two_hundred;
        public final double one_hundred;
        public final double fifty;
        public final double twenty;
        public final double coins;

        public to_cash_drawer(int id, String user_id, String user_name, String screen_name, double cash_in, String time_in, String time_out, double thousand, double five_hundred, double two_hundred, double one_hundred, double fifty, double twenty, double coins) {
            this.id = id;
            this.user_id = user_id;
            this.user_name = user_name;
            this.screen_name = screen_name;
            this.cash_in = cash_in;
            this.time_in = time_in;
            this.time_out = time_out;
            this.thousand = thousand;
            this.five_hundred = five_hundred;
            this.two_hundred = two_hundred;
            this.one_hundred = one_hundred;
            this.fifty = fifty;
            this.twenty = twenty;
            this.coins = coins;
        }
    }

    public static void add_cash_drawer(to_cash_drawer to_cash_drawer) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into cash_drawer("
                    + "user_id"
                    + ",user_name"
                    + ",screen_name"
                    + ",cash_in"
                    + ",time_in"
                    + ",time_out"
                    + ",thousand"
                    + ",five_hundred"
                    + ",two_hundred"
                    + ",one_hundred"
                    + ",fifty"
                    + ",twenty"
                    + ",coins"
                    + ")values("
                    + ":user_id"
                    + ",:user_name"
                    + ",:screen_name"
                    + ",:cash_in"
                    + ",:time_in"
                    + ",:time_out"
                    + ",:thousand"
                    + ",:five_hundred"
                    + ",:two_hundred"
                    + ",:one_hundred"
                    + ",:fifty"
                    + ",:twenty"
                    + ",:coins"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("user_id", to_cash_drawer.user_id)
                    .setString("user_name", to_cash_drawer.user_name)
                    .setString("screen_name", to_cash_drawer.screen_name)
                    .setNumber("cash_in", to_cash_drawer.cash_in)
                    .setString("time_in", to_cash_drawer.time_in)
                    .setString("time_out", to_cash_drawer.time_out)
                    .setNumber("thousand", to_cash_drawer.thousand)
                    .setNumber("five_hundred", to_cash_drawer.five_hundred)
                    .setNumber("two_hundred", to_cash_drawer.two_hundred)
                    .setNumber("one_hundred", to_cash_drawer.one_hundred)
                    .setNumber("fifty", to_cash_drawer.fifty)
                    .setNumber("twenty", to_cash_drawer.twenty)
                    .setNumber("coins", to_cash_drawer.coins)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cash_drawer.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_cash_drawer(to_cash_drawer to_cash_drawer) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cash_drawer set "
                    + "user_id= :user_id"
                    + ",user_name= :user_name"
                    + ",screen_name= :screen_name"
                    + ",cash_in= :cash_in"
                    + ",time_in= :time_in"
                    + ",time_out= :time_out"
                    + ",thousand= :thousand"
                    + ",five_hundred= :five_hundred"
                    + ",two_hundred= :two_hundred"
                    + ",one_hundred= :one_hundred"
                    + ",fifty= :fifty"
                    + ",twenty= :twenty"
                    + ",coins= :coins"
                    + " where "
                    + " id ='" + to_cash_drawer.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("user_id", to_cash_drawer.user_id)
                    .setString("user_name", to_cash_drawer.user_name)
                    .setString("screen_name", to_cash_drawer.screen_name)
                    .setNumber("cash_in", to_cash_drawer.cash_in)
                    .setString("time_in", to_cash_drawer.time_in)
                    .setString("time_out", to_cash_drawer.time_out)
                    .setNumber("thousand", to_cash_drawer.thousand)
                    .setNumber("five_hundred", to_cash_drawer.five_hundred)
                    .setNumber("two_hundred", to_cash_drawer.two_hundred)
                    .setNumber("one_hundred", to_cash_drawer.one_hundred)
                    .setNumber("fifty", to_cash_drawer.fifty)
                    .setNumber("twenty", to_cash_drawer.twenty)
                    .setNumber("coins", to_cash_drawer.coins)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cash_drawer.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_cash_drawer(to_cash_drawer to_cash_drawer) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cash_drawer where "
                    + " id ='" + to_cash_drawer.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cash_drawer.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cash_drawer> ret_data(String where) {
        List<to_cash_drawer> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",user_id"
                    + ",user_name"
                    + ",screen_name"
                    + ",cash_in"
                    + ",time_in"
                    + ",time_out"
                    + ",thousand"
                    + ",five_hundred"
                    + ",two_hundred"
                    + ",one_hundred"
                    + ",fifty"
                    + ",twenty"
                    + ",coins"
                    + " from cash_drawer  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String user_id = rs.getString(2);
                String user_name = rs.getString(3);
                String screen_name = rs.getString(4);
                double cash_in = rs.getDouble(5);
                String time_in = rs.getString(6);
                String time_out = rs.getString(7);
                double thousand = rs.getDouble(8);
                double five_hundred = rs.getDouble(9);
                double two_hundred = rs.getDouble(10);
                double one_hundred = rs.getDouble(11);
                double fifty = rs.getDouble(12);
                double twenty = rs.getDouble(13);
                double coins = rs.getDouble(14);

                to_cash_drawer to = new to_cash_drawer(id, user_id, user_name, screen_name, cash_in, time_in, time_out, thousand, five_hundred, two_hundred, one_hundred, fifty, twenty, coins);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static to_cash_drawer ret_data_to(String where) {
        to_cash_drawer to1 = null;

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",user_id"
                    + ",user_name"
                    + ",screen_name"
                    + ",cash_in"
                    + ",time_in"
                    + ",time_out"
                    + ",thousand"
                    + ",five_hundred"
                    + ",two_hundred"
                    + ",one_hundred"
                    + ",fifty"
                    + ",twenty"
                    + ",coins"
                    + " from cash_drawer  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                int id = rs.getInt(1);
                String user_id = rs.getString(2);
                String user_name = rs.getString(3);
                String screen_name = rs.getString(4);
                double cash_in = rs.getDouble(5);
                String time_in = rs.getString(6);
                String time_out = rs.getString(7);
                double thousand = rs.getDouble(8);
                double five_hundred = rs.getDouble(9);
                double two_hundred = rs.getDouble(10);
                double one_hundred = rs.getDouble(11);
                double fifty = rs.getDouble(12);
                double twenty = rs.getDouble(13);
                double coins = rs.getDouble(14);

                to1 = new to_cash_drawer(id, user_id, user_name, screen_name, cash_in, time_in, time_out, thousand, five_hundred, two_hundred, one_hundred, fifty, twenty, coins);
            }
            return to1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

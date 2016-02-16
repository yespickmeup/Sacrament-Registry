package spires.my_parishioners;

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ronald
 */
public class S1_my_parishioners {

    public static class to_my_parishioners {

        public final int id;
        public final String parishioner;
        public final String contact_no;

        public to_my_parishioners(int id, String parishioner, String contact_no) {
            this.id = id;
            this.parishioner = parishioner;
            this.contact_no = contact_no;
        }
    }

    public static void main(String[] args) {
        to_my_parishioners to1 = new to_my_parishioners(0, "Clinton Blaire Aranas", "098811029311");
        to_my_parishioners to2 = new to_my_parishioners(0, "Nizzah Marie Aranas", "098811029312");
        to_my_parishioners to3 = new to_my_parishioners(0, "Neil Nazareth Aguilar", "098811029313");
        to_my_parishioners to4 = new to_my_parishioners(0, "Jessa Alviola", "098811029314");
        to_my_parishioners to5 = new to_my_parishioners(0, "Remark Baldoza", "098811029355");
        to_my_parishioners to6 = new to_my_parishioners(0, "Kallen Mae Marie Banlaygas", "098811029316");
        to_my_parishioners to7 = new to_my_parishioners(0, "Cleford Banquerigo", "098811029317");
        to_my_parishioners to8 = new to_my_parishioners(0, "Steven Earl Gabriel", "098811029318");
        to_my_parishioners to9 = new to_my_parishioners(0, "Charmayne Malco", "098811029319");
        to_my_parishioners to10 = new to_my_parishioners(0, "Mel Vincent Navarra", "098811029310");
        add_my_parishioners(to1);
        add_my_parishioners(to2);
        add_my_parishioners(to3);
        add_my_parishioners(to4);
        add_my_parishioners(to5);
        add_my_parishioners(to6);
        add_my_parishioners(to7);
        add_my_parishioners(to8);
        add_my_parishioners(to9);
        add_my_parishioners(to10);
    }

    public static void add_my_parishioners(to_my_parishioners to_my_parishioners) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into my_parishioners("
                    + "parishioner"
                    + ",contact_no"
                    + ")values("
                    + ":parishioner"
                    + ",:contact_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("parishioner", to_my_parishioners.parishioner)
                    .setString("contact_no", to_my_parishioners.contact_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_my_parishioners.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_my_parishioners(to_my_parishioners to_my_parishioners) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update my_parishioners set "
                    + "parishioner= :parishioner"
                    + ",contact_no= :contact_no"
                    + " where "
                    + " id ='" + to_my_parishioners.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("parishioner", to_my_parishioners.parishioner)
                    .setString("contact_no", to_my_parishioners.contact_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_my_parishioners.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_my_parishioners(to_my_parishioners to_my_parishioners) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from my_parishioners where "
                    + " id ='" + to_my_parishioners.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_my_parishioners.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_my_parishioners> ret_data(String where) {
        List<to_my_parishioners> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",parishioner"
                    + ",contact_no"
                    + " from my_parishioners  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String parishioner = rs.getString(2);
                String contact_no = rs.getString(3);

                to_my_parishioners to = new to_my_parishioners(id, parishioner, contact_no);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

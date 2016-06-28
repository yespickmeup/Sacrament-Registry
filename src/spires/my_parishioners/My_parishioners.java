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
import spires.parishioners.S1_parishioner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ronald
 */
public class My_parishioners {

    public static class to_my_parishioners {

        public final int id;
        public final String parishioner;
        public final String contact_no;
        public final String address;
        public to_my_parishioners(int id, String parishioner, String contact_no,String address) {
            this.id = id;
            this.parishioner = parishioner;
            this.contact_no = contact_no;
            this.address=address;
        }
    }

    public static void main(String[] args) {
      
    }

    public static void add_my_parishioners(to_my_parishioners to_my_parishioners) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into my_parishioners("
                    + "parishioner"
                    + ",contact_no"
                    + ",address"
                    + ")values("
                    + ":parishioner"
                    + ",:contact_no"
                    + ",:address"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("parishioner", to_my_parishioners.parishioner)
                    .setString("contact_no", to_my_parishioners.contact_no)
                    .setString("address",to_my_parishioners.address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(My_parishioners.class, "Successfully Added");
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
                    + ",address= :address"
                    + " where "
                    + " id ='" + to_my_parishioners.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("parishioner", to_my_parishioners.parishioner)
                    .setString("contact_no", to_my_parishioners.contact_no)
                    .setString("address",to_my_parishioners.address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(My_parishioners.class, "Successfully Updated");
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
            Lg.s(My_parishioners.class, "Successfully Deleted");
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
                    + ",address"
                    + " from my_parishioners  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String parishioner = rs.getString(2);
                String contact_no = rs.getString(3);
                String address=rs.getString(4);
                to_my_parishioners to = new to_my_parishioners(id, parishioner, contact_no,address);
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

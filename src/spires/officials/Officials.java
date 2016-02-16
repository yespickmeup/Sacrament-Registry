/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.officials;


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
 * @author Maytopacka
 */
public class Officials {

    public static class to_officials {

        public final int id;
        public final String name;
        public final String designation;
        public final String date_added;
        public final String contact;
        public final int is_manager;
        public final String title;

        public to_officials(int id, String name, String designation, String date_added, String contact, int is_manager, String title) {
            this.id = id;
            this.name = name;
            this.designation = designation;
            this.date_added = date_added;
            this.contact = contact;
            this.is_manager = is_manager;
            this.title = title;
        }
    }

    public static void add_officials(to_officials to_officials) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into officials("
                    + "name"
                    + ",designation"
                    + ",date_added"
                    + ",contact"
                    + ",is_manager"
                    + ",title"
                    + ")values("
                    + ":name"
                    + ",:designation"
                    + ",:date_added"
                    + ",:contact"
                    + ",:is_manager"
                    + ",:title"
                    + ")";

            s0 = SqlStringUtil.parse(s0).
                    setString("name", to_officials.name).
                    setString("designation", to_officials.designation).
                    setString("date_added", to_officials.date_added).
                    setString("contact", to_officials.contact).
                    setNumber("is_manager", to_officials.is_manager).
                    setString("title", to_officials.title).
                    ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Officials.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_officials(to_officials to_officials) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update officials set "
                    + "name= :name"
                    + ",designation= :designation"
                    + ",date_added= :date_added"
                    + ",contact= :contact"
                    + ",is_manager= :is_manager"
                    + ",title= :title"
                    + " where "
                    + " id ='" + to_officials.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0).
                    setString("name", to_officials.name).
                    setString("designation", to_officials.designation).
                    setString("date_added", to_officials.date_added).
                    setString("contact", to_officials.contact).
                    setNumber("is_manager", to_officials.is_manager).
                    setString("title", to_officials.title).
                    ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Officials.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_officials(to_officials to_officials) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from officials where "
                    + " id ='" + to_officials.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Officials.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_officials> ret_data(String search) {
        List<to_officials> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",name"
                    + ",designation"
                    + ",date_added"
                    + ",contact"
                    + ",is_manager"
                    + ",title"
                    + " from officials where "
                    + " name like'%" + search + "%' "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String designation = rs.getString(3);
                String date_added = rs.getString(4);
                String contact = rs.getString(5);
                int is_manager = rs.getInt(6);
                String title = rs.getString(7);
                to_officials to = new to_officials(id, name, designation, date_added, contact, is_manager, title);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_officials> retData(String where) {
        List<to_officials> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",name"
                    + ",designation"
                    + ",date_added"
                    + ",contact"
                    + ",is_manager"
                    + ",title"
                    + " from officials"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String designation = rs.getString(3);
                String date_added = rs.getString(4);
                String contact = rs.getString(5);
                int is_manager = rs.getInt(6);
                String title = rs.getString(7);

                to_officials to = new to_officials(id, name, designation, date_added, contact, is_manager, title);
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

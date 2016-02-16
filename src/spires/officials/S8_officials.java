/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.officials;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mijzcx.synapse.desk.utils.Lg;
import spires.util.MyConnection;


/**
 *
 * @author dummy
 */
public class S8_officials {

    public static class to_designation {

        public final String name;
        public final String id;

        public to_designation(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }

    public static class to_official {

        public final String name;
        public final String contact;
        public final String id;
        public final String is_manager;

        public to_official(String name, String contact, String id, String is_manager) {
            this.name = name;
            this.contact = contact;
            this.id = id;
            this.is_manager = is_manager;
        }
    }

    public static List<to_designation> ret_data() {
        List<to_designation> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select name,id from designations";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                String id = rs.getString(2);
                to_designation to = new to_designation(name, id);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_designation(String name) {
        try {
            Connection conn = MyConnection.connect();

            String s0 = "insert into designations (name)values(?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, name);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_designation(String name, String id) {
        try {
            Connection conn = MyConnection.connect();

            String s0 = "update designations set name='" + name + "' where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_designation(String id) {
        try {
            Connection conn = MyConnection.connect();

            String s0 = "delete from designations where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<String> get_designations() {
        List<String> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select name from officials";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                datas.add(name);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_official> ret_datas(String designation, String names) {
        List<to_official> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select name,contact,id ,is_manager from officials where designation='" + designation + "' and name like '%" + names + "%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
                String contact = rs.getString(2);
                String id = rs.getString(3);
                String is_manager = rs.getString(4);
                to_official to = new to_official(name, contact, id, is_manager);
                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_official(String name, String contact, String designation, String is_manager) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into officials(name,contact,designation,is_manager)values(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, name);
            stmt.setString(2, contact);
            stmt.setString(3, designation);
            stmt.setString(4, is_manager);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_official(String name, String contact, String designation, String id, String is_manager) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update officials set "
                    + "name='" + name + "' "
                    + ", contact='" + contact + "' "
                    + ", designation='" + designation + "'"
                    + ", is_manager='" + is_manager + "'"
                    + " where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_official(String id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from officials where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Successfully Deleted");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void main(String[] args) {
        try {
            Connection conn = MyConnection.connect();

            List<String> datas = new ArrayList();

            String s0 = "select priest from baptism2 group by priest";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String name = rs.getString(1);
//                   System.out.println(name);
                datas.add(name);
            }


            for (String s : datas) {
                String s1 = "insert into officials(name,designation,contact,is_manager)values(?,?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.setString(1, s);
                stmt1.setString(2, "Priest");
                stmt1.setString(3, "");
                stmt1.setString(4, "0");
                stmt1.execute();
                Lg.s(S8_officials.class, "Successfully Added");
            }
        } catch (Exception e) {
            MyConnection.close();
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<String> ret_cb_data() {
        List<String> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select name from officials where is_manager='"+"1"+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                datas.add(id);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.book_archives;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import spires.util.MyConnection;
import SR.main.Main;

/**
 *
 * @author dummy
 */
public class S1_book_archives1 {

    public static class to_book_arc {

        public final String id;
        public final String years;
        public final String book_no;
        public final String sac;

        public to_book_arc(String id, String years, String book_no, String sac) {
            this.id = id;
            this.years = years;
            this.book_no = book_no;
            this.sac = sac;
        }
    }

    public static List<to_book_arc> ret_arc(String sac, String search) {
        List<to_book_arc> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select id,years,book_no,sac from book_archives "
                    + "where sac='" + sac + "' and years like'%" + search + "%' or "
                    + "sac='" + sac + "' and book_no like'%" + search + "%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                String years = rs.getString(2);
                String book_no = rs.getString(3);
                String sacs = rs.getString(4);
                to_book_arc to = new to_book_arc(id, years, book_no, sacs);
                datas.add(to);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<String> ret_arc_by_sac(String sac) {
        List<String> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select years from book_archives "
                    + "where sac = '" + sac + "' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {

                String years = rs.getString(1);
                datas.add(years);
            }
            return datas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String ret_arc_year(String book_no) {
        String year = "0";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select years from book_archives "
                    + "where book_no = '" + book_no + "' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {

                year = rs.getString(1);

            }
            return year;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String ret_arc_book_no(String year) {
        String years = "0";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select book_no from book_archives "
                    + "where years = '" + year + "' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {

                years = rs.getString(1);

            }
            return years;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_book_archives(String years, String book_no, String sac) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into book_archives(years,book_no,sac)values(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.setString(1, years);
            stmt.setString(2, book_no);
            stmt.setString(3, sac);
            stmt.execute();
            Lg.s(S1_book_archives1.class, "Successfully Added");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_book_archives(String years, String book_no, String sac, String id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update book_archives set years='" + years + "',book_no='" + book_no + "',sac='" + sac + "' where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);

            stmt.execute();
            Lg.s(S1_book_archives1.class, "Successfully Updated");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_book_archives(String id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from book_archives where id='" + id + "'";
            PreparedStatement stmt = conn.prepareStatement(s0);

            stmt.execute();
            Lg.s(S1_book_archives1.class, "Successfully Deleted");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static boolean if_exists_arc(String sac, String years, String book_no) {
        boolean exists = false;

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select id from book_archives where years='" + years + "' and book_no='" + book_no + "' and sac='" + sac + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                exists = true;
            }
            return exists;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(if_exists_arc("Baptism", "2012-2013", "1"));
    }

    public static List<String> ret_cb_data() {
        List<String> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select book_no from book_archives";
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

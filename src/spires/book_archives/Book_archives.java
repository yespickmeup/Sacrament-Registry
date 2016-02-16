/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.book_archives;


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
 * @author i1
 */
public class Book_archives {

    public static class to_book_archives {

        public final int id;
        public final String years;
        public final String book_no;
        public final String sac;

        public to_book_archives(int id, String years, String book_no, String sac) {
            this.id = id;
            this.years = years;
            this.book_no = book_no;
            this.sac = sac;
        }
    }

    public static void add_book_archives(to_book_archives to_book_archives) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into book_archives("
                    + "years"
                    + ",book_no"
                    + ",sac"
                    + ")values("
                    + ":years"
                    + ",:book_no"
                    + ",:sac"
                    + ")";

            s0 = SqlStringUtil.parse(s0).
                    setString("years", to_book_archives.years).
                    setString("book_no", to_book_archives.book_no).
                    setString("sac", to_book_archives.sac).
                    ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Book_archives.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_book_archives(to_book_archives to_book_archives) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update book_archives set "
                    + "years= '" + to_book_archives.years + "'"
                    + ",book_no= '" + to_book_archives.book_no + "'"
                    + ",sac= '" + to_book_archives.sac + "'"
                    + "where "
                    + " id ='" + to_book_archives.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Book_archives.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_book_archives(to_book_archives to_book_archives) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from book_archives where "
                    + " id ='" + to_book_archives.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Book_archives.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_book_archives> ret_data(String where) {
        List<to_book_archives> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",years"
                    + ",book_no"
                    + ",sac"
                    + " from book_archives "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String years = rs.getString(2);
                String book_no = rs.getString(3);
                String sac = rs.getString(4);

                to_book_archives to = new to_book_archives(id, years, book_no, sac);
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

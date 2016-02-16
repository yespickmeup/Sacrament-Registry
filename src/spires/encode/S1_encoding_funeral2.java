/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode;

import spires.printing.Encoded_Funeral;

import spires.util.DateType;
import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import spires.users.Res;
import spires.users.Users.to_users;

/**
 *
 * @author Ronald
 */
public class S1_encoding_funeral2 {

    public static class to_encoding_funeral2 {

        public final int id;
        public final String index_no;
        public final String book_no;
        public final String page_no;
        public final String date_of_burial;
        public final String priest;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String residence;
        public final String informant;
        public final String date_added;
        public final String user_name;
        public final String remarks;
        public final String date_of_burial2;

        public to_encoding_funeral2(int id, String index_no, String book_no, String page_no, String date_of_burial, String priest, String fname, String mi, String lname, String residence, String informant, String date_added, String user_name, String remarks, String date_of_burial2) {
            this.id = id;
            this.index_no = index_no;
            this.book_no = book_no;
            this.page_no = page_no;
            this.date_of_burial = date_of_burial;
            this.priest = priest;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.residence = residence;
            this.informant = informant;
            this.date_added = date_added;
            this.user_name = user_name;
            this.remarks = remarks;
            this.date_of_burial2 = date_of_burial2;
        }
    }

    public static void add_encoding_funeral2(List<Encoded_Funeral.to_encoded> to_encoding_funeral21) {
        try {

            String date_added = DateType.datetime.format(new Date());
            String user_name = "";

            Connection conn = MyConnection.connect();
            for (Encoded_Funeral.to_encoded to_encoding_funeral2 : to_encoding_funeral21) {
                String s0 = "insert into encoding_funeral2("
                        + "index_no"
                        + ",book_no"
                        + ",page_no"
                        + ",date_of_burial"
                        + ",priest"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",residence"
                        + ",informant"
                        + ",date_added"
                        + ",user_name"
                        + ",date_of_burial2"
                        + ")values("
                        + ":index_no"
                        + ",:book_no"
                        + ",:page_no"
                        + ",:date_of_burial"
                        + ",:priest"
                        + ",:fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:residence"
                        + ",:informant"
                        + ",:date_added"
                        + ",:user_name"
                        + ",:date_of_burial2"
                        + ")";
                String burial_date = DateType.slash.format(Encoded_Funeral.getRoundedDate(FitIn.toDouble(to_encoding_funeral2.date_of_burial)));
                String burial_date2 = DateType.slash.format(Encoded_Funeral.getRoundedDate(FitIn.toDouble(to_encoding_funeral2.date_of_burial2)));
                try {
                    Date d = DateType.slash.parse(burial_date);
                    burial_date = DateType.sf.format(d);

                    Date d2 = DateType.slash.parse(burial_date2);
                    burial_date2 = DateType.sf.format(d2);
                } catch (ParseException ex) {
                    Logger.getLogger(S1_encoding_funeral2.class.getName()).log(Level.SEVERE, null, ex);
                }
                String book = to_encoding_funeral2.book_no;

                book = book.replace(".0", "");
                s0 = SqlStringUtil.parse(s0)
                        .setString("index_no", FitIn.fmt_woc(to_encoding_funeral2.index_no))
                        .setString("book_no", book)
                        .setString("page_no", FitIn.fmt_woc(to_encoding_funeral2.page_no))
                        .setString("date_of_burial", burial_date)
                        .setString("priest", to_encoding_funeral2.price)
                        .setString("fname", to_encoding_funeral2.fname)
                        .setString("mi", to_encoding_funeral2.mi)
                        .setString("lname", to_encoding_funeral2.lname)
                        .setString("residence", to_encoding_funeral2.residence)
                        .setString("informant", to_encoding_funeral2.informant)
                        .setString("date_added", date_added)
                        .setString("user_name", user_name)
                        .setString("date_of_burial2", burial_date2)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(S1_encoding_funeral2.class, "Successfully Added: " + book + " = " + to_encoding_funeral2.index_no);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_encoding_funeral2(Encoded_Funeral.to_encoded to_encoding_funeral2, int id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_funeral2 set "
                    + "index_no= :index_no"
                    + ",book_no= :book_no"
                    + ",page_no= :page_no"
                    + ",date_of_burial= :date_of_burial"
                    + ",priest= :priest"
                    + ",fname= :fname"
                    + ",mi= :mi"
                    + ",lname= :lname"
                    + ",residence= :residence"
                    + ",informant= :informant"
                    + ",date_added= :date_added"
                    + ",user_name= :user_name"
                    + ",remarks= :remarks"
                    + ",date_of_burial2= :date_of_burial2"
                    + " where "
                    + " id ='" + id + "' "
                    + " ";

            String date_added = DateType.datetime.format(new Date());
            s0 = SqlStringUtil.parse(s0)
                    .setString("index_no", to_encoding_funeral2.index_no)
                    .setString("book_no", to_encoding_funeral2.book_no)
                    .setString("page_no", to_encoding_funeral2.page_no)
                    .setString("date_of_burial", to_encoding_funeral2.date_of_burial)
                    .setString("priest", to_encoding_funeral2.price)
                    .setString("fname", to_encoding_funeral2.fname)
                    .setString("mi", to_encoding_funeral2.mi)
                    .setString("lname", to_encoding_funeral2.lname)
                    .setString("residence", to_encoding_funeral2.residence)
                    .setString("informant", to_encoding_funeral2.informant)
                    .setString("date_added", date_added)
                    .setString("user_name", Res.getUser_name())
                    .setString("remarks", to_encoding_funeral2.remarks)
                    .setString("date_of_burial2", to_encoding_funeral2.date_of_burial2)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_funeral2.class, "Successfully Updated: ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_encoding_funeral2(to_encoding_funeral2 to_encoding_funeral2) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_funeral2 where "
                    + " id ='" + to_encoding_funeral2.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_funeral2.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_encoding_funeral2> ret_data(String where) {
        List<to_encoding_funeral2> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",index_no"
                    + ",book_no"
                    + ",page_no"
                    + ",date_of_burial"
                    + ",priest"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",residence"
                    + ",informant"
                    + ",date_added"
                    + ",user_name"
                    + ",remarks"
                    + ",date_of_burial2"
                    + " from encoding_funeral2  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String index_no = rs.getString(2);
                String book_no = rs.getString(3);
                String page_no = rs.getString(4);
                String date_of_burial = rs.getString(5);
                String priest = rs.getString(6);
                String fname = rs.getString(7);
                String mi = rs.getString(8);
                String lname = rs.getString(9);
                String residence = rs.getString(10);
                String informant = rs.getString(11);
                String date_added = rs.getString(12);
                String user_name = rs.getString(13);
                String remarks = rs.getString(14);
                String date_of_burial2 = rs.getString(15);
                to_encoding_funeral2 to = new to_encoding_funeral2(id, index_no, book_no, page_no, date_of_burial, priest, fname, mi, lname, residence, informant, date_added, user_name, remarks, date_of_burial2);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_encoding_funeral2(Encoded_Funeral.to_encoded to_encoding_funeral2) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into encoding_funeral2("
                    + "index_no"
                    + ",book_no"
                    + ",page_no"
                    + ",date_of_burial"
                    + ",priest"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",residence"
                    + ",informant"
                    + ",date_added"
                    + ",user_name"
                    + ",remarks"
                    + ",date_of_burial2"
                    + ")values("
                    + ":index_no"
                    + ",:book_no"
                    + ",:page_no"
                    + ",:date_of_burial"
                    + ",:priest"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:residence"
                    + ",:informant"
                    + ",:date_added"
                    + ",:user_name"
                    + ",:remarks"
                    + ",:date_of_burial2"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("index_no", to_encoding_funeral2.index_no)
                    .setString("book_no", to_encoding_funeral2.book_no)
                    .setString("page_no", to_encoding_funeral2.page_no)
                    .setString("date_of_burial", to_encoding_funeral2.date_of_burial)
                    .setString("priest", to_encoding_funeral2.price)
                    .setString("fname", to_encoding_funeral2.fname)
                    .setString("mi", to_encoding_funeral2.mi)
                    .setString("lname", to_encoding_funeral2.lname)
                    .setString("residence", to_encoding_funeral2.residence)
                    .setString("informant", to_encoding_funeral2.informant)
                    .setString("date_added", DateType.datetime.format(new Date()))
                    .setString("user_name", Res.getUser_name())
                    .setString("remarks", to_encoding_funeral2.remarks)
                    .setString("date_of_burial2", to_encoding_funeral2.date_of_burial2)
                    .ok();
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_funeral2.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_encoding_funeral2(String id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_funeral2 where "
                    + " id ='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_funeral2.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

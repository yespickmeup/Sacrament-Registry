/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.printing;

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
 * @author Guinness
 */
public class S1_encoding_marriage {

    public static class to_encoding_marriage {

        public final int id;
        public final String index_no;
        public final String book_no;
        public final String page_no;
        public final String date_of_marriage;
        public final String priest;
        public final String groom;
        public final String groom_status;
        public final String groom_father;
        public final String groom_mother;
        public final String groom_address;
        public final String bride;
        public final String bride_status;
        public final String bride_father;
        public final String bride_mother;
        public final String bride_address;
        public final String sponsors;
        public final String remarks;
        public to_encoding_marriage(int id, String index_no, String book_no, String page_no, String date_of_marriage
                , String priest, String groom, String groom_status, String groom_father, String groom_mother
                , String groom_address, String bride, String bride_status, String bride_father, String bride_mother
                , String bride_address, String sponsors,String remarks) {
            this.id = id;
            this.index_no = index_no;
            this.book_no = book_no;
            this.page_no = page_no;
            this.date_of_marriage = date_of_marriage;
            this.priest = priest;
            this.groom = groom;
            this.groom_status = groom_status;
            this.groom_father = groom_father;
            this.groom_mother = groom_mother;
            this.groom_address = groom_address;
            this.bride = bride;
            this.bride_status = bride_status;
            this.bride_father = bride_father;
            this.bride_mother = bride_mother;
            this.bride_address = bride_address;
            this.sponsors = sponsors;
            this.remarks=remarks;
        }
    }

    public static void add_encoding_marriage(List<to_encoding_marriage> to_encoding_marriage1) {
        try {
            Connection conn = MyConnection.connect();
            for (to_encoding_marriage to_encoding_marriage : to_encoding_marriage1) {
                String s0 = "insert into encoding_marriage("
                        + "index_no"
                        + ",book_no"
                        + ",page_no"
                        + ",date_of_marriage"
                        + ",priest"
                        + ",groom"
                        + ",groom_status"
                        + ",groom_father"
                        + ",groom_mother"
                        + ",groom_address"
                        + ",bride"
                        + ",bride_status"
                        + ",bride_father"
                        + ",bride_mother"
                        + ",bride_address"
                        + ",sponsors"
                        + ",remarks"
                        + ")values("
                        + ":index_no"
                        + ",:book_no"
                        + ",:page_no"
                        + ",:date_of_marriage"
                        + ",:priest"
                        + ",:groom"
                        + ",:groom_status"
                        + ",:groom_father"
                        + ",:groom_mother"
                        + ",:groom_address"
                        + ",:bride"
                        + ",:bride_status"
                        + ",:bride_father"
                        + ",:bride_mother"
                        + ",:bride_address"
                        + ",:sponsors"
                        + ",:remarks"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("index_no", to_encoding_marriage.index_no)
                        .setString("book_no", to_encoding_marriage.book_no)
                        .setString("page_no", to_encoding_marriage.page_no)
                        .setString("date_of_marriage", to_encoding_marriage.date_of_marriage)
                        .setString("priest", to_encoding_marriage.priest)
                        .setString("groom", to_encoding_marriage.groom)
                        .setString("groom_status", to_encoding_marriage.groom_status)
                        .setString("groom_father", to_encoding_marriage.groom_father)
                        .setString("groom_mother", to_encoding_marriage.groom_mother)
                        .setString("groom_address", to_encoding_marriage.groom_address)
                        .setString("bride", to_encoding_marriage.bride)
                        .setString("bride_status", to_encoding_marriage.bride_status)
                        .setString("bride_father", to_encoding_marriage.bride_father)
                        .setString("bride_mother", to_encoding_marriage.bride_mother)
                        .setString("bride_address", to_encoding_marriage.bride_address)
                        .setString("sponsors", to_encoding_marriage.sponsors)
                        .setString("remarks",to_encoding_marriage.remarks)
                        .ok();
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(S1_encoding_marriage.class, "Successfully Added " + to_encoding_marriage.book_no + " = " + to_encoding_marriage.index_no);
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_encoding_marriage(to_encoding_marriage to_encoding_marriage) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_marriage set "
                    + "index_no= :index_no"
                    + ",book_no= :book_no"
                    + ",page_no= :page_no"
                    + ",date_of_marriage= :date_of_marriage"
                    + ",priest= :priest"
                    + ",groom= :groom"
                    + ",groom_status= :groom_status"
                    + ",groom_father= :groom_father"
                    + ",groom_mother= :groom_mother"
                    + ",groom_address= :groom_address"
                    + ",bride= :bride"
                    + ",bride_status= :bride_status"
                    + ",bride_father= :bride_father"
                    + ",bride_mother= :bride_mother"
                    + ",bride_address= :bride_address"
                    + ",sponsors= :sponsors"
                    + ",remarks= :remarks"
                    + " where "
                    + " id ='" + to_encoding_marriage.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("index_no", to_encoding_marriage.index_no)
                    .setString("book_no", to_encoding_marriage.book_no)
                    .setString("page_no", to_encoding_marriage.page_no)
                    .setString("date_of_marriage", to_encoding_marriage.date_of_marriage)
                    .setString("priest", to_encoding_marriage.priest)
                    .setString("groom", to_encoding_marriage.groom)
                    .setString("groom_status", to_encoding_marriage.groom_status)
                    .setString("groom_father", to_encoding_marriage.groom_father)
                    .setString("groom_mother", to_encoding_marriage.groom_mother)
                    .setString("groom_address", to_encoding_marriage.groom_address)
                    .setString("bride", to_encoding_marriage.bride)
                    .setString("bride_status", to_encoding_marriage.bride_status)
                    .setString("bride_father", to_encoding_marriage.bride_father)
                    .setString("bride_mother", to_encoding_marriage.bride_mother)
                    .setString("bride_address", to_encoding_marriage.bride_address)
                    .setString("sponsors", to_encoding_marriage.sponsors)
                    .setString("remarks",to_encoding_marriage.remarks)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_marriage.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_encoding_marriage(String id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_marriage where "
                    + " id ='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_marriage.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_encoding_marriage> ret_data(String where) {
        List<to_encoding_marriage> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",index_no"
                    + ",book_no"
                    + ",page_no"
                    + ",date_of_marriage"
                    + ",priest"
                    + ",groom"
                    + ",groom_status"
                    + ",groom_father"
                    + ",groom_mother"
                    + ",groom_address"
                    + ",bride"
                    + ",bride_status"
                    + ",bride_father"
                    + ",bride_mother"
                    + ",bride_address"
                    + ",sponsors"
                    + ",remarks"
                    + " from encoding_marriage  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String index_no = rs.getString(2);
                String book_no = rs.getString(3);
                String page_no = rs.getString(4);
                String date_of_marriage = rs.getString(5);
                String priest = rs.getString(6);
                String groom = rs.getString(7);
                String groom_status = rs.getString(8);
                String groom_father = rs.getString(9);
                String groom_mother = rs.getString(10);
                String groom_address = rs.getString(11);
                String bride = rs.getString(12);
                String bride_status = rs.getString(13);
                String bride_father = rs.getString(14);
                String bride_mother = rs.getString(15);
                String bride_address = rs.getString(16);
                String sponsors = rs.getString(17);
                String remarks=rs.getString(18);
                to_encoding_marriage to = new to_encoding_marriage(id, index_no, book_no, page_no, date_of_marriage, priest, groom, groom_status
                        , groom_father, groom_mother, groom_address, bride, bride_status, bride_father, bride_mother, bride_address, sponsors,remarks);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void main(String[] args) {
        records("");
    }

    public static List<to_encoding_marriage> records3(String where) {
        List<to_encoding_marriage> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "book_no"
                    + ""
                    + " from encoding_funeral2 group by book_no order by book_no,YEAR(date_of_burial) asc "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String book_no = rs.getString(1);
//                String date = rs.getString(2);
//                group_concat(YEAR(date_of_marriage) separator ', ')
//                String s1 = "select YEAR(date_of_burial) from encoding_funeral2 where book_no='" + book_no + "' "
//                        + "group by YEAR(date_of_burial) ";
                String s1 = "select count(id) from encoding_funeral2 where book_no='" + book_no + "' "
                        + "";

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s1);
                String date = "";
                while (rs2.next()) {
//                    date = date + "," + rs2.getString(1);
                      date = rs2.getString(1);
                }
//                System.out.print(book_no );
//                date = date.substring(1, date.length());
                System.out.print(date);
                System.out.println("");
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
     public static List<to_encoding_marriage> records(String where) {
        List<to_encoding_marriage> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "book_no"
                    + ""
                    + " from encoding_marriage group by book_no order by book_no,YEAR(date_of_marriage) asc "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String book_no = rs.getString(1);
//                String date = rs.getString(2);
//                group_concat(YEAR(date_of_marriage) separator ', ')
//                String s1 = "select YEAR(date_of_marriage) from encoding_marriage where book_no='" + book_no + "' "
//                        + "group by YEAR(date_of_marriage) ";
                String s1 = "select count(id) from encoding_marriage where book_no='" + book_no + "' "
                        + "";

                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s1);
                String date = "";
                while (rs2.next()) {
                    date = date + "," + rs2.getString(1);
//                      date = rs2.getString(1);
                }
                System.out.print(book_no );
//                date = date.substring(1, date.length());
                System.out.print(date);
                System.out.println("");
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

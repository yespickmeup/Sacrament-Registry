/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode;


import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Maytopacka
 */
public class S1_encoding_funeral {

    public static class to_encoding_funeral {

        public final int id;
        public final String ref_no;
        public final String date_added;
        public final String user_name;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String b_place;
        public final String address;
        public final String father;
        public final String mother;
        public final String b_day;
        public final String gender;
        public final String book_no;
        public final int page_no;
        public final int index_no;
        public final int status;
        public final String informant;
        public final String informant_address;
        public final String cause_of_death;
        public final String date_of_death;
        public final String buried_at;
        public final String date_of_burial;
        public final String officiating_priest;
        public final String parish_priest;
        public final String bapt_date;
        public final String remarks;
        public final String bapt_place;
        public to_encoding_funeral(int id, String ref_no, String date_added, String user_name
                , String fname, String mi, String lname, String b_place, String address
                , String father, String mother, String b_day, String gender, String book_no
                , int page_no, int index_no, int status, String informant, String informant_address
                , String cause_of_death, String date_of_death, String buried_at, String date_of_burial
                , String officiating_priest, String parish_priest,String bapt_date,String remarks,String bapt_place) {
            this.id = id;
            this.ref_no = ref_no;
            this.date_added = date_added;
            this.user_name = user_name;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.b_place = b_place;
            this.address = address;
            this.father = father;
            this.mother = mother;
            this.b_day = b_day;
            this.gender = gender;
            this.book_no = book_no;
            this.page_no = page_no;
            this.index_no = index_no;
            this.status = status;
            this.informant = informant;
            this.informant_address = informant_address;
            this.cause_of_death = cause_of_death;
            this.date_of_death = date_of_death;
            this.buried_at = buried_at;
            this.date_of_burial = date_of_burial;
            this.officiating_priest = officiating_priest;
            this.parish_priest = parish_priest;
            this.bapt_date= bapt_date;
            this.remarks=remarks;
            this.bapt_place=bapt_place;
        }
    }

    public static void add_encoding_funeral(to_encoding_funeral to_encoding_funeral) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into encoding_funeral("
                    + "ref_no"
                    + ",date_added"
                    + ",user_name"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",b_place"
                    + ",address"
                    + ",father"
                    + ",mother"
                    + ",b_day"
                    + ",gender"
                    + ",book_no"
                    + ",page_no"
                    + ",index_no"
                    + ",status"
                    + ",informant"
                    + ",informant_address"
                    + ",cause_of_death"
                    + ",date_of_death"
                    + ",buried_at"
                    + ",date_of_burial"
                    + ",officiating_priest"
                    + ",parish_priest"
                    + ",bapt_date"
                    + ",remarks"
                    + ",bapt_place"
                    + ")values("
                    + ":ref_no"
                    + ",:date_added"
                    + ",:user_name"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:b_place"
                    + ",:address"
                    + ",:father"
                    + ",:mother"
                    + ",:b_day"
                    + ",:gender"
                    + ",:book_no"
                    + ",:page_no"
                    + ",:index_no"
                    + ",:status"
                    + ",:informant"
                    + ",:informant_address"
                    + ",:cause_of_death"
                    + ",:date_of_death"
                    + ",:buried_at"
                    + ",:date_of_burial"
                    + ",:officiating_priest"
                    + ",:parish_priest"
                    + ",:bapt_date"
                    + ",:remarks"
                    + ",:bapt_place"
                    + ")";

            s0 = SqlStringUtil.parse(s0).
                    setString("ref_no", to_encoding_funeral.ref_no).
                    setString("date_added", to_encoding_funeral.date_added).
                    setString("user_name", to_encoding_funeral.user_name).
                    setString("fname", to_encoding_funeral.fname).
                    setString("mi", to_encoding_funeral.mi).
                    setString("lname", to_encoding_funeral.lname).
                    setString("b_place", to_encoding_funeral.b_place).
                    setString("address", to_encoding_funeral.address).
                    setString("father", to_encoding_funeral.father).
                    setString("mother", to_encoding_funeral.mother).
                    setString("b_day", to_encoding_funeral.b_day).
                    setString("gender", to_encoding_funeral.gender).
                    setString("book_no", to_encoding_funeral.book_no).
                    setNumber("page_no", to_encoding_funeral.page_no).
                    setNumber("index_no", to_encoding_funeral.index_no).
                    setNumber("status", to_encoding_funeral.status).
                    setString("informant", to_encoding_funeral.informant).
                    setString("informant_address", to_encoding_funeral.informant_address).
                    setString("cause_of_death", to_encoding_funeral.cause_of_death).
                    setString("date_of_death", to_encoding_funeral.date_of_death).
                    setString("buried_at", to_encoding_funeral.buried_at).
                    setString("date_of_burial", to_encoding_funeral.date_of_burial).
                    setString("officiating_priest", to_encoding_funeral.officiating_priest).
                    setString("parish_priest", to_encoding_funeral.parish_priest).
                    setString("bapt_date", to_encoding_funeral.bapt_date).
                     setString("remarks", to_encoding_funeral.remarks).
                     setString("bapt_place", to_encoding_funeral.bapt_place).
                    
                    ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_funeral.class, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_encoding_funeral(to_encoding_funeral to_encoding_funeral) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_funeral set "
                    + "ref_no= :ref_no"
                    + ",date_added= :date_added"
                    + ",user_name= :user_name"
                    + ",fname= :fname"
                    + ",mi= :mi"
                    + ",lname= :lname"
                    + ",b_place= :b_place"
                    + ",address= :address"
                    + ",father= :father"
                    + ",mother= :mother"
                    + ",b_day= :b_day"
                    + ",gender= :gender"
                    + ",book_no= :book_no"
                    + ",page_no= :page_no"
                    + ",index_no= :index_no"
                    + ",status= :status"
                    + ",informant= :informant"
                    + ",informant_address= :informant_address"
                    + ",cause_of_death= :cause_of_death"
                    + ",date_of_death= :date_of_death"
                    + ",buried_at= :buried_at"
                    + ",date_of_burial= :date_of_burial"
                    + ",officiating_priest= :officiating_priest"
                    + ",parish_priest= :parish_priest"
                    + ",bapt_date= :bapt_date"
                    + ",remarks= :remarks"
                    + ",bapt_place= :bapt_place"
                    + " where "
                    + " id ='" + to_encoding_funeral.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0).
                    setString("ref_no", to_encoding_funeral.ref_no).
                    setString("date_added", to_encoding_funeral.date_added).
                    setString("user_name", to_encoding_funeral.user_name).
                    setString("fname", to_encoding_funeral.fname).
                    setString("mi", to_encoding_funeral.mi).
                    setString("lname", to_encoding_funeral.lname).
                    setString("b_place", to_encoding_funeral.b_place).
                    setString("address", to_encoding_funeral.address).
                    setString("father", to_encoding_funeral.father).
                    setString("mother", to_encoding_funeral.mother).
                    setString("b_day", to_encoding_funeral.b_day).
                    setString("gender", to_encoding_funeral.gender).
                    setString("book_no", to_encoding_funeral.book_no).
                    setNumber("page_no", to_encoding_funeral.page_no).
                    setNumber("index_no", to_encoding_funeral.index_no).
                    setNumber("status", to_encoding_funeral.status).
                    setString("informant", to_encoding_funeral.informant).
                    setString("informant_address", to_encoding_funeral.informant_address).
                    setString("cause_of_death", to_encoding_funeral.cause_of_death).
                    setString("date_of_death", to_encoding_funeral.date_of_death).
                    setString("buried_at", to_encoding_funeral.buried_at).
                    setString("date_of_burial", to_encoding_funeral.date_of_burial).
                    setString("officiating_priest", to_encoding_funeral.officiating_priest).
                    setString("parish_priest", to_encoding_funeral.parish_priest).
                     setString("bapt_date", to_encoding_funeral.bapt_date).
                    setString("remarks", to_encoding_funeral.remarks).
                     setString("bapt_place", to_encoding_funeral.bapt_place).
                    
                    
                    ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_funeral.class, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_encoding_funeral(to_encoding_funeral to_encoding_funeral) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_funeral where "
                    + " id ='" + to_encoding_funeral.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_funeral.class, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_encoding_funeral> ret_data(String user,String book_n) {
        List<to_encoding_funeral> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",ref_no"
                    + ",date_added"
                    + ",user_name"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",b_place"
                    + ",address"
                    + ",father"
                    + ",mother"
                    + ",b_day"
                    + ",gender"
                    + ",book_no"
                    + ",page_no"
                    + ",index_no"
                    + ",status"
                    + ",informant"
                    + ",informant_address"
                    + ",cause_of_death"
                    + ",date_of_death"
                    + ",buried_at"
                    + ",date_of_burial"
                    + ",officiating_priest"
                    + ",parish_priest"
                    + ",bapt_date"
                    + ",remarks"
                    + ",bapt_place"
                    + " from encoding_funeral "
                    + "where "
                    + " user_name = '" + user + "' "
                    + " and book_no ='" + book_n + "' "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String ref_no = rs.getString(2);
                String date_added = rs.getString(3);
                String user_name = rs.getString(4);
                String fname = rs.getString(5);
                String mi = rs.getString(6);
                String lname = rs.getString(7);
                String b_place = rs.getString(8);
                String address = rs.getString(9);
                String father = rs.getString(10);
                String mother = rs.getString(11);
                String b_day = rs.getString(12);
                String gender = rs.getString(13);
                String book_no = rs.getString(14);
                int page_no = rs.getInt(15);
                int index_no = rs.getInt(16);
                int status = rs.getInt(17);
                String informant = rs.getString(18);
                String informant_address = rs.getString(19);
                String cause_of_death = rs.getString(20);
                String date_of_death = rs.getString(21);
                String buried_at = rs.getString(22);
                String date_of_burial = rs.getString(23);
                String officiating_priest = rs.getString(24);
                String parish_priest = rs.getString(25);
                String bapt_date=rs.getString(26);
                  String remarks=rs.getString(27);
                String  bapt_place=rs.getString(28);
                to_encoding_funeral to = new to_encoding_funeral(id, ref_no, date_added, user_name, fname, mi
                        , lname, b_place, address, father, mother, b_day, gender, book_no, page_no, index_no
                        , status, informant, informant_address, cause_of_death, date_of_death, buried_at
                        , date_of_burial, officiating_priest, parish_priest,bapt_date,remarks,bapt_place);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

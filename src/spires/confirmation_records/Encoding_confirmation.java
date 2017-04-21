/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.confirmation_records;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import spires.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Encoding_confirmation {

    public static class to_encoding_confirmation {

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
        public final String conf_date;
        public final String gender;
        public final String book_no;
        public final int page_no;
        public final int index_no;
        public final String priest;
        public final String sponsors;
        public final String remarks;
        public final String bapt_date;
        public final String bapt_place;
        public final int status;
        public final String place_of_confirmation;
        public final String registry_no;
        public final String address_of_parents;

        public to_encoding_confirmation(int id, String ref_no, String date_added, String user_name, String fname, String mi, String lname, String b_place, String address, String father, String mother, String b_day, String conf_date, String gender, String book_no, int page_no, int index_no, String priest, String sponsors, String remarks, String bapt_date, String bapt_place, int status, String place_of_confirmation, String registry_no, String address_of_parents) {
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
            this.conf_date = conf_date;
            this.gender = gender;
            this.book_no = book_no;
            this.page_no = page_no;
            this.index_no = index_no;
            this.priest = priest;
            this.sponsors = sponsors;
            this.remarks = remarks;
            this.bapt_date = bapt_date;
            this.bapt_place = bapt_place;
            this.status = status;
            this.place_of_confirmation = place_of_confirmation;
            this.registry_no = registry_no;
            this.address_of_parents = address_of_parents;
        }
    }

    public static void add_data(to_encoding_confirmation to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into encoding_confirmation("
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
                    + ",conf_date"
                    + ",gender"
                    + ",book_no"
                    + ",page_no"
                    + ",index_no"
                    + ",priest"
                    + ",sponsors"
                    + ",remarks"
                    + ",bapt_date"
                    + ",bapt_place"
                    + ",status"
                    + ",place_of_confirmation"
                    + ",registry_no"
                    + ",address_of_parents"
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
                    + ",:conf_date"
                    + ",:gender"
                    + ",:book_no"
                    + ",:page_no"
                    + ",:index_no"
                    + ",:priest"
                    + ",:sponsors"
                    + ",:remarks"
                    + ",:bapt_date"
                    + ",:bapt_place"
                    + ",:status"
                    + ",:place_of_confirmation"
                    + ",:registry_no"
                    + ",:address_of_parents"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("ref_no", to_encoding_confirmation.ref_no)
                    .setString("date_added", to_encoding_confirmation.date_added)
                    .setString("user_name", to_encoding_confirmation.user_name)
                    .setString("fname", to_encoding_confirmation.fname)
                    .setString("mi", to_encoding_confirmation.mi)
                    .setString("lname", to_encoding_confirmation.lname)
                    .setString("b_place", to_encoding_confirmation.b_place)
                    .setString("address", to_encoding_confirmation.address)
                    .setString("father", to_encoding_confirmation.father)
                    .setString("mother", to_encoding_confirmation.mother)
                    .setString("b_day", to_encoding_confirmation.b_day)
                    .setString("conf_date", to_encoding_confirmation.conf_date)
                    .setString("gender", to_encoding_confirmation.gender)
                    .setString("book_no", to_encoding_confirmation.book_no)
                    .setNumber("page_no", to_encoding_confirmation.page_no)
                    .setNumber("index_no", to_encoding_confirmation.index_no)
                    .setString("priest", to_encoding_confirmation.priest)
                    .setString("sponsors", to_encoding_confirmation.sponsors)
                    .setString("remarks", to_encoding_confirmation.remarks)
                    .setString("bapt_date", to_encoding_confirmation.bapt_date)
                    .setString("bapt_place", to_encoding_confirmation.bapt_place)
                    .setNumber("status", to_encoding_confirmation.status)
                    .setString("place_of_confirmation", to_encoding_confirmation.place_of_confirmation)
                    .setString("registry_no", to_encoding_confirmation.registry_no)
                    .setString("address_of_parents", to_encoding_confirmation.address_of_parents)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Encoding_confirmation.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_encoding_confirmation to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_confirmation set "
                    + "ref_no= :ref_no "
                    + ",date_added= :date_added "
                    + ",user_name= :user_name "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",b_place= :b_place "
                    + ",address= :address "
                    + ",father= :father "
                    + ",mother= :mother "
                    + ",b_day= :b_day "
                    + ",conf_date= :conf_date "
                    + ",gender= :gender "
                    + ",book_no= :book_no "
                    + ",page_no= :page_no "
                    + ",index_no= :index_no "
                    + ",priest= :priest "
                    + ",sponsors= :sponsors "
                    + ",remarks= :remarks "
                    + ",bapt_date= :bapt_date "
                    + ",bapt_place= :bapt_place "
                    + ",status= :status "
                    + ",place_of_confirmation= :place_of_confirmation "
                    + ",registry_no= :registry_no "
                    + ",address_of_parents= :address_of_parents "
                    + " where id='" + to_encoding_confirmation.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("ref_no", to_encoding_confirmation.ref_no)
                    .setString("date_added", to_encoding_confirmation.date_added)
                    .setString("user_name", to_encoding_confirmation.user_name)
                    .setString("fname", to_encoding_confirmation.fname)
                    .setString("mi", to_encoding_confirmation.mi)
                    .setString("lname", to_encoding_confirmation.lname)
                    .setString("b_place", to_encoding_confirmation.b_place)
                    .setString("address", to_encoding_confirmation.address)
                    .setString("father", to_encoding_confirmation.father)
                    .setString("mother", to_encoding_confirmation.mother)
                    .setString("b_day", to_encoding_confirmation.b_day)
                    .setString("conf_date", to_encoding_confirmation.conf_date)
                    .setString("gender", to_encoding_confirmation.gender)
                    .setString("book_no", to_encoding_confirmation.book_no)
                    .setNumber("page_no", to_encoding_confirmation.page_no)
                    .setNumber("index_no", to_encoding_confirmation.index_no)
                    .setString("priest", to_encoding_confirmation.priest)
                    .setString("sponsors", to_encoding_confirmation.sponsors)
                    .setString("remarks", to_encoding_confirmation.remarks)
                    .setString("bapt_date", to_encoding_confirmation.bapt_date)
                    .setString("bapt_place", to_encoding_confirmation.bapt_place)
                    .setNumber("status", to_encoding_confirmation.status)
                    .setString("place_of_confirmation", to_encoding_confirmation.place_of_confirmation)
                    .setString("registry_no", to_encoding_confirmation.registry_no)
                    .setString("address_of_parents", to_encoding_confirmation.address_of_parents)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Encoding_confirmation.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_encoding_confirmation to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_confirmation  "
                    + " where id='" + to_encoding_confirmation.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Encoding_confirmation.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_encoding_confirmation> ret_data(String where) {
        List<to_encoding_confirmation> datas = new ArrayList();

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
                    + ",conf_date"
                    + ",gender"
                    + ",book_no"
                    + ",page_no"
                    + ",index_no"
                    + ",priest"
                    + ",sponsors"
                    + ",remarks"
                    + ",bapt_date"
                    + ",bapt_place"
                    + ",status"
                    + ",place_of_confirmation"
                    + ",registry_no"
                    + ",address_of_parents"
                    + " from encoding_confirmation"
                    + " " + where;

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
                String conf_date = rs.getString(13);
                String gender = rs.getString(14);
                String book_no = rs.getString(15);
                int page_no = rs.getInt(16);
                int index_no = rs.getInt(17);
                String priest = rs.getString(18);
                String sponsors = rs.getString(19);
                String remarks = rs.getString(20);
                String bapt_date = rs.getString(21);
                String bapt_place = rs.getString(22);
                int status = rs.getInt(23);
                String place_of_confirmation = rs.getString(24);
                String registry_no = rs.getString(25);
                String address_of_parents = rs.getString(26);

                to_encoding_confirmation to = new to_encoding_confirmation(id, ref_no, date_added, user_name, fname, mi, lname, b_place, address, father, mother, b_day, conf_date, gender, book_no, page_no, index_no, priest, sponsors, remarks, bapt_date, bapt_place, status, place_of_confirmation, registry_no, address_of_parents);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_encoding_confirmation> ret_books(String where) {
        List<to_encoding_confirmation> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "count(id)"
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
                    + ",conf_date"
                    + ",gender"
                    + ",book_no"
                    + ",page_no"
                    + ",index_no"
                    + ",priest"
                    + ",sponsors"
                    + ",remarks"
                    + ",bapt_date"
                    + ",bapt_place"
                    + ",status"
                    + ",place_of_confirmation"
                    + ",registry_no"
                    + ",address_of_parents"
                    + " from encoding_confirmation"
                    + " " + where;

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
                String conf_date = rs.getString(13);
                String gender = rs.getString(14);
                String book_no = rs.getString(15);
                int page_no = rs.getInt(16);
                int index_no = rs.getInt(17);
                String priest = rs.getString(18);
                String sponsors = rs.getString(19);
                String remarks = rs.getString(20);
                String bapt_date = rs.getString(21);
                String bapt_place = rs.getString(22);
                int status = rs.getInt(23);
                String place_of_confirmation = rs.getString(24);
                String registry_no = rs.getString(25);
                String address_of_parents = rs.getString(26);

                to_encoding_confirmation to = new to_encoding_confirmation(id, ref_no, date_added, user_name, fname, mi, lname, b_place, address, father, mother, b_day, conf_date, gender, book_no, page_no, index_no, priest, sponsors, remarks, bapt_date, bapt_place, status, place_of_confirmation, registry_no, address_of_parents);
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

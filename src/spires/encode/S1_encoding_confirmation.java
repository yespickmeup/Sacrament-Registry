/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode;


import spires.parishioners.S1_parishioner;
import spires.printing.Srpt_print_baptism;
import spires.printing.Srpt_print_confirmation;

import spires.util.MyConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import spires.users.Res;

/**
 *
 * @author i1
 */
public class S1_encoding_confirmation {

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

        public to_encoding_confirmation(int id, String ref_no, String date_added, String user_name, String fname, String mi, String lname, String b_place, String address, String father, String mother, String b_day, String conf_date, String gender, String book_no, int page_no, int index_no, String priest, String sponsors, String remarks, String bapt_date, String bapt_place, int status) {
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
        }
    }

    public static void add_encoding_confirmation(to_encoding_confirmation to_encoding_confirmation) {
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
                    + ")";

            s0 = SqlStringUtil.parse(s0).
                    setString("ref_no", to_encoding_confirmation.ref_no).
                    setString("date_added", to_encoding_confirmation.date_added).
                    setString("user_name", to_encoding_confirmation.user_name).
                    setString("fname", to_encoding_confirmation.fname).
                    setString("mi", to_encoding_confirmation.mi).
                    setString("lname", to_encoding_confirmation.lname).
                    setString("b_place", to_encoding_confirmation.b_place).
                    setString("address", to_encoding_confirmation.address).
                    setString("father", to_encoding_confirmation.father).
                    setString("mother", to_encoding_confirmation.mother).
                    setString("b_day", to_encoding_confirmation.b_day).
                    setString("conf_date", to_encoding_confirmation.conf_date).
                    setString("gender", to_encoding_confirmation.gender).
                    setString("book_no", to_encoding_confirmation.book_no).
                    setNumber("page_no", to_encoding_confirmation.page_no).
                    setNumber("index_no", to_encoding_confirmation.index_no).
                    setString("priest", to_encoding_confirmation.priest).
                    setString("sponsors", to_encoding_confirmation.sponsors).
                    setString("remarks", to_encoding_confirmation.remarks).
                    setString("bapt_date", to_encoding_confirmation.bapt_date).
                    setString("bapt_place", to_encoding_confirmation.bapt_place).
                    setNumber("status", to_encoding_confirmation.status).
                    ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_confirmation.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_encoding_confirmation(to_encoding_confirmation to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_confirmation set "
                    + "ref_no= '" + to_encoding_confirmation.ref_no + "'"
                    + ",date_added= '" + to_encoding_confirmation.date_added + "'"
                    + ",user_name= '" + to_encoding_confirmation.user_name + "'"
                    + ",fname= '" + to_encoding_confirmation.fname + "'"
                    + ",mi= '" + to_encoding_confirmation.mi + "'"
                    + ",lname= '" + to_encoding_confirmation.lname + "'"
                    + ",b_place= '" + to_encoding_confirmation.b_place + "'"
                    + ",address= '" + to_encoding_confirmation.address + "'"
                    + ",father= '" + to_encoding_confirmation.father + "'"
                    + ",mother= '" + to_encoding_confirmation.mother + "'"
                    + ",b_day= '" + to_encoding_confirmation.b_day + "'"
                    + ",conf_date= '" + to_encoding_confirmation.conf_date + "'"
                    + ",gender= '" + to_encoding_confirmation.gender + "'"
                    + ",book_no= '" + to_encoding_confirmation.book_no + "'"
                    + ",page_no= '" + to_encoding_confirmation.page_no + "'"
                    + ",index_no= '" + to_encoding_confirmation.index_no + "'"
                    + ",priest= '" + to_encoding_confirmation.priest + "'"
                    + ",sponsors= '" + to_encoding_confirmation.sponsors + "'"
                    + ",remarks= '" + to_encoding_confirmation.remarks + "'"
                    + ",bapt_date= '" + to_encoding_confirmation.bapt_date + "'"
                    + ",bapt_place= '" + to_encoding_confirmation.bapt_place + "'"
                    + "where "
                    + " id ='" + to_encoding_confirmation.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_confirmation.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_encoding_confirmation(to_encoding_confirmation to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_confirmation where "
                    + " id ='" + to_encoding_confirmation.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_confirmation.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_encoding_confirmation> ret_data(String user_names, String book_nos) {
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
                    + " from encoding_confirmation where "
                    + " user_name ='" + user_names + "' "
                    + " and book_no ='" + book_nos + "' order by index_no desc "
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

                to_encoding_confirmation to = new to_encoding_confirmation(id, ref_no, date_added, user_name, fname, mi, lname, b_place, address, father, mother, b_day, conf_date, gender, book_no, page_no, index_no, priest, sponsors, remarks, bapt_date, bapt_place, status);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<String> ret_cb_data(String type) {
        List<String> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select book_no from book_archives where sac like '%" + type + "%' order by book_no asc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                datas.add(id);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List ret_cb_priest(String name) {
        List datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select name from officials where name like '%" + name + "%'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
//                System.out.println(id);
                datas.add(id);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_parishioners_list(final List<S1_parishioner.to_parishioners_1> datas) {

        final Connection conn = MyConnection.connect();
        try {
            for (S1_parishioner.to_parishioners_1 to_parishioners_1 : datas) {
                String s0 = "insert into parishioners_1("
                        + "ref_id"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",date_of_baptism"
                        + ",date_of_birth"
                        + ",place_of_birth"
                        + ",address1"
                        + ",address2"
                        + ",city"
                        + ",states"
                        + ",zip_code"
                        + ",father"
                        + ",mother"
                        + ",is_baptized"
                        + ",is_comm"
                        + ",is_confirm"
                        + ",is_married"
                        + ",is_2nd_married"
                        + ",is_prof_faith"
                        + ",is_acceptance"
                        + ",is_death"
                        + ",date_added"
                        + ",gender"
                        + ",bapt_place"
                        + ",b_date"
                        + ",b_book_no"
                        + ",b_page_no"
                        + ",b_index_no"
                        + ",c_date"
                        + ",c_book_no"
                        + ",c_page_no"
                        + ",c_index_no"
                        + ",m_date"
                        + ",m_book_no"
                        + ",m_page_no"
                        + ",m_index_no"
                        + ",f_date"
                        + ",f_book_no"
                        + ",f_page_no"
                        + ",f_index_no"
                        + ",b_sponsors"
                        + ",c_sponsors"
                        + ",m_sponsors"
                        + ",f_sponsors"
                        + ",b_minister"
                        + ",c_minister"
                        + ",m_minister"
                        + ",f_minister"
                        + ",b_date_added"
                        + ",c_date_added"
                        + ",marriage_id"
                        + ",f_date_added"
                        + ",partner_id"
                        + ",partner_name"
                        + ",partner_father"
                        + ",partner_mother"
                        + ",partner_address"
                        + ",b_remarks"
                        + ",c_remarks"
                        + ",m_remarks"
                        + ",f_remarks"
                        + ",b_time"
                        + ",c_time"
                        + ",m_time"
                        + ",f_time"
                        + ",f_date_died"
                        + ",f_place_buried"
                        + ",f_cause_of_death"
                        + ",f_wife_husband"
                        + ",f_wife_husband_id"
                        + ",partner_fname"
                        + ",partner_mi"
                        + ",partner_lname"
                        + ")values("
                        + ":ref_id"
                        + ",:fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:date_of_baptism"
                        + ",:date_of_birth"
                        + ",:place_of_birth"
                        + ",:address1"
                        + ",:address2"
                        + ",:city"
                        + ",:states"
                        + ",:zip_code"
                        + ",:father"
                        + ",:mother"
                        + ",:is_baptized"
                        + ",:is_comm"
                        + ",:is_confirm"
                        + ",:is_married"
                        + ",:is_2nd_married"
                        + ",:is_prof_faith"
                        + ",:is_acceptance"
                        + ",:is_death"
                        + ",:date_added"
                        + ",:gender"
                        + ",:bapt_place"
                        + ",:b_date"
                        + ",:b_book_no"
                        + ",:b_page_no"
                        + ",:b_index_no"
                        + ",:c_date"
                        + ",:c_book_no"
                        + ",:c_page_no"
                        + ",:c_index_no"
                        + ",:m_date"
                        + ",:m_book_no"
                        + ",:m_page_no"
                        + ",:m_index_no"
                        + ",:f_date"
                        + ",:f_book_no"
                        + ",:f_page_no"
                        + ",:f_index_no"
                        + ",:b_sponsors"
                        + ",:c_sponsors"
                        + ",:m_sponsors"
                        + ",:f_sponsors"
                        + ",:b_minister"
                        + ",:c_minister"
                        + ",:m_minister"
                        + ",:f_minister"
                        + ",:b_date_added"
                        + ",:c_date_added"
                        + ",:marriage_id"
                        + ",:f_date_added"
                        + ",:partner_id"
                        + ",:partner_name"
                        + ",:partner_father"
                        + ",:partner_mother"
                        + ",:partner_address"
                        + ",:b_remarks"
                        + ",:c_remarks"
                        + ",:m_remarks"
                        + ",:f_remarks"
                        + ",:b_time"
                        + ",:c_time"
                        + ",:m_time"
                        + ",:f_time"
                        + ",:f_date_died"
                        + ",:f_place_buried"
                        + ",:f_cause_of_death"
                        + ",:f_wife_husband"
                        + ",:f_wife_husband_id"
                        + ",:partner_fname"
                        + ",:partner_mi"
                        + ",:partner_lname"
                        + ")";
                s0 = SqlStringUtil.parse(s0).
                        setNumber("ref_id", to_parishioners_1.ref_id).
                        setString("fname", to_parishioners_1.fname).
                        setString("mi", to_parishioners_1.mi).
                        setString("lname", to_parishioners_1.lname).
                        setString("date_of_baptism", to_parishioners_1.date_of_baptism).
                        setString("date_of_birth", to_parishioners_1.date_of_birth).
                        setString("place_of_birth", to_parishioners_1.place_of_birth).
                        setString("address1", to_parishioners_1.address1).
                        setString("address2", to_parishioners_1.address2).
                        setString("city", to_parishioners_1.city).
                        setString("states", to_parishioners_1.states).
                        setString("zip_code", to_parishioners_1.zip_code).
                        setString("father", to_parishioners_1.father).
                        setString("mother", to_parishioners_1.mother).
                        setNumber("is_baptized", to_parishioners_1.is_baptized).
                        setNumber("is_comm", to_parishioners_1.is_comm).
                        setNumber("is_confirm", to_parishioners_1.is_confirm).
                        setNumber("is_married", to_parishioners_1.is_married).
                        setNumber("is_2nd_married", to_parishioners_1.is_2nd_married).
                        setNumber("is_prof_faith", to_parishioners_1.is_prof_faith).
                        setNumber("is_acceptance", to_parishioners_1.is_acceptance).
                        setNumber("is_death", to_parishioners_1.is_death).
                        setString("date_added", to_parishioners_1.date_added).
                        setNumber("gender", to_parishioners_1.gender).
                        setString("bapt_place", to_parishioners_1.bapt_place).
                        setString("b_date", to_parishioners_1.b_date).
                        setString("b_book_no", to_parishioners_1.b_book_no).
                        setNumber("b_page_no", to_parishioners_1.b_page_no).
                        setNumber("b_index_no", to_parishioners_1.b_index_no).
                        setString("c_date", to_parishioners_1.c_date).
                        setString("c_book_no", to_parishioners_1.c_book_no).
                        setNumber("c_page_no", to_parishioners_1.c_page_no).
                        setNumber("c_index_no", to_parishioners_1.c_index_no).
                        setString("m_date", to_parishioners_1.m_date).
                        setString("m_book_no", to_parishioners_1.m_book_no).
                        setNumber("m_page_no", to_parishioners_1.m_page_no).
                        setNumber("m_index_no", to_parishioners_1.m_index_no).
                        setString("f_date", to_parishioners_1.f_date).
                        setString("f_book_no", to_parishioners_1.f_book_no).
                        setNumber("f_page_no", to_parishioners_1.f_page_no).
                        setNumber("f_index_no", to_parishioners_1.f_index_no).
                        setString("b_sponsors", to_parishioners_1.b_sponsors).
                        setString("c_sponsors", to_parishioners_1.c_sponsors).
                        setString("m_sponsors", to_parishioners_1.m_sponsors).
                        setString("f_sponsors", to_parishioners_1.f_sponsors).
                        setString("b_minister", to_parishioners_1.b_minister).
                        setString("c_minister", to_parishioners_1.c_minister).
                        setString("m_minister", to_parishioners_1.m_minister).
                        setString("f_minister", to_parishioners_1.f_minister).
                        setString("b_date_added", to_parishioners_1.b_date_added).
                        setString("c_date_added", to_parishioners_1.c_date_added).
                        setNumber("marriage_id", to_parishioners_1.marriage_id).
                        setString("f_date_added", to_parishioners_1.f_date_added).
                        setString("partner_id", to_parishioners_1.partner_id).
                        setString("partner_name", to_parishioners_1.partner_name).
                        setString("partner_father", to_parishioners_1.partner_father).
                        setString("partner_mother", to_parishioners_1.partner_mother).
                        setString("partner_address", to_parishioners_1.partner_address).
                        setString("b_remarks", to_parishioners_1.b_remarks).
                        setString("c_remarks", to_parishioners_1.c_remarks).
                        setString("m_remarks", to_parishioners_1.m_remarks).
                        setString("f_remarks", to_parishioners_1.f_remarks).
                        setString("b_time", to_parishioners_1.b_time).
                        setString("c_time", to_parishioners_1.c_time).
                        setString("m_time", to_parishioners_1.m_time).
                        setString("f_time", to_parishioners_1.f_time).
                        setString("f_date_died", to_parishioners_1.f_date_died).
                        setString("f_place_buried", to_parishioners_1.f_place_buried).
                        setString("f_cause_of_death", to_parishioners_1.f_cause_of_death).
                        setString("f_wife_husband", to_parishioners_1.f_wife_husband).
                        setString("f_wife_husband_id", to_parishioners_1.f_wife_husband_id).
                        setString("partner_fname", to_parishioners_1.partner_fname).
                        setString("partner_mi", to_parishioners_1.partner_mi).
                        setString("partner_lname", to_parishioners_1.partner_lname).
                        ok();
//                if(to_parishioners_1.c_index_no==1959){
//                     System.out.println(to_parishioners_1.fname+ " - "+to_parishioners_1.c_book_no+ " - "+to_parishioners_1.c_date);
//                }

                PreparedStatement stmt = conn.prepareStatement(s0);
//                if(to_parishioners_1.c_index_no==1959){
//                   
//                }
                stmt.execute();
                Lg.s(S1_encoding_confirmation.class, "Successfully Updated" + +to_parishioners_1.ref_id);

//                Lg.s(S1_parishioner.class, "Successfully Added" + " " + to_parishioners_1.id + " : " + to_parishioners_1.date_of_baptism + " = " + to_parishioners_1.b_date);
                String s2 = "update encoding_confirmation set "
                        + "status= '" + 1 + "'"
                        + "where "
                        + " id ='" + to_parishioners_1.id + "' "
                        + " ";

                PreparedStatement stmt2 = conn.prepareStatement(s2);
//                if(to_parishioners_1.c_index_no==1959){
//                  
//                }
                stmt2.execute();
                Lg.s(S1_encoding_confirmation.class, "Successfully Updated" + +to_parishioners_1.ref_id);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_parishioners_1(final List<S1_parishioner.to_parishioners_1> to_parishioners_11) {
        try {

            final Connection conn = MyConnection.connect();

            for (S1_parishioner.to_parishioners_1 to_parishioners_1 : to_parishioners_11) {
                String s0 = "update parishioners_1 set "
                        + "is_confirm= :is_confirm"
                        + ",c_date= :c_date"
                        + ",c_book_no= :c_book_no"
                        + ",c_page_no= :c_page_no"
                        + ",c_index_no= :c_index_no"
                        + ",c_sponsors= :c_sponsors"
                        + ",c_minister= :c_minister"
                        + ",c_date_added= :c_date_added"
                        + ",c_remarks= :c_remarks"
                        + ",c_time= :c_time"
                        + " where "
                        + " ref_id ='" + to_parishioners_1.ref_id + "' "
                        + " ";

                s0 = SqlStringUtil.parse(s0).
                        setNumber("is_confirm", to_parishioners_1.is_confirm).
                        setString("c_date", to_parishioners_1.c_date).
                        setString("c_book_no", to_parishioners_1.c_book_no).
                        setNumber("c_page_no", to_parishioners_1.c_page_no).
                        setNumber("c_index_no", to_parishioners_1.c_index_no).
                        setString("c_sponsors", to_parishioners_1.c_sponsors).
                        setString("c_minister", to_parishioners_1.c_minister).
                        setString("c_date_added", to_parishioners_1.c_date_added).
                        setString("c_remarks", to_parishioners_1.c_remarks).
                        setString("c_time", to_parishioners_1.c_time).
                        ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(S1_parishioner.class, "Successfully Updated = " + to_parishioners_1.ref_id);

                String s2 = "update encoding_confirmation set "
                        + "status= '" + 1 + "'"
                        + "where "
                        + " id ='" + to_parishioners_1.id + "' "
                        + " ";

                PreparedStatement stmt2 = conn.prepareStatement(s2);
                stmt2.execute();
                Lg.s(S1_encoding_confirmation.class, "Successfully Updated");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            MyConnection.close();
        }
    }

    public static void edit_encoding_confirmation2(Srpt_print_confirmation.field to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_confirmation set "
                    + "fname= :fname"
                    + ",mi= :mi"
                    + ",lname= :lname"
                    + ",father= :father"
                    + ",mother= :mother"
                    + ",conf_date= :conf_date"
                    + ",book_no= :book_no"
                    + ",page_no= :page_no"
                    + ",index_no= :index_no"
                    + ",priest= :priest"
                    + ",sponsors= :sponsors"
                    + ",bapt_date= :bapt_date"
                    + ",bapt_place= :bapt_place"
                     + ",remarks= :remarks"
                    + " where "
                    + " id ='" + to_encoding_confirmation.getId() + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_encoding_confirmation.getFname())
                    .setString("mi", to_encoding_confirmation.getMname())
                    .setString("lname", to_encoding_confirmation.getLname())
                    .setString("father", to_encoding_confirmation.getFather())
                    .setString("mother", to_encoding_confirmation.getMother())
                    .setString("conf_date", to_encoding_confirmation.getConfirmation_date())
                    .setString("book_no", to_encoding_confirmation.getBook_no())
                    .setString("page_no", to_encoding_confirmation.getPage_no())
                    .setString("index_no", to_encoding_confirmation.getIndex_no())
                    .setString("priest", to_encoding_confirmation.getPriest())
                    .setString("sponsors", to_encoding_confirmation.getSponsors())
                    .setString("bapt_date", to_encoding_confirmation.getBaptism_date())
                    .setString("bapt_place", to_encoding_confirmation.getPlace_of_birth())
                    .setString("remarks", to_encoding_confirmation.getRemarks())
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_confirmation.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_encoding_confirmation(Srpt_print_baptism.field to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_confirmation set "
                    + "fname= :fname"
                    + ",mi= :mi"
                    + ",lname= :lname"
                    + ",father= :father"
                    + ",mother= :mother"
                    + ",conf_date= :conf_date"
                    + ",book_no= :book_no"
                    + ",page_no= :page_no"
                    + ",index_no= :index_no"
                    + ",priest= :priest"
                    + ",sponsors= :sponsors"
                    + ",bapt_date= :bapt_date"
                    + ",bapt_place= :bapt_place"
                    + " where "
                    + " id ='" + to_encoding_confirmation.getId() + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_encoding_confirmation.getFname())
                    .setString("mi", to_encoding_confirmation.getMname())
                    .setString("lname", to_encoding_confirmation.getLname())
                    .setString("father", to_encoding_confirmation.getFather())
                    .setString("mother", to_encoding_confirmation.getMother())
                    .setString("conf_date", to_encoding_confirmation.getConfirmation_date())
                    .setString("book_no", to_encoding_confirmation.getBook_no())
                    .setString("page_no", to_encoding_confirmation.getPage_no())
                    .setString("index_no", to_encoding_confirmation.getIndex_no())
                    .setString("priest", to_encoding_confirmation.getPriest())
                    .setString("sponsors", to_encoding_confirmation.getSponsors())
                    .setString("bapt_date", to_encoding_confirmation.getBaptism_date())
                    .setString("bapt_place", to_encoding_confirmation.getPlace_of_birth())
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_confirmation.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_encoding_baptism(Srpt_print_baptism.field to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update parishioners_1 set "
                    + "fname= :fname"
                    + ",mi= :mi"
                    + ",lname= :lname"
                    + ",father= :father"
                    + ",mother= :mother"
                    + ",b_book_no= :book_no"
                    + ",b_page_no= :page_no"
                    + ",b_index_no= :index_no"
                    + ",b_minister= :priest"
                    + ",b_sponsors= :sponsors"
                    + ",b_date= :bapt_date"
                    + ",place_of_birth= :place_of_birth"
                    + ",date_of_birth= :date_of_birth"
                    + ",b_remarks= :b_remarks"
                    + " where "
                    + " id ='" + to_encoding_confirmation.getId() + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_encoding_confirmation.getFname())
                    .setString("mi", to_encoding_confirmation.getMname())
                    .setString("lname", to_encoding_confirmation.getLname())
                    .setString("father", to_encoding_confirmation.getFather())
                    .setString("mother", to_encoding_confirmation.getMother())
                    .setString("book_no", to_encoding_confirmation.getBook_no())
                    .setString("page_no", to_encoding_confirmation.getPage_no())
                    .setString("index_no", to_encoding_confirmation.getIndex_no())
                    .setString("priest", to_encoding_confirmation.getPriest())
                    .setString("sponsors", to_encoding_confirmation.getSponsors())
                    .setString("bapt_date", to_encoding_confirmation.getBaptism_date())
                    .setString("place_of_birth", to_encoding_confirmation.getPlace_of_birth())
                    .setString("date_of_birth", to_encoding_confirmation.getDate_of_birth())
                    .setString("b_remarks", to_encoding_confirmation.getRemarks())
                    .ok();

            JOptionPane.showMessageDialog(null, to_encoding_confirmation.getId() + " : " + to_encoding_confirmation.getDate_of_birth() + " " + to_encoding_confirmation.getBaptism_date());
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_confirmation.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_encoding_confirmation2(Srpt_print_confirmation.field to_encoding_confirmation) {
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
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("ref_no", to_encoding_confirmation.getRef_no())
                    .setString("date_added", to_encoding_confirmation.getDate_of_birth())
                    .setString("user_name", Res.getUser_name())
                    .setString("fname", to_encoding_confirmation.getFname())
                    .setString("mi", to_encoding_confirmation.getMname())
                    .setString("lname", to_encoding_confirmation.getLname())
                    .setString("b_place", to_encoding_confirmation.getPlace_of_birth())
                    .setString("address", "")
                    .setString("father", to_encoding_confirmation.getFather())
                    .setString("mother", to_encoding_confirmation.getMother())
                    .setString("b_day", to_encoding_confirmation.getDate_of_birth())
                    .setString("conf_date", to_encoding_confirmation.getConfirmation_date())
                    .setString("gender", "0")
                    .setString("book_no", to_encoding_confirmation.getBook_no())
                    .setString("page_no", to_encoding_confirmation.getPage_no())
                    .setString("index_no", to_encoding_confirmation.getIndex_no())
                    .setString("priest", to_encoding_confirmation.getPriest())
                    .setString("sponsors", to_encoding_confirmation.getSponsors())
                    .setString("remarks", to_encoding_confirmation.getRemarks())
                    .setString("bapt_date", to_encoding_confirmation.getBaptism_date())
                    .setString("bapt_place", to_encoding_confirmation.getPlace_of_birth())
                    .setNumber("status", 1)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_confirmation.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_encoding_confirmation2(String id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_confirmation where "
                    + " id ='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_confirmation.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

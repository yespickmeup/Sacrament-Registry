/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.parishioners;

/**
 *
 * @author i1
 */

import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Maytopacka
 */
public class S1_parishioner {

    public static class to_parishioners_1 {

        public final int id;
        public final int ref_id;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String date_of_baptism;
        public final String date_of_birth;
        public final String place_of_birth;
        public final String address1;
        public final String address2;
        public final String city;
        public final String states;
        public final String zip_code;
        public final String father;
        public final String mother;
        public final int is_baptized;
        public final int is_comm;
        public final int is_confirm;
        public final int is_married;
        public final int is_2nd_married;
        public final int is_prof_faith;
        public final int is_acceptance;
        public final int is_death;
        public final String date_added;
        public final int gender;
        public final String bapt_place;
        public final String b_date;
        public final String b_book_no;
        public final int b_page_no;
        public final int b_index_no;
        public final String c_date;
        public final String c_book_no;
        public final int c_page_no;
        public final int c_index_no;
        public final String m_date;
        public final String m_book_no;
        public final int m_page_no;
        public final int m_index_no;
        public final String f_date;
        public final String f_book_no;
        public final int f_page_no;
        public final int f_index_no;
        public final String b_sponsors;
        public final String c_sponsors;
        public final String m_sponsors;
        public final String f_sponsors;
        public final String b_minister;
        public final String c_minister;
        public final String m_minister;
        public final String f_minister;
        public final String b_date_added;
        public final String c_date_added;
        public final int marriage_id;
        public final String f_date_added;
        public final String partner_id;
        public final String partner_name;
        public final String partner_father;
        public final String partner_mother;
        public final String partner_address;
        public final String b_remarks;
        public final String c_remarks;
        public final String m_remarks;
        public final String f_remarks;
        public final String b_time;
        public final String c_time;
        public final String m_time;
        public final String f_time;
        public final String f_date_died;
        public final String f_place_buried;
        public final String f_cause_of_death;
        public final String f_wife_husband;
        public final String f_wife_husband_id;
        public final String partner_fname;
        public final String partner_mi;
        public final String partner_lname;

        public to_parishioners_1(int id, int ref_id, String fname, String mi, String lname, String date_of_baptism, String date_of_birth, String place_of_birth, String address1, String address2, String city, String states, String zip_code, String father, String mother, int is_baptized, int is_comm, int is_confirm, int is_married, int is_2nd_married, int is_prof_faith, int is_acceptance, int is_death, String date_added, int gender, String bapt_place, String b_date, String b_book_no, int b_page_no, int b_index_no, String c_date, String c_book_no, int c_page_no, int c_index_no, String m_date, String m_book_no, int m_page_no, int m_index_no, String f_date, String f_book_no, int f_page_no, int f_index_no, String b_sponsors, String c_sponsors, String m_sponsors, String f_sponsors, String b_minister, String c_minister, String m_minister, String f_minister, String b_date_added, String c_date_added, int marriage_id, String f_date_added, String partner_id, String partner_name, String partner_father, String partner_mother, String partner_address, String b_remarks, String c_remarks, String m_remarks, String f_remarks, String b_time, String c_time, String m_time, String f_time, String f_date_died, String f_place_buried, String f_cause_of_death, String f_wife_husband, String f_wife_husband_id, String partner_fname, String partner_mi, String partner_lname) {
            this.id = id;
            this.ref_id = ref_id;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.date_of_baptism = date_of_baptism;
            this.date_of_birth = date_of_birth;
            this.place_of_birth = place_of_birth;
            this.address1 = address1;
            this.address2 = address2;
            this.city = city;
            this.states = states;
            this.zip_code = zip_code;
            this.father = father;
            this.mother = mother;
            this.is_baptized = is_baptized;
            this.is_comm = is_comm;
            this.is_confirm = is_confirm;
            this.is_married = is_married;
            this.is_2nd_married = is_2nd_married;
            this.is_prof_faith = is_prof_faith;
            this.is_acceptance = is_acceptance;
            this.is_death = is_death;
            this.date_added = date_added;
            this.gender = gender;
            this.bapt_place = bapt_place;
            this.b_date = b_date;
            this.b_book_no = b_book_no;
            this.b_page_no = b_page_no;
            this.b_index_no = b_index_no;
            this.c_date = c_date;
            this.c_book_no = c_book_no;
            this.c_page_no = c_page_no;
            this.c_index_no = c_index_no;
            this.m_date = m_date;
            this.m_book_no = m_book_no;
            this.m_page_no = m_page_no;
            this.m_index_no = m_index_no;
            this.f_date = f_date;
            this.f_book_no = f_book_no;
            this.f_page_no = f_page_no;
            this.f_index_no = f_index_no;
            this.b_sponsors = b_sponsors;
            this.c_sponsors = c_sponsors;
            this.m_sponsors = m_sponsors;
            this.f_sponsors = f_sponsors;
            this.b_minister = b_minister;
            this.c_minister = c_minister;
            this.m_minister = m_minister;
            this.f_minister = f_minister;
            this.b_date_added = b_date_added;
            this.c_date_added = c_date_added;
            this.marriage_id = marriage_id;
            this.f_date_added = f_date_added;
            this.partner_id = partner_id;
            this.partner_name = partner_name;
            this.partner_father = partner_father;
            this.partner_mother = partner_mother;
            this.partner_address = partner_address;
            this.b_remarks = b_remarks;
            this.c_remarks = c_remarks;
            this.m_remarks = m_remarks;
            this.f_remarks = f_remarks;
            this.b_time = b_time;
            this.c_time = c_time;
            this.m_time = m_time;
            this.f_time = f_time;
            this.f_date_died = f_date_died;
            this.f_place_buried = f_place_buried;
            this.f_cause_of_death = f_cause_of_death;
            this.f_wife_husband = f_wife_husband;
            this.f_wife_husband_id = f_wife_husband_id;
            this.partner_fname = partner_fname;
            this.partner_mi = partner_mi;
            this.partner_lname = partner_lname;
        }
    }

    public static void add_parishioners_1(S1_parishioner.to_parishioners_1 to_parishioners_1) {
        try {
            Connection conn = MyConnection.connect();
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

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_parishioner.class, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_parishioners_list(List<S1_parishioner.to_parishioners_1> datas) {
        try {
            Connection conn = MyConnection.connect();
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

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(S1_parishioner.class, "Successfully Added" + " " + to_parishioners_1.id + " : "+to_parishioners_1.date_of_baptism+ " = "+to_parishioners_1.b_date);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_parishioners_1(S1_parishioner.to_parishioners_1 to_parishioners_1) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update parishioners_1 set "
                    //                    + "ref_id= '" + to_parishioners_1.ref_id + "'"
                    + "fname= '" + to_parishioners_1.fname + "'"
                    + ",mi= '" + to_parishioners_1.mi + "'"
                    + ",lname= '" + to_parishioners_1.lname + "'"
                    + ",date_of_baptism= '" + to_parishioners_1.date_of_baptism + "'"
                    + ",date_of_birth= '" + to_parishioners_1.date_of_birth + "'"
                    + ",place_of_birth= '" + to_parishioners_1.place_of_birth + "'"
                    + ",address1= '" + to_parishioners_1.address1 + "'"
                    + ",address2= '" + to_parishioners_1.address2 + "'"
                    + ",city= '" + to_parishioners_1.city + "'"
                    + ",states= '" + to_parishioners_1.states + "'"
                    + ",zip_code= '" + to_parishioners_1.zip_code + "'"
                    + ",father= '" + to_parishioners_1.father + "'"
                    + ",mother= '" + to_parishioners_1.mother + "'"
                    + ",is_baptized= '" + to_parishioners_1.is_baptized + "'"
                    + ",is_comm= '" + to_parishioners_1.is_comm + "'"
                    + ",is_confirm= '" + to_parishioners_1.is_confirm + "'"
                    + ",is_married= '" + to_parishioners_1.is_married + "'"
                    + ",is_2nd_married= '" + to_parishioners_1.is_2nd_married + "'"
                    + ",is_prof_faith= '" + to_parishioners_1.is_prof_faith + "'"
                    + ",is_acceptance= '" + to_parishioners_1.is_acceptance + "'"
                    + ",is_death= '" + to_parishioners_1.is_death + "'"
                    + ",date_added= '" + to_parishioners_1.date_added + "'"
                    + ",gender= '" + to_parishioners_1.gender + "'"
                    + ",bapt_place= '" + to_parishioners_1.bapt_place + "'"
                    + ",b_date= '" + to_parishioners_1.b_date + "'"
                    + ",b_book_no= '" + to_parishioners_1.b_book_no + "'"
                    + ",b_page_no= '" + to_parishioners_1.b_page_no + "'"
                    + ",b_index_no= '" + to_parishioners_1.b_index_no + "'"
                    + ",c_date= '" + to_parishioners_1.c_date + "'"
                    + ",c_book_no= '" + to_parishioners_1.c_book_no + "'"
                    + ",c_page_no= '" + to_parishioners_1.c_page_no + "'"
                    + ",c_index_no= '" + to_parishioners_1.c_index_no + "'"
                    + ",m_date= '" + to_parishioners_1.m_date + "'"
                    + ",m_book_no= '" + to_parishioners_1.m_book_no + "'"
                    + ",m_page_no= '" + to_parishioners_1.m_page_no + "'"
                    + ",m_index_no= '" + to_parishioners_1.m_index_no + "'"
                    + ",f_date= '" + to_parishioners_1.f_date + "'"
                    + ",f_book_no= '" + to_parishioners_1.f_book_no + "'"
                    + ",f_page_no= '" + to_parishioners_1.f_page_no + "'"
                    + ",f_index_no= '" + to_parishioners_1.f_index_no + "'"
                    + ",b_sponsors= '" + to_parishioners_1.b_sponsors + "'"
                    + ",c_sponsors= '" + to_parishioners_1.c_sponsors + "'"
                    + ",m_sponsors= '" + to_parishioners_1.m_sponsors + "'"
                    + ",f_sponsors= '" + to_parishioners_1.f_sponsors + "'"
                    + ",b_minister= '" + to_parishioners_1.b_minister + "'"
                    + ",c_minister= '" + to_parishioners_1.c_minister + "'"
                    + ",m_minister= '" + to_parishioners_1.m_minister + "'"
                    + ",f_minister= '" + to_parishioners_1.f_minister + "'"
                    + ",b_date_added= '" + to_parishioners_1.b_date_added + "'"
                    + ",c_date_added= '" +"1500-01-01"+ "'"
                    + ",marriage_id= '" + to_parishioners_1.marriage_id + "'"
                    + ",f_date_added= '" + to_parishioners_1.f_date_added + "'"
                    + ",partner_id= '" + to_parishioners_1.partner_id + "'"
                    + ",partner_name= '" + to_parishioners_1.partner_name + "'"
                    + ",partner_father= '" + to_parishioners_1.partner_father + "'"
                    + ",partner_mother= '" + to_parishioners_1.partner_mother + "'"
                    + ",partner_address= '" + to_parishioners_1.partner_address + "'"
                    + ",b_remarks= '" + to_parishioners_1.b_remarks + "'"
                    + ",c_remarks= '" + to_parishioners_1.c_remarks + "'"
                    + ",m_remarks= '" + to_parishioners_1.m_remarks + "'"
                    + ",f_remarks= '" + to_parishioners_1.f_remarks + "'"
                    + ",b_time= '" + to_parishioners_1.b_time + "'"
                    + ",c_time= '" + to_parishioners_1.c_time + "'"
                    + ",m_time= '" + to_parishioners_1.m_time + "'"
                    + ",f_time= '" + to_parishioners_1.f_time + "'"
                    + ",f_date_died= '" + to_parishioners_1.f_date_died + "'"
                    + ",f_place_buried= '" + to_parishioners_1.f_place_buried + "'"
                    + ",f_cause_of_death= '" + to_parishioners_1.f_cause_of_death + "'"
                    + ",f_wife_husband= '" + to_parishioners_1.f_wife_husband + "'"
                    + ",f_wife_husband_id= '" + to_parishioners_1.f_wife_husband_id + "'"
                    + ",partner_fname= '" + to_parishioners_1.partner_fname + "'"
                    + ",partner_mi= '" + to_parishioners_1.partner_mi + "'"
                    + ",partner_lname= '" + to_parishioners_1.partner_lname + "'"
                    + "where "
                    + " id ='" + to_parishioners_1.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_parishioner.class, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_parishioners_1(String id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from parishioners_1 where "
                    + " id ='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_parishioner.class, "Successfully Deleted");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id() {
        String id = "0";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from parishioners_1";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

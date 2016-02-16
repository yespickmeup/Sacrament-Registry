/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.marriage_contracts;

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
 * @author Ronald
 */
public class Marriage_contracts {

    public static class to_marriage_contracts {

        public final int id;
        public final String province;
        public final String city;
        public final String registry_no;
        public final String place_of_marriage;
        public final String date_of_marriage;
        public final String time_of_marriage;
        public final String certification_contracting_parties;
        public final String certification_solemnizing_parties;
        public final String witnesses;
        public final String received_by;
        public final String registered_by;
        public final String remarks;
        public final int status;
        public final String date_added;
        public final String added_by;
        public final String h_ref_no;
        public final String h_fname;
        public final String h_mi;
        public final String h_lname;
        public final String h_bday;
        public final String h_place_of_birth;
        public final String h_citizenship;
        public final String h_residence;
        public final String h_religion;
        public final String h_civil_status;
        public final String h_father;
        public final String h_father_citizenship;
        public final String h_mother;
        public final String h_mother_citizenship;
        public final String h_consent_by;
        public final String h_consent_by_relation;
        public final String h_consent_by_residence;
        public final String w_ref_no;
        public final String w_fname;
        public final String w_mi;
        public final String w_lname;
        public final String w_bday;
        public final String w_place_of_birth;
        public final String w_citizenship;
        public final String w_residence;
        public final String w_religion;
        public final String w_civil_status;
        public final String w_father;
        public final String w_father_citizenship;
        public final String w_mother;
        public final String w_mother_citizenship;
        public final String w_consent_by;
        public final String w_consent_by_relation;
        public final String w_consent_by_residence;
        public final String solem_officer;
        public final String solem_of;
        public final String solem_at;
        public final String solem_one;
        public final String solem_two;
        public final String solem_administer;
        public final String affid_by;
        public final String affid_address;
        public final String affid_one;
        public final String affid_two;
        public final String affid_three;
        public final String affid_four;
        public final String affid_five;
        public final String affid_administer;

        public to_marriage_contracts(int id, String province, String city, String registry_no, String place_of_marriage, String date_of_marriage, String time_of_marriage, String certification_contracting_parties, String certification_solemnizing_parties, String witnesses, String received_by, String registered_by, String remarks, int status, String date_added, String added_by, String h_ref_no, String h_fname, String h_mi, String h_lname, String h_bday, String h_place_of_birth, String h_citizenship, String h_residence, String h_religion, String h_civil_status, String h_father, String h_father_citizenship, String h_mother, String h_mother_citizenship, String h_consent_by, String h_consent_by_relation, String h_consent_by_residence, String w_ref_no, String w_fname, String w_mi, String w_lname, String w_bday, String w_place_of_birth, String w_citizenship, String w_residence, String w_religion, String w_civil_status, String w_father, String w_father_citizenship, String w_mother, String w_mother_citizenship, String w_consent_by, String w_consent_by_relation, String w_consent_by_residence, String solem_officer, String solem_of, String solem_at, String solem_one, String solem_two, String solem_administer, String affid_by, String affid_address, String affid_one, String affid_two, String affid_three, String affid_four, String affid_five, String affid_administer) {
            this.id = id;
            this.province = province;
            this.city = city;
            this.registry_no = registry_no;
            this.place_of_marriage = place_of_marriage;
            this.date_of_marriage = date_of_marriage;
            this.time_of_marriage = time_of_marriage;
            this.certification_contracting_parties = certification_contracting_parties;
            this.certification_solemnizing_parties = certification_solemnizing_parties;
            this.witnesses = witnesses;
            this.received_by = received_by;
            this.registered_by = registered_by;
            this.remarks = remarks;
            this.status = status;
            this.date_added = date_added;
            this.added_by = added_by;
            this.h_ref_no = h_ref_no;
            this.h_fname = h_fname;
            this.h_mi = h_mi;
            this.h_lname = h_lname;
            this.h_bday = h_bday;
            this.h_place_of_birth = h_place_of_birth;
            this.h_citizenship = h_citizenship;
            this.h_residence = h_residence;
            this.h_religion = h_religion;
            this.h_civil_status = h_civil_status;
            this.h_father = h_father;
            this.h_father_citizenship = h_father_citizenship;
            this.h_mother = h_mother;
            this.h_mother_citizenship = h_mother_citizenship;
            this.h_consent_by = h_consent_by;
            this.h_consent_by_relation = h_consent_by_relation;
            this.h_consent_by_residence = h_consent_by_residence;
            this.w_ref_no = w_ref_no;
            this.w_fname = w_fname;
            this.w_mi = w_mi;
            this.w_lname = w_lname;
            this.w_bday = w_bday;
            this.w_place_of_birth = w_place_of_birth;
            this.w_citizenship = w_citizenship;
            this.w_residence = w_residence;
            this.w_religion = w_religion;
            this.w_civil_status = w_civil_status;
            this.w_father = w_father;
            this.w_father_citizenship = w_father_citizenship;
            this.w_mother = w_mother;
            this.w_mother_citizenship = w_mother_citizenship;
            this.w_consent_by = w_consent_by;
            this.w_consent_by_relation = w_consent_by_relation;
            this.w_consent_by_residence = w_consent_by_residence;
            this.solem_officer = solem_officer;
            this.solem_of = solem_of;
            this.solem_at = solem_at;
            this.solem_one = solem_one;
            this.solem_two = solem_two;
            this.solem_administer = solem_administer;
            this.affid_by = affid_by;
            this.affid_address = affid_address;
            this.affid_one = affid_one;
            this.affid_two = affid_two;
            this.affid_three = affid_three;
            this.affid_four = affid_four;
            this.affid_five = affid_five;
            this.affid_administer = affid_administer;
        }
    }

    public static void add_marriage_contracts(to_marriage_contracts to_marriage_contracts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into marriage_contracts("
                    + "province"
                    + ",city"
                    + ",registry_no"
                    + ",place_of_marriage"
                    + ",date_of_marriage"
                    + ",time_of_marriage"
                    + ",certification_contracting_parties"
                    + ",certification_solemnizing_parties"
                    + ",witnesses"
                    + ",received_by"
                    + ",registered_by"
                    + ",remarks"
                    + ",status"
                    + ",date_added"
                    + ",added_by"
                    + ",h_ref_no"
                    + ",h_fname"
                    + ",h_mi"
                    + ",h_lname"
                    + ",h_bday"
                    + ",h_place_of_birth"
                    + ",h_citizenship"
                    + ",h_residence"
                    + ",h_religion"
                    + ",h_civil_status"
                    + ",h_father"
                    + ",h_father_citizenship"
                    + ",h_mother"
                    + ",h_mother_citizenship"
                    + ",h_consent_by"
                    + ",h_consent_by_relation"
                    + ",h_consent_by_residence"
                    + ",w_ref_no"
                    + ",w_fname"
                    + ",w_mi"
                    + ",w_lname"
                    + ",w_bday"
                    + ",w_place_of_birth"
                    + ",w_citizenship"
                    + ",w_residence"
                    + ",w_religion"
                    + ",w_civil_status"
                    + ",w_father"
                    + ",w_father_citizenship"
                    + ",w_mother"
                    + ",w_mother_citizenship"
                    + ",w_consent_by"
                    + ",w_consent_by_relation"
                    + ",w_consent_by_residence"
                    + ",solem_officer"
                    + ",solem_of"
                    + ",solem_at"
                    + ",solem_one"
                    + ",solem_two"
                    + ",solem_administer"
                    + ",affid_by"
                    + ",affid_address"
                    + ",affid_one"
                    + ",affid_two"
                    + ",affid_three"
                    + ",affid_four"
                    + ",affid_five"
                    + ",affid_administer"
                    + ")values("
                    + ":province"
                    + ",:city"
                    + ",:registry_no"
                    + ",:place_of_marriage"
                    + ",:date_of_marriage"
                    + ",:time_of_marriage"
                    + ",:certification_contracting_parties"
                    + ",:certification_solemnizing_parties"
                    + ",:witnesses"
                    + ",:received_by"
                    + ",:registered_by"
                    + ",:remarks"
                    + ",:status"
                    + ",:date_added"
                    + ",:added_by"
                    + ",:h_ref_no"
                    + ",:h_fname"
                    + ",:h_mi"
                    + ",:h_lname"
                    + ",:h_bday"
                    + ",:h_place_of_birth"
                    + ",:h_citizenship"
                    + ",:h_residence"
                    + ",:h_religion"
                    + ",:h_civil_status"
                    + ",:h_father"
                    + ",:h_father_citizenship"
                    + ",:h_mother"
                    + ",:h_mother_citizenship"
                    + ",:h_consent_by"
                    + ",:h_consent_by_relation"
                    + ",:h_consent_by_residence"
                    + ",:w_ref_no"
                    + ",:w_fname"
                    + ",:w_mi"
                    + ",:w_lname"
                    + ",:w_bday"
                    + ",:w_place_of_birth"
                    + ",:w_citizenship"
                    + ",:w_residence"
                    + ",:w_religion"
                    + ",:w_civil_status"
                    + ",:w_father"
                    + ",:w_father_citizenship"
                    + ",:w_mother"
                    + ",:w_mother_citizenship"
                    + ",:w_consent_by"
                    + ",:w_consent_by_relation"
                    + ",:w_consent_by_residence"
                    + ",:solem_officer"
                    + ",:solem_of"
                    + ",:solem_at"
                    + ",:solem_one"
                    + ",:solem_two"
                    + ",:solem_administer"
                    + ",:affid_by"
                    + ",:affid_address"
                    + ",:affid_one"
                    + ",:affid_two"
                    + ",:affid_three"
                    + ",:affid_four"
                    + ",:affid_five"
                    + ",:affid_administer"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province", to_marriage_contracts.province)
                    .setString("city", to_marriage_contracts.city)
                    .setString("registry_no", to_marriage_contracts.registry_no)
                    .setString("place_of_marriage", to_marriage_contracts.place_of_marriage)
                    .setString("date_of_marriage", to_marriage_contracts.date_of_marriage)
                    .setString("time_of_marriage", to_marriage_contracts.time_of_marriage)
                    .setString("certification_contracting_parties", to_marriage_contracts.certification_contracting_parties)
                    .setString("certification_solemnizing_parties", to_marriage_contracts.certification_solemnizing_parties)
                    .setString("witnesses", to_marriage_contracts.witnesses)
                    .setString("received_by", to_marriage_contracts.received_by)
                    .setString("registered_by", to_marriage_contracts.registered_by)
                    .setString("remarks", to_marriage_contracts.remarks)
                    .setNumber("status", to_marriage_contracts.status)
                    .setString("date_added", to_marriage_contracts.date_added)
                    .setString("added_by", to_marriage_contracts.added_by)
                    .setString("h_ref_no", to_marriage_contracts.h_ref_no)
                    .setString("h_fname", to_marriage_contracts.h_fname)
                    .setString("h_mi", to_marriage_contracts.h_mi)
                    .setString("h_lname", to_marriage_contracts.h_lname)
                    .setString("h_bday", to_marriage_contracts.h_bday)
                    .setString("h_place_of_birth", to_marriage_contracts.h_place_of_birth)
                    .setString("h_citizenship", to_marriage_contracts.h_citizenship)
                    .setString("h_residence", to_marriage_contracts.h_residence)
                    .setString("h_religion", to_marriage_contracts.h_religion)
                    .setString("h_civil_status", to_marriage_contracts.h_civil_status)
                    .setString("h_father", to_marriage_contracts.h_father)
                    .setString("h_father_citizenship", to_marriage_contracts.h_father_citizenship)
                    .setString("h_mother", to_marriage_contracts.h_mother)
                    .setString("h_mother_citizenship", to_marriage_contracts.h_mother_citizenship)
                    .setString("h_consent_by", to_marriage_contracts.h_consent_by)
                    .setString("h_consent_by_relation", to_marriage_contracts.h_consent_by_relation)
                    .setString("h_consent_by_residence", to_marriage_contracts.h_consent_by_residence)
                    .setString("w_ref_no", to_marriage_contracts.w_ref_no)
                    .setString("w_fname", to_marriage_contracts.w_fname)
                    .setString("w_mi", to_marriage_contracts.w_mi)
                    .setString("w_lname", to_marriage_contracts.w_lname)
                    .setString("w_bday", to_marriage_contracts.w_bday)
                    .setString("w_place_of_birth", to_marriage_contracts.w_place_of_birth)
                    .setString("w_citizenship", to_marriage_contracts.w_citizenship)
                    .setString("w_residence", to_marriage_contracts.w_residence)
                    .setString("w_religion", to_marriage_contracts.w_religion)
                    .setString("w_civil_status", to_marriage_contracts.w_civil_status)
                    .setString("w_father", to_marriage_contracts.w_father)
                    .setString("w_father_citizenship", to_marriage_contracts.w_father_citizenship)
                    .setString("w_mother", to_marriage_contracts.w_mother)
                    .setString("w_mother_citizenship", to_marriage_contracts.w_mother_citizenship)
                    .setString("w_consent_by", to_marriage_contracts.w_consent_by)
                    .setString("w_consent_by_relation", to_marriage_contracts.w_consent_by_relation)
                    .setString("w_consent_by_residence", to_marriage_contracts.w_consent_by_residence)
                    .setString("solem_officer", to_marriage_contracts.solem_officer)
                    .setString("solem_of", to_marriage_contracts.solem_of)
                    .setString("solem_at", to_marriage_contracts.solem_at)
                    .setString("solem_one", to_marriage_contracts.solem_one)
                    .setString("solem_two", to_marriage_contracts.solem_two)
                    .setString("solem_administer", to_marriage_contracts.solem_administer)
                    .setString("affid_by", to_marriage_contracts.affid_by)
                    .setString("affid_address", to_marriage_contracts.affid_address)
                    .setString("affid_one", to_marriage_contracts.affid_one)
                    .setString("affid_two", to_marriage_contracts.affid_two)
                    .setString("affid_three", to_marriage_contracts.affid_three)
                    .setString("affid_four", to_marriage_contracts.affid_four)
                    .setString("affid_five", to_marriage_contracts.affid_five)
                    .setString("affid_administer", to_marriage_contracts.affid_administer)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Marriage_contracts.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_marriage_contracts(to_marriage_contracts to_marriage_contracts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update marriage_contracts set "
                    + "province= :province"
                    + ",city= :city"
                    + ",registry_no= :registry_no"
                    + ",place_of_marriage= :place_of_marriage"
                    + ",date_of_marriage= :date_of_marriage"
                    + ",time_of_marriage= :time_of_marriage"
                    + ",certification_contracting_parties= :certification_contracting_parties"
                    + ",certification_solemnizing_parties= :certification_solemnizing_parties"
                    + ",witnesses= :witnesses"
                    + ",received_by= :received_by"
                    + ",registered_by= :registered_by"
                    + ",remarks= :remarks"
                    + ",status= :status"
                    + ",date_added= :date_added"
                    + ",added_by= :added_by"
                    + ",h_ref_no= :h_ref_no"
                    + ",h_fname= :h_fname"
                    + ",h_mi= :h_mi"
                    + ",h_lname= :h_lname"
                    + ",h_bday= :h_bday"
                    + ",h_place_of_birth= :h_place_of_birth"
                    + ",h_citizenship= :h_citizenship"
                    + ",h_residence= :h_residence"
                    + ",h_religion= :h_religion"
                    + ",h_civil_status= :h_civil_status"
                    + ",h_father= :h_father"
                    + ",h_father_citizenship= :h_father_citizenship"
                    + ",h_mother= :h_mother"
                    + ",h_mother_citizenship= :h_mother_citizenship"
                    + ",h_consent_by= :h_consent_by"
                    + ",h_consent_by_relation= :h_consent_by_relation"
                    + ",h_consent_by_residence= :h_consent_by_residence"
                    + ",w_ref_no= :w_ref_no"
                    + ",w_fname= :w_fname"
                    + ",w_mi= :w_mi"
                    + ",w_lname= :w_lname"
                    + ",w_bday= :w_bday"
                    + ",w_place_of_birth= :w_place_of_birth"
                    + ",w_citizenship= :w_citizenship"
                    + ",w_residence= :w_residence"
                    + ",w_religion= :w_religion"
                    + ",w_civil_status= :w_civil_status"
                    + ",w_father= :w_father"
                    + ",w_father_citizenship= :w_father_citizenship"
                    + ",w_mother= :w_mother"
                    + ",w_mother_citizenship= :w_mother_citizenship"
                    + ",w_consent_by= :w_consent_by"
                    + ",w_consent_by_relation= :w_consent_by_relation"
                    + ",w_consent_by_residence= :w_consent_by_residence"
                    + ",solem_officer= :solem_officer"
                    + ",solem_of= :solem_of"
                    + ",solem_at= :solem_at"
                    + ",solem_one= :solem_one"
                    + ",solem_two= :solem_two"
                    + ",solem_administer= :solem_administer"
                    + ",affid_by= :affid_by"
                    + ",affid_address= :affid_address"
                    + ",affid_one= :affid_one"
                    + ",affid_two= :affid_two"
                    + ",affid_three= :affid_three"
                    + ",affid_four= :affid_four"
                    + ",affid_five= :affid_five"
                    + ",affid_administer= :affid_administer"
                    + " where "
                    + " id ='" + to_marriage_contracts.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province", to_marriage_contracts.province)
                    .setString("city", to_marriage_contracts.city)
                    .setString("registry_no", to_marriage_contracts.registry_no)
                    .setString("place_of_marriage", to_marriage_contracts.place_of_marriage)
                    .setString("date_of_marriage", to_marriage_contracts.date_of_marriage)
                    .setString("time_of_marriage", to_marriage_contracts.time_of_marriage)
                    .setString("certification_contracting_parties", to_marriage_contracts.certification_contracting_parties)
                    .setString("certification_solemnizing_parties", to_marriage_contracts.certification_solemnizing_parties)
                    .setString("witnesses", to_marriage_contracts.witnesses)
                    .setString("received_by", to_marriage_contracts.received_by)
                    .setString("registered_by", to_marriage_contracts.registered_by)
                    .setString("remarks", to_marriage_contracts.remarks)
                    .setNumber("status", to_marriage_contracts.status)
                    .setString("date_added", to_marriage_contracts.date_added)
                    .setString("added_by", to_marriage_contracts.added_by)
                    .setString("h_ref_no", to_marriage_contracts.h_ref_no)
                    .setString("h_fname", to_marriage_contracts.h_fname)
                    .setString("h_mi", to_marriage_contracts.h_mi)
                    .setString("h_lname", to_marriage_contracts.h_lname)
                    .setString("h_bday", to_marriage_contracts.h_bday)
                    .setString("h_place_of_birth", to_marriage_contracts.h_place_of_birth)
                    .setString("h_citizenship", to_marriage_contracts.h_citizenship)
                    .setString("h_residence", to_marriage_contracts.h_residence)
                    .setString("h_religion", to_marriage_contracts.h_religion)
                    .setString("h_civil_status", to_marriage_contracts.h_civil_status)
                    .setString("h_father", to_marriage_contracts.h_father)
                    .setString("h_father_citizenship", to_marriage_contracts.h_father_citizenship)
                    .setString("h_mother", to_marriage_contracts.h_mother)
                    .setString("h_mother_citizenship", to_marriage_contracts.h_mother_citizenship)
                    .setString("h_consent_by", to_marriage_contracts.h_consent_by)
                    .setString("h_consent_by_relation", to_marriage_contracts.h_consent_by_relation)
                    .setString("h_consent_by_residence", to_marriage_contracts.h_consent_by_residence)
                    .setString("w_ref_no", to_marriage_contracts.w_ref_no)
                    .setString("w_fname", to_marriage_contracts.w_fname)
                    .setString("w_mi", to_marriage_contracts.w_mi)
                    .setString("w_lname", to_marriage_contracts.w_lname)
                    .setString("w_bday", to_marriage_contracts.w_bday)
                    .setString("w_place_of_birth", to_marriage_contracts.w_place_of_birth)
                    .setString("w_citizenship", to_marriage_contracts.w_citizenship)
                    .setString("w_residence", to_marriage_contracts.w_residence)
                    .setString("w_religion", to_marriage_contracts.w_religion)
                    .setString("w_civil_status", to_marriage_contracts.w_civil_status)
                    .setString("w_father", to_marriage_contracts.w_father)
                    .setString("w_father_citizenship", to_marriage_contracts.w_father_citizenship)
                    .setString("w_mother", to_marriage_contracts.w_mother)
                    .setString("w_mother_citizenship", to_marriage_contracts.w_mother_citizenship)
                    .setString("w_consent_by", to_marriage_contracts.w_consent_by)
                    .setString("w_consent_by_relation", to_marriage_contracts.w_consent_by_relation)
                    .setString("w_consent_by_residence", to_marriage_contracts.w_consent_by_residence)
                    .setString("solem_officer", to_marriage_contracts.solem_officer)
                    .setString("solem_of", to_marriage_contracts.solem_of)
                    .setString("solem_at", to_marriage_contracts.solem_at)
                    .setString("solem_one", to_marriage_contracts.solem_one)
                    .setString("solem_two", to_marriage_contracts.solem_two)
                    .setString("solem_administer", to_marriage_contracts.solem_administer)
                    .setString("affid_by", to_marriage_contracts.affid_by)
                    .setString("affid_address", to_marriage_contracts.affid_address)
                    .setString("affid_one", to_marriage_contracts.affid_one)
                    .setString("affid_two", to_marriage_contracts.affid_two)
                    .setString("affid_three", to_marriage_contracts.affid_three)
                    .setString("affid_four", to_marriage_contracts.affid_four)
                    .setString("affid_five", to_marriage_contracts.affid_five)
                    .setString("affid_administer", to_marriage_contracts.affid_administer)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Marriage_contracts.class, "Successfully Updated: "+to_marriage_contracts.id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_marriage_contracts(to_marriage_contracts to_marriage_contracts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from marriage_contracts where "
                    + " id ='" + to_marriage_contracts.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Marriage_contracts.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_marriage_contracts> ret_data(String where) {
        List<to_marriage_contracts> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",province"
                    + ",city"
                    + ",registry_no"
                    + ",place_of_marriage"
                    + ",date_of_marriage"
                    + ",time_of_marriage"
                    + ",certification_contracting_parties"
                    + ",certification_solemnizing_parties"
                    + ",witnesses"
                    + ",received_by"
                    + ",registered_by"
                    + ",remarks"
                    + ",status"
                    + ",date_added"
                    + ",added_by"
                    + ",h_ref_no"
                    + ",h_fname"
                    + ",h_mi"
                    + ",h_lname"
                    + ",h_bday"
                    + ",h_place_of_birth"
                    + ",h_citizenship"
                    + ",h_residence"
                    + ",h_religion"
                    + ",h_civil_status"
                    + ",h_father"
                    + ",h_father_citizenship"
                    + ",h_mother"
                    + ",h_mother_citizenship"
                    + ",h_consent_by"
                    + ",h_consent_by_relation"
                    + ",h_consent_by_residence"
                    + ",w_ref_no"
                    + ",w_fname"
                    + ",w_mi"
                    + ",w_lname"
                    + ",w_bday"
                    + ",w_place_of_birth"
                    + ",w_citizenship"
                    + ",w_residence"
                    + ",w_religion"
                    + ",w_civil_status"
                    + ",w_father"
                    + ",w_father_citizenship"
                    + ",w_mother"
                    + ",w_mother_citizenship"
                    + ",w_consent_by"
                    + ",w_consent_by_relation"
                    + ",w_consent_by_residence"
                    + ",solem_officer"
                    + ",solem_of"
                    + ",solem_at"
                    + ",solem_one"
                    + ",solem_two"
                    + ",solem_administer"
                    + ",affid_by"
                    + ",affid_address"
                    + ",affid_one"
                    + ",affid_two"
                    + ",affid_three"
                    + ",affid_four"
                    + ",affid_five"
                    + ",affid_administer"
                    + " from marriage_contracts  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String province = rs.getString(2);
                String city = rs.getString(3);
                String registry_no = rs.getString(4);
                String place_of_marriage = rs.getString(5);
                String date_of_marriage = rs.getString(6);
                String time_of_marriage = rs.getString(7);
                String certification_contracting_parties = rs.getString(8);
                String certification_solemnizing_parties = rs.getString(9);
                String witnesses = rs.getString(10);
                String received_by = rs.getString(11);
                String registered_by = rs.getString(12);
                String remarks = rs.getString(13);
                int status = rs.getInt(14);
                String date_added = rs.getString(15);
                String added_by = rs.getString(16);
                String h_ref_no = rs.getString(17);
                String h_fname = rs.getString(18);
                String h_mi = rs.getString(19);
                String h_lname = rs.getString(20);
                String h_bday = rs.getString(21);
                String h_place_of_birth = rs.getString(22);
                String h_citizenship = rs.getString(23);
                String h_residence = rs.getString(24);
                String h_religion = rs.getString(25);
                String h_civil_status = rs.getString(26);
                String h_father = rs.getString(27);
                String h_father_citizenship = rs.getString(28);
                String h_mother = rs.getString(29);
                String h_mother_citizenship = rs.getString(30);
                String h_consent_by = rs.getString(31);
                String h_consent_by_relation = rs.getString(32);
                String h_consent_by_residence = rs.getString(33);
                String w_ref_no = rs.getString(34);
                String w_fname = rs.getString(35);
                String w_mi = rs.getString(36);
                String w_lname = rs.getString(37);
                String w_bday = rs.getString(38);
                String w_place_of_birth = rs.getString(39);
                String w_citizenship = rs.getString(40);
                String w_residence = rs.getString(41);
                String w_religion = rs.getString(42);
                String w_civil_status = rs.getString(43);
                String w_father = rs.getString(44);
                String w_father_citizenship = rs.getString(45);
                String w_mother = rs.getString(46);
                String w_mother_citizenship = rs.getString(47);
                String w_consent_by = rs.getString(48);
                String w_consent_by_relation = rs.getString(49);
                String w_consent_by_residence = rs.getString(50);
                String solem_officer = rs.getString(51);
                String solem_of = rs.getString(52);
                String solem_at = rs.getString(53);
                String solem_one = rs.getString(54);
                String solem_two = rs.getString(55);
                String solem_administer = rs.getString(56);
                String affid_by = rs.getString(57);
                String affid_address = rs.getString(58);
                String affid_one = rs.getString(59);
                String affid_two = rs.getString(60);
                String affid_three = rs.getString(61);
                String affid_four = rs.getString(62);
                String affid_five = rs.getString(63);
                String affid_administer = rs.getString(64);

                to_marriage_contracts to = new to_marriage_contracts(id, province, city, registry_no, place_of_marriage, date_of_marriage, time_of_marriage, certification_contracting_parties, certification_solemnizing_parties, witnesses, received_by, registered_by, remarks, status, date_added, added_by, h_ref_no, h_fname, h_mi, h_lname, h_bday, h_place_of_birth, h_citizenship, h_residence, h_religion, h_civil_status, h_father, h_father_citizenship, h_mother, h_mother_citizenship, h_consent_by, h_consent_by_relation, h_consent_by_residence, w_ref_no, w_fname, w_mi, w_lname, w_bday, w_place_of_birth, w_citizenship, w_residence, w_religion, w_civil_status, w_father, w_father_citizenship, w_mother, w_mother_citizenship, w_consent_by, w_consent_by_relation, w_consent_by_residence, solem_officer, solem_of, solem_at, solem_one, solem_two, solem_administer, affid_by, affid_address, affid_one, affid_two, affid_three, affid_four, affid_five, affid_administer);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.funeral_records;

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
public class Encoding_funeral2 {

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
        public final String age;
        public final String father;
        public final String mother;
        public final String parents;

        public to_encoding_funeral2(int id, String index_no, String book_no, String page_no, String date_of_burial, String priest, String fname, String mi, String lname, String residence, String informant, String date_added, String user_name, String remarks, String date_of_burial2, String age, String father, String mother, String parents) {
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
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.parents = parents;
        }
    }

    public static void add_data(to_encoding_funeral2 to_encoding_funeral2) {
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
                    + ",age"
                    + ",father"
                    + ",mother"
                    + ",parents"
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
                    + ",:age"
                    + ",:father"
                    + ",:mother"
                    + ",:parents"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("index_no", to_encoding_funeral2.index_no)
                    .setString("book_no", to_encoding_funeral2.book_no)
                    .setString("page_no", to_encoding_funeral2.page_no)
                    .setString("date_of_burial", to_encoding_funeral2.date_of_burial)
                    .setString("priest", to_encoding_funeral2.priest)
                    .setString("fname", to_encoding_funeral2.fname)
                    .setString("mi", to_encoding_funeral2.mi)
                    .setString("lname", to_encoding_funeral2.lname)
                    .setString("residence", to_encoding_funeral2.residence)
                    .setString("informant", to_encoding_funeral2.informant)
                    .setString("date_added", to_encoding_funeral2.date_added)
                    .setString("user_name", to_encoding_funeral2.user_name)
                    .setString("remarks", to_encoding_funeral2.remarks)
                    .setString("date_of_burial2", to_encoding_funeral2.date_of_burial2)
                    .setString("age", to_encoding_funeral2.age)
                    .setString("father", to_encoding_funeral2.father)
                    .setString("mother", to_encoding_funeral2.mother)
                    .setString("parents", to_encoding_funeral2.parents)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Encoding_funeral2.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_encoding_funeral2 to_encoding_funeral2) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_funeral2 set "
                    + "index_no= :index_no "
                    + ",book_no= :book_no "
                    + ",page_no= :page_no "
                    + ",date_of_burial= :date_of_burial "
                    + ",priest= :priest "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",residence= :residence "
                    + ",informant= :informant "
                    + ",date_added= :date_added "
                    + ",user_name= :user_name "
                    + ",remarks= :remarks "
                    + ",date_of_burial2= :date_of_burial2 "
                    + ",age= :age "
                    + ",father= :father "
                    + ",mother= :mother "
                    + ",parents= :parents "
                    + " where id='" + to_encoding_funeral2.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("index_no", to_encoding_funeral2.index_no)
                    .setString("book_no", to_encoding_funeral2.book_no)
                    .setString("page_no", to_encoding_funeral2.page_no)
                    .setString("date_of_burial", to_encoding_funeral2.date_of_burial)
                    .setString("priest", to_encoding_funeral2.priest)
                    .setString("fname", to_encoding_funeral2.fname)
                    .setString("mi", to_encoding_funeral2.mi)
                    .setString("lname", to_encoding_funeral2.lname)
                    .setString("residence", to_encoding_funeral2.residence)
                    .setString("informant", to_encoding_funeral2.informant)
                    .setString("date_added", to_encoding_funeral2.date_added)
                    .setString("user_name", to_encoding_funeral2.user_name)
                    .setString("remarks", to_encoding_funeral2.remarks)
                    .setString("date_of_burial2", to_encoding_funeral2.date_of_burial2)
                    .setString("age", to_encoding_funeral2.age)
                    .setString("father", to_encoding_funeral2.father)
                    .setString("mother", to_encoding_funeral2.mother)
                    .setString("parents", to_encoding_funeral2.parents)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Encoding_funeral2.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_encoding_funeral2 to_encoding_funeral2) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_funeral2  "
                    + " where id='" + to_encoding_funeral2.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Encoding_funeral2.class, "Successfully Deleted");
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
                    + ",age"
                    + ",father"
                    + ",mother"
                    + ",parents"
                    + " from encoding_funeral2"
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
                String age = rs.getString(16);
                String father = rs.getString(17);
                String mother = rs.getString(18);
                String parents = rs.getString(19);

                to_encoding_funeral2 to = new to_encoding_funeral2(id, index_no, book_no, page_no, date_of_burial, priest, fname, mi, lname, residence, informant, date_added, user_name, remarks, date_of_burial2, age, father, mother, parents);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_encoding_funeral2> ret_books(String where) {
        List<to_encoding_funeral2> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "count(id)"
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
                    + ",age"
                    + ",father"
                    + ",mother"
                    + ",parents"
                    + " from encoding_funeral2"
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
                String age = rs.getString(16);
                String father = rs.getString(17);
                String mother = rs.getString(18);
                String parents = rs.getString(19);

                to_encoding_funeral2 to = new to_encoding_funeral2(id, index_no, book_no, page_no, date_of_burial, priest, fname, mi, lname, residence, informant, date_added, user_name, remarks, date_of_burial2, age, father, mother, parents);
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

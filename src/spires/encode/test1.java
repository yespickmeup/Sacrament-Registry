/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode;

import spires.encode.S1_encoding_confirmation.to_encoding_confirmation;
import SR.main.Main;

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
public class test1 {

    public static void main(String[] args) {

        
        ret_data("");
    }

    public static List<to_encoding_confirmation> ret_data(String search) {
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
                    + ",ifnull(b_place,'')"
                    + ",ifnull(address,'')"
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
                    + " from encoding_confirmation where "
                    + " fname like'%" + search + "%' group by address"
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
                if (bapt_place.isEmpty() || bapt_place == null) {
//                    b_place = "";
                } else {
                    System.out.println(bapt_place);
                    String s1 = "insert into bapt_places("
                            //                            + "id"
                            + "place"
                            + ")values("
                            //                            + ":id"
                            + ":place"
                            + ")";
                    s1 = SqlStringUtil.parse(s1).
                            setString("place", b_place).
                            ok();
                    PreparedStatement stmt2 = conn.prepareStatement(s1);
                    stmt2.execute();
                    Lg.s(test1.class, "Successfully Added");
                }
                to_encoding_confirmation to = new to_encoding_confirmation(id, ref_no, date_added, user_name, fname, mi, lname, b_place, address, father, mother, b_day, conf_date, gender, book_no, page_no, index_no, priest, sponsors, remarks, bapt_date, bapt_place, 0);
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

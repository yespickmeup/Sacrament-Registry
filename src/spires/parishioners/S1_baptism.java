/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.parishioners;



import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import mijzcx.synapse.desk.utils.Lg;

/**
 *
 * @author Maytopacka
 */
public class S1_baptism {

    public static class to_parishioners_1 {
        public final String id;
        public final String date_of_baptism;
        public final int is_baptized;
        public final String bapt_place;
        public final String b_date;
        public final String b_book_no;
        public final int b_page_no;
        public final int b_index_no;
        public final String b_sponsors;
        public final String b_minister;
        public final String b_date_added;
        public final String b_remarks;

        public to_parishioners_1(String id,String date_of_baptism, int is_baptized, String bapt_place, String b_date, String b_book_no, int b_page_no, int b_index_no, String b_sponsors, String b_minister, String b_date_added, String b_remarks) {
            this.id=id;
            this.date_of_baptism = date_of_baptism;
            this.is_baptized = is_baptized;
            this.bapt_place = bapt_place;
            this.b_date = b_date;
            this.b_book_no = b_book_no;
            this.b_page_no = b_page_no;
            this.b_index_no = b_index_no;
            this.b_sponsors = b_sponsors;
            this.b_minister = b_minister;
            this.b_date_added = b_date_added;
            this.b_remarks = b_remarks;
        }
    }

    public static void edit_parishioners_1(to_parishioners_1 to_parishioners_1) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update parishioners_1 set "
                    + "date_of_baptism= '" + to_parishioners_1.date_of_baptism + "'"
                    + ",is_baptized= '" + to_parishioners_1.is_baptized + "'"
                    + ",bapt_place= '" + to_parishioners_1.bapt_place + "'"
                    + ",b_date= '" + to_parishioners_1.b_date + "'"
                    + ",b_book_no= '" + to_parishioners_1.b_book_no + "'"
                    + ",b_page_no= '" + to_parishioners_1.b_page_no + "'"
                    + ",b_index_no= '" + to_parishioners_1.b_index_no + "'"
                    + ",b_sponsors= '" + to_parishioners_1.b_sponsors + "'"
                    + ",b_minister= '" + to_parishioners_1.b_minister + "'"
                    + ",b_date_added= '" + to_parishioners_1.b_date_added + "'"
                    + ",b_remarks= '" + to_parishioners_1.b_remarks + "'"
                    + "where "
                    + " id ='" + to_parishioners_1.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_baptism.class, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
     public static void delete_parishioners_1(to_parishioners_1 to_parishioners_1) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update parishioners_1 set "
                    + "date_of_baptism= '" +"1500-01-01"+ "'"
                    + ",is_baptized= '" + "0" + "'"
                    + ",bapt_place= '" +"" + "'"
                    + ",b_date= '" + "1500-01-01"+ "'"
                    + ",b_book_no= '" + "0"+ "'"
                    + ",b_page_no= '" + "0"+ "'"
                    + ",b_index_no= '" + "0" + "'"
                    + ",b_sponsors= '" + ""+ "'"
                    + ",b_minister= '" + "" + "'"
                    + ",b_date_added= '" +"" + "'"
                    + ",b_remarks= '" + "" + "'"
                    + "where "
                    + " id ='" + to_parishioners_1.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_baptism.class, "Successfully Updated");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

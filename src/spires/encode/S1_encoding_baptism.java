/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode;

import spires.printing.Srpt_print_baptism;

import spires.util.DateType;
import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Ronald
 */
public class S1_encoding_baptism {

    public static void add_parishioners_1(Srpt_print_baptism.field to_parishioners_1) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into parishioners_1("
                    + "fname"
                    + ",mi"
                    + ",lname"
                    + ",date_of_baptism"
                    + ",date_of_birth"
                    + ",place_of_birth"
                    + ",father"
                    + ",mother"
                    + ",date_added"
                    + ",bapt_place"
                    + ",b_date"
                    + ",b_book_no"
                    + ",b_page_no"
                    + ",b_index_no"
                    + ",b_sponsors"
                    + ",b_minister"
                    + ",b_date_added"
                    + ",b_remarks"
                    + ",b_time"
                    + ")values("
                    + ":fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:date_of_baptism"
                    + ",:date_of_birth"
                    + ",:place_of_birth"
                    + ",:father"
                    + ",:mother"
                    + ",:date_added"
                    + ",:bapt_place"
                    + ",:b_date"
                    + ",:b_book_no"
                    + ",:b_page_no"
                    + ",:b_index_no"
                    + ",:b_sponsors"
                    + ",:b_minister"
                    + ",:b_date_added"
                    + ",:b_remarks"
                    + ",:b_time"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_parishioners_1.getFname())
                    .setString("mi", to_parishioners_1.getMname())
                    .setString("lname", to_parishioners_1.getLname())
                    .setString("date_of_baptism", to_parishioners_1.getBaptism_date())
                    .setString("date_of_birth", to_parishioners_1.getDate_of_birth())
                    .setString("place_of_birth", to_parishioners_1.getPlace_of_birth())
                    .setString("father", to_parishioners_1.getFather())
                    .setString("mother", to_parishioners_1.getMother())
                    .setString("date_added", DateType.datetime.format(new Date()))
                    .setString("bapt_place", to_parishioners_1.getPlace_of_baptism())
                    .setString("b_date", to_parishioners_1.getBaptism_date())
                    .setString("b_book_no", to_parishioners_1.getBook_no())
                    .setString("b_page_no", to_parishioners_1.getPage_no())
                    .setString("b_index_no", to_parishioners_1.getIndex_no())
                    .setString("b_sponsors", to_parishioners_1.getSponsors())
                    .setString("b_minister", to_parishioners_1.getPriest())
                    .setString("b_date_added", DateType.datetime.format(new Date()))
                    .setString("b_remarks", to_parishioners_1.getRemarks())
                    .setString("b_time", to_parishioners_1.getParish_priest())
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_baptism.class, "Successfully Added");
        } catch (SQLException e) {
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
            Lg.s(S1_encoding_baptism.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(Srpt_print_baptism.field to_parishioners_1) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update parishioners_1 set "
                    + "fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",date_of_baptism= :date_of_baptism "
                    + ",date_of_birth= :date_of_birth "
                    + ",place_of_birth= :place_of_birth "
                    + ",father= :father "
                    + ",mother= :mother "
                    + ",bapt_place= :bapt_place "
                    + ",b_date= :b_date "
                    + ",b_book_no= :b_book_no "
                    + ",b_page_no= :b_page_no "
                    + ",b_index_no= :b_index_no "
                    + ",b_sponsors= :b_sponsors "
                    + ",b_minister= :b_minister "
                    + ",b_remarks= :b_remarks "
                    + ",b_time= :b_time "
                    + " where id='" + to_parishioners_1.getId() + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_parishioners_1.getFname())
                    .setString("mi", to_parishioners_1.getMname())
                    .setString("lname", to_parishioners_1.getLname())
                    .setString("date_of_baptism", to_parishioners_1.getBaptism_date())
                    .setString("date_of_birth", to_parishioners_1.getDate_of_birth())
                    .setString("place_of_birth", to_parishioners_1.getPlace_of_birth())
                    .setString("father", to_parishioners_1.getFather())
                    .setString("mother", to_parishioners_1.getMother())
                    .setString("bapt_place", to_parishioners_1.getPlace_of_baptism())
                    .setString("b_date", to_parishioners_1.getBaptism_date())
                    .setString("b_book_no", to_parishioners_1.getBook_no())
                    .setString("b_page_no", to_parishioners_1.getPage_no())
                    .setString("b_index_no", to_parishioners_1.getIndex_no())
                    .setString("b_sponsors", to_parishioners_1.getSponsors())
                    .setString("b_minister", to_parishioners_1.getPriest())
                    .setString("b_remarks", to_parishioners_1.getRemarks())
                    .setString("b_time", to_parishioners_1.getParish_priest())
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_baptism.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

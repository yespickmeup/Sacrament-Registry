/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.confirmation_records;

import spires.encode.S1_encoding_confirmation;
import spires.printing.Srpt_print_confirmation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import spires.users.Res;
import spires.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Confirmation_records {

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

    public static void edit_encoding_confirmation2(Srpt_print_confirmation.field to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update encoding_confirmation set "
                    + "fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",b_place= :b_place "
                    + ",father= :father "
                    + ",mother= :mother "
                    + ",b_day= :b_day "
                    + ",conf_date= :conf_date "
                    + ",book_no= :book_no "
                    + ",page_no= :page_no "
                    + ",index_no= :index_no "
                    + ",priest= :priest "
                    + ",sponsors= :sponsors "
                    + ",remarks= :remarks "
                    + ",bapt_date= :bapt_date "
                    + ",bapt_place= :bapt_place "
                    + " where id='" + to_encoding_confirmation.getId() + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_encoding_confirmation.getFname())
                    .setString("mi", to_encoding_confirmation.getMname())
                    .setString("lname", to_encoding_confirmation.getLname())
                    .setString("b_place", to_encoding_confirmation.getPlace_of_birth())
                    .setString("father", to_encoding_confirmation.getFather())
                    .setString("mother", to_encoding_confirmation.getMother())
                    .setString("b_day", to_encoding_confirmation.getDate_of_birth())
                    .setString("conf_date", to_encoding_confirmation.getConfirmation_date())
                    .setString("book_no", to_encoding_confirmation.getBook_no())
                    .setString("page_no", to_encoding_confirmation.getPage_no())
                    .setString("index_no", to_encoding_confirmation.getIndex_no())
                    .setString("priest", to_encoding_confirmation.getPriest())
                    .setString("sponsors", to_encoding_confirmation.getSponsors())
                    .setString("remarks", to_encoding_confirmation.getRemarks())
                    .setString("bapt_date", to_encoding_confirmation.getBaptism_date())
                    .setString("bapt_place", to_encoding_confirmation.getPlace_of_baptism())
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

    public static void delete_data(Srpt_print_confirmation.field to_encoding_confirmation) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_confirmation  "
                    + " where id='" + to_encoding_confirmation.getId() + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Confirmation_records.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

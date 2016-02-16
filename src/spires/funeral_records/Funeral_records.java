/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.funeral_records;

import spires.encode.S1_encoding_funeral2;
import spires.printing.Srpt_print_funeral;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import spires.users.Res;
import spires.users.Users.to_users;
import spires.util.DateType;
import spires.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Funeral_records {

    public static void add_encoding_funeral2(Srpt_print_funeral.field to_encoding_funeral2) {
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
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("index_no", to_encoding_funeral2.getIndex_no())
                    .setString("book_no", to_encoding_funeral2.getBook_no())
                    .setString("page_no", to_encoding_funeral2.getPage_no())
                    .setString("date_of_burial", to_encoding_funeral2.getDate_of_burial())
                    .setString("priest", to_encoding_funeral2.getPrice())
                    .setString("fname", to_encoding_funeral2.getFname())
                    .setString("mi", to_encoding_funeral2.getMi())
                    .setString("lname", to_encoding_funeral2.getLname())
                    .setString("residence", to_encoding_funeral2.getResidence())
                    .setString("informant", to_encoding_funeral2.getInformant())
                    .setString("date_added", DateType.datetime.format(new Date()))
                    .setString("user_name", Res.getUser_name())
                    .setString("remarks", to_encoding_funeral2.getRemarks())
                    .setString("date_of_burial2", to_encoding_funeral2.getDate_of_death())
                    .ok();
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_encoding_funeral2.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(Srpt_print_funeral.field to_encoding_funeral2) {
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
                    + " where id='" + to_encoding_funeral2.getId() + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("index_no", to_encoding_funeral2.getIndex_no())
                    .setString("book_no", to_encoding_funeral2.getBook_no())
                    .setString("page_no", to_encoding_funeral2.getPage_no())
                    .setString("date_of_burial", to_encoding_funeral2.getDate_of_burial())
                    .setString("priest", to_encoding_funeral2.getPrice())
                    .setString("fname", to_encoding_funeral2.getFname())
                    .setString("mi", to_encoding_funeral2.getMi())
                    .setString("lname", to_encoding_funeral2.getLname())
                    .setString("residence", to_encoding_funeral2.getResidence())
                    .setString("informant", to_encoding_funeral2.getInformant())
                    .setString("date_added", DateType.datetime.format(new Date()))
                    .setString("user_name", Res.getUser_name())
                    .setString("remarks", to_encoding_funeral2.getRemarks())
                    .setString("date_of_burial2", to_encoding_funeral2.getDate_of_death())
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Funeral_records.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(Srpt_print_funeral.field to_encoding_funeral2) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from encoding_funeral2  "
                    + " where id='" + to_encoding_funeral2.getId() + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Funeral_records.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

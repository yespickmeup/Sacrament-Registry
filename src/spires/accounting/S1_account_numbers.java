/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.accounting;

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
public class S1_account_numbers {

    public static class to_account_numbers {

        public final int id;
        public final String description;
        public final String account_no;
        public final int status;

        public to_account_numbers(int id, String description, String account_no, int status) {
            this.id = id;
            this.description = description;
            this.account_no = account_no;
            this.status = status;
        }
    }

    public static void add_account_numbers(to_account_numbers to_account_numbers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into account_numbers("
                    + "description"
                    + ",account_no"
                    + ",status"
                    + ")values("
                    + ":description"
                    + ",:account_no"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("description", to_account_numbers.description)
                    .setString("account_no", to_account_numbers.account_no)
                    .setNumber("status", to_account_numbers.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_numbers.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_account_numbers(to_account_numbers to_account_numbers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update account_numbers set "
                    + "description= :description"
                    + ",account_no= :account_no"
                    + ",status= :status"
                    + " where "
                    + " id ='" + to_account_numbers.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("description", to_account_numbers.description)
                    .setString("account_no", to_account_numbers.account_no)
                    .setNumber("status", to_account_numbers.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_numbers.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_account_numbers(to_account_numbers to_account_numbers) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_numbers where "
                    + " id ='" + to_account_numbers.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_numbers.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_numbers> ret_data(String where) {
        List<to_account_numbers> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",description"
                    + ",account_no"
                    + ",status"
                    + " from account_numbers  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String description = rs.getString(2);
                String account_no = rs.getString(3);
                int status = rs.getInt(4);

                to_account_numbers to = new to_account_numbers(id, description, account_no, status);
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

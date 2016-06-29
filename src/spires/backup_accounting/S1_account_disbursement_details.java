/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.backup_accounting;

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
public class S1_account_disbursement_details {

    public static class to_account_disbursement_details {

        public final int id;
        public final String account_disbursement_id;
        public final String account_disbursement;
        public final String detail;
        public final int status;

        public to_account_disbursement_details(int id, String account_disbursement_id, String account_disbursement, String detail, int status) {
            this.id = id;
            this.account_disbursement_id = account_disbursement_id;
            this.account_disbursement = account_disbursement;
            this.detail = detail;
            this.status = status;
        }
    }

    public static void add_account_disbursement_details(to_account_disbursement_details to_account_disbursement_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into account_disbursement_details("
                    + "account_disbursement_id"
                    + ",account_disbursement"
                    + ",detail"
                    + ",status"
                    + ")values("
                    + ":account_disbursement_id"
                    + ",:account_disbursement"
                    + ",:detail"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account_disbursement_id", to_account_disbursement_details.account_disbursement_id)
                    .setString("account_disbursement", to_account_disbursement_details.account_disbursement)
                    .setString("detail", to_account_disbursement_details.detail)
                    .setNumber("status", to_account_disbursement_details.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disbursement_details.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_account_disbursement_details(to_account_disbursement_details to_account_disbursement_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update account_disbursement_details set "
                    + "account_disbursement_id= :account_disbursement_id"
                    + ",account_disbursement= :account_disbursement"
                    + ",detail= :detail"
                    + ",status= :status"
                    + " where "
                    + " id ='" + to_account_disbursement_details.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account_disbursement_id", to_account_disbursement_details.account_disbursement_id)
                    .setString("account_disbursement", to_account_disbursement_details.account_disbursement)
                    .setString("detail", to_account_disbursement_details.detail)
                    .setNumber("status", to_account_disbursement_details.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disbursement_details.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_account_disbursement_details(to_account_disbursement_details to_account_disbursement_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_disbursement_details where "
                    + " id ='" + to_account_disbursement_details.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disbursement_details.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_disbursement_details> ret_data(String where) {
        List<to_account_disbursement_details> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",account_disbursement_id"
                    + ",account_disbursement"
                    + ",detail"
                    + ",status"
                    + " from account_disbursement_details  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String account_disbursement_id = rs.getString(2);
                String account_disbursement = rs.getString(3);
                String detail = rs.getString(4);
                int status = rs.getInt(5);

                to_account_disbursement_details to = new to_account_disbursement_details(id, account_disbursement_id, account_disbursement, detail, status);
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

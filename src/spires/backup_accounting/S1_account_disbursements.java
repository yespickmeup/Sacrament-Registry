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
public class S1_account_disbursements {

    public static class to_account_disbursements {

        public final int id;
        public final String particular;
        public final int status;

        public to_account_disbursements(int id, String particular, int status) {
            this.id = id;
            this.particular = particular;
            this.status = status;
        }
    }

    public static void add_account_disbursements(to_account_disbursements to_account_disbursements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into account_disbursements("
                    + "particular"
                    + ",status"
                    + ")values("
                    + ":particular"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("particular", to_account_disbursements.particular)
                    .setNumber("status", to_account_disbursements.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disbursements.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_account_disbursements(to_account_disbursements to_account_disbursements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update account_disbursements set "
                    + "particular= :particular"
                    + ",status= :status"
                    + " where "
                    + " id ='" + to_account_disbursements.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("particular", to_account_disbursements.particular)
                    .setNumber("status", to_account_disbursements.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disbursements.class, "Successfully Updated");

            String s2 = "update account_disbursement_details set "
                    + "account_disbursement= :account_disbursement"
                    + " where "
                    + " account_disbursement_id ='" + to_account_disbursements.id + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setString("account_disbursement", to_account_disbursements.particular)
                    .ok();

            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(S1_account_disbursement_details.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_account_disbursements(to_account_disbursements to_account_disbursements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_disbursements where "
                    + " id ='" + to_account_disbursements.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disbursements.class, "Successfully Deleted");

            String s2 = "delete from account_disbursement_details where "
                    + " account_disbursement_id ='" + to_account_disbursements.id + "' "
                    + " ";

            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(S1_account_disbursement_details.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_disbursements> ret_data(String where) {
        List<to_account_disbursements> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",particular"
                    + ",status"
                    + " from account_disbursements  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String particular = rs.getString(2);
                int status = rs.getInt(3);

                to_account_disbursements to = new to_account_disbursements(id, particular, status);
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

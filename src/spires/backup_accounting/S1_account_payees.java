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
public class S1_account_payees {

    public static class to_account_payees {

        public final int id;
        public final String payee;

        public to_account_payees(int id, String payee) {
            this.id = id;
            this.payee = payee;
        }
    }

    public static void add_account_payees(to_account_payees to_account_payees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into account_payees("
                    + "payee"
                    + ")values("
                    + ":payee"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("payee", to_account_payees.payee)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_payees.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_account_payees(to_account_payees to_account_payees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update account_payees set "
                    + "payee= :payee"
                    + " where "
                    + " id ='" + to_account_payees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("payee", to_account_payees.payee)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_payees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_account_payees(to_account_payees to_account_payees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_payees where "
                    + " id ='" + to_account_payees.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_payees.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_payees> ret_data(String where) {
        List<to_account_payees> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",payee"
                    + " from account_payees  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String payee = rs.getString(2);

                to_account_payees to = new to_account_payees(id, payee);
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

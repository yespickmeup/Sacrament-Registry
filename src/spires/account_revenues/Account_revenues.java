/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.account_revenues;

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
public class Account_revenues {

    public static class to_account_revenues {

        public final int id;
        public final String revenue;
        public final int status;

        public to_account_revenues(int id, String revenue, int status) {
            this.id = id;
            this.revenue = revenue;
            this.status = status;
        }
    }

    public static void add_data(to_account_revenues to_account_revenues) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into account_revenues("
                    + "revenue"
                    + ",status"
                    + ")values("
                    + ":revenue"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("revenue", to_account_revenues.revenue)
                    .setNumber("status", to_account_revenues.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Account_revenues.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_account_revenues to_account_revenues) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update account_revenues set "
                    + "revenue= :revenue "
                    + ",status= :status "
                    + " where id='" + to_account_revenues.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("revenue", to_account_revenues.revenue)
                    .setNumber("status", to_account_revenues.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s2 = "update cashiering set "
                    + " accounting_account_type= :accounting_account_type "
                    + " where accounting_account_type_id='" + to_account_revenues.id + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setString("accounting_account_type", to_account_revenues.revenue)
                    .ok();
            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();

            String s3 = "update cashiering_types set "
                    + " accounting_account_type= :accounting_account_type "
                    + " where accounting_account_type_id='" + to_account_revenues.id + "' "
                    + " ";

            s3 = SqlStringUtil.parse(s3)
                    .setString("accounting_account_type", to_account_revenues.revenue)
                    .ok();

            PreparedStatement stmt3 = conn.prepareStatement(s3);
            stmt3.execute();

            Lg.s(Account_revenues.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_account_revenues to_account_revenues) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_revenues  "
                    + " where id='" + to_account_revenues.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Account_revenues.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_revenues> ret_data(String where) {
        List<to_account_revenues> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",revenue"
                    + ",status"
                    + " from account_revenues"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String revenue = rs.getString(2);
                int status = rs.getInt(3);

                to_account_revenues to = new to_account_revenues(id, revenue, status);
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

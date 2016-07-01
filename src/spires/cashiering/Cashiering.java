/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.cashiering;

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
public class Cashiering {

    public static class to_cashiering {

        public final int id;
        public final String account;
        public final double rate;
        public final int is_active;
        public final String fix_rate;
        public final int incremental;
        public final String accounting_group_id;
        public final String accounting_group_name;
        public final String accounting_account_id;
        public final String accounting_account_name;
        public final String accounting_account_type;
        public final String accounting_account_type_id;

        public to_cashiering(int id, String account, double rate, int is_active, String fix_rate, int incremental, String accounting_group_id, String accounting_group_name, String accounting_account_id, String accounting_account_name, String accounting_account_type, String accounting_account_type_id) {
            this.id = id;
            this.account = account;
            this.rate = rate;
            this.is_active = is_active;
            this.fix_rate = fix_rate;
            this.incremental = incremental;
            this.accounting_group_id = accounting_group_id;
            this.accounting_group_name = accounting_group_name;
            this.accounting_account_id = accounting_account_id;
            this.accounting_account_name = accounting_account_name;
            this.accounting_account_type = accounting_account_type;
            this.accounting_account_type_id = accounting_account_type_id;
        }
    }

    public static void add_data(to_cashiering to_cashiering) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into cashiering("
                    + "account"
                    + ",rate"
                    + ",is_active"
                    + ",fix_rate"
                    + ",incremental"
                    + ",accounting_group_id"
                    + ",accounting_group_name"
                    + ",accounting_account_id"
                    + ",accounting_account_name"
                    + ",accounting_account_type"
                    + ",accounting_account_type_id"
                    + ")values("
                    + ":account"
                    + ",:rate"
                    + ",:is_active"
                    + ",:fix_rate"
                    + ",:incremental"
                    + ",:accounting_group_id"
                    + ",:accounting_group_name"
                    + ",:accounting_account_id"
                    + ",:accounting_account_name"
                    + ",:accounting_account_type"
                    + ",:accounting_account_type_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account", to_cashiering.account)
                    .setNumber("rate", to_cashiering.rate)
                    .setNumber("is_active", to_cashiering.is_active)
                    .setString("fix_rate", to_cashiering.fix_rate)
                    .setNumber("incremental", to_cashiering.incremental)
                    .setString("accounting_group_id", to_cashiering.accounting_group_id)
                    .setString("accounting_group_name", to_cashiering.accounting_group_name)
                    .setString("accounting_account_id", to_cashiering.accounting_account_id)
                    .setString("accounting_account_name", to_cashiering.accounting_account_name)
                    .setString("accounting_account_type", to_cashiering.accounting_account_type)
                    .setString("accounting_account_type_id", to_cashiering.accounting_account_type_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cashiering.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_cashiering to_cashiering) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cashiering set "
                    + "account= :account "
                    + ",rate= :rate "
                    + ",is_active= :is_active "
                    + ",fix_rate= :fix_rate "
                    + ",incremental= :incremental "
                    + ",accounting_group_id= :accounting_group_id "
                    + ",accounting_group_name= :accounting_group_name "
                    + ",accounting_account_id= :accounting_account_id "
                    + ",accounting_account_name= :accounting_account_name "
                    + ",accounting_account_type= :accounting_account_type "
                    + ",accounting_account_type_id= :accounting_account_type_id "
                    + " where id='" + to_cashiering.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account", to_cashiering.account)
                    .setNumber("rate", to_cashiering.rate)
                    .setNumber("is_active", to_cashiering.is_active)
                    .setString("fix_rate", to_cashiering.fix_rate)
                    .setNumber("incremental", to_cashiering.incremental)
                    .setString("accounting_group_id", to_cashiering.accounting_group_id)
                    .setString("accounting_group_name", to_cashiering.accounting_group_name)
                    .setString("accounting_account_id", to_cashiering.accounting_account_id)
                    .setString("accounting_account_name", to_cashiering.accounting_account_name)
                    .setString("accounting_account_type", to_cashiering.accounting_account_type)
                    .setString("accounting_account_type_id", to_cashiering.accounting_account_type_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cashiering.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_cashiering to_cashiering) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cashiering  "
                    + " where id='" + to_cashiering.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cashiering.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cashiering> ret_data(String where) {
        List<to_cashiering> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",account"
                    + ",rate"
                    + ",is_active"
                    + ",fix_rate"
                    + ",incremental"
                    + ",accounting_group_id"
                    + ",accounting_group_name"
                    + ",accounting_account_id"
                    + ",accounting_account_name"
                    + ",accounting_account_type"
                    + ",accounting_account_type_id"
                    + " from cashiering"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String account = rs.getString(2);
                double rate = rs.getDouble(3);
                int is_active = rs.getInt(4);
                String fix_rate = rs.getString(5);
                int incremental = rs.getInt(6);
                String accounting_group_id = rs.getString(7);
                String accounting_group_name = rs.getString(8);
                String accounting_account_id = rs.getString(9);
                String accounting_account_name = rs.getString(10);
                String accounting_account_type = rs.getString(11);
                String accounting_account_type_id = rs.getString(12);

                to_cashiering to = new to_cashiering(id, account, rate, is_active, fix_rate, incremental, accounting_group_id, accounting_group_name, accounting_account_id, accounting_account_name, accounting_account_type, accounting_account_type_id);
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

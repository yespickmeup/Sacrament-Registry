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
public class S1_cashiering_types {

    public static class to_cashiering_types {

        public final int id;
        public final String account_id;
        public final String account;
        public final String cashiering_type;
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

        public to_cashiering_types(int id, String account_id, String account, String cashiering_type, double rate, int is_active, String fix_rate, int incremental, String accounting_group_id, String accounting_group_name, String accounting_account_id, String accounting_account_name, String accounting_account_type, String accounting_account_type_id) {
            this.id = id;
            this.account_id = account_id;
            this.account = account;
            this.cashiering_type = cashiering_type;
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

    public static void add_cashiering_types(to_cashiering_types to_cashiering_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into cashiering_types("
                    + "account_id"
                    + ",account"
                    + ",cashiering_type"
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
                    + ":account_id"
                    + ",:account"
                    + ",:cashiering_type"
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
                    .setString("account_id", to_cashiering_types.account_id)
                    .setString("account", to_cashiering_types.account)
                    .setString("cashiering_type", to_cashiering_types.cashiering_type)
                    .setNumber("rate", to_cashiering_types.rate)
                    .setNumber("is_active", to_cashiering_types.is_active)
                    .setString("fix_rate", to_cashiering_types.fix_rate)
                    .setNumber("incremental", to_cashiering_types.incremental)
                    .setString("accounting_group_id", to_cashiering_types.accounting_group_id)
                    .setString("accounting_group_name", to_cashiering_types.accounting_group_name)
                    .setString("accounting_account_id", to_cashiering_types.accounting_account_id)
                    .setString("accounting_account_name", to_cashiering_types.accounting_account_name)
                    .setString("accounting_account_type", to_cashiering_types.accounting_account_type)
                    .setString("accounting_account_type_id", to_cashiering_types.accounting_account_type_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cashiering_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_cashiering_types(to_cashiering_types to_cashiering_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cashiering_types set "
                    + "account_id= :account_id"
                    + ",account= :account"
                    + ",cashiering_type= :cashiering_type"
                    + ",rate= :rate"
                    + ",is_active= :is_active"
                    + ",fix_rate= :fix_rate"
                    + ",incremental= :incremental"
                    + ",accounting_group_id= :accounting_group_id"
                    + ",accounting_group_name= :accounting_group_name"
                    + ",accounting_account_id= :accounting_account_id"
                    + ",accounting_account_name= :accounting_account_name"
                    + ",accounting_account_type= :accounting_account_type"
                    + ",accounting_account_type_id= :accounting_account_type_id"
                    + " where "
                    + " id ='" + to_cashiering_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("account_id", to_cashiering_types.account_id)
                    .setString("account", to_cashiering_types.account)
                    .setString("cashiering_type", to_cashiering_types.cashiering_type)
                    .setNumber("rate", to_cashiering_types.rate)
                    .setNumber("is_active", to_cashiering_types.is_active)
                    .setString("fix_rate", to_cashiering_types.fix_rate)
                    .setNumber("incremental", to_cashiering_types.incremental)
                    .setString("accounting_group_id", to_cashiering_types.accounting_group_id)
                    .setString("accounting_group_name", to_cashiering_types.accounting_group_name)
                    .setString("accounting_account_id", to_cashiering_types.accounting_account_id)
                    .setString("accounting_account_name", to_cashiering_types.accounting_account_name)
                    .setString("accounting_account_type", to_cashiering_types.accounting_account_type)
                    .setString("accounting_account_type_id", to_cashiering_types.accounting_account_type_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cashiering_types.class, "Successfully Updated");

           

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_cashiering_types(to_cashiering_types to_cashiering_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cashiering_types where "
                    + " id ='" + to_cashiering_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cashiering_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cashiering_types> ret_data(String where) {
        List<to_cashiering_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",account_id"
                    + ",account"
                    + ",cashiering_type"
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
                    + " from cashiering_types  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String account_id = rs.getString(2);
                String account = rs.getString(3);
                String cashiering_type = rs.getString(4);
                double rate = rs.getDouble(5);
                int is_active = rs.getInt(6);
                String fix_rate = rs.getString(7);
                int incremental = rs.getInt(8);
                String accounting_group_id = rs.getString(9);
                String accounting_group_name = rs.getString(10);
                String accounting_account_id = rs.getString(11);
                String accounting_account_name = rs.getString(12);
                String accounting_account_type = rs.getString(13);
                String accounting_account_type_id = rs.getString(14);

                to_cashiering_types to = new to_cashiering_types(id, account_id, account, cashiering_type, rate, is_active, fix_rate, incremental, accounting_group_id, accounting_group_name, accounting_account_id, accounting_account_name, accounting_account_type, accounting_account_type_id);
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

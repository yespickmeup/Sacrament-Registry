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
public class S1_cashiering {

    public static class to_cashiering {

        public final int id;
        public final String account;
        public final double rate;
        public final int is_active;
        public final int parent;
        public int size;
        public final String account_id;
        public final String account_name;
        public final String account_type;
        public final String account_type_id;
        public final String fix_rate;
        public final int incremental;
        public final String accounting_group_id;
        public final String accounting_group_name;
        public final String accounting_account_id;
        public final String accounting_account_name;
        public final String accounting_account_type;
        public final String accounting_account_type_id;

        public to_cashiering(int id, String account, double rate, int is_active, int parent, int size, String account_id, String account_name, String account_type, String account_type_id, String fix_rate, int incremental, String accounting_group_id, String accounting_group_name, String accounting_account_id, String accounting_account_name, String accounting_account_type, String accounting_account_type_id) {
            this.id = id;
            this.account = account;
            this.rate = rate;
            this.is_active = is_active;
            this.parent = parent;
            this.size = size;
            this.account_id = account_id;
            this.account_name = account_name;
            this.account_type = account_type;
            this.account_type_id = account_type_id;
            this.fix_rate = fix_rate;
            this.incremental = incremental;
            this.accounting_group_id = accounting_group_id;
            this.accounting_group_name = accounting_group_name;
            this.accounting_account_id = accounting_account_id;
            this.accounting_account_name = accounting_account_name;
            this.accounting_account_type = accounting_account_type;
            this.accounting_account_type_id = accounting_account_type_id;

        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

    }

    public static void add_cashiering(to_cashiering to_cashiering) {
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
            Lg.s(S1_cashiering.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_cashiering(to_cashiering to_cashiering) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cashiering set "
                    + "account= :account"
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
                    + " id ='" + to_cashiering.id + "' "
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
            Lg.s(S1_cashiering.class, "Successfully Updated");

            String s2 = "update cashiering_types set "
                    + "account_id= :account_id"
                    + ",account= :account"
                    + ",accounting_account_id= :accounting_account_id"
                    + ",accounting_account_name= :accounting_account_name"
                    + ",accounting_account_type= :accounting_account_type"
                    + ",accounting_account_type_id= :accounting_account_type_id"
                    + " where "
                    + " account_id ='" + to_cashiering.id + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setNumber("account_id", to_cashiering.id)
                    .setString("account", to_cashiering.account)
                    .setString("accounting_account_id", to_cashiering.accounting_account_id)
                    .setString("accounting_account_name", to_cashiering.accounting_account_name)
                    .setString("accounting_account_type", to_cashiering.accounting_account_type)
                    .setString("accounting_account_type_id", to_cashiering.accounting_account_type_id)
                    .ok();

            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(S1_cashiering_types.class, "Successfully Updated");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_cashiering(to_cashiering to_cashiering) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cashiering where "
                    + " id ='" + to_cashiering.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_cashiering.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cashiering> ret_data(String acc_id) {
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
                    + " from cashiering  "
                    + " where is_active='" + "1" + "' order by account asc";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);

            while (rs.next()) {
                int id = rs.getInt(1);
                String account = rs.getString(2);
                double rate = rs.getDouble(3);
                int is_active = rs.getInt(4);
                String fix_rate = rs.getString(5);
                int size = 0;
                int incremental = rs.getInt(6);
                String accounting_group_id = rs.getString(7);
                String accounting_group_name = rs.getString(8);
                String accounting_account_id = rs.getString(9);
                String accounting_account_name = rs.getString(10);
                String accounting_account_type = rs.getString(11);
                String accounting_account_type_id = rs.getString(12);

                to_cashiering to = new to_cashiering(id, account, rate, is_active, 1, 0, "", "", "", "", fix_rate, incremental, accounting_group_id, accounting_group_name, accounting_account_id, accounting_account_name, accounting_account_type, accounting_account_type_id);
                datas.add(to);

                if (acc_id.equals("" + id)) {
                    String s2 = "select "
                            + "id"
                            + ",account_id"
                            + ",account"
                            + ",cashiering_type"
                            + ",rate"
                            + ",is_active"
                            + ",fix_rate"
                            + ",incremental"
                            + " from cashiering_types where "
                            + " account_id ='" + id + "' and is_active ='" + "1" + "' order by cashiering_type asc"
                            + " ";

                    Statement stmt2 = conn.createStatement();
                    ResultSet rs2 = stmt2.executeQuery(s2);
                    while (rs2.next()) {
                        int id2 = rs2.getInt(1);
                        String account_id = rs2.getString(2);
                        String account2 = rs2.getString(3);
                        String cashiering_type = rs2.getString(4);
                        double rate2 = rs2.getDouble(5);
                        int is_active2 = rs2.getInt(6);
                        String fix_rate2 = rs2.getString(7);
                        int incremental1 = rs2.getInt(8);
                        to_cashiering to2 = new to_cashiering(id2, cashiering_type, rate2, is_active, 0, 0, "" + id
                                , account, cashiering_type, "" + id2, fix_rate2, incremental1, accounting_group_id
                                , accounting_group_name, accounting_account_id, accounting_account_name, accounting_account_type, accounting_account_type_id);
                        datas.add(to2);
                        size++;
                    }
                    to.setSize(size);
                }

            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cashiering> ret_data2(String where) {
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
                    + " from cashiering  "
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
                to_cashiering to = new to_cashiering(id, account, rate, is_active, 1, 0, "", "", "", "", fix_rate
                        , incremental, accounting_group_id, accounting_group_name, accounting_account_id
                        , accounting_account_name, accounting_account_type, accounting_account_type_id);
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

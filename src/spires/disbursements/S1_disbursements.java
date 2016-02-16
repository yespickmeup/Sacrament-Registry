/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.disbursements;

import spires.accounting.S1_account_disburses;
import spires.util.MyConnection;
import spires.util.MyDate;
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
public class S1_disbursements {

    public static class to_cash_drawer_expenses {

        public final int id;
        public final String session_no;
        public final String user_name;
        public final String screen_name;
        public final String time_in;
        public final String time_out;
        public final String bank;
        public final String check_no;
        public final String check_holder;
        public final double amount;
        public final String date_added;
        public final String account_no_id;
        public final String account_no;
        public final String account_type;
        public final String account_type_id;
        public final String account_type_particular;
        public final String account_type_particular_id;
        public final String group_id;
        public final String group_name;

        public to_cash_drawer_expenses(int id, String session_no, String user_name, String screen_name, String time_in, String time_out, String bank, String check_no, String check_holder, double amount, String date_added, String account_no_id, String account_no, String account_type, String account_type_id, String account_type_particular, String account_type_particular_id, String group_id, String group_name) {
            this.id = id;
            this.session_no = session_no;
            this.user_name = user_name;
            this.screen_name = screen_name;
            this.time_in = time_in;
            this.time_out = time_out;
            this.bank = bank;
            this.check_no = check_no;
            this.check_holder = check_holder;
            this.amount = amount;
            this.date_added = date_added;
            this.account_no_id = account_no_id;
            this.account_no = account_no;
            this.account_type = account_type;
            this.account_type_id = account_type_id;
            this.account_type_particular = account_type_particular;
            this.account_type_particular_id = account_type_particular_id;
            this.group_id = group_id;
            this.group_name = group_name;
        }
    }

    public static void add_cash_drawer_expenses(to_cash_drawer_expenses to_cash_drawer_expenses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into cash_drawer_expenses("
                    + "session_no"
                    + ",user_name"
                    + ",screen_name"
                    + ",time_in"
                    + ",time_out"
                    + ",bank"
                    + ",check_no"
                    + ",check_holder"
                    + ",amount"
                    + ",date_added"
                    + ",account_no_id"
                    + ",account_no"
                    + ",account_type"
                    + ",account_type_id"
                    + ",account_type_particular"
                    + ",account_type_particular_id"
                    + ",group_id"
                    + ",group_name"
                    + ")values("
                    + ":session_no"
                    + ",:user_name"
                    + ",:screen_name"
                    + ",:time_in"
                    + ",:time_out"
                    + ",:bank"
                    + ",:check_no"
                    + ",:check_holder"
                    + ",:amount"
                    + ",:date_added"
                    + ",:account_no_id"
                    + ",:account_no"
                    + ",:account_type"
                    + ",:account_type_id"
                    + ",:account_type_particular"
                    + ",:account_type_particular_id"
                    + ",:group_id"
                    + ",:group_name"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("session_no", to_cash_drawer_expenses.session_no)
                    .setString("user_name", to_cash_drawer_expenses.user_name)
                    .setString("screen_name", to_cash_drawer_expenses.screen_name)
                    .setString("time_in", to_cash_drawer_expenses.time_in)
                    .setString("time_out", to_cash_drawer_expenses.time_out)
                    .setString("bank", to_cash_drawer_expenses.bank)
                    .setString("check_no", to_cash_drawer_expenses.check_no)
                    .setString("check_holder", to_cash_drawer_expenses.check_holder)
                    .setNumber("amount", to_cash_drawer_expenses.amount)
                    .setString("date_added", to_cash_drawer_expenses.date_added)
                    .setString("account_no_id", to_cash_drawer_expenses.account_no_id)
                    .setString("account_no", to_cash_drawer_expenses.account_no)
                    .setString("account_type", to_cash_drawer_expenses.account_type)
                    .setString("account_type_id", to_cash_drawer_expenses.account_type_id)
                    .setString("account_type_particular", to_cash_drawer_expenses.account_type_particular)
                    .setString("account_type_particular_id", to_cash_drawer_expenses.account_type_particular_id)
                    .setString("group_id", to_cash_drawer_expenses.group_id)
                    .setString("group_name", to_cash_drawer_expenses.group_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_disbursements.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_cash_drawer_expenses(to_cash_drawer_expenses to_cash_drawer_expenses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cash_drawer_expenses set "
                    + "session_no= :session_no"
                    + ",user_name= :user_name"
                    + ",screen_name= :screen_name"
                    + ",time_in= :time_in"
                    + ",time_out= :time_out"
                    + ",bank= :bank"
                    + ",check_no= :check_no"
                    + ",check_holder= :check_holder"
                    + ",amount= :amount"
                    + ",date_added= :date_added"
                    + ",account_no_id= :account_no_id"
                    + ",account_no= :account_no"
                    + ",account_type= :account_type"
                    + ",account_type_id= :account_type_id"
                    + ",account_type_particular= :account_type_particular"
                    + ",account_type_particular_id= :account_type_particular_id"
                    + ",group_id= :group_id"
                    + ",group_name= :group_name"
                    + " where "
                    + " id ='" + to_cash_drawer_expenses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("session_no", to_cash_drawer_expenses.session_no)
                    .setString("user_name", to_cash_drawer_expenses.user_name)
                    .setString("screen_name", to_cash_drawer_expenses.screen_name)
                    .setString("time_in", to_cash_drawer_expenses.time_in)
                    .setString("time_out", to_cash_drawer_expenses.time_out)
                    .setString("bank", to_cash_drawer_expenses.bank)
                    .setString("check_no", to_cash_drawer_expenses.check_no)
                    .setString("check_holder", to_cash_drawer_expenses.check_holder)
                    .setNumber("amount", to_cash_drawer_expenses.amount)
                    .setString("date_added", to_cash_drawer_expenses.date_added)
                    .setString("account_no_id", to_cash_drawer_expenses.account_no_id)
                    .setString("account_no", to_cash_drawer_expenses.account_no)
                    .setString("account_type", to_cash_drawer_expenses.account_type)
                    .setString("account_type_id", to_cash_drawer_expenses.account_type_id)
                    .setString("account_type_particular", to_cash_drawer_expenses.account_type_particular)
                    .setString("account_type_particular_id", to_cash_drawer_expenses.account_type_particular_id)
                    .setString("group_id", to_cash_drawer_expenses.group_id)
                    .setString("group_name", to_cash_drawer_expenses.group_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_disbursements.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_cash_drawer_expenses(to_cash_drawer_expenses to_cash_drawer_expenses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cash_drawer_expenses where "
                    + " id ='" + to_cash_drawer_expenses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_disbursements.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_cash_drawer_expenses> ret_data(String where) {
        List<to_cash_drawer_expenses> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",session_no"
                    + ",user_name"
                    + ",screen_name"
                    + ",time_in"
                    + ",time_out"
                    + ",bank"
                    + ",check_no"
                    + ",check_holder"
                    + ",amount"
                    + ",date_added"
                    + ",account_no_id"
                    + ",account_no"
                    + ",account_type"
                    + ",account_type_id"
                    + ",account_type_particular"
                    + ",account_type_particular_id"
                    + ",group_id"
                    + ",group_name"
                    + " from cash_drawer_expenses  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String session_no = rs.getString(2);
                String user_name = rs.getString(3);
                String screen_name = rs.getString(4);
                String time_in = rs.getString(5);
                String time_out = rs.getString(6);
                String bank = rs.getString(7);
                String check_no = rs.getString(8);
                String check_holder = rs.getString(9);
                double amount = rs.getDouble(10);
                String date_added = rs.getString(11);
                String account_no_id = rs.getString(12);
                String account_no = rs.getString(13);
                String account_type = rs.getString(14);
                String account_type_id = rs.getString(15);
                String account_type_particular = rs.getString(16);
                String account_type_particular_id = rs.getString(17);
                String group_id = rs.getString(18);
                String group_name = rs.getString(19);

                to_cash_drawer_expenses to = new to_cash_drawer_expenses(id, session_no, user_name, screen_name, time_in, time_out, bank, check_no, check_holder, amount, date_added, account_no_id, account_no, account_type, account_type_id, account_type_particular, account_type_particular_id, group_id, group_name);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<S1_account_disburses.to_account_disburses> ret_data_report(String where) {
        List<S1_account_disburses.to_account_disburses> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",session_no"
                    + ",user_name"
                    + ",screen_name"
                    + ",time_in"
                    + ",time_out"
                    + ",bank"
                    + ",check_no"
                    + ",check_holder"
                    + ",amount"
                    + ",date_added"
                    + ",account_no_id"
                    + ",account_no"
                    + ",account_type"
                    + ",account_type_id"
                    + ",account_type_particular"
                    + ",account_type_particular_id"
                    + ",group_id"
                    + ",group_name"
                    + " from cash_drawer_expenses  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String session_no = rs.getString(2);
                String user_name = rs.getString(3);
                String screen_name = rs.getString(4);
                String time_in = rs.getString(5);
                String time_out = rs.getString(6);
                String bank = rs.getString(7);
                String check_no = rs.getString(8);
                String check_holder = rs.getString(9);
                double amount = rs.getDouble(10);
                String date_added = rs.getString(11);
                String account_no_id = rs.getString(12);
                String account_no = rs.getString(13);
                String account_type = rs.getString(14);
                String account_type_id = rs.getString(15);
                String account_type_particular = rs.getString(16);
                String account_type_particular_id = rs.getString(17);
                String group_id = rs.getString(18);
                String group_name = rs.getString(19);
                
                S1_account_disburses.to_account_disburses to = new S1_account_disburses.to_account_disburses(id, "", session_no, user_name, date_added
                        , "", "", check_no, amount, account_no_id, account_no, account_type, account_type_id, account_type_particular
                        , account_type_particular_id, group_id, group_name,"");

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

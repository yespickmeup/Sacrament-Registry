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
public class S1_account_disburses_particulars {

    public static class to_account_disburses_particulars {

        public final int id;
        public final String reference_no;
        public final String user_id;
        public final String user_name;
        public final String date_added;
        public final String disburse_date;
        public final String payee;
        public final String check_no;
        public double amount;
        public final String account_no_id;
        public final String account_no;
        public String account_type;
        public String account_type_id;
        public String account_type_particular;
        public String account_type_particular_id;
        public final String group_id;
        public final String group_name;
        public final String account_disburses_id;
        public final String voucher_no;

        public to_account_disburses_particulars(int id, String reference_no, String user_id, String user_name, String date_added, String disburse_date, String payee, String check_no, double amount, String account_no_id, String account_no, String account_type, String account_type_id, String account_type_particular, String account_type_particular_id, String group_id, String group_name, String account_disburses_id, String voucher_no) {
            this.id = id;
            this.reference_no = reference_no;
            this.user_id = user_id;
            this.user_name = user_name;
            this.date_added = date_added;
            this.disburse_date = disburse_date;
            this.payee = payee;
            this.check_no = check_no;
            this.amount = amount;
            this.account_no_id = account_no_id;
            this.account_no = account_no;
            this.account_type = account_type;
            this.account_type_id = account_type_id;
            this.account_type_particular = account_type_particular;
            this.account_type_particular_id = account_type_particular_id;
            this.group_id = group_id;
            this.group_name = group_name;
            this.account_disburses_id = account_disburses_id;
            this.voucher_no = voucher_no;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getAccount_type() {
            return account_type;
        }

        public void setAccount_type(String account_type) {
            this.account_type = account_type;
        }

        public String getAccount_type_id() {
            return account_type_id;
        }

        public void setAccount_type_id(String account_type_id) {
            this.account_type_id = account_type_id;
        }

        public String getAccount_type_particular() {
            return account_type_particular;
        }

        public void setAccount_type_particular(String account_type_particular) {
            this.account_type_particular = account_type_particular;
        }

        public String getAccount_type_particular_id() {
            return account_type_particular_id;
        }

        public void setAccount_type_particular_id(String account_type_particular_id) {
            this.account_type_particular_id = account_type_particular_id;
        }

    }

    public static void add_account_disburses_particulars(List<to_account_disburses_particulars> to_account_disburses_particulars1
            , String id, double total_amount,String voucher_no) {
        try {
            Connection conn = MyConnection.connect();

            for (to_account_disburses_particulars to_account_disburses_particulars : to_account_disburses_particulars1) {

                String s0 = "insert into account_disburses_particulars("
                        + "reference_no"
                        + ",user_id"
                        + ",user_name"
                        + ",date_added"
                        + ",disburse_date"
                        + ",payee"
                        + ",check_no"
                        + ",amount"
                        + ",account_no_id"
                        + ",account_no"
                        + ",account_type"
                        + ",account_type_id"
                        + ",account_type_particular"
                        + ",account_type_particular_id"
                        + ",group_id"
                        + ",group_name"
                        + ",account_disburses_id"
                        + ",voucher_no"
                        + ")values("
                        + ":reference_no"
                        + ",:user_id"
                        + ",:user_name"
                        + ",:date_added"
                        + ",:disburse_date"
                        + ",:payee"
                        + ",:check_no"
                        + ",:amount"
                        + ",:account_no_id"
                        + ",:account_no"
                        + ",:account_type"
                        + ",:account_type_id"
                        + ",:account_type_particular"
                        + ",:account_type_particular_id"
                        + ",:group_id"
                        + ",:group_name"
                        + ",:account_disburses_id"
                        + ",:voucher_no"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("reference_no", to_account_disburses_particulars.reference_no)
                        .setString("user_id", to_account_disburses_particulars.user_id)
                        .setString("user_name", to_account_disburses_particulars.user_name)
                        .setString("date_added", to_account_disburses_particulars.date_added)
                        .setString("disburse_date", to_account_disburses_particulars.disburse_date)
                        .setString("payee", to_account_disburses_particulars.payee)
                        .setString("check_no", to_account_disburses_particulars.check_no)
                        .setNumber("amount", to_account_disburses_particulars.amount)
                        .setString("account_no_id", to_account_disburses_particulars.account_no_id)
                        .setString("account_no", to_account_disburses_particulars.account_no)
                        .setString("account_type", to_account_disburses_particulars.account_type)
                        .setString("account_type_id", to_account_disburses_particulars.account_type_id)
                        .setString("account_type_particular", to_account_disburses_particulars.account_type_particular)
                        .setString("account_type_particular_id", to_account_disburses_particulars.account_type_particular_id)
                        .setString("group_id", to_account_disburses_particulars.group_id)
                        .setString("group_name", to_account_disburses_particulars.group_name)
                        .setString("account_disburses_id", id)
                        .setString("voucher_no",voucher_no)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(S1_account_disburses_particulars.class, "Successfully Added");

            }

            String s2 = "update account_disburses set "
                    + "amount= :amount"
                    + " where "
                    + " id ='" + id + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setNumber("amount", total_amount)
                    .ok();

            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(S1_account_disburses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_account_disburses_particulars(to_account_disburses_particulars to_account_disburses_particulars, double total_amount) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update account_disburses_particulars set "
                    + "reference_no= :reference_no"
                    + ",user_id= :user_id"
                    + ",user_name= :user_name"
                    + ",date_added= :date_added"
                    + ",disburse_date= :disburse_date"
                    + ",payee= :payee"
                    + ",check_no= :check_no"
                    + ",amount= :amount"
                    + ",account_no_id= :account_no_id"
                    + ",account_no= :account_no"
                    + ",account_type= :account_type"
                    + ",account_type_id= :account_type_id"
                    + ",account_type_particular= :account_type_particular"
                    + ",account_type_particular_id= :account_type_particular_id"
                    + ",group_id= :group_id"
                    + ",group_name= :group_name"
                    + ",account_disburses_id= :account_disburses_id"
                    + ",voucher_no= :voucher_no"
                    + " where "
                    + " id ='" + to_account_disburses_particulars.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reference_no", to_account_disburses_particulars.reference_no)
                    .setString("user_id", to_account_disburses_particulars.user_id)
                    .setString("user_name", to_account_disburses_particulars.user_name)
                    .setString("date_added", to_account_disburses_particulars.date_added)
                    .setString("disburse_date", to_account_disburses_particulars.disburse_date)
                    .setString("payee", to_account_disburses_particulars.payee)
                    .setString("check_no", to_account_disburses_particulars.check_no)
                    .setNumber("amount", to_account_disburses_particulars.amount)
                    .setString("account_no_id", to_account_disburses_particulars.account_no_id)
                    .setString("account_no", to_account_disburses_particulars.account_no)
                    .setString("account_type", to_account_disburses_particulars.account_type)
                    .setString("account_type_id", to_account_disburses_particulars.account_type_id)
                    .setString("account_type_particular", to_account_disburses_particulars.account_type_particular)
                    .setString("account_type_particular_id", to_account_disburses_particulars.account_type_particular_id)
                    .setString("group_id", to_account_disburses_particulars.group_id)
                    .setString("group_name", to_account_disburses_particulars.group_name)
                    .setString("account_disburses_id", to_account_disburses_particulars.account_disburses_id)
                    .setString("voucher_no", to_account_disburses_particulars.voucher_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disburses_particulars.class, "Successfully Updated");

            String s2 = "update account_disburses set "
                    + "amount= :amount"
                    + " where "
                    + " id ='" + to_account_disburses_particulars.account_disburses_id + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setNumber("amount", total_amount)
                    .ok();

            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(S1_account_disburses.class, "Successfully Updated ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_account_disburses_particulars(to_account_disburses_particulars to_account_disburses_particulars, double total_amount) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_disburses_particulars where "
                    + " id ='" + to_account_disburses_particulars.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disburses_particulars.class, "Successfully Deleted");

            String s2 = "update account_disburses set "
                    + "amount= :amount"
                    + " where "
                    + " id ='" + to_account_disburses_particulars.account_disburses_id + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setNumber("amount", total_amount)
                    .ok();

            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(S1_account_disburses.class, "Successfully Updated ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_account_disburses_particulars2(String account_disburses_id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_disburses_particulars where "
                    + " account_disburses_id ='" + account_disburses_id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_disburses_particulars.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_disburses_particulars> ret_data(String where) {
        List<to_account_disburses_particulars> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",reference_no"
                    + ",user_id"
                    + ",user_name"
                    + ",date_added"
                    + ",disburse_date"
                    + ",payee"
                    + ",check_no"
                    + ",amount"
                    + ",account_no_id"
                    + ",account_no"
                    + ",account_type"
                    + ",account_type_id"
                    + ",account_type_particular"
                    + ",account_type_particular_id"
                    + ",group_id"
                    + ",group_name"
                    + ",account_disburses_id"
                    + ",voucher_no"
                    + " from account_disburses_particulars  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String reference_no = rs.getString(2);
                String user_id = rs.getString(3);
                String user_name = rs.getString(4);
                String date_added = rs.getString(5);
                String disburse_date = rs.getString(6);
                String payee = rs.getString(7);
                String check_no = rs.getString(8);
                double amount = rs.getDouble(9);
                String account_no_id = rs.getString(10);
                String account_no = rs.getString(11);
                String account_type = rs.getString(12);
                String account_type_id = rs.getString(13);
                String account_type_particular = rs.getString(14);
                String account_type_particular_id = rs.getString(15);
                String group_id = rs.getString(16);
                String group_name = rs.getString(17);
                String account_disburses_id = rs.getString(18);
                String voucher_no=rs.getString(19);
                to_account_disburses_particulars to = new to_account_disburses_particulars(id, reference_no, user_id, user_name
                        , date_added, disburse_date, payee, check_no, amount, account_no_id, account_no, account_type
                        , account_type_id, account_type_particular, account_type_particular_id, group_id, group_name, account_disburses_id,voucher_no);
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

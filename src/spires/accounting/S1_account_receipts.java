/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.accounting;

import spires.receipts.S1_receipts.to_receipts;
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
public class S1_account_receipts {

    public static class to_account_receipts {

        public final int id;
        public final String reference_no;
        public final String user_id;
        public final String user_name;
        public final String date_added;
        public final String remarks;
        public final double amount;
        public final String account_no_id;
        public final String account_no;
        public final String account_type;
        public final String account_type_id;
        public final String group_id;
        public final String group_name;
        public final String receipt_date;

        public to_account_receipts(int id, String reference_no, String user_id, String user_name, String date_added, String remarks, double amount, String account_no_id, String account_no, String account_type, String account_type_id, String group_id, String group_name, String receipt_date) {
            this.id = id;
            this.reference_no = reference_no;
            this.user_id = user_id;
            this.user_name = user_name;
            this.date_added = date_added;
            this.remarks = remarks;
            this.amount = amount;
            this.account_no_id = account_no_id;
            this.account_no = account_no;
            this.account_type = account_type;
            this.account_type_id = account_type_id;
            this.group_id = group_id;
            this.group_name = group_name;
            this.receipt_date = receipt_date;
        }
    }

    public static void add_account_receipts(to_account_receipts to_account_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into account_receipts("
                    + "reference_no"
                    + ",user_id"
                    + ",user_name"
                    + ",date_added"
                    + ",remarks"
                    + ",amount"
                    + ",account_no_id"
                    + ",account_no"
                    + ",account_type"
                    + ",account_type_id"
                    + ",group_id"
                    + ",group_name"
                    + ",receipt_date"
                    + ")values("
                    + ":reference_no"
                    + ",:user_id"
                    + ",:user_name"
                    + ",:date_added"
                    + ",:remarks"
                    + ",:amount"
                    + ",:account_no_id"
                    + ",:account_no"
                    + ",:account_type"
                    + ",:account_type_id"
                    + ",:group_id"
                    + ",:group_name"
                    + ",:receipt_date"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reference_no", to_account_receipts.reference_no)
                    .setString("user_id", to_account_receipts.user_id)
                    .setString("user_name", to_account_receipts.user_name)
                    .setString("date_added", to_account_receipts.date_added)
                    .setString("remarks", to_account_receipts.remarks)
                    .setNumber("amount", to_account_receipts.amount)
                    .setString("account_no_id", to_account_receipts.account_no_id)
                    .setString("account_no", to_account_receipts.account_no)
                    .setString("account_type", to_account_receipts.account_type)
                    .setString("account_type_id", to_account_receipts.account_type_id)
                    .setString("group_id", to_account_receipts.group_id)
                    .setString("group_name", to_account_receipts.group_name)
                    .setString("receipt_date", to_account_receipts.receipt_date)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_receipts.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_account_receipts(to_account_receipts to_account_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update account_receipts set "
                    + "reference_no= :reference_no"
                    + ",user_id= :user_id"
                    + ",user_name= :user_name"
                    + ",date_added= :date_added"
                    + ",remarks= :remarks"
                    + ",amount= :amount"
                    + ",account_no_id= :account_no_id"
                    + ",account_no= :account_no"
                    + ",account_type= :account_type"
                    + ",account_type_id= :account_type_id"
                    + ",group_id= :group_id"
                    + ",group_name= :group_name"
                    + ",receipt_date= :receipt_date"
                    + " where "
                    + " id ='" + to_account_receipts.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reference_no", to_account_receipts.reference_no)
                    .setString("user_id", to_account_receipts.user_id)
                    .setString("user_name", to_account_receipts.user_name)
                    .setString("date_added", to_account_receipts.date_added)
                    .setString("remarks", to_account_receipts.remarks)
                    .setNumber("amount", to_account_receipts.amount)
                    .setString("account_no_id", to_account_receipts.account_no_id)
                    .setString("account_no", to_account_receipts.account_no)
                    .setString("account_type", to_account_receipts.account_type)
                    .setString("account_type_id", to_account_receipts.account_type_id)
                    .setString("group_id", to_account_receipts.group_id)
                    .setString("group_name", to_account_receipts.group_name)
                    .setString("receipt_date", to_account_receipts.receipt_date)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_receipts.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_account_receipts(to_account_receipts to_account_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from account_receipts where "
                    + " id ='" + to_account_receipts.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_account_receipts.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_receipts> ret_data(String where) {
        List<to_account_receipts> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",reference_no"
                    + ",user_id"
                    + ",user_name"
                    + ",date_added"
                    + ",remarks"
                    + ",amount"
                    + ",account_no_id"
                    + ",account_no"
                    + ",account_type"
                    + ",account_type_id"
                    + ",group_id"
                    + ",group_name"
                    + ",receipt_date"
                    + " from account_receipts  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String reference_no = rs.getString(2);
                String user_id = rs.getString(3);
                String user_name = rs.getString(4);
                String date_added = rs.getString(5);
                String remarks = rs.getString(6);
                double amount = rs.getDouble(7);
                String account_no_id = rs.getString(8);
                String account_no = rs.getString(9);
                String account_type = rs.getString(10);
                String account_type_id = rs.getString(11);
                String group_id = rs.getString(12);
                String group_name = rs.getString(13);
                String receipt_date = rs.getString(14);

                to_account_receipts to = new to_account_receipts(id, reference_no, user_id, user_name, date_added, remarks, amount, account_no_id, account_no, account_type, account_type_id, group_id, group_name, receipt_date);

                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_account_receipts> ret_data_receipts(String where) {
        List<to_account_receipts> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",or_no"
                    + ",or_date"
                    + ",date_added"
                    + ",or_time"
                    + ",user_name"
                    + ",terminal_id"
                    + ",amount_due"
                    + ",cash"
                    + ",check_amount"
                    + ",check_no"
                    + ",check_holder"
                    + ",message"
                    + ",parishioner"
                    + ",parishioner_id"
                    + ",parioshioner_contact_no"
                    + ",account_name"
                    + ",account_id"
                    + ",account_type"
                    + ",account_type_id"
                    + ",status"
                    + ",particular"
                    + ",particular_id"
                    + ",particular_account"
                    + ",particular_account_id"
                    + " from receipts  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String or_no = rs.getString(2);
                String or_date = rs.getString(3);
                String date_added = rs.getString(4);
                String or_time = rs.getString(5);
                String user_name = rs.getString(6);
                String terminal_id = rs.getString(7);
                double amount_due = rs.getDouble(8);
                double cash = rs.getDouble(9);
                double check_amount = rs.getDouble(10);
                String check_no = rs.getString(11);
                String check_holder = rs.getString(12);
                String message = rs.getString(13);
                String parishioner = rs.getString(14);
                String parishioner_id = rs.getString(15);
                String parioshioner_contact_no = rs.getString(16);
                String account_name = rs.getString(17);
                String account_id = rs.getString(18);
                String account_type = rs.getString(19);
                String account_type_id = rs.getString(20);
                String status = rs.getString(21);
                String particular = rs.getString(22);
                String particular_id = rs.getString(23);
                String particular_account = rs.getString(24);
                String particular_account_id = rs.getString(25);
                double am = cash + check_amount;
                to_account_receipts to = new to_account_receipts(id, or_no, user_name, user_name, date_added, "", am, account_id, account_name, account_type, account_type_id, "1", "Revenue", or_date);

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

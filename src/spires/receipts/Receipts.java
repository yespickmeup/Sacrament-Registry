/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.receipts;

import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Ronald
 */
public class Receipts {

    public static class to_receipts {

        public final int id;
        public final String or_no;
        public final String or_date;
        public final String date_added;
        public final String or_time;
        public final String user_name;
        public final String terminal_id;
        public final double amount_due;
        public double cash;
        public double check_amount;
        public String check_no;
        public String check_holder;
        public String message;
        public final String parishioner;
        public final String parishioner_id;
        public final String parioshioner_contact_no;
        public final String account_name;
        public final String account_id;
        public final String account_type;
        public final String account_type_id;
        public final String status;
        public final String particular;
        public final String particular_id;
        public final String particular_account;
        public final String particular_account_id;
        public final String check_bank;
        public final int is_fixed;

        public to_receipts(int id, String or_no, String or_date, String date_added, String or_time, String user_name, String terminal_id, double amount_due, double cash, double check_amount, String check_no, String check_holder, String message, String parishioner, String parishioner_id, String parioshioner_contact_no, String account_name, String account_id, String account_type, String account_type_id, String status, String particular, String particular_id, String particular_account, String particular_account_id, String check_bank, int is_fixed) {
            this.id = id;
            this.or_no = or_no;
            this.or_date = or_date;
            this.date_added = date_added;
            this.or_time = or_time;
            this.user_name = user_name;
            this.terminal_id = terminal_id;
            this.amount_due = amount_due;
            this.cash = cash;
            this.check_amount = check_amount;
            this.check_no = check_no;
            this.check_holder = check_holder;
            this.message = message;
            this.parishioner = parishioner;
            this.parishioner_id = parishioner_id;
            this.parioshioner_contact_no = parioshioner_contact_no;
            this.account_name = account_name;
            this.account_id = account_id;
            this.account_type = account_type;
            this.account_type_id = account_type_id;
            this.status = status;
            this.particular = particular;
            this.particular_id = particular_id;
            this.particular_account = particular_account;
            this.particular_account_id = particular_account_id;
            this.check_bank = check_bank;
            this.is_fixed = is_fixed;

        }

        public double getCash() {
            return cash;
        }

        public void setCash(double cash) {
            this.cash = cash;
        }

        public double getCheck_amount() {
            return check_amount;
        }

        public void setCheck_amount(double check_amount) {
            this.check_amount = check_amount;
        }

        public String getCheck_no() {
            return check_no;
        }

        public void setCheck_no(String check_no) {
            this.check_no = check_no;
        }

        public String getCheck_holder() {
            return check_holder;
        }

        public void setCheck_holder(String check_holder) {
            this.check_holder = check_holder;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

    public static void add_receipts(to_receipts to_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into receipts("
                    + "or_no"
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
                    + ",check_bank"
                    + ",is_fixed"
                    + ")values("
                    + ":or_no"
                    + ",:or_date"
                    + ",:date_added"
                    + ",:or_time"
                    + ",:user_name"
                    + ",:terminal_id"
                    + ",:amount_due"
                    + ",:cash"
                    + ",:check_amount"
                    + ",:check_no"
                    + ",:check_holder"
                    + ",:message"
                    + ",:parishioner"
                    + ",:parishioner_id"
                    + ",:parioshioner_contact_no"
                    + ",:account_name"
                    + ",:account_id"
                    + ",:account_type"
                    + ",:account_type_id"
                    + ",:status"
                    + ",:particular"
                    + ",:particular_id"
                    + ",:particular_account"
                    + ",:particular_account_id"
                    + ",:check_bank"
                    + ",:is_fixed"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("or_no", to_receipts.or_no)
                    .setString("or_date", to_receipts.or_date)
                    .setString("date_added", to_receipts.date_added)
                    .setString("or_time", to_receipts.or_time)
                    .setString("user_name", to_receipts.user_name)
                    .setString("terminal_id", to_receipts.terminal_id)
                    .setNumber("amount_due", to_receipts.amount_due)
                    .setNumber("cash", to_receipts.cash)
                    .setNumber("check_amount", to_receipts.check_amount)
                    .setString("check_no", to_receipts.check_no)
                    .setString("check_holder", to_receipts.check_holder)
                    .setString("message", to_receipts.message)
                    .setString("parishioner", to_receipts.parishioner)
                    .setString("parishioner_id", to_receipts.parishioner_id)
                    .setString("parioshioner_contact_no", to_receipts.parioshioner_contact_no)
                    .setString("account_name", to_receipts.account_name)
                    .setString("account_id", to_receipts.account_id)
                    .setString("account_type", to_receipts.account_type)
                    .setString("account_type_id", to_receipts.account_type_id)
                    .setString("status", to_receipts.status)
                    .setString("particular", to_receipts.particular)
                    .setString("particular_id", to_receipts.particular_id)
                    .setString("particular_account", to_receipts.particular_account)
                    .setString("particular_account_id", to_receipts.particular_account_id)
                    .setString("check_bank", to_receipts.check_bank)
                    .setNumber("is_fixed", to_receipts.is_fixed)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Receipts.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_receipts(List<to_receipts> to_receipts1) {
        try {
            Connection conn = MyConnection.connect();
            for (to_receipts to_receipts : to_receipts1) {
                String s0 = "insert into receipts("
                        + "or_no"
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
                        + ",check_bank"
                        + ",is_fixed"
                        + ")values("
                        + ":or_no"
                        + ",:or_date"
                        + ",:date_added"
                        + ",:or_time"
                        + ",:user_name"
                        + ",:terminal_id"
                        + ",:amount_due"
                        + ",:cash"
                        + ",:check_amount"
                        + ",:check_no"
                        + ",:check_holder"
                        + ",:message"
                        + ",:parishioner"
                        + ",:parishioner_id"
                        + ",:parioshioner_contact_no"
                        + ",:account_name"
                        + ",:account_id"
                        + ",:account_type"
                        + ",:account_type_id"
                        + ",:status"
                        + ",:particular"
                        + ",:particular_id"
                        + ",:particular_account"
                        + ",:particular_account_id"
                        + ",:check_bank"
                        + ",:is_fixed"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("or_no", to_receipts.or_no)
                        .setString("or_date", to_receipts.or_date)
                        .setString("date_added", to_receipts.date_added)
                        .setString("or_time", to_receipts.or_time)
                        .setString("user_name", to_receipts.user_name)
                        .setString("terminal_id", to_receipts.terminal_id)
                        .setNumber("amount_due", to_receipts.amount_due)
                        .setNumber("cash", to_receipts.cash)
                        .setNumber("check_amount", to_receipts.check_amount)
                        .setString("check_no", to_receipts.check_no)
                        .setString("check_holder", to_receipts.check_holder)
                        .setString("message", to_receipts.message)
                        .setString("parishioner", to_receipts.parishioner)
                        .setString("parishioner_id", to_receipts.parishioner_id)
                        .setString("parioshioner_contact_no", to_receipts.parioshioner_contact_no)
                        .setString("account_name", to_receipts.account_name)
                        .setString("account_id", to_receipts.account_id)
                        .setString("account_type", to_receipts.account_type)
                        .setString("account_type_id", to_receipts.account_type_id)
                        .setString("status", to_receipts.status)
                        .setString("particular", to_receipts.particular)
                        .setString("particular_id", to_receipts.particular_id)
                        .setString("particular_account", to_receipts.particular_account)
                        .setString("particular_account_id", to_receipts.particular_account_id)
                        .setString("check_bank", to_receipts.check_bank)
                        .setNumber("is_fixed", to_receipts.is_fixed)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }

            Lg.s(Receipts.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_receipts(to_receipts to_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update receipts set "
                    + "or_no= :or_no"
                    + ",or_date= :or_date"
                    + ",date_added= :date_added"
                    + ",or_time= :or_time"
                    + ",user_name= :user_name"
                    + ",terminal_id= :terminal_id"
                    + ",amount_due= :amount_due"
                    + ",cash= :cash"
                    + ",check_amount= :check_amount"
                    + ",check_no= :check_no"
                    + ",check_holder= :check_holder"
                    + ",message= :message"
                    + ",parishioner= :parishioner"
                    + ",parishioner_id= :parishioner_id"
                    + ",parioshioner_contact_no= :parioshioner_contact_no"
                    + ",account_name= :account_name"
                    + ",account_id= :account_id"
                    + ",account_type= :account_type"
                    + ",account_type_id= :account_type_id"
                    + ",status= :status"
                    + ",particular= :particular"
                    + ",particular_id= :particular_id"
                    + ",particular_account= :particular_account"
                    + ",particular_account_id= :particular_account_id"
                    + ",check_bank= :check_bank"
                    + ",is_fixed= :is_fixed"
                    + " where "
                    + " id ='" + to_receipts.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("or_no", to_receipts.or_no)
                    .setString("or_date", to_receipts.or_date)
                    .setString("date_added", to_receipts.date_added)
                    .setString("or_time", to_receipts.or_time)
                    .setString("user_name", to_receipts.user_name)
                    .setString("terminal_id", to_receipts.terminal_id)
                    .setNumber("amount_due", to_receipts.amount_due)
                    .setNumber("cash", to_receipts.cash)
                    .setNumber("check_amount", to_receipts.check_amount)
                    .setString("check_no", to_receipts.check_no)
                    .setString("check_holder", to_receipts.check_holder)
                    .setString("message", to_receipts.message)
                    .setString("parishioner", to_receipts.parishioner)
                    .setString("parishioner_id", to_receipts.parishioner_id)
                    .setString("parioshioner_contact_no", to_receipts.parioshioner_contact_no)
                    .setString("account_name", to_receipts.account_name)
                    .setString("account_id", to_receipts.account_id)
                    .setString("account_type", to_receipts.account_type)
                    .setString("account_type_id", to_receipts.account_type_id)
                    .setString("status", to_receipts.status)
                    .setString("particular", to_receipts.particular)
                    .setString("particular_id", to_receipts.particular_id)
                    .setString("particular_account", to_receipts.particular_account)
                    .setString("particular_account_id", to_receipts.particular_account_id)
                    .setString("check_bank", to_receipts.check_bank)
                    .setNumber("is_fixed", to_receipts.is_fixed)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Receipts.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_or_date(List<to_receipts> to_receipts1, String date) {
        try {
            Connection conn = MyConnection.connect();
            for (to_receipts to_receipts : to_receipts1) {
//                if (to_receipts.selected == true) {
                String s0 = "update receipts set "
                        + "or_date= :or_date"
                        + " where "
                        + " id ='" + to_receipts.id + "' "
                        + " ";

                s0 = SqlStringUtil.parse(s0)
                        .setString("or_date", date)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(Receipts.class, "Successfully Updated");
//                }

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_receipts(to_receipts to_receipts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from receipts where "
                    + " id ='" + to_receipts.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Receipts.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_receipts> ret_data(String where) {
        List<to_receipts> datas = new ArrayList();

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
                    + ",check_bank"
                    + ",is_fixed"
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
                String check_bank = rs.getString(26);
                int is_fixed = rs.getInt(27);
                to_receipts to = new to_receipts(id, or_no, or_date, date_added, or_time, user_name, terminal_id, amount_due, cash, check_amount, check_no, check_holder, message, parishioner, parishioner_id, parioshioner_contact_no, account_name, account_id, account_type, account_type_id, status, particular, particular_id, particular_account, particular_account_id, check_bank, is_fixed);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_receipts> ret_data2(String where) {
        List<to_receipts> datas = new ArrayList();

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
                    + ",IF(is_fixed = 1,SUM(amount_due),SUM(cash+check_amount)) as amount_due"
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
                    + ",check_bank"
                    + ",is_fixed"
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
                String check_bank = rs.getString(26);
                int is_fixed = rs.getInt(27);
                to_receipts to = new to_receipts(id, or_no, or_date, date_added, or_time, user_name, terminal_id, amount_due, cash, check_amount, check_no, check_holder, message, parishioner, parishioner_id, parioshioner_contact_no, account_name, account_id, account_type, account_type_id, status, particular, particular_id, particular_account, particular_account_id, check_bank, is_fixed);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id() {
        String id = "0000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from receipts";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select or_no from receipts where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                    id = ReceiptIncrementor.increment(id);
                }
            }
            if (id == null) {
                id = "0000000000";
                id = ReceiptIncrementor.increment(id);
            }
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(increment_id());
    }
}

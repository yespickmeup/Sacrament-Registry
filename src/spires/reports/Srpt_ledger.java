/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.reports;

import spires.receipts.Receipts;
import spires.util.MyConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Ronald
 */
public class Srpt_ledger {

    public final List<Srpt_ledger.field> fields;
    public final String business_name;
    public final String operated_by;
    public final String address;
    public final String date;

    public Srpt_ledger(String business_name, String operated_by, String address, String date) {
        this.fields = new ArrayList();
        this.business_name = business_name;
        this.operated_by = operated_by;
        this.address = address;
        this.date = date;
    }

    public static class field {

        String or_no;
        String date;
        String account;
        double amount;

        public field() {
        }

        public field(String or_no, String date, String account, double amount) {
            this.or_no = or_no;
            this.date = date;
            this.account = account;
            this.amount = amount;
        }

        public String getOr_no() {
            return or_no;
        }

        public void setOr_no(String or_no) {
            this.or_no = or_no;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

    }

    public static void main(String[] args) {
        String where = "";
        List<Srpt_ledger.field> fields = new ArrayList();
        List<Receipts.to_receipts> receipts = Srpt_ledger.ret_receipts(where);
        double tot = 0;
        for (Receipts.to_receipts to : receipts) {
            if (to.account_type.isEmpty()) {
                Srpt_ledger.field t = new field(to.or_no, to.or_date, to.account_name, (to.cash + to.check_amount));
                fields.add(t);
            } else {
                Srpt_ledger.field t = new field(to.or_no, to.or_date, to.account_type, (to.cash + to.check_amount));
                fields.add(t);
            }

        }
        String total = "" + tot;
        String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
        String operated_by = System.getProperty("operated_by", "");
        String address = System.getProperty("address", "");
        String date = "July 1,2013";

        Srpt_ledger rpt = new Srpt_ledger(business_name, operated_by, address, date);
        rpt.fields.addAll(fields);

        JRViewer viewer = Srpt_ledger.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JRViewer get_viewer(Srpt_ledger to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));

    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_ledger.jrxml";
            InputStream is = Srpt_ledger.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Receipts.to_receipts> ret_receipts(String where) {
        List<Receipts.to_receipts> datas = new ArrayList();

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
                String particular=rs.getString(22);
                String particular_id=rs.getString(23);
                String particular_account=rs.getString(24);
                String particular_account_id=rs.getString(25);
                Receipts.to_receipts to = new Receipts.to_receipts(id, or_no, or_date, date_added, or_time, user_name, terminal_id
                        , amount_due, cash, check_amount, check_no, check_holder, message, parishioner, parishioner_id, parioshioner_contact_no
                        , account_name, account_id, account_type, account_type_id, status,particular,particular_id,particular_account
                        ,particular_account_id,"",0);
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

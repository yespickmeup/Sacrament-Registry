/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.accounting;

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
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Guinness
 */
public class Srpt_report_disbursements {

    public final List<Srpt_report_disbursements.field> fields;
    public final String pay_to;
    public final String no;
    public final String date;
    public final String prepared_by;
    public final String verified_by;
    public final String approved_by;
    public final String amount_in_words;
    public final String check_no;
    public final String received_by;

    public Srpt_report_disbursements(String pay_to, String no, String date, String prepared_by, String verified_by, String approved_by, String amount_in_words, String check_no, String received_by) {
        this.fields = new ArrayList();
        this.pay_to = pay_to;
        this.no = no;
        this.date = date;
        this.prepared_by = prepared_by;
        this.verified_by = verified_by;
        this.approved_by = approved_by;
        this.amount_in_words = amount_in_words;
        this.check_no = check_no;
        this.received_by = received_by;
    }

    public static class field {

        String particular;
        double amount;
        String credit;
        String account_title;
        String debit;
        public field() {
        }

        public String getCredit() {
            return credit;
        }

        public String getDebit() {
            return debit;
        }

        public void setDebit(String debit) {
            this.debit = debit;
        }

        
        public void setCredit(String credit) {
            this.credit = credit;
        }

        public String getAccount_title() {
            return account_title;
        }

        public void setAccount_title(String account_title) {
            this.account_title = account_title;
        }

        public field(String particular, double amount, String credit, String account_title,String debit) {
            this.particular = particular;
            this.amount = amount;
            this.credit = credit;
            this.account_title = account_title;
            this.debit=debit;
        }

        public String getParticular() {
            return particular;
        }

        public void setParticular(String particular) {
            this.particular = particular;
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
        List<Srpt_report_disbursements.field> fields1 = ret_data(where);
        String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
        String operated_by = System.getProperty("operated_by", "");
        String address = System.getProperty("address", "");
        String date = "";//MyDate.report_date(jDateChooser3.getDate(), jDateChooser4.getDate());
        String account = "BPI 1081-0143-09";
        String pay_to = "payto";
        String no = "no";
        String prepared_by = "prep";
        String verified_by = "veri";
        String approved_by = "app";
        String amount_in_words = "words";
        String check_no = "checl";
        String received_by = "recei";
        Srpt_report_disbursements rpt = new Srpt_report_disbursements(pay_to, no, date, prepared_by, verified_by, approved_by, amount_in_words, check_no, received_by);

        rpt.fields.addAll(fields1);
        String jrxml = "rpt_report_disbursements.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport
            compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_report_disbursements.class
                    .getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_report_disbursements to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<Srpt_report_disbursements.field> ret_data(String where) {
        List<Srpt_report_disbursements.field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",particular"
                    + ",status"
                    + " from account_disbursements  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String particular = rs.getString(2);
                int status = rs.getInt(3);

                Srpt_report_disbursements.field to = new field(particular, 0,"","","");
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

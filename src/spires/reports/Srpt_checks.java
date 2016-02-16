/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.reports;

import spires.accounting.S1_account_disbursements.to_account_disbursements;
import spires.util.MyConnection;
import spires.util.MyDate;
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
 * @author Maytopacka
 */
public class Srpt_checks {

    public static List<Srpt_checks.field> fields;

    public final String business_name;
    public final String operated_by;
    public final String address;
    public final String date;

    public Srpt_checks(String business_name, String operated_by, String address, String date) {
        Srpt_checks.fields = new ArrayList();
        this.business_name = business_name;
        this.operated_by = operated_by;
        this.address = address;
        this.date = date;
    }

    public static class field {

        String check_bank;
        String check_holder;
        String check_no;
        double check_amount;
        String date;

        public field() {
        }

        public field(String check_bank, String check_holder, String check_no, double check_amount, String date) {
            this.check_bank = check_bank;
            this.check_holder = check_holder;
            this.check_no = check_no;
            this.check_amount = check_amount;
            this.date = date;
        }

        public double getCheck_amount() {
            return check_amount;
        }

        public void setCheck_amount(double check_amount) {
            this.check_amount = check_amount;
        }

        public String getCheck_bank() {
            return check_bank;
        }

        public void setCheck_bank(String check_bank) {
            this.check_bank = check_bank;
        }

        public String getCheck_holder() {
            return check_holder;
        }

        public void setCheck_holder(String check_holder) {
            this.check_holder = check_holder;
        }

        public String getCheck_no() {
            return check_no;
        }

        public void setCheck_no(String check_no) {
            this.check_no = check_no;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public static void main(String[] args) {

        String where = "";
        List<Srpt_checks.field> fields1 = Srpt_checks.get_disbursements(where);

        String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
        String operated_by = System.getProperty("operated_by", "");
        String address = System.getProperty("address", "");
        String date = "";//MyDate.report_date(jDateChooser3.getDate(), jDateChooser4.getDate());
        Srpt_checks rpt = new Srpt_checks(business_name, operated_by, address, date);
        Srpt_checks.fields.addAll(fields1);
        String jrxml = "rpt_expenses.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_checks.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_checks to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(Srpt_checks.fields));
    }

    public static List<Srpt_checks.field> get_disbursements(String where) {
        List<Srpt_checks.field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",particular"
                    + ",status"
                    + " from account_disbursements  "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String particular = rs.getString(2);
                int status = rs.getInt(3);

                String s2 = "select "
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
                        + " from cash_drawer_expenses  "
                        + " " + where;
                double total_amount = 0;
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                while (rs2.next()) {
                    int id2 = rs2.getInt(1);
                    String session_no = rs2.getString(2);
                    String user_name = rs2.getString(3);
                    String screen_name = rs2.getString(4);
                    String time_in = rs2.getString(5);
                    String time_out = rs2.getString(6);
                    String bank = rs2.getString(7);
                    String check_no = rs2.getString(8);
                    String check_holder = rs2.getString(9);
                    double amount = rs2.getDouble(10);
                    total_amount += amount;
                    String date_added = rs2.getString(11);
                    String check_bank1 = bank;
                    String check_holder1 = check_holder;
                    String check_no1 = check_no;
                    double check_amount1 = amount;
                    String date1 = time_in;

                }
                Srpt_checks.field to = new field(particular, "", "", total_amount, MyDate.yyyy_mm_dd_to_MMMMMM_dd_yyy(MyDate.now_sf()));
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Srpt_checks.field> ret_data(String where) {
        List<Srpt_checks.field> datas = new ArrayList();

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

                String check_bank1 = bank;
                String check_holder1 = check_holder;
                String check_no1 = check_no;
                double check_amount1 = amount;
                String date1 = time_in;

                Srpt_checks.field to = new field(check_bank1, check_holder, check_no, check_amount1, MyDate.yyyy_mm_dd_to_MMMMMM_dd_yyy(date1));
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

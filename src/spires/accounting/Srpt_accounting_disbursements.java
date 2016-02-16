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
 * @author Ronald
 */
public class Srpt_accounting_disbursements {

    public final List<field> fields;
    public final String business_name;
    public final String operated_by;
    public final String address;
    public final String date;
    public final String account;

    public Srpt_accounting_disbursements(String business_name, String operated_by, String address, String date, String account) {
        this.fields = new ArrayList();
        this.business_name = business_name;
        this.operated_by = operated_by;
        this.address = address;
        this.date = date;
        this.account = account;
    }

    public static class field {

        String description;
        double amount;

        public field() {
        }

        public field(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
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
        List<field> fields1 = ret_data(where);
        String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
        String operated_by = System.getProperty("operated_by", "");
        String address = System.getProperty("address", "");
        String date = "";//MyDate.report_date(jDateChooser3.getDate(), jDateChooser4.getDate());
        String account = "BPI 1081-0143-09";
        Srpt_accounting_disbursements rpt = new Srpt_accounting_disbursements(business_name, operated_by, address, date, account);
        rpt.fields.addAll(fields1);
        String jrxml = "rpt_disbursements.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_accounting_disbursements.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_accounting_disbursements to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static List<field> ret_data(String where) {
        List<field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",particular"
                    + ",status"
                    + " from account_disbursements order by particular asc "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String revenue = rs.getString(2);
                int status = rs.getInt(3);
                String s2 = "select "
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
                        + " from account_disburses_particulars "
                        + " where "
                        + " account_type_id ='" + id + "' "
                        + " " + where;
                double amount = 0;
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                while (rs2.next()) {
                    amount += rs2.getDouble(9);
                }
                
                if (amount != 0) {
                    field to = new field(revenue, amount);
                    datas.add(to);
                }

            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

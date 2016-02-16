/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.reports;

import spires.cashiering.S1_cashiering;
import spires.receipts.S1_receipts.to_receipts;
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
//public class Srpt_summary {
//
//    public final String SUBREPORT_DIR;
//    public final List<Srpt_full_collection.field> rpt_full_collection;
//    public final List<Srpt_full_collection.field> rpt_zero_collection;
//
//    
//    public static void main(String[] args) {
//        String SUBREPORT_DIR = System.getProperty("img_path", "C:\\Users\\Ronald\\") + "images\\";
//
//        Srpt_summary rpt = new Srpt_summary();
//        rpt.fields.addAll(fields);
//
//        JRViewer viewer = Srpt_summary.get_viewer(rpt);
//        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    public static void pdf_view(Srpt_summary to) {
//
//        JasperUtil.pdfViewer(
//                JasperUtil.getJasper(SRpt_book_records.class),
//                JasperUtil.setParameter(to),
//                JasperUtil.makeDatasource(to.fields));
//    }
//
//    public static JRViewer get_viewer(Srpt_summary to) {
//
//        return JasperUtil.getJasperViewer(
//                compileJasper(),
//                JasperUtil.setParameter(to),
//                JasperUtil.makeDatasource(to.fields));
//
//    }
//
//    public static JasperReport compileJasper() {
//        try {
//            String jrxml = "rpt_summary.jrxml";
//            InputStream is = Srpt_summary.class.getResourceAsStream(jrxml);
//            JasperReport jasper = JasperCompileManager.compileReport(is);
//
//            return jasper;
//        } catch (JRException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static List<Srpt_summary.field> ret_data(String where) {
//        List<Srpt_summary.field> datas = new ArrayList();
//
//        List<to_receipts> receipts = ret_receipts(where);
//        List<S1_cashiering.to_cashiering> cashier = types();
//
//        for (S1_cashiering.to_cashiering cash : cashier) {
//            if (cash.parent == 0) {
//                for (to_receipts to : receipts) {
//
//                    if (to.account_type_id.equals("" + cash.account_type_id)) {
//                        System.out.println(to.cash + " cash" + " " + to.check_amount);
//                        Srpt_summary.field f = new field(to.account_name, to.account_type, (to.cash + to.check_amount));
//                        datas.add(f);
//                    }
//                }
//            }
//
//        }
//
//        return datas;
//    }
//
//    public static List<S1_cashiering.to_cashiering> types() {
//        List<S1_cashiering.to_cashiering> datas = new ArrayList();
//
//        try {
//            Connection conn = MyConnection.connect();
//            String s0 = "select "
//                    + "id"
//                    + ",account"
//                    + ",rate"
//                    + ",is_active"
//                    + " from cashiering  "
//                    + " order by account asc";
//
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(s0);
//
//            while (rs.next()) {
//                int id = rs.getInt(1);
//                String account = rs.getString(2);
//                double rate = rs.getDouble(3);
//                int is_active = rs.getInt(4);
//
//                int size = 0;
//                S1_cashiering.to_cashiering to = new S1_cashiering.to_cashiering(id, account, rate, is_active, 1, 0, "", "", "", "");
//                datas.add(to);
//
//                String s2 = "select "
//                        + "id"
//                        + ",account_id"
//                        + ",account"
//                        + ",cashiering_type"
//                        + ",rate"
//                        + ",is_active"
//                        + " from cashiering_types where "
//                        + " account_id ='" + id + "' "
//                        + " order by cashiering_type asc";
//
//                Statement stmt2 = conn.createStatement();
//                ResultSet rs2 = stmt2.executeQuery(s2);
//                while (rs2.next()) {
//                    int id2 = rs2.getInt(1);
//                    String account_id = rs2.getString(2);
//                    String account2 = rs2.getString(3);
//                    String cashiering_type = rs2.getString(4);
//                    double rate2 = rs2.getDouble(5);
//                    int is_active2 = rs2.getInt(6);
//                    S1_cashiering.to_cashiering to2 = new S1_cashiering.to_cashiering(id2, cashiering_type, rate2, is_active, 0, 0, "" + id, account, cashiering_type, "" + id2);
//                    datas.add(to2);
//                    size++;
//                }
//                to.setSize(size);
//            }
//            return datas;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            MyConnection.close();
//        }
//    }
//
//    public static List<to_receipts> ret_receipts(String where) {
//        List<to_receipts> datas = new ArrayList();
//
//        try {
//            Connection conn = MyConnection.connect();
//            String s0 = "select "
//                    + "id"
//                    + ",or_no"
//                    + ",or_date"
//                    + ",date_added"
//                    + ",or_time"
//                    + ",user_name"
//                    + ",terminal_id"
//                    + ",amount_due"
//                    + ",cash"
//                    + ",check_amount"
//                    + ",check_no"
//                    + ",check_holder"
//                    + ",message"
//                    + ",parishioner"
//                    + ",parishioner_id"
//                    + ",parioshioner_contact_no"
//                    + ",account_name"
//                    + ",account_id"
//                    + ",account_type"
//                    + ",account_type_id"
//                    + ",status"
//                    + " from receipts  "
//                    + " " + where;
//
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(s0);
//            while (rs.next()) {
//                int id = rs.getInt(1);
//                String or_no = rs.getString(2);
//                String or_date = rs.getString(3);
//                String date_added = rs.getString(4);
//                String or_time = rs.getString(5);
//                String user_name = rs.getString(6);
//                String terminal_id = rs.getString(7);
//                double amount_due = rs.getDouble(8);
//                double cash = rs.getDouble(9);
//                double check_amount = rs.getDouble(10);
//                String check_no = rs.getString(11);
//                String check_holder = rs.getString(12);
//                String message = rs.getString(13);
//                String parishioner = rs.getString(14);
//                String parishioner_id = rs.getString(15);
//                String parioshioner_contact_no = rs.getString(16);
//                String account_name = rs.getString(17);
//                String account_id = rs.getString(18);
//                String account_type = rs.getString(19);
//                String account_type_id = rs.getString(20);
//                String status = rs.getString(21);
//
//                to_receipts to = new to_receipts(id, or_no, or_date, date_added, or_time, user_name, terminal_id, amount_due, cash, check_amount, check_no, check_holder, message, parishioner, parishioner_id, parioshioner_contact_no, account_name, account_id, account_type, account_type_id, status);
//                datas.add(to);
//            }
//            return datas;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            MyConnection.close();
//        }
//    }
//
//}

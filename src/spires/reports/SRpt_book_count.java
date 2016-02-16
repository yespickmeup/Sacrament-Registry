/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.reports;

import SR.main.Main;

import spires.util.MyConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
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
 * @author i1
 */
public class SRpt_book_count {

    public final List<field> fields;

    public SRpt_book_count() {
        this.fields = new ArrayList();
    }

    public static class field {

        String book_no;
        String years;
        int no_of_records;

        public field() {
        }

        public field(String book_no, String years, int no_of_records) {
            this.book_no = book_no;
            this.years = years;
            this.no_of_records = no_of_records;
        }

        public String getBook_no() {
            return book_no;
        }

        public void setBook_no(String book_no) {
            this.book_no = book_no;
        }

        public int getNo_of_records() {
            return no_of_records;
        }

        public void setNo_of_records(int no_of_records) {
            this.no_of_records = no_of_records;
        }

        public String getYears() {
            return years;
        }

        public void setYears(String years) {
            this.years = years;
        }
    }

    public static void main(String[] args) {

      
        List<SRpt_book_count.field> fields = ret_data();
//        for (int i = 0; i < 100; i++) {
//            String book_no = "book " + i;
//            String years = "2013-1030";
//            int no_of_records = 1000 + i;
//            SRpt_book_count.field tbar = new SRpt_book_count.field(book_no, years, no_of_records);
//            fields.add(tbar);
//        }
        SRpt_book_count rpt = new SRpt_book_count();
        rpt.fields.addAll(fields);

        JRViewer viewer = SRpt_book_count.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void pdf_view(SRpt_book_count to) {

        JasperUtil.pdfViewer(
                JasperUtil.getJasper(SRpt_book_count.class),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static JRViewer get_viewer(SRpt_book_count to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));

    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_book_count.jrxml";
            InputStream is = SRpt_book_count.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<SRpt_book_count.field> ret_data() {
        List<SRpt_book_count.field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "years"
                    + ",book_no"
                    + " from book_archives "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String years = rs.getString(1);
                String book_no = rs.getString(2);
                String s2 = "select count(id) from db_bulletin.parishioners_1 where b_book_no='" + book_no + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                int count = 0;
                if (rs2.next()) {
                    count = rs2.getInt(1);
                }
                SRpt_book_count.field to = new SRpt_book_count.field(book_no, years, count);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

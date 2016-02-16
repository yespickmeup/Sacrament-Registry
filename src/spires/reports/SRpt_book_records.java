/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.reports;


import spires.parishioners.S1_baptism.to_parishioners_1;
import spires.util.MyConnection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author i1
 */
public class SRpt_book_records {

    public final List<field> fields;

    public SRpt_book_records() {
        this.fields = new ArrayList();
    }

    public static class field {

        String index_no;
        String fname;
        String mi;
        String lname;
        String b_day;
        String place_of_birth;
        String date_of_baptism;
        String minister;
        String sponsors;

        public field() {
        }

        public field(String index_no, String fname, String mi, String lname, String b_day, String place_of_birth, String date_of_baptism, String minister, String sponsors) {
            this.index_no = index_no;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.b_day = b_day;
            this.place_of_birth = place_of_birth;
            this.date_of_baptism = date_of_baptism;
            this.minister = minister;
            this.sponsors = sponsors;
        }

        public String getB_day() {
            return b_day;
        }

        public void setB_day(String b_day) {
            this.b_day = b_day;
        }

        public String getDate_of_baptism() {
            return date_of_baptism;
        }

        public void setDate_of_baptism(String date_of_baptism) {
            this.date_of_baptism = date_of_baptism;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getIndex_no() {
            return index_no;
        }

        public void setIndex_no(String index_no) {
            this.index_no = index_no;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getMi() {
            return mi;
        }

        public void setMi(String mi) {
            this.mi = mi;
        }

        public String getMinister() {
            return minister;
        }

        public void setMinister(String minister) {
            this.minister = minister;
        }

        public String getPlace_of_birth() {
            return place_of_birth;
        }

        public void setPlace_of_birth(String place_of_birth) {
            this.place_of_birth = place_of_birth;
        }

        public String getSponsors() {
            return sponsors;
        }

        public void setSponsors(String sponsors) {
            this.sponsors = sponsors;
        }
    }

    public static void main(String[] args) {
        List<SRpt_book_records.field> fields = new ArrayList();
        for (int i = 0; i < 800; i++) {
            String index_no = "" + i;
            String fname = "Ronald";
            String mi = "mi";
            String lname = "lname";
            String b_day = "feb 8,2013";
            String place_of_birth = "place of birth place of birth";
            String date_of_baptism = "march 9, 20923";
            String minister = "minsiter minster minister";
            String sponsors = "sponsor1,sponsor2,sponsor3,sponsor4,sponsor5,sponsor6,sponsor7,sponsor8";
            SRpt_book_records.field tbar = new SRpt_book_records.field(index_no, fname, mi, lname, b_day, place_of_birth, date_of_baptism, minister, sponsors);
            fields.add(tbar);
        }

        SRpt_book_records rpt = new SRpt_book_records();
        rpt.fields.addAll(fields);

        JRViewer viewer = SRpt_book_records.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void pdf_view(SRpt_book_records to) {

        JasperUtil.pdfViewer(
                JasperUtil.getJasper(SRpt_book_records.class),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

    public static JRViewer get_viewer(SRpt_book_records to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));

    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_book_records.jrxml";
            InputStream is = SRpt_book_records.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static List<SRpt_book_records.field> ret_data(String book_no) {
        List<SRpt_book_records.field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "b_index_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",date_of_birth"
                    + ",place_of_birth"
                    + ",date_of_baptism"
                    + ",b_minister"
                    + ",b_sponsors"
                    + " from parishioners_1 where "
                    + " b_book_no ='" + book_no + "' and is_baptized='" + "4" + "' order by b_index_no asc"
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {

                String index_no = rs.getString(1);
                String fname = rs.getString(2);
                String mi = rs.getString(3);
                String lname = rs.getString(4);
                String b_day = rs.getString(5);
                String place_of_birth = rs.getString(6);
                String date_of_baptism = rs.getString(7);
                String minister = rs.getString(8);
                String sponsors = rs.getString(9);
                SRpt_book_records.field tbar = new SRpt_book_records.field(index_no, fname, mi, lname, b_day, place_of_birth, date_of_baptism, minister, sponsors);
                datas.add(tbar);
            }

            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }

    }
}

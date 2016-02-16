/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.certificates;

import java.io.InputStream;
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
public class SRpt_marriage {

    public final String day;
    public final String month;
    public final String year;
    public final String priest;
    public final String asst_priest;
    public final String series_of;
    public final String g_ref_no;
    public final String b_ref_no;
    public final String g_address;
    public final String b_address;
    public final String path;
    public final String groom;
    public final String groom_father;
    public final String groom_mother;
    public final String bride;
    public final String bride_father;
    public final String bride_mother;
    public final String date_of_marriage;
    public final String marr_time;
    public final String solemnized_by;
    public final String book_number;
    public final String page_number;
    public final String date_added;
    public final String sponsors;

    public SRpt_marriage(String day, String month, String year, String priest, String asst_priest, String series_of, String g_ref_no, String b_ref_no, String g_address, String b_address, String path, String groom, String groom_father, String groom_mother, String bride, String bride_father, String bride_mother, String date_of_marriage, String marr_time, String solemnized_by, String book_number, String page_number, String date_added, String sponsors) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.priest = priest;
        this.asst_priest = asst_priest;
        this.series_of = series_of;
        this.g_ref_no = g_ref_no;
        this.b_ref_no = b_ref_no;
        this.g_address = g_address;
        this.b_address = b_address;
        this.path = path;
        this.groom = groom;
        this.groom_father = groom_father;
        this.groom_mother = groom_mother;
        this.bride = bride;
        this.bride_father = bride_father;
        this.bride_mother = bride_mother;
        this.date_of_marriage = date_of_marriage;
        this.marr_time = marr_time;
        this.solemnized_by = solemnized_by;
        this.book_number = book_number;
        this.page_number = page_number;
        this.date_added = date_added;
        this.sponsors = sponsors;
    }

    public static void main(String[] args) {

        String day = "2nd";
        String month = "March";
        String year = "2013";
        String priest = "priest";
        String asst_priest = "parochial ";
        String series_of = "2013-2014";
        String g_ref_no = "g_ref_no";
        String b_ref_no = "b_ref_no";
        String g_address = "g address";
        String b_address = "b address";
        String path = "path";
        String groom = "groom";
        String groom_father = "groom father";
        String groom_mother = "groom mother";
        String bride = "bride";
        String bride_father = "bride father";
        String bride_mother = "ried mother";
        String date_of_marriage = "date_of marriage";
        String marr_time = "marr time";
        String solemnized_by = "sol by";
        String book_number = "3A";
        String page_number = "1";
        String date_added = "date_added";
        String sponsors = "sponsor1,sponsor2";
        SRpt_marriage rpt = new SRpt_marriage(day, month, year, priest, asst_priest, series_of, g_ref_no, b_ref_no, g_address, b_address, path, groom, groom_father, groom_mother, bride, bride_father, bride_mother, date_of_marriage, marr_time, solemnized_by, book_number, page_number, date_added, sponsors);
       
        JRViewer viewer = SRpt_marriage.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_marriage.jrxml";
            InputStream is = SRpt_marriage.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void pdf_viewer(SRpt_marriage to) {

        JasperUtil.pdfViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JRViewer get_viewer(SRpt_marriage to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }
}

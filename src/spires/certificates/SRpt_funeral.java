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
public class SRpt_funeral {

    public final String num;
    public final String day;
    public final String month;
    public final String year;
    public final String priest;
    public final String asst_priest;
    public final String series_of;
    public final String path;
    public final String name;
    public final String address;
    public final String scheduled_date;
    public final String priests;
    public final String cause_of_death;
    public final String date_died;
    public final String buried_at;
    public final String book_no;
    public final String page_no;

    public SRpt_funeral(String num, String day, String month, String year, String priest, String asst_priest, String series_of, String path, String name, String address, String scheduled_date, String priests, String cause_of_death, String date_died, String buried_at, String book_no, String page_no) {
        this.num = num;
        this.day = day;
        this.month = month;
        this.year = year;
        this.priest = priest;
        this.asst_priest = asst_priest;
        this.series_of = series_of;
        this.path = path;
        this.name = name;
        this.address = address;
        this.scheduled_date = scheduled_date;
        this.priests = priests;
        this.cause_of_death = cause_of_death;
        this.date_died = date_died;
        this.buried_at = buried_at;
        this.book_no = book_no;
        this.page_no = page_no;
    }

    public static void main(String[] args) {

        String num = "num";
        String day = "2nd";
        String month = "March";
        String year = "2013";
        String priest = "priest";
        String asst_priest = "paroch";
        String series_of = "series of";
        String path = "path";
        String name = "names";
        String address = "address";
        String scheduled_date = "sched_date";
        String priests = "y";
        String cause_of_death = "cause_of";
        String date_died = "date died";
        String buried_at = "buried at";
        String book_no = "4A";
        String page_no = "1";
        SRpt_funeral rpt = new SRpt_funeral(num, day, month, year, priest, asst_priest, series_of, path, name, address, scheduled_date, priests, cause_of_death, date_died, buried_at, book_no, page_no);
        
        JRViewer viewer = SRpt_funeral.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_funeral.jrxml";
            InputStream is = SRpt_funeral.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void pdf_viewer(SRpt_funeral to) {

        JasperUtil.pdfViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JRViewer get_viewer(SRpt_funeral to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }
}

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
    public final String father;
    public final String mother;
    public final String date_of_confirmation;
    public final String book_no;
    public final String page_no;
    public final String confirmed_by;
    public final String sponsor_name;
    public final String place_of_birth;
    public final String date_of_birth;
    public final String date_of_baptism;
    public final String place_of_baptism;
    public final String purpose;
    public final String date_of_death;
    public final String age;
    public final String index_no;

    public SRpt_funeral(String num, String day, String month, String year, String priest, String asst_priest, String series_of, String path, String name, String father, String mother, String date_of_confirmation, String book_no, String page_no, String confirmed_by, String sponsor_name, String place_of_birth, String date_of_birth, String date_of_baptism, String place_of_baptism, String purpose, String date_of_death, String age, String index_no) {
        this.num = num;
        this.day = day;
        this.month = month;
        this.year = year;
        this.priest = priest;
        this.asst_priest = asst_priest;
        this.series_of = series_of;
        this.path = path;
        this.name = name;
        this.father = father;
        this.mother = mother;
        this.date_of_confirmation = date_of_confirmation;
        this.book_no = book_no;
        this.page_no = page_no;
        this.confirmed_by = confirmed_by;
        this.sponsor_name = sponsor_name;
        this.place_of_birth = place_of_birth;
        this.date_of_birth = date_of_birth;
        this.date_of_baptism = date_of_baptism;
        this.place_of_baptism = place_of_baptism;
        this.purpose = purpose;
        this.date_of_death = date_of_death;
        this.age = age;
        this.index_no = index_no;
    }

    public static void main(String[] args) {

        String num = "num";
        String day = "16th";
        String month = "April";
        String year = "16";
        String priest = "Rev. Fr. Msgr Julius Heruela";
        String asst_priest = "Rev. Fr. Msgr Julius Heruela";
        String series_of = "2016-2017";
        String path = "";
        String name = "Juan Dela Cruz";
        String father = "Juan Dela Cruz Jr.";
        String mother = "Juan Dela Cruz Jr.";
        String date_of_confirmation = "04/16/2016";
        String book_no = "100";
        String page_no = "299";
        String confirmed_by = "Rev. Fr. Msgr Julius Heruela";
        String sponsor_name = "Sponsor1, Sponsor 2, Sponsor 3";
        String place_of_birth = "Bacong, Negros Oriental, Philippines";
        String date_of_birth = "04/16/2016";
        String date_of_baptism = "04/16/2016";
        String place_of_baptism = "Bacong, Negros Oriental, Philippines";
        String purpose = "Land";
        String date_of_death = "04/16/2016";
        String age = "29 years old";
        String index_no = "400";

        SRpt_funeral rpt = new SRpt_funeral(num, day, month, year, priest, asst_priest, series_of, path, name, father, mother, date_of_confirmation, book_no, page_no, confirmed_by, sponsor_name, place_of_birth, date_of_birth, date_of_baptism, place_of_baptism, purpose, date_of_death, age, index_no);
       
        JRViewer viewer = SRpt_funeral.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_funeral_bacong.jrxml";
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

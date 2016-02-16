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
public class SRpt_funeral2 {

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
    public final String img_path;
    public final String date_of_baptism;
    public final String place_of_baptism;
    public final String purpose;
    public SRpt_funeral2(String num, String day, String month, String year, String priest
            , String asst_priest, String series_of, String path, String name, String father
            , String mother, String date_of_confirmation, String book_no, String page_no
            , String confirmed_by, String sponsor_name, String place_of_birth
            , String date_of_birth,String img_path,String date_of_baptism,String place_of_baptism,String purpose) {
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
        this.img_path=img_path;
        this.date_of_baptism=date_of_baptism;
        this.place_of_baptism=place_of_baptism;
        this.purpose=purpose;
    }

    public static void main(String[] args) {
        String num = "num";
        String day = "2nd";
        String month = "March";
        String year = "2013";
        String priest = "priest";
        String asst_priest = "parochial var";
        String series_of = "2013-2014";
        String path = "path";
        String name = "Ronald Pascua";
        String father = "father";
        String mother = "mother";
        String date_of_confirmation = "date of conf";
        String book_no = "2A";
        String page_no = "1";
        String confirmed_by = "conf by";
        String sponsor_name = "sponsor1,sponsor2,sponsro3";
        String place_of_birth = "place of b";
        String date_of_birth = "date f b";
          String img_path="C:\\Users\\Maytopacka\\";
          String date_of_baptism="";
          String place_of_baptism="";
        SRpt_funeral2 rpt = new SRpt_funeral2(num, day, month, year, priest, asst_priest, series_of
                , path, name, father, mother, date_of_confirmation, book_no, page_no, confirmed_by
                , sponsor_name, place_of_birth, date_of_birth,img_path,date_of_baptism,place_of_baptism,"");
      
        JRViewer viewer = SRpt_funeral2.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_confirmation.jrxml";
            InputStream is = SRpt_funeral2.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void pdf_viewer(SRpt_funeral2 to) {

        JasperUtil.pdfViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JRViewer get_viewer(SRpt_funeral2 to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }
}

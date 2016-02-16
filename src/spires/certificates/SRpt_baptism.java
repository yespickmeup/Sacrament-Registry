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
public class SRpt_baptism {

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
    public final String place_of_birth;
    public final String date_of_birth;
    public final String date_of_baptism;
    public final String bapt_time;
    public final String baptized_by;
    public final String book_number;
    public final String page_number;
    public final String sponsors;
    public final String index_no;
    public final String purpose;
    public final String img_path;
    public final String place_of_baptism;
    public final String parish_priest;
    
    public SRpt_baptism(String num, String day, String month, String year, String priest, String asst_priest, String series_of
            , String path, String name, String father, String mother, String place_of_birth, String date_of_birth
            , String date_of_baptism, String bapt_time, String baptized_by, String book_number, String page_number
            , String sponsors, String index_no,String purpose,String img_path,String place_of_baptism,String parish_priest) {
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
        this.place_of_birth = place_of_birth;
        this.date_of_birth = date_of_birth;
        this.date_of_baptism = date_of_baptism;
        this.bapt_time = bapt_time;
        this.baptized_by = baptized_by;
        this.book_number = book_number;
        this.page_number = page_number;
        this.sponsors = sponsors;
        this.index_no = index_no;
        this.purpose=purpose;
        this.img_path=img_path;
        this.place_of_baptism=place_of_baptism;
        this.parish_priest=parish_priest;
    }

    public static void main(String[] args) {

        String num = "ref_id";
        String day = "2nd";
        String month = "March";
        String year = "2013";
        String priest = "priest";
        String asst_priest = "PAROCHIAL VARCH";
        String series_of = "2013-2014";
        String path = "path";
        String name = "ROnald Pascua";
        String father = "father";
        String mother = "mother";
        String place_of_birth = "bplace";
        String date_of_birth = "Date of Birth";
        String date_of_baptism = "Date of Baptism";
        String bapt_time = "time";
        String baptized_by = "bapt by";
        String book_number = "1A";
        String page_number = "2";
        String sponsors = "sponsor1,sponsor2,sponsor3";
        String index_no = "1";
        String img_path="C:\\Users\\Maytopacka\\";
        String place_of_baptism="";
        String parish_priest="";
        SRpt_baptism rpt = new SRpt_baptism(num, day, month, year, priest, asst_priest, series_of, path, name, father, mother
                , place_of_birth, date_of_birth, date_of_baptism, bapt_time, baptized_by, book_number
                , page_number, sponsors, index_no,"",img_path,place_of_baptism,parish_priest);
   
        JRViewer viewer = SRpt_baptism.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_baptism.jrxml";
            InputStream is = SRpt_baptism.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void pdf_viewer(SRpt_baptism to) {

        JasperUtil.pdfViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JRViewer get_viewer(SRpt_baptism to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }
}

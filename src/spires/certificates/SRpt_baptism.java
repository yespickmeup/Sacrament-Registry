/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.certificates;

import java.io.InputStream;
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
    public final String name_of_church;
    public final String church_address;
    public final String notation;
    public final String book_series;
    public final String address_of_parents;
    
    public SRpt_baptism(String num, String day, String month, String year, String priest, String asst_priest, String series_of,
            String path, String name, String father, String mother, String place_of_birth, String date_of_birth,
            String date_of_baptism, String bapt_time, String baptized_by, String book_number, String page_number,
            String sponsors, String index_no, String purpose, String img_path, String place_of_baptism,
            String parish_priest, String name_of_church, String church_address, String notation
            , String book_series,String address_of_parents) {
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
        this.purpose = purpose;
        this.img_path = img_path;
        this.place_of_baptism = place_of_baptism;
        this.parish_priest = parish_priest;
        this.name_of_church = name_of_church;
        this.church_address = church_address;
        this.notation = notation;
        this.book_series = book_series;
        this.address_of_parents=address_of_parents;
    }

    public static void main(String[] args) {

        String num = "1";
        String day = "6th";
        String month = "March,";
        String year = "2021.";
        day=day+ " ";
        String priest = "FR. CARMELITO Q. LIMBAGA, JR.";
        String asst_priest = "PAROCHIAL VARCH";
        String series_of = "2013-2014";
        String path = "";
        String name = "MICHELLE BENSON FURTON";
        String father = "Cirilo Q. Furton";
        String mother = "Nove Benson";
        String place_of_birth = "San Jose, Negros Oriental";
        String date_of_birth = "November 3, 1999";
        String date_of_baptism = "Date of Baptism";
        String bapt_time = "time";
        String baptized_by = "Rev. Fr. Joseph Marlon A. Martinez";
        String book_number = "1A";
        String page_number = "2";
        String sponsors = "Mateo Tano";
        String index_no = "1";
        String img_path = "C:\\Users\\User\\spires\\";
        String place_of_baptism = "";
        String parish_priest = "FR. CARMELITO Q. LIMBAGA, JR.";
        String name_of_church = "SAINT NICHOLAS OF TOLENTINO PARISH";
        String church_address = "Dauin, Negros Oriental";
        String notation = "FREE TO MARRY";
        String book_series = "1995-2004";
        String address_of_parents="San Jose, Negros Oriental";
        SRpt_baptism rpt = new SRpt_baptism(num, day, month, year, priest, asst_priest, series_of, path, name, father, mother,
                                            place_of_birth, date_of_birth, date_of_baptism, bapt_time, baptized_by, book_number,
                                            page_number, sponsors, index_no, "", img_path,
                 place_of_baptism, parish_priest, name_of_church, church_address, notation, book_series,address_of_parents);
        String jrxml = "rpt_baptism_dauin.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = SRpt_baptism.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(SRpt_baptism to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

}

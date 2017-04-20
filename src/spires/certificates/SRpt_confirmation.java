/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.certificates;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import spires.util.MyConnection;

/**
 *
 * @author i1
 */
public class SRpt_confirmation {

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
    public final String date_of_death;
    public final String address_of_parents;
    public final String place_of_confirmation;
    public final String registry_no;
    public final String index_no;

    public SRpt_confirmation(String num, String day, String month, String year, String priest, String asst_priest, String series_of, String path, String name, String father, String mother, String date_of_confirmation, String book_no, String page_no, String confirmed_by, String sponsor_name, String place_of_birth, String date_of_birth, String img_path, String date_of_baptism, String place_of_baptism, String purpose, String date_of_death, String address_of_parents, String place_of_confirmation, String registry_no, String index_no
    ) {
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
        this.img_path = img_path;
        this.date_of_baptism = date_of_baptism;
        this.place_of_baptism = place_of_baptism;
        this.purpose = purpose;
        this.date_of_death = date_of_death;
        this.address_of_parents = address_of_parents;
        this.place_of_confirmation = place_of_confirmation;
        this.registry_no = registry_no;
        this.index_no = index_no;
    }

    public static void main(String[] args) {
        String num = "1";
        String day = "8th";
        String month = "April";
        String year = "2016";
        String priest = "Rev. Fr. Msgr. Julius Heruela Perpetua";
        String asst_priest = "";
        String series_of = "2016";
        String path = "";
        String name = "Juan Dela Cruz Jr.";
        String father = "Juan Dela Cruz Sr.";
        String mother = "Juanita Cruz";
        String date_of_confirmation = "March 8,2016";
        String book_no = "1A";
        String page_no = "10";
        String confirmed_by = "Rev. Fr. Msgr. Julius Heruela Perpetua";
        String sponsor_name = "Sponsor 1, Rev. Fr. Msgr. Julius Heruela Perpetua,Rev. Fr. Msgr. Julius Heruela Perpetua,Rev. Fr. Msgr. Julius Heruela Perpetua";
        String place_of_birth = "Lower Bagacay, Dumaguete City Negros Oriental";
        String date_of_birth = "April 1, 1991";
        String img_path = "";
        String date_of_baptism = "April 1, 1991";
        String place_of_baptism = "Lower Bagacay, Dumaguete City Negros Oriental";
        String purpose = "For Marriage";
        String date_of_death = "April 1,2991";
        String address_of_parents = "Lower Bagacay, Dumaguete City Negros Oriental";;
        String place_of_confirmation = "Lower Bagacay, Dumaguete City Negros Oriental";;
        String registry_no = "";
        String index_no = "1000";
        SRpt_confirmation rpt = new SRpt_confirmation(num, day, month, year, priest, asst_priest, series_of, path, name, father, mother, date_of_confirmation, book_no, page_no, confirmed_by, sponsor_name, place_of_birth, date_of_birth, img_path, date_of_baptism, place_of_baptism, purpose, date_of_death, address_of_parents, place_of_confirmation, registry_no, index_no);
        JRViewer viewer = SRpt_confirmation.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_funeral_bacong.jrxml";
            InputStream is = SRpt_confirmation.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void pdf_viewer(SRpt_confirmation to) {

        JasperUtil.pdfViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JRViewer get_viewer(SRpt_confirmation to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }
    
    public static int ret_count(String where) {
        int count = 0;
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + " count(id)"
                    + " from parishioners_1" + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                count = rs.getInt(1);

            }
            return count;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

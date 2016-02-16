/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.printing;

import spires.util.DateType;
import spires.util.MyConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
public class Srpt_print_marriage {

    public final List<Srpt_print_marriage.field> fields;
    public final String book;

    public Srpt_print_marriage(String book) {
        this.fields = new ArrayList();
        this.book = book;
    }

    public static class field {

        String index;
        String page_no;
        String groom;
        String groom_parents;
        String bride;
        String bride_parents;
        String date_of_marriage;
        String book_no;
        public field() {
        }

        public field(String index, String page_no, String groom, String groom_parents, String bride, String bride_parents, String date_of_marriage,String book_no) {
            this.index = index;
            this.page_no = page_no;
            this.groom = groom;
            this.groom_parents = groom_parents;
            this.bride = bride;
            this.bride_parents = bride_parents;
            this.date_of_marriage = date_of_marriage;
            this.book_no=book_no;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public String getPage_no() {
            return page_no;
        }

        public void setPage_no(String page_no) {
            this.page_no = page_no;
        }

        public String getGroom() {
            return groom;
        }

        public void setGroom(String groom) {
            this.groom = groom;
        }

        public String getGroom_parents() {
            return groom_parents;
        }

        public void setGroom_parents(String groom_parents) {
            this.groom_parents = groom_parents;
        }

        public String getBride() {
            return bride;
        }

        public void setBride(String bride) {
            this.bride = bride;
        }

        public String getBride_parents() {
            return bride_parents;
        }

        public void setBride_parents(String bride_parents) {
            this.bride_parents = bride_parents;
        }

        public String getDate_of_marriage() {
            return date_of_marriage;
        }

        public void setDate_of_marriage(String date_of_marriage) {
            this.date_of_marriage = date_of_marriage;
        }

    }

    public static void main(String[] args) {
        List<Srpt_print_marriage.field> fields = Srpt_print_marriage.ret_data(" where book_no=1");
        String business_name = System.getProperty("business_name", "St. Catherine of Alexandria");
        String date = DateType.month_date.format(new Date());
        String printed_by = "";
        String book = "1";
        Srpt_print_marriage rpt = new Srpt_print_marriage(book);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_print_marriage.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JRViewer get_viewer(Srpt_print_marriage to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));

    }

    public static JasperReport compileJasper(String jrxml) {
        try {
            InputStream is = Srpt_print_marriage.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Srpt_print_marriage.field> ret_data(String where) {
        List<Srpt_print_marriage.field> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",index_no"
                    + ",book_no"
                    + ",page_no"
                    + ",date_of_marriage"
                    + ",priest"
                    + ",groom"
                    + ",groom_status"
                    + ",groom_father"
                    + ",groom_mother"
                    + ",groom_address"
                    + ",bride"
                    + ",bride_status"
                    + ",bride_father"
                    + ",bride_mother"
                    + ",bride_address"
                    + ",sponsors"
                    + " from encoding_marriage  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String index_no = rs.getString(2);
                String book_no = rs.getString(3);
                String page_no = rs.getString(4);
                String date_of_marriage = rs.getString(5);
                String priest = rs.getString(6);
                String groom = rs.getString(7);
                String groom_status = rs.getString(8);
                String groom_father = rs.getString(9);
                String groom_mother = rs.getString(10);
                String groom_address = rs.getString(11);
                String bride = rs.getString(12);
                String bride_status = rs.getString(13);
                String bride_father = rs.getString(14);
                String bride_mother = rs.getString(15);
                String bride_address = rs.getString(16);
                String sponsors = rs.getString(17);

                Srpt_print_marriage.field to = new Srpt_print_marriage.field(index_no, page_no, groom, groom_father + "," + groom_mother, bride
                        , bride_father + "," + bride_mother, DateType.convert_sf_to_slash(date_of_marriage),book_no);

                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

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
public class Srpt_print_baptism {

    public final List<field> fields;
    public final String business_name;
    public final String date;
    public final String printed_by;

    public Srpt_print_baptism(String business_name, String date, String printed_by) {
        this.fields = new ArrayList();
        this.business_name = business_name;
        this.date = date;
        this.printed_by = printed_by;
    }

    public static class field {

        String ref_no;
        String fname;
        String mname;
        String lname;
        String mother;
        String father;
        String book_no;
        String page_no;
        String index_no;
        String sponsors;
        String baptism_date;
        String confirmation_date;
        String priest;
        String place_of_birth;
        String date_of_birth;
        String id;
        String remarks;
        String place_of_baptism;
        String parish_priest;

        public field() {
        }

        public field(String ref_no, String fname, String mname, String lname, String mother, String father, String book_no,
                String page_no, String index_no, String sponsors, String baptism_date, String confirmation_date, String priest,
                String place_of_birth, String date_of_birth, String id, String remarks, String place_of_baptism, String parish_priest) {
            this.ref_no = ref_no;
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
            this.mother = mother;
            this.father = father;
            this.book_no = book_no;
            this.page_no = page_no;
            this.index_no = index_no;
            this.sponsors = sponsors;
            this.baptism_date = baptism_date;
            this.confirmation_date = confirmation_date;
            this.priest = priest;
            this.place_of_birth = place_of_birth;
            this.date_of_birth = date_of_birth;
            this.id = id;
            this.remarks = remarks;
            this.place_of_baptism = place_of_baptism;
            this.parish_priest = parish_priest;
        }

        public String getParish_priest() {
            return parish_priest;
        }

        public void setParish_priest(String parish_priest) {
            this.parish_priest = parish_priest;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getRef_no() {
            return ref_no;
        }

        public void setRef_no(String ref_no) {
            this.ref_no = ref_no;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getMname() {
            return mname;
        }

        public void setMname(String mname) {
            this.mname = mname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getMother() {
            return mother;
        }

        public void setMother(String mother) {
            this.mother = mother;
        }

        public String getFather() {
            return father;
        }

        public void setFather(String father) {
            this.father = father;
        }

        public String getBook_no() {
            return book_no;
        }

        public void setBook_no(String book_no) {
            this.book_no = book_no;
        }

        public String getPage_no() {
            return page_no;
        }

        public void setPage_no(String page_no) {
            this.page_no = page_no;
        }

        public String getIndex_no() {
            return index_no;
        }

        public void setIndex_no(String index_no) {
            this.index_no = index_no;
        }

        public String getSponsors() {
            return sponsors;
        }

        public void setSponsors(String sponsors) {
            this.sponsors = sponsors;
        }

        public String getBaptism_date() {
            return baptism_date;
        }

        public void setBaptism_date(String baptism_date) {
            this.baptism_date = baptism_date;
        }

        public String getConfirmation_date() {
            return confirmation_date;
        }

        public void setConfirmation_date(String confirmation_date) {
            this.confirmation_date = confirmation_date;
        }

        public String getPriest() {
            return priest;
        }

        public void setPriest(String priest) {
            this.priest = priest;
        }

        public String getPlace_of_birth() {
            return place_of_birth;
        }

        public void setPlace_of_birth(String place_of_birth) {
            this.place_of_birth = place_of_birth;
        }

        public String getDate_of_birth() {
            return date_of_birth;
        }

        public void setDate_of_birth(String date_of_birth) {
            this.date_of_birth = date_of_birth;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPlace_of_baptism() {
            return place_of_baptism;
        }

        public void setPlace_of_baptism(String place_of_baptism) {
            this.place_of_baptism = place_of_baptism;
        }

    }

    public static void main(String[] args) {
        List<Srpt_print_baptism.field> fields = Srpt_print_baptism.ret_data("");
        String business_name = System.getProperty("business_name", "St. Catherine of Alexandria");
        String date = DateType.month_date.format(new Date());
        String printed_by = "";
        Srpt_print_baptism rpt = new Srpt_print_baptism(business_name, date, printed_by);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_print_confirmation.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JRViewer get_viewer(Srpt_print_baptism to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));

    }

    public static JasperReport compileJasper(String jrxml) {
        try {
            InputStream is = Srpt_print_baptism.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Srpt_print_baptism.field> ret_data(String where) {
        List<Srpt_print_baptism.field> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",ref_id"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",date_of_baptism"
                    + ",date_of_birth"
                    + ",place_of_birth"
                    + ",address1"
                    + ",father"
                    + ",mother"
                    + ",is_baptized"
                    + ",gender"
                    + ",bapt_place"
                    + ",b_book_no"
                    + ",b_page_no"
                    + ",b_index_no"
                    + ",b_sponsors"
                    + ",b_minister"
                    + ",b_remarks"
                    + ",bapt_place"
                    + ",b_time"
                    + " from parishioners_1  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String ref_no = rs.getString(2);
                String date_added = "";
                String user_name = "";
                String fname = rs.getString(3);
                String mi = rs.getString(4);
                String lname = rs.getString(5);
                String b_place = rs.getString(8);
                String address = rs.getString(9);
                String father = rs.getString(10);
                String mother = rs.getString(11);
                String b_day = DateType.convert_sf_to_slash(rs.getString(7));
                String conf_date = DateType.convert_sf_to_slash(rs.getString(6));
                String gender = rs.getString(13);
                String book_no = rs.getString(15);
                int page_no = rs.getInt(16);
                int index_no = rs.getInt(17);
                String priest = rs.getString(19);
                String sponsors = rs.getString(18);
                String remarks = rs.getString(20);
                String place_of_baptism = rs.getString(21);
                String bapt_date = DateType.convert_sf_to_slash(rs.getString(6));
                String bapt_place = rs.getString(14);
                int status = 1;
                String parish_priest = rs.getString(22);
                Srpt_print_baptism.field to = new field(ref_no, fname, mi, lname, mother, father, book_no,
                        "" + page_no, "" + index_no, sponsors, bapt_date, conf_date, priest, b_place,
                        b_day, "" + id, remarks, place_of_baptism, parish_priest);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
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

    public static List<Srpt_print_baptism.field> ret_books(String where) {
        List<Srpt_print_baptism.field> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "count(id)"
                    + ",b_book_no"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",date_of_baptism"
                    + ",date_of_birth"
                    + ",place_of_birth"
                    + ",address1"
                    + ",father"
                    + ",mother"
                    + ",is_baptized"
                    + ",gender"
                    + ",bapt_place"
                    + ",b_book_no"
                    + ",b_page_no"
                    + ",b_index_no"
                    + ",b_sponsors"
                    + ",b_minister"
                    + ",b_remarks"
                    + ",bapt_place"
                    + ",b_time"
                    + " from parishioners_1  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String ref_no = rs.getString(2);
                String date_added = "";
                String user_name = "";
                String fname = rs.getString(3);
                String mi = rs.getString(4);
                String lname = rs.getString(5);
                String b_place = rs.getString(8);
                String address = rs.getString(9);
                String father = rs.getString(10);
                String mother = rs.getString(11);
                String b_day = DateType.convert_sf_to_slash(rs.getString(7));
                String conf_date = DateType.convert_sf_to_slash(rs.getString(6));
                String gender = rs.getString(13);
                String book_no = rs.getString(15);
                int page_no = rs.getInt(16);
                int index_no = rs.getInt(17);
                String priest = rs.getString(19);
                String sponsors = rs.getString(18);
                String remarks = rs.getString(20);
                String place_of_baptism = rs.getString(21);
                String bapt_date = DateType.convert_sf_to_slash(rs.getString(6));
                String bapt_place = rs.getString(14);
                int status = 1;
                String parish_priest = rs.getString(22);
                Srpt_print_baptism.field to = new field(ref_no, fname, mi, lname, mother, father, book_no,
                        "" + page_no, "" + index_no, sponsors, bapt_date, conf_date, priest, b_place,
                        b_day, "" + id, remarks, place_of_baptism, parish_priest);
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

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
public class Srpt_print_funeral {

    public final List<Srpt_print_funeral.field> fields;
    public final String business_name;
    public final String date;
    public final String printed_by;

    public Srpt_print_funeral(String business_name, String date, String printed_by) {
        this.fields = new ArrayList();
        this.business_name = business_name;
        this.date = date;
        this.printed_by = printed_by;
    }

    public static class field {

        String index_no;
        String book_no;
        String page_no;
        String date_of_burial;
        String price;
        String fname;
        String mi;
        String lname;
        String residence;
        String informant;
        String id;
        String remarks;
        String date_of_death;
        String age;
        String father;
        String mother;
        String parents;

        public field() {
        }

        public field(String index_no, String book_no, String page_no, String date_of_burial, String price, String fname, String mi,
                 String lname, String residence, String informant, String id, String remarks,
                 String date_of_death, String age, String father, String mother, String parents) {
            this.index_no = index_no;
            this.book_no = book_no;
            this.page_no = page_no;
            this.date_of_burial = date_of_burial;
            this.price = price;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.residence = residence;
            this.informant = informant;
            this.id = id;
            this.remarks = remarks;
            this.date_of_death = date_of_death;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.parents = parents;
        }

        public String getParents() {
            return parents;
        }

        public void setParents(String parents) {
            this.parents = parents;
        }

        public String getFather() {
            return father;
        }

        public void setFather(String father) {
            this.father = father;
        }

        public String getMother() {
            return mother;
        }

        public void setMother(String mother) {
            this.mother = mother;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getIndex_no() {
            return index_no;
        }

        public void setIndex_no(String index_no) {
            this.index_no = index_no;
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

        public String getDate_of_burial() {
            return date_of_burial;
        }

        public void setDate_of_burial(String date_of_burial) {
            this.date_of_burial = date_of_burial;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getMi() {
            return mi;
        }

        public void setMi(String mi) {
            this.mi = mi;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getResidence() {
            return residence;
        }

        public void setResidence(String residence) {
            this.residence = residence;
        }

        public String getInformant() {
            return informant;
        }

        public void setInformant(String informant) {
            this.informant = informant;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getDate_of_death() {
            return date_of_death;
        }

        public void setDate_of_death(String date_of_death) {
            this.date_of_death = date_of_death;
        }

    }

    public static void main(String[] args) {
        List<Srpt_print_funeral.field> fields = Srpt_print_funeral.ret_data("");
        String business_name = System.getProperty("business_name", "St. Catherine of Alexandria");
        String date = DateType.month_date.format(new Date());
        String printed_by = "";
        Srpt_print_funeral rpt = new Srpt_print_funeral(business_name, date, printed_by);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_print_funeral.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JRViewer get_viewer(Srpt_print_funeral to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));

    }

    public static JasperReport compileJasper(String jrxml) {
        try {
            InputStream is = Srpt_print_funeral.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Srpt_print_funeral.field> ret_data(String where) {
        List<Srpt_print_funeral.field> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",index_no"
                    + ",book_no"
                    + ",page_no"
                    + ",date_of_burial"
                    + ",priest"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",residence"
                    + ",informant"
                    + ",date_added"
                    + ",user_name"
                    + ",remarks"
                    + ",date_of_burial2"
                    + ",age"
                    + ",father"
                    + ",mother"
                    + ",parents"
                    + " from encoding_funeral2 "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String index_no = rs.getString(2);
                String book_no = rs.getString(3);
                String page_no = rs.getString(4);
                String date_of_burial = DateType.convert_sf_to_slash(rs.getString(5));
                String priest = rs.getString(6);
                String fname = rs.getString(7);
                String mi = rs.getString(8);
                if (mi.equals("n/a")) {
                    mi = "";
                }
                String lname = rs.getString(9);
                String residence = rs.getString(10);
                String informant = rs.getString(11);
                String date_added = rs.getString(12);
                String user_name = rs.getString(13);
                String remarks = rs.getString(14);
                String date_of_death = rs.getString(15);
                String age = rs.getString(16);
                String father = rs.getString(17);
                String mother = rs.getString(18);
                String parents = rs.getString(19);
                Srpt_print_funeral.field to = new field(index_no, book_no, page_no, date_of_burial, priest,
                         fname, mi, lname, residence, informant, "" + id, remarks, date_of_death, age, father, mother, parents);

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
                    + " from encoding_funeral2" + where;

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

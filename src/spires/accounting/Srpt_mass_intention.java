/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.accounting;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import spires.receipts.Receipts;
import spires.util.DateType;

/**
 *
 * @author Maytopacka
 */
public class Srpt_mass_intention {

    public final List<Srpt_mass_intention.field> fields;
    public final String business_name;
    public final String address;

    public Srpt_mass_intention(String business_name, String address) {
        this.business_name = business_name;
        this.address = address;
        this.fields = new ArrayList();

    }

    public static class field {

        String datetime;
        String particular;
        String parishioner;
        String remarks;

        public field() {
        }

        public field(String datetime, String particular, String parishioner, String remarks) {
            this.datetime = datetime;
            this.particular = particular;
            this.parishioner = parishioner;
            this.remarks = remarks;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public String getParticular() {
            return particular;
        }

        public void setParticular(String particular) {
            this.particular = particular;
        }

        public String getParishioner() {
            return parishioner;
        }

        public void setParishioner(String parishioner) {
            this.parishioner = parishioner;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

    }

    public static void main(String[] args) {

        String where = "   where particular_account = 'Mass Intentions' order by concat(Date(or_date),or_time),particular asc ";
        List<Receipts.to_receipts> datas = Receipts.ret_data(where);
        List<Srpt_mass_intention.field> fields = new ArrayList();
        for (Receipts.to_receipts to : datas) {
            String datetime = DateType.convert_jan_1_2013_date_rep2(to.or_date) + " - " + to.or_time;
            String particular = to.particular;
            String parishioner = to.parishioner;
            String remarks = to.message;
            Srpt_mass_intention.field field = new field(datetime, particular, parishioner, remarks);
            fields.add(field);
        }
        String name = System.getProperty("business_name", "");
        String address = System.getProperty("address", "");
        Srpt_mass_intention rpt = new Srpt_mass_intention(name, address);
        rpt.fields.addAll(fields);
        JRViewer viewer = Srpt_mass_intention.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_mass_register.jrxml";
            InputStream is = Srpt_mass_intention.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void pdf_viewer(Srpt_mass_intention to) {

        JasperUtil.pdfViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JRViewer get_viewer(Srpt_mass_intention to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));

    }
}

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
import spires.cashiering.Cashiering_types;
import spires.certificates.SRpt_marriage;

/**
 *
 * @author Maytopacka
 */
public class Srpt_account_titles {

    public final List<field> fields;
    public final String business_name;
    public final String address;
    
    public Srpt_account_titles(String business_name,String address) {
        this.business_name=business_name;
        this.address=address;
        this.fields = new ArrayList();
    }

    public static class field {

        String classification;
        String category;
        String particular;

        public field(String classification, String category, String particular) {
            this.classification = classification;
            this.category = category;
            this.particular = particular;
        }

        public field() {
        }

        public String getClassification() {
            return classification;
        }

        public void setClassification(String classification) {
            this.classification = classification;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getParticular() {
            return particular;
        }

        public void setParticular(String particular) {
            this.particular = particular;
        }

    }

    public static void main(String[] args) {

        String where = "   order by account,cashiering_type asc ";
        List<Cashiering_types.to_cashiering_types> datas = Cashiering_types.ret_data(where);
        List<Srpt_account_titles.field> fields = new ArrayList();
        for (Cashiering_types.to_cashiering_types to : datas) {
            String classification=to.account;
            String category=to.accounting_account_type;
            String particular=to.cashiering_type;
            Srpt_account_titles.field field=new field(classification, category, particular);
            fields.add(field);
        }
          String name = System.getProperty("business_name", "");
        String address = System.getProperty("address", "");
        Srpt_account_titles rpt = new Srpt_account_titles(name,address);
        rpt.fields.addAll(fields);
        JRViewer viewer = Srpt_account_titles.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_account_titles.jrxml";
            InputStream is = Srpt_account_titles.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void pdf_viewer(Srpt_account_titles to) {

        JasperUtil.pdfViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JRViewer get_viewer(Srpt_account_titles to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));

    }
}

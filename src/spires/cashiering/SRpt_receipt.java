/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.cashiering;

import spires.certificates.SRpt_baptism;
import java.io.InputStream;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Maytopacka
 */
public class SRpt_receipt {

    public final String trasaction;
    public final String date;
    public final String time;
    public final String name;
    public final String message;
    public final String amount_in_words;
    public final double amount;
    public final String trans;
    public final String or_number;

    public SRpt_receipt(String trasaction, String date, String time, String name, String message, String amount_in_words, double amount, String trans, String or_number) {
        this.trasaction = trasaction;
        this.date = date;
        this.time = time;
        this.name = name;
        this.message = message;
        this.amount_in_words = amount_in_words;
        this.amount = amount;
        this.trans = trans;
        this.or_number = or_number;
    }

    public double getAmount() {
        return amount;
    }

    public String getAmount_in_words() {
        return amount_in_words;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getTrasaction() {
        return trasaction;
    }

    public String getOr_number() {
        return or_number;
    }

    public String getTrans() {
        return trans;
    }

    public static void main(String[] args) {

        String trasaction = "trans";
        String date = ":dasd";
        String time = "asd";
        String name = "asdasd";
        String message = "asdasd";
        String amount_in_words = "asd";
        double amount = 0;
        SRpt_receipt rpt = new SRpt_receipt(trasaction, date, time, name, message, amount_in_words, amount, trasaction, "asdasd");

        JRViewer viewer = SRpt_receipt.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_receipt.jrxml";
            InputStream is = SRpt_receipt.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void pdf_viewer(SRpt_receipt to) {

        JasperUtil.pdfViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JRViewer get_viewer(SRpt_receipt to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }
}

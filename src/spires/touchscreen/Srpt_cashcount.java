/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.touchscreen;

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
 * @author Ronald
 */
public class Srpt_cashcount {

    public final double cashin;
    public final double thousand;
    public final double five_hundred;
    public final double two_hundred;
    public final double one_hundred;
    public final double fifty;
    public final double twenty;
    public final double coins;
    public final String prepared_by;
    public final String approved_by;
    public final double total_cash;
    public final double total_disbursements;
    public final String date;

    public Srpt_cashcount(double cashin, double thousand, double five_hundred, double two_hundred, double one_hundred, double fifty, double twenty, double coins, String prepared_by, String approved_by, double total_cash, double total_disbursements, String date) {
        this.cashin = cashin;
        this.thousand = thousand;
        this.five_hundred = five_hundred;
        this.two_hundred = two_hundred;
        this.one_hundred = one_hundred;
        this.fifty = fifty;
        this.twenty = twenty;
        this.coins = coins;
        this.prepared_by = prepared_by;
        this.approved_by = approved_by;
        this.total_cash = total_cash;
        this.total_disbursements = total_disbursements;
        this.date = date;
    }

    public static void main(String[] args) {

        double cashin = 0;
        double thousand = 0;
        double five_hundred = 0;
        double two_hundred = 0;
        double one_hundred = 0;
        double fifty = 0;
        double twenty = 0;
        double coins = 0;
        String prepared_by = "";
        String approved_by = "";
        double total_cash = 0;
        double total_disbursements = 0;
        String date = "";
        Srpt_cashcount rpt = new Srpt_cashcount(cashin, thousand, five_hundred, two_hundred, one_hundred, fifty, twenty, coins, prepared_by, approved_by, total_cash, total_disbursements, date);
       
        JRViewer viewer = Srpt_cashcount.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void pdf_view(Srpt_cashcount to) {

        JasperUtil.pdfViewer(
                JasperUtil.getJasper(Srpt_cashcount.class),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

    public static JRViewer get_viewer(Srpt_cashcount to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_cashcount.jrxml";
            InputStream is = Srpt_cashcount.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
}

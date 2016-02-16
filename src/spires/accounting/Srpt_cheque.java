/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.accounting;

import spires.util.MyConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class Srpt_cheque {

    public final String date;
    public final String payee;
    public final String amount;
    public final String amount_in_words;
    public Srpt_cheque(String date, String payee, String amount, String amount_in_words) {
        this.date = date;
        this.payee = payee;
        this.amount = amount;
        this.amount_in_words = amount_in_words;
    }
    public static void main(String[] args) {
        String date = "04/20/2014";
        String payee = "Ronald Pascua";
        String amount = "10,000.00";
        String amount_in_words = "Ten Thousand Pesos only";
        Srpt_cheque rpt = new Srpt_cheque(date, payee, amount, amount_in_words);
        String jrxml = "rpt_cheque.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static JasperReport compileJasper(String jrxml) {
        try {
            InputStream is = Srpt_cheque.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_cheque to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

}

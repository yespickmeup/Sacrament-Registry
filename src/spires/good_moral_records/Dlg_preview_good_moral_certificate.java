package spires.good_moral_records;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPrintElement;
import net.sf.jasperreports.engine.JRPrintImage;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.swing.JRViewerToolbar;

public class Dlg_preview_good_moral_certificate extends JDialog {
    private static final int COMPLETE_PREVIEW = 0;
    private static final int BLANK_PREPRINT = 1;
    private static final int DETAILS_ONLY = 2;
    private GoodMoralRecord certificateData;
    private String signingPriest = "";
    private String signingDesignation = "";
    private JasperReport compiledReport;
    private JPanel previewPanel;
    private JComboBox viewMode;
    private JButton printDetailsButton;
    private JButton testPrintButton;
    private JSpinner horizontalOffset;
    private JSpinner verticalOffset;
    private JLabel modeLabel;
    private final Preferences alignment = Preferences.userNodeForPackage(
            Dlg_preview_good_moral_certificate.class);

    public Dlg_preview_good_moral_certificate(java.awt.Frame parent, boolean modal) {
        super(parent, modal); initialize();
    }

    public Dlg_preview_good_moral_certificate(java.awt.Dialog parent, boolean modal) {
        super(parent, modal); initialize();
    }

    public static Dlg_preview_good_moral_certificate create(Window parent, boolean modal) {
        if (parent instanceof java.awt.Frame) {
            return new Dlg_preview_good_moral_certificate((java.awt.Frame) parent, modal);
        }
        return new Dlg_preview_good_moral_certificate((java.awt.Dialog) parent, modal);
    }

    private void initialize() {
        setTitle("Good moral character certificate preview");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel content = new JPanel(new BorderLayout());
        content.setBackground(Color.WHITE);
        JPanel toolbar = new JPanel(new BorderLayout());
        toolbar.setBackground(new Color(245, 247, 250));
        toolbar.setBorder(BorderFactory.createEmptyBorder(3, 8, 3, 8));
        JPanel previewRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 4));
        previewRow.setOpaque(false);
        previewRow.add(new JLabel("View:"));
        viewMode = new JComboBox(new String[] {
            "Completed certificate", "Blank form + signing priest", "Recipient details only"
        });
        viewMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { refreshPreview(); }
        });
        previewRow.add(viewMode);
        modeLabel = new JLabel(); previewRow.add(modeLabel);

        JPanel alignmentRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 4));
        alignmentRow.setOpaque(false);
        horizontalOffset = new JSpinner(new SpinnerNumberModel(
                alignment.getDouble("good_moral.horizontal.mm", 0.0), -10.0, 10.0, 0.5));
        verticalOffset = new JSpinner(new SpinnerNumberModel(
                alignment.getDouble("good_moral.vertical.mm", 0.0), -10.0, 10.0, 0.5));
        ChangeListener changed = new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                alignment.putDouble("good_moral.horizontal.mm", offset(horizontalOffset));
                alignment.putDouble("good_moral.vertical.mm", offset(verticalOffset));
                refreshPreview();
            }
        };
        horizontalOffset.addChangeListener(changed); verticalOffset.addChangeListener(changed);
        alignmentRow.add(new JLabel("Text alignment:"));
        alignmentRow.add(new JLabel("Right/left (mm):")); alignmentRow.add(horizontalOffset);
        alignmentRow.add(new JLabel("Down/up (mm):")); alignmentRow.add(verticalOffset);

        JPanel printRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 4));
        printRow.setOpaque(false);
        JButton preprint = new JButton("Pre-print blank certificate...");
        preprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { printCertificate(BLANK_PREPRINT, false); }
        });
        testPrintButton = new JButton("Test on blank paper...");
        testPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { printCertificate(DETAILS_ONLY, true); }
        });
        printDetailsButton = new JButton("Print details only...");
        printDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { printCertificate(DETAILS_ONLY, false); }
        });
        JButton close = new JButton("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { dispose(); }
        });
        printRow.add(preprint); printRow.add(testPrintButton);
        printRow.add(printDetailsButton); printRow.add(close);
        toolbar.add(previewRow, BorderLayout.NORTH);
        JPanel lower = new JPanel(new BorderLayout()); lower.setOpaque(false);
        lower.add(alignmentRow, BorderLayout.NORTH); lower.add(printRow, BorderLayout.SOUTH);
        toolbar.add(lower, BorderLayout.SOUTH);
        previewPanel = new JPanel(new BorderLayout());
        content.add(toolbar, BorderLayout.NORTH); content.add(previewPanel, BorderLayout.CENTER);
        setContentPane(content); setSize(1100, 800);
        KeyMapping.mapKeyWIFW(content, KeyEvent.VK_ESCAPE, new KeyAction() {
            public void actionPerformed(ActionEvent event) { dispose(); }
        });
    }

    public void do_pass(GoodMoralRecord record) {
        certificateData = record; signingPriest = record.signingPriest;
        signingDesignation = record.priestDesignation; compiledReport = null;
        testPrintButton.setEnabled(true); printDetailsButton.setEnabled(true);
        viewMode.setSelectedIndex(COMPLETE_PREVIEW); refreshPreview();
    }

    public void do_pass_preprint(String priest, String designation) {
        certificateData = null; signingPriest = priest; signingDesignation = designation;
        compiledReport = null; testPrintButton.setEnabled(false); printDetailsButton.setEnabled(false);
        viewMode.setSelectedIndex(BLANK_PREPRINT); refreshPreview();
    }

    private void refreshPreview() {
        if (viewMode == null) { return; }
        int mode = viewMode.getSelectedIndex();
        modeLabel.setText(mode == BLANK_PREPRINT ? "First print: no recipient information"
                : mode == DETAILS_ONLY ? "Second print: recipient details without the priest"
                : "Preview of the finished certificate");
        try {
            JasperPrint filled = fillCertificate(mode);
            previewPanel.removeAll(); previewPanel.add(new SafeViewer(filled), BorderLayout.CENTER);
            previewPanel.revalidate(); previewPanel.repaint();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Certificate preview failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void printCertificate(int mode, boolean testPaper) {
        if (mode == DETAILS_ONLY && certificateData == null) { return; }
        int choice = JOptionPane.showConfirmDialog(this,
                mode == BLANK_PREPRINT
                ? "Load blank A4 paper. This prints the certificate form and signing priest, without recipient information."
                : testPaper
                ? "Load blank A4 paper. Only recipient details will be printed for alignment testing."
                : "Load the signed, preprinted A4 certificate. Only recipient details will be printed.",
                "Print certificate", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (choice != JOptionPane.OK_OPTION) { return; }
        try { JasperPrintManager.printReport(fillCertificate(mode), true); }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Certificate printing failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    private JasperPrint fillCertificate(int mode) throws JRException {
        if (compiledReport == null) {
            InputStream template = getClass().getResourceAsStream(
                    "/spires/certificates/rpt_good_moral_certificate_2025.jrxml");
            if (template == null) { throw new JRException("The good moral certificate report is missing."); }
            compiledReport = JasperCompileManager.compileReport(template);
        }
        boolean showPaper = mode != DETAILS_ONLY;
        Map parameters = new HashMap();
        parameters.put("show_background", Boolean.valueOf(showPaper));
        parameters.put("show_recipient", Boolean.valueOf(mode != BLANK_PREPRINT));
        parameters.put("show_priest", Boolean.valueOf(showPaper));
        parameters.put("priest", signingPriest);
        parameters.put("designation", signingDesignation);
        parameters.put("protocol_no", certificateData == null ? "" : certificateData.protocolNo);
        parameters.put("body_text", certificateData == null ? "" : bodyText(certificateData));
        parameters.put("issue_text", certificateData == null ? "" : issueText(certificateData));
        InputStream background = showPaper ? getClass().getResourceAsStream(
                "/spires/certificates/good_moral_blank.png") : null;
        if (showPaper && background == null) { throw new JRException("The certificate background is missing."); }
        parameters.put("background_image", background);
        JasperPrint filled = JasperFillManager.fillReport(compiledReport, parameters,
                JasperUtil.emptyDatasource());
        shiftDetails(filled, showPaper); return filled;
    }

    private String bodyText(GoodMoralRecord record) {
        boolean woman = "Woman".equalsIgnoreCase(record.sex);
        String gender = woman ? "woman" : "man";
        String pronoun = woman ? "her" : "him";
        return "This is to certify that <style isBold=\"true\">" + escape(record.personName.toUpperCase())
                + "</style>, who resides at <style isBold=\"true\">"
                + escape(record.residence.toUpperCase()) + "</style> and a parishioner of this parish "
                + "is known to be a <style isUnderline=\"true\">" + gender
                + "</style> of good moral character and sincere integrity. This certification is given for "
                + escape(record.purpose) + " it may serve <style isUnderline=\"true\">"
                + pronoun + "</style> best.";
    }

    private String issueText(GoodMoralRecord record) {
        Calendar calendar = Calendar.getInstance(); calendar.setTime(record.issuedOn);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String month = new SimpleDateFormat("MMMM").format(record.issuedOn);
        int year = calendar.get(Calendar.YEAR);
        return "Given this <style isBold=\"true\">" + day + ordinal(day).toUpperCase()
                + " day of " + month + " in the year of the Lord " + yearInWords(year)
                + "</style> at the Parish of St. Augustine of Hippo, Bacong, Negros Oriental, "
                + "Diocese of Dumaguete, PHILIPPINES.";
    }

    private String ordinal(int day) {
        if (day >= 11 && day <= 13) { return "th"; }
        switch (day % 10) { case 1: return "st"; case 2: return "nd"; case 3: return "rd"; default: return "th"; }
    }

    private String yearInWords(int year) {
        if (year < 2000 || year > 2099) { return Integer.toString(year); }
        int rest = year - 2000;
        return rest == 0 ? "two thousand" : "two thousand and " + underHundred(rest);
    }

    private String underHundred(int number) {
        String[] small = {"zero","one","two","three","four","five","six","seven","eight","nine",
            "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if (number < 20) { return small[number]; }
        return tens[number / 10] + (number % 10 == 0 ? "" : " " + small[number % 10]);
    }

    private String escape(String value) {
        if (value == null) { return ""; }
        return value.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")
                .replace("\"", "&quot;").replace("'", "&apos;");
    }

    private double offset(JSpinner spinner) { return ((Number) spinner.getValue()).doubleValue(); }

    private void shiftDetails(JasperPrint filled, boolean showPaper) {
        int x = (int) Math.round(offset(horizontalOffset) * 72.0 / 25.4);
        int y = (int) Math.round(offset(verticalOffset) * 72.0 / 25.4);
        for (JRPrintPage page : filled.getPages()) {
            for (JRPrintElement element : page.getElements()) {
                if (showPaper && element instanceof JRPrintImage) { continue; }
                element.setX(element.getX() + x); element.setY(element.getY() + y);
            }
        }
    }

    private static class SafeViewer extends JRViewer {
        SafeViewer(JasperPrint report) { super(report); }
        protected JRViewerToolbar createToolbar() {
            return new JRViewerToolbar(viewerContext) {{ btnPrint.setVisible(false); btnSave.setVisible(false); }};
        }
    }
}

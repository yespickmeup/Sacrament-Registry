/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spires.confirmation_records;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.prefs.Preferences;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JRPrintElement;
import net.sf.jasperreports.engine.JRPrintImage;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.swing.JRViewerToolbar;
import spires.certificates.SRpt_confirmation;

/**
 *
 * @author Maytopacka
 */
public class Dlg_preview_confirmation_certificate extends javax.swing.JDialog {

    /** Creates new form Dlg_preview_confirmation_certificate */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;


}

    public static interface Callback {

    void ok(CloseDialog closeDialog, OutputData data);
}

public static class InputData {
}

public static class OutputData {
}
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
private Dlg_preview_confirmation_certificate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_preview_confirmation_certificate(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_preview_confirmation_certificate() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_preview_confirmation_certificate myRef;

    private void setThisRef(Dlg_preview_confirmation_certificate myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_preview_confirmation_certificate> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_preview_confirmation_certificate create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_preview_confirmation_certificate create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_preview_confirmation_certificate dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_preview_confirmation_certificate((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_preview_confirmation_certificate dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_preview_confirmation_certificate((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Dlg_preview_confirmation_certificate dialog = Dlg_preview_confirmation_certificate.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jPanel1 = new javax.swing.JPanel();
    pnl_mass_register = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

    javax.swing.GroupLayout pnl_mass_registerLayout = new javax.swing.GroupLayout(pnl_mass_register);
    pnl_mass_register.setLayout(pnl_mass_registerLayout);
    pnl_mass_registerLayout.setHorizontalGroup(
      pnl_mass_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 858, Short.MAX_VALUE)
    );
    pnl_mass_registerLayout.setVerticalGroup(
      pnl_mass_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 572, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(pnl_mass_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(pnl_mass_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel pnl_mass_register;
  // End of variables declaration//GEN-END:variables
    private SRpt_confirmation certificateData;
    private String reportName;
    private JasperReport compiledReport;
    private static final int COMPLETE_PREVIEW = 0;
    private static final int BLANK_PREPRINT = 1;
    private static final int DETAILS_ONLY = 2;
    private JComboBox viewMode;
    private JButton preprintButton;
    private JButton printDetailsButton;
    private JButton testPrintButton;
    private JSpinner horizontalOffset;
    private JSpinner verticalOffset;
    private JLabel modeLabel;
    private String signingPriest;
    private String signingDesignation;
    private final Preferences alignment = Preferences.userNodeForPackage(
            Dlg_preview_confirmation_certificate.class);

    private void myInit() {
        setTitle("Confirmation certificate preview");
        JPanel content = new JPanel(new BorderLayout(0, 0));
        content.setBackground(Color.WHITE);
        JPanel toolbar = new JPanel(new BorderLayout());
        toolbar.setBackground(new Color(245, 247, 250));
        toolbar.setBorder(BorderFactory.createEmptyBorder(3, 8, 3, 8));
        JPanel previewRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 4));
        previewRow.setOpaque(false);
        JPanel alignmentRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 4));
        alignmentRow.setOpaque(false);
        JPanel printRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 4));
        printRow.setOpaque(false);

        previewRow.add(new JLabel("View:"));
        viewMode = new JComboBox(new String[] {
            "Completed certificate", "Blank form + signing priest", "Parishioner details only"
        });
        viewMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                refreshPreview();
            }
        });
        previewRow.add(viewMode);

        modeLabel = new JLabel("Review the completed certificate before printing");
        previewRow.add(modeLabel);

        horizontalOffset = new JSpinner(new SpinnerNumberModel(
                alignment.getDouble("confirmation.horizontal.mm", 0.0), -10.0, 10.0, 0.5));
        verticalOffset = new JSpinner(new SpinnerNumberModel(
                alignment.getDouble("confirmation.vertical.mm", 0.0), -10.0, 10.0, 0.5));
        horizontalOffset.setToolTipText("Positive moves printed details right; negative moves them left");
        verticalOffset.setToolTipText("Positive moves printed details down; negative moves them up");
        ChangeListener alignmentChanged = new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                alignment.putDouble("confirmation.horizontal.mm", offset(horizontalOffset));
                alignment.putDouble("confirmation.vertical.mm", offset(verticalOffset));
                refreshPreview();
            }
        };
        horizontalOffset.addChangeListener(alignmentChanged);
        verticalOffset.addChangeListener(alignmentChanged);
        alignmentRow.add(new JLabel("Text alignment:"));
        alignmentRow.add(new JLabel("Right/left (mm):"));
        alignmentRow.add(horizontalOffset);
        alignmentRow.add(new JLabel("Down/up (mm):"));
        alignmentRow.add(verticalOffset);

        preprintButton = new JButton("Pre-print blank certificate...");
        preprintButton.setToolTipText("Print the blank form, church details and signing priest on plain A4 paper");
        preprintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printCertificate(BLANK_PREPRINT, false);
            }
        });
        printRow.add(preprintButton);

        testPrintButton = new JButton("Test on blank paper...");
        testPrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printCertificate(DETAILS_ONLY, true);
            }
        });
        printRow.add(testPrintButton);

        printDetailsButton = new JButton("Print details only...");
        printDetailsButton.setToolTipText("Print only the variable text onto the signed certificate");
        printDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printCertificate(DETAILS_ONLY, false);
            }
        });
        printRow.add(printDetailsButton);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        printRow.add(closeButton);
        toolbar.add(previewRow, BorderLayout.NORTH);
        JPanel lowerRows = new JPanel(new BorderLayout());
        lowerRows.setOpaque(false);
        lowerRows.add(alignmentRow, BorderLayout.NORTH);
        lowerRows.add(printRow, BorderLayout.SOUTH);
        toolbar.add(lowerRows, BorderLayout.SOUTH);

        pnl_mass_register.setLayout(new BorderLayout());
        content.add(toolbar, BorderLayout.NORTH);
        content.add(pnl_mass_register, BorderLayout.CENTER);
        setContentPane(content);
        setSize(1100, 800);
        init_key();
    }

    public void do_pass(SRpt_confirmation rpt,String jrxml){
        certificateData = rpt;
        signingPriest = rpt.priest;
        signingDesignation = rpt.asst_priest;
        if (!jrxml.equals(reportName)) {
            compiledReport = null;
        }
        reportName = jrxml;
        boolean preprintedTemplate = isPreprintedTemplate();
        viewMode.setEnabled(preprintedTemplate);
        preprintButton.setEnabled(preprintedTemplate);
        printDetailsButton.setEnabled(preprintedTemplate);
        testPrintButton.setEnabled(preprintedTemplate);
        horizontalOffset.setEnabled(preprintedTemplate);
        verticalOffset.setEnabled(preprintedTemplate);
        viewMode.setSelectedIndex(COMPLETE_PREVIEW);
        refreshPreview();
    }

    public void do_pass_preprint(String priestName, String designation) {
        certificateData = null;
        signingPriest = priestName.trim();
        signingDesignation = designation.trim();
        reportName = "rpt_confirmation_certificate_2025.jrxml";
        compiledReport = null;
        viewMode.setEnabled(true);
        preprintButton.setEnabled(true);
        printDetailsButton.setEnabled(false);
        testPrintButton.setEnabled(false);
        horizontalOffset.setEnabled(true);
        verticalOffset.setEnabled(true);
        viewMode.setSelectedIndex(BLANK_PREPRINT);
        refreshPreview();
    }

    private boolean isPreprintedTemplate() {
        return "rpt_confirmation_certificate_2025.jrxml".equals(reportName);
    }
    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
        public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }
    // </editor-fold>


    private void refreshPreview() {
        if (reportName == null) {
            return;
        }
        int mode = viewMode.getSelectedIndex();
        if (!isPreprintedTemplate()) {
            modeLabel.setText("Legacy report - details-only printing is unavailable");
        } else if (mode == BLANK_PREPRINT) {
            modeLabel.setText("First print: no parishioner information");
        } else if (mode == DETAILS_ONLY) {
            modeLabel.setText("Second print: parishioner details, without the priest's name");
        } else {
            modeLabel.setText("Preview of the finished certificate");
        }
        try {
            JasperPrint preview = fillCertificate(mode);
            pnl_mass_register.removeAll();
            pnl_mass_register.add(new SafeViewer(preview), BorderLayout.CENTER);
            pnl_mass_register.revalidate();
            pnl_mass_register.repaint();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Certificate preview failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void printCertificate(int mode, boolean testPaper) {
        if (!isPreprintedTemplate()) {
            return;
        }
        if (mode == DETAILS_ONLY && certificateData == null) {
            JOptionPane.showMessageDialog(this, "Select a confirmation record first.",
                    "Record required", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this,
                mode == BLANK_PREPRINT
                ? "Load blank A4 paper. This prints the certificate form, church details\n"
                + "and signing priest, without parishioner information.\n\nContinue to printer selection?"
                : testPaper
                ? "Load blank A4 paper for an alignment test.\n"
                + "Only parishioner details will be printed.\n\nContinue to printer selection?"
                : "Load the signed, preprinted A4 certificate in the printer.\n"
                + "Only parishioner details will be printed.\n\nContinue to printer selection?",
                mode == BLANK_PREPRINT ? "Pre-print blank certificate"
                : testPaper ? "Alignment test" : "Print on signed certificate", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (choice != JOptionPane.OK_OPTION) {
            return;
        }
        try {
            JasperPrintManager.printReport(fillCertificate(mode), true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Certificate printing failed", JOptionPane.ERROR_MESSAGE);
        }
    }

    private JasperPrint fillCertificate(int mode) throws JRException {
        if (compiledReport == null) {
            compiledReport = compileJasper_mass_register(reportName);
        }
        Map parameters = certificateData == null ? new HashMap()
                : JasperUtil.setParameter(certificateData);
        if (isPreprintedTemplate()) {
            boolean showPaper = mode != DETAILS_ONLY;
            parameters.put("show_background", Boolean.valueOf(showPaper));
            parameters.put("show_parishioner", Boolean.valueOf(mode != BLANK_PREPRINT));
            parameters.put("show_priest", Boolean.valueOf(showPaper));
            parameters.put("priest", signingPriest);
            parameters.put("asst_priest", signingDesignation);
            parameters.put("name_of_church", System.getProperty("name_of_church",
                    "Saint Augustine of Hippo Parish"));
            parameters.put("church_address", System.getProperty("church_address",
                    "West Poblacion, Bacong, Negros Oriental"));
            InputStream background = showPaper
                    ? SRpt_confirmation.class.getResourceAsStream("confirmation_blank.png") : null;
            if (showPaper && background == null) {
                throw new JRException("The confirmation certificate background is missing from the application.");
            }
            parameters.put("background_image", background);
        }
        JasperPrint filled = JasperFillManager.fillReport(compiledReport, parameters,
                JasperUtil.emptyDatasource());
        if (isPreprintedTemplate()) {
            shiftDetails(filled, mode != DETAILS_ONLY);
        }
        return filled;
    }

    private double offset(JSpinner control) {
        return ((Number) control.getValue()).doubleValue();
    }

    private void shiftDetails(JasperPrint filled, boolean showPaper) {
        int x = (int) Math.round(offset(horizontalOffset) * 72.0 / 25.4);
        int y = (int) Math.round(offset(verticalOffset) * 72.0 / 25.4);
        for (JRPrintPage page : filled.getPages()) {
            for (JRPrintElement element : page.getElements()) {
                if (showPaper && element instanceof JRPrintImage) {
                    continue;
                }
                element.setX(element.getX() + x);
                element.setY(element.getY() + y);
            }
        }
    }

    private static class SafeViewer extends JRViewer {
        SafeViewer(JasperPrint report) {
            super(report);
        }

        @Override
        protected JRViewerToolbar createToolbar() {
            return new JRViewerToolbar(viewerContext) {
                {
                    btnPrint.setVisible(false);
                    btnSave.setVisible(false);
                }
            };
        }
    }

    public static JRViewer get_viewer_mass_register(SRpt_confirmation to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper_mass_register(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.emptyDatasource());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }

    public static JasperReport compileJasper_mass_register(String jrxml_name) {
        try {
            String jrxml = jrxml_name;
            InputStream is = SRpt_confirmation.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
//</editor-fold>
}

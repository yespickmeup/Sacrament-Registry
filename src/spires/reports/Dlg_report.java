/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.reports;

import spires.book_archives.S1_book_archives1;
import SR.main.Main;
import spires.util.DateType;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JPanel;
import mijzcx.synapse.desk.utils.AutoCompletion;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import org.jdesktop.swingx.combobox.ListComboBoxModel;

/**
 *
 * @author i1
 */
public class Dlg_report extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_report
     */
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
    private Dlg_report(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_report(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_report() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_report myRef;

    private void setThisRef(Dlg_report myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_report> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_report create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_report create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_report dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_report((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().
                        log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_report dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_report((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().
                        log(Level.INFO, "instances: {0}", dialogContainer.size());
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
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.
                    getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Dlg_report dialog = Dlg_report.create(new javax.swing.JFrame(), true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().
                    removeAll();
            initComponents();
            myInit();
            repaint();
        }


    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        l_report = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        pnl_rpt = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cb_book = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        dp_from = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        dp_to = new com.toedter.calendar.JDateChooser();
        cb_baptism = new javax.swing.JCheckBox();
        cb_confirmation = new javax.swing.JCheckBox();
        cb_marriage = new javax.swing.JCheckBox();
        cb_funeral = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        l_report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_report.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "BOOK RECORDS", "BOOK COUNT", "DAILY COLLECTION", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        l_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_reportMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(l_report);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT REPORT");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
        );

        pnl_rpt.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_rptLayout = new javax.swing.GroupLayout(pnl_rpt);
        pnl_rpt.setLayout(pnl_rptLayout);
        pnl_rptLayout.setHorizontalGroup(
            pnl_rptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_rptLayout.setVerticalGroup(
            pnl_rptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("SELECT BOOK:");

        cb_book.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb_book.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bookActionPerformed(evt);
            }
        });

        jLabel3.setText("DATE FROM:");

        jLabel4.setText("TO:");

        buttonGroup1.add(cb_baptism);
        cb_baptism.setSelected(true);
        cb_baptism.setText("BAPTISM");

        buttonGroup1.add(cb_confirmation);
        cb_confirmation.setText("CONFIRM");
        cb_confirmation.setEnabled(false);

        buttonGroup1.add(cb_marriage);
        cb_marriage.setText("MARRIAGE");
        cb_marriage.setEnabled(false);

        buttonGroup1.add(cb_funeral);
        cb_funeral.setText("FUNERAL");
        cb_funeral.setEnabled(false);

        jButton2.setText("GO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_book, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cb_baptism)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_confirmation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_marriage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_funeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_from, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dp_to, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp_from, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_book, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_baptism)
                            .addComponent(cb_confirmation)
                            .addComponent(cb_marriage)
                            .addComponent(cb_funeral))
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(dp_to, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_rpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_rpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_bookActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        book_record();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void l_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_reportMouseClicked
        select_list();
    }//GEN-LAST:event_l_reportMouseClicked
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_baptism;
    private javax.swing.JComboBox cb_book;
    private javax.swing.JCheckBox cb_confirmation;
    private javax.swing.JCheckBox cb_funeral;
    private javax.swing.JCheckBox cb_marriage;
    private com.toedter.calendar.JDateChooser dp_from;
    private com.toedter.calendar.JDateChooser dp_to;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList l_report;
    private javax.swing.JPanel pnl_rpt;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

        
        init_key();
        set_book_no();
        AutoCompletion.enable(cb_book, true);
        l_report.setSelectedIndex(0);
        cb_book.grabFocus();
        cb_book.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
//                set_report();
//                jButton2.grabFocus();
            }
        });
    }

    private void set_book_no() {
        cb_book.setModel(new ListComboBoxModel(S1_book_archives1.ret_cb_data()));
    }

    public void do_pass() {
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

    private void book_record() {
        if (cb_baptism.isSelected()) {
            set_book_record_baptism();
        }
        if (cb_confirmation.isSelected()) {
        }
        if (cb_marriage.isSelected()) {
        }
        if (cb_funeral.isSelected()) {
        }
    }

    private void select_list() {
        int index = l_report.getSelectedIndex();
        if (index == 0) {
            book_record();
        }
        if (index == 1) {
            book_count();
        }
        if (index == 2) {
        }
    }

    private void book_count() {
        if (cb_baptism.isSelected()) {
            set_book_count_baptism();
        }
        if (cb_confirmation.isSelected()) {
        }
        if (cb_marriage.isSelected()) {
        }
        if (cb_funeral.isSelected()) {
        }
    }

    private void set_book_record_baptism() {
        String book_no = cb_book.getSelectedItem().
                toString();
        List<SRpt_book_records.field> fields = SRpt_book_records.ret_data(book_no);
        int top = 0;
        for (SRpt_book_records.field to : fields) {
            top = FitIn.toInt(to.index_no);
        }
        List<SRpt_book_records.field> field1 = new ArrayList();

        for (SRpt_book_records.field to : fields) {
            String index_no = to.index_no;
            String fname = to.fname;
            String mi = to.mi;
            String lname = to.lname;
            String b_day = DateType.convert_jan_1_2013_date_rep(to.b_day);
            String place_of_birth = to.place_of_birth;
            String date_of_baptism = DateType.convert_jan_1_2013_date_rep(to.date_of_baptism);
            String minister = to.minister;
            String sponsors = to.sponsors;
            SRpt_book_records.field tbar = new SRpt_book_records.field(index_no, fname, mi, lname, b_day, place_of_birth, date_of_baptism, minister, sponsors);
            field1.add(tbar);
        }
        SRpt_book_records rpt = new SRpt_book_records();
        rpt.fields.addAll(field1);
        report_book_records_baptism(rpt, "rpt_book_records.jrxml");
    }

    private void set_book_count_baptism() {
        List<SRpt_book_count.field> fields = SRpt_book_count.ret_data();

        SRpt_book_count rpt = new SRpt_book_count();
        rpt.fields.addAll(fields);

        report_book_count_baptism(rpt, "rpt_book_count.jrxml");
    }
    // <editor-fold defaultstate="collapsed" desc="book record baptism">

    private void report_book_records_baptism(SRpt_book_records to, String jrxml_name) {
        pnl_rpt.removeAll();
        pnl_rpt.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_book_records(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            pnl_rpt.add(viewer);
            pnl_rpt.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_book_records(SRpt_book_records to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }

    public static JasperReport compileJasper(String jrxml_name) {
        try {
            String jrxml = jrxml_name;
            InputStream is = SRpt_book_records.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="book count baptism">
    private void report_book_count_baptism(SRpt_book_count to, String jrxml_name) {
        pnl_rpt.removeAll();
        pnl_rpt.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_book_count_baptism(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            pnl_rpt.add(viewer);
            pnl_rpt.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_book_count_baptism(SRpt_book_count to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }
    // </editor-fold>
}

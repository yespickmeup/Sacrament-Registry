/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.reports;

import spires.receipts.S1_receipts;
import spires.receipts.S1_receipts.to_receipts;
import static spires.reports.Dlg_report.compileJasper;
import spires.touchscreen.Dlg_update_date;
import spires.touchscreen.Srpt_acknowledgement_receipt;

import spires.util.Alert;
import spires.util.MyDate;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.DigitToWord;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import spires.users.Res;

/**
 *
 * @author Ronald
 */
public class Dlg_cashiering_reports extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_cashiering_reports
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
    private Dlg_cashiering_reports(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_cashiering_reports(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_cashiering_reports() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_cashiering_reports myRef;

    private void setThisRef(Dlg_cashiering_reports myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_cashiering_reports> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_cashiering_reports create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_cashiering_reports create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_cashiering_reports dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashiering_reports((java.awt.Frame) parent, false);
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
            Dlg_cashiering_reports dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashiering_reports((java.awt.Dialog) parent, false);
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

        Dlg_cashiering_reports dialog = Dlg_cashiering_reports.create(new javax.swing.JFrame(), true);
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
            getContentPane().removeAll();
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        pnl_summary = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        pnl_ledger = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jProgressBar4 = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        pnl_disbursements = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_receipts = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jProgressBar5 = new javax.swing.JProgressBar();

        jMenuItem1.setText("Update Date");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        pnl_summary.setBackground(new java.awt.Color(249, 154, 4));
        pnl_summary.setOpaque(false);

        javax.swing.GroupLayout pnl_summaryLayout = new javax.swing.GroupLayout(pnl_summary);
        pnl_summary.setLayout(pnl_summaryLayout);
        pnl_summaryLayout.setHorizontalGroup(
            pnl_summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_summaryLayout.setVerticalGroup(
            pnl_summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(249, 154, 4));
        jPanel8.setOpaque(false);

        jLabel1.setText("Date from:");

        jDateChooser1.setDate(new Date());

        jLabel2.setText("to:");

        jDateChooser2.setDate(new Date());

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Status:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_summary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_summary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Summary", jPanel2);

        jPanel9.setBackground(new java.awt.Color(249, 154, 4));
        jPanel9.setOpaque(false);

        jLabel4.setText("Date from:");

        jDateChooser3.setDate(new Date());

        jLabel5.setText("to:");

        jDateChooser4.setDate(new Date());

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        jLabel6.setText("Status:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_ledger.setBackground(new java.awt.Color(249, 154, 4));
        pnl_ledger.setOpaque(false);

        javax.swing.GroupLayout pnl_ledgerLayout = new javax.swing.GroupLayout(pnl_ledger);
        pnl_ledger.setLayout(pnl_ledgerLayout);
        pnl_ledgerLayout.setHorizontalGroup(
            pnl_ledgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_ledgerLayout.setVerticalGroup(
            pnl_ledgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_ledger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_ledger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ledger", jPanel6);

        jPanel11.setBackground(new java.awt.Color(249, 154, 4));
        jPanel11.setOpaque(false);

        jLabel10.setText("Date from:");

        jDateChooser7.setDate(new Date());

        jLabel11.setText("to:");

        jDateChooser8.setDate(new Date());

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jProgressBar4.setString("");
        jProgressBar4.setStringPainted(true);

        jLabel12.setText("Status:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_disbursements.setBackground(new java.awt.Color(249, 154, 4));
        pnl_disbursements.setOpaque(false);

        javax.swing.GroupLayout pnl_disbursementsLayout = new javax.swing.GroupLayout(pnl_disbursements);
        pnl_disbursements.setLayout(pnl_disbursementsLayout);
        pnl_disbursementsLayout.setHorizontalGroup(
            pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_disbursementsLayout.setVerticalGroup(
            pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_disbursements, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_disbursements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Disbursements", jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cash Count", jPanel4);

        tbl_receipts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_receipts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_receiptsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_receiptsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_receiptsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_receipts);

        jLabel13.setText("Date from:");

        jDateChooser9.setDate(new Date());

        jLabel14.setText("to:");

        jDateChooser10.setDate(new Date());

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel15.setText("Status:");

        jProgressBar5.setString("");
        jProgressBar5.setStringPainted(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Void/Reprint OR", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        init_summary();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        init_ledger();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        init_disbursements();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        data_cols();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_receiptsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_receiptsMouseClicked
        // TODO add your handling code here:
        select();
    }//GEN-LAST:event_tbl_receiptsMouseClicked

    private void tbl_receiptsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_receiptsMousePressed
        show_popup(evt);
    }//GEN-LAST:event_tbl_receiptsMousePressed

    private void tbl_receiptsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_receiptsMouseReleased
        show_popup(evt);
    }//GEN-LAST:event_tbl_receiptsMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       update_date();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnl_disbursements;
    private javax.swing.JPanel pnl_ledger;
    private javax.swing.JPanel pnl_summary;
    private javax.swing.JTable tbl_receipts;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_receipts();
        data_cols();
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

    private void init_summary() {
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String date_from = MyDate.date_to_yyyy_mm_dd(jDateChooser1.getDate());
                String date_to = MyDate.date_to_yyyy_mm_dd(jDateChooser2.getDate());
                String where = " where Date(or_date) between '" + date_from + "' and '" + date_to + "'";
                System.out.println(where);
                List<Srpt_full_collection.field> fields = Srpt_full_collection.ret_data(where);
                double tot = 0;
                for (Srpt_full_collection.field to : fields) {
                    if (to.parent == 1) {
                        tot += FitIn.toDouble(to.amount);
                    }
                }
                String total = FitIn.fmt_wc_0(tot);
                String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
                String operated_by = System.getProperty("operated_by", "");
                String address = System.getProperty("address", "");
                String date = MyDate.report_date(jDateChooser1.getDate(), jDateChooser2.getDate());

                String jrxml = "rpt_zero_collection.jrxml";
                Srpt_full_collection rpt = new Srpt_full_collection(business_name, operated_by, address, date, total);
                rpt.fields.addAll(fields);
                report_summary(rpt, jrxml);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void report_summary(Srpt_full_collection to, String jrxml_name) {
        pnl_summary.removeAll();
        pnl_summary.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_summary(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            pnl_summary.add(viewer);
            pnl_summary.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_summary(Srpt_full_collection to, String rpt_name) {
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

    private void init_ledger() {
        jProgressBar2.setString("Loading...Please wait...");
        jProgressBar2.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String date_from = MyDate.date_to_yyyy_mm_dd(jDateChooser3.getDate());
                String date_to = MyDate.date_to_yyyy_mm_dd(jDateChooser4.getDate());
                String where = " where Date(or_date) between '" + date_from + "' and '" + date_to + "' order by or_no asc";

                List<Srpt_ledger.field> fields = new ArrayList();
                List<S1_receipts.to_receipts> receipts = Srpt_ledger.ret_receipts(where);
                double tot = 0;
                for (S1_receipts.to_receipts to : receipts) {
                    if (to.account_type.isEmpty()) {
                        Srpt_ledger.field t = new Srpt_ledger.field(to.or_no, MyDate.yyyy_mm_dd_to_slash(to.or_date), to.particular, (to.cash + to.check_amount));
                        fields.add(t);
                    } else {
                        Srpt_ledger.field t = new Srpt_ledger.field(to.or_no, MyDate.yyyy_mm_dd_to_slash(to.or_date), to.particular, (to.cash + to.check_amount));
                        fields.add(t);
                    }

                }
                String total = "" + tot;
                String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
                String operated_by = System.getProperty("operated_by", "");
                String address = System.getProperty("address", "");
                String date = MyDate.report_date(jDateChooser3.getDate(), jDateChooser4.getDate());
                Srpt_ledger rpt = new Srpt_ledger(business_name, operated_by, address, date);
                rpt.fields.addAll(fields);
                String jrxml = "rpt_ledger.jrxml";
                report_ledger(rpt, jrxml);
                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void report_ledger(Srpt_ledger to, String jrxml_name) {
        pnl_ledger.removeAll();
        pnl_ledger.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_ledger(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            pnl_ledger.add(viewer);
            pnl_ledger.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_ledger(Srpt_ledger to, String rpt_name) {
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

    private void init_disbursements() {
        jProgressBar4.setString("Loading...Please wait...");
        jProgressBar4.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String date_from = MyDate.date_to_yyyy_mm_dd(jDateChooser7.getDate());
                String date_to = MyDate.date_to_yyyy_mm_dd(jDateChooser8.getDate());
                String where = " where Date(time_in) between '" + date_from + "' and '" + date_to + "' ";
                List<Srpt_checks.field> fields1 = Srpt_checks.ret_data(where);

                String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
                String operated_by = System.getProperty("operated_by", "");
                String address = System.getProperty("address", "");
                String date = MyDate.report_date(jDateChooser7.getDate(), jDateChooser8.getDate());
                Srpt_checks rpt = new Srpt_checks(business_name, operated_by, address, date);
                Srpt_checks.fields.addAll(fields1);
                String jrxml = "rpt_expenses.jrxml";
                report_disbursements(rpt, jrxml);
                jProgressBar4.setString("Finished...");
                jProgressBar4.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void report_disbursements(Srpt_checks to, String jrxml_name) {
        pnl_disbursements.removeAll();
        pnl_disbursements.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_disbursements(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            pnl_disbursements.add(viewer);
            pnl_disbursements.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_disbursements(Srpt_checks to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(Srpt_checks.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }

    private ArrayListModel tbl_receipts_ALM;
    private TblreceiptsModel tbl_receipts_M;

    private void init_tbl_receipts() {
        tbl_receipts_ALM = new ArrayListModel();
        tbl_receipts_M = new TblreceiptsModel(tbl_receipts_ALM);
        tbl_receipts.getTableHeader().setPreferredSize(new Dimension(0, 40));
        tbl_receipts.setModel(tbl_receipts_M);
        tbl_receipts.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_receipts.setRowHeight(25);
        int[] tbl_widths_receipts = {120, 100, 100, 100, 100, 50, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_receipts.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_receipts, i, tbl_widths_receipts[i]);
        }
        Dimension d = tbl_receipts.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_receipts.getTableHeader().setPreferredSize(d);
        tbl_receipts.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_receipts.setRowHeight(25);
        tbl_receipts.setFont(new java.awt.Font("Arial", 0, 11));
        TableWidthUtilities.setColumnRightRenderer(tbl_receipts, 2);
        TableWidthUtilities.setColumnRightRenderer(tbl_receipts, 3);
        TableWidthUtilities.setColumnRightRenderer(tbl_receipts, 4);

    }

    private void loadData_receipts(List<to_receipts> acc) {
        tbl_receipts_ALM.clear();
        tbl_receipts_ALM.addAll(acc);
    }

    public static class TblreceiptsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Transaction No", "Customer", "Cash", "Check", "Total", "Void", "Print", "", "cash", "check_amount", "check_no", "check_holder", "message", "parishioner", "parishioner_id", "parioshioner_contact_no", "account_name", "account_id", "account_type", "account_type_id", "status", "particular", "particular_id", "particular_account", "particular_account_id"
        };

        public TblreceiptsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 7) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_receipts tt = (to_receipts) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.or_no;
                case 1:
                    return " " + tt.parishioner;
                case 2:
                    return FitIn.fmt_wc_0(tt.cash) + " ";
                case 3:
                    return FitIn.fmt_wc_0(tt.check_amount) + " ";
                case 4:
                    return FitIn.fmt_wc_0(tt.cash + tt.check_amount) + " ";
                case 5:
                    return "  Void";
                case 6:
                    return "  Print";
                case 7:
                    return tt.selected;
                case 8:
                    return tt.cash;
                case 9:
                    return tt.check_amount;
                case 10:
                    return tt.check_no;
                case 11:
                    return tt.check_holder;
                case 12:
                    return tt.message;
                case 13:
                    return tt.parishioner;
                case 14:
                    return tt.parishioner_id;
                case 15:
                    return tt.parioshioner_contact_no;
                case 16:
                    return tt.account_name;
                case 17:
                    return tt.account_id;
                case 18:
                    return tt.account_type;
                case 19:
                    return tt.account_type_id;
                case 20:
                    return tt.status;
                case 21:
                    return tt.particular;
                case 22:
                    return tt.particular_id;
                case 23:
                    return tt.particular_account;
                default:
                    return tt.particular_account_id;
            }
        }
    }

    private void data_cols() {
        String date_from = MyDate.date_to_yyyy_mm_dd(jDateChooser9.getDate());
        String date_to = MyDate.date_to_yyyy_mm_dd(jDateChooser10.getDate());
        String where = " where Date(or_date) between '" + date_from + "' and '" + date_to + "' order by or_no asc";
        loadData_receipts(S1_receipts.ret_data(where));
    }

    private void select() {
        int row = tbl_receipts.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_receipts to = (to_receipts) tbl_receipts_ALM.get(tbl_receipts.convertRowIndexToModel(row));
        int col = tbl_receipts.getSelectedColumn();
        if (col == 5) {

            Window p = (Window) this;
            Dlg_confirm nd = Dlg_confirm.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_confirm.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm.OutputData data) {
                    closeDialog.ok();
                    S1_receipts.delete_receipts(to);
                    data_cols();
                    Alert.set(0, "Transaction Cancelled!");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 6) {
            String print = System.getProperty("print_to_receipts", "true");
//            System.out.println(print);
            if (print.equals("true")) {
                String jrxml = "rpt_acknowledgement_receipt.jrxml";
                double amount = to.cash + to.check_amount;
                String amount_in_words = DigitToWord.convertToWordsIn(amount);
                amount_in_words = amount_in_words.toUpperCase();
                String received_by = Res.getUser_screename();
                String date = MyDate.datetime_to_time(to.date_added);
                String parishioner1 = to.parishioner;
                String contact_no = to.parioshioner_contact_no;
                String particular = to.particular;

                Srpt_acknowledgement_receipt rpt = new Srpt_acknowledgement_receipt(to.or_no, date, parishioner1, contact_no, particular, amount, amount_in_words, received_by, to.check_holder, to.check_no);
                InputStream is = Srpt_acknowledgement_receipt.class.getResourceAsStream(jrxml);
                JasperReport jasperReport;
                try {
                    jasperReport = JasperCompileManager.compileReport(is);
                    jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                            setParameter(rpt), JasperUtil.emptyDatasource());
                    JasperPrintManager.printReport(jasperPrint, false);
                } catch (JRException ex) {
                    Logger.getLogger(Dlg_cashiering_reports.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        if (col == 7) {
            select_or();
        }
    }
    JasperPrint jasperPrint = null;

    private void select_or() {
        int row = tbl_receipts.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_receipts to = (to_receipts) tbl_receipts_ALM.get(tbl_receipts.convertRowIndexToModel(row));

        if (to.selected == true) {
            to.setSelected(false);
        } else {
            to.setSelected(true);
        }
        tbl_receipts_M.fireTableDataChanged();
    }

    private void show_popup(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(tbl_receipts, evt.getX(), evt.getY());
        }

    }

    private void update_date() {

        Window p = (Window) this;
        Dlg_update_date nd = Dlg_update_date.create(p, true);
        nd.setTitle("");
//        nd.do_pass(services);
        nd.setCallback(new Dlg_update_date.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_update_date.OutputData data) {
                closeDialog.ok();
                List<to_receipts> datas = tbl_receipts_ALM;
                S1_receipts.edit_or_date(datas,data.date);
                data_cols();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}

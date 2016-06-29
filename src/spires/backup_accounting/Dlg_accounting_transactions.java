package spires.backup_accounting;

import spires.reports.Srpt_full_collection;

import spires.util.Alert;
import spires.util.DateType;
import spires.util.Focus_Fire;
import spires.util.MyDate;
import spires.util.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
import spires.backup_accounting.S1_account_disburses.to_account_disburses;
import spires.backup_accounting.S1_account_disburses_particulars.to_account_disburses_particulars;
import spires.backup_accounting.S1_account_payees.to_account_payees;
import spires.backup_accounting.S1_account_receipts.to_account_receipts;
import spires.users.Res;
import spires.users.Users.to_users;
import synsoftech.fields.Field;

/**
 *
 * @author Ronald
 */
public class Dlg_accounting_transactions extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_accounting_transactions
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
    private Dlg_accounting_transactions(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_accounting_transactions(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_accounting_transactions() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_accounting_transactions myRef;

    private void setThisRef(Dlg_accounting_transactions myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_accounting_transactions> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_accounting_transactions create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_accounting_transactions create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_accounting_transactions dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_accounting_transactions((java.awt.Frame) parent, false);
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
            Dlg_accounting_transactions dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_accounting_transactions((java.awt.Dialog) parent, false);
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

        Dlg_accounting_transactions dialog = Dlg_accounting_transactions.create(new javax.swing.JFrame(), true);

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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tf_disburse_amount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_account_disburses_particulars = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        tf_account_particular = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_account_types = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_reference_no1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf_payee = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_check_no = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        tf_account_types_id = new javax.swing.JTextField();
        tf_account_particular_id = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tf_disburse_amount1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tf_account_type = new javax.swing.JTextField();
        tf_reference_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_amount = new javax.swing.JTextField();
        tf_remarks = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        tf_account_type_id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_account_no = new Field.Combo();
        tf_account_no_id = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        pnl_disbursements = new javax.swing.JPanel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_account_disburses = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        tf_amount2 = new javax.swing.JTextField();
        tf_account_type_id2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        tf_amount3 = new javax.swing.JTextField();
        tf_account_type_id3 = new javax.swing.JTextField();
        pnl_revenues = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        tf_amount1 = new javax.swing.JTextField();
        tf_account_type_id1 = new javax.swing.JTextField();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton12 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_account_revenues = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_summary = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(222, 221, 221));

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setText("Amount:");

        tf_disburse_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_disburse_amountActionPerformed(evt);
            }
        });

        tbl_account_disburses_particulars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_account_disburses_particulars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_account_disburses_particularsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_account_disburses_particulars);

        jLabel19.setText("Account Title:");

        tf_account_particular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_account_particularActionPerformed(evt);
            }
        });

        jLabel18.setText("Account Type:");

        tf_account_types.setFocusable(false);
        tf_account_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_account_typesActionPerformed(evt);
            }
        });

        jLabel20.setText("Reference No:");

        jLabel22.setText("Payee:");

        tf_payee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_payeeActionPerformed(evt);
            }
        });

        jLabel23.setText("Check No:");

        tf_check_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_check_noActionPerformed(evt);
            }
        });

        jLabel21.setText("Date:");

        jDateChooser6.setDate(new Date());

        jButton7.setText("New");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Update");
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Delete");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        tf_disburse_amount1.setFocusable(false);

        jLabel30.setText("Total Amount:");

        jButton14.setText("Update");
        jButton14.setEnabled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Add");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("New");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel31.setText("Particular:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tf_reference_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_payee)
                            .addComponent(tf_check_no)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(tf_account_particular)
                                        .addGap(0, 0, 0)
                                        .addComponent(tf_account_particular_id, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(tf_account_types)
                                        .addGap(0, 0, 0)
                                        .addComponent(tf_account_types_id, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(tf_disburse_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(tf_disburse_amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_reference_no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_payee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_check_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_account_particular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_account_particular_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_account_types, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_account_types_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_disburse_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_disburse_amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton9)
                    .addComponent(jButton8)
                    .addComponent(jButton7))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Disbursement", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Account Type:");

        tf_account_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_account_typeActionPerformed(evt);
            }
        });

        jLabel8.setText("Reference No:");

        jLabel9.setText("Remarks:");

        jLabel10.setText("Amount:");

        jLabel14.setText("Date:");

        jDateChooser5.setDate(new Date());

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_account_type)
                        .addGap(10, 10, 10)
                        .addComponent(tf_account_type_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_remarks)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tf_reference_no, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_account_type_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_reference_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_remarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Revenue", jPanel4);

        jLabel5.setText("Account No:");

        tf_account_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_account_noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_account_no)
                .addGap(0, 0, 0)
                .addComponent(tf_account_no_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_account_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_account_no_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setLayout(new java.awt.CardLayout());

        jDateChooser7.setDate(new Date());

        jLabel26.setText("Date from:");

        jLabel28.setText("Ref #:");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        tbl_account_disburses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_account_disburses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_account_disbursesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_account_disburses);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Total:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0.00");

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser8.setDate(new Date());

        jLabel27.setText("To:");

        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel25.setText("Account Type:");

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("All");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        tf_amount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_amount2ActionPerformed(evt);
            }
        });

        jLabel29.setText("Particular:");

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("All");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        tf_amount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_amount3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_disbursementsLayout = new javax.swing.GroupLayout(pnl_disbursements);
        pnl_disbursements.setLayout(pnl_disbursementsLayout);
        pnl_disbursementsLayout.setHorizontalGroup(
            pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_disbursementsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                        .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_disbursementsLayout.createSequentialGroup()
                                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                                        .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel27))
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_disbursementsLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_disbursementsLayout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_amount3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)
                                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_account_type_id3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_account_type_id2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnl_disbursementsLayout.setVerticalGroup(
            pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                        .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4)
                            .addComponent(tf_amount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_account_type_id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5)
                            .addComponent(tf_amount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_account_type_id3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11)))
                    .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26))
        );

        jPanel8.add(pnl_disbursements, "card3");

        jLabel15.setText("Account Type:");

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("All");

        tf_amount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_amount1ActionPerformed(evt);
            }
        });

        jDateChooser4.setDate(new Date());

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel12.setText("To:");

        jDateChooser3.setDate(new Date());

        jLabel11.setText("Date from:");

        jLabel13.setText("Reference No:");

        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        jButton12.setText("Generate Report");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        tbl_account_revenues.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_account_revenues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_account_revenuesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_account_revenues);

        jLabel17.setText("Total Amount:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("0.00");

        jLabel6.setText("0");

        jLabel4.setText("Total Transactions:");

        javax.swing.GroupLayout pnl_revenuesLayout = new javax.swing.GroupLayout(pnl_revenues);
        pnl_revenues.setLayout(pnl_revenuesLayout);
        pnl_revenuesLayout.setHorizontalGroup(
            pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_revenuesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_revenuesLayout.createSequentialGroup()
                        .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_revenuesLayout.createSequentialGroup()
                                .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_revenuesLayout.createSequentialGroup()
                                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_revenuesLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_account_type_id1)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2)
                    .addGroup(pnl_revenuesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_revenuesLayout.setVerticalGroup(
            pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_revenuesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_revenuesLayout.createSequentialGroup()
                        .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3)
                            .addComponent(tf_amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_account_type_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_revenuesLayout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(1, 1, 1)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_revenuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        jPanel8.add(pnl_revenues, "card3");

        pnl_summary.setBackground(new java.awt.Color(255, 255, 255));

        jButton13.setText("Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton13)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_summaryLayout = new javax.swing.GroupLayout(pnl_summary);
        pnl_summary.setLayout(pnl_summaryLayout);
        pnl_summaryLayout.setHorizontalGroup(
            pnl_summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_summaryLayout.setVerticalGroup(
            pnl_summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_summaryLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(pnl_summary, "card2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        clear_account_receipts();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        add_account_receipts();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        edit_account_receipts();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        delete_account_receipts();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_account_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_account_noActionPerformed
        init_trans_type();
    }//GEN-LAST:event_tf_account_noActionPerformed

    private void tf_account_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_account_typeActionPerformed
        init_account_type(tf_account_type, tf_account_type_id);
    }//GEN-LAST:event_tf_account_typeActionPerformed

    private void tbl_account_revenuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_account_revenuesMouseClicked
        select_account_receipts();
    }//GEN-LAST:event_tbl_account_revenuesMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        data_cols();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        data_cols();
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void tf_amount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_amount1ActionPerformed
        init_account_type(tf_amount1, tf_account_type_id1);
    }//GEN-LAST:event_tf_amount1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        clear_account_disburses();
        tf_reference_no1.grabFocus();
        jButton8.setEnabled(true);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        tbl_account_disburses_particulars_ALM.clear();
        tbl_account_disburses_particulars_M.fireTableDataChanged();
        compute_disbursements_particular();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        add_account_disburses();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        edit_account_disburses();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        delete_account_disburses();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tf_amount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_amount2ActionPerformed
        init_disbursement_account_type2(tf_amount2, tf_account_type_id2);
    }//GEN-LAST:event_tf_amount2ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        data_cols_disburses();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void tf_amount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_amount3ActionPerformed
        init_disbursement_account_particular2(tf_amount3, tf_account_type_id3);

    }//GEN-LAST:event_tf_amount3ActionPerformed

    private void tf_account_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_account_typesActionPerformed
        // TODO add your handling code here:
        init_disbursement_account_type(tf_account_types, tf_account_types_id);
    }//GEN-LAST:event_tf_account_typesActionPerformed

    private void tf_account_particularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_account_particularActionPerformed
        init_disbursement_account_particular(tf_account_particular, tf_account_particular_id);
    }//GEN-LAST:event_tf_account_particularActionPerformed

    private void tf_payeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_payeeActionPerformed
        init_payee();
    }//GEN-LAST:event_tf_payeeActionPerformed

    private void tf_check_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_check_noActionPerformed
        tf_account_particular.grabFocus();
    }//GEN-LAST:event_tf_check_noActionPerformed

    private void tbl_account_disbursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_account_disbursesMouseClicked
        // TODO add your handling code here:
        select_account_disburses();
    }//GEN-LAST:event_tbl_account_disbursesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        init_summary();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        init_revenues();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        int row = jTabbedPane1.getSelectedIndex();
        if (row == 0) {
            cardLayout.show(jPanel8, "2");
        } else {
            cardLayout.show(jPanel8, "1");
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int row = jTabbedPane1.getSelectedIndex();
        if (row == 0) {
            cardLayout.show(jPanel8, "2");
        } else {
            cardLayout.show(jPanel8, "1");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tf_disburse_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_disburse_amountActionPerformed
        // TODO add your handling code here:
        add_particular();
    }//GEN-LAST:event_tf_disburse_amountActionPerformed

    private void tbl_account_disburses_particularsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_account_disburses_particularsMouseClicked
        // TODO add your handling code here:
        delete_particular();
    }//GEN-LAST:event_tbl_account_disburses_particularsMouseClicked

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        update_particular();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        add_particular();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        tf_account_particular.grabFocus();
        tf_account_particular.setText("");
        tf_account_particular_id.setText("");
        tf_account_types.setText("");
        tf_account_types_id.setText("");
        tf_disburse_amount.setText("");
        jButton15.setEnabled(true);
        jButton14.setEnabled(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        select_acc_type();
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        select_acc_particulars();
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JPanel pnl_disbursements;
    private javax.swing.JPanel pnl_revenues;
    private javax.swing.JPanel pnl_summary;
    private javax.swing.JTable tbl_account_disburses;
    private javax.swing.JTable tbl_account_disburses_particulars;
    private javax.swing.JTable tbl_account_revenues;
    private javax.swing.JTextField tf_account_no;
    private javax.swing.JTextField tf_account_no_id;
    private javax.swing.JTextField tf_account_particular;
    private javax.swing.JTextField tf_account_particular_id;
    private javax.swing.JTextField tf_account_type;
    private javax.swing.JTextField tf_account_type_id;
    private javax.swing.JTextField tf_account_type_id1;
    private javax.swing.JTextField tf_account_type_id2;
    private javax.swing.JTextField tf_account_type_id3;
    private javax.swing.JTextField tf_account_types;
    private javax.swing.JTextField tf_account_types_id;
    private javax.swing.JTextField tf_amount;
    private javax.swing.JTextField tf_amount1;
    private javax.swing.JTextField tf_amount2;
    private javax.swing.JTextField tf_amount3;
    private javax.swing.JTextField tf_check_no;
    private javax.swing.JTextField tf_disburse_amount;
    private javax.swing.JTextField tf_disburse_amount1;
    private javax.swing.JTextField tf_payee;
    private javax.swing.JTextField tf_reference_no;
    private javax.swing.JTextField tf_reference_no1;
    private javax.swing.JTextField tf_remarks;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();

        tf_account_type_id.setVisible(false);
        tf_account_no_id.setVisible(false);
        tf_account_type_id1.setVisible(false);
        tf_account_types_id.setVisible(false);
        tf_account_particular_id.setVisible(false);

        jLabel25.setVisible(false);
        jCheckBox4.setVisible(false);
        tf_amount2.setVisible(false);
        tf_account_type_id2.setVisible(false);

        jCheckBox5.setVisible(false);
        jLabel29.setVisible(false);
        tf_amount3.setVisible(false);
        tf_account_type_id3.setVisible(false);

        jLabel18.setVisible(false);
        tf_account_types.setVisible(false);
        tf_account_types_id.setVisible(false);

        focus();
        init_tbl_account_receipts();
        data_cols();

        init_tbl_account_disburses();
        data_cols_disburses();
        set_card_layout();

        init_tbl_account_disburses_particulars();
    }

    public void menu(int stmt) {
        if (stmt == 1) {
            cardLayout.show(jPanel8, "2");
            jTabbedPane1.remove(1);
        } else {
            cardLayout.show(jPanel8, "1");
            jTabbedPane1.remove(0);
        }
    }
    CardLayout cardLayout = new CardLayout();

    private void set_card_layout() {
        cardLayout = (CardLayout) jPanel8.getLayout();
        cardLayout.addLayoutComponent("1", pnl_revenues);
        cardLayout.addLayoutComponent("2", pnl_disbursements);
        cardLayout.addLayoutComponent("3", pnl_summary);
        cardLayout.show(jPanel8, "2");
    }

    private void focus() {
        JTextField[] tf = {tf_account_no, tf_account_type, tf_reference_no, tf_remarks, tf_amount, jTextField14, tf_amount1, tf_account_types, tf_account_particular, tf_reference_no1, tf_payee, tf_disburse_amount, tf_amount2, tf_amount3, jTextField15, tf_check_no};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
//        MyBorder.setBorder3(tf);
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

    private ArrayListModel tbl_account_receipts_ALM;
    private Tblaccount_receiptsModel tbl_account_receipts_M;

    private void init_tbl_account_receipts() {
        tbl_account_receipts_ALM = new ArrayListModel();
        tbl_account_receipts_M = new Tblaccount_receiptsModel(tbl_account_receipts_ALM);
        tbl_account_revenues.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_account_revenues.setModel(tbl_account_receipts_M);
        tbl_account_revenues.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_account_revenues.setRowHeight(25);
        int[] tbl_widths_account_receipts = {110, 70, 90, 100, 70, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_account_receipts.length; i < n; i++) {
            if (i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_account_revenues, i, tbl_widths_account_receipts[i]);
        }
        Dimension d = tbl_account_revenues.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_account_revenues.getTableHeader().setPreferredSize(d);
        tbl_account_revenues.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_account_revenues.setRowHeight(25);
        tbl_account_revenues.setFont(new java.awt.Font("Arial", 0, 11));
        TableWidthUtilities.setColumnRightRenderer(tbl_account_revenues, 4);
    }

    private void loadData_account_receipts(List<to_account_receipts> acc) {
        tbl_account_receipts_ALM.clear();
        tbl_account_receipts_ALM.addAll(acc);
    }

    public static class Tblaccount_receiptsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Reference No", "Date", "Account", "Remarks", "Amount", "remarks", "amount", "account_no_id", "account_no", "account_type", "account_type_id", "group_id", "group_name"
        };

        public Tblaccount_receiptsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_account_receipts tt = (to_account_receipts) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.reference_no;
                case 1:
                    return " " + MyDate.yyyy_mm_dd_to_slash(tt.receipt_date);
                case 2:
                    return " " + tt.account_type;
                case 3:
                    return " " + tt.remarks;
                case 4:
                    return FitIn.fmt_wc_0(tt.amount) + " ";
                case 5:
                    return tt.remarks;
                case 6:
                    return tt.amount;
                case 7:
                    return tt.account_no_id;
                case 8:
                    return tt.account_no;
                case 9:
                    return tt.account_type;
                case 10:
                    return tt.account_type_id;
                case 11:
                    return tt.group_id;
                default:
                    return tt.group_name;
            }
        }
    }

    private void data_cols() {

        String from = DateType.sf.format(jDateChooser3.getDate());
        String to = DateType.sf.format(jDateChooser4.getDate());
        String ref = jTextField14.getText();
        String account_no_id = tf_account_no_id.getText();
        String where1 = " where Date(receipt_date) between '" + from + "' and '" + to + "' and account_no_id='" + account_no_id + "' ";
        String where2 = " where Date(or_date) between '" + from + "' and '" + to + "' and account_id='" + account_no_id + "'";

        loadData_account_receipts(S1_account_receipts.ret_data(where1));

        loadData_account_receipts(S1_account_receipts.ret_data_receipts(where2));

        List<to_account_receipts> datas = tbl_account_receipts_ALM;
        int trans = tbl_account_receipts_ALM.size();
        double amount = 0;
        for (to_account_receipts to1 : datas) {
            amount += to1.amount;
        }
        jLabel16.setText(FitIn.fmt_wc_0(amount));
        jLabel6.setText("" + trans);
    }

    private void add_account_receipts() {
        int id = -1;
        String reference_no = tf_reference_no.getText();
        String user_id = Res.getUser_id();
        String user_name = Res.getUser_name();
        String date_added = MyDate.now();
        String remarks = tf_remarks.getText();
        double amount = FitIn.toDouble(tf_amount.getText());
        String account_no_id = tf_account_no_id.getText();
        String account_no = tf_account_no.getText();
        String account_type = tf_account_type.getText();
        String account_type_id = tf_account_type_id.getText();
        String group_id = "1";
        String group_name = "Revenue";
        String receipt_date = DateType.sf.format(jDateChooser5.getDate());
        to_account_receipts to = new to_account_receipts(id, reference_no, user_id, user_name, date_added, remarks, amount, account_no_id, account_no, account_type, account_type_id, group_id, group_name, receipt_date);
        S1_account_receipts.add_account_receipts(to);
        data_cols();
        clear_account_receipts();
        Alert.set(1, "");
    }

    private void select_account_receipts() {
        int row = tbl_account_revenues.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_receipts to = (to_account_receipts) tbl_account_receipts_ALM.get(tbl_account_revenues.convertRowIndexToModel(row));
        tf_reference_no.setText(to.reference_no);
        tf_remarks.setText(to.remarks);
        tf_amount.setText(FitIn.fmt_wc_0(to.amount));
        tf_account_type.grabFocus();
        tf_account_type.setText(to.account_type);
        tf_account_type_id.setText(to.account_type_id);
        try {
            Date d = DateType.sf.parse(to.receipt_date);
            jDateChooser5.setDate(d);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_accounting_transactions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void edit_account_receipts() {
        int row = tbl_account_revenues.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_receipts to = (to_account_receipts) tbl_account_receipts_ALM.get(tbl_account_revenues.convertRowIndexToModel(row));
        int id = to.id;
        String reference_no = tf_reference_no.getText();
        String user_id = Res.getUser_id();
        String user_name = Res.getUser_name();
        String date_added = MyDate.now();
        String remarks = tf_remarks.getText();
        double amount = FitIn.toDouble(tf_amount.getText());
        String account_no_id = tf_account_no_id.getText();
        String account_no = tf_account_no.getText();
        String account_type = tf_account_type.getText();
        String account_type_id = tf_account_type_id.getText();
        String group_id = "1";
        String group_name = "Revenue";
        String receipt_date = DateType.sf.format(jDateChooser5.getDate());
        to_account_receipts to1 = new to_account_receipts(id, reference_no, user_id, user_name, date_added, remarks, amount, account_no_id, account_no, account_type, account_type_id, group_id, group_name, receipt_date);
        S1_account_receipts.edit_account_receipts(to1);
        data_cols();
        clear_account_receipts();
        Alert.set(2, "");
    }

    private void clear_account_receipts() {
        tf_reference_no.setText("");

        tf_remarks.setText("");
        tf_amount.setText("");
        tf_reference_no.grabFocus();
    }

    private void delete_account_receipts() {
        int row = tbl_account_revenues.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_receipts to = (to_account_receipts) tbl_account_receipts_ALM.get(tbl_account_revenues.convertRowIndexToModel(row));
        S1_account_receipts.delete_account_receipts(to);
        data_cols();
        clear_account_receipts();
        Alert.set(3, "");
    }

    List<S1_account_numbers.to_account_numbers> trans_type_list = new ArrayList();

    private void init_trans_type() {
        String search = tf_account_no.getText();
        String where = " where account_no like '%" + search + "%' order by account_no";
        trans_type_list.clear();
        trans_type_list = S1_account_numbers.ret_data(where);
        Object[][] obj = new Object[trans_type_list.size()][1];
        int i = 0;
        for (S1_account_numbers.to_account_numbers to : trans_type_list) {
            obj[i][0] = to.account_no;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {500};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_account_no, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_account_numbers.to_account_numbers to = trans_type_list.get(data.selected_row);
                tf_account_no.setText(to.account_no);
                tf_account_no_id.setText("" + to.id);
                tf_account_particular.grabFocus();
                data_cols_disburses();
                data_cols();
                tf_reference_no1.grabFocus();
                tbl_account_disburses_particulars_ALM.clear();
                tbl_account_disburses_particulars_M.fireTableDataChanged();
            }
        });
    }
    List<S1_account_revenues.to_account_revenues> account_type_list = new ArrayList();

    private void init_account_type(final JTextField tf1, final JTextField tf2) {
        String search = tf1.getText();
        String where = " where revenue like '%" + search + "%' order by revenue";
        account_type_list.clear();
        account_type_list = S1_account_revenues.ret_data(where);
        Object[][] obj = new Object[account_type_list.size()][1];
        int i = 0;
        for (S1_account_revenues.to_account_revenues to : account_type_list) {
            obj[i][0] = to.revenue;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {500};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_account_revenues.to_account_revenues to = account_type_list.get(data.selected_row);
                tf1.setText(to.revenue);
                tf2.setText("" + to.id);
                tf_reference_no.grabFocus();
            }
        });
    }
    List<S1_account_disbursements.to_account_disbursements> disbursement_account_type_list = new ArrayList();

    private void init_disbursement_account_type(final JTextField tf1, final JTextField tf2) {
        String search = tf1.getText();
        String where = " where particular like '%" + search + "%' order by particular asc";
        disbursement_account_type_list.clear();
        disbursement_account_type_list = S1_account_disbursements.ret_data(where);
        if (disbursement_account_type_list.isEmpty()) {

        } else {
            if (disbursement_account_type_list.size() == 1) {
                S1_account_disbursements.to_account_disbursements to = disbursement_account_type_list.get(0);
                tf1.setText(to.particular);
                tf2.setText("" + to.id);
                tf_account_particular.grabFocus();
            } else {
                Object[][] obj = new Object[disbursement_account_type_list.size()][1];
                int i = 0;
                for (S1_account_disbursements.to_account_disbursements to : disbursement_account_type_list) {
                    obj[i][0] = to.particular;
                    i++;
                }

                JLabel[] labels = {};
                int[] tbl_widths_customers = {500};
                int width = 0;
                String[] col_names = {""};
                TableRenderer tr = new TableRenderer();
                TableRenderer.setPopup(tf1, obj, labels, tbl_widths_customers, col_names);
                tr.setCallback(new TableRenderer.Callback() {
                    @Override
                    public void ok(TableRenderer.OutputData data) {
                        S1_account_disbursements.to_account_disbursements to = disbursement_account_type_list.get(data.selected_row);
                        tf1.setText(to.particular);
                        tf2.setText("" + to.id);
                        tf_account_particular.grabFocus();
                    }
                });
            }
        }
    }

    private void init_disbursement_account_type2(final JTextField tf1, final JTextField tf2) {
        String search = tf1.getText();
        String where = " where particular like '%" + search + "%' order by particular asc";
        disbursement_account_type_list.clear();
        disbursement_account_type_list = S1_account_disbursements.ret_data(where);
        Object[][] obj = new Object[disbursement_account_type_list.size()][1];
        int i = 0;
        for (S1_account_disbursements.to_account_disbursements to : disbursement_account_type_list) {
            obj[i][0] = to.particular;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {500};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_account_disbursements.to_account_disbursements to = disbursement_account_type_list.get(data.selected_row);
                tf1.setText(to.particular);
                tf2.setText("" + to.id);
            }
        });

    }

    List<S1_account_disbursement_details.to_account_disbursement_details> disbursement_account_particular_list = new ArrayList();

    private void init_disbursement_account_particular(final JTextField tf1, final JTextField tf2) {
        String search = tf1.getText();
        String disbursement_account_id = tf_account_types_id.getText();

        String where = " where detail like '%" + search + "%' order by detail asc";
        disbursement_account_particular_list.clear();
        disbursement_account_particular_list = S1_account_disbursement_details.ret_data(where);
        if (disbursement_account_particular_list.isEmpty()) {

        } else {
            if (disbursement_account_particular_list.size() == 1) {
                S1_account_disbursement_details.to_account_disbursement_details to = disbursement_account_particular_list.get(0);
                tf1.setText(to.detail);
                tf2.setText("" + to.id);
                tf_account_types.setText(to.account_disbursement);
                tf_account_types_id.setText(to.account_disbursement_id);
                tf_disburse_amount.grabFocus();
            } else {
                Object[][] obj = new Object[disbursement_account_particular_list.size()][1];
                int i = 0;
                for (S1_account_disbursement_details.to_account_disbursement_details to : disbursement_account_particular_list) {
                    obj[i][0] = to.detail;
                    i++;
                }
                JLabel[] labels = {};
                int[] tbl_widths_customers = {500};
                int width = 0;
                String[] col_names = {""};
                TableRenderer tr = new TableRenderer();
                TableRenderer.setPopup(tf1, obj, labels, tbl_widths_customers, col_names);
                tr.setCallback(new TableRenderer.Callback() {
                    @Override
                    public void ok(TableRenderer.OutputData data) {
                        S1_account_disbursement_details.to_account_disbursement_details to = disbursement_account_particular_list.get(data.selected_row);
                        tf1.setText(to.detail);
                        tf2.setText("" + to.id);
                        tf_account_types.setText(to.account_disbursement);
                        tf_account_types_id.setText(to.account_disbursement_id);
                        tf_disburse_amount.grabFocus();
                    }
                });
            }
        }
    }

    private void init_disbursement_account_particular2(final JTextField tf1, final JTextField tf2) {
        String search = tf1.getText();
        String disbursement_account_id = tf_account_types_id.getText();

        String where = " where detail like '%" + search + "%' and account_disbursement_id= '" + tf_account_type_id2.getText() + "' order by detail asc";
        disbursement_account_particular_list.clear();
        disbursement_account_particular_list = S1_account_disbursement_details.ret_data(where);
        Object[][] obj = new Object[disbursement_account_particular_list.size()][1];
        int i = 0;
        for (S1_account_disbursement_details.to_account_disbursement_details to : disbursement_account_particular_list) {
            obj[i][0] = to.detail;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_amount3.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf1, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_account_disbursement_details.to_account_disbursement_details to = disbursement_account_particular_list.get(data.selected_row);
                tf1.setText(to.detail);
                tf2.setText("" + to.id);
            }
        });

    }

    List<S1_account_payees.to_account_payees> payee_list = new ArrayList();

    private void init_payee() {
        String search = tf_payee.getText();
        String where = " where payee like '%" + search + "%' order by payee asc";
        payee_list.clear();
        payee_list = S1_account_payees.ret_data(where);
        if (payee_list.isEmpty()) {
            String payee = tf_payee.getText();
            to_account_payees to = new to_account_payees(-1, payee);
            S1_account_payees.add_account_payees(to);
            tf_check_no.grabFocus();
        } else {
            if (payee_list.size() == 1) {
                tf_check_no.grabFocus();
            } else {
                Object[][] obj = new Object[payee_list.size()][1];
                int i = 0;
                for (S1_account_payees.to_account_payees to : payee_list) {
                    obj[i][0] = to.payee;
                    i++;
                }
                JLabel[] labels = {};
                int[] tbl_widths_customers = {500};
                int width = 0;
                String[] col_names = {""};
                TableRenderer tr = new TableRenderer();
                TableRenderer.setPopup(tf_payee, obj, labels, tbl_widths_customers, col_names);
                tr.setCallback(new TableRenderer.Callback() {
                    @Override
                    public void ok(TableRenderer.OutputData data) {
                        S1_account_payees.to_account_payees to = payee_list.get(data.selected_row);
                        tf_payee.setText(to.payee);
                        tf_check_no.grabFocus();
                    }
                });
            }
        }
    }

    private ArrayListModel tbl_account_disburses_ALM;
    private Tblaccount_disbursesModel tbl_account_disburses_M;

    private void init_tbl_account_disburses() {
        tbl_account_disburses_ALM = new ArrayListModel();
        tbl_account_disburses_M = new Tblaccount_disbursesModel(tbl_account_disburses_ALM);
        tbl_account_disburses.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_account_disburses.setModel(tbl_account_disburses_M);
        tbl_account_disburses.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_account_disburses.setRowHeight(25);
        int[] tbl_widths_account_disburses = {130, 100, 100, 80, 60, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_account_disburses.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_account_disburses, i, tbl_widths_account_disburses[i]);
        }
        Dimension d = tbl_account_disburses.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_account_disburses.getTableHeader().setPreferredSize(d);
        tbl_account_disburses.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_account_disburses.setRowHeight(25);
        tbl_account_disburses.setFont(new java.awt.Font("Arial", 0, 11));
        TableWidthUtilities.setColumnRightRenderer(tbl_account_disburses, 3);
    }

    private void loadData_account_disburses(List<to_account_disburses> acc) {
        tbl_account_disburses_ALM.clear();
        tbl_account_disburses_ALM.addAll(acc);

    }

    public static class Tblaccount_disbursesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Particular", "Date", "Payee", "Amount", "Voucher", "Cheque", "payee", "check_no", "amount", "account_no_id", "account_no", "account_type", "account_type_id", "account_type_particular", "account_type_particular_id", "group_id", "group_name"
        };

        public Tblaccount_disbursesModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_account_disburses tt = (to_account_disburses) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.account_type_particular;
                case 1:
                    return " " + DateType.convert_sf_to_slash(tt.disburse_date);
                case 2:
                    return " " + tt.payee;

                case 3:
                    return FitIn.fmt_wc_0(tt.amount) + " ";

                case 4:
                    return " View";

                case 5:
                    return " Print";
                case 6:
                    return tt.payee;
                case 7:
                    return tt.check_no;
                case 8:
                    return tt.amount;
                case 9:
                    return tt.account_no_id;
                case 10:
                    return tt.account_no;
                case 11:
                    return tt.account_type;
                case 12:
                    return tt.account_type_id;
                case 13:
                    return tt.account_type_particular;
                case 14:
                    return tt.account_type_particular_id;
                case 15:
                    return tt.group_id;
                default:
                    return tt.group_name;
            }
        }
    }

    private void data_cols_disburses() {

        String date_from = DateType.sf.format(jDateChooser7.getDate());
        String date_to = DateType.sf.format(jDateChooser8.getDate());
        String reference_no = jTextField15.getText();

        String account_no = tf_account_no_id.getText();
        String where = " where account_no_id='" + account_no + "' and Date(disburse_date) between '" + date_from + "' and '" + date_to + "' and reference_no like '%" + reference_no + "%' ";

        loadData_account_disburses(S1_account_disburses.ret_data(where));
        double total = 0;
        List<to_account_disburses> datas = tbl_account_disburses_ALM;
        for (to_account_disburses t : datas) {
            total += t.amount;
        }
        jLabel1.setText(FitIn.fmt_wc_0(total));

    }

    private void add_account_disburses() {

        if (tf_account_no_id.getText().isEmpty()) {
            Alert.set(0, "Choose Account #");
            return;
        }
        int id = 0;
        String reference_no = tf_reference_no1.getText();
        String user_id = Res.getUser_id();
        String user_name = Res.getUser_name();
        String date_added = MyDate.now();
        String disburse_date = MyDate.date_to_string(jDateChooser6.getDate());
        String payee = tf_payee.getText();
        String check_no = tf_check_no.getText();
        double amount = FitIn.toDouble(tf_disburse_amount1.getText());
        String account_no_id = tf_account_no_id.getText();
        String account_no = tf_account_no.getText();
        String account_type = tf_account_particular.getText();
        String account_type_id = tf_account_particular_id.getText();
        String account_type_particular = jTextField1.getText();
        String account_type_particular_id = tf_account_types_id.getText();
        String group_id = "2";
        String group_name = "Disbursement";
        String voucher_no = S1_account_disburses.increment_id3();
        to_account_disburses to = new to_account_disburses(id, reference_no, user_id, user_name, date_added, disburse_date, payee, check_no, amount, account_no_id, account_no, account_type, account_type_id, account_type_particular, account_type_particular_id, group_id, group_name, voucher_no);
        S1_account_disburses.add_account_disburses(to);

        List<to_account_disburses_particulars> datas = tbl_account_disburses_particulars_ALM;
        id = FitIn.toInt(S1_account_disburses.increment_id2());
        double amounts = 0;
        for (to_account_disburses_particulars d : datas) {
            amounts += d.amount;
        }
        S1_account_disburses_particulars.add_account_disburses_particulars(datas, "" + id, amounts, voucher_no);
        data_cols_disburses();
        Alert.set(1, "");
        clear_account_disburses();
        tbl_account_disburses_particulars_ALM.clear();
        tbl_account_disburses_particulars_M.fireTableDataChanged();
        compute_disbursements_particular();
        tf_account_particular.grabFocus();

    }

    private void select_account_disburses() {
        int row = tbl_account_disburses.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_account_disburses.getSelectedColumn();
        if (col == 5) {
            print_cheque();
        } else if (col == 4) {
            to_account_disburses to = (to_account_disburses) tbl_account_disburses_ALM.get(tbl_account_disburses.convertRowIndexToModel(row));
            tf_reference_no1.setText(to.reference_no);

            tf_payee.setText(to.payee);
            tf_check_no.setText(to.check_no);
            tf_disburse_amount1.setText(FitIn.fmt_wc_0(to.amount));
            tf_account_types.setText(to.account_type_particular);
            tf_account_types_id.setText(to.account_type_particular_id);
            tf_account_particular.setText(to.account_type);
            tf_account_particular_id.setText(to.account_type_id);
            try {
                Date d = DateType.sf.parse(to.disburse_date);
                jDateChooser6.setDate(d);

            } catch (ParseException ex) {
                Logger.getLogger(Dlg_accounting_transactions.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            data_cols_particulars();
            jButton8.setEnabled(false);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            print_voucher(to, tbl_account_disburses_particulars_ALM);
        } else {
            to_account_disburses to = (to_account_disburses) tbl_account_disburses_ALM.get(tbl_account_disburses.convertRowIndexToModel(row));
            tf_reference_no1.setText(to.reference_no);

            tf_payee.setText(to.payee);
            tf_check_no.setText(to.check_no);
            tf_disburse_amount1.setText(FitIn.fmt_wc_0(to.amount));
            tf_account_types.setText(to.account_type_particular);
            tf_account_types_id.setText(to.account_type_particular_id);
            tf_account_particular.setText(to.account_type);
            tf_account_particular_id.setText(to.account_type_id);
            try {
                Date d = DateType.sf.parse(to.disburse_date);
                jDateChooser6.setDate(d);

            } catch (ParseException ex) {
                Logger.getLogger(Dlg_accounting_transactions.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            data_cols_particulars();
            jButton8.setEnabled(false);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
        }

    }

    private void print_voucher(to_account_disburses to, List<to_account_disburses_particulars> datas) {
        Window p = (Window) this;
        Dlg_voucher nd = Dlg_voucher.create(p, true);
        nd.setTitle("");
        nd.do_pass(to, datas);
        nd.setCallback(new Dlg_voucher.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_voucher.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(null);
        nd.setVisible(true);
    }

    private void edit_account_disburses() {
        int row = tbl_account_disburses.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disburses to = (to_account_disburses) tbl_account_disburses_ALM.get(tbl_account_disburses.convertRowIndexToModel(row));
        int id = to.id;
        String reference_no = tf_reference_no1.getText();
        String user_id = Res.getUser_id();
        String user_name = Res.getUser_name();
        String date_added = MyDate.now();
        String disburse_date = MyDate.date_to_string(jDateChooser6.getDate());
        String payee = tf_payee.getText();
        String check_no = tf_check_no.getText();
        double amount = FitIn.toDouble(tf_disburse_amount1.getText());
        String account_no_id = to.account_no_id;
        String account_no = to.account_no;
        String account_type = tf_account_particular.getText();
        String account_type_id = tf_account_particular_id.getText();
        String account_type_particular = jTextField1.getText();
        String account_type_particular_id = tf_account_types_id.getText();
        String group_id = "2";
        String group_name = "Disbursement";
        String voucher_no = to.voucher_no;
        to_account_disburses to1 = new to_account_disburses(id, reference_no, user_id, user_name, date_added, disburse_date, payee, check_no, amount, account_no_id, account_no, account_type, account_type_id, account_type_particular, account_type_particular_id, group_id, group_name, voucher_no);
        S1_account_disburses.edit_account_disburses(to1);
        data_cols_disburses();
        tbl_account_disburses.setRowSelectionInterval(row, row);
        data_cols_particulars();
//        clear_account_disburses();
        tf_account_particular.grabFocus();

    }

    private void clear_account_disburses() {
        tf_reference_no1.setText("");
        tf_payee.setText("");
        tf_check_no.setText("");
        tf_disburse_amount.setText("");
    }

    private void delete_account_disburses() {
        int row = tbl_account_disburses.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disburses to = (to_account_disburses) tbl_account_disburses_ALM.get(tbl_account_disburses.convertRowIndexToModel(row));
        S1_account_disburses.delete_account_disburses(to);
        data_cols_disburses();
        clear_account_disburses();
        Alert.set(3, "");
        tbl_account_disburses_particulars_ALM.clear();
        tbl_account_disburses_particulars_M.fireTableDataChanged();
        compute_disbursements_particular();
        tf_account_particular.grabFocus();
        tf_account_particular.grabFocus();
    }

    private void init_summary() {

        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String date_from = DateType.sf.format(jDateChooser7.getDate());
                String date_to = DateType.sf.format(jDateChooser8.getDate());
                String account_no_id = tf_account_no_id.getText();
                String where = " and Date(disburse_date) between '" + date_from + "' and '" + date_to + "' and account_no_id ='" + account_no_id + "'";
                List<Srpt_accounting_disbursements.field> fields1 = Srpt_accounting_disbursements.ret_data(where);
                String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
                String operated_by = System.getProperty("operated_by", "");
                String address = System.getProperty("address", "");
                String date = MyDate.report_date(jDateChooser7.getDate(), jDateChooser8.getDate());
                String account = tf_account_no.getText();
                Srpt_accounting_disbursements rpt = new Srpt_accounting_disbursements(business_name, operated_by, address, date, account);
                rpt.fields.addAll(fields1);
                String jrxml = "rpt_disbursements.jrxml";
                report_summary(rpt, jrxml);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
                cardLayout.show(jPanel8, "3");
            }
        });
        t.start();

    }

    private void report_summary(Srpt_accounting_disbursements to, String jrxml_name) {
        jPanel11.removeAll();
        jPanel11.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_summary(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel11.add(viewer);
            jPanel11.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_summary(Srpt_accounting_disbursements to, String rpt_name) {
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
            InputStream is = Srpt_accounting_disbursements.class
                    .getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    private void init_revenues() {
        jProgressBar2.setString("Loading...Please wait...");
        jProgressBar2.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String date_from = MyDate.date_to_yyyy_mm_dd(jDateChooser3.getDate());
                String date_to = MyDate.date_to_yyyy_mm_dd(jDateChooser4.getDate());
                String where = " where Date(or_date) between '" + date_from + "' and '" + date_to + "' and account_id='" + tf_account_no_id.getText() + "'";
                System.out.println(where);
                List<Srpt_full_collection.field> fields = Srpt_full_collection.ret_data(where);
                double tot = 0;
                for (Srpt_full_collection.field t : fields) {
                    if (t.getParent() == 1) {
                        tot += FitIn.toDouble(t.getAmount());
                    }
                }

                String total = FitIn.fmt_wc_0(tot);
                String business_name = System.getProperty("business_name", "St. Catherine of Alexandria Parish");
                String operated_by = System.getProperty("operated_by", "");
                String address = System.getProperty("address", "");
                String date = MyDate.report_date(jDateChooser3.getDate(), jDateChooser4.getDate());

                String jrxml = "rpt_zero_collection.jrxml";
                Srpt_full_collection rpt = new Srpt_full_collection(business_name, operated_by, address, date, total);
                rpt.fields.addAll(fields);
                report_revenues(rpt, jrxml);
                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
                cardLayout.show(jPanel8, "3");
            }
        });
        t.start();
    }

    private void report_revenues(Srpt_full_collection to, String jrxml_name) {
        jPanel11.removeAll();
        jPanel11.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_revenues(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel11.add(viewer);
            jPanel11.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_revenues(Srpt_full_collection to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper_revenues(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }

    public static JasperReport compileJasper_revenues(String jrxml_name) {
        try {
            String jrxml = jrxml_name;
            InputStream is = Srpt_full_collection.class
                    .getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
    JasperPrint jasperPrint = null;

    private void print_cheque() {
        int row = tbl_account_disburses.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_account_disburses to = (to_account_disburses) tbl_account_disburses_ALM.get(tbl_account_disburses.convertRowIndexToModel(row));
        String date = DateType.convert_sf_to_slash(to.disburse_date);
        String payee = "*** " + to.payee.toUpperCase() + " ***";
        String amount = "*** " + FitIn.fmt_wc_0(to.amount) + " ***";
        String amount_in_words = "*** " + DigitToWord.translateTo2(to.amount).toUpperCase();
        amount_in_words = amount_in_words.substring(0, amount_in_words.length() - 1);
        amount_in_words = amount_in_words + "ONLY ***";
        amount_in_words = amount_in_words.replaceAll(" PESOS", "");
        amount_in_words = amount_in_words.replaceAll("CENTAVOS", "");
        amount_in_words = amount_in_words.replaceAll("ONLYONLY", "ONLY");
        System.out.println(amount_in_words);
        final Srpt_cheque rpt = new Srpt_cheque(date, payee, amount, amount_in_words);
        Window p = (Window) this;
        Dlg_cheque_size nd = Dlg_cheque_size.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_cheque_size.Callback() {

            @Override
            public void commercial(CloseDialog closeDialog, Dlg_cheque_size.OutputData data) {
                closeDialog.ok();
                String jrxml = "rpt_cheque_commercial.jrxml";
                InputStream is = Srpt_cheque.class
                        .getResourceAsStream(jrxml);
                JasperReport jasperReport;

                try {
                    jasperReport = JasperCompileManager.compileReport(is);
                    jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                            setParameter(rpt), JasperUtil.emptyDatasource());
                    JasperPrintManager.printReport(jasperPrint, false);
                } catch (JRException ex) {
                    Logger.getLogger(Dlg_accounting_transactions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void personal(CloseDialog closeDialog, Dlg_cheque_size.OutputData data) {
                closeDialog.ok();
                String jrxml = "rpt_cheque_personal.jrxml";
                InputStream is = Srpt_cheque.class
                        .getResourceAsStream(jrxml);
                JasperReport jasperReport;

                try {
                    jasperReport = JasperCompileManager.compileReport(is);
                    jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                            setParameter(rpt), JasperUtil.emptyDatasource());
                    JasperPrintManager.printReport(jasperPrint, false);
                } catch (JRException ex) {
                    Logger.getLogger(Dlg_accounting_transactions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        nd.setLocationRelativeTo(jScrollPane5);
        nd.setVisible(true);
    }
    private ArrayListModel tbl_account_disburses_particulars_ALM;
    private Tblaccount_disburses_particularsModel tbl_account_disburses_particulars_M;

    private void init_tbl_account_disburses_particulars() {
        tbl_account_disburses_particulars_ALM = new ArrayListModel();
        tbl_account_disburses_particulars_M = new Tblaccount_disburses_particularsModel(tbl_account_disburses_particulars_ALM);
        tbl_account_disburses_particulars.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_account_disburses_particulars.setModel(tbl_account_disburses_particulars_M);
        tbl_account_disburses_particulars.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_account_disburses_particulars.setRowHeight(25);
        int[] tbl_widths_account_disburses_particulars = {100, 100, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_account_disburses_particulars.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_account_disburses_particulars, i, tbl_widths_account_disburses_particulars[i]);
        }
        Dimension d = tbl_account_disburses_particulars.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_account_disburses_particulars.getTableHeader().setPreferredSize(d);
        tbl_account_disburses_particulars.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_account_disburses_particulars.setRowHeight(25);
        tbl_account_disburses_particulars.setFont(new java.awt.Font("Arial", 0, 11));
        TableWidthUtilities.setColumnRightRenderer(tbl_account_disburses_particulars, 1);
    }

    private void loadData_account_disburses_particulars(List<to_account_disburses_particulars> acc) {
        tbl_account_disburses_particulars_ALM.clear();
        tbl_account_disburses_particulars_ALM.addAll(acc);

    }

    public static class Tblaccount_disburses_particularsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Particular", "Amount", "", "", "date_added", "disburse_date", "payee", "check_no", "amount", "account_no_id", "account_no", "account_type", "account_type_id", "account_type_particular", "account_type_particular_id", "group_id", "group_name", "account_disburses_id"
        };

        public Tblaccount_disburses_particularsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_account_disburses_particulars tt = (to_account_disburses_particulars) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.account_type_particular;
                case 1:
                    return FitIn.fmt_wc_0(tt.amount) + " ";
                case 2:
                    return " Delete";
                case 3:
                    return " Delete";
                case 4:
                    return tt.date_added;
                case 5:
                    return tt.disburse_date;
                case 6:
                    return tt.payee;
                case 7:
                    return tt.check_no;
                case 8:
                    return tt.amount;
                case 9:
                    return tt.account_no_id;
                case 10:
                    return tt.account_no;
                case 11:
                    return tt.account_type;
                case 12:
                    return tt.account_type_id;
                case 13:
                    return tt.account_type_particular;
                case 14:
                    return tt.account_type_particular_id;
                case 15:
                    return tt.group_id;
                case 16:
                    return tt.group_name;
                default:
                    return tt.account_disburses_id;
            }
        }
    }

    private void data_cols_particulars() {
        int row = tbl_account_disburses.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disburses to = (to_account_disburses) tbl_account_disburses_ALM.get(tbl_account_disburses.convertRowIndexToModel(row));
        String where = " where account_disburses_id='" + to.id + "' ";
        loadData_account_disburses_particulars(S1_account_disburses_particulars.ret_data(where));
        compute_disbursements_particular();
    }

    private void add_particular() {

        if (jButton8.isEnabled()) {
            int id = 0;
            String reference_no = tf_reference_no1.getText();
            String user_id = Res.getUser_id();
            String user_name = Res.getUser_name();
            String date_added = DateType.datetime.format(new Date());
            String disburse_date = DateType.sf.format(jDateChooser6.getDate());
            String payee = tf_payee.getText();
            String check_no = tf_check_no.getText();
            double amount = FitIn.toDouble(tf_disburse_amount.getText());
            String account_no_id = tf_account_no_id.getText();
            String account_no = tf_account_no.getText();
            String account_type = tf_account_types.getText();
            String account_type_id = tf_account_types_id.getText();
            String account_type_particular = tf_account_particular.getText();
            String account_type_particular_id = tf_account_particular_id.getText();
            String group_id = "2";
            String group_name = "Disbursement";
            String account_disburses_id = "-1";
            String voucher_no = "";
            S1_account_disburses_particulars.to_account_disburses_particulars to = new to_account_disburses_particulars(id, reference_no, user_id, user_name, date_added, disburse_date, payee, check_no, amount, account_no_id, account_no, account_type, account_type_id, account_type_particular, account_type_particular_id, group_id, group_name, account_disburses_id, voucher_no);
            tbl_account_disburses_particulars_ALM.add(to);
            tbl_account_disburses_particulars_M.fireTableDataChanged();

            tf_account_particular.setText("");
            tf_account_particular_id.setText("");
            tf_account_types.setText("");
            tf_account_type_id.setText("");
            tf_disburse_amount.setText("");
            tf_account_particular.grabFocus();

        } else {
            int row = tbl_account_disburses.getSelectedRow();
            if (row < 0) {
                return;
            }
            to_account_disburses to = (to_account_disburses) tbl_account_disburses_ALM.get(tbl_account_disburses.convertRowIndexToModel(row));
            int id = 0;
            String reference_no = to.reference_no;
            String user_id = to.user_id;
            String user_name = to.user_name;
            String date_added = DateType.datetime.format(new Date());
            String disburse_date = to.disburse_date;
            String payee = to.payee;
            String check_no = to.check_no;
            double amount = FitIn.toDouble(tf_disburse_amount.getText());
            String account_no_id = tf_account_no_id.getText();
            String account_no = tf_account_no.getText();
            String account_type = tf_account_types.getText();
            String account_type_id = tf_account_types_id.getText();
            String account_type_particular = tf_account_particular.getText();
            String account_type_particular_id = tf_account_particular_id.getText();
            String group_id = "2";
            String group_name = "Disbursement";
            String account_disburses_id = "" + to.id;
            String voucher_no = to.voucher_no;
            S1_account_disburses_particulars.to_account_disburses_particulars to2 = new to_account_disburses_particulars(id, reference_no, user_id, user_name, date_added, disburse_date, payee, check_no, amount, account_no_id, account_no, account_type, account_type_id, account_type_particular, account_type_particular_id, group_id, group_name, account_disburses_id, voucher_no);

            List<S1_account_disburses_particulars.to_account_disburses_particulars> datas = new ArrayList();
            datas.add(to2);
            double total_amount = FitIn.toDouble(tf_disburse_amount1.getText()) + amount;
            S1_account_disburses_particulars.add_account_disburses_particulars(datas, "" + to.id, total_amount, voucher_no);
            data_cols_disburses();
            tbl_account_disburses.setRowSelectionInterval(row, row);
            data_cols_particulars();
        }

        compute_disbursements_particular();
    }

    private void delete_particular() {
        int row = tbl_account_disburses_particulars.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disburses_particulars to = (to_account_disburses_particulars) tbl_account_disburses_particulars_ALM.get(tbl_account_disburses_particulars.convertRowIndexToModel(row));

        int col = tbl_account_disburses_particulars.getSelectedColumn();
        if (col == 2) {
            if (jButton8.isEnabled()) {
                tbl_account_disburses_particulars_ALM.remove(row);
                tbl_account_disburses_particulars_M.fireTableDataChanged();
                tf_account_particular.setText("");
                tf_account_particular_id.setText("");
                tf_account_types.setText("");
                tf_account_type_id.setText("");
                tf_disburse_amount.setText("");
                tf_account_particular.grabFocus();
                compute_disbursements_particular();
            } else {

                int row2 = tbl_account_disburses.getSelectedRow();
                if (row2 < 0) {
                    return;
                }

                double total_amount = FitIn.toDouble(tf_disburse_amount1.getText()) - to.amount;
                S1_account_disburses_particulars.delete_account_disburses_particulars(to, total_amount);
                tf_account_particular.setText("");
                tf_account_particular_id.setText("");
                tf_account_types.setText("");
                tf_account_type_id.setText("");
                tf_disburse_amount.setText("");
                tf_account_particular.grabFocus();
                data_cols_disburses();
                tbl_account_disburses.setRowSelectionInterval(row2, row2);
                data_cols_particulars();
                compute_disbursements_particular();
            }
        } else {
            select_particular();
        }
    }

    private void select_particular() {
        int row = tbl_account_disburses_particulars.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disburses_particulars to = (to_account_disburses_particulars) tbl_account_disburses_particulars_ALM.get(tbl_account_disburses_particulars.convertRowIndexToModel(row));
        tf_account_particular.setText(to.account_type_particular);
        tf_account_particular_id.setText(to.account_type_particular_id);
        tf_account_types.setText(to.account_type);
        tf_account_type_id.setText(to.account_type_id);
        tf_disburse_amount.setText(FitIn.fmt_wc_0(to.amount));
        jButton15.setEnabled(false);
        jButton14.setEnabled(true);
    }

    private void update_particular() {
        int row = tbl_account_disburses_particulars.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disburses_particulars to = (to_account_disburses_particulars) tbl_account_disburses_particulars_ALM.get(tbl_account_disburses_particulars.convertRowIndexToModel(row));
        if (jButton8.isEnabled()) {
            double amount = FitIn.toDouble(tf_disburse_amount.getText());
            String account_type = tf_account_types.getText();
            String account_type_id = tf_account_types_id.getText();
            String account_type_particular = tf_account_particular.getText();
            String account_type_particular_id = tf_account_particular_id.getText();
            to.setAccount_type(account_type);
            to.setAccount_type_id(account_type_id);
            to.setAccount_type_particular(account_type_particular);
            to.setAccount_type_particular_id(account_type_particular_id);
            to.setAmount(amount);
            tbl_account_disburses_particulars_M.fireTableDataChanged();
            tf_account_particular.setText("");
            tf_account_particular_id.setText("");
            tf_account_types.setText("");
            tf_account_type_id.setText("");
            tf_disburse_amount.setText("");
            tf_account_particular.grabFocus();
        } else {
            int row2 = tbl_account_disburses.getSelectedRow();
            if (row2 < 0) {
                return;
            }
            to_account_disburses t = (to_account_disburses) tbl_account_disburses_ALM.get(tbl_account_disburses.convertRowIndexToModel(row2));
            int id = to.id;
            String reference_no = to.reference_no;
            String user_id = to.user_id;
            String user_name = to.user_name;
            String date_added = DateType.datetime.format(new Date());
            String disburse_date = to.disburse_date;
            String payee = to.payee;
            String check_no = to.check_no;
            double amount = FitIn.toDouble(tf_disburse_amount.getText());
            String account_no_id = tf_account_no_id.getText();
            String account_no = tf_account_no.getText();
            String account_type = tf_account_types.getText();
            String account_type_id = tf_account_types_id.getText();
            String account_type_particular = tf_account_particular.getText();
            String account_type_particular_id = tf_account_particular_id.getText();
            String group_id = "2";
            String group_name = "Disbursement";
            String account_disburses_id = "" + t.id;
            String voucher_no = to.voucher_no;
            S1_account_disburses_particulars.to_account_disburses_particulars to2 = new to_account_disburses_particulars(id, reference_no, user_id, user_name, date_added, disburse_date, payee, check_no, amount, account_no_id, account_no, account_type, account_type_id, account_type_particular, account_type_particular_id, group_id, group_name, account_disburses_id, voucher_no);

            tf_account_particular.setText("");
            tf_account_particular_id.setText("");
            tf_account_types.setText("");
            tf_account_type_id.setText("");
            tf_disburse_amount.setText("");
            tf_account_particular.grabFocus();
            double total_amount = (FitIn.toDouble(tf_disburse_amount1.getText()) - to.amount) + to2.amount;
            S1_account_disburses_particulars.edit_account_disburses_particulars(to2, total_amount);
            data_cols_disburses();
            tbl_account_disburses.setRowSelectionInterval(row2, row2);
            data_cols_particulars();
        }

        compute_disbursements_particular();
    }

    private void compute_disbursements_particular() {
        List<to_account_disburses_particulars> datas = tbl_account_disburses_particulars_ALM;
        double total = 0;
        for (to_account_disburses_particulars to : datas) {
            total += to.amount;
        }
        tf_disburse_amount1.setText(FitIn.fmt_wc_0(total));
    }

    private void select_acc_type() {
        if (jCheckBox4.isSelected()) {
            tf_amount2.setText("");
            tf_account_type_id2.setText("");
            tf_amount3.setText("");
            tf_account_type_id3.setText("");
            jCheckBox5.setSelected(true);
        } else {
            tf_amount2.grabFocus();
        }
    }

    private void select_acc_particulars() {
        if (jCheckBox5.isSelected()) {
            tf_amount3.setText("");
            tf_account_type_id3.setText("");
            jCheckBox5.setSelected(true);
        } else {
            tf_amount3.grabFocus();
        }
    }

}

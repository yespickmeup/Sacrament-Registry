/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.cash_drawer;

import spires.accounting.S1_account_disbursement_details;
import spires.disbursements.S1_disbursements;
import spires.disbursements.S1_disbursements.to_cash_drawer_expenses;
import spires.expenses.S1_expenses;
import spires.touchscreen.Srpt_cashcount;

import spires.util.Alert;
import spires.util.DateType;
import spires.util.Focus_Fire;
import spires.util.MyBorder;
import spires.util.MyDate;
import spires.util.TableRenderer3;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
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
import org.jdesktop.swingx.JXLabel;
import spires.users.Res;
import spires.users.Users.to_users;

/**
 *
 * @author Maytopacka
 */
public class Dlg_cashout extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_cashin
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

        public final double amount;

        public OutputData(double amount) {
            this.amount = amount;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_cashout(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_cashout(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_cashout() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_cashout myRef;

    private void setThisRef(Dlg_cashout myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_cashout> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_cashout create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_cashout create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_cashout dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashout((java.awt.Frame) parent, false);
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
            Dlg_cashout dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashout((java.awt.Dialog) parent, false);
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

        Dlg_cashout dialog = Dlg_cashout.create(new javax.swing.JFrame(), true);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel14 = new org.jdesktop.swingx.JXLabel();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        jXLabel13 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel25 = new org.jdesktop.swingx.JXLabel();
        jXLabel26 = new org.jdesktop.swingx.JXLabel();
        jXLabel27 = new org.jdesktop.swingx.JXLabel();
        jXLabel23 = new org.jdesktop.swingx.JXLabel();
        jXLabel22 = new org.jdesktop.swingx.JXLabel();
        jXLabel24 = new org.jdesktop.swingx.JXLabel();
        jXLabel31 = new org.jdesktop.swingx.JXLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pnl_disbursements = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cash_drawer_expenses = new javax.swing.JTable();
        tf_expenses = new javax.swing.JTextField();
        tf_amount = new javax.swing.JTextField();
        jXLabel17 = new org.jdesktop.swingx.JXLabel();
        jXLabel18 = new org.jdesktop.swingx.JXLabel();
        jXLabel19 = new org.jdesktop.swingx.JXLabel();
        pnl_denomination = new javax.swing.JPanel();
        tf_cashin = new javax.swing.JTextField();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        tf_1k = new javax.swing.JTextField();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        tf_5h = new javax.swing.JTextField();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        tf_2h = new javax.swing.JTextField();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        tf_1h = new javax.swing.JTextField();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        tf_50 = new javax.swing.JTextField();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        tf_20 = new javax.swing.JTextField();
        jXLabel15 = new org.jdesktop.swingx.JXLabel();
        tf_coints = new javax.swing.JTextField();
        jXLabel16 = new org.jdesktop.swingx.JXLabel();
        tf_total = new javax.swing.JTextField();
        jXLabel83 = new org.jdesktop.swingx.JXLabel();
        jXLabel84 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(9, 79, 149));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jXLabel2.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel2.setText("7");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel2.setOpaque(true);
        jXLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel2MouseClicked(evt);
            }
        });

        jXLabel3.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel3.setText("8");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel3.setOpaque(true);

        jXLabel14.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel14.setText("5");
        jXLabel14.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel14.setOpaque(true);

        jXLabel12.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel12.setText("4");
        jXLabel12.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel12.setOpaque(true);

        jXLabel13.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel13.setText("6");
        jXLabel13.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel13.setOpaque(true);

        jXLabel4.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel4.setText("9");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel4.setOpaque(true);

        jXLabel25.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel25.setText("0");
        jXLabel25.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel25.setOpaque(true);

        jXLabel26.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel26.setText("Cl");
        jXLabel26.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel26.setOpaque(true);
        jXLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel26MouseClicked(evt);
            }
        });

        jXLabel27.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel27.setText(".");
        jXLabel27.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel27.setOpaque(true);
        jXLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel27MouseClicked(evt);
            }
        });

        jXLabel23.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel23.setText("3");
        jXLabel23.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel23.setOpaque(true);

        jXLabel22.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel22.setText("2");
        jXLabel22.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel22.setOpaque(true);

        jXLabel24.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel24.setText("1");
        jXLabel24.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel24.setOpaque(true);

        jXLabel31.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel31.setText("Ok");
        jXLabel31.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jXLabel31.setOpaque(true);
        jXLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jXLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jXLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jXLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jXLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jXLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jXLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jXLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jXLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jXLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(249, 154, 4));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/money-bag-48_1.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cash Count");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setLayout(new java.awt.CardLayout());

        tbl_cash_drawer_expenses.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_cash_drawer_expenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cash_drawer_expensesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cash_drawer_expenses);

        tf_expenses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_expenses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_expenses.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_expenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_expensesMouseClicked(evt);
            }
        });
        tf_expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_expensesActionPerformed(evt);
            }
        });

        tf_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_amount.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_amountMouseClicked(evt);
            }
        });
        tf_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_amountActionPerformed(evt);
            }
        });

        jXLabel17.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel17.setText("Particular");
        jXLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel17.setOpaque(true);
        jXLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel17MouseClicked(evt);
            }
        });

        jXLabel18.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jXLabel18.setText("Total: ");
        jXLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel18.setOpaque(true);
        jXLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel18MouseClicked(evt);
            }
        });

        jXLabel19.setBackground(new java.awt.Color(198, 123, 4));
        jXLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel19.setText("0.00");
        jXLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel19.setOpaque(true);
        jXLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_disbursementsLayout = new javax.swing.GroupLayout(pnl_disbursements);
        pnl_disbursements.setLayout(pnl_disbursementsLayout);
        pnl_disbursementsLayout.setHorizontalGroup(
            pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(tf_expenses)
                .addGap(0, 0, 0)
                .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_disbursementsLayout.createSequentialGroup()
                .addComponent(jXLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jXLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_disbursementsLayout.setVerticalGroup(
            pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_disbursementsLayout.createSequentialGroup()
                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(pnl_disbursementsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jXLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jPanel5.add(pnl_disbursements, "card2");

        tf_cashin.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_cashin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_cashin.setFocusable(false);
        tf_cashin.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_cashin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cashinMouseClicked(evt);
            }
        });
        tf_cashin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cashinActionPerformed(evt);
            }
        });

        jXLabel5.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel5.setText("Cashin:");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel5.setOpaque(true);
        jXLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel5MouseClicked(evt);
            }
        });

        jXLabel6.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel6.setText("1000");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel6.setOpaque(true);
        jXLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel6MouseClicked(evt);
            }
        });

        tf_1k.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_1k.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_1k.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_1k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_1kMouseClicked(evt);
            }
        });
        tf_1k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_1kActionPerformed(evt);
            }
        });
        tf_1k.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_1kKeyReleased(evt);
            }
        });

        jXLabel7.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel7.setText("500");
        jXLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel7.setOpaque(true);
        jXLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel7MouseClicked(evt);
            }
        });

        tf_5h.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_5h.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_5h.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_5h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_5hMouseClicked(evt);
            }
        });
        tf_5h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_5hActionPerformed(evt);
            }
        });
        tf_5h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_5hKeyReleased(evt);
            }
        });

        jXLabel8.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel8.setText("200");
        jXLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel8.setOpaque(true);
        jXLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel8MouseClicked(evt);
            }
        });

        tf_2h.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_2h.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_2h.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_2h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_2hMouseClicked(evt);
            }
        });
        tf_2h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_2hActionPerformed(evt);
            }
        });
        tf_2h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_2hKeyReleased(evt);
            }
        });

        jXLabel9.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel9.setText("100");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel9.setOpaque(true);
        jXLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel9MouseClicked(evt);
            }
        });

        tf_1h.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_1h.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_1h.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_1h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_1hMouseClicked(evt);
            }
        });
        tf_1h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_1hActionPerformed(evt);
            }
        });
        tf_1h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_1hKeyReleased(evt);
            }
        });

        jXLabel10.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel10.setText("50");
        jXLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel10.setOpaque(true);
        jXLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel10MouseClicked(evt);
            }
        });

        tf_50.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_50.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_50MouseClicked(evt);
            }
        });
        tf_50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_50ActionPerformed(evt);
            }
        });
        tf_50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_50KeyReleased(evt);
            }
        });

        jXLabel11.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel11.setText("20");
        jXLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel11.setOpaque(true);
        jXLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel11MouseClicked(evt);
            }
        });

        tf_20.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_20.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_20MouseClicked(evt);
            }
        });
        tf_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_20ActionPerformed(evt);
            }
        });
        tf_20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_20KeyReleased(evt);
            }
        });

        jXLabel15.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel15.setText("Coins");
        jXLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel15.setOpaque(true);
        jXLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel15MouseClicked(evt);
            }
        });

        tf_coints.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_coints.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_coints.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_coints.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cointsMouseClicked(evt);
            }
        });
        tf_coints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cointsActionPerformed(evt);
            }
        });
        tf_coints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_cointsKeyReleased(evt);
            }
        });

        jXLabel16.setBackground(new java.awt.Color(249, 154, 4));
        jXLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel16.setText("Total");
        jXLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jXLabel16.setOpaque(true);
        jXLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel16MouseClicked(evt);
            }
        });

        tf_total.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        tf_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 122, 67)));
        tf_total.setFocusable(false);
        tf_total.setMargin(new java.awt.Insets(2, 10, 2, 2));
        tf_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_totalMouseClicked(evt);
            }
        });
        tf_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_denominationLayout = new javax.swing.GroupLayout(pnl_denomination);
        pnl_denomination.setLayout(pnl_denominationLayout);
        pnl_denominationLayout.setHorizontalGroup(
            pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_denominationLayout.createSequentialGroup()
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_cashin)
                    .addComponent(tf_1k, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(tf_5h, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(tf_2h, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(tf_1h, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(tf_50, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(tf_20, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(tf_coints, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(tf_total)))
        );
        pnl_denominationLayout.setVerticalGroup(
            pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_denominationLayout.createSequentialGroup()
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_cashin, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_1k)
                    .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_5h)
                    .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_2h)
                    .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_1h)
                    .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_50)
                    .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_20)
                    .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_coints)
                    .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnl_denominationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.add(pnl_denomination, "card3");

        jXLabel83.setBackground(new java.awt.Color(157, 122, 67));
        jXLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel83.setText("Denomination");
        jXLabel83.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jXLabel83.setOpaque(true);
        jXLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel83MouseClicked(evt);
            }
        });

        jXLabel84.setBackground(new java.awt.Color(157, 122, 67));
        jXLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel84.setText("Disbursements");
        jXLabel84.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jXLabel84.setOpaque(true);
        jXLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel84MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jXLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jXLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel2MouseClicked

    }//GEN-LAST:event_jXLabel2MouseClicked

    private void jXLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel26MouseClicked
        clear();
    }//GEN-LAST:event_jXLabel26MouseClicked

    private void jXLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel27MouseClicked

    }//GEN-LAST:event_jXLabel27MouseClicked

    private void jXLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel31MouseClicked
//        ok1();
        cashout();
    }//GEN-LAST:event_jXLabel31MouseClicked

    private void tf_cashinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cashinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cashinMouseClicked

    private void tf_cashinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cashinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cashinActionPerformed

    private void jXLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel83MouseClicked
        cardLayout.show(jPanel5, "1");
    }//GEN-LAST:event_jXLabel83MouseClicked

    private void jXLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel84MouseClicked
        cardLayout.show(jPanel5, "2");
    }//GEN-LAST:event_jXLabel84MouseClicked

    private void jXLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel5MouseClicked

    private void jXLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel6MouseClicked

    private void tf_1kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_1kMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_1kMouseClicked

    private void tf_1kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_1kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_1kActionPerformed

    private void jXLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel7MouseClicked

    private void tf_5hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_5hMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_5hMouseClicked

    private void tf_5hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_5hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_5hActionPerformed

    private void jXLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel8MouseClicked

    private void tf_2hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_2hMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_2hMouseClicked

    private void tf_2hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_2hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_2hActionPerformed

    private void jXLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel9MouseClicked

    private void tf_1hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_1hMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_1hMouseClicked

    private void tf_1hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_1hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_1hActionPerformed

    private void jXLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel10MouseClicked

    private void tf_50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_50MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_50MouseClicked

    private void tf_50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_50ActionPerformed

    private void jXLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel11MouseClicked

    private void tf_20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_20MouseClicked

    private void tf_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_20ActionPerformed

    private void jXLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel15MouseClicked

    private void tf_cointsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cointsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cointsMouseClicked

    private void tf_cointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cointsActionPerformed

    private void jXLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel16MouseClicked

    private void tf_totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_totalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_totalMouseClicked

    private void tf_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_totalActionPerformed

    private void tf_expensesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_expensesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_expensesMouseClicked

    private void tf_expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_expensesActionPerformed
        init_manager();
    }//GEN-LAST:event_tf_expensesActionPerformed

    private void tf_amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_amountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_amountMouseClicked

    private void tf_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_amountActionPerformed
        add_expenses();
    }//GEN-LAST:event_tf_amountActionPerformed

    private void tf_1kKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_1kKeyReleased
        compute();
    }//GEN-LAST:event_tf_1kKeyReleased

    private void tf_5hKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_5hKeyReleased
        compute();
    }//GEN-LAST:event_tf_5hKeyReleased

    private void tf_2hKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_2hKeyReleased
        compute();
    }//GEN-LAST:event_tf_2hKeyReleased

    private void tf_1hKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_1hKeyReleased
        compute();
    }//GEN-LAST:event_tf_1hKeyReleased

    private void tf_50KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_50KeyReleased
        compute();
    }//GEN-LAST:event_tf_50KeyReleased

    private void tf_20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_20KeyReleased
        // TODO add your handling code here:
        compute();
    }//GEN-LAST:event_tf_20KeyReleased

    private void tf_cointsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cointsKeyReleased
        // TODO add your handling code here:
        compute();
    }//GEN-LAST:event_tf_cointsKeyReleased

    private void jXLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel17MouseClicked

    private void tbl_cash_drawer_expensesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cash_drawer_expensesMouseClicked
        delete_expenses();
    }//GEN-LAST:event_tbl_cash_drawer_expensesMouseClicked

    private void jXLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel18MouseClicked

    private void jXLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel19MouseClicked
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel13;
    private org.jdesktop.swingx.JXLabel jXLabel14;
    private org.jdesktop.swingx.JXLabel jXLabel15;
    private org.jdesktop.swingx.JXLabel jXLabel16;
    private org.jdesktop.swingx.JXLabel jXLabel17;
    private org.jdesktop.swingx.JXLabel jXLabel18;
    private org.jdesktop.swingx.JXLabel jXLabel19;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel22;
    private org.jdesktop.swingx.JXLabel jXLabel23;
    private org.jdesktop.swingx.JXLabel jXLabel24;
    private org.jdesktop.swingx.JXLabel jXLabel25;
    private org.jdesktop.swingx.JXLabel jXLabel26;
    private org.jdesktop.swingx.JXLabel jXLabel27;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel31;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel83;
    private org.jdesktop.swingx.JXLabel jXLabel84;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private javax.swing.JPanel pnl_denomination;
    private javax.swing.JPanel pnl_disbursements;
    private javax.swing.JTable tbl_cash_drawer_expenses;
    private javax.swing.JTextField tf_1h;
    private javax.swing.JTextField tf_1k;
    private javax.swing.JTextField tf_20;
    private javax.swing.JTextField tf_2h;
    private javax.swing.JTextField tf_50;
    private javax.swing.JTextField tf_5h;
    private javax.swing.JTextField tf_amount;
    private javax.swing.JTextField tf_cashin;
    private javax.swing.JTextField tf_coints;
    private javax.swing.JTextField tf_expenses;
    private javax.swing.JTextField tf_total;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        type();
        set_card_layout();
        focus();
        init_tbl_cash_drawer_expenses();
        data_cols();
    }

    private void focus() {
        JTextField[] tf = {tf_1h, tf_1k, tf_20, tf_2h, tf_50, tf_5h, tf_5h, tf_coints, tf_total, tf_expenses, tf_amount, tf_cashin};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
        MyBorder.setBorder2(tf);
    }

    S1_cash_drawer.to_cash_drawer to2 = null;

    public void do_pass() {
        String now = MyDate.now_sf();
        String where = " where user_id='" + Res.getUser_id() + "' and Date(time_in)='" + now + "' ";
        S1_cash_drawer.to_cash_drawer to = S1_cash_drawer.ret_data_to(where);
        
        to2 = to;
        tf_cashin.setText(FitIn.fmt_wc_0(0));
        tf_1k.setText(FitIn.fmt_woc(to.thousand));
        tf_5h.setText(FitIn.fmt_woc(to.five_hundred));
        tf_2h.setText(FitIn.fmt_woc(to.two_hundred));
        tf_1h.setText(FitIn.fmt_woc(to.one_hundred));
        tf_50.setText(FitIn.fmt_woc(to.fifty));
        tf_20.setText(FitIn.fmt_woc(to.twenty));
        tf_coints.setText(FitIn.fmt_wc_0(to.coins));
        compute();
        data_cols();
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

    CardLayout cardLayout = new CardLayout();

    private void set_card_layout() {
        cardLayout = (CardLayout) jPanel5.getLayout();
        cardLayout.addLayoutComponent("1", pnl_denomination);
        cardLayout.addLayoutComponent("2", pnl_disbursements);
        cardLayout.show(jPanel5, "1");
    }

    private void ok1() {
        double amount = FitIn.toDouble(tf_cashin.getText());
        if (amount < 0) {
            Alert.set(0, "ENTER AMOUNT");
            return;
        }
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(amount));
        }
    }

    private void clear() {
        if (tf_1k.hasFocus()) {

            tf_1k.setText("");
        }
        if (tf_5h.hasFocus()) {
            tf_5h.setText("");
        }
        if (tf_2h.hasFocus()) {
            tf_2h.setText("");
        }
        if (tf_1h.hasFocus()) {
            tf_1h.setText("");
        }
        if (tf_50.hasFocus()) {
            tf_50.setText("");
        }
        if (tf_20.hasFocus()) {
            tf_20.setText("");
        }
        if (tf_coints.hasFocus()) {
            tf_coints.setText("");
        }
        compute();
    }

    private void type() {

        JXLabel[] lbl = {
            jXLabel2, jXLabel3, jXLabel4, jXLabel25, jXLabel12, jXLabel14, jXLabel13, jXLabel24, jXLabel22, jXLabel23,};
        for (final JXLabel l : lbl) {
            l.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {

                    if (tf_1k.hasFocus()) {
                        String text = tf_1k.getText();
                        text = text + l.getText();
                        tf_1k.setText(text);
                    }
                    if (tf_5h.hasFocus()) {
                        String text = tf_5h.getText();
                        text = text + l.getText();
                        tf_5h.setText(text);
                    }
                    if (tf_2h.hasFocus()) {
                        String text = tf_2h.getText();
                        text = text + l.getText();
                        tf_2h.setText(text);
                    }
                    if (tf_1h.hasFocus()) {
                        String text = tf_1h.getText();
                        text = text + l.getText();
                        tf_1h.setText(text);
                    }
                    if (tf_50.hasFocus()) {
                        String text = tf_50.getText();
                        text = text + l.getText();
                        tf_50.setText(text);
                    }
                    if (tf_20.hasFocus()) {
                        String text = tf_20.getText();
                        text = text + l.getText();
                        tf_20.setText(text);
                    }
                    if (tf_coints.hasFocus()) {
                        String text = tf_coints.getText();
                        text = text + l.getText();
                        tf_coints.setText(text);
                    }
                    compute();
                }
            });
        }
    }

    private void compute() {
        double cashin = FitIn.toDouble(tf_cashin.getText());
        double thousand = FitIn.toDouble(tf_1k.getText()) * 1000;
        double five_hundred = FitIn.toDouble(tf_5h.getText()) * 500;
        double two_hundred = FitIn.toDouble(tf_2h.getText()) * 200;
        double one_hundred = FitIn.toDouble(tf_1h.getText()) * 100;
        double fifty = FitIn.toDouble(tf_50.getText()) * 50;
        double twenty = FitIn.toDouble(tf_20.getText()) * 20;
        double coins = FitIn.toDouble(tf_coints.getText()) * 1;
        double sum = cashin + thousand + five_hundred + two_hundred + one_hundred + fifty + twenty + coins;
        tf_total.setText(FitIn.fmt_wc_0(sum));
    }

    private ArrayListModel tbl_cash_drawer_expenses_ALM;
    private Tblcash_drawer_expensesModel tbl_cash_drawer_expenses_M;

    private void init_tbl_cash_drawer_expenses() {
        tbl_cash_drawer_expenses_ALM = new ArrayListModel();
        tbl_cash_drawer_expenses_M = new Tblcash_drawer_expensesModel(tbl_cash_drawer_expenses_ALM);
        tbl_cash_drawer_expenses.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_cash_drawer_expenses.setModel(tbl_cash_drawer_expenses_M);
        tbl_cash_drawer_expenses.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_cash_drawer_expenses.setRowHeight(25);
        int[] tbl_widths_cash_drawer_expenses = {100, 100, 60, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_cash_drawer_expenses.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_cash_drawer_expenses, i, tbl_widths_cash_drawer_expenses[i]);
        }
        Dimension d = tbl_cash_drawer_expenses.getTableHeader().getPreferredSize();
        d.height = 0;
        tbl_cash_drawer_expenses.getTableHeader().setPreferredSize(d);
        tbl_cash_drawer_expenses.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_cash_drawer_expenses.setRowHeight(25);
        tbl_cash_drawer_expenses.setFont(new java.awt.Font("Arial", 0, 11));
        TableWidthUtilities.setColumnRightRenderer(tbl_cash_drawer_expenses, WIDTH);
    }

    private void loadData_cash_drawer_expenses(List<to_cash_drawer_expenses> acc) {
        tbl_cash_drawer_expenses_ALM.clear();
        tbl_cash_drawer_expenses_ALM.addAll(acc);
    }

    public static class Tblcash_drawer_expensesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "session_no", "user_name", "screen_name", "time_in", "time_out", "bank", "check_no", "check_holder", "amount", "date_added"
        };

        public Tblcash_drawer_expensesModel(ListModel listmodel) {
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
            to_cash_drawer_expenses tt = (to_cash_drawer_expenses) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.bank;
                case 1:
                    return FitIn.fmt_wc_0(tt.amount) + " ";
                case 2:
                    return "    Delete";
                case 3:
                    return tt.screen_name;
                case 4:
                    return tt.time_in;
                case 5:
                    return tt.time_out;
                case 6:
                    return tt.bank;
                case 7:
                    return tt.check_no;
                case 8:
                    return tt.check_holder;
                case 9:
                    return tt.amount;
                default:
                    return tt.date_added;
            }
        }
    }

    private void data_cols() {
        String now = MyDate.now_sf();
        String where = " where user_name='" + Res.getUser_name() + "' and Date(date_added)='" + now + "' ";
        loadData_cash_drawer_expenses(S1_disbursements.ret_data(where));

    }

    List<S1_account_disbursement_details.to_account_disbursement_details> expenses_list = new ArrayList();

    private void init_manager() {
        String search = tf_expenses.getText();
        expenses_list.clear();
        String where = " where detail like '%" + search + "%' order by detail asc";
        expenses_list = S1_account_disbursement_details.ret_data(where);
        if (expenses_list.isEmpty()) {
            S1_expenses.to_expenses to = new S1_expenses.to_expenses(0, tf_expenses.getText());
            S1_expenses.add_expenses(to);
            tf_amount.grabFocus();
        } else {
            if (expenses_list.size() == 1) {
                S1_account_disbursement_details.to_account_disbursement_details t = expenses_list.get(0);
                tf_amount.grabFocus();
            } else {
                Object[][] obj = new Object[expenses_list.size()][2];
                int i = 0;
                for (S1_account_disbursement_details.to_account_disbursement_details to : expenses_list) {
                    obj[i][0] = " " + to.detail;
                    i++;
                }
                JLabel[] labels = {};
                int[] tbl_widths_customers = {300};
                int width = 0;
                String[] col_names = {""};
                TableRenderer3 tr = new TableRenderer3();
                TableRenderer3.setPopup(tf_expenses, obj, labels, tbl_widths_customers, col_names);
                tr.setCallback(new TableRenderer3.Callback() {
                    @Override
                    public void ok(TableRenderer3.OutputData data) {
                        S1_account_disbursement_details.to_account_disbursement_details to = expenses_list.get(data.selected_row);
                        tf_expenses.setText(to.detail);
                        tf_amount.grabFocus();

                        account_type = to.detail;
                        account_type_id = "" + to.id;
                        account_type_particular = to.account_disbursement;
                        account_type_particular_id = to.account_disbursement_id;
                    }
                });
            }
        }
    }

    String account_no_id = "1";
    String account_no = "BPI 1081-0143-09";
    String account_type = "";
    String account_type_id = "";
    String account_type_particular = "";
    String account_type_particular_id = "";
    String group_id = "2";
    String group_name = "Disbursement";

    private void add_expenses() {
        int id = -1;
        String session_no = "";
        String user_name = Res.getUser_name();
        String screen_name = Res.getUser_screename();
        String time_in = MyDate.now();
        String time_out = MyDate.now();
        String bank = tf_expenses.getText();
        String check_no = "";
        String check_holder = "";
        double amount = FitIn.toDouble(tf_amount.getText());
        String date_added = MyDate.now();

        to_cash_drawer_expenses to = new to_cash_drawer_expenses(id, session_no, user_name, screen_name, time_in, time_out, bank, check_no
                , check_holder, amount, date_added, account_no_id, account_no, account_type, account_type_id, account_type_particular, account_type_particular_id, group_id, group_name);
        S1_disbursements.add_cash_drawer_expenses(to);
        data_cols();
        compute_disbursements();
    }

    private void delete_expenses() {
        int row = tbl_cash_drawer_expenses.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_cash_drawer_expenses to = (to_cash_drawer_expenses) tbl_cash_drawer_expenses_ALM.get(tbl_cash_drawer_expenses.convertRowIndexToModel(row));
        int col = tbl_cash_drawer_expenses.getSelectedColumn();
        if (col == 2) {
            S1_disbursements.delete_cash_drawer_expenses(to);
            data_cols();
            compute_disbursements();
        }
    }

    private void cashout() {
        int id = to2.id;
        String user_id = to2.user_id;
        String user_name = to2.user_name;
        String screen_name = to2.screen_name;
        double cash_in = to2.cash_in;
        String time_in = to2.time_in;
        String time_out = to2.time_out;
        double thousand = FitIn.toDouble(tf_1k.getText());
        double five_hundred = FitIn.toDouble(tf_5h.getText());
        double two_hundred = FitIn.toDouble(tf_2h.getText());
        double one_hundred = FitIn.toDouble(tf_1h.getText());
        double fifty = FitIn.toDouble(tf_50.getText());
        double twenty = FitIn.toDouble(tf_20.getText());
        double coins = FitIn.toDouble(tf_coints.getText());
        S1_cash_drawer.to_cash_drawer to = new S1_cash_drawer.to_cash_drawer(id, user_id, user_name, screen_name, cash_in, time_in, time_out, thousand, five_hundred, two_hundred, one_hundred, fifty, twenty, coins);
        S1_cash_drawer.edit_cash_drawer(to);

        try {

            double cashin = FitIn.toDouble(tf_cashin.getText());

            String prepared_by = Res.getUser_screename().toUpperCase();
            String approved_by = "";
            double total_cash = (thousand * 1000) + (five_hundred * 500) + (two_hundred * 200) + (one_hundred * 100)
                    + (fifty * 50) + (twenty * 20) + (coins * 1);
            double total_disbursements = FitIn.toDouble(jXLabel19.getText());
            String date = DateType.slash2.format(new Date());
            Srpt_cashcount rpt = new Srpt_cashcount(cashin, thousand, five_hundred, two_hundred, one_hundred, fifty, twenty, coins, prepared_by, approved_by, total_cash, total_disbursements, date);
            String jrxml = "rpt_cashcount.jrxml";
            InputStream is = Srpt_cashcount.class.getResourceAsStream(jrxml);
            JasperReport jasperReport = JasperCompileManager.compileReport(is);
            jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                    setParameter(rpt), JasperUtil.emptyDatasource());
            JasperPrintManager.printReport(jasperPrint, false);
            System.exit(1);
        } catch (JRException ex) {
            Logger.getLogger(Srpt_cashcount.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
    JasperPrint jasperPrint = null;

    private void compute_disbursements() {
        List<to_cash_drawer_expenses> datas = tbl_cash_drawer_expenses_ALM;
        double total = 0;
        for (to_cash_drawer_expenses to : datas) {
            total += to.amount;
        }
        jXLabel19.setText(FitIn.fmt_wc_0(total));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.accounting;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import spires.cashiering.Cashiering;
import spires.cashiering.Cashiering.to_cashiering;
import spires.cashiering.Cashiering_types;
import spires.receipts.Receipts;
import spires.receipts.Receipts.to_receipts;
import spires.users.Res;
import spires.util.Alert;
import spires.util.DateType;
import spires.util.Dlg_confirm_action;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer1;

/**
 *
 * @author Guinness
 */
public class Dlg_front_desk extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_front_desk
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
    private Dlg_front_desk(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_front_desk(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_front_desk() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_front_desk myRef;

    private void setThisRef(Dlg_front_desk myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_front_desk> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_front_desk create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_front_desk create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_front_desk dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_front_desk((java.awt.Frame) parent, false);
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
            Dlg_front_desk dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_front_desk((java.awt.Dialog) parent, false);
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

        Dlg_front_desk dialog = Dlg_front_desk.create(new javax.swing.JFrame(), true);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cashiering = new javax.swing.JTable();
        jTextField1 = new Field.Search();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_receipts = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new Button.Success();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_receipts2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new Field.Combo();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField3 = new Field.Combo();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField4 = new Field.Combo();
        jButton2 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new Field.Input();
        jButton3 = new Button.Info();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        pnl_account_titles = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        pnl_mass_register = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbl_cashiering.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_cashiering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cashieringMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cashiering);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Select Classification");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tbl_receipts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_receipts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_receiptsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_receipts);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("No. of rows:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("0");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/get-money.png"))); // NOI18N
        jButton1.setText("Settle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("0.00");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Total Amount:");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Collections", jPanel3);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tbl_receipts2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_receipts2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_receipts2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_receipts2);

        jLabel2.setText("No. of rows:");

        jLabel3.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("User:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("All");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Date From:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("to:");

        jDateChooser2.setDate(new Date());
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Classification:");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("All");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Particular:");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("All");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/magnifying-glass34.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("All");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Search:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/printer22.png"))); // NOI18N
        jButton3.setText("Generate Report");

        jLabel15.setText("Total Amount:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("0.00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox1)
                                            .addComponent(jCheckBox4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                            .addComponent(jTextField2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField4))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jTextField6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)))))
                        .addGap(41, 41, 41))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox4)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox3))))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Report", jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/magnifying-glass34.png"))); // NOI18N
        jButton4.setText("Preview");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(848, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_account_titles.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_account_titlesLayout = new javax.swing.GroupLayout(pnl_account_titles);
        pnl_account_titles.setLayout(pnl_account_titlesLayout);
        pnl_account_titlesLayout.setHorizontalGroup(
            pnl_account_titlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_account_titlesLayout.setVerticalGroup(
            pnl_account_titlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_account_titles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_account_titles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Account Titles", jPanel7);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/magnifying-glass34.png"))); // NOI18N
        jButton5.setText("Preview");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Date From:");

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("All");

        jDateChooser3.setDate(new Date());
        jDateChooser3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("to:");

        jDateChooser4.setDate(new Date());
        jDateChooser4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(402, 402, 402)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5)))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_mass_register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_mass_registerLayout = new javax.swing.GroupLayout(pnl_mass_register);
        pnl_mass_register.setLayout(pnl_mass_registerLayout);
        pnl_mass_registerLayout.setHorizontalGroup(
            pnl_mass_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_mass_registerLayout.setVerticalGroup(
            pnl_mass_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_mass_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_mass_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mass Register", jPanel9);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        ret_cashiering();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbl_receiptsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_receiptsMouseClicked
        select_receipt();
    }//GEN-LAST:event_tbl_receiptsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        settle_receipt();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked

    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ret_receipts();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_cashieringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cashieringMouseClicked
        select_classification();
    }//GEN-LAST:event_tbl_cashieringMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        preview_account_titles();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        preview_mass_register();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_receipts2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_receipts2MouseClicked
        edit_receipt();
    }//GEN-LAST:event_tbl_receipts2MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel pnl_account_titles;
    private javax.swing.JPanel pnl_mass_register;
    private javax.swing.JTable tbl_cashiering;
    private javax.swing.JTable tbl_receipts;
    private javax.swing.JTable tbl_receipts2;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
//        System.setProperty("print_marriage", "bacong");
//        System.setProperty("mydb", "db_spires_bacong");
        init_key();
        init_tbl_cashiering(tbl_cashiering);
        init_tbl_receipts(tbl_receipts);
        init_tbl_receipts2(tbl_receipts2);
        ret_cashiering();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jTextField1.grabFocus();
            }
        });

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

        tbl_cashiering.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    jTextField1.grabFocus();
                }

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    dlg_cashiering_types();
                    e.consume();

                }
                if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
                    settle_receipt();
                    e.consume();

                }
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_classifications();
                    e.consume();

                }
            }

        });
        jTextField1.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (!tbl_cashiering_ALM.isEmpty()) {
                        tbl_cashiering.setRowSelectionInterval(0, 0);
                        tbl_cashiering.grabFocus();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
                    settle_receipt();
                    e.consume();

                }
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_classifications();
                    e.consume();

                }

            }
        });

        tbl_receipts.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    select_receipt();
                    e.consume();
                }
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    delete_receipt();
                    e.consume();
                }
                if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
                    settle_receipt();
                    e.consume();

                }
            }

        });
    }

    private void dlg_classifications() {
        Window p = (Window) this;
        Dlg_front_desk_classifications nd = Dlg_front_desk_classifications.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_front_desk_classifications.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_front_desk_classifications.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" cashiering "> 
    public static ArrayListModel tbl_cashiering_ALM;
    public static TblcashieringModel tbl_cashiering_M;

    public static void init_tbl_cashiering(JTable tbl_cashiering) {
        tbl_cashiering_ALM = new ArrayListModel();
        tbl_cashiering_M = new TblcashieringModel(tbl_cashiering_ALM);
        tbl_cashiering.setModel(tbl_cashiering_M);
        tbl_cashiering.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        int[] tbl_widths_cashiering = {100, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_cashiering.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_cashiering, i, tbl_widths_cashiering[i]);
        }
        Dimension d = tbl_cashiering.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_cashiering.getTableHeader().setPreferredSize(new Dimension(0, 0));
        tbl_cashiering.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_cashiering.setRowHeight(30);
        tbl_cashiering.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_cashiering.getColumnModel().getColumn(1).setCellRenderer(new ImageRenderer1());
    }

    public static void loadData_cashiering(List<to_cashiering> acc) {
        tbl_cashiering_ALM.clear();
        tbl_cashiering_ALM.addAll(acc);
    }

    public static class TblcashieringModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "", "", "rate", "is_active", "fix_rate", "incremental", "accounting_group_id", "accounting_group_name", "accounting_account_id", "accounting_account_name", "accounting_account_type", "accounting_account_type_id"
        };

        public TblcashieringModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
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
            to_cashiering tt = (to_cashiering) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.account;
                case 1:
                    return "/spires/img_functions/edit.png";
                case 2:
                    return tt.rate;
                case 3:
                    return tt.is_active;
                case 4:
                    return tt.fix_rate;
                case 5:
                    return tt.incremental;
                case 6:
                    return tt.accounting_group_id;
                case 7:
                    return tt.accounting_group_name;
                case 8:
                    return tt.accounting_account_id;
                case 9:
                    return tt.accounting_account_name;
                case 10:
                    return tt.accounting_account_type;
                default:
                    return tt.accounting_account_type_id;
            }
        }
    }

    private void ret_cashiering() {
        String search = jTextField1.getText();
        String where = " where account like '%" + search + "%' order by account asc ";
        List<to_cashiering> datas = Cashiering.ret_data(where);
        loadData_cashiering(datas);

    }

    private void dlg_cashiering_types() {
        int row = tbl_cashiering.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_cashiering to = (to_cashiering) tbl_cashiering_ALM.get(row);
        Window p = (Window) this;
        Dlg_front_desk_cashiering_types nd = Dlg_front_desk_cashiering_types.create(p, true);
        nd.setTitle("");
        nd.do_pass("" + to.id);
        nd.setCallback(new Dlg_front_desk_cashiering_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_front_desk_cashiering_types.OutputData data) {
                closeDialog.ok();

                Cashiering_types.to_cashiering_types to = data.cashiering_type;

                int id = 0;
                String or_no = "";
                String or_date = data.or_date;
                String date_added = "";
                String or_time = data.or_time;
                String user_name = "";
                String terminal_id = "";
                double amount_due = to.rate;
                if (to.fix_rate.equals("0")) {
                    amount_due = data.cash + data.check_amount;
                }
                double cash = data.cash;
                double check_amount = data.check_amount;
                String check_no = data.check_no;
                String check_holder = data.check_holder;
                String message = data.remarks;
                String parishioner = "";
                String parishioner_id = "";
                String parioshioner_contact_no = "";
                String account_name = to.accounting_account_name;
                String account_id = to.accounting_account_id;
                String account_type = to.accounting_account_type;
                String account_type_id = to.accounting_account_type_id;
                String status = "1";
                String particular = to.cashiering_type;
                String particular_id = "" + to.id;
                String particular_account = to.account;
                String particular_account_id = to.account_id;
                String check_bank = data.check_bank;
                int is_fixed = FitIn.toInt(to.fix_rate);
                Receipts.to_receipts receipt = new to_receipts(id, or_no, or_date, date_added, or_time, user_name, terminal_id, amount_due, cash, check_amount, check_no, check_holder, message, parishioner, parishioner_id, parioshioner_contact_no, account_name, account_id, account_type, account_type_id, status, particular, particular_id, particular_account, particular_account_id, check_bank, is_fixed);
                tbl_receipts_ALM.add(receipt);

                compute_receipt();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        jTextField1.grabFocus();
                    }
                });

            }
        });
        Point loc = jTextField1.getLocationOnScreen();
        nd.setLocation(loc.x - 295, loc.y);
        nd.setVisible(true);
    }
//</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" receipts "> 
    public static ArrayListModel tbl_receipts_ALM;
    public static TblreceiptsModel tbl_receipts_M;

    public static void init_tbl_receipts(JTable tbl_receipts) {
        tbl_receipts_ALM = new ArrayListModel();
        tbl_receipts_M = new TblreceiptsModel(tbl_receipts_ALM);
        tbl_receipts.setModel(tbl_receipts_M);
        tbl_receipts.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_receipts.setRowHeight(25);
        int[] tbl_widths_receipts = {100, 100, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_receipts.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_receipts, i, tbl_widths_receipts[i]);
        }
        Dimension d = tbl_receipts.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_receipts.getTableHeader().setPreferredSize(d);
        tbl_receipts.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_receipts.setRowHeight(25);
        tbl_receipts.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_receipts, 1);
        tbl_receipts.getColumnModel().getColumn(2).setCellRenderer(new ImageRenderer1());
        tbl_receipts.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer1());
    }

    public static void loadData_receipts(List<to_receipts> acc) {
        tbl_receipts_ALM.clear();
        tbl_receipts_ALM.addAll(acc);
    }

    public static class TblreceiptsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Particular", "Amount", "", "", "or_time", "user_name", "terminal_id", "amount_due", "cash", "check_amount", "check_no", "check_holder", "message", "parishioner", "parishioner_id", "parioshioner_contact_no", "account_name", "account_id", "account_type", "account_type_id", "status", "particular", "particular_id", "particular_account", "particular_account_id"
        };

        public TblreceiptsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
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
            to_receipts tt = (to_receipts) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.particular;
                case 1:

                    if (tt.is_fixed == 1) {
                        return FitIn.fmt_wc_0(tt.amount_due) + " ";
                    } else {
                        return FitIn.fmt_wc_0((tt.cash + tt.check_amount)) + " ";
                    }
                case 2:
                    return "/spires/img_functions/edit.png";
                case 3:
                    return "/spires/img_functions/remove11.png";
                case 4:
                    return tt.or_time;
                case 5:
                    return tt.user_name;
                case 6:
                    return tt.terminal_id;
                case 7:
                    return tt.amount_due;
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

    private void select_receipt() {
        final int row = tbl_receipts.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_receipts.getSelectedColumn();
        if (col == 2) {
            final to_receipts receipt = (to_receipts) tbl_receipts_ALM.get(row);
            Window p = (Window) this;
            Dlg_front_desk_tender nd = Dlg_front_desk_tender.create(p, true);
            nd.setTitle("");
            nd.do_update(receipt);
            nd.setCallback(new Dlg_front_desk_tender.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_front_desk_tender.OutputData data) {
                    closeDialog.ok();
                    receipt.setCash(data.cash);
                    receipt.setCheck_amount(data.check_amount);
                    receipt.setCheck_holder(data.check_holder);
                    receipt.setCheck_no(data.check_no);
                    receipt.setMessage(data.remarks);
                    receipt.setOr_date(data.or_date);
                    receipt.setOr_time(data.or_time);
                    tbl_receipts_M.fireTableDataChanged();
                    compute_receipt();
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            jTextField1.grabFocus();
                        }
                    });
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 3) {
            tbl_receipts_ALM.remove(row);
            tbl_receipts_M.fireTableDataChanged();
        }

    }

    private void delete_receipt() {
        final int row = tbl_receipts.getSelectedRow();
        if (row < 0) {
            return;
        }

        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                tbl_receipts_ALM.remove(row);
                compute_receipt();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        jTextField1.grabFocus();
                    }
                });
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void compute_receipt() {
        List< Receipts.to_receipts> datas = tbl_receipts_ALM;
        double amount = 0;
        for (Receipts.to_receipts rece : datas) {

            if (rece.is_fixed == 1) {
                amount += rece.amount_due;
            } else {
                amount += rece.cash + rece.check_amount;
            }
        }
        jLabel8.setText(FitIn.fmt_wc_0(amount));
        jLabel7.setText("" + tbl_receipts_ALM.size());
    }

    private void settle_receipt() {
        double amount_due = FitIn.toDouble(jLabel8.getText());
        Window p = (Window) this;
        Dlg_front_desk_settle nd = Dlg_front_desk_settle.create(p, true);
        nd.setTitle("");
        nd.do_pass(amount_due);
        nd.setCallback(new Dlg_front_desk_settle.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_front_desk_settle.OutputData data) {
                closeDialog.ok();

                List<to_receipts> receipts = tbl_receipts_ALM;
                if (receipts.isEmpty()) {
                    Alert.set(0, "Select Transaction!");
                    jTextField1.grabFocus();
                    return;
                }
                List<to_receipts> to_add = new ArrayList();
                String or_no = data.or_no;
                String where = " where or_no like '" + or_no + "' limit 1";
                List<to_receipts> datas = Receipts.ret_data(where);
                if (!datas.isEmpty()) {
                    or_no = Receipts.increment_id();
                }
                String or_date = "";
                String date_added = DateType.now();
                String or_time = "";
                String user_name = Res.getUser_id();
                String terminal_id = "";
                String parishioner = data.parishioner;
                String parishioner_id = data.parishioner_id;
                String parioshioner_contact_no = data.parishioner_contact_no;
                for (to_receipts to : receipts) {
                    int id = 0;
                    or_date = to.or_date;
                    or_time = to.or_time;
                    double amount_due = to.amount_due;
                    double cash = to.cash;
                    double check_amount = to.check_amount;
                    String check_no = to.check_no;
                    String check_holder = to.check_holder;
                    String message = to.message;

                    String account_name = to.account_name;
                    String account_id = to.account_id;
                    String account_type = to.account_type;
                    String account_type_id = to.account_type_id;
                    String status = "1";
                    String particular = to.particular;
                    String particular_id = to.particular_id;
                    String particular_account = to.particular_account;
                    String particular_account_id = to.particular_account_id;
                    String check_bank = to.check_bank;
                    int is_fixed = to.is_fixed;
                    Receipts.to_receipts receipt = new to_receipts(id, or_no, or_date, date_added, or_time, user_name, terminal_id, amount_due, cash, check_amount, check_no, check_holder, message, parishioner, parishioner_id, parioshioner_contact_no, account_name, account_id, account_type, account_type_id, status, particular, particular_id, particular_account, particular_account_id, check_bank, is_fixed);
                    to_add.add(receipt);
                }

                Receipts.add_receipts(to_add);
                tbl_receipts_ALM.clear();
                compute_receipt();
                jTextField1.grabFocus();
                Alert.set(1, "");
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" receipts "> 
    public static ArrayListModel tbl_receipts_ALM2;
    public static TblreceiptsModel2 tbl_receipts_M2;

    public static void init_tbl_receipts2(JTable tbl_receipts2) {
        tbl_receipts_ALM2 = new ArrayListModel();
        tbl_receipts_M2 = new TblreceiptsModel2(tbl_receipts_ALM2);
        tbl_receipts2.setModel(tbl_receipts_M2);
        tbl_receipts2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_receipts2.setRowHeight(25);
        int[] tbl_widths_receipts = {150, 80, 100, 150, 150, 80, 60, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_receipts.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_receipts2, i, tbl_widths_receipts[i]);
        }
        Dimension d = tbl_receipts2.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_receipts2.getTableHeader().setPreferredSize(d);
        tbl_receipts2.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_receipts2.setRowHeight(25);
        tbl_receipts2.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_receipts2.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer1());
        tbl_receipts2.getColumnModel().getColumn(8).setCellRenderer(new ImageRenderer1());
        tbl_receipts2.getColumnModel().getColumn(9).setCellRenderer(new ImageRenderer1());
        TableWidthUtilities.setColumnRightRenderer(tbl_receipts2, 5);
    }

    public static void loadData_receipts2(List<to_receipts> acc) {
        tbl_receipts_ALM2.clear();
        tbl_receipts_ALM2.addAll(acc);
    }

    public static class TblreceiptsModel2 extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Transaction No", "Date", "Name", "Amount Due", "Classification", "Particular", "Status", "", "", "", "check_no", "check_holder", "message", "parishioner", "parishioner_id", "parioshioner_contact_no", "account_name", "account_id", "account_type", "account_type_id", "status", "particular", "particular_id", "particular_account", "particular_account_id", "check_bank", "is_fixed"
        };

        public TblreceiptsModel2(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
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
            to_receipts tt = (to_receipts) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.or_no;
                case 1:
                    return " " + DateType.convert_slash_datetime2(tt.or_date);
                case 2:
                    return " " + tt.parishioner;
                case 3:
                    return " " + tt.particular_account;

                case 4:
                    return " " + tt.particular;

                case 5:

                    if (tt.is_fixed == 1) {
                        return FitIn.fmt_wc_0(tt.amount_due) + " ";
                    } else {
                        return FitIn.fmt_wc_0(tt.cash + tt.check_amount) + " ";
                    }
                case 6:
                    if (tt.status.equals("1")) {
                        return " Counted";
                    } else {
                        return " Void";
                    }

                case 7:
                    return "/spires/img_functions/edit.png";
                case 8:
                    return "/spires/img_functions/printer22.png";
                case 9:
                    return "/spires/img_functions/remove11.png";
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
                case 24:
                    return tt.particular_account_id;
                case 25:
                    return tt.check_bank;
                default:
                    return tt.is_fixed;
            }
        }
    }

    private void ret_receipts() {
        String where = " ";
        List<to_receipts> datas = Receipts.ret_data(where);
        loadData_receipts2(datas);
        double amount = 0;
        for (to_receipts to : datas) {
            if (to.is_fixed == 1) {
                amount += to.amount_due;
            } else {
                amount += to.cash + to.check_amount;
            }
        }
        jLabel3.setText("" + datas.size());
        jLabel16.setText(FitIn.fmt_wc_0(amount));
    }
//</editor-fold> 

    private void select_classification() {
        int row = tbl_cashiering.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_cashiering to = (to_cashiering) tbl_cashiering_ALM.get(row);
        int col = tbl_cashiering.getSelectedColumn();
        if (col == 1) {
            Window p = (Window) this;
            Dlg_front_desk_classifications nd = Dlg_front_desk_classifications.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_front_desk_classifications.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_front_desk_classifications.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 0) {
            dlg_cashiering_types();
        }

    }

    //<editor-fold defaultstate="collapsed" desc=" account titles ">
    private void preview_account_titles() {
        String where = "   order by account,cashiering_type asc ";
        List<Cashiering_types.to_cashiering_types> datas = Cashiering_types.ret_data(where);
        List<Srpt_account_titles.field> fields = new ArrayList();
        for (Cashiering_types.to_cashiering_types to : datas) {
            String classification = to.account;
            String category = to.accounting_account_type;
            String particular = to.cashiering_type;
            Srpt_account_titles.field field = new Srpt_account_titles.field(classification, category, particular);
            fields.add(field);
        }
        String name = System.getProperty("business_name", "");
        String address = System.getProperty("address", "");
        Srpt_account_titles rpt = new Srpt_account_titles(name, address);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_account_titles.jrxml";
        report_account_titles(rpt, jrxml);
    }

    private void report_account_titles(Srpt_account_titles to, String jrxml_name) {
        pnl_account_titles.removeAll();
        pnl_account_titles.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_account_titles(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            pnl_account_titles.add(viewer);
            pnl_account_titles.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_account_titles(Srpt_account_titles to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper_account_titles(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }

    public static JasperReport compileJasper_account_titles(String jrxml_name) {
        try {
            String jrxml = jrxml_name;
            InputStream is = Srpt_account_titles.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Mass Register ">
    private void preview_mass_register() {
        String date_from = DateType.sf.format(jDateChooser3.getDate());
        String date_to = DateType.sf.format(jDateChooser4.getDate());
        String where = "   where Date(or_date) between '" + date_from + "' and '" + date_to + "' and particular_account = 'Mass Intentions' order by concat(Date(or_date),or_time),particular desc ";

        List<Receipts.to_receipts> datas = Receipts.ret_data(where);
        List<Srpt_mass_intention.field> fields = new ArrayList();
        for (Receipts.to_receipts to : datas) {
            String datetime = DateType.convert_jan_1_2013_date_rep2(to.or_date) + " - " + to.or_time;
            String particular = to.particular;
            String parishioner = to.parishioner;
            String remarks = to.message;
            Srpt_mass_intention.field field = new Srpt_mass_intention.field(datetime, particular, parishioner, remarks);
            fields.add(field);
        }
        String name = System.getProperty("business_name", "");
        String address = System.getProperty("address", "");
        Srpt_mass_intention rpt = new Srpt_mass_intention(name, address);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_mass_register.jrxml";
        report_mass_register(rpt, jrxml);
    }

    private void report_mass_register(Srpt_mass_intention to, String jrxml_name) {
        pnl_mass_register.removeAll();
        pnl_mass_register.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_mass_register(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            pnl_mass_register.add(viewer);
            pnl_mass_register.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_mass_register(Srpt_mass_intention to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper_mass_register(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }

    public static JasperReport compileJasper_mass_register(String jrxml_name) {
        try {
            String jrxml = jrxml_name;
            InputStream is = Srpt_mass_intention.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Receipts ">
    private void edit_receipt() {
        int row = tbl_receipts2.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_receipts to = (to_receipts) tbl_receipts_ALM2.get(row);
        int col = tbl_receipts2.getSelectedColumn();
        if (col == 7) {
            Window p = (Window) this;
            Dlg_front_desk_edit_receipts nd = Dlg_front_desk_edit_receipts.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_front_desk_edit_receipts.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_front_desk_edit_receipts.OutputData data) {
                    closeDialog.ok();
                    String old_or = "" + to.id;
                    String new_or = data.or_no;
                    String or_date = data.or_date;
                    String parishioner = data.parishioner;
                    String parishioner_id = data.parishioner_id;
                    String parishioner_contact_no = data.parishioner_contact_no;
                    String parishioner_address = data.parishioner_address;
                    Receipts.edit_receipt_details(old_or, new_or, or_date, parishioner, parishioner_id, parishioner_contact_no, parishioner_address);
                    Alert.set(2, "");
                    ret_receipts();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 9) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");

            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Receipts.delete_receipts(to);
                    Alert.set(3, "");
                    ret_receipts();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }
    //</editor-fold>
}

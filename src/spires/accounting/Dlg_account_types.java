/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.accounting;

import spires.accounting.S1_account_disbursement_details.to_account_disbursement_details;
import spires.accounting.S1_account_disbursements.to_account_disbursements;
import spires.accounting.S1_account_numbers.to_account_numbers;
import spires.accounting.S1_account_revenues.to_account_revenues;
import spires.cashiering.Dlg_cashiering;
import spires.util.Alert;
import spires.util.Focus_Fire;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;

/**
 *
 * @author Ronald
 */
public class Dlg_account_types extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_account_types
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
    private Dlg_account_types(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_account_types(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_account_types() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_account_types myRef;

    private void setThisRef(Dlg_account_types myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_account_types> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_account_types create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_account_types create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_account_types dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_account_types((java.awt.Frame) parent, false);
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
            Dlg_account_types dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_account_types((java.awt.Dialog) parent, false);
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

        Dlg_account_types dialog = Dlg_account_types.create(new javax.swing.JFrame(), true);
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_account_numbers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tf_description = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_account_no = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_account_disbursements = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tf_particular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_account_disbursement_details = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_detail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        tf_revenue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_account_revenues = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_account_numbers.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_account_numbers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_account_numbersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_account_numbers);

        jLabel1.setText("Description:");

        jLabel2.setText("Account No:");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Active/Inactive");

        jLabel3.setText("Status:");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setText("Search:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1))
                            .addComponent(tf_description)
                            .addComponent(tf_account_no)
                            .addComponent(jTextField3))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_account_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox1)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Account No.", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Revenues", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tbl_account_disbursements.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_account_disbursements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_account_disbursementsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_account_disbursements);

        jLabel6.setText("Name:");

        jLabel7.setText("Status:");

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Active/Inactive");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jButton9.setText("New");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Add");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Update");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel8.setText("Search:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tbl_account_disbursement_details.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_account_disbursement_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_account_disbursement_detailsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_account_disbursement_details);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Details");

        jLabel12.setText("Name:");

        jLabel13.setText("Status:");

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Active/Inactive");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Update");
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

        jLabel4.setText("Name:");

        jLabel5.setText("Status:");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Active/Inactive");

        jButton8.setText("New");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Search:");

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_account_revenuesMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_account_revenues);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(102, 102, 102)
                                .addComponent(tf_revenue, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_revenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_particular, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCheckBox4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tf_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tf_particular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12)
                            .addComponent(jButton11)
                            .addComponent(jButton10)
                            .addComponent(jButton9))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(tf_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jCheckBox4)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13)
                            .addComponent(jButton14)
                            .addComponent(jButton15)
                            .addComponent(jButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Disbursements", jPanel6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Account Types", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear_account_numbers();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_account_numbers();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        edit_account_numbers();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete_account_numbers();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_account_numbersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_account_numbersMouseClicked
        select_account_numbers();
    }//GEN-LAST:event_tbl_account_numbersMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        clear_account_revenues();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        add_account_revenues();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        edit_account_revenues();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        delete_account_revenues();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_account_revenuesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_account_revenuesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_account_revenuesMouseEntered

    private void tbl_account_revenuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_account_revenuesMouseClicked
        select_account_revenues();
    }//GEN-LAST:event_tbl_account_revenuesMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        clear_account_disbursements();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        add_account_disbursements();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        edit_account_disbursements();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        delete_account_disbursements();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tbl_account_disbursementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_account_disbursementsMouseClicked
        select_account_disbursements();
        data_cols_disbursement_details();
    }//GEN-LAST:event_tbl_account_disbursementsMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        data_cols_disbursements();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        data_cols_revenues();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        data_cols();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void tbl_account_disbursement_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_account_disbursement_detailsMouseClicked
        select_account_disbursement_details();
    }//GEN-LAST:event_tbl_account_disbursement_detailsMouseClicked

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        clear_account_disbursement_details();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        add_account_disbursement_details();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        edit_account_disbursement_details();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        delete_account_disbursement_details();
    }//GEN-LAST:event_jButton13ActionPerformed

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
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tbl_account_disbursement_details;
    private javax.swing.JTable tbl_account_disbursements;
    private javax.swing.JTable tbl_account_numbers;
    private javax.swing.JTable tbl_account_revenues;
    private javax.swing.JTextField tf_account_no;
    private javax.swing.JTextField tf_description;
    private javax.swing.JTextField tf_detail;
    private javax.swing.JTextField tf_particular;
    private javax.swing.JTextField tf_revenue;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        focus();
        init_cashiering();
        init_tbl_account_numbers();
        data_cols();

        init_tbl_account_revenues();
//        data_cols_revenues();

        init_tbl_account_disbursements();
        data_cols_disbursements();

        init_tbl_account_disbursement_details();

        jPanel7.setVisible(false);
    }

    private void init_cashiering() {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                Dlg_cashiering dat = new Dlg_cashiering();
                jPanel8.setLayout(new BorderLayout());
                jPanel8.add(dat.getSurface());

            }
        });
        t.start();

    }

    private void focus() {
        JTextField[] tf = {tf_description, tf_account_no, tf_revenue, tf_particular, jTextField3, jTextField1, jTextField2, tf_detail};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
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

    private ArrayListModel tbl_account_numbers_ALM;
    private Tblaccount_numbersModel tbl_account_numbers_M;

    private void init_tbl_account_numbers() {
        tbl_account_numbers_ALM = new ArrayListModel();
        tbl_account_numbers_M = new Tblaccount_numbersModel(tbl_account_numbers_ALM);
        tbl_account_numbers.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_account_numbers.setModel(tbl_account_numbers_M);
        tbl_account_numbers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_account_numbers.setRowHeight(25);
        int[] tbl_widths_account_numbers = {100, 200, 50, 0};
        for (int i = 0, n = tbl_widths_account_numbers.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_account_numbers, i, tbl_widths_account_numbers[i]);
        }
        Dimension d = tbl_account_numbers.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_account_numbers.getTableHeader().setPreferredSize(d);
        tbl_account_numbers.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_account_numbers.setRowHeight(25);
        tbl_account_numbers.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_account_numbers(List<to_account_numbers> acc) {
        tbl_account_numbers_ALM.clear();
        tbl_account_numbers_ALM.addAll(acc);
    }

    public static class Tblaccount_numbersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Description", "Account #", "Active", "status"
        };

        public Tblaccount_numbersModel(ListModel listmodel) {
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
            to_account_numbers tt = (to_account_numbers) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.description;
                case 1:
                    return " " + tt.account_no;
                case 2:
                    if (tt.status == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }

                default:
                    return tt.status;
            }
        }
    }

    private void data_cols() {
        String where = " where description like '%" + jTextField3.getText() + "%'";
        loadData_account_numbers(S1_account_numbers.ret_data(where));
    }

    private void add_account_numbers() {
        int id = -1;
        String description = tf_description.getText();
        String account_no = tf_account_no.getText();
        int status = 0;
        if (jCheckBox1.isSelected()) {
            status = 1;
        }
        to_account_numbers to = new to_account_numbers(id, description, account_no, status);
        S1_account_numbers.add_account_numbers(to);
        data_cols();
        clear_account_numbers();
        Alert.set(1, "");
    }

    private void select_account_numbers() {
        int row = tbl_account_numbers.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_numbers to = (to_account_numbers) tbl_account_numbers_ALM.get(tbl_account_numbers.convertRowIndexToModel(row));
        tf_description.setText(to.description);
        tf_account_no.setText(to.account_no);
        jCheckBox1.setSelected(true);
        if (to.status == 0) {
            jCheckBox1.setSelected(false);
        }
    }

    private void edit_account_numbers() {
        int row = tbl_account_numbers.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_numbers to = (to_account_numbers) tbl_account_numbers_ALM.get(tbl_account_numbers.convertRowIndexToModel(row));
        int id = to.id;
        String description = tf_description.getText();
        String account_no = tf_account_no.getText();
        int status = 0;
        if (jCheckBox1.isSelected()) {
            status = 1;
        }
        to_account_numbers to1 = new to_account_numbers(id, description, account_no, status);
        S1_account_numbers.edit_account_numbers(to1);
        data_cols();
        clear_account_numbers();
        Alert.set(2, "");
    }

    private void clear_account_numbers() {
        tf_description.setText("");
        tf_account_no.setText("");
        tf_description.grabFocus();
    }

    private void delete_account_numbers() {
        int row = tbl_account_numbers.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_numbers to = (to_account_numbers) tbl_account_numbers_ALM.get(tbl_account_numbers.convertRowIndexToModel(row));
        S1_account_numbers.delete_account_numbers(to);
        data_cols();
        clear_account_numbers();
        Alert.set(3, "");
    }

    private ArrayListModel tbl_account_revenues_ALM;
    private Tblaccount_revenuesModel tbl_account_revenues_M;

    private void init_tbl_account_revenues() {
        tbl_account_revenues_ALM = new ArrayListModel();
        tbl_account_revenues_M = new Tblaccount_revenuesModel(tbl_account_revenues_ALM);
        tbl_account_revenues.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_account_revenues.setModel(tbl_account_revenues_M);
        tbl_account_revenues.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_account_revenues.setRowHeight(25);
        int[] tbl_widths_account_revenues = {100, 50};
        for (int i = 0, n = tbl_widths_account_revenues.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_account_revenues, i, tbl_widths_account_revenues[i]);
        }
        Dimension d = tbl_account_revenues.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_account_revenues.getTableHeader().setPreferredSize(d);
        tbl_account_revenues.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_account_revenues.setRowHeight(25);
        tbl_account_revenues.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_account_revenues(List<to_account_revenues> acc) {
        tbl_account_revenues_ALM.clear();
        tbl_account_revenues_ALM.addAll(acc);
    }

    public static class Tblaccount_revenuesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Revenue", "Active"
        };

        public Tblaccount_revenuesModel(ListModel listmodel) {
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
            to_account_revenues tt = (to_account_revenues) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.revenue;
                default:
                    if (tt.status == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }

            }
        }
    }

    private void data_cols_revenues() {
        String where = " where revenue like '%" + jTextField2.getText() + "%' order by revenue asc";
        loadData_account_revenues(S1_account_revenues.ret_data(where));
    }

    private void add_account_revenues() {
        int id = -1;
        String revenue = tf_revenue.getText();
        int status = 0;
        if (jCheckBox2.isSelected()) {
            status = 1;
        }
        to_account_revenues to = new to_account_revenues(id, revenue, status);
        S1_account_revenues.add_account_revenues(to);
        data_cols_revenues();
        clear_account_revenues();
        Alert.set(1, "");
    }

    private void select_account_revenues() {
        int row = tbl_account_revenues.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_revenues to = (to_account_revenues) tbl_account_revenues_ALM.get(tbl_account_revenues.convertRowIndexToModel(row));
        tf_revenue.setText(to.revenue);
        jCheckBox2.setSelected(true);
        if (to.status == 0) {
            jCheckBox2.setSelected(false);
        }
    }

    private void edit_account_revenues() {
        int row = tbl_account_revenues.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_revenues to = (to_account_revenues) tbl_account_revenues_ALM.get(tbl_account_revenues.convertRowIndexToModel(row));
        int id = to.id;
        String revenue = tf_revenue.getText();
        int status = 0;
        if (jCheckBox2.isSelected()) {
            status = 1;
        }
        to_account_revenues to1 = new to_account_revenues(id, revenue, status);
        S1_account_revenues.edit_account_revenues(to1);
        data_cols_revenues();
        clear_account_revenues();
        Alert.set(2, "");
    }

    private void clear_account_revenues() {
        tf_revenue.setText("");
        tf_revenue.grabFocus();
    }

    private void delete_account_revenues() {
        int row = tbl_account_revenues.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_revenues to = (to_account_revenues) tbl_account_revenues_ALM.get(tbl_account_revenues.convertRowIndexToModel(row));
        S1_account_revenues.delete_account_revenues(to);
        data_cols_revenues();
        clear_account_revenues();
        Alert.set(3, "");
    }

    private ArrayListModel tbl_account_disbursements_ALM;
    private Tblaccount_disbursementsModel tbl_account_disbursements_M;

    private void init_tbl_account_disbursements() {
        tbl_account_disbursements_ALM = new ArrayListModel();
        tbl_account_disbursements_M = new Tblaccount_disbursementsModel(tbl_account_disbursements_ALM);
        tbl_account_disbursements.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_account_disbursements.setModel(tbl_account_disbursements_M);
        tbl_account_disbursements.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_account_disbursements.setRowHeight(25);
        int[] tbl_widths_account_disbursements = {100, 50, 0};
        for (int i = 0, n = tbl_widths_account_disbursements.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_account_disbursements, i, tbl_widths_account_disbursements[i]);
        }
        Dimension d = tbl_account_disbursements.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_account_disbursements.getTableHeader().setPreferredSize(d);
        tbl_account_disbursements.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_account_disbursements.setRowHeight(25);
        tbl_account_disbursements.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_account_disbursements(List<to_account_disbursements> acc) {
        tbl_account_disbursements_ALM.clear();
        tbl_account_disbursements_ALM.addAll(acc);
    }

    public static class Tblaccount_disbursementsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Active", "status"
        };

        public Tblaccount_disbursementsModel(ListModel listmodel) {
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
            to_account_disbursements tt = (to_account_disbursements) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.particular;
                case 1:
                    if (tt.status == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }
                default:
                    if (tt.status == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }

            }
        }
    }

    private void data_cols_disbursements() {
        String where = " where particular like '%" + jTextField1.getText() + "%' order by particular asc";
        loadData_account_disbursements(S1_account_disbursements.ret_data(where));
    }

    private void add_account_disbursements() {
        int id = -1;
        String particular = tf_particular.getText();
        int status = 0;
        if (jCheckBox3.isSelected()) {
            status = 1;
        }
        to_account_disbursements to = new to_account_disbursements(id, particular, status);
        S1_account_disbursements.add_account_disbursements(to);
        data_cols_disbursements();
        clear_account_disbursements();
        Alert.set(1, "");
    }

    private void select_account_disbursements() {
        int row = tbl_account_disbursements.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disbursements to = (to_account_disbursements) tbl_account_disbursements_ALM.get(tbl_account_disbursements.convertRowIndexToModel(row));
        tf_particular.setText(to.particular);
        if (to.status == 0) {
            jCheckBox3.setSelected(false);
        } else {
            jCheckBox3.setSelected(true);
        }
    }

    private void edit_account_disbursements() {
        int row = tbl_account_disbursements.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disbursements to = (to_account_disbursements) tbl_account_disbursements_ALM.get(tbl_account_disbursements.convertRowIndexToModel(row));
        int id = to.id;
        String particular = tf_particular.getText();
        int status = 0;
        if (jCheckBox3.isSelected()) {
            status = 1;
        }
        to_account_disbursements to1 = new to_account_disbursements(id, particular, status);
        S1_account_disbursements.edit_account_disbursements(to1);
        data_cols_disbursements();
        tbl_account_disbursements.setRowSelectionInterval(row, row);
        data_cols_disbursement_details();
        clear_account_disbursements();
        Alert.set(2, "");
    }

    private void clear_account_disbursements() {
        tf_particular.setText("");
        tf_particular.grabFocus();
    }

    private void delete_account_disbursements() {
        int row = tbl_account_disbursements.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disbursements to = (to_account_disbursements) tbl_account_disbursements_ALM.get(tbl_account_disbursements.convertRowIndexToModel(row));
        S1_account_disbursements.delete_account_disbursements(to);
        data_cols_disbursements();
        tbl_account_disbursement_details_ALM.clear();
        tbl_account_disbursement_details_M.fireTableDataChanged();
        clear_account_disbursements();
        Alert.set(3, "");
    }

    private ArrayListModel tbl_account_disbursement_details_ALM;
    private Tblaccount_disbursement_detailsModel tbl_account_disbursement_details_M;

    private void init_tbl_account_disbursement_details() {
        tbl_account_disbursement_details_ALM = new ArrayListModel();
        tbl_account_disbursement_details_M = new Tblaccount_disbursement_detailsModel(tbl_account_disbursement_details_ALM);
        tbl_account_disbursement_details.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_account_disbursement_details.setModel(tbl_account_disbursement_details_M);
        tbl_account_disbursement_details.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_account_disbursement_details.setRowHeight(25);
        int[] tbl_widths_account_disbursement_details = {100, 50, 0, 0, 0};
        for (int i = 0, n = tbl_widths_account_disbursement_details.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_account_disbursement_details, i, tbl_widths_account_disbursement_details[i]);
        }
        Dimension d = tbl_account_disbursement_details.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_account_disbursement_details.getTableHeader().setPreferredSize(d);
        tbl_account_disbursement_details.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_account_disbursement_details.setRowHeight(25);
        tbl_account_disbursement_details.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_account_disbursement_details(List<to_account_disbursement_details> acc) {
        tbl_account_disbursement_details_ALM.clear();
        tbl_account_disbursement_details_ALM.addAll(acc);
    }

    public static class Tblaccount_disbursement_detailsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Active", "account_disbursement", "detail", "status"
        };

        public Tblaccount_disbursement_detailsModel(ListModel listmodel) {
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
            to_account_disbursement_details tt = (to_account_disbursement_details) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.detail;
                case 1:
                    if (tt.status == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }
                case 2:
                    return tt.account_disbursement;
                case 3:
                    return tt.detail;
                default:
                    return tt.status;
            }
        }
    }

    private void data_cols_disbursement_details() {
        int row = tbl_account_disbursements.getSelectedRow();
        if (row < 0) {
            return;
        }

        to_account_disbursements to = (to_account_disbursements) tbl_account_disbursements_ALM.get(tbl_account_disbursements.convertRowIndexToModel(row));
        String where = " where account_disbursement_id='" + to.id + "' order by detail asc";
        loadData_account_disbursement_details(S1_account_disbursement_details.ret_data(where));
    }

    private void add_account_disbursement_details() {
        int row = tbl_account_disbursements.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disbursements to = (to_account_disbursements) tbl_account_disbursements_ALM.get(tbl_account_disbursements.convertRowIndexToModel(row));
        int id = -1;
        String account_disbursement_id = "" + to.id;
        String account_disbursement = to.particular;
        String detail = tf_detail.getText();
        int status = 0;
        if (jCheckBox4.isSelected()) {
            status = 1;
        }
        to_account_disbursement_details to1 = new to_account_disbursement_details(id, account_disbursement_id, account_disbursement, detail, status);
        S1_account_disbursement_details.add_account_disbursement_details(to1);
        data_cols_disbursement_details();
        clear_account_disbursement_details();
    }

    private void select_account_disbursement_details() {
        int row = tbl_account_disbursement_details.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disbursement_details to = (to_account_disbursement_details) tbl_account_disbursement_details_ALM.get(tbl_account_disbursement_details.convertRowIndexToModel(row));

        tf_detail.setText(to.detail);
        if (to.status == 0) {
            jCheckBox4.setSelected(true);
        } else {
            jCheckBox4.setSelected(false);
        }
    }

    private void edit_account_disbursement_details() {
        int row = tbl_account_disbursement_details.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disbursement_details to = (to_account_disbursement_details) tbl_account_disbursement_details_ALM.get(tbl_account_disbursement_details.convertRowIndexToModel(row));
        int id = to.id;
        String account_disbursement_id = to.account_disbursement_id;
        String account_disbursement = to.account_disbursement;
        String detail = tf_detail.getText();
        int status = 0;
        if (jCheckBox4.isSelected()) {
            status = 1;
        }
        to_account_disbursement_details to1 = new to_account_disbursement_details(id, account_disbursement_id, account_disbursement, detail, status);
        S1_account_disbursement_details.edit_account_disbursement_details(to1);
        data_cols_disbursement_details();
        clear_account_disbursement_details();
    }

    private void clear_account_disbursement_details() {

        tf_detail.setText("");
        tf_detail.grabFocus();
    }

    private void delete_account_disbursement_details() {
        int row = tbl_account_disbursement_details.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_account_disbursement_details to = (to_account_disbursement_details) tbl_account_disbursement_details_ALM.get(tbl_account_disbursement_details.convertRowIndexToModel(row));
        S1_account_disbursement_details.delete_account_disbursement_details(to);
        data_cols_disbursement_details();
        clear_account_disbursement_details();
    }

}

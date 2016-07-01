/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.cashiering;

import spires.backup_accounting.S1_account_numbers;
import spires.backup_accounting.S1_account_revenues;
import spires.cashiering.Cashiering.to_cashiering;
import spires.util.Alert;
import spires.util.Focus_Fire;
import spires.util.MyBorder;
import spires.util.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;

/**
 *
 * @author Maytopacka
 */
public class Dlg_cashiering extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_location
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
    private Dlg_cashiering(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_cashiering(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_cashiering() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_cashiering myRef;

    private void setThisRef(Dlg_cashiering myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_cashiering> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_cashiering create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_cashiering create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_cashiering dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashiering((java.awt.Frame) parent, false);
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
            Dlg_cashiering dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_cashiering((java.awt.Dialog) parent, false);
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

        Dlg_cashiering dialog = Dlg_cashiering.create(new javax.swing.JFrame(), true);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        category_types = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_account = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_rate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_status = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_account_no = new javax.swing.JTextField();
        tf_account_no_id = new javax.swing.JTextField();
        jXPanel3 = new org.jdesktop.swingx.JXPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_cashiering = new org.jdesktop.swingx.JXTable();
        jLabel10 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        category_types.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/179 (Custom).png"))); // NOI18N
        category_types.setText("Account Types");
        category_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_typesActionPerformed(evt);
            }
        });
        jPopupMenu1.add(category_types);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jXPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Name:");

        tf_account.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_account.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Rate:");

        tf_rate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_rate.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Status:");

        cb_status.setSelected(true);
        cb_status.setText("Active/Inactive");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Fix Rate");

        jCheckBox2.setText("Incremental");

        jLabel1.setText("Account Type:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Account No:");

        tf_account_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_account_noActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2))
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jXPanel2Layout.createSequentialGroup()
                                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)
                                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_account, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(tf_rate)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jXPanel2Layout.createSequentialGroup()
                                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_account_no, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(jTextField1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_account_no_id, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 386, Short.MAX_VALUE))
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addComponent(tf_account_no_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jXPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jXPanel2Layout.createSequentialGroup()
                                .addComponent(tf_account_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_status)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addGap(89, 89, 89))))
        );

        jXPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setOpaque(false);

        tbl_cashiering.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_cashiering.setOpaque(false);
        tbl_cashiering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cashieringMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_cashieringMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_cashieringMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_cashiering);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Search:");

        tf_search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_search.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setBackground(new java.awt.Color(51, 153, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("+ add");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("[] edit");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("- delete");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jXPanel3Layout = new javax.swing.GroupLayout(jXPanel3);
        jXPanel3.setLayout(jXPanel3Layout);
        jXPanel3Layout.setHorizontalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jXPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jXPanel3Layout.setVerticalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jXPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        exit2(jLabel6);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        hover2(jLabel6);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        exit2(jLabel5);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        hover2(jLabel5);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        exit2(jLabel4);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        hover2(jLabel4);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        add_cashiering();
        tf_account.grabFocus();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        edit_cashiering();
        tf_account.grabFocus();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        delete_cashiering();
        tf_account.grabFocus();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void tbl_cashieringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cashieringMouseClicked
        select_cashiering();
    }//GEN-LAST:event_tbl_cashieringMouseClicked

    private void tbl_cashieringMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cashieringMousePressed
        show_popup(evt);
    }//GEN-LAST:event_tbl_cashieringMousePressed

    private void tbl_cashieringMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cashieringMouseReleased
        show_popup(evt);
    }//GEN-LAST:event_tbl_cashieringMouseReleased

    private void category_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_typesActionPerformed
        types();
    }//GEN-LAST:event_category_typesActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        init_account_type(jTextField1, jTextField2);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tf_account_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_account_noActionPerformed
        init_trans_type();
    }//GEN-LAST:event_tf_account_noActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem category_types;
    private javax.swing.JCheckBox cb_status;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel jXPanel3;
    private org.jdesktop.swingx.JXTable tbl_cashiering;
    private javax.swing.JTextField tf_account;
    private javax.swing.JTextField tf_account_no;
    private javax.swing.JTextField tf_account_no_id;
    private javax.swing.JTextField tf_rate;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        tf_search.grabFocus();
        init_key();
        init();
        init_tbl_cashiering();
        data_cols();
//        set_border();
        focus();
    }

    private void focus() {
        JTextField[] tf = {tf_account, tf_rate, tf_search};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
    }

    private void set_border() {
        MyBorder.setBorder(tf_account);
        MyBorder.setBorder(tf_rate);
        MyBorder.setBorder(tf_search);
    }
    int posX = 0, posY = 0;

    private void init() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });
        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                //sets frame position when mouse dragged			
                setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
            }
        });
    }

    private void hover(JLabel lbl) {
        lbl.setBackground(new java.awt.Color(230, 227, 227));
        lbl.setForeground(new java.awt.Color(0, 0, 0));

    }

    private void exit(JLabel lbl) {
        lbl.setBackground(new java.awt.Color(255, 255, 255));
        lbl.setForeground(new java.awt.Color(153, 153, 153));
    }

    private void hover2(JLabel lbl) {
        lbl.setForeground(new java.awt.Color(0, 0, 0));
        lbl.setFont(new java.awt.Font("Tahoma", 0, 15));
    }

    private void exit2(JLabel lbl) {
        lbl.setForeground(new java.awt.Color(153, 153, 153));
        lbl.setFont(new java.awt.Font("Tahoma", 0, 12));
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

    private ArrayListModel tbl_cashiering_ALM;
    private TblcashieringModel tbl_cashiering_M;

    private void init_tbl_cashiering() {
        tbl_cashiering_ALM = new ArrayListModel();
        tbl_cashiering_M = new TblcashieringModel(tbl_cashiering_ALM);
        tbl_cashiering.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_cashiering.setModel(tbl_cashiering_M);
        tbl_cashiering.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_cashiering.setRowHeight(25);
        int[] tbl_widths_cashiering = {100, 80, 120, 120, 60, 60};
        for (int i = 0, n = tbl_widths_cashiering.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_cashiering, i, tbl_widths_cashiering[i]);
        }
        Dimension d = tbl_cashiering.getTableHeader().getPreferredSize();
        d.height = 0;
        tbl_cashiering.getTableHeader().setPreferredSize(d);

        tbl_cashiering.setRowHeight(25);
        tbl_cashiering.setFont(new java.awt.Font("Arial", 0, 11));
        TableWidthUtilities.setColumnRightRenderer(tbl_cashiering, 1);
    }

    private void loadData_cashiering(List<to_cashiering> acc) {
        tbl_cashiering_ALM.clear();
        tbl_cashiering_ALM.addAll(acc);
    }

    public static class TblcashieringModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Rate", "Account No", "Account Type", "Status", "Fix Rate"
        };

        public TblcashieringModel(ListModel listmodel) {
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
            to_cashiering tt = (to_cashiering) getRow(row);
            switch (col) {
                case 0:
                    return "  " + tt.account;
                case 1:
                    return FitIn.fmt_wc_0(tt.rate) + "  ";
                case 2:
                    return "  " + tt.accounting_account_name;
                case 3:
                    return "  " + tt.accounting_account_type;
                case 4:
                    if (tt.is_active == 1) {
                        return "  Yes  ";
                    } else {
                        return "  No  ";
                    }
                default:
                    if (tt.fix_rate.equals("1")) {
                        return "  Yes  ";
                    } else {
                        return "  No  ";
                    }
            }
        }
    }

    private void data_cols() {
        String search = tf_search.getText();
//        loadData_cashiering(Cashiering.ret_data(search));
    }

    private void add_cashiering() {
        int id = -1;
        String account = tf_account.getText();
        double rate = FitIn.toDouble(tf_rate.getText());
        int is_active = 0;// FitIn.toInt(tf_is_active.getText());
        if (cb_status.isSelected()) {
            is_active = 1;
        }
        String fix_rate = "0";
        if (jCheckBox1.isSelected()) {
            fix_rate = "1";
        }
        int incremental = 0;
        if (jCheckBox2.isSelected()) {
            incremental = 1;
        }

        String accounting_group_id = "1";
        String accounting_group_name = "Revenue";
        String accounting_account_id = tf_account_no_id.getText();
        String accounting_account_name = tf_account_no.getText();

        String accounting_account_type = jTextField1.getText();
        String accounting_account_type_id = jTextField2.getText();
//        to_cashiering to = new to_cashiering(id, account, rate, is_active, 1, 0, "", "", "", "", fix_rate, incremental, accounting_group_id, accounting_group_name, accounting_account_id, accounting_account_name, accounting_account_type, accounting_account_type_id);
//        Cashiering.add_cashiering(to);
        data_cols();
        clear_cashiering();
        Alert.set(1, "");
    }

    private void select_cashiering() {
        int row = tbl_cashiering.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_cashiering to = (to_cashiering) tbl_cashiering_ALM.get(tbl_cashiering.convertRowIndexToModel(row));
        tf_account.setText(to.account);
        tf_rate.setText(FitIn.fmt_wc_0(to.rate));

        tf_account_no.setText(to.accounting_account_name);
        tf_account_no_id.setText(to.accounting_account_id);
        jTextField1.setText(to.accounting_account_type);
        jTextField2.setText(to.accounting_account_type_id);

        if (to.is_active == 1) {
            cb_status.setSelected(true);
        } else {
            cb_status.setSelected(false);
        }

        if (to.fix_rate.equals("1")) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox1.setSelected(false);
        }
        if (to.incremental == 1) {
            jCheckBox2.setSelected(true);
        } else {
            jCheckBox2.setSelected(false);
        }

    }

    private void edit_cashiering() {
        int row = tbl_cashiering.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_cashiering to = (to_cashiering) tbl_cashiering_ALM.get(tbl_cashiering.convertRowIndexToModel(row));
        int id = to.id;
        String account = tf_account.getText();
        double rate = FitIn.toDouble(tf_rate.getText());
        int is_active = 0;// FitIn.toInt(tf_is_active.getText());
        if (cb_status.isSelected()) {
            is_active = 1;
        }
        String fix_rate = "0";
        if (jCheckBox1.isSelected()) {
            fix_rate = "1";
        }
        int incremental = 0;
        if (jCheckBox2.isSelected()) {
            incremental = 1;
        }
        String accounting_group_id = "1";
        String accounting_group_name = "Revenue";
        String accounting_account_id = tf_account_no_id.getText();
        String accounting_account_name = tf_account_no.getText();

        String accounting_account_type = jTextField1.getText();
        String accounting_account_type_id = jTextField2.getText();
//        to_cashiering to1 = new to_cashiering(id, account, rate, is_active, 1, 0, "", "", "", "", fix_rate, incremental
//                , accounting_group_id, accounting_group_name, accounting_account_id, accounting_account_name, accounting_account_type, accounting_account_type_id);
//        Cashiering.edit_cashiering(to1);
        data_cols();
        clear_cashiering();
        Alert.set(2, "");
    }

    private void clear_cashiering() {
        tf_account.setText("");
        tf_rate.setText("");

    }

    private void delete_cashiering() {
        int row = tbl_cashiering.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_cashiering to = (to_cashiering) tbl_cashiering_ALM.get(tbl_cashiering.convertRowIndexToModel(row));
//        Cashiering.delete_cashiering(to);
        data_cols();
        clear_cashiering();
        Alert.set(3, "");
    }

    private void show_popup(MouseEvent evt) {

        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(tbl_cashiering, evt.getX(), evt.getY());
        }
    }

    private void types() {
        int row = tbl_cashiering.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_cashiering to = (to_cashiering) tbl_cashiering_ALM.get(tbl_cashiering.convertRowIndexToModel(row));

        Window p = (Window) this;
        Dlg_cashiering_types nd = Dlg_cashiering_types.create(p, true);
        nd.setTitle("");
        nd.do_pass(to.account, "" + to.id,to.accounting_account_name,to.accounting_account_id,to.accounting_account_type,to.accounting_account_type_id);
        nd.setCallback(new Dlg_cashiering_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_cashiering_types.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    List<S1_account_revenues.to_account_revenues> account_type_list = new ArrayList();

    private void init_account_type(final JTextField tf1, final JTextField tf2) {
        String search = tf1.getText();
        String where = " where revenue like '%" + search + "%' order by revenue asc";
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
                jTextField1.grabFocus();
//                jTextField3.setText(to.);
            }
        });
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
                jTextField1.grabFocus();
            }
        });
    }
}

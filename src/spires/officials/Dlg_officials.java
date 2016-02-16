/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.officials;

import spires.officials.Officials.to_officials;
import spires.util.Alert;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import spires.util.DateType;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import java.util.Date;
import spires.util.Dlg_confirm_action;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;

/**
 *
 * @author dummy
 */
public class Dlg_officials extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_officials
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

        public final String priest;

        public OutputData(String priest) {
            this.priest = priest;
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_officials(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_officials(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_officials() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_officials myRef;

    private void setThisRef(Dlg_officials myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_officials> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_officials create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_officials create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_officials dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_officials((java.awt.Frame) parent, false);
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
            Dlg_officials dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_officials((java.awt.Dialog) parent, false);
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

        Dlg_officials dialog = Dlg_officials.create(new javax.swing.JFrame(), true);
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

        pm_pop = new javax.swing.JPopupMenu();
        edit = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_name = new Field.Input();
        tf_contact = new Field.Input();
        jLabel5 = new javax.swing.JLabel();
        cb_manager = new javax.swing.JCheckBox();
        tf_contact1 = new Field.Input();
        jLabel12 = new javax.swing.JLabel();
        tf_search = new Field.Search();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_officials = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton4 = new Button.Default();
        jButton3 = new Button.Default();
        jButton2 = new Button.Info();
        jButton1 = new Button.Warning();
        jLabel8 = new Label.Separator();

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        pm_pop.add(edit);

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        pm_pop.add(delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Name:");

        tf_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        tf_contact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contactActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Contact #:");

        cb_manager.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_manager.setText("Manager");

        tf_contact1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contact1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Designation:");

        tf_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_search.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });

        tbl_officials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_officials.setFocusable(false);
        tbl_officials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_officialsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_officialsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_officialsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_officials);

        jLabel1.setText("Total No. of Records:");

        jLabel3.setText("0");

        jLabel7.setText("Status:");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/magnifying-glass34.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/plus79 (2).png"))); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/pencil8.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/rubbish12.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_contact1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_contact)
                            .addComponent(tf_name)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tf_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_contact, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_contact1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        edit_officials();
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        delete_officials();
    }//GEN-LAST:event_deleteActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        // TODO add your handling code here:
        data_employee();
    }//GEN-LAST:event_tf_searchKeyReleased

    private void tbl_officialsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_officialsMouseReleased
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_officialsMouseReleased

    private void tbl_officialsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_officialsMousePressed
        // TODO add your handling code here:
        pm_tbl_users(evt);
    }//GEN-LAST:event_tbl_officialsMousePressed

    private void tbl_officialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_officialsMouseClicked
        select_officials();
    }//GEN-LAST:event_tbl_officialsMouseClicked

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_tf_nameActionPerformed

    private void tf_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contactActionPerformed
        // TODO add your handling code here:
        ok1();
    }//GEN-LAST:event_tf_contactActionPerformed

    private void tf_contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_contact1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        data_employee();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_officials();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        edit_officials();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete_officials();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_manager;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu pm_pop;
    private javax.swing.JTable tbl_officials;
    private javax.swing.JTextField tf_contact;
    private javax.swing.JTextField tf_contact1;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

        init_key();

        init_tbl_official();

    }

    public void do_pass() {
        data_employee();
    }

    public void do_pass2(String name) {

        tf_search.setText(name);
        tf_search.grabFocus();
        data_employee();
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
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_PLUS, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                jButton1.doClick();
//                disposed();
            }
        });
    }
    // </editor-fold>
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_official() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);

        tbl_officials.setModel(tbl_employee_payroll_M);
        tbl_officials.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_officials.setRowHeight(25);

//        tbl_official.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {100, 100, 50, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_officials, i, tbl_widths_accounts[i]);
        }

        tbl_officials.getTableHeader().
                setFont(new java.awt.Font("Arial", 0, 12));
        tbl_officials.setRowHeight(25);
        tbl_officials.setFont(new java.awt.Font("Arial", 0, 12));
    }

    private void loadData_baptism(List< Officials.to_officials> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "NAME", "Designation", "Manager", "MANAGER"
        };

        public TblInvoicesModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
//           
//            if (column == 1) {
//                return true;
//            }

            return false;
        }

        @Override
        public Class getColumnClass(int col) {

            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Officials.to_officials tt = (Officials.to_officials) getRow(row);

            switch (col) {
                case 0:
                    return " " + tt.name;
                case 1:
                    return " " + tt.title;
                case 2:
                    if (tt.is_manager == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }

                default:
                    if (tt.is_manager == 0) {
                        return " No";
                    } else {
                        return " Yes";
                    }

            }
        }
    }

    private void data_employee() {

        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                String name = tf_search.getText();
                loadData_baptism(Officials.ret_data(name));
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void ok1() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(""));
        }
    }

    private void ok2() {
        int row = tbl_officials.getSelectedRow();
        if (row < 0) {
            return;
        }

        String name = tbl_officials.getModel().
                getValueAt(row, 0).
                toString();
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(name));
        }
    }

    private void pm_tbl_users(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            pm_pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }

    private void select_officials() {
        int row = tbl_officials.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_officials to = (to_officials) tbl_employee_payroll_ALM.get(tbl_officials.
                convertRowIndexToModel(row));
        tf_name.setText(to.name);
        tf_contact.setText(to.contact);
        tf_contact1.setText(to.title);
        if (to.is_manager == 1) {
            cb_manager.setSelected(true);
        } else {
            cb_manager.setSelected(false);
        }
    }

    private void add_officials() {
        int id = -1;
        String name = tf_name.getText();
        String designation = tf_contact1.getText();
        String date_added = DateType.datetime.format(new Date());
        String contact = tf_contact.getText();
        int is_manager = 0;
        if (cb_manager.isSelected()) {
            is_manager = 1;
        }
        String title = tf_contact1.getText();
        to_officials to = new to_officials(id, name, designation, date_added, contact, is_manager, title);
        Officials.add_officials(to);
        data_employee();
        clear_officials();
        Alert.set(1, name);
    }

    private void clear_officials() {
        tf_name.setText("");
        tf_contact.setText("");
        tf_contact1.setText("");
    }

    private void edit_officials() {
        int row = tbl_officials.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_officials to = (to_officials) tbl_employee_payroll_ALM.get(tbl_officials.
                convertRowIndexToModel(row));
        int id = to.id;
        String name = tf_name.getText();
        String designation = tf_contact1.getText();
        String date_added = to.date_added;
        String contact = tf_contact.getText();
        int is_manager = 0;
        if (cb_manager.isSelected()) {
            is_manager = 1;
        }
        String title = tf_contact1.getText();
        to_officials to1 = new to_officials(id, name, designation, date_added, contact, is_manager, title);
        Officials.edit_officials(to1);
        data_employee();
        clear_officials();
        Alert.set(2, name);
    }

    private void delete_officials() {
        int row = tbl_officials.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_officials to = (to_officials) tbl_employee_payroll_ALM.get(tbl_officials.
                convertRowIndexToModel(row));
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                Officials.delete_officials(to);
                data_employee();
                clear_officials();
                Alert.set(3, "");
            }
        });
        nd.setLocationRelativeTo(jScrollPane1);
        nd.setVisible(true);

    }
}

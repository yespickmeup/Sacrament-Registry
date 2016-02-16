/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.marriage_contracts;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import spires.marriage_contracts.Marriage_contracts.to_marriage_contracts;
import spires.util.Alert;
import spires.util.DateType;
import spires.util.DateUtils1;
import spires.util.Dlg_confirm_action;

import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Ronald
 */
public class Dlg_marriage_contract extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_marriage_contract
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
    private Dlg_marriage_contract(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_marriage_contract(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_marriage_contract() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_marriage_contract myRef;

    private void setThisRef(Dlg_marriage_contract myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_marriage_contract> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_marriage_contract create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_marriage_contract create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_marriage_contract dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_contract((java.awt.Frame) parent, false);
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
            Dlg_marriage_contract dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_contract((java.awt.Dialog) parent, false);
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

        Dlg_marriage_contract dialog = Dlg_marriage_contract.create(new javax.swing.JFrame(), true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_marriage_contracts = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jTextField2 = new Field.Search();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new Label.Separator();
        jButton4 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tbl_marriage_contracts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_marriage_contracts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_marriage_contractsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_marriage_contractsMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_marriage_contracts);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Filter:");

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Husband");

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("[mother]");

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("[father]");

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Wife");

        buttonGroup1.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("[mother]");

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("[father]");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Search:");

        jLabel6.setText("State:");

        jProgressBar2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        jLabel2.setText("Total Records:");

        jLabel3.setText("0");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/plus79 (2).png"))); // NOI18N
        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 937, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addGap(8, 8, 8)
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE))
                                    .addComponent(jTextField2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
//        init_search();
        data_cols();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tbl_marriage_contractsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_marriage_contractsMouseClicked
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_tbl_marriage_contractsMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        add();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_marriage_contractsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_marriage_contractsMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_marriage_contractsMouseEntered

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_marriage_contracts;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();

        init_tbl_marriage_contracts();

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

    private void add() {
        final Window p = (Window) this;
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                Dlg_marriage_contract_add nd = Dlg_marriage_contract_add.create(p, true);
                nd.setTitle("");
                nd.setCallback(new Dlg_marriage_contract_add.Callback() {
                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_marriage_contract_add.OutputData data) {
                        closeDialog.ok();
                        Marriage_contracts.add_marriage_contracts(data.to);
                        Alert.set(1, "");
                        data_cols();
                    }
                });
                nd.setLocationRelativeTo(null);
                nd.setVisible(true);
            }
        });
        t.start();

    }

    private void update() {
        int row = tbl_marriage_contracts.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_marriage_contracts to = (to_marriage_contracts) tbl_marriage_contracts_ALM.get(tbl_marriage_contracts.convertRowIndexToModel(row));
        int col = tbl_marriage_contracts.getSelectedColumn();
        if (col == 5) {

            final Window p = (Window) this;
            Thread t = new Thread(new Runnable() {

                @Override
                public void run() {

                    Dlg_marriage_contract_add nd = Dlg_marriage_contract_add.create(p, true);
                    nd.setTitle("");
                    nd.do_pass(to);
                    nd.setCallback(new Dlg_marriage_contract_add.Callback() {
                        @Override
                        public void ok(CloseDialog closeDialog, Dlg_marriage_contract_add.OutputData data) {
                            closeDialog.ok();
                            Marriage_contracts.edit_marriage_contracts(data.to);
                            data_cols();
                            Alert.set(2, "");
                        }
                    });
                    nd.setLocationRelativeTo(null);
                    nd.setVisible(true);
                }
            });
            t.start();

        }
        if (col == 6) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Marriage_contracts.delete_marriage_contracts(to);
                    data_cols();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
        if (col == 7) {
            print1();
        }
    }

    private ArrayListModel tbl_marriage_contracts_ALM;
    private Tblmarriage_contractsModel tbl_marriage_contracts_M;

    private void init_tbl_marriage_contracts() {
        tbl_marriage_contracts_ALM = new ArrayListModel();
        tbl_marriage_contracts_M = new Tblmarriage_contractsModel(tbl_marriage_contracts_ALM);
        tbl_marriage_contracts.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_marriage_contracts.setModel(tbl_marriage_contracts_M);
        tbl_marriage_contracts.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_marriage_contracts.setRowHeight(25);
        int[] tbl_widths_marriage_contracts = {50, 100, 150, 150, 100, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_marriage_contracts.length; i < n; i++) {
            if (i == 4) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_marriage_contracts, i, tbl_widths_marriage_contracts[i]);
        }
        Dimension d = tbl_marriage_contracts.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_marriage_contracts.getTableHeader().setPreferredSize(d);
        tbl_marriage_contracts.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_marriage_contracts.setRowHeight(25);
        tbl_marriage_contracts.setFont(new java.awt.Font("Arial", 0, 12));

        tbl_marriage_contracts.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
        tbl_marriage_contracts.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());
        tbl_marriage_contracts.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer());
    }

    private void loadData_marriage_contracts(List<to_marriage_contracts> acc) {
        tbl_marriage_contracts_ALM.clear();
        tbl_marriage_contracts_ALM.addAll(acc);
    }

    public static class Tblmarriage_contractsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Registry No", "Date", "Husband", "Wife", "Witnesses", "", "", "", "", "witnesses", "received_by", "registered_by", "remarks", "status", "date_added", "added_by", "h_ref_no", "h_fname", "h_mi", "h_lname", "h_bday", "h_place_of_birth", "h_citizenship", "h_residence", "h_religion", "h_civil_status", "h_father", "h_father_citizenship", "h_mother", "h_mother_citizenship", "h_consent_by", "h_consent_by_relation", "h_consent_by_residence", "w_ref_no", "w_fname", "w_mi", "w_lname", "w_bday", "w_place_of_birth", "w_citizenship", "w_residence", "w_religion", "w_civil_status", "w_father", "w_father_citizenship", "w_mother", "w_mother_citizenship", "w_consent_by", "w_consent_by_relation", "w_consent_by_residence"
        };

        public Tblmarriage_contractsModel(ListModel listmodel) {
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
            to_marriage_contracts tt = (to_marriage_contracts) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.id;
                case 1:
                    return " " + DateType.convert_jan_1_2013_date_rep(tt.date_of_marriage);
                case 2:
                    return " " + tt.h_lname + ", " + tt.h_fname + " " + tt.h_mi;
                case 3:
                    return " " + tt.w_lname + ", " + tt.w_fname + " " + tt.w_mi;
                case 4:
                    return " " + tt.witnesses.replaceAll("%", ", ");
                case 5:
                    return "/spires/img_functions/pencil8.png";
                case 6:
                    return "/spires/img_dashboard/rubbish12.png";
                case 7:
                    return "/spires/img_functions/printer22.png";
                case 8:
                    return tt.certification_solemnizing_parties;
                case 9:
                    return tt.witnesses;
                case 10:
                    return tt.received_by;
                case 11:
                    return tt.registered_by;
                case 12:
                    return tt.remarks;
                case 13:
                    return tt.status;
                case 14:
                    return tt.date_added;
                case 15:
                    return tt.added_by;
                case 16:
                    return tt.h_ref_no;
                case 17:
                    return tt.h_fname;
                case 18:
                    return tt.h_mi;
                case 19:
                    return tt.h_lname;
                case 20:
                    return tt.h_bday;
                case 21:
                    return tt.h_place_of_birth;
                case 22:
                    return tt.h_citizenship;
                case 23:
                    return tt.h_residence;
                case 24:
                    return tt.h_religion;
                case 25:
                    return tt.h_civil_status;
                case 26:
                    return tt.h_father;
                case 27:
                    return tt.h_father_citizenship;
                case 28:
                    return tt.h_mother;
                case 29:
                    return tt.h_mother_citizenship;
                case 30:
                    return tt.h_consent_by;
                case 31:
                    return tt.h_consent_by_relation;
                case 32:
                    return tt.h_consent_by_residence;
                case 33:
                    return tt.w_ref_no;
                case 34:
                    return tt.w_fname;
                case 35:
                    return tt.w_mi;
                case 36:
                    return tt.w_lname;
                case 37:
                    return tt.w_bday;
                case 38:
                    return tt.w_place_of_birth;
                case 39:
                    return tt.w_citizenship;
                case 40:
                    return tt.w_residence;
                case 41:
                    return tt.w_religion;
                case 42:
                    return tt.w_civil_status;
                case 43:
                    return tt.w_father;
                case 44:
                    return tt.w_father_citizenship;
                case 45:
                    return tt.w_mother;
                case 46:
                    return tt.w_mother_citizenship;
                case 47:
                    return tt.w_consent_by;
                case 48:
                    return tt.w_consent_by_relation;
                default:
                    return tt.w_consent_by_residence;
            }
        }
    }

    private void data_cols() {
        jProgressBar2.setString("Loading...Please wait...");
        jProgressBar2.setIndeterminate(true);
        jTextField2.setEnabled(false);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {

                String where = "";
                String search = jTextField2.getText();

                if (jCheckBox1.isSelected()) {
                    where = " where concat(h_fname,space(1),h_lname) like '%" + search + "%' "
                            + " or concat(h_lname,space(1),h_fname) like '%" + search + "%'";
                }
                if (jCheckBox2.isSelected()) {
                    where = " where concat(w_fname,space(1),w_lname) like '%" + search + "%' "
                            + " or concat(w_lname,space(1),w_fname) like '%" + search + "%' ";
                }
                if (jCheckBox3.isSelected()) {
                    where = " where h_mother like '%" + search + "%' ";
                }
                if (jCheckBox4.isSelected()) {
                    where = " where h_father like '%" + search + "%' ";
                }
                if (jCheckBox5.isSelected()) {
                    where = " where w_mother like '%" + search + "%' ";
                }
                if (jCheckBox6.isSelected()) {
                    where = " where w_father like '%" + search + "%' ";
                }
                where = where + " order by id desc ";

                loadData_marriage_contracts(Marriage_contracts.ret_data(where));
                jLabel3.setText("" + tbl_marriage_contracts_ALM.size());

                jTextField2.setEnabled(true);
                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void print1() {
        int row = tbl_marriage_contracts.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_marriage_contracts to = (to_marriage_contracts) tbl_marriage_contracts_ALM.get(tbl_marriage_contracts.convertRowIndexToModel(row));
        List<Srpt_marriage_contract_front.field> fields1 = new ArrayList();
        String province = to.province;
        String city = to.city;
        String registry_no = to.registry_no;
        String place_of_marriage = to.place_of_marriage;
        String date_of_marriage = DateType.convert_sf_to_contract(to.date_of_marriage);
        String time_of_marriage = to.time_of_marriage;
        String[] certification_contracting_parties = to.certification_contracting_parties.split("%");
        String certification_contracting_parties1 = certification_contracting_parties[0];
        if (certification_contracting_parties1.equals("1")) {
            certification_contracting_parties1 = "/";
        } else {
            certification_contracting_parties1 = "";
        }
        String certification_contracting_parties3 = certification_contracting_parties[1];
        if (certification_contracting_parties3.equals("1")) {
            certification_contracting_parties3 = "/";
        } else {
            certification_contracting_parties3 = "";
        }
        Date d = new Date();
        try {
            d = DateType.sf.parse(to.date_of_marriage);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract.class.getName()).log(Level.SEVERE, null, ex);
        }
        int day_bday = FitIn.toInt(DateType.d.format(d));
        String b_th = DateType.nth("" + day_bday);
        String certification_contracting_parties2 = b_th + DateType.convert_sf_to_contract5(to.date_of_marriage);
//        if (certification_contracting_parties2.equals("1")) {
//            certification_contracting_parties2 = "/";
//        } else {
//            certification_contracting_parties2 = "";
//        }
        String[] certification_solemnizing_parties = to.certification_solemnizing_parties.split("%");
        String certification_solemnizing_parties1 = certification_solemnizing_parties[0];
        if (certification_solemnizing_parties1.equals("1")) {
            certification_solemnizing_parties1 = "/";
        } else {
            certification_solemnizing_parties1 = "";
        }
        String certification_solemnizing_parties2 = certification_solemnizing_parties[1];
        String certification_solemnizing_parties3 = DateType.convert_sf_to_slash(certification_solemnizing_parties[2]);
        if (certification_solemnizing_parties1.isEmpty()) {
            certification_solemnizing_parties3 = "";
        }
        String certification_solemnizing_parties4 = certification_solemnizing_parties[3];
        String certification_solemnizing_parties5 = certification_solemnizing_parties[4];
        if (certification_solemnizing_parties5.equals("1")) {
            certification_solemnizing_parties5 = "/";
        } else {
            certification_solemnizing_parties5 = "";
        }
        String certification_solemnizing_parties6 = certification_solemnizing_parties[5];
        String certification_solemnizing_parties7 = certification_solemnizing_parties[6];
        if (certification_solemnizing_parties7.equals("1")) {
            certification_solemnizing_parties7 = "/";
        } else {
            certification_solemnizing_parties7 = "";
        }
        String certification_solemnizing_parties8 = certification_solemnizing_parties[7];

        String certification_solemnizing_parties9 = certification_solemnizing_parties[8];
        String certification_solemnizing_parties10 = certification_solemnizing_parties[9];
        String witnesses = to.witnesses;
        String[] received_by = to.received_by.split("%");
        String received_by1 = received_by[0];
        String received_by2 = received_by[1];
        String received_by3 = DateType.convert_sf_to_slash(received_by[2]);
        String[] registered_by = to.registered_by.split("%");
        String registered_by1 = registered_by[0];
        String registered_by2 = registered_by[1];
        String registered_by3 = DateType.convert_sf_to_slash(registered_by[2]);
        String remarks = to.remarks;
        String h_ref_no = to.h_ref_no;
        String h_fname = to.h_fname;
        String h_mi = to.h_mi;
        String h_lname = to.h_lname;
        int h_year = 0;
        int w_year = 0;

        Date d1 = new Date();
        Date d2 = new Date();
        try {
            h_year = DateUtils1.count_age(DateType.sf.parse(to.h_bday), new Date());
            w_year = DateUtils1.count_age(DateType.sf.parse(to.w_bday), new Date());
            d1 = DateType.sf.parse(to.h_bday);
            d2 = DateType.sf.parse(to.w_bday);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract.class.getName()).log(Level.SEVERE, null, ex);
        }
        int h_age = 0;
        int w_age = 0;

        String h_bday = DateType.convert_sf_to_contract4(to.h_bday);
        String[] h_place_of_birth = to.h_place_of_birth.split("%");
        String h_place_of_birth1 = h_place_of_birth[0] + " " + h_place_of_birth[1] + " " + h_place_of_birth[2];
        String h_place_of_birth2 = "" + DateUtils1.count_age(d1, new Date());
        String h_place_of_birth3 = h_place_of_birth[2];
        String[] h_citizenship = to.h_citizenship.split("%");
        String h_citizenship1 = h_citizenship[0];
        String h_citizenship2 = h_citizenship[1];
        String h_residence = to.h_residence;
        String h_religion = to.h_religion;
        String h_civil_status = to.h_civil_status;
        String[] h_father = to.h_father.split("%");
        String h_father1 = h_father[0];
        String h_father2 = h_father[1];
        String h_father3 = h_father[2];
        String h_father_citizenship = to.h_father_citizenship;
        String[] h_mother = to.h_mother.split("%");
        String h_mother1 = h_mother[0];
        String h_mother2 = h_mother[1];
        String h_mother3 = h_mother[2];
        String h_mother_citizenship = to.h_mother_citizenship;
        String[] h_consent_by = to.h_consent_by.split("%");
        String h_consent_by1 = h_consent_by[0];
        String h_consent_by2 = h_consent_by[1];
        String h_consent_by3 = h_consent_by[2];
        String h_consent_by_relation = to.h_consent_by_relation;
        String h_consent_by_residence = to.h_consent_by_residence;
        String w_ref_no = to.w_ref_no;
        String w_fname = to.w_fname;
        String w_mi = to.w_mi;
        String w_lname = to.w_lname;
        String w_bday = DateType.convert_sf_to_contract4(to.w_bday);
        String[] w_place_of_birth = to.w_place_of_birth.split("%");
        String w_place_of_birth1 = w_place_of_birth[0] + " " + w_place_of_birth[1] + " " + w_place_of_birth[2];
        String w_place_of_birth2 = "" + DateUtils1.count_age(d2, new Date());
        String w_place_of_birth3 = w_place_of_birth[2];
        String[] w_citizenship = to.w_citizenship.split("%");
        String w_citizenship1 = w_citizenship[0];
        String w_citizenship2 = w_citizenship[1];
        String w_residence = to.w_residence;
        String w_religion = to.w_religion;
        String w_civil_status = to.w_civil_status;
        String[] w_father = to.w_father.split("%");
        String w_father1 = w_father[0];
        String w_father2 = w_father[1];
        String w_father3 = w_father[2];
        String w_father_citizenship = to.w_father_citizenship;
        String[] w_mother = to.w_mother.split("%");
        String w_mother1 = w_mother[0];
        String w_mother2 = w_mother[1];
        String w_mother3 = w_mother[2];
        String w_mother_citizenship = to.w_mother_citizenship;
        String[] w_consent_by = to.w_consent_by.split("%");
        String w_consent_by1 = w_consent_by[0];
        String w_consent_by2 = w_consent_by[1];
        String w_consent_by3 = w_consent_by[2];
        String w_consent_by_relation = to.w_consent_by_relation;
        String w_consent_by_residence = to.w_consent_by_residence;
        String[] witness = to.witnesses.split("%");
        String h_pob1 = h_place_of_birth[0];
        String h_pob2 = h_place_of_birth[1];
        String h_pob3 = h_place_of_birth[2];
        String w_pob1 = w_place_of_birth[0];
        String w_pob2 = w_place_of_birth[1];
        String w_pob3 = w_place_of_birth[2];
        Srpt_marriage_contract_front.field field = new Srpt_marriage_contract_front.field(province, city, registry_no, place_of_marriage, date_of_marriage, time_of_marriage, certification_contracting_parties1, certification_contracting_parties2, certification_solemnizing_parties1, certification_solemnizing_parties2, certification_solemnizing_parties3, certification_solemnizing_parties4, certification_solemnizing_parties5, certification_solemnizing_parties6, certification_solemnizing_parties7, certification_solemnizing_parties8, certification_solemnizing_parties9, certification_solemnizing_parties10, witnesses, received_by1, received_by2, received_by3, registered_by1, registered_by2, registered_by3, remarks, h_ref_no, h_fname, h_mi, h_lname, h_bday, h_place_of_birth1, h_place_of_birth2, h_place_of_birth3, h_citizenship1, h_citizenship2, h_residence, h_religion, h_civil_status, h_father1, h_father2, h_father3, h_father_citizenship, h_mother1, h_mother2, h_mother3, h_mother_citizenship, h_consent_by1, h_consent_by2, h_consent_by3, h_consent_by_relation, h_consent_by_residence, w_ref_no, w_fname, w_mi, w_lname, w_bday, w_place_of_birth1, w_place_of_birth2, w_place_of_birth3, w_citizenship1, w_citizenship2, w_residence, w_religion, w_civil_status, w_father1, w_father2, w_father3, w_father_citizenship, w_mother1, w_mother2, w_mother3, w_mother_citizenship, w_consent_by1, w_consent_by2, w_consent_by3, w_consent_by_relation, w_consent_by_residence, witness[0], witness[1], witness[2], witness[3], certification_contracting_parties3, h_pob1, h_pob2, h_pob3, w_pob1, w_pob2, w_pob3);
        fields1.add(field);

        //----------------------------------------------------
        List<Srpt_marriage_contract_back.field> fields2 = new ArrayList();
        String witnesses5 = witness[4].toUpperCase();
        String witnesses6 = witness[5].toUpperCase();
        String witnesses7 = witness[6].toUpperCase();
        String witnesses8 = witness[7].toUpperCase();
        String witnesses9 = witness[8].toUpperCase();
        String witnesses10 = witness[9].toUpperCase();
        String witnesses11 = witness[10].toUpperCase();
        String witnesses12 = witness[11].toUpperCase();
        String solem_officer = to.solem_officer;
        String solem_of = to.solem_of;
        String solem_at = to.solem_at;
        String[] solem_on = to.solem_one.split("%");
        String solem_one1 = solem_on[0];
        String solem_one2 = solem_on[1];
        String[] solem_two = to.solem_two.split("%");
        String solem_two1 = solem_two[0];
        if (solem_two1.equals("1")) {
            solem_two1 = "/";
        } else {
            solem_two1 = "";
        }
        String solem_two2 = solem_two[1];
        if (solem_two2.equals("1")) {
            solem_two2 = "/";
        } else {
            solem_two2 = "";
        }
        String solem_two3 = solem_two[2];

        if (solem_two3.equals("1")) {
            solem_two3 = "/";
        } else {
            solem_two3 = "";
        }
        String solem_two4 = solem_two[3];
        String solem_two5 = solem_two[4];
        String solem_two6 = solem_two[5];
        if (solem_two6.equals("1")) {
            solem_two6 = "/";
        } else {
            solem_two6 = "";
        }
        String solem_two7 = solem_two[6];
        if (solem_two7.equals("1")) {
            solem_two7 = "/";
        } else {
            solem_two7 = "";
        }
        String[] solem_administer = to.solem_administer.split("%");
        String solem_administer1 = DateType.convert_sf_to_contract2(solem_administer[0]);
        String solem_administer2 = solem_administer[1];
        String solem_administer3 = "";//DateType.convert_sf_to_contract2(solem_administer[2]);
        String solem_administer4 = "";//solem_administer[3];
        String solem_administer5 = "";//solem_administer[4];
        String solem_administer6 = "";//DateType.convert_sf_to_contract3(solem_administer[5]);
        String solem_administer7 = "";//solem_administer[6];
        String solem_administer8 = "";//solem_administer[7];
        String solem_administer9 = "";//solem_administer[8];
        String solem_administer10 = "";// solem_administer[9];

        if (solem_officer.isEmpty() || solem_officer.equals(" ")) {
            solem_of = "";
            solem_at = "";
            solem_one1 = "";
            solem_one2 = "";
            solem_two1 = "";
            solem_two2 = "";
            solem_two3 = "";
            solem_two4 = "";
            solem_two5 = "";
            solem_two6 = "";
            solem_two7 = "";
            solem_administer1 = "";
            solem_administer2 = "";
            solem_administer3 = "";
            solem_administer4 = "";
            solem_administer5 = "";
            solem_administer6 = "";
            solem_administer7 = "";
            solem_administer8 = "";
            solem_administer9 = "";
            solem_administer10 = "";
        }

        //----------------------
        String affid_by = to.affid_by;
        String affid_address = to.affid_address;
        String[] affid_one = to.affid_one.split("%");
        String affid_one1 = affid_one[0];
        if (affid_one1.equals("1")) {
            affid_one1 = "/";
        } else {
            affid_one1 = "";
        }
        String affid_one2 = affid_one[1];
        String affid_one3 = affid_one[2];
        String affid_one4 = DateType.convert_sf_to_slash(affid_one[3]);
        String affid_one5 = affid_one[4];
        if (affid_one5.equals("1")) {
            affid_one5 = "/";
        } else {
            affid_one5 = "";
        }
        String affid_one6 = affid_one[5];
        String affid_one7 = affid_one[6];
        String affid_one8 = affid_one[7];
        String affid_one9 = DateType.convert_sf_to_slash(affid_one[8]);
        String[] affid_two = to.affid_two.split("%");
        String affid_two1 = affid_two[0];
        String affid_two2 = affid_two[1];
        if (affid_two2.equals("1")) {
            affid_two2 = "/";
        } else {
            affid_two2 = "";
        }
        String affid_two3 = affid_two[2];
        if (affid_two3.equals("1")) {
            affid_two3 = "/";
        } else {
            affid_two3 = "";
        }
        String affid_two4 = affid_two[3];
        if (affid_two4.equals("1")) {
            affid_two4 = "/";
        } else {
            affid_two4 = "";
        }
        String affid_two5 = affid_two[4];
        if (affid_two5.equals("1")) {
            affid_two5 = "/";
        } else {
            affid_two5 = "";
        }
        String[] affid_three = to.affid_three.split("%");
        String affid_three1 = affid_three[0];
        if (affid_three1.equals("1")) {
            affid_three1 = "/";
        } else {
            affid_three1 = "";
        }
        String affid_three2 = affid_three[1];
        String affid_three3 = DateType.convert_sf_to_slash(affid_three[2]);
        String affid_three4 = affid_three[3];
        String affid_three5 = affid_three[4];
        if (affid_three5.equals("1")) {
            affid_three5 = "/";
        } else {
            affid_three5 = "";
        }
        String affid_three6 = affid_three[5];
        String[] affid_four = to.affid_four.split("%");
        String affid_four1 = affid_four[0];
        String affid_four2 = affid_four[1];
        String affid_four3 = affid_four[2];
        String affid_four4 = affid_four[3];
        String affid_five = to.affid_five;
        String[] affid_administer = to.affid_administer.split("%");
        String affid_administer1 = DateType.convert_sf_to_contract2(affid_administer[0]);
        String affid_administer2 = affid_administer[1];
        String affid_administer3 = "";//DateType.convert_sf_to_contract2(affid_administer[2]);
        String affid_administer4 = "";//affid_administer[3];
        String affid_administer5 = "";//affid_administer[4];
        String affid_administer6 = "";//DateType.convert_sf_to_contract3(affid_administer[5]);
        String affid_administer7 = "";//affid_administer[6];
        String affid_administer8 = "";//affid_administer[7];
        String affid_administer9 = "";//affid_administer[8];
        String affid_administer10 = "";// affid_administer[9];

        if (affid_by.isEmpty() || affid_by.equals(" ")) {
            affid_address = "";
            affid_one1 = "";
            affid_one2 = "";
            affid_one3 = "";
            affid_one4 = "";
            affid_one5 = "";
            affid_one6 = "";
            affid_one7 = "";
            affid_one8 = "";
            affid_one9 = "";
            affid_two1 = "";
            affid_two2 = "";
            affid_two3 = "";
            affid_two4 = "";
            affid_two5 = "";
            affid_three1 = "";
            affid_three2 = "";
            affid_three3 = "";
            affid_three4 = "";
            affid_three5 = "";
            affid_three6 = "";
            affid_four1 = "";
            affid_four2 = "";
            affid_four3 = "";
            affid_four4 = "";
            affid_five = "";
            affid_administer1 = "";
            affid_administer2 = "";
            affid_administer3 = "";
            affid_administer4 = "";
            affid_administer5 = "";
            affid_administer6 = "";
            affid_administer7 = "";
            affid_administer8 = "";
            affid_administer9 = "";
            affid_administer10 = "";
        }

        Srpt_marriage_contract_back.field field2 = new Srpt_marriage_contract_back.field(witnesses5, witnesses6, witnesses7, witnesses8, witnesses9, witnesses10, witnesses11, witnesses12, solem_officer, solem_of, solem_at, solem_one1, solem_one2, solem_two1, solem_two2, solem_two3, solem_two4, solem_two5, solem_two6, solem_two7, solem_administer1, solem_administer2, solem_administer3, solem_administer4, solem_administer5, solem_administer6, solem_administer7, solem_administer8, solem_administer9, solem_administer10, affid_by, affid_address, affid_one1, affid_one2, affid_one3, affid_one4, affid_one5, affid_one6, affid_one7, affid_one8, affid_one9, affid_two1, affid_two2, affid_two3, affid_two4, affid_two5, affid_three1, affid_three2, affid_three3, affid_three4, affid_three5, affid_three6, affid_four1, affid_four2, affid_four3, affid_four4, affid_five, affid_administer1, affid_administer2, affid_administer3, affid_administer4, affid_administer5, affid_administer6, affid_administer7, affid_administer8, affid_administer9, affid_administer10);
        fields2.add(field2);
        Window p = (Window) this;
        Dlg_marriage_contract_print nd = Dlg_marriage_contract_print.create(p, true);
        nd.setTitle("");
        nd.do_pass(fields1, fields2);
        nd.setCallback(new Dlg_marriage_contract_print.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_marriage_contract_print.OutputData data) {
                closeDialog.ok();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

}

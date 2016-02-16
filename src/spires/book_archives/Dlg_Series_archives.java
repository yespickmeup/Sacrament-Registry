/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.book_archives;


import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import spires.util.Center;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import spires.util.Dlg_confirm_action;
import spires.util.TableUtility;

/**
 *
 * @author dummy
 */
public class Dlg_Series_archives extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_Series_archives
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
    private Dlg_Series_archives(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_Series_archives(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_Series_archives() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_Series_archives myRef;

    private void setThisRef(Dlg_Series_archives myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_Series_archives> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_Series_archives create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_Series_archives create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_Series_archives dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_Series_archives((java.awt.Frame) parent, false);
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
            Dlg_Series_archives dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_Series_archives((java.awt.Dialog) parent, false);
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


        Dlg_Series_archives dialog = Dlg_Series_archives.create(new javax.swing.JFrame(), true);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_arc = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cb_sac = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(43, 140, 221));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARCHIVES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbl_arc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_arc.setFocusable(false);
        jScrollPane1.setViewportView(tbl_arc);

        jButton1.setText("CLOSE");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cb_sac.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cb_sac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Baptism", "Communion", "Confirmation", "Marriage", "2nd Marriage", "Profession of Faith", "Acceptance", "Death" }));
        cb_sac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sacActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHOOSE RECORD:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("SEARCH:");

        tf_search.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tf_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });

        jButton2.setText("ADD");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EDIT");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cb_sac, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_sac, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_sacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sacActionPerformed
        // TODO add your handling code here:
        data_arcs();
    }//GEN-LAST:event_cb_sacActionPerformed

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased
        // TODO add your handling code here:
        data_arcs();
    }//GEN-LAST:event_tf_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        add_arc();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        edit_arc();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        delete_arc();
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_sac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_arc;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
       
        init_key();
      
        AutoCompleteDecorator.decorate(cb_sac);
        init_tbl_archives();
        data_arcs();
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
    private ArrayListModel tbl_employee_payroll_ALM;
    private TblInvoicesModel tbl_employee_payroll_M;
////    

    private void init_tbl_archives() {
        tbl_employee_payroll_ALM = new ArrayListModel();
        tbl_employee_payroll_M = new TblInvoicesModel(tbl_employee_payroll_ALM);


        tbl_arc.setModel(tbl_employee_payroll_M);
        tbl_arc.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_arc.setRowHeight(25);

//        tbl_arc.setAutoResizeMode(0);
        int[] tbl_widths_accounts = {0, 200, 500, 0};

        for (int i = 0, n = tbl_widths_accounts.length; i < n; i++) {
           
            if (i == 2) 
                continue;
            
            TableWidthUtilities.setColumnWidth(tbl_arc, i, tbl_widths_accounts[i]);
            
        }

//         TableUtility.align_row_to_Center(tbl_arc, 1);
//            TableUtility.align_row_to_Center(tbl_arc, 2);
            TableUtility.align_column_to_Center(tbl_arc, 1);
            TableUtility.align_column_to_Center(tbl_arc, 2);
        tbl_arc.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 14));
        tbl_arc.setRowHeight(35);
        tbl_arc.setFont(new java.awt.Font("Arial", 1, 12));



    }

    private void loadData_baptism(List<S1_book_archives1.to_book_arc> acc) {
        tbl_employee_payroll_ALM.clear();
        tbl_employee_payroll_ALM.addAll(acc);
    }

    public static class TblInvoicesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "Book No", "YEAR", "sac"
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
            S1_book_archives1.to_book_arc tt = (S1_book_archives1.to_book_arc) getRow(row);

            switch (col) {
                case 0:
                    return tt.id;
                case 1:
                    return tt.book_no;
                case 2:
                    return tt.years;

                default:
                    return tt.sac;
            }
        }
    }

    private void data_arcs() {
        String sac = cb_sac.getSelectedItem().toString();
//        String date = lb_date_baptism.getText();
        String name = tf_search.getText();
        loadData_baptism(S1_book_archives1.ret_arc(sac, name));
    }

    private void add_arc() {
        Window p = (Window) this;
        Dlg_add_book_archives nd = Dlg_add_book_archives.create(p, true);
        nd.setTitle("");
        nd.do_pass(cb_sac.getSelectedItem().toString(), 0);
        nd.setCallback(new Dlg_add_book_archives.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_book_archives.OutputData data) {
                closeDialog.ok();
                add_sac(data.years, data.book_no, data.sac);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void add_sac(String years, String book_no, String sac) {
        S1_book_archives1.add_book_archives(years, book_no, sac);
        JOptionPane.showMessageDialog(null, "Successfully Added");
        data_arcs();
    }

    private void edit_arc() {
        int row = tbl_arc.getSelectedRow();
        if (row < 0) {
            return;
        }
        final String id = tbl_arc.getModel().getValueAt(row, 0).toString();
        String book = tbl_arc.getModel().getValueAt(row, 1).toString();
        String years = tbl_arc.getModel().getValueAt(row, 2).toString();
        String sac = tbl_arc.getModel().getValueAt(row, 3).toString();
        Window p = (Window) this;
        Dlg_add_book_archives nd = Dlg_add_book_archives.create(p, true);
        nd.setTitle("");
//        nd.do_pass(cb_sac.getSelectedItem().toString(), 0);
        nd.do_pass2(book, years, sac);
        nd.setCallback(new Dlg_add_book_archives.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_add_book_archives.OutputData data) {
                closeDialog.ok();
                edit_sac(data.years, data.book_no, data.sac, id);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void edit_sac(String years, String book_no, String sac, String id) {
        S1_book_archives1.edit_book_archives(years, book_no, sac, id);
        JOptionPane.showMessageDialog(null, "Successfully Updated");
        data_arcs();
    }

    private void delete_arc() {
        int row = tbl_arc.getSelectedRow();
        if (row < 0) {
            return;
        }
        final String id = tbl_arc.getModel().getValueAt(row, 0).toString();
        String book = tbl_arc.getModel().getValueAt(row, 1).toString();
        String years = tbl_arc.getModel().getValueAt(row, 2).toString();
        String sac = tbl_arc.getModel().getValueAt(row, 3).toString();
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
//        nd.do_pass(cb_sac.getSelectedItem().toString(), 0);
//        nd.do_pass2(book, years, sac);
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                delete_arc(id);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void delete_arc(String id) {
        S1_book_archives1.delete_book_archives(id);
        JOptionPane.showMessageDialog(null, "Successfully Deleted");
        data_arcs();
    }
}

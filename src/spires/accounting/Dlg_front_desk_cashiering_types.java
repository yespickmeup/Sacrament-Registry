/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.accounting;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import static spires.accounting.Dlg_front_desk.tbl_cashiering_ALM;
import spires.cashiering.Cashiering_types;
import spires.cashiering.Cashiering_types.to_cashiering_types;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_front_desk_cashiering_types extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_front_desk_cashiering_types
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

        public final to_cashiering_types cashiering_type;
        public final double cash;
        public final double check_amount;
        public final String check_no;
        public final String check_bank;
        public final String check_holder;
        public final String remarks;

        public OutputData(to_cashiering_types cashiering_type, double cash, double check_amount, String check_no, String check_bank,String check_holder, String remarks) {
            this.cashiering_type = cashiering_type;
            this.cash = cash;
            this.check_amount = check_amount;
            this.check_no = check_no;
            this.check_bank = check_bank;
            this.check_holder=check_holder;
            this.remarks = remarks;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_front_desk_cashiering_types(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_front_desk_cashiering_types(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_front_desk_cashiering_types() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_front_desk_cashiering_types myRef;

    private void setThisRef(Dlg_front_desk_cashiering_types myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_front_desk_cashiering_types> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_front_desk_cashiering_types create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_front_desk_cashiering_types create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_front_desk_cashiering_types dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_front_desk_cashiering_types((java.awt.Frame) parent, false);
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
            Dlg_front_desk_cashiering_types dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_front_desk_cashiering_types((java.awt.Dialog) parent, false);
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

        Dlg_front_desk_cashiering_types dialog = Dlg_front_desk_cashiering_types.create(new javax.swing.JFrame(), true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cashiering_types = new javax.swing.JTable();
        jTextField1 = new Field.Search();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_cashiering_types.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_cashiering_types);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        ret_cashiering_types(account_id);
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_cashiering_types;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_cashiering_types(tbl_cashiering_types);
    }
    String account_id = "";

    public void do_pass(String account_id1) {
        account_id = account_id1;
        ret_cashiering_types(account_id1);
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

        tbl_cashiering_types.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    jTextField1.grabFocus();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    disposed();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    tender();
                }

            }
        });
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (!tbl_cashiering_ALM.isEmpty()) {
                        tbl_cashiering_types.setRowSelectionInterval(0, 0);
                        tbl_cashiering_types.grabFocus();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    disposed();
                }
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" cashiering_types "> 
    public static ArrayListModel tbl_cashiering_types_ALM;
    public static Tblcashiering_typesModel tbl_cashiering_types_M;

    public static void init_tbl_cashiering_types(JTable tbl_cashiering_types) {
        tbl_cashiering_types_ALM = new ArrayListModel();
        tbl_cashiering_types_M = new Tblcashiering_typesModel(tbl_cashiering_types_ALM);
        tbl_cashiering_types.setModel(tbl_cashiering_types_M);
        tbl_cashiering_types.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_cashiering_types.setRowHeight(25);
        int[] tbl_widths_cashiering_types = {100, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_cashiering_types.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_cashiering_types, i, tbl_widths_cashiering_types[i]);
        }
        Dimension d = tbl_cashiering_types.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_cashiering_types.getTableHeader().setPreferredSize(new Dimension(0, 0));
        tbl_cashiering_types.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_cashiering_types.setRowHeight(30);
        tbl_cashiering_types.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_cashiering_types, 1);
    }

    public static void loadData_cashiering_types(List<to_cashiering_types> acc) {
        tbl_cashiering_types_ALM.clear();
        tbl_cashiering_types_ALM.addAll(acc);
    }

    public static class Tblcashiering_typesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "", "", "account", "cashiering_type", "rate", "is_active", "fix_rate", "incremental", "accounting_group_id", "accounting_group_name", "accounting_account_id", "accounting_account_name", "accounting_account_type", "accounting_account_type_id"
        };

        public Tblcashiering_typesModel(ListModel listmodel) {
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
            to_cashiering_types tt = (to_cashiering_types) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.cashiering_type;
                case 1:
                    return FitIn.fmt_wc_0(tt.rate) + " ";
                case 2:
                    return tt.account;
                case 3:
                    return tt.cashiering_type;
                case 4:
                    return tt.rate;
                case 5:
                    return tt.is_active;
                case 6:
                    return tt.fix_rate;
                case 7:
                    return tt.incremental;
                case 8:
                    return tt.accounting_group_id;
                case 9:
                    return tt.accounting_group_name;
                case 10:
                    return tt.accounting_account_id;
                case 11:
                    return tt.accounting_account_name;
                case 12:
                    return tt.accounting_account_type;
                default:
                    return tt.accounting_account_type_id;
            }
        }
    }

    private void ret_cashiering_types(String account_id) {
        String search = jTextField1.getText();
        String where = " where cashiering_type like '%" + search + "%' and account_id='" + account_id + "'  order by cashiering_type asc ";
        List<to_cashiering_types> datas = Cashiering_types.ret_data(where);
        loadData_cashiering_types(datas);
    }

    private void tender() {
        int row = tbl_cashiering_types.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_cashiering_types to = (to_cashiering_types) tbl_cashiering_types_ALM.get(row);
        Window p = (Window) this;
        Dlg_front_desk_tender nd = Dlg_front_desk_tender.create(p, true);
        nd.setTitle("");
        nd.do_pass(to);
        nd.setCallback(new Dlg_front_desk_tender.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_front_desk_tender.OutputData data) {
                closeDialog.ok();
                double cash = data.cash;
                double check_amount = data.check_amount;
                String check_no = data.check_no;
                String check_bank = data.check_bank;
                String check_holder=data.check_holder;
                String remarks = data.remarks;
                ok1(to, cash, check_amount, check_no, check_bank,check_holder, remarks);
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void ok1(to_cashiering_types to, double cash, double check_amount, String check_no, String check_bank,String check_holder, String remarks) {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(to, cash, check_amount, check_no, check_bank,check_holder, remarks));
        }
    }
//</editor-fold> 
}

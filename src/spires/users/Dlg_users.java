/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.users;

import spires.users.S1_user_default_previleges.to_user_default_previleges;
import spires.users.S1_user_previleges.to_user_previleges;
import spires.users.Users.to_users;
import spires.util.Alert;
import spires.util.Courier;
import spires.util.Focus_Fire;
import spires.util.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Maytopacka
 */
public class Dlg_users extends javax.swing.JDialog {

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
    private Dlg_users(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_users(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_users() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_users myRef;

    private void setThisRef(Dlg_users myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_users> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_users create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_users create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_users dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_users((java.awt.Frame) parent, false);
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
            Dlg_users dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_users((java.awt.Dialog) parent, false);
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

        Dlg_users dialog = Dlg_users.create(new javax.swing.JFrame(), true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
//        dialog.setVisible(true);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jXPanel3 = new org.jdesktop.swingx.JXPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_users = new org.jdesktop.swingx.JXTable();
        tf_search = new Field.Search();
        jLabel7 = new javax.swing.JLabel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_screen_name = new Field.Input();
        jLabel4 = new javax.swing.JLabel();
        tf_user_name = new Field.Input();
        jLabel5 = new javax.swing.JLabel();
        cb_active = new javax.swing.JCheckBox();
        tf_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_lvl = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cb_t_cashier = new javax.swing.JCheckBox();
        cb_t_receipts = new javax.swing.JCheckBox();
        cb_t_stock_transfer = new javax.swing.JCheckBox();
        cb_t_inventory_adjuster = new javax.swing.JCheckBox();
        cb_t_salesman = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        cb_m_items = new javax.swing.JCheckBox();
        cb_m_category = new javax.swing.JCheckBox();
        cb_m_users = new javax.swing.JCheckBox();
        cb_m_uom = new javax.swing.JCheckBox();
        cb_m_suppliers = new javax.swing.JCheckBox();
        cb_m_customers = new javax.swing.JCheckBox();
        cb_m_discount = new javax.swing.JCheckBox();
        cb_m_banks = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        cb_r_sales = new javax.swing.JCheckBox();
        cb_r_cash_count = new javax.swing.JCheckBox();
        cb_r_receipts = new javax.swing.JCheckBox();
        cb_r_stock_transferred = new javax.swing.JCheckBox();
        cb_r_stock_take = new javax.swing.JCheckBox();
        cb_r_stock_left_supplier = new javax.swing.JCheckBox();
        jButton4 = new Button.Warning();
        jButton2 = new Button.Info();
        jButton3 = new Button.Default();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_user_default_previleges = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_user_previleges = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new Field.Combo();
        jTextField2 = new Field.Search();
        jTextField3 = new Field.Combo();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jXPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setOpaque(false);

        tbl_users.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_users.setOpaque(false);
        tbl_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_usersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_users);

        tf_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_search.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_searchActionPerformed(evt);
            }
        });
        tf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_searchKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Search:");

        javax.swing.GroupLayout jXPanel3Layout = new javax.swing.GroupLayout(jXPanel3);
        jXPanel3.setLayout(jXPanel3Layout);
        jXPanel3Layout.setHorizontalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_search)))
                .addContainerGap())
        );
        jXPanel3Layout.setVerticalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jXPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Screen Name:");

        tf_screen_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_screen_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("User Name:");

        tf_user_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_user_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Password:");

        cb_active.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_active.setSelected(true);
        cb_active.setText("Active/Inactive");
        cb_active.setOpaque(false);

        tf_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Status:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("User Level:");

        cb_lvl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_lvl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Accounting", "Administrator", "Inventory", "Services" }));
        cb_lvl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_lvlActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(240, 237, 223));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PREVILEGES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRANSACTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        cb_t_cashier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_t_cashier.setText("CASHIER");
        cb_t_cashier.setOpaque(false);

        cb_t_receipts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_t_receipts.setText("RECEIPTS");
        cb_t_receipts.setOpaque(false);

        cb_t_stock_transfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_t_stock_transfer.setText("STOCK TRANSFER");
        cb_t_stock_transfer.setOpaque(false);

        cb_t_inventory_adjuster.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_t_inventory_adjuster.setText("INVENTORY ADJUSTER");
        cb_t_inventory_adjuster.setOpaque(false);

        cb_t_salesman.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_t_salesman.setText("SALESMAN");
        cb_t_salesman.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_t_receipts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_t_cashier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_t_stock_transfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_t_inventory_adjuster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_t_salesman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_t_salesman)
                .addGap(4, 4, 4)
                .addComponent(cb_t_cashier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_t_receipts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_t_stock_transfer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_t_inventory_adjuster)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MAINTENANCE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        cb_m_items.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_m_items.setText("ITEMS");
        cb_m_items.setOpaque(false);

        cb_m_category.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_m_category.setText("CATEGORY");
        cb_m_category.setOpaque(false);

        cb_m_users.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_m_users.setText("USERS");
        cb_m_users.setOpaque(false);

        cb_m_uom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_m_uom.setText("UOM");
        cb_m_uom.setOpaque(false);

        cb_m_suppliers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_m_suppliers.setText("SUPPLIERS");
        cb_m_suppliers.setOpaque(false);

        cb_m_customers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_m_customers.setText("CUSTOMERS");
        cb_m_customers.setOpaque(false);

        cb_m_discount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_m_discount.setText("DISCOUNTS");
        cb_m_discount.setOpaque(false);

        cb_m_banks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_m_banks.setText("BANKS");
        cb_m_banks.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_m_category, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_m_users, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_m_uom, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_m_suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_m_customers, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_m_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cb_m_items, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_m_banks, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_m_items)
                    .addComponent(cb_m_banks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_m_category)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_m_users)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_m_uom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_m_suppliers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_m_customers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cb_m_discount))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        cb_r_sales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_r_sales.setText("SALES");
        cb_r_sales.setOpaque(false);

        cb_r_cash_count.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_r_cash_count.setText("CASH COUNT");
        cb_r_cash_count.setOpaque(false);

        cb_r_receipts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_r_receipts.setText("RECEIPTS");
        cb_r_receipts.setOpaque(false);

        cb_r_stock_transferred.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_r_stock_transferred.setText("STOCK TRANSFERRED");
        cb_r_stock_transferred.setOpaque(false);

        cb_r_stock_take.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_r_stock_take.setText("STOCK LEFT (Category)");
        cb_r_stock_take.setOpaque(false);
        cb_r_stock_take.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_r_stock_takeActionPerformed(evt);
            }
        });

        cb_r_stock_left_supplier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_r_stock_left_supplier.setText("STOCK LEFT (Supplier)");
        cb_r_stock_left_supplier.setOpaque(false);
        cb_r_stock_left_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_r_stock_left_supplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_r_cash_count, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_r_sales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_r_receipts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_r_stock_transferred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_r_stock_take, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_r_stock_left_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_r_sales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_r_cash_count)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_r_receipts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_r_stock_transferred)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_r_stock_take)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_r_stock_left_supplier)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/rubbish12.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/pencil8.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/plus79 (2).png"))); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lvl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_screen_name))
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jXPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_active, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jXPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_password, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_user_name)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel2Layout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_screen_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_active, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_lvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        tbl_user_default_previleges.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_user_default_previleges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_user_default_previlegesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_user_default_previleges);

        tbl_user_previleges.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_user_previleges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_user_previlegesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_user_previleges);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search Previleges:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Department:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("All");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText("Administrator");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("All");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Department:");

        jButton1.setText("Add All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextField2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_searchKeyReleased

    }//GEN-LAST:event_tf_searchKeyReleased

    private void tbl_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_usersMouseClicked
        select_users();
    }//GEN-LAST:event_tbl_usersMouseClicked

    private void cb_r_stock_takeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_r_stock_takeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_r_stock_takeActionPerformed

    private void cb_r_stock_left_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_r_stock_left_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_r_stock_left_supplierActionPerformed

    private void cb_lvlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_lvlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_lvlActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        data_cols_default();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        init_inventory_category(jTextField1);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbl_user_default_previlegesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_user_default_previlegesMouseClicked
        add_user_previleges();
    }//GEN-LAST:event_tbl_user_default_previlegesMouseClicked

    private void tbl_user_previlegesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_user_previlegesMouseClicked
        delete_user_previleges();
    }//GEN-LAST:event_tbl_user_previlegesMouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        data_cols_previleges();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        init_inventory_category2(jTextField3);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add_all_previleges();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        edit_users();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_users();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        delete_users();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed
        data_cols();
    }//GEN-LAST:event_tf_searchActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_active;
    private javax.swing.JComboBox cb_lvl;
    private javax.swing.JCheckBox cb_m_banks;
    private javax.swing.JCheckBox cb_m_category;
    private javax.swing.JCheckBox cb_m_customers;
    private javax.swing.JCheckBox cb_m_discount;
    private javax.swing.JCheckBox cb_m_items;
    private javax.swing.JCheckBox cb_m_suppliers;
    private javax.swing.JCheckBox cb_m_uom;
    private javax.swing.JCheckBox cb_m_users;
    private javax.swing.JCheckBox cb_r_cash_count;
    private javax.swing.JCheckBox cb_r_receipts;
    private javax.swing.JCheckBox cb_r_sales;
    private javax.swing.JCheckBox cb_r_stock_left_supplier;
    private javax.swing.JCheckBox cb_r_stock_take;
    private javax.swing.JCheckBox cb_r_stock_transferred;
    private javax.swing.JCheckBox cb_t_cashier;
    private javax.swing.JCheckBox cb_t_inventory_adjuster;
    private javax.swing.JCheckBox cb_t_receipts;
    private javax.swing.JCheckBox cb_t_salesman;
    private javax.swing.JCheckBox cb_t_stock_transfer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel jXPanel3;
    private javax.swing.JTable tbl_user_default_previleges;
    private javax.swing.JTable tbl_user_previleges;
    private org.jdesktop.swingx.JXTable tbl_users;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_screen_name;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_user_name;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

        init_key();
        init_tbl_users();
        data_cols();
        focus();
        jLabel3.setVisible(false);
        cb_lvl.setVisible(false);
        jPanel2.setVisible(false);
        init_tbl_user_default_previleges();
        data_cols_default();
        init_tbl_user_previleges();
        data_cols_previleges();
    }

    private void focus() {
        JTextField[] tf = {tf_screen_name, tf_screen_name, tf_password, tf_search, jTextField1, jTextField2, jTextField3};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
    }
    // <editor-fold defaultstate="collapsed" desc="settings">

    // </editor-fold>
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
    private ArrayListModel tbl_users_ALM;
    private TblusersModel tbl_users_M;

    private void init_tbl_users() {
        tbl_users_ALM = new ArrayListModel();
        tbl_users_M = new TblusersModel(tbl_users_ALM);
        tbl_users.getTableHeader().
                setPreferredSize(new Dimension(100, 40));
        tbl_users.setModel(tbl_users_M);
        tbl_users.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_users.setRowHeight(25);
        int[] tbl_widths_users = {100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_users.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.
                    setColumnWidth(tbl_users, i, tbl_widths_users[i]);
        }
        Dimension d = tbl_users.getTableHeader().
                getPreferredSize();
        d.height = 25;
        tbl_users.getTableHeader().
                setPreferredSize(d);
        tbl_users.getTableHeader().
                setFont(new java.awt.Font("Arial", 0, 12));
        tbl_users.setRowHeight(25);
        tbl_users.setFont(new java.awt.Font("Arial", 0, 12));
    }

    private void loadData_users(List<to_users> acc) {
        tbl_users_ALM.clear();
        tbl_users_ALM.addAll(acc);
    }

    public static class TblusersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Screen Name", "User Name", "", "password", "LEVEL", "date_added", "ACTIVE", "t_sales", "t_receipts", "t_stock_transfer", "m_items", "m_category", "m_users", "m_uom", "m_suppliers", "r_sales", "r_cash_count", "r_receipts", "r_stock_transferred", "r_stock_take"
        };

        public TblusersModel(ListModel listmodel) {
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
            to_users tt = (to_users) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.user_code;
                case 1:
                    return " " + tt.user_name;
                default:
                    return "";
            }
        }
    }

    private void data_cols() {
        String search = tf_search.getText();
        String where = " where user_code like '%" + search + "%' ";
        loadData_users(Users.ret_data(where));
    }

    private void add_users() {
        int id = 0;
        String user_code = tf_screen_name.getText();
        String user_name = tf_user_name.getText();
        String password = tf_password.getText();
        int user_level = 1;
        String remarks = "";
        String created = Res.getNow();
        String modified = Res.getNow();
        Users.to_users to = new to_users(id, user_code, user_name, password, user_level, remarks, created, modified);
        Users.add_data(to);
        data_cols();
        clear_users();
        Alert.set(1, "");
    }

    private void select_users() {
        int row = tbl_users.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_users to = (to_users) tbl_users_ALM.get(tbl_users.
                convertRowIndexToModel(row));

        tf_screen_name.setText(to.user_code);
        tf_user_name.setText(to.user_name);
        tf_password.setText(to.password);
        data_cols_previleges();
    }

    private void edit_users() {
        int row = tbl_users.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_users to = (to_users) tbl_users_ALM.get(tbl_users.
                convertRowIndexToModel(row));
        int id = to.id;

        String user_code = tf_screen_name.getText();
        String user_name = tf_user_name.getText();
        String password = tf_password.getText();
        int user_level = 1;
        String remarks = "";
        String created = to.created;
        String modified = Res.getNow();
        Users.to_users to1 = new to_users(id, user_code, user_name, password, user_level, remarks, created, modified);
        Users.update_data(to1);
        data_cols();
        clear_users();
        Alert.set(2, "");
    }

    private void clear_users() {
        tf_screen_name.setText("");
        tf_user_name.setText("");
        tf_password.setText("");
    }

    private void delete_users() {
        int row = tbl_users.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_users to = (to_users) tbl_users_ALM.get(tbl_users.
                convertRowIndexToModel(row));
        Users.delete_data(to);
        data_cols();
        clear_users();
        Alert.set(3, "");
    }

    private ArrayListModel tbl_user_default_previleges_ALM;
    private Tbluser_default_previlegesModel tbl_user_default_previleges_M;

    private void init_tbl_user_default_previleges() {
        tbl_user_default_previleges_ALM = new ArrayListModel();
        tbl_user_default_previleges_M = new Tbluser_default_previlegesModel(tbl_user_default_previleges_ALM);
        tbl_user_default_previleges.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_user_default_previleges.setModel(tbl_user_default_previleges_M);
        tbl_user_default_previleges.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_user_default_previleges.setRowHeight(25);
        int[] tbl_widths_user_default_previleges = {100, 100, 60};
        for (int i = 0, n = tbl_widths_user_default_previleges.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_user_default_previleges, i, tbl_widths_user_default_previleges[i]);
        }
        Dimension d = tbl_user_default_previleges.getTableHeader().getPreferredSize();
        d.height = 30;
        tbl_user_default_previleges.getTableHeader().setPreferredSize(d);
        tbl_user_default_previleges.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_user_default_previleges.setRowHeight(25);
        tbl_user_default_previleges.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_user_default_previleges(List<to_user_default_previleges> acc) {
        tbl_user_default_previleges_ALM.clear();
        tbl_user_default_previleges_ALM.addAll(acc);
    }

    public static class Tbluser_default_previlegesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Account", "    Action"
        };

        public Tbluser_default_previlegesModel(ListModel listmodel) {
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
            to_user_default_previleges tt = (to_user_default_previleges) getRow(row);
            switch (col) {
                case 0:
                    return "  " + tt.name;
                case 1:
                    return "  " + tt.account;
                default:
                    return "     ADD";
            }
        }
    }

    private void data_cols_default() {
        String where;

        if (jCheckBox1.isSelected()) {
            where = " order by name asc";
        } else {
            where = " where name like '%" + jTextField2.getText() + "%' and account like '" + jTextField1.getText() + "' order by name asc";
        }
        loadData_user_default_previleges(S1_user_default_previleges.ret_data(where));
    }
    List<Courier.status> accounts_list = new ArrayList();

    private void init_inventory_category(final JTextField tf) {
        String search = tf.getText();
        accounts_list.clear();
        accounts_list = Courier.account_types();
        Object[][] obj = new Object[accounts_list.size()][2];
        int i = 0;
        for (Courier.status to : accounts_list) {
            obj[i][0] = to.id;
            obj[i][1] = to.status;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, 300};
        String[] col_names = {"Code", "Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Courier.status to = accounts_list.
                        get(data.selected_row);
                tf.setText(to.status);
                data_cols_default();
            }
        });
    }

    private void init_inventory_category2(final JTextField tf) {
        String search = tf.getText();
        accounts_list.clear();
        accounts_list = Courier.account_types();
        Object[][] obj = new Object[accounts_list.size()][2];
        int i = 0;
        for (Courier.status to : accounts_list) {
            obj[i][0] = to.id;
            obj[i][1] = to.status;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, 300};
        String[] col_names = {"Code", "Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Courier.status to = accounts_list.
                        get(data.selected_row);
                tf.setText(to.status);
                data_cols_previleges();
            }
        });
    }
    private ArrayListModel tbl_user_previleges_ALM;
    private Tbluser_previlegesModel tbl_user_previleges_M;

    private void init_tbl_user_previleges() {
        tbl_user_previleges_ALM = new ArrayListModel();
        tbl_user_previleges_M = new Tbluser_previlegesModel(tbl_user_previleges_ALM);
        tbl_user_previleges.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_user_previleges.setModel(tbl_user_previleges_M);
        tbl_user_previleges.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_user_previleges.setRowHeight(25);
        int[] tbl_widths_user_previleges = {100, 100, 60, 0, 0, 0};
        for (int i = 0, n = tbl_widths_user_previleges.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_user_previleges, i, tbl_widths_user_previleges[i]);
        }
        Dimension d = tbl_user_previleges.getTableHeader().getPreferredSize();
        d.height = 30;
        tbl_user_previleges.getTableHeader().setPreferredSize(d);
        tbl_user_previleges.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_user_previleges.setRowHeight(25);
        tbl_user_previleges.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_user_previleges(List<to_user_previleges> acc) {
        tbl_user_previleges_ALM.clear();
        tbl_user_previleges_ALM.addAll(acc);
    }

    public static class Tbluser_previlegesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "Account", "   Action", "status", "user_id", "user_name"
        };

        public Tbluser_previlegesModel(ListModel listmodel) {
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
            to_user_previleges tt = (to_user_previleges) getRow(row);
            switch (col) {
                case 0:
                    return "   " + tt.previledge;
                case 1:
                    return "   " + tt.account;
                case 2:
                    return "   DELETE";
                case 3:
                    return tt.status;
                case 4:
                    return tt.user_id;
                default:
                    return tt.user_name;
            }
        }
    }

    private void data_cols_previleges() {
        int row = tbl_users.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_users to = (to_users) tbl_users_ALM.get(tbl_users.convertRowIndexToModel(row));
        String where;
        if (jCheckBox2.isSelected()) {
            where = " where user_id='" + to.id + "' order by previledge asc ";
        } else {
            where = " where user_name='" + to.id + "' "
                    + " and account like '" + jTextField3.getText() + "'"
                    + " order by previledge asc ";
        }
        loadData_user_previleges(S1_user_previleges.ret_data(where));
    }

    private void add_user_previleges() {
        int row = tbl_user_default_previleges.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_user_default_previleges to = (to_user_default_previleges) tbl_user_default_previleges_ALM.get(tbl_user_default_previleges.convertRowIndexToModel(row));

        int row2 = tbl_users.getSelectedRow();
        if (row2 < 0) {
            return;
        }
        to_users to2 = (to_users) tbl_users_ALM.get(row2);

        if (row2 < 0) {
            Alert.set(0, "Please Select User!");
            return;
        }
        int id = -1;
        String account = to.account;
        String previledge = to.name;
        int status = 1;
        String user_id = "" + to2.id;
        String user_name = to2.user_name;
        to_user_previleges to3 = new to_user_previleges(id, account, previledge, status, user_id, user_name);
        int exists = 0;
        List<to_user_previleges> datas = tbl_user_previleges_ALM;
        for (to_user_previleges t : datas) {
            if (previledge.equalsIgnoreCase(t.previledge)) {
                exists = 1;
                break;
            }
        }
        if (exists == 1) {
            Alert.set(0, "Already Added!");
            return;
        }
        S1_user_previleges.add_user_previleges(to3);
        data_cols_previleges();

    }

    private void add_all_previleges() {
        int row2 = tbl_users.getSelectedRow();
        if (row2 < 0) {
            return;
        }

        if (row2 < 0) {
            Alert.set(0, "Please Select User!");
            return;
        }
        to_users to2 = (to_users) tbl_users_ALM.get(row2);
        int id = -1;
        List<to_user_previleges> prev = tbl_user_previleges_ALM;
        List<to_user_previleges> list = new ArrayList();
        List<to_user_default_previleges> selected = tbl_user_default_previleges_ALM;
        for (to_user_default_previleges d : selected) {
            String account = d.account;
            String previledge = d.name;
            int status = 1;
            String user_id = "" + to2.id;
            String user_name = to2.user_name;

            int exists = 0;
            for (to_user_previleges t : prev) {
                if (previledge.equalsIgnoreCase(t.previledge)) {
                    exists = 1;
                    break;
                }
            }
            if (exists == 0) {
                to_user_previleges to3 = new to_user_previleges(id, account, previledge, status, user_id, user_name);
                list.add(to3);

            }
        }
        S1_user_previleges.add_user_previleges(list);
        data_cols_previleges();
    }

    private void delete_user_previleges() {
        int row = tbl_user_previleges.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_user_previleges to = (to_user_previleges) tbl_user_previleges_ALM.get(tbl_user_previleges.convertRowIndexToModel(row));
        S1_user_previleges.delete_user_previleges(to);
        data_cols_previleges();
    }

}

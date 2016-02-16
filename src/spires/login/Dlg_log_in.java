/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dlg_login.java
 *
 * Created on Dec 25, 2011, 9:14:03 PM
 */
package spires.login;

import java.awt.Window;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import spires.util.Center;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import mijzcx.synapse.desk.utils.CloseDialog;
import spires.users.Res;
import spires.users.Users;
import spires.users.Users.to_users;
import spires.util.Dlg_confirm_action;

/**
 *
 * @author Dummy
 */
public class Dlg_log_in extends javax.swing.JDialog {

    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, Data data);
    }

    public static class Data {

        public final String username;
        public final String acct_type;

        public Data(String username, String acct_type) {
            this.username = username;
            this.acct_type = acct_type;
        }

        @Override
        public String toString() {
            return "Data{" + "username=" + username + ", acct_type=" + acct_type + '}';
        }
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_log_in(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        setUndecorated(true);
        initComponents();

        myInit();

    }

    private Dlg_log_in(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);

        initComponents();

        myInit();
    }

    public Dlg_log_in() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_log_in myRef;

    private void setThisRef(Dlg_log_in myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_log_in> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_log_in create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_log_in create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_log_in dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_log_in((java.awt.Frame) parent, false);
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
            Dlg_log_in dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_log_in((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().
                        log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
//                dialog.setUndecorated(true);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
//                dialog.setUndecorated(true);
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

        Dlg_log_in dialog = Dlg_log_in.create(new javax.swing.JFrame(), true);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());

        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - dialog.getWidth()) / 2;
        final int y = (screenSize.height - dialog.getHeight()) / 2;
        dialog.setLocation(0, y);
        dialog.setSize(xSize, 55);
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
//            validateTree();
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tf_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tf_password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(218, 246, 248));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 31));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER NAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 90, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 70, 30));

        tf_password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 190, 32));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("LOG-IN");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 80, 30));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        log_out();
    }//GEN-LAST:event_formWindowClosing

    private void tf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwordActionPerformed
        // TODO add your handling code here:
        do_check();
    }//GEN-LAST:event_tf_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        do_cancel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        do_check();
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        Center.setCenter(jPanel1);
    }

    private void do_check() {

        String user_name = tf_username.getText();
        String password = tf_password.getText();

        String where = " where user_name='" + user_name + "' and password='" + password + "'";
        List<Users.to_users> datas = Users.ret_data(where);

        if (datas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Account does not Exists");
            tf_username.setText("");
            tf_password.setText("");
            tf_username.grabFocus();
        } else {
            Users.to_users user = datas.get(0);
            Res.setUser_id("" + user.id);
            Res.setUser_name("" + user.user_name);
            Res.setUser_screename(user.user_code);
            ok(user_name, "" + user.user_level);
        }
    }

    private void do_cancel() {
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                System.exit(1);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void log_out() {
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                System.exit(1);
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
    }

    private void ok(String username, String type) {

        if (callback != null) {
            callback.ok(new CloseDialog(this), new Data(username, type));

        }
        this.dispose();
    }
}

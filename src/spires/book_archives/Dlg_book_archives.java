/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.book_archives;

import spires.book_archives.Book_archives.to_book_archives;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
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
import spires.util.TableRenderer;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;

/**
 *
 * @author Maytopacka
 */
public class Dlg_book_archives extends javax.swing.JDialog {

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
    private Dlg_book_archives(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_book_archives(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_book_archives() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_book_archives myRef;

    private void setThisRef(Dlg_book_archives myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_book_archives> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_book_archives create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_book_archives create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_book_archives dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_book_archives((java.awt.Frame) parent, false);
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
            Dlg_book_archives dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_book_archives((java.awt.Dialog) parent, false);
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

        Dlg_book_archives dialog = Dlg_book_archives.create(new javax.swing.JFrame(), true);
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
        tf_search = new Field.Search();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_book_archives = new org.jdesktop.swingx.JXTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new Button.Warning();
        jLabel2 = new javax.swing.JLabel();
        tf_book_no = new Field.Input();
        jLabel8 = new javax.swing.JLabel();
        tf_years = new Field.Input();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new Button.Info();
        jButton3 = new Button.Default();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_search1 = new Field.Combo();
        jLabel6 = new Label.Separator();
        jButton4 = new Button.Default();
        tf_search2 = new Field.Combo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jScrollPane2.setOpaque(false);

        tbl_book_archives.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_book_archives.setOpaque(false);
        tbl_book_archives.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_book_archivesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_book_archives);

        jLabel1.setText("Total No. of Records:");

        jLabel3.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel7.setText("Status:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/rubbish12.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Book No.:");

        tf_book_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_book_no.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Years:");

        tf_years.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_years.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Sacrament:");

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Book No.:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Sacrament:");

        tf_search1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_search1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_search1.setText("Baptism");
        tf_search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_search1MouseClicked(evt);
            }
        });
        tf_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_search1ActionPerformed(evt);
            }
        });
        tf_search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_search1KeyReleased(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_functions/magnifying-glass34.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tf_search2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_search2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_search2.setText("Baptism");
        tf_search2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_search2MouseClicked(evt);
            }
        });
        tf_search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_search2ActionPerformed(evt);
            }
        });
        tf_search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_search2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tf_book_no, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_years, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                            .addComponent(tf_search2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_search1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_years)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_book_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_search2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void tbl_book_archivesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_book_archivesMouseClicked
        select_book_archives();
    }//GEN-LAST:event_tbl_book_archivesMouseClicked

    private void tf_search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_search1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_search1KeyReleased

    private void tf_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_search1ActionPerformed
        init_sacraments(tf_search1);
    }//GEN-LAST:event_tf_search1ActionPerformed

    private void tf_search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_search1MouseClicked
        init_sacraments(tf_search1);
    }//GEN-LAST:event_tf_search1MouseClicked

    private void tf_search2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_search2MouseClicked
        init_sacraments(tf_search2);
    }//GEN-LAST:event_tf_search2MouseClicked

    private void tf_search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_search2ActionPerformed
        init_sacraments(tf_search2);
    }//GEN-LAST:event_tf_search2ActionPerformed

    private void tf_search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_search2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_search2KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        data_cols();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_book_archives();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        edit_book_archives();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete_book_archives();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_searchActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXTable tbl_book_archives;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_search1;
    private javax.swing.JTextField tf_search2;
    private javax.swing.JTextField tf_years;
    // End of variables declaration//GEN-END:variables

    private void myInit() {

        init_key();
        init_tbl_book_archives();

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
    private ArrayListModel tbl_book_archives_ALM;
    private Tblbook_archivesModel tbl_book_archives_M;

    private void init_tbl_book_archives() {
        tbl_book_archives_ALM = new ArrayListModel();
        tbl_book_archives_M = new Tblbook_archivesModel(tbl_book_archives_ALM);
        tbl_book_archives.getTableHeader().
                setPreferredSize(new Dimension(100, 40));
        tbl_book_archives.setModel(tbl_book_archives_M);
        tbl_book_archives.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_book_archives.setRowHeight(25);
        int[] tbl_widths_book_archives = {0, 100, 100, 100};
        for (int i = 0, n = tbl_widths_book_archives.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_book_archives, i, tbl_widths_book_archives[i]);
        }
        Dimension d = tbl_book_archives.getTableHeader().
                getPreferredSize();
        d.height = 25;
        tbl_book_archives.getTableHeader().
                setPreferredSize(d);
        tbl_book_archives.getTableHeader().
                setFont(new java.awt.Font("Arial", 0, 12));
        tbl_book_archives.setRowHeight(25);
        tbl_book_archives.setFont(new java.awt.Font("Arial", 0, 12));
    }

    private void loadData_book_archives(List<Book_archives.to_book_archives> acc) {
        tbl_book_archives_ALM.clear();
        tbl_book_archives_ALM.addAll(acc);
    }

    public static class Tblbook_archivesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID", "Book No", "YEAR/S", "Sacrament"
        };

        public Tblbook_archivesModel(ListModel listmodel) {
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
            Book_archives.to_book_archives tt = (Book_archives.to_book_archives) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.id;
                case 1:
                    return " " + tt.book_no;
                case 2:
                    return " " + tt.years;
                default:
                    return " " + tt.sac;
            }
        }
    }

    private void data_cols() {
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                String search = tf_search.getText();
                String type = tf_search1.getText();
                String where = " where "
                        + " sac like'%" + type + "%' "
                        + " and book_no like '%" + search + "%' order by book_no asc";
                List<to_book_archives> datas = Book_archives.ret_data(where);
                loadData_book_archives(datas);
                jLabel3.setText("" + datas.size());
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void add_book_archives() {
        int id = -1;
        String years = tf_years.getText();
        String book_no = tf_book_no.getText();
        String sac = tf_search2.getText();
        to_book_archives to = new to_book_archives(id, years, book_no, sac);
        Book_archives.add_book_archives(to);
        data_cols();
        clear_book_archives();
    }

    private void select_book_archives() {
        int row = tbl_book_archives.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_book_archives to = (to_book_archives) tbl_book_archives_ALM.get(tbl_book_archives.
                convertRowIndexToModel(row));
        tf_years.setText(to.years);
        tf_book_no.setText(to.book_no);
        tf_search2.setText(to.sac);
    }

    private void edit_book_archives() {
        int row = tbl_book_archives.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_book_archives to = (to_book_archives) tbl_book_archives_ALM.get(tbl_book_archives.
                convertRowIndexToModel(row));
        int id = to.id;
        String years = tf_years.getText();
        String book_no = tf_book_no.getText();
        String sac = tf_search2.getText();
        to_book_archives to1 = new to_book_archives(id, years, book_no, sac);
        Book_archives.edit_book_archives(to1);
        data_cols();
        clear_book_archives();
    }

    private void clear_book_archives() {
        tf_years.setText("");
        tf_book_no.setText("");
    }

    private void delete_book_archives() {
        int row = tbl_book_archives.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_book_archives to = (to_book_archives) tbl_book_archives_ALM.get(tbl_book_archives.
                convertRowIndexToModel(row));
        Book_archives.delete_book_archives(to);
        data_cols();
        clear_book_archives();
    }

    List<String> sacraments = new ArrayList();

    private void init_sacraments(final JTextField tf) {

        sacraments.clear();
        sacraments.add("Baptism");
        sacraments.add("Confirmation");
        sacraments.add("Funeral");
        sacraments.add("Marriage");
        sacraments.add("Communion");
        sacraments.add("Marriage");
        sacraments.add("2nd Marriage");
        sacraments.add("Profession of Faith");
        sacraments.add("Acceptance");
        sacraments.add("Death");

        Object[][] obj = new Object[sacraments.size()][1];
        int i = 0;
        for (String to : sacraments) {
            obj[i][0] = " " + to;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {

                String to = sacraments.get(data.selected_row);
                tf.setText(to);
            }
        });
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode;

import spires.book_archives.S1_book_archives1;
import spires.encode.S3.to_encoded;
import SR.main.Main;
import spires.parishioners.S1_parishioner;
import spires.util.DateType;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.lowagie.text.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import mijzcx.synapse.desk.utils.*;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.combobox.ListComboBoxModel;

/**
 *
 * @author i1
 */
public class Dlg_csv extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_csv
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
    private Dlg_csv(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    private Dlg_csv(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myInit();
    }

    public Dlg_csv() {
        super();
        initComponents();
        myInit();

    }
    private Dlg_csv myRef;

    private void setThisRef(Dlg_csv myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_csv> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_csv create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_csv create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_csv dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_csv((java.awt.Frame) parent, false);
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
            Dlg_csv dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_csv((java.awt.Dialog) parent, false);
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


        Dlg_csv dialog = Dlg_csv.create(new javax.swing.JFrame(), true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_encoded = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_file = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pb_load = new javax.swing.JProgressBar();
        tf_years = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_book = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        cb_year = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        cb_year_bap = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        lbl_records = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbl_encoded.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_encoded);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("SELECT FILE:");

        lbl_file.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_file.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EXCEL TO DATABASE (BETA - St. Catherine)");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("BOOK NO:");

        tf_years.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf_years.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("YEARS:");

        cb_book.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb_book.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("FIRST NAME:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("MI");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("LAST NAME:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BIRTH DATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cb_year.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_year, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cb_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BIRTH PLACE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATE OF BAPTISM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cb_year_bap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb_year_bap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jComboBox8, 0, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_year_bap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cb_year_bap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("FATHER:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("MOTHER:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("MINISTER:");

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SPONSOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REMARKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField8)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbl_records.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_records.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_records.setText("jLabel11");
        lbl_records.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_file, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pb_load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_book, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_years, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_records, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(tf_years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(cb_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pb_load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lbl_records, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        popup();
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        show_dialog();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_book;
    private javax.swing.JComboBox cb_year;
    private javax.swing.JComboBox cb_year_bap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lbl_file;
    private javax.swing.JLabel lbl_records;
    private javax.swing.JProgressBar pb_load;
    private javax.swing.JTable tbl_encoded;
    private javax.swing.JTextField tf_years;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
     
        init_key();
        init_tbl_encoded();
        jPanel1.setVisible(false);
        List<String> datas = new ArrayList();
        int year = FitIn.toInt(DateType.y.format(new Date()));
        for (int i = 1500; i < year + 1; i++) {
//            year += i;
            datas.add("" + i);
        }
        set_book_no();
        jTextField1.grabFocus();
        cb_year.setModel(new ListComboBoxModel(datas));
        cb_year_bap.setModel(new ListComboBoxModel(datas));
        cb_year_bap.setEditable(true);
        cb_year.setEditable(true);
        AutoCompletion.enable(jComboBox1, true);
        AutoCompletion.enable(jComboBox2, true);
        AutoCompletion.enable(cb_year, true);

        AutoCompletion.enable(jComboBox8, true);
        AutoCompletion.enable(jComboBox4, true);
        AutoCompletion.enable(cb_year_bap, true);

        AutoCompletion.enable(cb_book, true);
        AutoCompletion.enable(jComboBox7, true);

    }

    private void set_book_no() {
        cb_book.setModel(new ListComboBoxModel(S1_book_archives1.ret_cb_data()));
    }

    public void do_pass() {
    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void ok1() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
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
    private ArrayListModel tbl_encoded_ALM;
    private TblencodedModel tbl_encoded_M;

    private void init_tbl_encoded() {
        tbl_encoded_ALM = new ArrayListModel();
        tbl_encoded_M = new TblencodedModel(tbl_encoded_ALM);
        tbl_encoded.getTableHeader().
                setPreferredSize(new Dimension(100, 40));
        tbl_encoded.setModel(tbl_encoded_M);
        tbl_encoded.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_encoded.setRowHeight(25);
        int[] tbl_widths_encoded = {50, 50, 150, 50, 150, 150, 100, 100, 100, 0, 150, 100, 100, 100, 0};
        for (int i = 0, n = tbl_widths_encoded.length; i < n; i++) {
            if (i == 13) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_encoded, i, tbl_widths_encoded[i]);
        }        
        Dimension d = tbl_encoded.getTableHeader().
                getPreferredSize();
        d.height = 30;
        tbl_encoded.getTableHeader().
                setPreferredSize(d);
        tbl_encoded.getTableHeader().
                setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_encoded.setRowHeight(35);
        tbl_encoded.setFont(new java.awt.Font("Arial", 1, 12));
    }

    private void loadData_encoded(List<to_encoded> acc) {
        tbl_encoded_ALM.clear();
        tbl_encoded_ALM.addAll(acc);
    }

    public static class TblencodedModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "page no", "index", "fname", "mi", "lname", "b_day", "b_place", "father", "mother", "address", "baptism"
                , "minister", "sponsor", "notes", "ref_id"
        };

        public TblencodedModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 5 || column == 10) {
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
            to_encoded tt = (to_encoded) getRow(row);
            switch (col) {
                case 0:
                    return tt.id;
                case 1:
                    return FitIn.fmt_woc(tt.ref_id);
                case 2:
                    return tt.fname;
                case 3:
                    return tt.mi;
                case 4:
                    return tt.lname;
                case 5:
                    return tt.b_day;
                case 6:
                    return tt.b_place;
                case 7:
                    return tt.father;
                case 8:
                    return tt.mother;
                case 9:
                    return tt.address;
                case 10:
                    return tt.baptism;
                case 11:
                    return tt.minister;
                case 12:
                    return tt.sponsor;
                case 13:
                    return tt.notes;
                default:
                    return tt.page_no;
            }
        }
    }

    private void add() {
        if (tbl_encoded_ALM.isEmpty() || cb_book.getSelectedItem().
                toString().
                isEmpty()) {
            return;
        }

        List<to_encoded> datas = tbl_encoded_ALM;
        List<S1_parishioner.to_parishioners_1> par = new ArrayList();
        for (to_encoded to : datas) {


            int id = FitIn.toInt(to.ref_id);
            int ref_id = FitIn.toInt(to.ref_id);
            String fname = to.fname;
            String mi = to.mi;
            String lname = to.lname;
            String date_of_birth = to.b_day;
            String place_of_birth = to.b_place;
            String address1 = to.address;
            String address2 = "";
            String city = "";
            String states = "";
            String zip_code = "";
            String father = to.father;
            String mother = to.mother;
            int is_baptized = 4;
            int is_comm = 0;
            int is_confirm = 0;
            int is_married = 0;
            int is_2nd_married = 0;
            int is_prof_faith = 0;
            int is_acceptance = 0;
            int is_death = 0;
            String date_added = DateType.datetime.format(new Date());
            int gender = 0;

            String bapt_place = "St. Catherine of Alexandia Parish";
            String b_date = to.baptism;
            String b_book_no = cb_book.getSelectedItem().
                    toString();
            int b_page_no = to.id;
            int b_index_no = to.page_no;
            String c_date = "1500-01-01";
            String c_book_no = "";
            int c_page_no = 0;
            int c_index_no = 0;
            String m_date = "1500-01-01";
            String m_book_no = "0";
            int m_page_no = 0;
            int m_index_no = 0;
            String f_date = "1500-01-01";
            String f_book_no = "0";
            int f_page_no = 0;
            int f_index_no = 0;
            String b_sponsors = to.sponsor;
            String c_sponsors = "";
            String m_sponsors = "";
            String f_sponsors = "";
            String b_minister = to.minister;
            String c_minister = "";
            String m_minister = "";
            String f_minister = "";
            String b_date_added = "1500-01-01";
            String c_date_added = "1500-01-01";
            int marriage_id = 0;
            String f_date_added = "1500-01-01";
            String partner_id = "";
            String partner_name = "";
            String partner_father = "";
            String partner_mother = "";
            String partner_address = "";
            String b_remarks = to.notes;
            String c_remarks = "";
            String m_remarks = "";
            String f_remarks = "";
            String b_time = "";
            String c_time = "";
            String m_time = "";
            String f_time = "";
            String f_date_died = "1500-01-01";
            String f_place_buried = "";
            String f_cause_of_death = "";
            String f_wife_husband = "";
            String f_wife_husband_id = "";
            String partner_fname = "";
            String partner_mi = "";
            String partner_lname = "";
            S1_parishioner.to_parishioners_1 to1 = new S1_parishioner.to_parishioners_1(id, ref_id, fname, mi, lname, b_date, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_place, b_date, b_book_no, b_page_no, b_index_no, c_date, c_book_no, c_page_no, c_index_no, m_date, m_book_no, m_page_no, m_index_no, f_date, f_book_no, f_page_no, f_index_no, b_sponsors, c_sponsors, m_sponsors, f_sponsors, b_minister, c_minister, m_minister, f_minister, b_date_added, c_date_added, marriage_id, f_date_added, partner_id, partner_name, partner_father, partner_mother, partner_address, b_remarks, c_remarks, m_remarks, f_remarks, b_time, c_time, m_time, f_time, f_date_died, f_place_buried, f_cause_of_death, f_wife_husband, f_wife_husband_id, partner_fname, partner_mi, partner_lname);
            par.add(to1);
        }
        S1_parishioner.add_parishioners_list(par);
        JOptionPane.showMessageDialog(null, "added");
        tbl_encoded_ALM.clear();
        tbl_encoded_M.fireTableDataChanged();
//
//        List<S4_insert_to_db.to_parishioners_1> to_parishioners_1 = new ArrayList();
//        List<S4_insert_to_db.to_baptism2> to_baptism2 = new ArrayList();
//        List<S4_insert_to_db.to_baptism2_sponsors> to_baptism2_sponsors = new ArrayList();
//
//        List<to_encoded> datas = tbl_encoded_ALM;
//        int id = FitIn.toInt(S4_insert_to_db.increment_id_parishioners()) + 1;
//        int spons_id = FitIn.toInt(S4_insert_to_db.increment_id_sponsors()) + 1;
//        int i = 1;
//        for (to_encoded to_encoded : datas) {
//            int ref_id = to_encoded.page_no;
//            String fname = to_encoded.fname;
//            String mi = to_encoded.mi;
//            if (mi.equals("^")) {
//                mi = "";
//            }
//            String lname = to_encoded.lname;
//            if (lname.equals("^")) {
//                lname = "";
//            }
//            String date_of_baptism = to_encoded.baptism;
//            if (date_of_baptism.equals("^")) {
//                date_of_baptism = DateType.sf.format(new Date());
//            }
//            String date_of_birth = to_encoded.b_day;
//            if (date_of_birth.equals("^")) {
//                date_of_birth = DateType.sf.format(new Date());
//            }
//            String place_of_birth = to_encoded.b_place;
//            if (place_of_birth.equals("^")) {
//                place_of_birth = "";
//            }
//            String address1 = to_encoded.address;
//            if (address1.equals("^")) {
//                address1 = "";
//            }
//            String address2 = "";
//            String city = "";
//            String states = "";
//            String zip_code = "";
//            String father = to_encoded.father;
//            if (father.equals("^")) {
//                father = "";
//            }
//            String mother = to_encoded.mother;
//            if (mother.equals("^")) {
//                mother = "";
//            }
//            int is_baptized = 4;
//            int is_comm = 0;
//            int is_confirm = 0;
//            int is_married = 0;
//            int is_2nd_married = 0;
//            int is_prof_faith = 0;
//            int is_acceptance = 0;
//            int is_death = 0;
//            String date_added = DateType.datetime.format(new Date());
//            int gender = 0;
//            String bapt_place = "St. Catherine of Alexandia Parish";
//            String b_date = to_encoded.baptism;
//            if (b_date.equals("^")) {
//                b_date = DateType.sf.format(new Date());
//            }
//            String b_book_no = tf_book_no.getText();
//            int b_page_no = to_encoded.id;
//            int b_index_no = i;
//            String c_date = "1500-01-01";
//            String c_book_no = "0";
//            int c_page_no = 0;
//            int c_index_no = 0;
//            String m_date = "1500-01-01";
//            String m_book_no = "0";
//            int m_page_no = 0;
//            int m_index_no = 0;
//            String f_date = "1500-01-01";
//            String f_book_no = "0";
//            int f_page_no = 0;
//            int f_index_no = 0;
//            S4_insert_to_db.to_parishioners_1 to_parishioners_11 = new S4_insert_to_db.to_parishioners_1(ref_id, ref_id, fname, mi, lname, date_of_baptism, date_of_birth, place_of_birth, address1, address2, city, states, zip_code, father, mother, is_baptized, is_comm, is_confirm, is_married, is_2nd_married, is_prof_faith, is_acceptance, is_death, date_added, gender, bapt_place, b_date, b_book_no, b_page_no, b_index_no, c_date, c_book_no, c_page_no, c_index_no, m_date, m_book_no, m_page_no, m_index_no, f_date, f_book_no, f_page_no, f_index_no);
//            to_parishioners_1.add(to_parishioners_11);
//
//            int ref_no = to_encoded.page_no;
//            String godfather = "";
//            String p_godfather = "";
//            String godmother = "";
//            String p_godmother = "";
//            String presider = "";
//            String bapt_date = to_encoded.baptism;
//            if (bapt_date.equals("^")) {
//                bapt_date = DateType.sf.format(new Date());
//            }
//
//            String bapt_time = "8:00 am – 9:00 am";
//            String bapt_church = "St. Catherine of Alexandia Parish";
//            String priest = to_encoded.minister;
//            String book_no = tf_book_no.getText();
//            int page_no = to_encoded.id;
//            String f_comm_date = "1500-01-01";
//            String f_comm_church = "1500-01-01";
//            String f_conf_date = "1500-01-01";
//            String f_conf_church = "1500-01-01";
//            int is_diaconate = 0;
//            String diconate_date = "1500-01-01";
//            int is_religious_prof = 0;
//            String religious_prof_date = "1500-01-01";
//            String remarks = to_encoded.notes;
//            if (remarks.equals("^")) {
//                remarks = "";
//            }
//            int status = 4;
//            String years = tf_years.getText();
//            int num = i;
//
//            S4_insert_to_db.to_baptism2 to_baptism22 = new S4_insert_to_db.to_baptism2(ref_id, ref_no, fname, mi, lname, date_of_birth, place_of_birth, father, mother, godfather, p_godfather, godmother, p_godmother, presider, bapt_date, bapt_time, bapt_church, priest, book_no, page_no, f_comm_date, f_comm_church, f_conf_date, f_conf_church, is_diaconate, diconate_date, is_religious_prof, religious_prof_date, remarks, status, years, num);
//            to_baptism2.add(to_baptism22);
//
//            String sponsor = to_encoded.sponsor;
//            S4_insert_to_db.to_baptism2_sponsors to_baptism2_sponsors1 = new S4_insert_to_db.to_baptism2_sponsors(spons_id, to_encoded.page_no, sponsor);
//            to_baptism2_sponsors.add(to_baptism2_sponsors1);
//            id++;
//            i++;
//            spons_id++;
//
//        }
//
//        S4_insert_to_db.add_data(to_parishioners_1, to_baptism2, to_baptism2_sponsors);
//
//        tbl_encoded_ALM.clear();
//        tbl_encoded_M.fireTableDataChanged();
//
//        JOptionPane.showMessageDialog(null, "Successfully Added");
//        tf_book_no.setText("");
//        tf_years.setText("");
    }

    private void show_dialog() {
        FileDialog fd = new FileDialog(new JDialog(), "Choose .XLS FILE");
        fd.setVisible(true);
        String file = fd.getDirectory() + "" + fd.getFile();
        file = file.replace("\\", "\\\\");
        lbl_file.setText(file);
        if (file == null || file.isEmpty()) {
            return;
        }
        FileInputStream fis = null;
        List sheetData = new ArrayList();
        try {
            fis = new FileInputStream(file);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            while (rows.hasNext()) {
                HSSFRow row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();

                List data = new ArrayList();
                while (cells.hasNext()) {
                    HSSFCell cell = (HSSFCell) cells.next();
                    data.add(cell);
                }
                sheetData.add(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unsupported Format");
        } finally {

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Dlg_csv.class.getName()).
                            log(Level.SEVERE, null, ex);
                }
            }
        }
        List<to_encoded> datas = S3.showExcelData(sheetData, file);
        loadData_encoded(datas);
        lbl_records.setText(""+tbl_encoded_ALM.size());
    }
    
    
    private void popup() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());

        TransparentButton btn = new TransparentButton("");
        TransparentPopupMenu popup = new TransparentPopupMenu();
        popup.setLayout(new BorderLayout());
        popup.add(btn); // your component
        popup.setPopupSize(100, 100);
        popup.show(jButton2, 0, jButton2.getHeight());

//        PopupFactory factory = PopupFactory.getSharedInstance();

    }

    class TransparentButton extends JButton {

        public TransparentButton(String text) {
            super(text);
            setOpaque(false);
        }

        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
            super.paint(g2);
            g2.dispose();
        }
    }

    class TransparentPopupMenu extends JPopupMenu {

        public TransparentPopupMenu() {
            super();
            setOpaque(false);
        }
    }

    class TransparentMenuItem extends JXPanel {

        public TransparentMenuItem(String text) {
            setOpaque(false);

        }

        private TransparentMenuItem(JXPanel jx_border) {
            jx_border.setAlpha(0.2F);
            jx_border.setBackground(new java.awt.Color(51, 51, 51));
            jx_border.setOpaque(true);
        }

        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
            super.paint(g2);
            g2.dispose();
        }
    }
}

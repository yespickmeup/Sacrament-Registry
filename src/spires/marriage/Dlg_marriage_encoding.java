/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.marriage;

import spires.baptismal_records.*;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import spires.encode_bacong.Bacong_encoded_baptism;
import spires.encode_bacong.Bacong_encoded_marriage;
import spires.util.Alert;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_marriage_encoding extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_baptismal_encoding
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
    private Dlg_marriage_encoding(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_marriage_encoding(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_marriage_encoding() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_marriage_encoding myRef;

    private void setThisRef(Dlg_marriage_encoding myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_marriage_encoding> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_marriage_encoding create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_marriage_encoding create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_marriage_encoding dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_encoding((java.awt.Frame) parent, false);
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
            Dlg_marriage_encoding dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_encoding((java.awt.Dialog) parent, false);
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

        Dlg_marriage_encoding dialog = Dlg_marriage_encoding.create(new javax.swing.JFrame(), true);
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
        jTextField1 = new Field.Search();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new Button.Success();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_expenses = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setFocusable(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Location:");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbl_expenses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_expenses);

        jLabel2.setText("Total no. of rows:");

        jLabel3.setText("0");

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel4.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        save_encoded();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        locate_file();
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        locate_file();
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_expenses;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        System.setProperty("mydb", "db_spires_bacong");
        init_key();
        init_tbl_expenses(tbl_expenses);
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
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_F5, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                save_encoded();
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" marriage "> 
    public static ArrayListModel tbl_expenses_ALM;
    public static TblexpensesModel tbl_expenses_M;

    public static void init_tbl_expenses(JTable tbl_expenses) {
        tbl_expenses_ALM = new ArrayListModel();
        tbl_expenses_M = new TblexpensesModel(tbl_expenses_ALM);
        tbl_expenses.setModel(tbl_expenses_M);
        tbl_expenses.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_expenses.setRowHeight(25);
        int[] tbl_widths_expenses = {60, 60, 100, 50, 100, 100, 100, 80, 80, 100, 130, 100, 130, 130};
        for (int i = 0, n = tbl_widths_expenses.length; i < n; i++) {
            if (i == 9) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_expenses, i, tbl_widths_expenses[i]);
        }
        Dimension d = tbl_expenses.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_expenses.getTableHeader().setPreferredSize(d);
        tbl_expenses.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_expenses.setRowHeight(25);
        tbl_expenses.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_expenses(List<Bacong_encoded_marriage.encoded> acc) {
        tbl_expenses_ALM.clear();
        tbl_expenses_ALM.addAll(acc);
    }

    public static class TblexpensesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Page No", "Index", "Marriage", "Groom", "Groom Father", "Groom Mother", "Age ", "Status", "Bride", "Bride Father", "Bride Mother", "Age", "Status", "Prist"

        };

        public TblexpensesModel(ListModel listmodel) {
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
//              "Page No", "Index No", "fname", "mi", "lname", "father", "mother", "date_of_baptism", "date_of_birth", "place_of_birth", "sponsor", "notes", "parish_priest", "minister"

            Bacong_encoded_marriage.encoded tt = (Bacong_encoded_marriage.encoded) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.page_no;
                case 1:
                    return " " + tt.index_no;
                case 2:
                    return " " + tt.date_of_marriage;
                case 3:
                    return " " + tt.groom;
                case 4:
                    return " " + tt.groom_father;
                case 5:
                    return " " + tt.groom_mother;
                case 6:
                    return " " + tt.groom_age;
                case 7:
                    return " " + tt.groom_status;
                case 8:
                    return " " + tt.bride;
                case 9:
                    return " " + tt.bride_father;
                case 10:
                    return " " + tt.bride_mother;
                case 11:
                    return " " + tt.bride_age;
                case 12:
                    return " " + tt.bride_status;
                default:
                    return " " + tt.priest;
            }
        }
    }
//</editor-fold> 

    private void select_excel() {
        String path = jTextField1.getText();
        FileInputStream fis = null;
        final List sheetData = new ArrayList();
        try {

            fis = new FileInputStream(path);
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
            System.out.println("Unsupported Format");
            System.out.println(e);

        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.out.println("Error opening file");
                    System.out.println(ex);
                }
            }
        }

        List< Bacong_encoded_marriage.encoded> datas = Bacong_encoded_marriage.showExcelData(sheetData, path);
        loadData_expenses(datas);
        jLabel3.setText("" + datas.size());
    }

    private void locate_file() {
        final JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".xls", "xls");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            jTextField1.setText(fileChooser.getSelectedFile().getAbsolutePath());
            select_excel();
        }
    }

    private void save_encoded() {
        final List<Bacong_encoded_marriage.encoded> datas = tbl_expenses_ALM;
        if (datas.isEmpty()) {
            Alert.set(0, "Empty record!");
            return;
        }
        Window p = (Window) this;
        Dlg_marriage_confirm_on_save nd = Dlg_marriage_confirm_on_save.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_marriage_confirm_on_save.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, final Dlg_marriage_confirm_on_save.OutputData data) {
                closeDialog.ok();
                jProgressBar1.setString("Loading...Please wait...");
                jProgressBar1.setIndeterminate(true);
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        Bacong_encoded_marriage.add_parishioners_1(datas, data.book_no, data.delete_existing_record);
                        tbl_expenses_ALM.clear();
                        Alert.set(1, "");
                        jTextField1.setText("");
                        jProgressBar1.setString("Finished...");
                        jProgressBar1.setIndeterminate(false);
                    }
                });
                t.start();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
}

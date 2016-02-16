/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.printing;

import spires.certificates.SRpt_confirmation;
import spires.certificates.SRpt_marriage;
import spires.officials.Officials;
import spires.printing.S1_encoding_marriage.to_encoding_marriage;
import spires.util.Alert;
import spires.util.DateType;
import spires.util.Focus_Fire;
import spires.util.TableRenderer2;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Guinness
 */
public class Dlg_printing_marriage extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_printing_marriage
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
    private Dlg_printing_marriage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_printing_marriage(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_printing_marriage() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_printing_marriage myRef;

    private void setThisRef(Dlg_printing_marriage myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_printing_marriage> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_printing_marriage create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_printing_marriage create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_printing_marriage dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_printing_marriage((java.awt.Frame) parent, false);
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
            Dlg_printing_marriage dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_printing_marriage((java.awt.Dialog) parent, false);
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

        Dlg_printing_marriage dialog = Dlg_printing_marriage.create(new javax.swing.JFrame(), true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        tf_priest1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tf_groom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_groom_father = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_groom_mother = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_groom_address = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_groom_status = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_bride_address = new javax.swing.JTextArea();
        tf_bride_status = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_bride_father = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_bride = new javax.swing.JTextField();
        tf_bride_mother = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        dp_baptism = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_sponsors = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        tf_page_no = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tf_index_no = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        tf_priest = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        pnl_rpt = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lbl_file = new javax.swing.JTextField();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_encoding_marriage2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_records = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Search by:");

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Groom");

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setText("[mother]");

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setText("[father]");

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setText("Bride");

        buttonGroup1.add(jCheckBox5);
        jCheckBox5.setText("[mother]");

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setText("[father]");

        jLabel5.setText("Search:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        jLabel6.setText("State:");

        tf_priest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priest1ActionPerformed(evt);
            }
        });

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Parish Priest");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(tf_priest1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jCheckBox1)
                                .addComponent(jCheckBox3)
                                .addComponent(jCheckBox4)
                                .addComponent(jCheckBox2)
                                .addComponent(jCheckBox5)
                                .addComponent(jCheckBox6)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_priest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Groom:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Father:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Mother:");

        tf_groom_address.setColumns(20);
        tf_groom_address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_groom_address.setLineWrap(true);
        tf_groom_address.setRows(5);
        jScrollPane1.setViewportView(tf_groom_address);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Address:");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Status:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Address:");

        tf_bride_address.setColumns(20);
        tf_bride_address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_bride_address.setLineWrap(true);
        tf_bride_address.setRows(5);
        jScrollPane3.setViewportView(tf_bride_address);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Status:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Mother:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Father:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Bride:");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Date of Marr:");

        dp_baptism.setDate(new Date());

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Sponsors:");

        tf_sponsors.setColumns(20);
        tf_sponsors.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_sponsors.setLineWrap(true);
        tf_sponsors.setRows(5);
        jScrollPane4.setViewportView(tf_sponsors);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Remarks:");

        tf_remarks.setColumns(20);
        tf_remarks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        jScrollPane5.setViewportView(tf_remarks);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Book No:");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Page No:");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Index No:");

        jButton5.setText("New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Update");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Delete");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Solemnized by");

        tf_priest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priestActionPerformed(evt);
            }
        });

        jLabel7.setText("0");

        jLabel8.setText("Id");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_groom))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_groom_father))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_groom_mother))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_groom_status))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_bride))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_bride_father))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tf_bride_mother))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_bride_status))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(tf_index_no, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(dp_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_priest)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_page_no, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 150, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_book_no, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_groom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_groom_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_groom_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_groom_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bride, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bride_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bride_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bride_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_priest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp_baptism, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_book_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_page_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_index_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Search/Print Certificate", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Book:");

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("State:");

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnl_rpt.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_rptLayout = new javax.swing.GroupLayout(pnl_rpt);
        pnl_rpt.setLayout(pnl_rptLayout);
        pnl_rptLayout.setHorizontalGroup(
            pnl_rptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        pnl_rptLayout.setVerticalGroup(
            pnl_rptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_rpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_rpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Books Encoded", jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setText("Browse File Location:");

        lbl_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fileMouseClicked(evt);
            }
        });
        lbl_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_fileActionPerformed(evt);
            }
        });

        jProgressBar3.setString("");
        jProgressBar3.setStringPainted(true);

        jLabel27.setText("State:");

        jButton2.setText("Finalize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel28.setText("Book No:");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_file, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(lbl_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jButton2)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        tbl_encoding_marriage2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_encoding_marriage2);

        jLabel1.setText("Total Records:");

        lbl_records.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_records, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_records))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Finalize Encoding", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addGap(5, 5, 5))
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

    private void lbl_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_fileMouseClicked

    private void lbl_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_fileActionPerformed
    }//GEN-LAST:event_lbl_fileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        add_records();
        finalize_record();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        show_dialog();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        set_marriage();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        init_search();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tf_priestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priestActionPerformed
        // TODO add your handling code here:
        init_priest(tf_priest, new JTextField());
    }//GEN-LAST:event_tf_priestActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        add_encoding_marriage();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jLabel7.setText("0");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        update_encoding_marriage();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        delete_marriage_record();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tf_priest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priest1ActionPerformed
        init_priest(tf_priest1, jTextField3);
    }//GEN-LAST:event_tf_priest1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dp_baptism;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField lbl_file;
    private javax.swing.JLabel lbl_records;
    private javax.swing.JPanel pnl_rpt;
    private javax.swing.JTable tbl_encoding_marriage2;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_bride;
    private javax.swing.JTextArea tf_bride_address;
    private javax.swing.JTextField tf_bride_father;
    private javax.swing.JTextField tf_bride_mother;
    private javax.swing.JTextField tf_bride_status;
    private javax.swing.JTextField tf_groom;
    private javax.swing.JTextArea tf_groom_address;
    private javax.swing.JTextField tf_groom_father;
    private javax.swing.JTextField tf_groom_mother;
    private javax.swing.JTextField tf_groom_status;
    private javax.swing.JTextField tf_index_no;
    private javax.swing.JTextField tf_page_no;
    private javax.swing.JTextField tf_priest;
    private javax.swing.JTextField tf_priest1;
    private javax.swing.JTextArea tf_remarks;
    private javax.swing.JTextArea tf_sponsors;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_encoding_marriage2();
        focus();
        jTextField3.setVisible(false);
    }

    private void focus() {
        JTextField[] tf = {jTextField2, tf_book_no, tf_bride, tf_bride_father, tf_bride_mother, tf_bride_status, tf_groom, tf_groom_father, tf_groom_mother, tf_groom_status, tf_index_no, tf_page_no, tf_priest};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
        JTextArea[] tf2 = {tf_groom_address, tf_bride_address, tf_sponsors, tf_remarks};
        Focus_Fire.onFocus_lostFocus(tf2);
        Focus_Fire.select_all(tf2);
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

    private void show_dialog() {
        jProgressBar3.setString("Loading...Please wait...");
        jProgressBar3.setIndeterminate(true);
        FileDialog fd = new FileDialog(new JDialog(), "Choose .XLS FILE");
        fd.setVisible(true);
        if (fd.getDirectory() == null) {
            return;
        }
        String file = fd.getDirectory() + "" + fd.getFile();
        file = file.replace("\\", "\\\\");
        final String file2 = file;
        lbl_file.setText(file);
        if (file == null || file.isEmpty()) {
            return;
        }
        FileInputStream fis = null;
        final List sheetData = new ArrayList();
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
                    Logger.getLogger(Dlg_printing_funeral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Encoded_marriage.to_encoded> datas = Encoded_marriage.showExcelData(sheetData, file2);
                loadData_encoding_marriage2(datas);
                lbl_records.setText("" + datas.size());
                jProgressBar3.setString("Finished...");
                jProgressBar3.setIndeterminate(false);
            }
        });

        t.start();
    }
    private ArrayListModel tbl_encoding_marriage2_ALM;
    private Tblencoding_marriage2Model tbl_encoding_marriage2_M;

    private void init_tbl_encoding_marriage2() {
        tbl_encoding_marriage2_ALM = new ArrayListModel();
        tbl_encoding_marriage2_M = new Tblencoding_marriage2Model(tbl_encoding_marriage2_ALM);
        tbl_encoding_marriage2.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_encoding_marriage2.setModel(tbl_encoding_marriage2_M);
        tbl_encoding_marriage2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_encoding_marriage2.setRowHeight(25);
        int[] tbl_widths_encoding_marriage2 = {0, 30, 30, 30, 80, 150, 100, 50, 100, 100, 150, 100, 50, 100, 100, 150, 100};
        for (int i = 0, n = tbl_widths_encoding_marriage2.length; i < n; i++) {
            if (i == 16) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_encoding_marriage2, i, tbl_widths_encoding_marriage2[i]);
        }
        Dimension d = tbl_encoding_marriage2.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_encoding_marriage2.getTableHeader().setPreferredSize(d);
        tbl_encoding_marriage2.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_encoding_marriage2.setRowHeight(25);
        tbl_encoding_marriage2.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_encoding_marriage2(List<Encoded_marriage.to_encoded> acc) {
        tbl_encoding_marriage2_ALM.clear();
        tbl_encoding_marriage2_ALM.addAll(acc);
    }

    public static class Tblencoding_marriage2Model extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "Index", "Book #", "Page", "Marraige", "Priest", "Groom", "Status", "Father", "Mother", "Address", "Bride", "Status", "Father", "Mother", "Address", "Sponsors"
        };

        public Tblencoding_marriage2Model(ListModel listmodel) {
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
            Encoded_marriage.to_encoded tt = (Encoded_marriage.to_encoded) getRow(row);
            switch (col) {
                case 0:
                    return "";
                case 1:
                    return " " + FitIn.fmt_woc(tt.index_no);
                case 2:
                    return " " + FitIn.fmt_woc(tt.book_no);
                case 3:
                    return " " + FitIn.fmt_woc(tt.page_no);
                case 4:
                    return " " + tt.date_of_marriage;
                case 5:
                    return " " + tt.priest;
                case 6:
                    return " " + tt.groom;
                case 7:
                    return " " + tt.groom_status;
                case 8:
                    return " " + tt.groom_father;
                case 9:
                    return " " + tt.groom_mother;
                case 10:
                    return " " + tt.groom_address;
                case 11:
                    return " " + tt.bride;
                case 12:
                    return " " + tt.bride_status;
                case 13:
                    return " " + tt.bride_father;
                case 14:
                    return " " + tt.bride_mother;
                case 15:
                    return " " + tt.bride_address;
                default:
                    return " " + tt.sponsors;
            }
        }
    }

    private void finalize_record() {
        jProgressBar3.setString("Saving...Please wait...");
        jProgressBar3.setIndeterminate(true);
        jButton2.setEnabled(false);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                List<Encoded_marriage.to_encoded> datas = tbl_encoding_marriage2_ALM;
                List<S1_encoding_marriage.to_encoding_marriage> records = new ArrayList();
                for (Encoded_marriage.to_encoded to : datas) {
                    int id = 0;
                    String index_no = FitIn.fmt_woc(to.index_no);

                    String book_no = jTextField7.getText();
                    String page_no = FitIn.fmt_woc(to.page_no);

                    String date_of_marriage = to.date_of_marriage;
                    String priest = to.priest;
                    String groom = to.groom;
                    String groom_status = to.groom_status;
                    String groom_father = to.groom_father;
                    String groom_mother = to.groom_mother;
                    String groom_address = to.groom_address;
                    String bride = to.bride;
                    String bride_status = to.bride;
                    String bride_father = to.bride_father;
                    String bride_mother = to.bride_mother;
                    String bride_address = to.bride_address;
                    String sponsors = to.sponsors;
                    String remarks = "";
                    S1_encoding_marriage.to_encoding_marriage rec = new S1_encoding_marriage.to_encoding_marriage(id, index_no, book_no, page_no, date_of_marriage, priest, groom, groom_status, groom_father, groom_mother, groom_address, bride, bride_status, bride_father, bride_mother, bride_address, sponsors, remarks);
                    records.add(rec);
                }
                S1_encoding_marriage.add_encoding_marriage(records);
                jProgressBar3.setString("Finished...");
                jProgressBar3.setIndeterminate(false);
                jButton2.setEnabled(true);
            }
        });
        t.start();
    }

    private void set_marriage() {
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String book_no = jTextField1.getText();
                String where = " where book_no='" + book_no + "' order by id asc";

                List<Srpt_print_marriage.field> fields = Srpt_print_marriage.ret_data(where);
                String business_name = System.getProperty("business_name", "St. Catherine of Alexandria");
                String date = DateType.month_date.format(new Date());
                String printed_by = "";

                Srpt_print_marriage rpt = new Srpt_print_marriage(book_no);
                rpt.fields.addAll(fields);
                String jrxml = "rpt_print_marriage.jrxml";
                report_funeral(rpt, jrxml);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });

        t.start();
    }

    private void report_funeral(Srpt_print_marriage to, String jrxml_name) {
        pnl_rpt.removeAll();
        pnl_rpt.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_confirmation(to, jrxml_name);
            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl_rpt.add(viewer);
            pnl_rpt.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_confirmation(Srpt_print_marriage to, String jrxml) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper(jrxml),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }

    public static JasperReport compileJasper(String jrxml) {
        try {
            InputStream is = Srpt_print_marriage.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    List<to_encoding_marriage> search_list = new ArrayList();

    private void init_search() {
        jProgressBar2.setString("Loading...Please wait...");
        jProgressBar2.setIndeterminate(true);
        TableRenderer2 tr = new TableRenderer2();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String search = jTextField2.getText();
                search_list.clear();
                String where = "";
                if (jCheckBox1.isSelected()) {
                    where = " where groom like '%" + search + "%' order by groom asc";
                }
                if (jCheckBox3.isSelected()) {
                    where = " where groom_father like '%" + search + "%' order by groom_father asc";
                }
                if (jCheckBox4.isSelected()) {
                    where = " where groom_mother like '%" + search + "%' order by groom_mother asc";
                }
                if (jCheckBox2.isSelected()) {
                    where = " where bride like '%" + search + "%' order by bride asc";
                }
                if (jCheckBox5.isSelected()) {
                    where = " where bride_father like '%" + search + "%' order by bride_father asc";
                }
                if (jCheckBox6.isSelected()) {
                    where = " where bride_mother like '%" + search + "%' order by bride_mother asc";
                }

                search_list = S1_encoding_marriage.ret_data(where);
                Object[][] obj = new Object[search_list.size()][7];
                int i = 0;
                for (to_encoding_marriage to : search_list) {
                    obj[i][0] = " " + to.index_no;
                    obj[i][1] = " " + to.groom + " - " + to.bride;
                    obj[i][2] = " " + to.book_no;
                    obj[i][3] = " " + to.page_no;
                    obj[i][4] = " " + to.date_of_marriage;
                    obj[i][5] = " " + to.groom_father + "," + to.groom_mother;
                    obj[i][6] = " " + to.bride_father + "," + to.bride_mother;

                    i++;
                }

                JLabel[] labels = {};
                int[] tbl_widths_customers = {60, 50, 50, 50, 100, 200, 200};
                Dimension d = jTextField2.getSize();
                int width = d.width;
                String[] col_names = {"Index #", "Groom - Bride", "Book #", "Page #", "Date", "Groom Parents", "Bride Parents"};

                TableRenderer2.setPopup3(jTextField2, obj, labels, tbl_widths_customers, col_names, width);
                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
            }
        });
        t.start();

        tr.setCallback(new TableRenderer2.Callback() {
            @Override
            public void ok(TableRenderer2.OutputData data) {
                final to_encoding_marriage to = search_list.get(data.selected_row);

                tf_index_no.setText("" + to.index_no);
                tf_book_no.setText(to.book_no);
                tf_page_no.setText(to.page_no);
                try {
                    Date d = DateType.sf.parse(to.date_of_marriage);
                } catch (ParseException ex) {
                    Logger.getLogger(Dlg_printing_marriage.class.getName()).log(Level.SEVERE, null, ex);
                }

                tf_priest.setText(to.priest);
                tf_groom.setText(to.groom);
                tf_groom_status.setText(to.groom_status);
                tf_groom_father.setText(to.groom_father);
                tf_groom_mother.setText(to.groom_mother);
                tf_groom_address.setText(to.groom_address);
                tf_bride.setText(to.bride);
                tf_bride_status.setText(to.bride_status);
                tf_bride_father.setText(to.bride_father);
                tf_bride_mother.setText(to.bride_mother);
                tf_bride_address.setText(to.bride_address);
                tf_sponsors.setText(to.sponsors);
                tf_remarks.setText(to.remarks);
                jLabel7.setText("" + to.id);
                jButton7.setEnabled(true);
                jButton8.setEnabled(true);
                jButton6.setEnabled(false);
                print_certificate();
            }
        });
    }

    private void add_encoding_marriage() {
        int id = -1;
        String index_no = tf_index_no.getText();
        String book_no = tf_book_no.getText();
        String page_no = tf_page_no.getText();
        String date_of_marriage = DateType.sf.format(dp_baptism.getDate());
        String priest = tf_priest.getText();
        String groom = tf_groom.getText();
        String groom_status = tf_groom_status.getText();
        String groom_father = tf_groom_father.getText();
        String groom_mother = tf_groom_mother.getText();
        String groom_address = tf_groom_address.getText();
        String bride = tf_bride.getText();
        String bride_status = tf_bride_status.getText();
        String bride_father = tf_bride_father.getText();
        String bride_mother = tf_bride_mother.getText();
        String bride_address = tf_bride_address.getText();
        String sponsors = tf_sponsors.getText();
        String remarks = tf_remarks.getText();
        to_encoding_marriage to = new to_encoding_marriage(id, index_no, book_no, page_no, date_of_marriage, priest, groom, groom_status, groom_father, groom_mother, groom_address, bride, bride_status, bride_father, bride_mother, bride_address, sponsors, remarks);
        List<to_encoding_marriage> datas = new ArrayList();
        datas.add(to);
        S1_encoding_marriage.add_encoding_marriage(datas);
        Alert.set(1, bride);

    }

    private void update_encoding_marriage() {
        int id = FitIn.toInt(jLabel7.getText());
        String index_no = tf_index_no.getText();
        String book_no = tf_book_no.getText();
        String page_no = tf_page_no.getText();
        String date_of_marriage = DateType.sf.format(dp_baptism.getDate());
        String priest = tf_priest.getText();
        String groom = tf_groom.getText();
        String groom_status = tf_groom_status.getText();
        String groom_father = tf_groom_father.getText();
        String groom_mother = tf_groom_mother.getText();
        String groom_address = tf_groom_address.getText();
        String bride = tf_bride.getText();
        String bride_status = tf_bride_status.getText();
        String bride_father = tf_bride_father.getText();
        String bride_mother = tf_bride_mother.getText();
        String bride_address = tf_bride_address.getText();
        String sponsors = tf_sponsors.getText();
        String remarks = tf_remarks.getText();
        to_encoding_marriage to = new to_encoding_marriage(id, index_no, book_no, page_no, date_of_marriage, priest, groom, groom_status, groom_father, groom_mother, groom_address, bride, bride_status, bride_father, bride_mother, bride_address, sponsors, remarks);
       
        S1_encoding_marriage.edit_encoding_marriage(to);
        Alert.set(2, bride);
        print_certificate();

    }
    List<Officials.to_officials> priest_list = new ArrayList();

    private void init_priest(final JTextField tf1, final JTextField tf2) {
        String search = tf1.getText();
        if (search.isEmpty()) {
            tf2.setText("");

        } else {
            priest_list.clear();
            String where = "where name like '%" + search + "%' order by  designation desc";
            priest_list = Officials.retData(where);
            Object[][] obj = new Object[priest_list.size()][2];
            int i = 0;
            for (Officials.to_officials to : priest_list) {
                obj[i][0] = to.id;
                obj[i][1] = to.name;
                i++;
            }
            JLabel[] labels = {};
            int[] tbl_widths_customers = {50, 100};
            Dimension d = tf1.getSize();
            int width = d.width;
            String[] col_names = {"id", "Name"};
            TableRenderer2 tr = new TableRenderer2();
            TableRenderer2.setPopup2(tf1, obj, labels, tbl_widths_customers, col_names, width);
            tr.setCallback(new TableRenderer2.Callback() {
                @Override
                public void ok(TableRenderer2.OutputData data) {
                    Officials.to_officials to = priest_list.get(data.selected_row);
                    tf1.setText("" + to.name);
                    tf2.setText("" + to.title);
                }
            });
        }
    }

    private void delete_marriage_record() {
        String id = jLabel7.getText();
        S1_encoding_marriage.delete_encoding_marriage(id);
        jLabel7.setText("0");
        jButton6.setEnabled(true);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        clear_encoding_marriage();
        Alert.set(3, id);
    }

    private void clear_encoding_marriage() {
        tf_index_no.setText("");
        tf_book_no.setText("");
        tf_page_no.setText("");
        tf_priest.setText("");
        tf_groom.setText("");
        tf_groom_status.setText("");
        tf_groom_father.setText("");
        tf_groom_mother.setText("");
        tf_groom_address.setText("");
        tf_bride.setText("");
        tf_bride_status.setText("");
        tf_bride_father.setText("");
        tf_bride_mother.setText("");
        tf_bride_address.setText("");
        tf_sponsors.setText("");
    }

    private void print_certificate() {
        jProgressBar2.setString("Loading...Please wait...");
        jProgressBar2.setIndeterminate(true);

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                String day = DateType.nth(DateType.d.format(new Date()));
                String month = DateType.m.format(new Date());
                String year = DateType.y.format(new Date());
                String priest = tf_priest1.getText();
                String asst_priest = jTextField3.getText();
                String series_of = "";
                String g_ref_no = "";
                String b_ref_no = "";
                String g_address = tf_groom_address.getText();
                String b_address = tf_bride_address.getText();
                String path = "";
                String groom = tf_groom.getText();
                String groom_father = tf_groom_father.getText();
                String groom_mother = tf_groom_mother.getText();
                String bride = tf_bride.getText();
                String bride_father = tf_bride_father.getText();
                String bride_mother = tf_bride_mother.getText();
                String date_of_marriage = DateType.convert_jan_1_2013_date_rep(DateType.sf.format(dp_baptism.getDate()));
                String marr_time = "";
                String solemnized_by = tf_priest.getText();
                String book_number = tf_book_no.getText();
                String page_number = tf_page_no.getText();
                String date_added = "";
                String sponsors = tf_sponsors.getText();
                final SRpt_marriage rpt = new SRpt_marriage(day, month, year, priest, asst_priest, series_of, g_ref_no, b_ref_no, g_address, b_address, path, groom, groom_father, groom_mother, bride, bride_father, bride_mother, date_of_marriage, marr_time, solemnized_by, book_number, page_number, date_added, sponsors);

                certificate_funeral(rpt, "rpt_marriage.jrxml");
                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void certificate_funeral(SRpt_marriage to, String jrxml_name) {
        jPanel8.removeAll();
        jPanel8.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_confirmation(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel8.add(viewer);
            jPanel8.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_confirmation(SRpt_marriage to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper_confirmation(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.emptyDatasource());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }

    }

    public static JasperReport compileJasper_confirmation(String jrxml_name) {
        try {
            String jrxml = jrxml_name;
            InputStream is = SRpt_marriage.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
}

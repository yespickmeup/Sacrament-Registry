/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.printing;

import spires.book_archives.Book_archives;
import spires.certificates.SRpt_confirmation;
import spires.encode.S1_encoding_funeral2;
import spires.officials.Officials;
import spires.purposes.S1_purposes;

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
import spires.users.Res;
import spires.users.Users.to_users;

/**
 *
 * @author Ronald
 */
public class Dlg_printing_funeral extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_printing_funeral
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
    private Dlg_printing_funeral(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_printing_funeral(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_printing_funeral() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_printing_funeral myRef;

    private void setThisRef(Dlg_printing_funeral myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_printing_funeral> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_printing_funeral create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_printing_funeral create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_printing_funeral dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_printing_funeral((java.awt.Frame) parent, false);
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
            Dlg_printing_funeral dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_printing_funeral((java.awt.Dialog) parent, false);
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

        Dlg_printing_funeral dialog = Dlg_printing_funeral.create(new javax.swing.JFrame(), true);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tf_fname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_mi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_lname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        dp_baptism = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        tf_place_of_baptism = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_priest = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_sponsors = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_page_no = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tf_index_no = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dp_baptism1 = new com.toedter.calendar.JDateChooser();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        pnl_rpt = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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
        tbl_encoded = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_records = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Search by:");

        buttonGroup2.add(jCheckBox7);
        jCheckBox7.setSelected(true);
        jCheckBox7.setText("Last Name");
        jCheckBox7.setFocusable(false);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox8);
        jCheckBox8.setText("First Name");
        jCheckBox8.setFocusable(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox9);
        jCheckBox9.setText("Informant");
        jCheckBox9.setFocusable(false);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Entry:");

        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        jLabel7.setText("State:");

        jLabel8.setText("Priest:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Purpose:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox9)))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("First Name:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("M.I:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Last Name:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Burial Date:");

        dp_baptism.setDate(new Date());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Burial Place:");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Priest:");

        tf_priest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priestActionPerformed(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Informants:");

        tf_sponsors.setColumns(20);
        tf_sponsors.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        tf_sponsors.setLineWrap(true);
        tf_sponsors.setRows(5);
        jScrollPane1.setViewportView(tf_sponsors);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Book No:");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Page No:");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Index No:");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Id:");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("0");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Selected:");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("-1");

        jButton3.setText("Update");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");
        jButton5.setEnabled(false);
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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tf_remarks.setColumns(20);
        tf_remarks.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        jScrollPane3.setViewportView(tf_remarks);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Remarks:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Date of Death:");

        dp_baptism1.setDate(new Date());
        dp_baptism1.setEnabled(false);

        jCheckBox5.setText("has record");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(216, 216, 216))
                            .addComponent(tf_place_of_baptism))
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(132, 132, 132))
                            .addComponent(tf_book_no)
                            .addComponent(tf_page_no)
                            .addComponent(tf_index_no, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_priest, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dp_baptism1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_lname)
                                        .addComponent(tf_mi)
                                        .addComponent(tf_fname)
                                        .addComponent(dp_baptism, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_mi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox5))
                    .addComponent(dp_baptism1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(tf_place_of_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tf_priest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_book_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_page_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_index_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search/Print Certificate", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Book:");

        jCheckBox1.setText("All");
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Sort by:");

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setText("First Name");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setText("Last Name");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setText("Informant");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Index");

        jLabel6.setText("State:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addGap(210, 210, 210)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_rpt.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_rptLayout = new javax.swing.GroupLayout(pnl_rpt);
        pnl_rpt.setLayout(pnl_rptLayout);
        pnl_rptLayout.setHorizontalGroup(
            pnl_rptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_rptLayout.setVerticalGroup(
            pnl_rptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_rpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_rpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Books Encoded", jPanel3);

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
                .addComponent(lbl_file)
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
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        jScrollPane2.setViewportView(tbl_encoded);

        jLabel1.setText("Total Records:");

        lbl_records.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_records, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_records))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Finalize Encoding", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
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

    private void lbl_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_fileActionPerformed

    }//GEN-LAST:event_lbl_fileActionPerformed

    private void lbl_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_fileMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        show_dialog();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        add_records();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        init_book(jTextField1);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
//        set_confirmation();
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
//        set_confirmation();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
//        set_confirmation();
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        deselect();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        init_search(jTextField2);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        init_priest(jTextField3, jTextField5);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        init_purpose(jTextField4);
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        update_encoded();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
        jButton6.setEnabled(true);
        jButton3.setEnabled(false);
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        add_record();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        delete_record();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf_priestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priestActionPerformed
        init_priest(tf_priest, new JTextField());
    }//GEN-LAST:event_tf_priestActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        check_date_of_death();
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dp_baptism;
    private com.toedter.calendar.JDateChooser dp_baptism1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField lbl_file;
    private javax.swing.JLabel lbl_records;
    private javax.swing.JPanel pnl_rpt;
    private javax.swing.JTable tbl_encoded;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_index_no;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_mi;
    private javax.swing.JTextField tf_page_no;
    private javax.swing.JTextField tf_place_of_baptism;
    private javax.swing.JTextField tf_priest;
    private javax.swing.JTextArea tf_remarks;
    private javax.swing.JTextArea tf_sponsors;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        focus();
        init_tbl_encoded();
        jTextField5.setVisible(false);
//        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel29.setVisible(false);
        jTextField2.grabFocus();
    }

    private void focus() {
        JTextField[] tf = {lbl_file, jTextField1, jTextField3, jTextField2, jTextField4};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
    }

    private void deselect() {
        if (!jCheckBox1.isSelected()) {
            jTextField1.enable(true);
            jTextField1.grabFocus();

        } else {
            jTextField1.enable(false);
        }
    }

    public void do_pass() {

    }

    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(), KeyEvent.VK_ESCAPE, new KeyAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disposed();
            }
        });
    }

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
                List<Encoded_Funeral.to_encoded> datas = Encoded_Funeral.showExcelData(sheetData, file2);
                loadData_encoded(datas);
                lbl_records.setText("" + datas.size());
                jProgressBar3.setString("Finished...");
                jProgressBar3.setIndeterminate(false);
            }
        });

        t.start();
    }

    private ArrayListModel tbl_encoded_ALM;
    private TblencodedModel tbl_encoded_M;

    private void init_tbl_encoded() {
        tbl_encoded_ALM = new ArrayListModel();
        tbl_encoded_M = new TblencodedModel(tbl_encoded_ALM);
        tbl_encoded.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_encoded.setModel(tbl_encoded_M);
        tbl_encoded.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_encoded.setRowHeight(25);
        int[] tbl_widths_encoded = {50, 100, 50, 100, 250, 250, 250, 100, 50, 50, 100};
        for (int i = 0, n = tbl_widths_encoded.length; i < n; i++) {
            if (i == 4 || i == 6) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_encoded, i, tbl_widths_encoded[i]);
        }

        Dimension d = tbl_encoded.getTableHeader().getPreferredSize();
        d.height = 30;
        tbl_encoded.getTableHeader().setPreferredSize(d);
        tbl_encoded.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_encoded.setRowHeight(25);
        tbl_encoded.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_encoded(List<Encoded_Funeral.to_encoded> acc) {
        tbl_encoded_ALM.clear();
        tbl_encoded_ALM.addAll(acc);
    }

    public static class TblencodedModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Index", "First Name", "Mi", "Last Name", "Address", "Priest", "Informant", "Date", "Book No", "Page No", "Death"
        };

        public TblencodedModel(ListModel listmodel) {
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
            Encoded_Funeral.to_encoded tt = (Encoded_Funeral.to_encoded) getRow(row);
            switch (col) {
                case 0:
                    return FitIn.fmt_woc(tt.index_no);
                case 1:
                    return tt.fname;
                case 2:
                    return tt.mi;
                case 3:
                    return tt.lname;
                case 4:
                    return tt.residence;
                case 5:
                    return tt.price;
                case 6:
                    return tt.informant;
                case 7:
                    return DateType.slash.format(Encoded_Funeral.getRoundedDate(FitIn.toDouble(tt.date_of_burial)));
                case 8:
                    return tt.book_no.replace(".0", "");
                case 9:
                    return FitIn.fmt_woc(tt.page_no);
                default:

                    return DateType.slash.format(Encoded_Funeral.getRoundedDate(FitIn.toDouble(tt.date_of_burial2)));
            }
        }
    }

    private void add_records() {
        jProgressBar3.setString("Saving Record...Please wait...");
        jProgressBar3.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Encoded_Funeral.to_encoded> datas = tbl_encoded_ALM;
                S1_encoding_funeral2.add_encoding_funeral2(datas);
                Alert.set(0, "Successfully Added: " + datas.size() + " records.");
                jProgressBar3.setString("Finished...");
                jProgressBar3.setIndeterminate(false);
            }
        });
        t.start();
    }
    List<Book_archives.to_book_archives> book_list = new ArrayList();

    private void init_book(final JTextField tf1) {
        String search = tf1.getText();
        book_list.clear();
        String where = "where sac='" + "Death" + "' and book_no like '%" + search + "%' order by id asc";
        book_list = Book_archives.ret_data(where);
        if (book_list.size() == 1) {
            Book_archives.to_book_archives to = book_list.get(0);
            tf1.setText("" + to.book_no);
            set_funeral();
        } else {
            Object[][] obj = new Object[book_list.size()][1];
            int i = 0;
            for (Book_archives.to_book_archives to : book_list) {
                obj[i][0] = to.book_no;
                i++;
            }

            JLabel[] labels = {};
            int[] tbl_widths_customers = {tf1.getWidth()};
            int width = tf1.getWidth();
            String[] col_names = {"Book"};
            TableRenderer2 tr = new TableRenderer2();
            TableRenderer2.setPopup2(tf1, obj, labels, tbl_widths_customers, col_names, width);
            tr.setCallback(new TableRenderer2.Callback() {
                @Override
                public void ok(TableRenderer2.OutputData data) {
                    Book_archives.to_book_archives to = book_list.get(data.selected_row);
                    tf1.setText("" + to.book_no);
                    set_funeral();
                }
            });
        }

    }

    private void set_funeral() {
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String where = "";
                if (jTextField1.isEnabled()) {
                    where = " where book_no='" + jTextField1.getText() + "'";
                }

                if (jCheckBox2.isSelected()) {
                    where = where + " order by fname asc";
                }
                if (jCheckBox3.isSelected()) {
                    where = where + " order by lname asc";
                }
                if (jCheckBox4.isSelected()) {
                    where = where + " order by informant asc";
                }

                if (jCheckBox6.isSelected()) {
                    where = where + " order by id asc";
                }
                List<Srpt_print_funeral.field> fields = Srpt_print_funeral.ret_data(where);
                String business_name = System.getProperty("business_name", "St. Catherine of Alexandria");
                String date = DateType.month_date.format(new Date());
                String printed_by = "";
                Srpt_print_funeral rpt = new Srpt_print_funeral(business_name, date, printed_by);
                rpt.fields.addAll(fields);
                String jrxml = "rpt_print_funeral.jrxml";
                report_funeral(rpt, jrxml);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });

        t.start();
    }

    private void report_funeral(Srpt_print_funeral to, String jrxml_name) {
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

    public static JRViewer get_confirmation(Srpt_print_funeral to, String jrxml) {
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
            InputStream is = Srpt_print_funeral.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    List<Officials.to_officials> priest_list = new ArrayList();

    private void init_priest(final JTextField tf1, final JTextField tf2) {
        String search = tf1.getText();
        if (search.isEmpty()) {
            tf2.setText("");
            jTextField4.grabFocus();
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
                    jTextField4.grabFocus();
                }
            });
        }
    }

    List<S1_purposes.to_purposes> purpose_list = new ArrayList();

    private void init_purpose(final JTextField tf1) {
        String search = tf1.getText();
        purpose_list.clear();
        String where = "where purpose like '%" + tf1.getText() + "%'";
        purpose_list = S1_purposes.ret_data(where);
        if (purpose_list.isEmpty() || search.isEmpty()) {
            jTextField2.grabFocus();
        } else {
            Object[][] obj = new Object[purpose_list.size()][1];
            int i = 0;
            for (S1_purposes.to_purposes to : purpose_list) {
                obj[i][0] = to.purpose;

                i++;
            }
            JLabel[] labels = {};
            Dimension d = tf1.getSize();
            int width = d.width;
            int[] tbl_widths_customers = {width};
            String[] col_names = {"Purpose"};
            TableRenderer2 tr = new TableRenderer2();
            TableRenderer2.setPopup2(tf1, obj, labels, tbl_widths_customers, col_names, width);
            tr.setCallback(new TableRenderer2.Callback() {
                @Override
                public void ok(TableRenderer2.OutputData data) {
                    S1_purposes.to_purposes to = purpose_list.get(data.selected_row);
                    tf1.setText("" + to.purpose);
                    jTextField2.grabFocus();
                }
            });
        }
    }

    List<Srpt_print_funeral.field> search_list = new ArrayList();

    private void init_search(final JTextField tf1) {
        jProgressBar2.setString("Loading...Please wait...");
        jProgressBar2.setIndeterminate(true);
        TableRenderer2 tr = new TableRenderer2();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String search = tf1.getText();
                search_list.clear();
                String where = "";
                if (jCheckBox7.isSelected()) {
                    where = " where concat(lname,space(1),fname) like '%" + tf1.getText() + "%' order by lname asc";
                }
                if (jCheckBox8.isSelected()) {
                    where = " where concat(fname,space(1),lname) like '%" + tf1.getText() + "%' order by fname asc";
                }
                if (jCheckBox9.isSelected()) {
                    where = " where informant like '%" + tf1.getText() + "%' order by fname asc";
                }

                search_list = Srpt_print_funeral.ret_data(where);
                Object[][] obj = new Object[search_list.size()][8];
                int i = 0;
                for (Srpt_print_funeral.field to : search_list) {
                    obj[i][0] = to.id;
                    obj[i][1] = to.fname + " " + to.mi + " " + to.lname;
                    if (jCheckBox7.isSelected()) {
                        obj[i][1] = to.lname + ", " + to.fname + " " + to.mi;
                    }
                    obj[i][2] = to.book_no;
                    obj[i][3] = to.page_no;
                    obj[i][4] = to.price;
                    obj[i][5] = to.informant;
                    obj[i][6] = to.residence;
                    obj[i][7] = to.date_of_burial;

                    i++;
                }

                JLabel[] labels = {};
                int[] tbl_widths_customers = {60, 150, 50, 50, 150, 300, 100, 100};
                Dimension d = jTextField2.getSize();
                int width = d.width;
                String[] col_names = {"Index #", "Name", "Book #", "Page #", "Officiating Priest", "Informant", "Burial Place", "Burial Date"};

                TableRenderer2.setPopup4(tf1, obj, labels, tbl_widths_customers, col_names, width);
                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
            }
        });
        t.start();

        tr.setCallback(new TableRenderer2.Callback() {
            @Override
            public void ok(TableRenderer2.OutputData data) {
                final Srpt_print_funeral.field to = search_list.get(data.selected_row);
                jLabel29.setText("" + data.selected_row);
                jLabel24.setText(to.id);
                if (jCheckBox7.isSelected()) {
                    tf1.setText("" + to.lname + " " + to.fname);
                } else {
                    tf1.setText("" + to.fname + " " + to.lname);
                }
                jProgressBar2.setString("Preparing Certificate...");
                jProgressBar2.setIndeterminate(true);
                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        set_details(to);
                        set_certificate(to);
                        jButton3.setEnabled(true);
                        jButton5.setEnabled(true);
                        jButton6.setEnabled(false);
                        jProgressBar2.setString("Finished...");
                        jProgressBar2.setIndeterminate(false);
                    }
                });
                t2.start();
            }
        });
    }

    private void set_details(Srpt_print_funeral.field to) {
        tf_book_no.setText(to.book_no);

        tf_fname.setText(to.fname);
        tf_index_no.setText(to.index_no);
        tf_lname.setText(to.lname);
        tf_mi.setText(to.mi);

        tf_page_no.setText(to.page_no);
        tf_place_of_baptism.setText(to.residence);
        tf_priest.setText(to.price);
        tf_sponsors.setText(to.informant);
        tf_remarks.setText(to.remarks);
        try {
            Date baptism = DateType.slash.parse(to.date_of_burial);
            dp_baptism.setDate(baptism);
            if (to.date_of_death != null) {
                Date date_of_death = DateType.sf.parse(to.date_of_death);
                dp_baptism1.setDate(date_of_death);
                jCheckBox5.setSelected(true);
                dp_baptism1.setEnabled(true);

            } else {
                jCheckBox5.setSelected(false);
                dp_baptism1.setEnabled(false);
            }

        } catch (ParseException ex) {
            Logger.getLogger(Dlg_printing_funeral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void set_certificate(Srpt_print_funeral.field to) {
        String num = to.id;
        String day = DateType.nth(DateType.d.format(new Date()));
        String month = DateType.m.format(new Date());
        String year = DateType.y.format(new Date());

        String priest = jTextField3.getText();
        String asst_priest = jTextField5.getText();
        int add2 = FitIn.toInt(DateType.y.format(new Date())) + 1;
        String series_of = DateType.y.format(new Date()) + " - " + add2;
        String path = "path";
        String name = to.fname + " " + to.mi + " " + to.lname;
        name = name.toUpperCase();
        Date d2 = new Date();
        Date d3=new Date();
        try {
            d2 = DateType.slash.parse(to.date_of_burial);
            
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_printing_funeral.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        String burial_date = DateType.month_date.format(d2);

        String book_no = "" + to.book_no;
        String page_no = "" + to.page_no;
        String confirmed_by = to.price;
        String sponsor_name = to.informant;
        String place_of_birth = to.residence;
        if(place_of_birth==null){
            place_of_birth="";
        }
        String date_of_birth = DateType.month_date.format(d2);
        String img_path = System.getProperty("img_path", "C:\\Users\\Ronald\\");
        String purpose = "Purpose: " + jTextField4.getText();
        if (jTextField4.getText().isEmpty()) {
            purpose = "";
        }
        String date_of_death=to.date_of_death;
        if(to.date_of_death!=null){
            date_of_death=DateType.convert_jan_1_2013_date_rep2(to.date_of_death);
        }
        String rem=to.remarks;
       
        SRpt_confirmation rpt = new SRpt_confirmation(num, day, month, year, jTextField3.getText(), asst_priest, series_of, path, name, to.remarks, ""
                , burial_date, book_no, page_no, tf_priest.getText(), sponsor_name, place_of_birth, date_of_birth, img_path
                , date_of_birth, place_of_birth, purpose,date_of_death);

        String jrxml = "rpt_funeral2.jrxml";
        certificate_funeral(rpt, jrxml);
    }

    private void certificate_funeral(SRpt_confirmation to, String jrxml_name) {
        jPanel7.removeAll();
        jPanel7.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_confirmation(to, jrxml_name);

            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            jPanel7.add(viewer);
            jPanel7.updateUI();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_confirmation(SRpt_confirmation to, String rpt_name) {
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
            InputStream is = SRpt_confirmation.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    private void update_encoded() {
        final int id = FitIn.toInt(jLabel24.getText());
        final String index_no = tf_index_no.getText();
        final String book_no = tf_book_no.getText();
        final String page_no = tf_page_no.getText();
        final String date_of_burial = DateType.sf.format(dp_baptism.getDate());
        final String priest = tf_priest.getText();
        final String fname = tf_fname.getText();
        final String mi = tf_mi.getText();
        final String lname = tf_lname.getText();
        final String residence = tf_place_of_baptism.getText();
        final String informant = tf_sponsors.getText();
        final String date_added = DateType.datetime.format(new Date());
        final String user_name = Res.getUser_name();
        final String remarks = tf_remarks.getText();
        final String date_of_death = DateType.sf.format(dp_baptism1.getDate());
        String dd = date_of_death;
        if (!jCheckBox5.isSelected()) {
            dd = null;
        }
        jProgressBar2.setString("Updating Record...");
        jProgressBar2.setIndeterminate(true);
//        final Encoded_Funeral.to_encoded to = new Encoded_Funeral.to_encoded(index_no, book_no, page_no, date_of_burial, priest, fname, mi, lname, residence, informant, remarks, "", dd);
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                S1_encoding_funeral2.edit_encoding_funeral2(to, id);
//                String d = DateType.convert_sf_to_slash(date_of_burial);
//                String dd2 = date_of_death;
//                if (!jCheckBox5.isSelected()) {
//                    dd2 = null;
//                }
//                Srpt_print_funeral.field to = new Srpt_print_funeral.field(index_no, book_no, page_no, d, priest, fname, mi, lname, residence
//                        , informant, "" + id, remarks, dd2);
//                set_certificate(to);
//                jProgressBar2.setString("Finished...");
//                jProgressBar2.setIndeterminate(false);
//                Alert.set(2, "");
//            }
//        });
//        t.start();
    }

    private void add_record() {
        final int id = FitIn.toInt(jLabel24.getText());
        final String index_no = tf_index_no.getText();
        final String book_no = tf_book_no.getText();
        final String page_no = tf_page_no.getText();
        final String date_of_burial = DateType.sf.format(dp_baptism.getDate());
        final String priest = tf_priest.getText();
        final String fname = tf_fname.getText();
        final String mi = tf_mi.getText();
        final String lname = tf_lname.getText();
        final String residence = tf_place_of_baptism.getText();
        final String informant = tf_sponsors.getText();
        final String date_added = DateType.datetime.format(new Date());
        final String user_name = Res.getUser_name();
        final String remarks = tf_remarks.getText();
        final String date_of_death = DateType.sf.format(dp_baptism1.getDate());
        String dod = date_of_death;
        if (!jCheckBox5.isSelected()) {
            dod = null;
        }
        jProgressBar2.setString("Adding Record...");
        jProgressBar2.setIndeterminate(true);
//        final Encoded_Funeral.to_encoded to = new Encoded_Funeral.to_encoded(index_no, book_no, page_no, date_of_burial, priest, fname, mi, lname, residence, informant, remarks, "", dod,"");
//
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                S1_encoding_funeral2.add_encoding_funeral2(to);
//                String d = DateType.convert_sf_to_slash(date_of_burial);
//                String dod1 = date_of_death;
//                if (!jCheckBox5.isSelected()) {
//                    dod1 = null;
//                }
//                Srpt_print_funeral.field to = new Srpt_print_funeral.field(index_no, book_no, page_no, d, priest, fname, mi, lname, residence, informant, "" + id, remarks, dod1);
//                set_certificate(to);
//                jButton6.setEnabled(false);
//                jButton3.setEnabled(true);
//                jButton5.setEnabled(true);
//                jProgressBar2.setString("Finished...");
//                jProgressBar2.setIndeterminate(false);
//                Alert.set(1, "");
//            }
//        });
//        t.start();
    }

    private void delete_record() {
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String id = jLabel24.getText();
                S1_encoding_funeral2.delete_encoding_funeral2(id);
                clear();
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
                Alert.set(3, "");
            }
        });
        t.start();
    }

    private void clear() {
        tf_fname.setText("");
        tf_index_no.setText("");
        tf_fname.grabFocus();
        tf_mi.setText("");
        tf_lname.setText("");
        tf_place_of_baptism.setText("");
        tf_priest.setText("");

        tf_sponsors.setText("");
        tf_remarks.setText("");
        tf_book_no.setText("");
        tf_page_no.setText("");
        jLabel24.setText("");

        jLabel29.setText("");

    }

    private void check_date_of_death() {
        if (jCheckBox5.isSelected()) {
            dp_baptism1.setEnabled(true);
        } else {
            dp_baptism1.setEnabled(false);
        }
    }
}

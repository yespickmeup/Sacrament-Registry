/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.marriage_records;

import spires.certificates.SRpt_marriage;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JasperPrint;
import spires.officials.Officials;
import spires.util.Dlg_confirm_action;
import spires.util.TableRenderer;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;
import synsoftech.util.DateType;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_marriage_records extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_baptismal_records
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
    private Dlg_marriage_records(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_marriage_records(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_marriage_records() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_marriage_records myRef;

    private void setThisRef(Dlg_marriage_records myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_marriage_records> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_marriage_records create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_marriage_records create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_marriage_records dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_records((java.awt.Frame) parent, false);
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
            Dlg_marriage_records dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_records((java.awt.Dialog) parent, false);
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

        Dlg_marriage_records dialog = Dlg_marriage_records.create(new javax.swing.JFrame(), true);
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new Button.Info();
        jLabel1 = new Label.Separator();
        tf_groom_father = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_bride_mother = new javax.swing.JTextField();
        tf_bride = new javax.swing.JTextField();
        dp_baptism = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        tf_bride_father = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_groom = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_sponsors = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        tf_bride_status = new javax.swing.JTextField();
        tf_page_no = new javax.swing.JTextField();
        tf_index_no = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_bride_address = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        tf_groom_status = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tf_priest = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_groom_address = new javax.swing.JTextArea();
        tf_groom_mother = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new Button.Default();
        jButton2 = new Button.Success();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_marriage_records = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new Field.Combo();
        jTextField2 = new Field.Search();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel27 = new Label.Separator();
        jButton4 = new Button.Default();
        jTextField5 = new Field.Input();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_dashboard/paper6.png"))); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Father:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Mother:");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Sponsors:");

        dp_baptism.setDate(new Date());
        dp_baptism.setDateFormatString("MM d, yyyy");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Date of Marr:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Mother:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Bride:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Groom:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Father:");

        tf_sponsors.setColumns(20);
        tf_sponsors.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_sponsors.setLineWrap(true);
        tf_sponsors.setRows(5);
        jScrollPane4.setViewportView(tf_sponsors);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Book No:");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Remarks:");

        tf_remarks.setColumns(20);
        tf_remarks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        jScrollPane5.setViewportView(tf_remarks);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Page No:");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Index No:");

        tf_bride_address.setColumns(20);
        tf_bride_address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_bride_address.setLineWrap(true);
        tf_bride_address.setRows(5);
        jScrollPane3.setViewportView(tf_bride_address);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Address:");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Status:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Address:");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Solemnized by");

        tf_priest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priestActionPerformed(evt);
            }
        });

        tf_groom_address.setColumns(20);
        tf_groom_address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_groom_address.setLineWrap(true);
        tf_groom_address.setRows(5);
        jScrollPane1.setViewportView(tf_groom_address);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Status:");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_dashboard/direction102 (2).png"))); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_dashboard/save-file.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_groom))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_groom_father))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_groom_mother))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_groom_status))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_bride))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_bride_father))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tf_bride_mother))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_bride_status))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dp_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tf_priest)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_index_no))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_book_no, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_page_no, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_groom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_groom_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_groom_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_groom_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bride, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bride_father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bride_mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bride_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_priest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp_baptism, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_book_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_page_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_index_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tbl_marriage_records.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_marriage_records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_marriage_recordsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_marriage_records);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Search by:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Priest:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Entry:");

        jLabel5.setText("Total No. of Records");

        jLabel6.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel22.setText("Status:");

        buttonGroup4.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Groom");

        buttonGroup4.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("[mother]");

        buttonGroup4.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("[father]");

        buttonGroup4.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Bride");

        buttonGroup4.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("[mother]");

        buttonGroup4.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("[father]");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_dashboard/refresh57.png"))); // NOI18N
        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Designation:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addGap(8, 8, 8)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel22))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        init_priest1();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        data_cols();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tf_priestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priestActionPerformed
        init_priest2();

    }//GEN-LAST:event_tf_priestActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        is_add = 1;
        jPanel3.setVisible(true);
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (is_add == 1) {
            add_marriage_records();
        } else {
            update_marriage_records();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_marriage_recordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_marriage_recordsMouseClicked
        select_marriage_records();
    }//GEN-LAST:event_tbl_marriage_recordsMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        set_certificate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private com.toedter.calendar.JDateChooser dp_baptism;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tbl_marriage_records;
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
    private javax.swing.JTextArea tf_remarks;
    private javax.swing.JTextArea tf_sponsors;
    // End of variables declaration//GEN-END:variables

    private JRadioButton a4Certificate;
    private JRadioButton legacyCertificate;
    private static final Color PAGE_COLOR = new Color(243, 246, 250);
    private static final Color INK_COLOR = new Color(35, 49, 66);

    private void myInit() {
        jPanel3.setVisible(false);
        init_tbl_marriage_records(tbl_marriage_records);
        initFrontDeskActions();
        init_key();
    }

    private void initFrontDeskActions() {
        a4Certificate = new JRadioButton("A4 certificate");
        legacyCertificate = new JRadioButton("Legacy");
        ButtonGroup layouts = new ButtonGroup();
        layouts.add(a4Certificate);
        layouts.add(legacyCertificate);
        a4Certificate.setSelected(true);
        jButton3.setText("Preview certificate...");
        jButton3.setToolTipText("Preview the selected marriage record and choose how to print it");
        jButton5.setText("Close details");
        jTextField3.setToolTipText("Signing priest. Press Enter to choose an official.");
        jTextField5.setToolTipText("Designation of the signing priest");
        if (jTextField5.getText().trim().isEmpty()) {
            jTextField5.setText("Parish Priest");
        }
        jTextField2.setToolTipText("Search records by the selected field, then press Enter");
        jLabel4.setText("Search:");
        jCheckBox1.setText("Groom");
        jCheckBox3.setText("Groom's father");
        jCheckBox4.setText("Groom's mother");
        jCheckBox2.setText("Bride");
        jCheckBox5.setText("Bride's father");
        jCheckBox6.setText("Bride's mother");

        JPanel page = new JPanel(new BorderLayout(0, 16));
        page.setBackground(PAGE_COLOR);
        page.setBorder(BorderFactory.createEmptyBorder(18, 20, 18, 20));
        JPanel heading = new JPanel(new BorderLayout());
        heading.setOpaque(false);
        JLabel title = new JLabel("Marriage records");
        title.setForeground(INK_COLOR);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        heading.add(title, BorderLayout.NORTH);
        JLabel subtitle = new JLabel("Search a record, prepare the blank certificate, then print details after signing.");
        subtitle.setForeground(new Color(90, 102, 116));
        heading.add(subtitle, BorderLayout.SOUTH);
        JButton close = new JButton("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { dispose(); }
        });
        heading.add(close, BorderLayout.EAST);
        page.add(heading, BorderLayout.NORTH);

        JPanel left = new JPanel(new BorderLayout(0, 14));
        left.setOpaque(false);
        left.add(buildSearchAndCertificateCard(), BorderLayout.NORTH);
        left.add(buildRecordsCard(), BorderLayout.CENTER);
        rebuildRecordEditor();
        jPanel3.setPreferredSize(new Dimension(500, 600));
        JPanel body = new JPanel(new BorderLayout(16, 0));
        body.setOpaque(false);
        body.add(left, BorderLayout.CENTER);
        body.add(jPanel3, BorderLayout.EAST);
        page.add(body, BorderLayout.CENTER);
        setContentPane(page);
    }

    private JPanel buildSearchAndCertificateCard() {
        JPanel card = card();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.add(sectionTitle("Find a marriage record"));
        card.add(Box.createVerticalStrut(8));
        JPanel filters = new JPanel(new GridLayout(2, 3, 10, 4));
        filters.setOpaque(false);
        filters.setAlignmentX(LEFT_ALIGNMENT);
        filters.add(jCheckBox1); filters.add(jCheckBox3); filters.add(jCheckBox4);
        filters.add(jCheckBox2); filters.add(jCheckBox5); filters.add(jCheckBox6);
        card.add(filters);
        card.add(Box.createVerticalStrut(8));
        card.add(horizontalField(jLabel4, jTextField2));
        card.add(Box.createVerticalStrut(14));
        card.add(sectionTitle("Certificate preparation"));
        card.add(Box.createVerticalStrut(8));
        JPanel signatory = new JPanel(new GridLayout(1, 2, 12, 0));
        signatory.setOpaque(false);
        signatory.setAlignmentX(LEFT_ALIGNMENT);
        signatory.add(fieldBlock("Signing priest", jTextField3));
        signatory.add(fieldBlock("Designation", jTextField5));
        card.add(signatory);
        card.add(Box.createVerticalStrut(10));
        JPanel actions = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        actions.setOpaque(false);
        actions.setAlignmentX(LEFT_ALIGNMENT);
        JButton preprint = new JButton("Pre-print blank certificate...");
        preprint.setToolTipText("Uses the signing priest above; no marriage record is needed");
        preprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) { preview_blank_certificate(); }
        });
        actions.add(preprint);
        JLabel hint = new JLabel("  A4 form + priest and designation; couple fields stay blank");
        hint.setForeground(new Color(90, 102, 116));
        actions.add(hint);
        card.add(actions);
        return card;
    }

    private JPanel buildRecordsCard() {
        JPanel card = card();
        card.setLayout(new BorderLayout(0, 10));
        JPanel top = new JPanel(new BorderLayout());
        top.setOpaque(false);
        top.add(sectionTitle("Records"), BorderLayout.WEST);
        top.add(jButton4, BorderLayout.EAST);
        card.add(top, BorderLayout.NORTH);
        card.add(jScrollPane2, BorderLayout.CENTER);
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        footer.setOpaque(false);
        footer.add(jLabel5); footer.add(jLabel6); footer.add(jProgressBar1);
        card.add(footer, BorderLayout.SOUTH);
        return card;
    }

    private void rebuildRecordEditor() {
        JPanel fields = card();
        fields.setLayout(new BoxLayout(fields, BoxLayout.Y_AXIS));
        fields.add(sectionTitle("Groom"));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Full name", tf_groom), fieldBlock("Status", tf_groom_status)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(fieldBlock("Residence", jScrollPane1));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Father", tf_groom_father), fieldBlock("Mother's maiden name", tf_groom_mother)));
        fields.add(Box.createVerticalStrut(16));
        fields.add(sectionTitle("Bride"));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Full name", tf_bride), fieldBlock("Status", tf_bride_status)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(fieldBlock("Residence", jScrollPane3));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Father", tf_bride_father), fieldBlock("Mother's maiden name", tf_bride_mother)));
        fields.add(Box.createVerticalStrut(16));
        fields.add(sectionTitle("Marriage details"));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Date of marriage", dp_baptism), fieldBlock("Solemnizing priest", tf_priest)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(fieldBlock("Witnesses", jScrollPane4));
        fields.add(Box.createVerticalStrut(16));
        fields.add(sectionTitle("Registry reference"));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Book", tf_book_no), fieldBlock("Page", tf_page_no), fieldBlock("Entry", tf_index_no)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(fieldBlock("Remarks", jScrollPane5));
        fields.add(Box.createVerticalStrut(8));

        JPanel actions = card();
        actions.setLayout(new BoxLayout(actions, BoxLayout.Y_AXIS));
        actions.add(sectionTitle("Certificate layout"));
        JPanel choices = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 4));
        choices.setOpaque(false);
        choices.setAlignmentX(LEFT_ALIGNMENT);
        choices.add(a4Certificate); choices.add(legacyCertificate);
        actions.add(choices);
        actions.add(Box.createVerticalStrut(8));
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        buttons.setOpaque(false);
        buttons.setAlignmentX(LEFT_ALIGNMENT);
        buttons.add(jButton3); buttons.add(jButton2); buttons.add(jButton5);
        actions.add(buttons);
        JScrollPane editorScroll = new JScrollPane(fields);
        editorScroll.setBorder(BorderFactory.createEmptyBorder());
        editorScroll.getVerticalScrollBar().setUnitIncrement(16);
        jPanel3.removeAll();
        jPanel3.setLayout(new BorderLayout());
        jPanel3.setBackground(PAGE_COLOR);
        jPanel3.add(editorScroll, BorderLayout.CENTER);
        jPanel3.add(actions, BorderLayout.SOUTH);
    }

    private JPanel card() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(221, 228, 235)),
                BorderFactory.createEmptyBorder(14, 16, 14, 16)));
        return panel;
    }
    private JLabel sectionTitle(String text) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setForeground(INK_COLOR);
        label.setFont(label.getFont().deriveFont(Font.BOLD, 14f));
        return label;
    }
    private JPanel horizontalField(JLabel label, JComponent field) {
        JPanel row = new JPanel(new BorderLayout(10, 0));
        row.setOpaque(false);
        row.setAlignmentX(LEFT_ALIGNMENT);
        row.add(label, BorderLayout.WEST);
        row.add(field, BorderLayout.CENTER);
        return row;
    }
    private JPanel fieldBlock(String title, JComponent field) {
        JPanel block = new JPanel(new BorderLayout(0, 4));
        block.setOpaque(false);
        block.setAlignmentX(LEFT_ALIGNMENT);
        JLabel label = new JLabel(title);
        label.setForeground(new Color(81, 94, 109));
        block.add(label, BorderLayout.NORTH);
        block.add(field, BorderLayout.CENTER);
        return block;
    }
    private JPanel formRow(JPanel... blocks) {
        JPanel row = new JPanel(new GridLayout(1, blocks.length, 10, 0));
        row.setOpaque(false);
        row.setAlignmentX(LEFT_ALIGNMENT);
        for (JPanel block : blocks) { row.add(block); }
        return row;
    }

    private void preview_blank_certificate() {
        String priest = jTextField3.getText().trim();
        if (priest.length() == 0) {
            JOptionPane.showMessageDialog(this, "Choose the signing priest first.",
                    "Signing priest required", JOptionPane.INFORMATION_MESSAGE);
            jTextField3.requestFocusInWindow();
            return;
        }
        Dlg_preview_marriage_certificate preview = Dlg_preview_marriage_certificate.create(this, true);
        preview.do_pass_preprint(priest, jTextField5.getText().trim());
        preview.setLocationRelativeTo(this);
        preview.setVisible(true);
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
        tbl_marriage_records.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    e.consume();
                    select_marriage_records();
                }
            }
        });
    }
    // </editor-fold>
    int is_add = 1;
    //<editor-fold defaultstate="collapsed" desc=" marriage_records "> 
    public static ArrayListModel tbl_marriage_records_ALM;
    public static Tblmarriage_recordsModel tbl_marriage_records_M;

    public static void init_tbl_marriage_records(JTable tbl_marriage_records) {
        tbl_marriage_records_ALM = new ArrayListModel();
        tbl_marriage_records_M = new Tblmarriage_recordsModel(tbl_marriage_records_ALM);
        tbl_marriage_records.setModel(tbl_marriage_records_M);
        tbl_marriage_records.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_marriage_records.setRowHeight(25);
        int[] tbl_widths_marriage_records = {50, 180, 50, 50, 75, 160, 160, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_marriage_records.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_marriage_records, i, tbl_widths_marriage_records[i]);
        }
        Dimension d = tbl_marriage_records.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_marriage_records.getTableHeader().setPreferredSize(d);
        tbl_marriage_records.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_marriage_records.setRowHeight(25);
        tbl_marriage_records.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_marriage_records.getColumnModel().getColumn(7).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_marriage_records(List<Marriage_records.to_encoding_marriage> acc) {
        tbl_marriage_records_ALM.clear();
        tbl_marriage_records_ALM.addAll(acc);
    }

    public static class Tblmarriage_recordsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID", "Groom-Bride", "Book #", "Page #", "Date", "Groom Parents", "Bride Parents", "", "groom_status", "groom_father", "groom_mother", "groom_address", "bride", "bride_status", "bride_father", "bride_mother", "bride_address", "date_of_marriage", "priest", "sponsors", "remarks", "book_no", "page_no", "index_no", "status"
        };

        public Tblmarriage_recordsModel(ListModel listmodel) {
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
            Marriage_records.to_encoding_marriage tt = (Marriage_records.to_encoding_marriage) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.id;
                case 1:
                    return " " + tt.groom + " - " + tt.bride;
                case 2:
                    return " " + tt.book_no;
                case 3:
                    return " " + tt.page_no;
                case 4:
                    return " " + DateType.convert_slash_datetime2(tt.date_of_marriage);
                case 5:
                    return " " + tt.groom_father + ", " + tt.groom_mother;
                case 6:
                    return " " + tt.bride_father + ", " + tt.groom_mother;
                case 7:
                    return "/spires/img_dashboard/rubbish12.png";
                case 8:
                    return tt.groom_status;
                case 9:
                    return tt.groom_father;
                case 10:
                    return tt.groom_mother;
                case 11:
                    return tt.groom_address;
                case 12:
                    return tt.bride;
                case 13:
                    return tt.bride_status;
                case 14:
                    return tt.bride_father;
                case 15:
                    return tt.bride_mother;
                case 16:
                    return tt.bride_address;
                case 17:
                    return tt.date_of_marriage;
                case 18:
                    return tt.priest;
                case 19:
                    return tt.sponsors;
                case 20:
                    return tt.remarks;
                case 21:
                    return tt.book_no;
                case 22:
                    return tt.page_no;
                case 23:
                    return tt.index_no;
                default:
                    return "";
            }
        }
    }

    private void data_cols() {

        jTextField2.setEnabled(false);
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                String search = jTextField2.getText();

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

                List<Marriage_records.to_encoding_marriage> datas = Marriage_records.ret_data(where);
                loadData_marriage_records(datas);
                if (!datas.isEmpty()) {
                    tbl_marriage_records.setRowSelectionInterval(0, 0);
                    tbl_marriage_records.grabFocus();
                }
                jLabel6.setText("" + datas.size());

                jTextField2.setEnabled(true);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();
    }
//</editor-fold> 

    private void add_marriage_records() {

        int id = 0;
        String index_no = tf_index_no.getText();
        String book_no = tf_book_no.getText();
        String page_no = tf_page_no.getText();
        String date_of_marriage = spires.util.DateType.sf.format(dp_baptism.getDate());
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
        Marriage_records.to_encoding_marriage to = new Marriage_records.to_encoding_marriage(id, index_no, book_no, page_no, date_of_marriage, priest, groom, groom_status, groom_father, groom_mother, groom_address, bride, bride_status, bride_father, bride_mother, bride_address, sponsors, remarks);

        List<Marriage_records.to_encoding_marriage> datas = new ArrayList();
        datas.add(to);
        Marriage_records.add_encoding_marriage(datas);

        clear();
        System.out.println("Record  Added!");
        data_cols();
    }

    private void clear() {
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

        tf_priest.setText("");
        tf_sponsors.setText("");
        tf_remarks.setText("");
        tf_book_no.setText("");
        tf_page_no.setText("");
        tf_index_no.setText("");
    }

    private void select_marriage_records() {

        int row = tbl_marriage_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_marriage_records.getSelectedColumn();
        Marriage_records.to_encoding_marriage to = (Marriage_records.to_encoding_marriage) tbl_marriage_records_ALM.get(row);

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
        try {
            Date dmarriage = DateType.sf.parse(to.date_of_marriage);
            dp_baptism.setDate(dmarriage);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_records.class.getName()).log(Level.SEVERE, null, ex);
        }

        tf_priest.setText(to.priest);
        tf_sponsors.setText(to.sponsors);
        tf_remarks.setText(to.remarks);
        tf_book_no.setText(to.book_no);
        tf_page_no.setText(to.page_no);
        tf_index_no.setText(to.index_no);
        jPanel3.setVisible(true);
        is_add = 0;
        if (col == 7) {
            delete_marriage_records();
        }

    }

    private void update_marriage_records() {

        int row = tbl_marriage_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        Marriage_records.to_encoding_marriage to = (Marriage_records.to_encoding_marriage) tbl_marriage_records_ALM.get(row);
        int id = to.id;
        String index_no = tf_index_no.getText();
        String book_no = tf_book_no.getText();
        String page_no = tf_page_no.getText();
        String date_of_marriage = spires.util.DateType.sf.format(dp_baptism.getDate());
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
        Marriage_records.to_encoding_marriage to1 = new Marriage_records.to_encoding_marriage(id, index_no, book_no, page_no, date_of_marriage, priest, groom, groom_status, groom_father, groom_mother, groom_address, bride, bride_status, bride_father, bride_mother, bride_address, sponsors, remarks);
        Marriage_records.edit_encoding_marriage(to1);

        System.out.println("Record  Updated!");
        data_cols();

    }

    private void delete_marriage_records() {
        int row = tbl_marriage_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Marriage_records.to_encoding_marriage to = (Marriage_records.to_encoding_marriage) tbl_marriage_records_ALM.get(row);
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                Marriage_records.delete_encoding_marriage("" + to.id);
                clear();
                System.out.println("Record  Deleted!");
                data_cols();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

    }

    private void set_certificate() {
        if (a4Certificate.isSelected() && jTextField3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Choose the signing priest before previewing.",
                    "Signing priest required", JOptionPane.INFORMATION_MESSAGE);
            jTextField3.requestFocusInWindow();
            return;
        }
        if (tf_groom.getText().trim().isEmpty() || tf_bride.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a marriage record first.",
                    "Record required", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (dp_baptism.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Select a record with a marriage date.",
                    "Marriage date required", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Date today = new Date();
        String day = spires.util.DateType.nth(spires.util.DateType.d.format(today));
        String month = spires.util.DateType.m.format(today);
        String year = spires.util.DateType.y.format(today);
        String priest = jTextField3.getText().trim();
        String designation = jTextField5.getText().trim();
        String date = spires.util.DateType.month_date.format(dp_baptism.getDate());
        String jrxml = "rpt_marriage_certificate_2025.jrxml";
        String entry = tf_index_no.getText();
        if (legacyCertificate.isSelected()) {
            jrxml = System.getProperty("print_marriage", "default").equalsIgnoreCase("Bacong")
                    ? "rpt_marriage_bacong.jrxml" : "rpt_marriage.jrxml";
            date = spires.util.DateType.convert_jan_1_2013_date_rep(
                    spires.util.DateType.sf.format(dp_baptism.getDate()));
            entry = "";
        }
        SRpt_marriage rpt = new SRpt_marriage(day, month, year, priest, designation,
                "", entry, "", tf_groom_address.getText(), tf_bride_address.getText(), "",
                tf_groom.getText().trim(), tf_groom_father.getText(), tf_groom_mother.getText(),
                tf_bride.getText().trim(), tf_bride_father.getText(), tf_bride_mother.getText(),
                date, "", tf_priest.getText(), tf_book_no.getText(), tf_page_no.getText(),
                "", tf_sponsors.getText());
        print_preview(rpt, jrxml);
    }

    private void print_preview(SRpt_marriage rpt, String jrxml) {
        Window p = (Window) this;
        Dlg_preview_marriage_certificate nd = Dlg_preview_marriage_certificate.create(p, true);
        nd.setTitle("");
        nd.do_pass(rpt, jrxml);
        nd.setCallback(new Dlg_preview_marriage_certificate.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_preview_marriage_certificate.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    JasperPrint jasperPrint = null;

    private void init_priest1() {
        String where = " where name like '%" + jTextField3.getText() + "%' order by name asc";
        final List<Officials.to_officials> officials = Officials.retData(where);
        Object[][] obj = new Object[officials.size()][1];
        int i = 0;
        for (Officials.to_officials to : officials) {
            obj[i][0] = " " + to.name;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {jTextField3.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(jTextField3, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Officials.to_officials to = officials.get(data.selected_row);
                jTextField3.setText(to.name);
                jTextField5.setText(to.title);
            }
        });
    }

    private void init_priest2() {
        String where = " where name like '%" + tf_priest.getText() + "%' order by name asc";
        final List<Officials.to_officials> officials = Officials.retData(where);
        Object[][] obj = new Object[officials.size()][1];
        int i = 0;
        for (Officials.to_officials to : officials) {
            obj[i][0] = " " + to.name;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_priest.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_priest, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Officials.to_officials to = officials.get(data.selected_row);
                tf_priest.setText(to.name);

            }
        });
    }
}

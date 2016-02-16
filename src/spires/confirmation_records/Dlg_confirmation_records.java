/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.confirmation_records;

import spires.certificates.SRpt_confirmation;
import spires.printing.Srpt_print_confirmation;
import spires.purposes.S1_purposes;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
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
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import spires.officials.Officials;

import spires.users.Res;
import spires.util.Dlg_confirm_action;
import spires.util.TableRenderer;
import spires.util.TableRenderer2;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;
import synsoftech.util.DateType;
import synsoftech.util.ImageRenderer;

/**
 *
 * @author Guinness
 */
public class Dlg_confirmation_records extends javax.swing.JDialog {

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
    private Dlg_confirmation_records(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_confirmation_records(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_confirmation_records() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_confirmation_records myRef;

    private void setThisRef(Dlg_confirmation_records myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_confirmation_records> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_confirmation_records create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_confirmation_records create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_confirmation_records dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_confirmation_records((java.awt.Frame) parent, false);
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
            Dlg_confirmation_records dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_confirmation_records((java.awt.Dialog) parent, false);
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

        Dlg_confirmation_records dialog = Dlg_confirmation_records.create(new javax.swing.JFrame(), true);
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
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new Button.Info();
        jLabel1 = new Label.Separator();
        jLabel12 = new javax.swing.JLabel();
        tf_lname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_father = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_fname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_mi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_remarks = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_page_no = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_place_of_baptism = new javax.swing.JTextField();
        tf_index_no = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        dp_confirmation = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_book_no = new javax.swing.JTextField();
        dp_baptism = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        tf_mother = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_priest = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_sponsors = new javax.swing.JTextArea();
        jButton5 = new Button.Default();
        jButton2 = new Button.Success();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_confirmation_records = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new Field.Combo();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new Field.Combo();
        jTextField2 = new Field.Search();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new Label.Separator();
        jButton4 = new Button.Default();
        jTextField5 = new Field.Input();
        jLabel24 = new javax.swing.JLabel();

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Father:");

        tf_lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Mother:");

        tf_father.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("M.I:");

        tf_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Last Name:");

        tf_mi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("First Name:");

        tf_remarks.setColumns(20);
        tf_remarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_remarks.setLineWrap(true);
        tf_remarks.setRows(5);
        jScrollPane3.setViewportView(tf_remarks);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Remarks:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Confirmation:");

        tf_page_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Index No:");

        tf_place_of_baptism.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_index_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Priest:");

        dp_confirmation.setDate(new Date());
        dp_confirmation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Baptism:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Book No:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Place of Baptism:");

        tf_book_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dp_baptism.setDate(new Date());
        dp_baptism.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Page No:");

        tf_mother.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_motherActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Sponsors:");

        tf_priest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_priest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priestActionPerformed(evt);
            }
        });

        tf_sponsors.setColumns(20);
        tf_sponsors.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_sponsors.setLineWrap(true);
        tf_sponsors.setRows(5);
        jScrollPane1.setViewportView(tf_sponsors);

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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_mother)
                                    .addComponent(tf_lname)
                                    .addComponent(tf_mi)
                                    .addComponent(tf_fname)
                                    .addComponent(tf_father)
                                    .addComponent(dp_baptism, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dp_confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tf_place_of_baptism, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_priest, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_book_no, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(tf_index_no))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_page_no)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_mi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_father, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_mother, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dp_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dp_confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(tf_place_of_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(tf_priest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_book_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_page_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_index_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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

        tbl_confirmation_records.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_confirmation_records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_confirmation_recordsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_confirmation_records);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Search by:");

        buttonGroup1.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setSelected(true);
        jCheckBox7.setText("Last Name");
        jCheckBox7.setFocusable(false);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("First Name");
        jCheckBox8.setFocusable(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setText("Mother");
        jCheckBox9.setFocusable(false);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox10);
        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("Father");
        jCheckBox10.setFocusable(false);
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Priest:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Purpose:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
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

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Designation:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox10))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5))
                            .addComponent(jTextField2))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
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

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        jTextField2.grabFocus();
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        init_priest1();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        init_purpose();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        data_cols();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tf_motherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_motherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_motherActionPerformed

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
            add_confirmation_records();
        } else {
            update_confirmation_records();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_confirmation_recordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_confirmation_recordsMouseClicked
        select_confirmation_records();
    }//GEN-LAST:event_tbl_confirmation_recordsMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        print_certificate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dp_baptism;
    private com.toedter.calendar.JDateChooser dp_confirmation;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tbl_confirmation_records;
    private javax.swing.JTextField tf_book_no;
    private javax.swing.JTextField tf_father;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_index_no;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_mi;
    private javax.swing.JTextField tf_mother;
    private javax.swing.JTextField tf_page_no;
    private javax.swing.JTextField tf_place_of_baptism;
    private javax.swing.JTextField tf_priest;
    private javax.swing.JTextArea tf_remarks;
    private javax.swing.JTextArea tf_sponsors;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        jPanel3.setVisible(false);
        init_tbl_confirmation_records(tbl_confirmation_records);

    }

    int is_add = 1;

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

        tbl_confirmation_records.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    select_confirmation_records();
                }
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" confirmation_records "> 
    public static ArrayListModel tbl_confirmation_records_ALM;
    public static Tblconfirmation_recordsModel tbl_confirmation_records_M;

    public static void init_tbl_confirmation_records(JTable tbl_confirmation_records) {
        tbl_confirmation_records_ALM = new ArrayListModel();
        tbl_confirmation_records_M = new Tblconfirmation_recordsModel(tbl_confirmation_records_ALM);
        tbl_confirmation_records.setModel(tbl_confirmation_records_M);
        tbl_confirmation_records.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_confirmation_records.setRowHeight(25);
        int[] tbl_widths_confirmation_records = {50, 180, 50, 50, 150, 150, 75, 150, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_confirmation_records.length; i < n; i++) {
            if (i == 7) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_confirmation_records, i, tbl_widths_confirmation_records[i]);
        }
        Dimension d = tbl_confirmation_records.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_confirmation_records.getTableHeader().setPreferredSize(d);
        tbl_confirmation_records.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_confirmation_records.setRowHeight(25);
        tbl_confirmation_records.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_confirmation_records.getColumnModel().getColumn(8).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_confirmation_records(List<Srpt_print_confirmation.field> acc) {
        tbl_confirmation_records_ALM.clear();
        tbl_confirmation_records_ALM.addAll(acc);
    }

    public static class Tblconfirmation_recordsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID", "Name", "Book #", "Page #", "Mother", "Father", "Confirmation", "Sponsor", "", "lname", "father", "mother", "baptismal_date", "confirmation_date", "place_of_baptism", "priest", "sponsors", "remarks", "book_no", "page_no", "index_no", "status"
        };

        public Tblconfirmation_recordsModel(ListModel listmodel) {
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
            Srpt_print_confirmation.field tt = (Srpt_print_confirmation.field) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.getId();
                case 1:
                    return " " + tt.getLname() + ", " + tt.getFname() + " " + tt.getMname();
                case 2:
                    return " " + tt.getBook_no();
                case 3:
                    return " " + tt.getPage_no();
                case 4:
                    return " " + tt.getMother();
                case 5:
                    return " " + tt.getFather();
                case 6:
                    return " " + tt.getConfirmation_date();
                case 7:
                    return " " + tt.getSponsors();
                case 8:
                    return "/spires/img_dashboard/rubbish12.png";

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
                String where = " where concat(lname,space(1),fname) like '%" + jTextField2.getText() + "%' ";
                if (jCheckBox8.isSelected()) {
                    where = " where concat(fname,space(1),lname) like '%" + jTextField2.getText() + "%' ";
                }

                if (jCheckBox9.isSelected()) {
                    where = " where mother like '%" + jTextField2.getText() + "%' ";
                }
                if (jCheckBox10.isSelected()) {
                    where = " where father like '%" + jTextField2.getText() + "%' ";
                }
                where = where + " order by lname asc";

                List<Srpt_print_confirmation.field> datas = Srpt_print_confirmation.ret_data(where);
                loadData_confirmation_records(datas);

                if (!datas.isEmpty()) {
                    tbl_confirmation_records.setRowSelectionInterval(0, 0);
                    tbl_confirmation_records.grabFocus();
                }
                jLabel6.setText("" + datas.size());
                jPanel3.setVisible(false);
                jTextField2.setEnabled(true);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();
    }
//</editor-fold> 

    private void add_confirmation_records() {

        int id = 0;
        String ref_no = "";
        String date_added = "";
        String user_name = Res.getUser_id();
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String b_place = tf_place_of_baptism.getText();
        String address = "";
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String b_day = "";
        String conf_date = spires.util.DateType.sf.format(dp_confirmation.getDate());
        String gender = "";
        String book_no = tf_book_no.getText();
        int page_no = FitIn.toInt(tf_page_no.getText());
        int index_no = FitIn.toInt(tf_index_no.getText());
        String priest = tf_priest.getText();
        String sponsors = tf_sponsors.getText();
        final String remarks = tf_remarks.getText();
        String bapt_date = spires.util.DateType.sf.format(dp_baptism.getDate());
        String bapt_place = tf_place_of_baptism.getText();
        int status = 0;
        String remark = tf_remarks.getText();
        String place_of_baptism = tf_place_of_baptism.getText();
        final Srpt_print_confirmation.field to = new Srpt_print_confirmation.field(ref_no, fname, mi, lname, mother, father, book_no, "" + page_no, "" + index_no, sponsors, bapt_date, conf_date, priest, bapt_place, bapt_date, "" + id, remarks, place_of_baptism);
        Confirmation_records.add_encoding_confirmation2(to);
        clear();
        System.out.println("Record  Added!");
        data_cols();
    }

    private void clear() {
        tf_fname.setText("");
        tf_mi.setText("");
        tf_lname.setText("");
        tf_father.setText("");
        tf_mother.setText("");
        tf_place_of_baptism.setText("");
        tf_priest.setText("");
        tf_sponsors.setText("");
        tf_remarks.setText("");
        tf_book_no.setText("");
        tf_page_no.setText("");
        tf_index_no.setText("");

    }

    private void update_confirmation_records() {

        int row = tbl_confirmation_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        Srpt_print_confirmation.field to = (Srpt_print_confirmation.field) tbl_confirmation_records_ALM.get(row);
        int id = FitIn.toInt(to.getId());
        String ref_no = "";
        String date_added = "";
        String user_name = Res.getUser_id();
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String b_place = tf_place_of_baptism.getText();
        String address = "";
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String b_day = "";
        String conf_date = spires.util.DateType.sf.format(dp_confirmation.getDate());
        String gender = "";
        String book_no = tf_book_no.getText();
        int page_no = FitIn.toInt(tf_page_no.getText());
        int index_no = FitIn.toInt(tf_index_no.getText());
        String priest = tf_priest.getText();
        String sponsors = tf_sponsors.getText();
        final String remarks = tf_remarks.getText();
        String bapt_date = spires.util.DateType.sf.format(dp_baptism.getDate());
        String bapt_place = tf_place_of_baptism.getText();
        int status = 0;
        String remark = tf_remarks.getText();
        String place_of_baptism = tf_place_of_baptism.getText();
        final Srpt_print_confirmation.field to1 = new Srpt_print_confirmation.field(ref_no, fname, mi, lname, mother, father, book_no, "" + page_no, "" + index_no, sponsors, bapt_date, conf_date, priest, bapt_place, bapt_date, "" + id, remarks, place_of_baptism);
        Confirmation_records.edit_encoding_confirmation2(to1);
        clear();
        System.out.println("Record  Updated!");
        data_cols();

    }

    private void select_confirmation_records() {

        int row = tbl_confirmation_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_confirmation_records.getSelectedColumn();
        Srpt_print_confirmation.field to = (Srpt_print_confirmation.field) tbl_confirmation_records_ALM.get(row);

        tf_fname.setText(to.getFname());
        tf_mi.setText(to.getMname());
        tf_lname.setText(to.getLname());
        tf_father.setText(to.getFather());
        tf_mother.setText(to.getMother());
        try {
            Date bbaptism = DateType.slash.parse(to.getBaptism_date());
            Date bconfirmation = DateType.slash.parse(to.getConfirmation_date());
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_confirmation_records.class.getName()).log(Level.SEVERE, null, ex);
        }

        tf_priest.setText(to.getPriest());
        tf_sponsors.setText(to.getSponsors());
        tf_remarks.setText(to.getRemarks());
        tf_book_no.setText(to.getBook_no());
        tf_page_no.setText(to.getPage_no());
        tf_index_no.setText(to.getIndex_no());
        tf_place_of_baptism.setText(to.getPlace_of_baptism());
        jPanel3.setVisible(true);
        is_add = 0;
        if (col == 8) {
            delete_confirmation_records();
        }
    }

    private void delete_confirmation_records() {

        int row = tbl_confirmation_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Srpt_print_confirmation.field to = (Srpt_print_confirmation.field) tbl_confirmation_records_ALM.get(row);
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                Confirmation_records.delete_data(to);
                clear();
                System.out.println("Record  Delete!");
                data_cols();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

    }

    private void print_certificate() {

        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                String num = "";
                String day = spires.util.DateType.nth(spires.util.DateType.d.format(new Date()));
                String month = spires.util.DateType.m.format(new Date());
                String year = spires.util.DateType.y.format(new Date());

                String priest = jTextField3.getText();
                String asst_priest = jTextField5.getText();
                int add2 = FitIn.toInt(spires.util.DateType.y.format(new Date())) + 1;
                String series_of = spires.util.DateType.y.format(new Date()) + " - " + add2;

                String path = System.getProperty("img_path", "C:\\Users\\Guiness\\");
                String name = tf_fname.getText() + " " + tf_mi.getText() + " " + tf_lname.getText();
                String father = tf_father.getText();
                String mother = tf_mother.getText();
                Date d2 = dp_baptism.getDate();
                Date d3 = dp_confirmation.getDate();
                Date d4 = new Date();

                String date_of_confirmation = spires.util.DateType.month_date.format(d3);

                String book_no = "" + tf_book_no.getText();
                String page_no = "" + tf_page_no.getText();
                String confirmed_by = tf_priest.getText();
                String sponsor_name = tf_sponsors.getText();
                String place_of_birth = tf_place_of_baptism.getText();
                String date_of_birth = spires.util.DateType.month_date.format(d2);
                String img_path = System.getProperty("img_path", "C:\\Users\\Ronald\\");
                String purpose = "Purpose: " + jTextField4.getText();
                if (jTextField4.getText().isEmpty()) {
                    purpose = "";
                }
                SRpt_confirmation rpt = new SRpt_confirmation(num, day, month, year, priest, asst_priest, series_of, path, name, father, mother, date_of_confirmation, book_no, page_no, priest, sponsor_name, place_of_birth, date_of_birth, img_path, date_of_birth, place_of_birth, purpose, "");
                String jrxml = "rpt_confirmation.jrxml";
                try {
                    InputStream is = SRpt_confirmation.class.getResourceAsStream(jrxml);
                    JasperReport jasperReport;
                    jasperReport = JasperCompileManager.compileReport(is);
                    jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                            setParameter(rpt), JasperUtil.emptyDatasource());
                    JasperPrintManager.printReport(jasperPrint, false);

                } catch (JRException ex) {
                    Logger.getLogger(Dlg_confirmation_records.class.getName()).log(Level.SEVERE, null, ex);
                }
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

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
                jTextField5.setText(to.designation);
            }
        });
    }

    private void init_purpose() {

        String where = "where purpose like '%" + jTextField4.getText() + "%'";
        final List<S1_purposes.to_purposes> purpose_list = S1_purposes.ret_data(where);
        Object[][] obj = new Object[purpose_list.size()][1];
        int i = 0;
        for (S1_purposes.to_purposes to : purpose_list) {
            obj[i][0] = " " + to.purpose;
            i++;
        }
        JLabel[] labels = {};
        Dimension d = jTextField4.getSize();
        int width = d.width;
        int[] tbl_widths_customers = {width};
        String[] col_names = {"Purpose"};
        TableRenderer2 tr = new TableRenderer2();
        TableRenderer2.setPopup2(jTextField4, obj, labels, tbl_widths_customers, col_names, width);
        tr.setCallback(new TableRenderer2.Callback() {
            @Override
            public void ok(TableRenderer2.OutputData data) {
                S1_purposes.to_purposes to = purpose_list.get(data.selected_row);
                jTextField4.setText("" + to.purpose);
                jTextField2.grabFocus();
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

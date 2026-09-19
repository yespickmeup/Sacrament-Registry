/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.baptismal_records;

import spires.certificates.SRpt_baptism;
import spires.encode.S1_encoding_baptism;
import spires.printing.Srpt_print_baptism;
import spires.purposes.S1_purposes;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JasperPrint;
import spires.book_archives.Book_archives;
import spires.officials.Officials;
import spires.util.DateUtils1;
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
public class Dlg_baptismal_records extends javax.swing.JDialog {

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
    private Dlg_baptismal_records(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_baptismal_records(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_baptismal_records() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_baptismal_records myRef;

    private void setThisRef(Dlg_baptismal_records myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_baptismal_records> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_baptismal_records create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_baptismal_records create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_baptismal_records dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_baptismal_records((java.awt.Frame) parent, false);
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
            Dlg_baptismal_records dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_baptismal_records((java.awt.Dialog) parent, false);
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

        Dlg_baptismal_records dialog = Dlg_baptismal_records.create(new javax.swing.JFrame(), true);
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
        if (visible) {
            Dimension previousSize = getSize();
            getContentPane().removeAll();
            initComponents();
            myInit();
            setSize(previousSize);
        }
        super.setVisible(visible);
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
    jPanel3 = new javax.swing.JPanel();
    jScrollPane3 = new javax.swing.JScrollPane();
    tf_remarks = new javax.swing.JTextArea();
    tf_lname = new Field.Input();
    jLabel29 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    tf_mi = new Field.Input();
    jLabel10 = new javax.swing.JLabel();
    dp_bday = new com.toedter.calendar.JDateChooser();
    jLabel16 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    tf_father = new Field.Input();
    jLabel13 = new javax.swing.JLabel();
    dp_baptism = new com.toedter.calendar.JDateChooser();
    tf_index_no = new Field.Input();
    jLabel15 = new javax.swing.JLabel();
    tf_mother = new Field.Input();
    jLabel14 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    tf_page_no = new Field.Input();
    jLabel20 = new javax.swing.JLabel();
    tf_book_no = new Field.Input();
    jLabel19 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tf_sponsors = new javax.swing.JTextArea();
    tf_priest = new Field.Combo();
    jLabel18 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    tf_place_of_birth = new Field.Input();
    tf_fname = new Field.Input();
    jLabel17 = new javax.swing.JLabel();
    jButton3 = new Button.Info();
    jButton2 = new Button.Success();
    jButton4 = new Button.Default();
    tf_place_of_baptism = new Field.Input();
    jLabel23 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    tf_priest1 = new Field.Combo();
    jLabel26 = new javax.swing.JLabel();
    tf_series = new Field.Input();
    tf_address_of_parents = new Field.Input();
    jLabel27 = new javax.swing.JLabel();
    jLabel28 = new javax.swing.JLabel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jPanel4 = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tbl_baptismal_records = new javax.swing.JTable();
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
    jLabel2 = new Label.Separator();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jProgressBar1 = new javax.swing.JProgressBar();
    jLabel22 = new javax.swing.JLabel();
    jButton1 = new Button.Default();
    jLabel24 = new javax.swing.JLabel();
    jTextField5 = new Field.Input();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

    tf_remarks.setColumns(20);
    tf_remarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_remarks.setLineWrap(true);
    tf_remarks.setRows(5);
    jScrollPane3.setViewportView(tf_remarks);

    tf_lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel29.setText("Remarks:");

    jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel11.setText("Last Name:");

    tf_mi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel10.setText("M.I:");

    dp_bday.setDate(new Date());
    dp_bday.setDateFormatString("MM dd, yyyy");
    dp_bday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel16.setText("Birth Date:");

    jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel12.setText("Father:");

    tf_father.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel13.setText("Mother:");

    dp_baptism.setDate(new Date());
    dp_baptism.setDateFormatString("MM dd, yyyy");
    dp_baptism.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    tf_index_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel15.setText("Place of Birth:");

    tf_mother.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel14.setText("Baptism:");

    jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel21.setText("Index No:");

    tf_page_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel20.setText("Page No:");

    tf_book_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_book_no.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_book_noActionPerformed(evt);
      }
    });

    jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel19.setText("Book No:");

    tf_sponsors.setColumns(20);
    tf_sponsors.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_sponsors.setLineWrap(true);
    tf_sponsors.setRows(5);
    jScrollPane1.setViewportView(tf_sponsors);

    tf_priest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_priest.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_priestActionPerformed(evt);
      }
    });

    jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel18.setText("Sponsors:");

    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel9.setText("First Name:");

    tf_place_of_birth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    tf_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel17.setText("Minister of Baptism:");

    jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_dashboard/paper6.png"))); // NOI18N
    jButton3.setText("Print Preview");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
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

    jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_dashboard/direction102 (2).png"))); // NOI18N
    jButton4.setText("Back");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    tf_place_of_baptism.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel23.setText("Place of Baptism:");

    jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel25.setText("Parish Priest:");

    tf_priest1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tf_priest1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tf_priest1ActionPerformed(evt);
      }
    });

    jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel26.setText("Series:");

    tf_series.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    tf_address_of_parents.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

    jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel27.setText("Address of Parents:");

    jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel28.setText("Layout:");

    buttonGroup2.add(jRadioButton1);
    jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jRadioButton1.setSelected(true);
    jRadioButton1.setText("New");

    buttonGroup2.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jRadioButton2.setText("Old");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(216, 216, 216))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(tf_address_of_parents, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tf_priest1)
              .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(tf_place_of_baptism)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(104, 104, 104))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(216, 216, 216))
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
                  .addComponent(tf_mother, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                  .addComponent(tf_lname)
                  .addComponent(tf_mi)
                  .addComponent(tf_fname)
                  .addComponent(tf_father)
                  .addComponent(dp_bday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(dp_baptism, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(206, 206, 206))
              .addComponent(tf_priest, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tf_place_of_birth)
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(206, 206, 206))
              .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1)
              .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(tf_book_no)
                      .addComponent(tf_index_no)))
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                    .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tf_page_no, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tf_series, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGap(25, 25, 25))))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(10, 10, 10)
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
          .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(dp_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(dp_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(1, 1, 1)
        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addComponent(tf_place_of_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(2, 2, 2)
        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addComponent(tf_address_of_parents, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(2, 2, 2)
        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(tf_place_of_baptism, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(tf_priest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addComponent(tf_priest1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(1, 1, 1)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(tf_book_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_series, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(1, 1, 1)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(tf_index_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tf_page_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(5, 5, 5)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(5, 5, 5)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel28)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jRadioButton1)
              .addComponent(jRadioButton2))))
        .addContainerGap())
    );

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));

    tbl_baptismal_records.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    tbl_baptismal_records.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_baptismal_recordsMouseClicked(evt);
      }
    });
    jScrollPane2.setViewportView(tbl_baptismal_records);

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

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel5.setText("Total No. of Records");

    jLabel6.setText("0");

    jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
    jProgressBar1.setString("");
    jProgressBar1.setStringPainted(true);

    jLabel22.setText("Status:");

    jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spires/img_dashboard/refresh57.png"))); // NOI18N
    jButton1.setText("New");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel24.setText("Designation:");

    jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jTextField5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField5ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel22)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addGap(10, 10, 10)
            .addComponent(jCheckBox7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jCheckBox8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jCheckBox10)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5))
              .addComponent(jTextField2)
              .addComponent(jTextField4))))
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
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel24)
          .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel5)
            .addComponent(jLabel6)
            .addComponent(jLabel22))
          .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(11, 11, 11))
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

    private void tf_book_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_noActionPerformed
        search_series();
    }//GEN-LAST:event_tf_book_noActionPerformed

    private void tf_priestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priestActionPerformed
        init_priest2(tf_priest);
    }//GEN-LAST:event_tf_priestActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        is_add = 1;
        jPanel3.setVisible(true);
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel3.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (is_add == 1) {
            add_baptismal_records();
        } else {
            update_baptismal_records();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_baptismal_recordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_baptismal_recordsMouseClicked
        select_baptismal_records();
    }//GEN-LAST:event_tbl_baptismal_recordsMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        print_certificate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void tf_priest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priest1ActionPerformed
        init_priest2(tf_priest1);
    }//GEN-LAST:event_tf_priest1ActionPerformed

    /**
     * @param args the command line arguments
     */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.ButtonGroup buttonGroup2;
  private com.toedter.calendar.JDateChooser dp_baptism;
  private com.toedter.calendar.JDateChooser dp_bday;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JCheckBox jCheckBox10;
  private javax.swing.JCheckBox jCheckBox7;
  private javax.swing.JCheckBox jCheckBox8;
  private javax.swing.JCheckBox jCheckBox9;
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
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JTextField jTextField3;
  private javax.swing.JTextField jTextField4;
  private javax.swing.JTextField jTextField5;
  private javax.swing.JTable tbl_baptismal_records;
  private javax.swing.JTextField tf_address_of_parents;
  private javax.swing.JTextField tf_book_no;
  private javax.swing.JTextField tf_father;
  private javax.swing.JTextField tf_fname;
  private javax.swing.JTextField tf_index_no;
  private javax.swing.JTextField tf_lname;
  private javax.swing.JTextField tf_mi;
  private javax.swing.JTextField tf_mother;
  private javax.swing.JTextField tf_page_no;
  private javax.swing.JTextField tf_place_of_baptism;
  private javax.swing.JTextField tf_place_of_birth;
  private javax.swing.JTextField tf_priest;
  private javax.swing.JTextField tf_priest1;
  private javax.swing.JTextArea tf_remarks;
  private javax.swing.JTextField tf_series;
  private javax.swing.JTextArea tf_sponsors;
  // End of variables declaration//GEN-END:variables

    private void myInit() {

        System.setProperty("print_baptism", "bacong");
        System.setProperty("mydb", "db_spires_bacong");

        jPanel3.setVisible(false);
        init_tbl_baptismal_records(tbl_baptismal_records);
        String address = System.getProperty("address", "Negros Oriental");
        tf_place_of_baptism.setText(address);
        initFrontDeskActions();
        init_key();
    }

    private static final Color PAGE_COLOR = new Color(243, 246, 250);
    private static final Color INK_COLOR = new Color(35, 49, 66);

    private void initFrontDeskActions() {
        jRadioButton1.setText("A4 certificate");
        jRadioButton2.setText("Legacy");
        jButton3.setText("Preview certificate...");
        jButton3.setToolTipText("Preview the selected record and choose how to print it");
        jButton4.setText("Close details");
        jTextField3.setToolTipText("Signing priest. Press Enter to choose an official.");
        jTextField5.setToolTipText("Designation of the signing priest");
        jTextField2.setToolTipText("Search records by the selected field, then press Enter");

        JPanel page = new JPanel(new BorderLayout(0, 16));
        page.setBackground(PAGE_COLOR);
        page.setBorder(BorderFactory.createEmptyBorder(18, 20, 18, 20));

        JPanel heading = new JPanel(new BorderLayout());
        heading.setOpaque(false);
        JLabel title = new JLabel("Baptismal records");
        title.setForeground(INK_COLOR);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        heading.add(title, BorderLayout.NORTH);
        JLabel subtitle = new JLabel("Search a record, prepare the blank certificate, then print details after signing.");
        subtitle.setForeground(new Color(90, 102, 116));
        heading.add(subtitle, BorderLayout.SOUTH);
        JButton close = new JButton("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });
        heading.add(close, BorderLayout.EAST);
        page.add(heading, BorderLayout.NORTH);

        JPanel left = new JPanel(new BorderLayout(0, 14));
        left.setOpaque(false);
        left.add(buildSearchAndCertificateCard(), BorderLayout.NORTH);
        left.add(buildRecordsCard(), BorderLayout.CENTER);

        rebuildRecordEditor();
        jPanel3.setPreferredSize(new Dimension(440, 600));
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
        card.add(sectionTitle("Find a baptismal record"));
        card.add(Box.createVerticalStrut(8));

        JPanel filters = new JPanel(new FlowLayout(FlowLayout.LEFT, 12, 0));
        filters.setOpaque(false);
        filters.setAlignmentX(LEFT_ALIGNMENT);
        filters.add(jLabel3);
        filters.add(jCheckBox7);
        filters.add(jCheckBox8);
        filters.add(jCheckBox9);
        filters.add(jCheckBox10);
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
        card.add(Box.createVerticalStrut(8));
        card.add(fieldBlock("Purpose (for the completed certificate)", jTextField4));
        card.add(Box.createVerticalStrut(10));

        JPanel actions = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        actions.setOpaque(false);
        actions.setAlignmentX(LEFT_ALIGNMENT);
        JButton preprint = new JButton("Pre-print blank certificate...");
        preprint.setToolTipText("Uses the signing priest above; no parishioner record is needed");
        preprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent event) {
                preview_blank_certificate();
            }
        });
        actions.add(preprint);
        JLabel hint = new JLabel("  A4 form + priest name; parishioner fields stay blank");
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
        top.add(jButton1, BorderLayout.EAST);
        card.add(top, BorderLayout.NORTH);
        card.add(jScrollPane2, BorderLayout.CENTER);

        JPanel footer = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        footer.setOpaque(false);
        footer.add(jLabel5);
        footer.add(jLabel6);
        footer.add(jLabel22);
        footer.add(jProgressBar1);
        card.add(footer, BorderLayout.SOUTH);
        return card;
    }

    private void rebuildRecordEditor() {
        JPanel fields = card();
        fields.setLayout(new BoxLayout(fields, BoxLayout.Y_AXIS));
        fields.add(sectionTitle("Selected record"));
        fields.add(Box.createVerticalStrut(12));
        fields.add(formRow(fieldBlock("First name", tf_fname), fieldBlock("Middle initial", tf_mi), fieldBlock("Last name", tf_lname)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Birth date", dp_bday), fieldBlock("Place of birth", tf_place_of_birth)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Father", tf_father), fieldBlock("Mother", tf_mother)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(fieldBlock("Address of parents", tf_address_of_parents));
        fields.add(Box.createVerticalStrut(16));
        fields.add(sectionTitle("Baptism details"));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Baptism date", dp_baptism), fieldBlock("Place of baptism", tf_place_of_baptism)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Minister of baptism", tf_priest), fieldBlock("Priest recorded in book", tf_priest1)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(fieldBlock("Sponsors", jScrollPane1));
        fields.add(Box.createVerticalStrut(16));
        fields.add(sectionTitle("Registry reference"));
        fields.add(Box.createVerticalStrut(10));
        fields.add(formRow(fieldBlock("Book", tf_book_no), fieldBlock("Page", tf_page_no), fieldBlock("Entry", tf_index_no)));
        fields.add(Box.createVerticalStrut(10));
        fields.add(fieldBlock("Series", tf_series));
        fields.add(Box.createVerticalStrut(10));
        fields.add(fieldBlock("Remarks", jScrollPane3));
        fields.add(Box.createVerticalStrut(8));

        JPanel actions = card();
        actions.setLayout(new BoxLayout(actions, BoxLayout.Y_AXIS));
        actions.add(sectionTitle("Certificate layout"));
        JPanel choices = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 4));
        choices.setOpaque(false);
        choices.setAlignmentX(LEFT_ALIGNMENT);
        choices.add(jRadioButton1);
        choices.add(jRadioButton2);
        actions.add(choices);
        actions.add(Box.createVerticalStrut(8));
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        buttons.setOpaque(false);
        buttons.setAlignmentX(LEFT_ALIGNMENT);
        buttons.add(jButton3);
        buttons.add(jButton2);
        buttons.add(jButton4);
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
        for (JPanel block : blocks) {
            row.add(block);
        }
        return row;
    }

    private void preview_blank_certificate() {
        String priest = jTextField3.getText().trim();
        if (priest.length() == 0) {
            JOptionPane.showMessageDialog(this, "Choose the signing priest in the Priest field first.",
                    "Signing priest required", JOptionPane.INFORMATION_MESSAGE);
            jTextField3.requestFocusInWindow();
            return;
        }
        Dlg_preview_baptismal_certificate preview =
                Dlg_preview_baptismal_certificate.create(this, true);
        preview.do_pass_preprint(priest);
        preview.setLocationRelativeTo(this);
        preview.setVisible(true);
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

        tbl_baptismal_records.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    select_baptismal_records();
                }
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" baptismal_records "> 
    public static ArrayListModel tbl_baptismal_records_ALM;
    public static Tblbaptismal_recordsModel tbl_baptismal_records_M;

    public static void init_tbl_baptismal_records(JTable tbl_baptismal_records) {
        tbl_baptismal_records_ALM = new ArrayListModel();
        tbl_baptismal_records_M = new Tblbaptismal_recordsModel(tbl_baptismal_records_ALM);
        tbl_baptismal_records.setModel(tbl_baptismal_records_M);
        tbl_baptismal_records.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_baptismal_records.setRowHeight(25);
        int[] tbl_widths_baptismal_records = {50, 180, 50, 50, 150, 150, 75, 150, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_baptismal_records.length; i < n; i++) {
            if (i == 7) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_baptismal_records, i, tbl_widths_baptismal_records[i]);
        }
        Dimension d = tbl_baptismal_records.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_baptismal_records.getTableHeader().setPreferredSize(d);
        tbl_baptismal_records.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_baptismal_records.setRowHeight(25);
        tbl_baptismal_records.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_baptismal_records.getColumnModel().getColumn(8).setCellRenderer(new ImageRenderer());
    }

    public static void loadData_baptismal_records(List<Srpt_print_baptism.field> acc) {
        tbl_baptismal_records_ALM.clear();
        tbl_baptismal_records_ALM.addAll(acc);
    }

    public static class Tblbaptismal_recordsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID", "Name", "Book #", "Page #", "Mother", "Father", "Baptism", "Sponsor", "", "lname", "father", "mother", "bday", "baptismal_date", "place_of_birth", "priest", "sponsors", "remarks", "book_no", "page_no", "index_no", "status"
        };

        public Tblbaptismal_recordsModel(ListModel listmodel) {
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
            Srpt_print_baptism.field tt = (Srpt_print_baptism.field) getRow(row);
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
                    return " " + tt.getBaptism_date();
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
                System.out.println(where);
                List<Srpt_print_baptism.field> datas = Srpt_print_baptism.ret_data(where);
                loadData_baptismal_records(datas);
                if (!datas.isEmpty()) {
                    tbl_baptismal_records.setRowSelectionInterval(0, 0);
                    tbl_baptismal_records.grabFocus();
                }
                jLabel6.setText("" + datas.size());

//                jPanel3.setVisible(false);
                jTextField2.setEnabled(true);
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }
//</editor-fold> 

    private void add_baptismal_records() {
        int id = 0;
        String ref_no = "";
        String date_added = spires.util.DateType.datetime.format(new Date());
        String user_name = "";
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String b_place = tf_place_of_birth.getText();
        String address = "";
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String b_day = spires.util.DateType.sf.format(dp_bday.getDate());;
        String conf_date = spires.util.DateType.sf.format(dp_baptism.getDate());
        String gender = "";
        String book_no = tf_book_no.getText();
        int page_no = FitIn.toInt(tf_page_no.getText());
        int index_no = FitIn.toInt(tf_index_no.getText());
        String priest = tf_priest.getText();
        String sponsors = tf_sponsors.getText();
        String remarks = tf_remarks.getText();
        String bapt_date = spires.util.DateType.sf.format(dp_baptism.getDate());
        String bapt_place = tf_place_of_baptism.getText();
        int status = 0;
        String place_of_baptism = tf_place_of_baptism.getText();
        String parish_priest = tf_priest1.getText();
        final Srpt_print_baptism.field to = new Srpt_print_baptism.field(ref_no, fname, mi, lname, mother, father, book_no, "" + page_no, "" + index_no, sponsors, bapt_date, conf_date, priest, b_place, b_day, "" + id, remarks, place_of_baptism, parish_priest);

        S1_encoding_baptism.add_parishioners_1(to);

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
        tf_place_of_birth.setText("");
        tf_place_of_baptism.setText("");
        tf_priest.setText("");
        tf_sponsors.setText("");
        tf_remarks.setText("");
        tf_book_no.setText("");
        tf_page_no.setText("");
        tf_index_no.setText("");
    }

    private void select_baptismal_records() {

        int row = tbl_baptismal_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_baptismal_records.getSelectedColumn();

        Srpt_print_baptism.field to = (Srpt_print_baptism.field) tbl_baptismal_records_ALM.get(row);
        tf_fname.setText(to.getFname());
        tf_mi.setText(to.getMname());
        tf_lname.setText(to.getLname());
        tf_father.setText(to.getFather());
        tf_mother.setText(to.getMother());
        try {
            Date bday = DateType.slash.parse(to.getDate_of_birth());
            Date bbaptism = DateType.slash.parse(to.getBaptism_date());
            dp_bday.setDate(bday);
            dp_baptism.setDate(bbaptism);

        } catch (ParseException ex) {
            Logger.getLogger(Dlg_baptismal_records.class.getName()).log(Level.SEVERE, null, ex);
        }

        tf_place_of_birth.setText(to.getPlace_of_birth());
        tf_place_of_baptism.setText(to.getPlace_of_baptism());
        tf_priest.setText(to.getPriest());

        tf_priest1.setText(to.getParish_priest());
        tf_sponsors.setText(to.getSponsors());
        tf_remarks.setText(to.getRemarks());
        tf_book_no.setText(to.getBook_no());
        tf_page_no.setText(to.getPage_no());
        tf_index_no.setText(to.getIndex_no());
        search_series();
        jPanel3.setVisible(true);
        is_add = 0;
        if (col == 8) {
            delete_baptismal_records();
        }
    }

    private void update_baptismal_records() {

        int row = tbl_baptismal_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        Srpt_print_baptism.field to = (Srpt_print_baptism.field) tbl_baptismal_records_ALM.get(row);
        int id = FitIn.toInt(to.getId());
        String ref_no = "";
        String date_added = "";
        String user_name = "";
        String fname = tf_fname.getText();
        String mi = tf_mi.getText();
        String lname = tf_lname.getText();
        String b_place = tf_place_of_birth.getText();
        String address = "";
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        String b_day = spires.util.DateType.sf.format(dp_bday.getDate());;
        String conf_date = spires.util.DateType.sf.format(dp_baptism.getDate());
        String gender = "";
        String book_no = tf_book_no.getText();
        int page_no = FitIn.toInt(tf_page_no.getText());
        int index_no = FitIn.toInt(tf_index_no.getText());
        String priest = tf_priest.getText();
        String sponsors = tf_sponsors.getText();
        String remarks = tf_remarks.getText();
        String bapt_date = spires.util.DateType.sf.format(dp_baptism.getDate());
        String bapt_place = tf_place_of_baptism.getText();
        int status = 0;
        String place_of_baptism = tf_place_of_baptism.getText();
        String parish_priest = tf_priest1.getText();
        final Srpt_print_baptism.field to1 = new Srpt_print_baptism.field(ref_no, fname, mi, lname, mother, father, book_no, "" + page_no, "" + index_no, sponsors, bapt_date, conf_date, priest, b_place, b_day, "" + id, remarks, place_of_baptism, parish_priest);
        S1_encoding_baptism.update_data(to1);

        System.out.println("Record  Updated!");
        data_cols();
    }

    private void delete_baptismal_records() {
        int row = tbl_baptismal_records.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Srpt_print_baptism.field to = (Srpt_print_baptism.field) tbl_baptismal_records_ALM.get(row);
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                Baptismal_records.delete_data(to);
                clear();
                System.out.println("Record  Deleted!");
                data_cols();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void print_certificate() {
        if (jRadioButton1.isSelected() && jTextField3.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Choose the signing priest in Certificate preparation before previewing.",
                    "Signing priest required", JOptionPane.INFORMATION_MESSAGE);
            jTextField3.requestFocusInWindow();
            return;
        }
        if (dp_baptism.getDate() == null || dp_bday.getDate() == null) {
            JOptionPane.showMessageDialog(this,
                    "Select a record with both birth and baptism dates before previewing.",
                    "Certificate dates required", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (tf_fname.getText().trim().length() == 0 || tf_lname.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Select a parishioner record before previewing the certificate.",
                    "Parishioner required", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String num = "";
        String day = DateUtils1.formatFormalDate(new Date()) +"."; //DateType.month_date.format(new Date());
        String month = spires.util.DateType.m.format(new Date());
        String year = spires.util.DateType.y.format(new Date());
        String priest = jTextField3.getText();
        String asst_priest = jTextField5.getText();
        int add2 = FitIn.toInt(spires.util.DateType.y.format(new Date())) + 1;
        String series_of = spires.util.DateType.y.format(new Date()) + " - " + add2;
        String path = "path";
        String name = (tf_fname.getText() + " " + tf_mi.getText() + " "
                + tf_lname.getText()).trim().replaceAll("\\s+", " ");
        String father = tf_father.getText();
        String mother = tf_mother.getText();
        Date d2 = dp_baptism.getDate();
        Date d4 = dp_bday.getDate();
        String date_of_confirmation = spires.util.DateType.month_date.format(d2);
        String book_no = "" + tf_book_no.getText();
        String page_no = "" + tf_page_no.getText();
        String confirmed_by = tf_index_no.getText();
        String sponsor_name = tf_sponsors.getText();
        String place_of_birth = tf_place_of_birth.getText();
        String date_of_birth = spires.util.DateType.month_date.format(d4);
        String img_path = System.getProperty("img_path", "C:\\Users\\User\\spires\\");
        String purpose = "";
        if (!jTextField4.getText().isEmpty()) {
            purpose = "" + jTextField4.getText();
        }
        String place_of_baptism = tf_place_of_baptism.getText();
        String parish_priest = jRadioButton1.isSelected()
                ? jTextField3.getText().trim() : tf_priest1.getText();
        String jrxml = "rpt_baptism_new.jrxml";
        String cert = System.getProperty("print_baptism", "Default");
        if (cert.equalsIgnoreCase("bacong")) {
            jrxml = "rpt_baptism_bacong.jrxml";
        } else {
            day = spires.util.DateType.nth(spires.util.DateType.d.format(new Date()));
            purpose = "Purpose: " + purpose;
        }

        String mydb = System.getProperty("mydb", "db_spires_dauin");
        if (mydb.equalsIgnoreCase("db_spires_dauin")) {
            jrxml = "rpt_baptism_dauin.jrxml";
        }
        
        if(jRadioButton1.isSelected()){
          jrxml = "rpt_baptism_certificate_2025.jrxml";
        } 
        path = img_path;
        
        String name_of_church = System.getProperty("name_of_church",
                jRadioButton1.isSelected() ? "Saint Augustine of Hippo Parish"
                : "SAINT NICHOLAS OF TOLENTINO PARISH");
        String church_address = System.getProperty("church_address",
                jRadioButton1.isSelected() ? "West Poblacion, Bacong, Negros Oriental"
                : "Dauin, Negros Oriental");
        String notation = jTextField4.getText();
        String book_series = tf_series.getText();
        String address_of_parents = tf_address_of_parents.getText();
        SRpt_baptism rpt = new SRpt_baptism(num, day, month, year, priest, asst_priest, series_of, path,
                                            name, father, mother, place_of_birth, date_of_birth, date_of_confirmation, "",
                                            tf_priest.getText(), book_no, page_no, sponsor_name, tf_index_no.getText(), purpose,
                                            img_path, place_of_baptism, parish_priest, name_of_church, church_address, notation, book_series, address_of_parents);
//                try {
//
//                    InputStream is = SRpt_baptism.class.getResourceAsStream(jrxml);
//                    JasperReport jasperReport;
//                    jasperReport = JasperCompileManager.compileReport(is);
//                    jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
//                            setParameter(rpt), JasperUtil.emptyDatasource());
//                    JasperPrintManager.printReport(jasperPrint, false);
//
//                } catch (JRException ex) {
//                    Logger.getLogger(Dlg_baptismal_records.class.getName()).log(Level.SEVERE, null, ex);
//                }
        preview_baptismal_records(rpt, jrxml);

    }

    private void preview_baptismal_records(SRpt_baptism rpt, String jrxml) {
        Window p = (Window) this;
        Dlg_preview_baptismal_certificate nd = Dlg_preview_baptismal_certificate.create(p, true);
        nd.setTitle("");
        nd.do_pass(rpt, jrxml);
        nd.setCallback(new Dlg_preview_baptismal_certificate.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_preview_baptismal_certificate.OutputData data) {
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

    private void init_priest2(final JTextField tf) {
        String where = " where name like '%" + tf.getText() + "%' order by name asc";
        final List<Officials.to_officials> officials = Officials.retData(where);
        Object[][] obj = new Object[officials.size()][1];
        int i = 0;
        for (Officials.to_officials to : officials) {
            obj[i][0] = " " + to.name;
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
                Officials.to_officials to = officials.get(data.selected_row);
                tf.setText(to.name);

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

    private void search_series() {
        List<Book_archives.to_book_archives> archives = Book_archives.ret_data(" where book_no like '" + tf_book_no.getText() + "' ");
        if (!archives.isEmpty()) {
            Book_archives.to_book_archives book = (Book_archives.to_book_archives) archives.get(0);
            tf_series.setText(book.years);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.touchscreen;

import spires.cashiering.Dlg_cashiering;
import spires.cashiering.S1_cashiering;
import spires.cashiering.S1_cashiering.to_cashiering;
import spires.cashiering.S2_cashiering;
import spires.disbursements.Dlg_disbursements;
import spires.my_parishioners.My_parishioners;

import spires.receipts.S1_receipts;
import spires.reports.Dlg_cashiering_reports;

import spires.util.Alert;
import spires.util.DateType;
import spires.util.DateUtils1;
import spires.util.Focus_Fire;
import spires.util.MyBorder;
import spires.util.MyDate;
import spires.util.TableRenderer3;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.DigitToWord;
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
import spires.cash_drawer.Dlg_cashout;
import spires.pnl.Dashboard;
import spires.users.Res;
import spires.users.S1_user_previleges;

/**
 *
 * @author Ronald
 */
public class Dlg_touchscreen extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_touchscreen
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
    private Dlg_touchscreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_touchscreen(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_touchscreen() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_touchscreen myRef;

    private void setThisRef(Dlg_touchscreen myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_touchscreen> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_touchscreen create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_touchscreen create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_touchscreen dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_touchscreen((java.awt.Frame) parent, false);
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
            Dlg_touchscreen dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_touchscreen((java.awt.Dialog) parent, false);
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

        Dlg_touchscreen dialog = Dlg_touchscreen.create(new javax.swing.JFrame(), true);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cashiering = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tf_date = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf_contact = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tf_or_no = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tf_time = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_message = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 130, 40));

        jPanel2.setBackground(new java.awt.Color(251, 145, 63));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 130, 40)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tbl_cashiering.setBackground(new java.awt.Color(247, 130, 40));
        tbl_cashiering.setForeground(new java.awt.Color(255, 255, 255));
        tbl_cashiering.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_cashiering.setFocusable(false);
        tbl_cashiering.setGridColor(new java.awt.Color(247, 130, 40));
        tbl_cashiering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cashieringMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cashiering);

        jLabel3.setBackground(new java.awt.Color(247, 130, 40));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("v");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(247, 130, 40));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("^");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1)
                .addGap(1, 1, 1)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(251, 145, 63));

        jPanel5.setBackground(new java.awt.Color(247, 130, 40));
        jPanel5.setLayout(new java.awt.CardLayout());

        jPanel6.setOpaque(false);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Date ");

        tf_date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_date.setForeground(new java.awt.Color(247, 130, 40));
        tf_date.setBorder(null);
        tf_date.setFocusable(false);
        tf_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_dateMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(247, 130, 40));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(">");
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Name:");

        tf_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_name.setForeground(new java.awt.Color(247, 130, 40));
        tf_name.setBorder(null);
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/name.png"))); // NOI18N
        jLabel25.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Contact #:");

        tf_contact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_contact.setForeground(new java.awt.Color(247, 130, 40));
        tf_contact.setBorder(null);
        tf_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contactActionPerformed(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/61 (Custom).png"))); // NOI18N
        jLabel26.setOpaque(true);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("OR #:");

        tf_or_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_or_no.setForeground(new java.awt.Color(247, 130, 40));
        tf_or_no.setBorder(null);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/197 (Custom).png"))); // NOI18N
        jLabel28.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(247, 130, 40));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/PRINTER_32x32-32.png"))); // NOI18N
        jLabel8.setText("Payment");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 145, 63)));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setOpaque(false);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 145, 63)));

        jTable1.setBackground(new java.awt.Color(51, 153, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(251, 145, 63));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Transactions");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Levenim MT", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("No of Trans:");

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Levenim MT", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("0");

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(247, 130, 40));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("<");
        jLabel32.setOpaque(true);
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_or_no))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_date)
                                        .addGap(46, 46, 46)))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_name)
                                            .addComponent(tf_contact))))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_or_no, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.add(jPanel6, "card2");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("  Time");

        tf_time.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_time.setForeground(new java.awt.Color(247, 130, 40));
        tf_time.setBorder(null);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tf_message.setColumns(20);
        tf_message.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_message.setForeground(new java.awt.Color(247, 130, 40));
        tf_message.setLineWrap(true);
        tf_message.setRows(5);
        tf_message.setBorder(null);
        jScrollPane2.setViewportView(tf_message);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("  Message:");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/time.png"))); // NOI18N
        jLabel23.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/message.png"))); // NOI18N
        jLabel24.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_time)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7, "card3");

        jLabel7.setBackground(new java.awt.Color(247, 130, 40));
        jLabel7.setFont(new java.awt.Font("Levenim MT", 0, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SR/icons/BOOK_48x48-32.png"))); // NOI18N
        jLabel7.setText("Thanks Giving");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setOpaque(true);

        jPanel8.setBackground(new java.awt.Color(247, 130, 40));

        jLabel10.setBackground(new java.awt.Color(247, 130, 40));
        jLabel10.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("  Logout");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(247, 130, 40));
        jLabel11.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("  Standby");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(247, 130, 40));
        jLabel12.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("    Reports");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(247, 130, 40));
        jLabel13.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("  Rates");
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(247, 130, 40));
        jLabel15.setFont(new java.awt.Font("Levenim MT", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("  Disbursements");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setBackground(new java.awt.Color(247, 130, 40));
        jLabel9.setFont(new java.awt.Font("Levenim MT", 0, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("0.00");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(247, 130, 40));

        jLabel2.setFont(new java.awt.Font("Levenim MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Alexandria Parish");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Levenim MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("St. Catherine of");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome!");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int height = tbl_cashiering.getRowHeight() * (10 - 1);
        JScrollBar bar = jScrollPane1.getVerticalScrollBar();
        bar.setValue(bar.getValue() + height);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int height = tbl_cashiering.getRowHeight() * (10 - 1);
        JScrollBar bar = jScrollPane1.getVerticalScrollBar();
        bar.setValue(bar.getValue() - height);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        payment();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void tbl_cashieringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cashieringMouseClicked
        select_type();
    }//GEN-LAST:event_tbl_cashieringMouseClicked

    private void tf_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_dateMouseClicked
//        calendar();
    }//GEN-LAST:event_tf_dateMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        rates();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        reports();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        disbursment();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        init_manager();
    }//GEN-LAST:event_tf_nameActionPerformed

    private void tf_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contactActionPerformed
        add_parishioner();
    }//GEN-LAST:event_tf_contactActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
        Dashboard d = new Dashboard();
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        delete_transaction();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        setDate();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        setDate2();
    }//GEN-LAST:event_jLabel32MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbl_cashiering;
    private javax.swing.JTextField tf_contact;
    private javax.swing.JTextField tf_date;
    private javax.swing.JTextArea tf_message;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_or_no;
    private javax.swing.JTextField tf_time;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_cashiering();
        data_cols2();
        hover();
        time();
        border();
        focus();
        init_or();
        set_date();
        dis(false);

        jLabel19.setVisible(false);
//        tf_time.setVisible(false);
        jLabel23.setVisible(false);
        jLabel20.setVisible(false);
        jScrollPane2.setVisible(false);
        jLabel24.setVisible(false);
//        jLabel14.setVisible(false);
        init_tbl_cashiering2();
    }

    private void set_date() {
        String date = DateType.month_date.format(new Date());
        tf_date.setText(date);
    }

    private void init_or() {
        tf_or_no.setText(S1_receipts.increment_id());
    }

    private void border() {
        MyBorder.setBorder(jLabel7);
        MyBorder.setBorder(tf_date);
        MyBorder.setBorder(tf_time);

        MyBorder.setBorder(tf_message);
        MyBorder.setBorder(tf_name);
        MyBorder.setBorder(tf_contact);
        MyBorder.setBorder(tf_or_no);
    }

    private void focus() {
        JTextField[] tf = {tf_date, tf_time, tf_name, tf_contact, tf_or_no};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
        JTextArea[] tf2 = {tf_message};
        Focus_Fire.onFocus_lostFocus(tf2);
        Focus_Fire.select_all(tf2);

    }

    private void time() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Timer ti = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Calendar currentCalendar = Calendar.getInstance();
                        Date currentTime = currentCalendar.getTime();
                        String s = Res.getUser_screename();
                        if (s == null) {
                            s = "";
                        }
                        jLabel6.setText(DateType.slash2.format(currentTime));
                        if (jLabel6.getText().endsWith("PM")) {

                            jLabel5.setText("Good Afternoon, " + s);
                        } else {
                            jLabel5.setText("Good Morning, " + s);
                        }

                    }
                });
                ti.start();
            }
        });
        t.start();
    }

    private void hover() {
        JLabel[] lbl = {jLabel4, jLabel3, jLabel8, jLabel12, jLabel1, jLabel11, jLabel10, jLabel15, jLabel13};

        for (final JLabel l : lbl) {
            l.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    l.setBackground(new java.awt.Color(247, 130, 40));
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    l.setBackground(new java.awt.Color(51, 153, 255));
                }

            });
        }
    }

    public void do_pass() {

    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        String where = " where user_id='" + Res.getUser_id() + "' and previledge='" + "Cashiering" + "'";
        List<S1_user_previleges.to_user_previleges> datas = S1_user_previleges.ret_data(where);
        if (!datas.isEmpty()) {
            Window p = (Window) this;
            Dlg_cashout nd = Dlg_cashout.create(p, true);
            nd.setTitle("");
            nd.do_pass();
            nd.setCallback(new Dlg_cashout.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_cashout.OutputData data) {
                    closeDialog.ok();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
//        if (Res..equals("2")) {
//           
//        } else {
//            this.dispose();
//        }
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                disposed();
            }
        });
        tf_message.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    tf_name.grabFocus();
                    e.consume();
                }
            }

        });

    }
    // </editor-fold>

    private ArrayListModel tbl_cashiering_ALM;
    private TblcashieringModel tbl_cashiering_M;

    private void init_tbl_cashiering() {
        tbl_cashiering_ALM = new ArrayListModel();
        tbl_cashiering_M = new TblcashieringModel(tbl_cashiering_ALM);
        tbl_cashiering.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_cashiering.setModel(tbl_cashiering_M);
        tbl_cashiering.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_cashiering.setRowHeight(25);
        int[] tbl_widths_cashiering = {100, 100, 0, 0};
        for (int i = 0, n = tbl_widths_cashiering.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_cashiering, i, tbl_widths_cashiering[i]);
        }
        Dimension d = tbl_cashiering.getTableHeader().getPreferredSize();
        d.height = 0;
        tbl_cashiering.getTableHeader().setPreferredSize(d);
        tbl_cashiering.getTableHeader().setFont(new java.awt.Font("Levenim MT", 0, 36));
        tbl_cashiering.setRowHeight(50);
        tbl_cashiering.setFont(new java.awt.Font("Levenim MT", 0, 20));

        Color ivory = new Color(247, 130, 40);
        tbl_cashiering.setOpaque(true);
        tbl_cashiering.setFillsViewportHeight(true);
        tbl_cashiering.setBackground(ivory);
        TableWidthUtilities.setColumnRightRenderer(tbl_cashiering, 1);
        tbl_cashiering.setShowGrid(false);
        tbl_cashiering.setIntercellSpacing(new Dimension(0, 0));
    }

    private void loadData_cashiering(List<to_cashiering> acc) {
        tbl_cashiering_ALM.clear();
        tbl_cashiering_ALM.addAll(acc);
    }

    public static class TblcashieringModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "account", "rate", "is_active"
        };

        public TblcashieringModel(ListModel listmodel) {
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
            to_cashiering tt = (to_cashiering) getRow(row);
            switch (col) {
                case 0:
                    if (tt.parent == 1) {
                        return "          " + tt.account;
                    } else {
                        return "               " + tt.account;
                    }
                case 1:
                    if (tt.parent == 1) {
                        if (tt.size == 0) {
                            if (tt.fix_rate.equals("1")) {
                                return FitIn.fmt_wc_0(tt.rate) + "  ";
                            } else {
                                return "";
                            }

                        } else {
                            return "";
                        }

                    } else {
                        if (tt.fix_rate.equals("1")) {
                            return FitIn.fmt_wc_0(tt.rate) + "  ";
                        } else {
                            return "";
                        }
                    }

                case 2:

                    return tt.rate;
                default:
                    return tt.is_active;
            }
        }
    }

    private void data_cols() {
        String where = " where is_active='" + "1" + "' order by account asc";
        loadData_cashiering(S1_cashiering.ret_data2(where));
        if (!tbl_cashiering_ALM.isEmpty()) {
            tbl_cashiering.setRowSelectionInterval(0, 0);
            select_type();
        }
    }
    
    private void data_cols2() {
        String where = " where is_active='" + "1" + "' order by account asc";
        loadData_cashiering(S1_cashiering.ret_data2(where));

    }

    private void select_type() {
        int row = tbl_cashiering.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_cashiering to = (to_cashiering) tbl_cashiering_ALM.get(row);
        if (to.parent == 1) {
            String where = "";

            loadData_cashiering(S1_cashiering.ret_data("" + to.id));
            List<to_cashiering> datas = tbl_cashiering_ALM;
            int r = 0;
            for (to_cashiering t : datas) {
                if (to.account.equals(t.account)) {
                    tbl_cashiering.setRowSelectionInterval(r, r);
                    break;
                }
                r++;
            }
            dis(false);
            jLabel7.setText("");
        } else {
            dis(true);
            jLabel7.setText(to.account_name + " - " + to.account);
            tf_or_no.grabFocus();

            Window p = (Window) this;
            Dlg_touchscreen_cash nd = Dlg_touchscreen_cash.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.account_name + " - " + to.account);
            nd.setCallback(new Dlg_touchscreen_cash.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_touchscreen_cash.OutputData data) {
                    closeDialog.ok();
                    int id = to.id;
                    String account = to.account;
                    double rate = to.rate;
                    int is_active = to.is_active;
                    int parent = to.parent;
                    int size = to.size;
                    String account_id = to.account_id;
                    String account_name = to.account_name;
                    String account_type = to.account_type;
                    String account_type_id = to.account_type_id;
                    String fix_rate = to.fix_rate;
                    int incremental = to.incremental;
                    String accounting_group_id = to.accounting_group_id;
                    String accounting_group_name = to.accounting_group_name;
                    String accounting_account_id = to.accounting_account_id;
                    String accounting_account_name = to.accounting_account_name;
                    String accounting_account_type = to.accounting_account_type;
                    String accounting_account_type_id = to.accounting_account_type_id;
                    double cash = data.cash;
                    double check = data.check;
                    String check_no = data.check_no;
                    String bank = data.bank;
                    S2_cashiering.to_cashiering to2 = new S2_cashiering.to_cashiering(id, account, rate, is_active, parent, size, account_id, account_name, account_type, account_type_id, fix_rate, incremental, accounting_group_id, accounting_group_name, accounting_account_id, accounting_account_name, accounting_account_type, accounting_account_type_id, cash, check, check_no, bank);
                    tbl_cashiering_ALM2.add(to2);
                    tbl_cashiering_M2.fireTableDataChanged();
                    compute();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    private void dis(boolean stmt) {
        tf_contact.setFocusable(stmt);
//        tf_date.setFocusable(stmt);
        tf_message.setFocusable(stmt);
        tf_or_no.setFocusable(stmt);
        tf_name.setFocusable(stmt);
        tf_time.setFocusable(stmt);
    }

    private void payment() {

        int row = tbl_cashiering.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_cashiering to = (to_cashiering) tbl_cashiering_ALM.get(row);
        if (to.parent == 1 && to.size > 0) {
            Alert.set(0, "Please!..Choose Account");
            return;
        }
        if (tbl_cashiering_ALM2.isEmpty()) {
            Alert.set(0, "Please add Transaction!");
            return;
        }

        List<S2_cashiering.to_cashiering> datas2 = tbl_cashiering_ALM2;
        double total = 0;
        String check_nos = "";
        String banks = "";
        String trans = "";
        for (S2_cashiering.to_cashiering to2 : datas2) {
            total += to2.cash + to2.check;
            check_nos = check_nos + " " + to2.check_no;
            banks = banks + " " + to2.bank;
            int id = 0;
            String or_no = tf_or_no.getText();
            String or_date = MyDate.jan_1_2014_to_2014_01_01(tf_date.getText());
            String date_added = MyDate.now();
            String or_time = tf_time.getText();
            String user_name = "";
            String terminal_id = "";
            double amount_due = to2.cash + to2.check;
            double cash = to2.cash;
            double check_amount = to2.check;
            String check_no = to2.check_no;
            String check_holder = to2.bank;
            String message = tf_message.getText();
            String parishioner = tf_name.getText();
            String parishioner_id = parish_id;
            String parioshioner_contact_no = tf_contact.getText();
            String account_name = to2.accounting_account_name;
            String account_id = "" + to2.accounting_account_id;
            String account_type = to2.accounting_account_type;
            String account_type_id = "" + to2.accounting_account_type_id;
            String status = "1";
            String particular1 = to2.account;
            String particular_id = "" + to2.id;
            String particular_account = to2.account_name;
            String particular_account_id = to2.account_id;
            trans = trans + " " + to2.account_type + ",";
            S1_receipts.to_receipts receipt = new S1_receipts.to_receipts(id, or_no, or_date, date_added, or_time, user_name, terminal_id, amount_due, cash, check_amount, check_no, check_holder, message, parishioner, parishioner_id, parioshioner_contact_no, account_name, account_id, account_type, account_type_id, status, particular1, particular_id, particular_account, particular_account_id, true);
            S1_receipts.add_receipts(receipt);
        }
        String label = "Change";
        String set = FitIn.fmt_wc_0(total);
        System.out.println("Transaction: " + trans);
        trans = trans.substring(0, trans.length() - 1);
        try {
            String jrxml = "rpt_acknowledgement_receipt.jrxml";
            String or_no1 = tf_or_no.getText();
            String date = DateType.day_and_time.format(new Date());
            String parishioner1 = tf_name.getText();
            String contact_no = tf_contact.getText();
            String particular = trans;
            double amount = total;
            String amount_in_words = DigitToWord.convertToWordsIn(amount);
            if (to.fix_rate.equals("0")) {
                amount = total;
                amount_in_words = DigitToWord.convertToWordsIn(amount);
                label = "Amount";
                set = FitIn.fmt_wc_0(amount);
            }
            String print = System.getProperty("print_to_receipts", "false");
            if (print.equals("true")) {
                amount_in_words = amount_in_words.toUpperCase();
                String received_by = Res.getUser_screename();

                Srpt_acknowledgement_receipt rpt = new Srpt_acknowledgement_receipt(or_no1, date, parishioner1, contact_no, particular, amount, amount_in_words, received_by, banks, check_nos);
                InputStream is = Srpt_acknowledgement_receipt.class.getResourceAsStream(jrxml);
                JasperReport jasperReport = JasperCompileManager.compileReport(is);
                jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                        setParameter(rpt), JasperUtil.emptyDatasource());
                JasperPrintManager.printReport(jasperPrint, false);
                JasperPrintManager.printReport(jasperPrint, false);
            }

        } catch (JRException ex) {
            Logger.getLogger(Srpt_acknowledgement_receipt.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        clear();
        init_or();
        change(set, label);
        tf_or_no.grabFocus();
        tbl_cashiering_ALM2.clear();
        tbl_cashiering_M2.fireTableDataChanged();
        compute();
    }
    JasperPrint jasperPrint = null;

    private void change(String change, String particular) {
        Window p = (Window) this;
        Dlg_touchscreen_change nd = Dlg_touchscreen_change.create(p, true);
        nd.setTitle("");
        nd.do_pass(change, particular);
        nd.setCallback(new Dlg_touchscreen_change.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_touchscreen_change.OutputData data) {
                closeDialog.ok();
            }

            @Override
            public void print(CloseDialog closeDialog, Dlg_touchscreen_change.OutputData data) {
                try {
                    closeDialog.ok();
                    JasperPrintManager.printReport(jasperPrint, false);
                } catch (JRException ex) {
                    Logger.getLogger(Dlg_touchscreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    String parish_id = "";

    private void clear() {

        tf_message.setText("");
        tf_name.setText("");
        tf_contact.setText("");
    }

    private void calendar() {
        Window p = (Window) this;
        final Dlg_touchscreen_calendar nd = Dlg_touchscreen_calendar.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_touchscreen_calendar.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_touchscreen_calendar.OutputData data) {
                closeDialog.ok();
            }
        });
        Point point = tf_date.getLocationOnScreen();
        nd.setVisible(true);
        nd.setSize(tf_date.getWidth() + 46, 356);
        nd.setLocation(point.x, point.x - 294);
        nd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                nd.dispose();
            }
        });
    }

    private void rates() {
        Window p = (Window) this;
        Dlg_cashiering nd = Dlg_cashiering.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_cashiering.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_cashiering.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void reports() {
        Window p = (Window) this;
        Dlg_cashiering_reports nd = Dlg_cashiering_reports.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_cashiering_reports.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_cashiering_reports.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void disbursment() {
        Window p = (Window) this;
        Dlg_disbursements nd = Dlg_disbursements.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_disbursements.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_disbursements.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    List<My_parishioners.to_my_parishioners> parishioner_list = new ArrayList();
    int my_add_parishioner = 0;

    private void init_manager() {
        String search = tf_name.getText();
        parishioner_list.clear();
        String where = " where parishioner like '%" + search + "%' "
                + "   order by parishioner asc";
        parishioner_list = My_parishioners.ret_data(where);
        if (parishioner_list.isEmpty()) {
            tf_contact.grabFocus();
            my_add_parishioner = 1;

        } else {
            my_add_parishioner = 0;
            if (parishioner_list.size() == 1) {
                My_parishioners.to_my_parishioners t = parishioner_list.get(0);
                tf_name.setText(t.parishioner);
                tf_contact.setText(t.contact_no);
                tf_contact.grabFocus();
            } else {
                Object[][] obj = new Object[parishioner_list.size()][2];
                int i = 0;
                for (My_parishioners.to_my_parishioners to : parishioner_list) {
                    obj[i][0] = " " + to.parishioner;
                    obj[i][1] = " " + to.contact_no;
                    i++;
                }
                JLabel[] labels = {};
                int[] tbl_widths_customers = {300, 100};
                int width = 0;
                String[] col_names = {"", ""};
                TableRenderer3 tr = new TableRenderer3();
                TableRenderer3.setPopup(tf_name, obj, labels, tbl_widths_customers, col_names);
                tr.setCallback(new TableRenderer3.Callback() {
                    @Override
                    public void ok(TableRenderer3.OutputData data) {
                        My_parishioners.to_my_parishioners to = parishioner_list.get(data.selected_row);
                        tf_name.setText(to.parishioner);
                        tf_contact.setText(to.contact_no);
                        tf_contact.grabFocus();
                    }
                });
            }

        }

    }

    private void add_parishioner() {

        if (my_add_parishioner == 1) {
            My_parishioners.to_my_parishioners to1 = new My_parishioners.to_my_parishioners(0, tf_name.getText(), tf_contact.getText(),"");
            My_parishioners.add_my_parishioners(to1);
        }

        payment();
    }

    private ArrayListModel tbl_cashiering_ALM2;
    private TblcashieringModel2 tbl_cashiering_M2;

    private void init_tbl_cashiering2() {
        tbl_cashiering_ALM2 = new ArrayListModel();
        tbl_cashiering_M2 = new TblcashieringModel2(tbl_cashiering_ALM2);
        jTable1.getTableHeader().setPreferredSize(new Dimension(100, 40));
        jTable1.setModel(tbl_cashiering_M2);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable1.setRowHeight(25);
        int[] tbl_widths_cashiering = {100, 100, 90, 0};
        for (int i = 0, n = tbl_widths_cashiering.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(jTable1, i, tbl_widths_cashiering[i]);
        }
        Dimension d = jTable1.getTableHeader().getPreferredSize();
        d.height = 0;
        jTable1.getTableHeader().setPreferredSize(d);
        jTable1.getTableHeader().setFont(new java.awt.Font("Levenim MT", 0, 36));
        jTable1.setRowHeight(50);
        jTable1.setFont(new java.awt.Font("Levenim MT", 0, 20));

        Color ivory = new Color(247, 130, 40);
        jTable1.setOpaque(true);
        jTable1.setFillsViewportHeight(true);
        jTable1.setBackground(ivory);
        TableWidthUtilities.setColumnRightRenderer(jTable1, 1);
        jTable1.setIntercellSpacing(new Dimension(0, 0));
    }

    private void loadData_cashiering2(List<S2_cashiering.to_cashiering> acc) {
        tbl_cashiering_ALM2.clear();
        tbl_cashiering_ALM2.addAll(acc);
    }

    public static class TblcashieringModel2 extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "account", "rate", "is_active"
        };

        public TblcashieringModel2(ListModel listmodel) {
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
            S2_cashiering.to_cashiering tt = (S2_cashiering.to_cashiering) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.account;
                case 1:
                    return FitIn.fmt_wc_0(tt.cash + tt.check) + " ";
                case 2:
                    return " Delete ";
                default:
                    return tt.is_active;
            }
        }
    }

    private void delete_transaction() {
        int row = jTable1.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = jTable1.getSelectedColumn();
        if (col == 2) {
            tbl_cashiering_ALM2.remove(row);
            tbl_cashiering_M2.fireTableDataChanged();
            compute();
        }

    }

    private void compute() {
        List< S2_cashiering.to_cashiering> datas = tbl_cashiering_ALM2;
        double total = 0;
        for (S2_cashiering.to_cashiering to : datas) {
            total += to.cash + to.check;
        }
        jLabel9.setText(FitIn.fmt_wc_0(total));
        jLabel31.setText("" + datas.size());
    }

    private void setDate() {
        String date = tf_date.getText();
        try {
            Date d = DateType.month_date.parse(date);
            d = DateUtils1.add_day(d, 1);
            tf_date.setText(DateType.month_date.format(d));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_touchscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setDate2() {
        String date = tf_date.getText();
        try {
            Date d = DateType.month_date.parse(date);
            d = DateUtils1.add_day(d, -1);
            tf_date.setText(DateType.month_date.format(d));
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_touchscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

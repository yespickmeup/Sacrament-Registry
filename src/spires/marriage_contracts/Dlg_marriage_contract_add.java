/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.marriage_contracts;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import spires.util.Focus_Fire;
import synsoftech.fields.Button;
import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Dlg_marriage_contract_add extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_marriage_contract_add
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

        public final Marriage_contracts.to_marriage_contracts to;

        public OutputData(Marriage_contracts.to_marriage_contracts to) {
            this.to = to;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_marriage_contract_add(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_marriage_contract_add(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_marriage_contract_add() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_marriage_contract_add myRef;

    private void setThisRef(Dlg_marriage_contract_add myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_marriage_contract_add> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_marriage_contract_add create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_marriage_contract_add create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_marriage_contract_add dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_contract_add((java.awt.Frame) parent, false);
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
            Dlg_marriage_contract_add dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_marriage_contract_add((java.awt.Dialog) parent, false);
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

        Dlg_marriage_contract_add dialog = Dlg_marriage_contract_add.create(new javax.swing.JFrame(), true);
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
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_province = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_city = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_registry_no = new javax.swing.JTextField();
        jButton4 = new Button.Primary();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jXPanel4 = new org.jdesktop.swingx.JXPanel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXPanel5 = new org.jdesktop.swingx.JXPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXPanel6 = new org.jdesktop.swingx.JXPanel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXPanel7 = new org.jdesktop.swingx.JXPanel();
        jXLabel28 = new org.jdesktop.swingx.JXLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jXPanel8 = new org.jdesktop.swingx.JXPanel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXPanel9 = new org.jdesktop.swingx.JXPanel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXPanel10 = new org.jdesktop.swingx.JXPanel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        jXPanel11 = new org.jdesktop.swingx.JXPanel();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXPanel12 = new org.jdesktop.swingx.JXPanel();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        jXPanel13 = new org.jdesktop.swingx.JXPanel();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        jXPanel14 = new org.jdesktop.swingx.JXPanel();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        jXPanel15 = new org.jdesktop.swingx.JXPanel();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        jXPanel16 = new org.jdesktop.swingx.JXPanel();
        jXLabel13 = new org.jdesktop.swingx.JXLabel();
        jXPanel17 = new org.jdesktop.swingx.JXPanel();
        jXLabel14 = new org.jdesktop.swingx.JXLabel();
        jXPanel19 = new org.jdesktop.swingx.JXPanel();
        jXLabel19 = new org.jdesktop.swingx.JXLabel();
        jXLabel20 = new org.jdesktop.swingx.JXLabel();
        jXLabel21 = new org.jdesktop.swingx.JXLabel();
        jXLabel22 = new org.jdesktop.swingx.JXLabel();
        tf_w_lname = new javax.swing.JTextField();
        tf_w_fname = new javax.swing.JTextField();
        tf_w_mi = new javax.swing.JTextField();
        jXPanel20 = new org.jdesktop.swingx.JXPanel();
        jXLabel23 = new org.jdesktop.swingx.JXLabel();
        jXLabel24 = new org.jdesktop.swingx.JXLabel();
        jXLabel25 = new org.jdesktop.swingx.JXLabel();
        jXLabel26 = new org.jdesktop.swingx.JXLabel();
        tf_h_lname = new javax.swing.JTextField();
        tf_h_fname = new javax.swing.JTextField();
        tf_h_mi = new javax.swing.JTextField();
        jXPanel18 = new org.jdesktop.swingx.JXPanel();
        jXLabel15 = new org.jdesktop.swingx.JXLabel();
        jXPanel21 = new org.jdesktop.swingx.JXPanel();
        jXLabel31 = new org.jdesktop.swingx.JXLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jXLabel32 = new org.jdesktop.swingx.JXLabel();
        jXLabel33 = new org.jdesktop.swingx.JXLabel();
        jTextField16 = new javax.swing.JTextField();
        jXPanel22 = new org.jdesktop.swingx.JXPanel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jXLabel27 = new org.jdesktop.swingx.JXLabel();
        jXPanel23 = new org.jdesktop.swingx.JXPanel();
        jXLabel34 = new org.jdesktop.swingx.JXLabel();
        jTextField17 = new javax.swing.JTextField();
        jXLabel40 = new org.jdesktop.swingx.JXLabel();
        jTextField23 = new javax.swing.JTextField();
        jXPanel24 = new org.jdesktop.swingx.JXPanel();
        jXLabel41 = new org.jdesktop.swingx.JXLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jXLabel42 = new org.jdesktop.swingx.JXLabel();
        jXLabel43 = new org.jdesktop.swingx.JXLabel();
        jTextField26 = new javax.swing.JTextField();
        jXPanel25 = new org.jdesktop.swingx.JXPanel();
        jXLabel39 = new org.jdesktop.swingx.JXLabel();
        jTextField22 = new javax.swing.JTextField();
        jXPanel26 = new org.jdesktop.swingx.JXPanel();
        jXLabel45 = new org.jdesktop.swingx.JXLabel();
        jTextField28 = new javax.swing.JTextField();
        jXLabel46 = new org.jdesktop.swingx.JXLabel();
        jTextField29 = new javax.swing.JTextField();
        jXPanel27 = new org.jdesktop.swingx.JXPanel();
        jTextField30 = new javax.swing.JTextField();
        jXPanel28 = new org.jdesktop.swingx.JXPanel();
        jXLabel47 = new org.jdesktop.swingx.JXLabel();
        jTextField32 = new javax.swing.JTextField();
        jXPanel29 = new org.jdesktop.swingx.JXPanel();
        jTextField34 = new javax.swing.JTextField();
        jXPanel32 = new org.jdesktop.swingx.JXPanel();
        jXLabel48 = new org.jdesktop.swingx.JXLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jXLabel49 = new org.jdesktop.swingx.JXLabel();
        jXLabel50 = new org.jdesktop.swingx.JXLabel();
        jTextField41 = new javax.swing.JTextField();
        jXPanel33 = new org.jdesktop.swingx.JXPanel();
        jTextField42 = new javax.swing.JTextField();
        jXPanel31 = new org.jdesktop.swingx.JXPanel();
        jXLabel44 = new org.jdesktop.swingx.JXLabel();
        jTextField31 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jXLabel51 = new org.jdesktop.swingx.JXLabel();
        jXLabel52 = new org.jdesktop.swingx.JXLabel();
        jTextField39 = new javax.swing.JTextField();
        jXPanel34 = new org.jdesktop.swingx.JXPanel();
        jTextField44 = new javax.swing.JTextField();
        jXPanel36 = new org.jdesktop.swingx.JXPanel();
        jTextField46 = new javax.swing.JTextField();
        jXPanel37 = new org.jdesktop.swingx.JXPanel();
        jTextField47 = new javax.swing.JTextField();
        jXPanel38 = new org.jdesktop.swingx.JXPanel();
        jTextField48 = new javax.swing.JTextField();
        jXPanel39 = new org.jdesktop.swingx.JXPanel();
        jTextField49 = new javax.swing.JTextField();
        jXPanel35 = new org.jdesktop.swingx.JXPanel();
        jXLabel53 = new org.jdesktop.swingx.JXLabel();
        jTextField45 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jXLabel54 = new org.jdesktop.swingx.JXLabel();
        jXLabel55 = new org.jdesktop.swingx.JXLabel();
        jTextField51 = new javax.swing.JTextField();
        jXPanel40 = new org.jdesktop.swingx.JXPanel();
        jXLabel56 = new org.jdesktop.swingx.JXLabel();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jXLabel57 = new org.jdesktop.swingx.JXLabel();
        jXLabel58 = new org.jdesktop.swingx.JXLabel();
        jTextField54 = new javax.swing.JTextField();
        jXPanel43 = new org.jdesktop.swingx.JXPanel();
        jTextField57 = new javax.swing.JTextField();
        jXPanel44 = new org.jdesktop.swingx.JXPanel();
        jTextField58 = new javax.swing.JTextField();
        jXPanel45 = new org.jdesktop.swingx.JXPanel();
        jXLabel59 = new org.jdesktop.swingx.JXLabel();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jXLabel60 = new org.jdesktop.swingx.JXLabel();
        jXLabel61 = new org.jdesktop.swingx.JXLabel();
        jTextField61 = new javax.swing.JTextField();
        jXPanel46 = new org.jdesktop.swingx.JXPanel();
        jXLabel62 = new org.jdesktop.swingx.JXLabel();
        jTextField62 = new javax.swing.JTextField();
        jXLabel63 = new org.jdesktop.swingx.JXLabel();
        jXLabel64 = new org.jdesktop.swingx.JXLabel();
        jTextField64 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jXPanel47 = new org.jdesktop.swingx.JXPanel();
        jTextField65 = new javax.swing.JTextField();
        jXPanel48 = new org.jdesktop.swingx.JXPanel();
        jTextField66 = new javax.swing.JTextField();
        jXPanel49 = new org.jdesktop.swingx.JXPanel();
        jTextField67 = new javax.swing.JTextField();
        jXPanel50 = new org.jdesktop.swingx.JXPanel();
        jTextField68 = new javax.swing.JTextField();
        jXPanel30 = new org.jdesktop.swingx.JXPanel();
        jXLabel65 = new org.jdesktop.swingx.JXLabel();
        jTextField36 = new javax.swing.JTextField();
        jXPanel53 = new org.jdesktop.swingx.JXPanel();
        jXLabel67 = new org.jdesktop.swingx.JXLabel();
        jTextField72 = new javax.swing.JTextField();
        jXPanel57 = new org.jdesktop.swingx.JXPanel();
        jTextField76 = new javax.swing.JTextField();
        jXPanel58 = new org.jdesktop.swingx.JXPanel();
        jTextField77 = new javax.swing.JTextField();
        jButton1 = new Button.Primary();
        jButton5 = new Button.Default();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jXPanel52 = new org.jdesktop.swingx.JXPanel();
        jXLabel16 = new org.jdesktop.swingx.JXLabel();
        jXPanel51 = new org.jdesktop.swingx.JXPanel();
        jXLabel66 = new org.jdesktop.swingx.JXLabel();
        tf_place_of_marriage = new javax.swing.JTextField();
        jXPanel56 = new org.jdesktop.swingx.JXPanel();
        jXLabel18 = new org.jdesktop.swingx.JXLabel();
        jXPanel55 = new org.jdesktop.swingx.JXPanel();
        jXLabel68 = new org.jdesktop.swingx.JXLabel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jXPanel54 = new org.jdesktop.swingx.JXPanel();
        jXLabel17 = new org.jdesktop.swingx.JXLabel();
        jXPanel41 = new org.jdesktop.swingx.JXPanel();
        tf_time_of_marriage = new javax.swing.JTextField();
        jXPanel42 = new org.jdesktop.swingx.JXPanel();
        jTextField56 = new javax.swing.JTextField();
        jXLabel71 = new org.jdesktop.swingx.JXLabel();
        jXPanel59 = new org.jdesktop.swingx.JXPanel();
        jXLabel72 = new org.jdesktop.swingx.JXLabel();
        jXPanel60 = new org.jdesktop.swingx.JXPanel();
        cb_ccp1 = new javax.swing.JCheckBox();
        cb_ccp2 = new javax.swing.JCheckBox();
        jXPanel61 = new org.jdesktop.swingx.JXPanel();
        jXLabel73 = new org.jdesktop.swingx.JXLabel();
        jXPanel62 = new org.jdesktop.swingx.JXPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jXPanel63 = new org.jdesktop.swingx.JXPanel();
        jXLabel74 = new org.jdesktop.swingx.JXLabel();
        jXPanel64 = new org.jdesktop.swingx.JXPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jTextField99 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jTextField100 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jTextField101 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jTextField102 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jTextField103 = new javax.swing.JTextField();
        jTextField104 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextField105 = new javax.swing.JTextField();
        jTextField106 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jTextField107 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jTextField108 = new javax.swing.JTextField();
        jXPanel65 = new org.jdesktop.swingx.JXPanel();
        jXLabel75 = new org.jdesktop.swingx.JXLabel();
        jXPanel66 = new org.jdesktop.swingx.JXPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField63 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField73 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jXPanel67 = new org.jdesktop.swingx.JXPanel();
        jXLabel76 = new org.jdesktop.swingx.JXLabel();
        jXPanel68 = new org.jdesktop.swingx.JXPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField78 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField80 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jXPanel70 = new org.jdesktop.swingx.JXPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jXPanel71 = new org.jdesktop.swingx.JXPanel();
        jXLabel78 = new org.jdesktop.swingx.JXLabel();
        jButton3 = new Button.Default();
        jButton6 = new Button.Primary();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jTextField10 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jLabel37 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jButton8 = new Button.Primary();
        jButton9 = new Button.Default();
        jPanel10 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField71 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jTextField74 = new javax.swing.JTextField();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        jTextField75 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jCheckBox12 = new javax.swing.JCheckBox();
        jTextField79 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField81 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField82 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jDateChooser11 = new com.toedter.calendar.JDateChooser();
        jPanel19 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jTextField83 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jPanel20 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jTextField84 = new javax.swing.JTextField();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        jTextField85 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jDateChooser12 = new com.toedter.calendar.JDateChooser();
        jCheckBox18 = new javax.swing.JCheckBox();
        jTextField86 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jTextField87 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jTextField88 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField89 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextField90 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jTextField92 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jDateChooser13 = new com.toedter.calendar.JDateChooser();
        jLabel64 = new javax.swing.JLabel();
        jTextField70 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jDateChooser14 = new com.toedter.calendar.JDateChooser();
        jLabel66 = new javax.swing.JLabel();
        jTextField91 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jTextField93 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jDateChooser15 = new com.toedter.calendar.JDateChooser();
        jLabel69 = new javax.swing.JLabel();
        jTextField94 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jTextField95 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jTextField96 = new javax.swing.JTextField();
        jTextField97 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jButton2 = new Button.Success();
        jButton7 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("OFFICE OF THE CIVIL REGISTRAR GENERAL");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CERTIFICATE OF MARRIAGE");

        jLabel16.setText("Province:");

        tf_province.setText("NEGROS ORIENTAL");

        jLabel17.setText("City/Municipality:");

        tf_city.setText("DUMAGUETE CITY");

        jLabel18.setText("Registry No.");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_registry_no, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_province, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(258, 258, 258))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_registry_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel7);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jXPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel1.setText("1.  Name of                Contracting           Parties");
        jXLabel1.setLineWrap(true);

        javax.swing.GroupLayout jXPanel4Layout = new javax.swing.GroupLayout(jXPanel4);
        jXPanel4.setLayout(jXPanel4Layout);
        jXPanel4Layout.setHorizontalGroup(
            jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel4Layout.setVerticalGroup(
            jXPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel4Layout.createSequentialGroup()
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel2.setText("4.a Sex             4.b Citizenship");
        jXLabel2.setLineWrap(true);

        javax.swing.GroupLayout jXPanel5Layout = new javax.swing.GroupLayout(jXPanel5);
        jXPanel5.setLayout(jXPanel5Layout);
        jXPanel5Layout.setHorizontalGroup(
            jXPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel5Layout.setVerticalGroup(
            jXPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel5Layout.createSequentialGroup()
                .addComponent(jXLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel3.setText("3. Place of Birth");
        jXLabel3.setLineWrap(true);

        javax.swing.GroupLayout jXPanel6Layout = new javax.swing.GroupLayout(jXPanel6);
        jXPanel6.setLayout(jXPanel6Layout);
        jXPanel6Layout.setHorizontalGroup(
            jXPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel6Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel6Layout.setVerticalGroup(
            jXPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel6Layout.createSequentialGroup()
                .addComponent(jXLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel28.setText("Date:");
        jXLabel28.setLineWrap(true);
        jXPanel7.add(jXLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jDateChooser5.setDate(new Date());
        jXPanel7.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        jXPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel5.setText("5. Residence");
        jXLabel5.setLineWrap(true);

        javax.swing.GroupLayout jXPanel8Layout = new javax.swing.GroupLayout(jXPanel8);
        jXPanel8.setLayout(jXPanel8Layout);
        jXPanel8Layout.setHorizontalGroup(
            jXPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel8Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel8Layout.setVerticalGroup(
            jXPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel8Layout.createSequentialGroup()
                .addComponent(jXLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel6.setText("9. Citizenship");
        jXLabel6.setLineWrap(true);

        javax.swing.GroupLayout jXPanel9Layout = new javax.swing.GroupLayout(jXPanel9);
        jXPanel9.setLayout(jXPanel9Layout);
        jXPanel9Layout.setHorizontalGroup(
            jXPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel9Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel9Layout.setVerticalGroup(
            jXPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel9Layout.createSequentialGroup()
                .addComponent(jXLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel7.setText("8. Name of                 Father");
        jXLabel7.setLineWrap(true);

        javax.swing.GroupLayout jXPanel10Layout = new javax.swing.GroupLayout(jXPanel10);
        jXPanel10.setLayout(jXPanel10Layout);
        jXPanel10Layout.setHorizontalGroup(
            jXPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel10Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel10Layout.setVerticalGroup(
            jXPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel10Layout.createSequentialGroup()
                .addComponent(jXLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel8.setText("7. Civil Status");
        jXLabel8.setLineWrap(true);

        javax.swing.GroupLayout jXPanel11Layout = new javax.swing.GroupLayout(jXPanel11);
        jXPanel11.setLayout(jXPanel11Layout);
        jXPanel11Layout.setHorizontalGroup(
            jXPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel11Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel11Layout.setVerticalGroup(
            jXPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel11Layout.createSequentialGroup()
                .addComponent(jXLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel9.setText("6. Religion");
        jXLabel9.setLineWrap(true);

        javax.swing.GroupLayout jXPanel12Layout = new javax.swing.GroupLayout(jXPanel12);
        jXPanel12.setLayout(jXPanel12Layout);
        jXPanel12Layout.setHorizontalGroup(
            jXPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel12Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel12Layout.setVerticalGroup(
            jXPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel12Layout.createSequentialGroup()
                .addComponent(jXLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel10.setText("12. Name of Person/  Wali who Gave Consent or Advice");
        jXLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jXLabel10.setLineWrap(true);

        javax.swing.GroupLayout jXPanel13Layout = new javax.swing.GroupLayout(jXPanel13);
        jXPanel13.setLayout(jXPanel13Layout);
        jXPanel13Layout.setHorizontalGroup(
            jXPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel13Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel13Layout.setVerticalGroup(
            jXPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel13Layout.createSequentialGroup()
                .addComponent(jXLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel11.setText("14 Residence");
        jXLabel11.setLineWrap(true);

        javax.swing.GroupLayout jXPanel14Layout = new javax.swing.GroupLayout(jXPanel14);
        jXPanel14.setLayout(jXPanel14Layout);
        jXPanel14Layout.setHorizontalGroup(
            jXPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel14Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel14Layout.setVerticalGroup(
            jXPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel14Layout.createSequentialGroup()
                .addComponent(jXLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel12.setText("10. Maiden Name        of Mother");
        jXLabel12.setLineWrap(true);

        javax.swing.GroupLayout jXPanel15Layout = new javax.swing.GroupLayout(jXPanel15);
        jXPanel15.setLayout(jXPanel15Layout);
        jXPanel15Layout.setHorizontalGroup(
            jXPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel15Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel15Layout.setVerticalGroup(
            jXPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel15Layout.createSequentialGroup()
                .addComponent(jXLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel13.setText("11. Citizenship");
        jXLabel13.setLineWrap(true);

        javax.swing.GroupLayout jXPanel16Layout = new javax.swing.GroupLayout(jXPanel16);
        jXPanel16.setLayout(jXPanel16Layout);
        jXPanel16Layout.setHorizontalGroup(
            jXPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel16Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel16Layout.setVerticalGroup(
            jXPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel16Layout.createSequentialGroup()
                .addComponent(jXLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel14.setText("13. Relationship");
        jXLabel14.setLineWrap(true);

        javax.swing.GroupLayout jXPanel17Layout = new javax.swing.GroupLayout(jXPanel17);
        jXPanel17.setLayout(jXPanel17Layout);
        jXPanel17Layout.setHorizontalGroup(
            jXPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel17Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel17Layout.setVerticalGroup(
            jXPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel17Layout.createSequentialGroup()
                .addComponent(jXLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel19.setBackground(new java.awt.Color(255, 204, 204));
        jXLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel19.setText("WIFE");
        jXLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXPanel19.add(jXLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        jXLabel20.setText("(Last)");
        jXLabel20.setLineWrap(true);
        jXPanel19.add(jXLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 40, -1));

        jXLabel21.setText("(First)");
        jXLabel21.setLineWrap(true);
        jXPanel19.add(jXLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 20));

        jXLabel22.setText("(Middle)");
        jXLabel22.setLineWrap(true);
        jXPanel19.add(jXLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 20));

        tf_w_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tf_w_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_w_lnameKeyReleased(evt);
            }
        });
        jXPanel19.add(tf_w_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 380, 20));

        tf_w_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tf_w_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_w_fnameKeyReleased(evt);
            }
        });
        jXPanel19.add(tf_w_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 380, 20));

        tf_w_mi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tf_w_mi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_w_miKeyReleased(evt);
            }
        });
        jXPanel19.add(tf_w_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 380, 20));

        jXPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel23.setText("HUSBAND");
        jXLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXPanel20.add(jXLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        jXLabel24.setText("(Last)");
        jXLabel24.setLineWrap(true);
        jXPanel20.add(jXLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 40, 20));

        jXLabel25.setText("(First)");
        jXLabel25.setLineWrap(true);
        jXPanel20.add(jXLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, 20));

        jXLabel26.setText("(Middle)");
        jXLabel26.setLineWrap(true);
        jXPanel20.add(jXLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 40, 20));

        tf_h_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tf_h_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_h_lnameKeyReleased(evt);
            }
        });
        jXPanel20.add(tf_h_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 380, 20));

        tf_h_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tf_h_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_h_fnameKeyReleased(evt);
            }
        });
        jXPanel20.add(tf_h_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 380, 20));

        tf_h_mi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tf_h_mi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_h_miKeyReleased(evt);
            }
        });
        jXPanel20.add(tf_h_mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 380, 20));

        jXPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel15.setText("2.a Date of Birth   2.b Age");
        jXLabel15.setLineWrap(true);

        javax.swing.GroupLayout jXPanel18Layout = new javax.swing.GroupLayout(jXPanel18);
        jXPanel18.setLayout(jXPanel18Layout);
        jXPanel18Layout.setHorizontalGroup(
            jXPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel18Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel18Layout.setVerticalGroup(
            jXPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel18Layout.createSequentialGroup()
                .addComponent(jXLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel31.setText("(City/Municipality)");
        jXLabel31.setLineWrap(true);
        jXPanel21.add(jXLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 20));

        jTextField14.setText("DUMAGUETE");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel21.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 20));

        jTextField15.setText("NEGROS");
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel21.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, 20));

        jXLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel32.setText("Province");
        jXLabel32.setLineWrap(true);
        jXPanel21.add(jXLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, 20));

        jXLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel33.setText("(Country)");
        jXLabel33.setLineWrap(true);
        jXPanel21.add(jXLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 140, 20));

        jTextField16.setText("PHILIPPINES");
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel21.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 170, 20));

        jXPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser4.setDate(new Date());
        jXPanel22.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        jXLabel27.setText("Date:");
        jXLabel27.setLineWrap(true);
        jXPanel22.add(jXLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

        jXPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel34.setText("(GENDER)");
        jXLabel34.setLineWrap(true);
        jXPanel23.add(jXLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 20));

        jTextField17.setText("MALE");
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel23.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 20));

        jXLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel40.setText("(Citizenship)");
        jXLabel40.setLineWrap(true);
        jXPanel23.add(jXLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 20));

        jTextField23.setText("FILIPINO");
        jTextField23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel23.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 300, 20));

        jXPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel41.setText("(First)");
        jXLabel41.setLineWrap(true);
        jXPanel24.add(jXLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 20));

        jTextField24.setText(" ");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel24.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        jTextField25.setText(" ");
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel24.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 20));

        jXLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel42.setText("(Middle)");
        jXLabel42.setLineWrap(true);
        jXPanel24.add(jXLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 130, 20));

        jXLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel43.setText("(Last)");
        jXLabel43.setLineWrap(true);
        jXPanel24.add(jXLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 150, 20));

        jTextField26.setText(" ");
        jTextField26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel24.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 150, 20));

        jXPanel25.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel39.setText("(House No., St., Barangay, City, Municipality, Province, Country)");
        jXLabel39.setLineWrap(true);
        jXPanel25.add(jXLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 430, 20));

        jTextField22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel25.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 20));

        jXPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel45.setText("(GENDER)");
        jXLabel45.setLineWrap(true);
        jXPanel26.add(jXLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 20));

        jTextField28.setText("MALE");
        jTextField28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel26.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 20));

        jXLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel46.setText("(Citizenship)");
        jXLabel46.setLineWrap(true);
        jXPanel26.add(jXLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 20));

        jTextField29.setText("FILIPINO");
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel26.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 300, 20));

        jXPanel27.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField30.setText("Single");
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel27.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel47.setText("(House No., St., Barangay, City, Municipality, Province, Country)");
        jXLabel47.setLineWrap(true);
        jXPanel28.add(jXLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 20));

        jTextField32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel28.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 20));

        jXPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField34.setText("Roman Catholic");
        jTextField34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel29.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel32.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel48.setText("(City/Municipality)");
        jXLabel48.setLineWrap(true);
        jXPanel32.add(jXLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 20));

        jTextField37.setText("DUMAGUETE");
        jTextField37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel32.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 20));

        jTextField40.setText("NEGROS");
        jTextField40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel32.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, 20));

        jXLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel49.setText("Province");
        jXLabel49.setLineWrap(true);
        jXPanel32.add(jXLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, 20));

        jXLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel50.setText("(Country)");
        jXLabel50.setLineWrap(true);
        jXPanel32.add(jXLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 140, 20));

        jTextField41.setText("PHILIPPINES");
        jTextField41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel32.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 170, 20));

        jXPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField42.setText("Roman Catholic");
        jTextField42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel33.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel44.setText("(First)");
        jXLabel44.setLineWrap(true);
        jXPanel31.add(jXLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 20));

        jTextField31.setText(" ");
        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel31.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        jTextField38.setText(" ");
        jTextField38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel31.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 20));

        jXLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel51.setText("(Middle)");
        jXLabel51.setLineWrap(true);
        jXPanel31.add(jXLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 130, 20));

        jXLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel52.setText("(Last)");
        jXLabel52.setLineWrap(true);
        jXPanel31.add(jXLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 130, 20));

        jTextField39.setText(" ");
        jTextField39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel31.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 150, 20));

        jXPanel34.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField44.setText("Single");
        jTextField44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel34.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel36.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField46.setText("Filipino");
        jTextField46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField46.setNextFocusableComponent(jTextField59);
        jXPanel36.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jXPanel37.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, -1));

        jXPanel36.add(jXPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 410, 20));

        jXPanel38.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField48.setNextFocusableComponent(jTextField72);
        jXPanel38.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jXPanel39.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, -1));

        jXPanel38.add(jXPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 410, 20));

        jXPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel53.setText("(First)");
        jXLabel53.setLineWrap(true);
        jXPanel35.add(jXLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 20));

        jTextField45.setText(" ");
        jTextField45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel35.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        jTextField50.setText(" ");
        jTextField50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel35.add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 20));

        jXLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel54.setText("(Middle)");
        jXLabel54.setLineWrap(true);
        jXPanel35.add(jXLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 130, 20));

        jXLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel55.setText("(Last)");
        jXLabel55.setLineWrap(true);
        jXPanel35.add(jXLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 150, 20));

        jTextField51.setText(" ");
        jTextField51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel35.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 150, 20));

        jXPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel56.setText("(First)");
        jXLabel56.setLineWrap(true);
        jXPanel40.add(jXLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        jTextField52.setText(" ");
        jTextField52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel40.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        jTextField53.setText(" ");
        jTextField53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel40.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 20));

        jXLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel57.setText("(Middle)");
        jXLabel57.setLineWrap(true);
        jXPanel40.add(jXLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 130, 20));

        jXLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel58.setText("(Last)");
        jXLabel58.setLineWrap(true);
        jXPanel40.add(jXLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 130, 20));

        jTextField54.setText(" ");
        jTextField54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel40.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 150, 20));

        jXPanel43.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField57.setText("Filipino");
        jTextField57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField57.setNextFocusableComponent(jTextField62);
        jXPanel43.add(jTextField57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField58.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jXPanel44.add(jTextField58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, -1));

        jXPanel43.add(jXPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 410, 20));

        jXPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel59.setText("(First)");
        jXLabel59.setLineWrap(true);
        jXPanel45.add(jXLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        jTextField59.setText(" ");
        jTextField59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel45.add(jTextField59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        jTextField60.setText(" ");
        jTextField60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel45.add(jTextField60, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 20));

        jXLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel60.setText("(Middle)");
        jXLabel60.setLineWrap(true);
        jXPanel45.add(jXLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 130, 20));

        jXLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel61.setText("(Last)");
        jXLabel61.setLineWrap(true);
        jXPanel45.add(jXLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 150, 20));

        jTextField61.setText(" ");
        jTextField61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField61.setNextFocusableComponent(jTextField31);
        jXPanel45.add(jTextField61, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 150, 20));

        jXPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel62.setText("(First)");
        jXLabel62.setLineWrap(true);
        jXPanel46.add(jXLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 20));

        jTextField62.setText(" ");
        jTextField62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel46.add(jTextField62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 20));

        jXLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel63.setText("(Middle)");
        jXLabel63.setLineWrap(true);
        jXPanel46.add(jXLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 130, 20));

        jXLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel64.setText("(Last)");
        jXLabel64.setLineWrap(true);
        jXPanel46.add(jXLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 160, 20));

        jTextField64.setText(" ");
        jTextField64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel46.add(jTextField64, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, 20));

        jTextField69.setText(" ");
        jTextField69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel46.add(jTextField69, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 160, 20));

        jXPanel47.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField65.setText("Filipino");
        jTextField65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField65.setNextFocusableComponent(jTextField46);
        jXPanel47.add(jTextField65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField66.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jXPanel48.add(jTextField66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, -1));

        jXPanel47.add(jXPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 410, 20));

        jXPanel49.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField67.setNextFocusableComponent(jTextField48);
        jXPanel49.add(jTextField67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField68.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jXPanel50.add(jTextField68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, -1));

        jXPanel49.add(jXPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 410, 20));

        jXPanel30.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel65.setText("(House No., St., Barangay, City, Municipality, Province, Country)");
        jXLabel65.setLineWrap(true);
        jXPanel30.add(jXLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 430, 20));

        jTextField36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel30.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 20));

        jXPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel67.setText("(House No., St., Barangay, City, Municipality, Province, Country)");
        jXLabel67.setLineWrap(true);
        jXPanel53.add(jXLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 20));

        jTextField72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField72.setNextFocusableComponent(jTextField32);
        jXPanel53.add(jTextField72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 430, 20));

        jXPanel57.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel57.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField76.setText("Filipino");
        jTextField76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField76.setNextFocusableComponent(jTextField57);
        jXPanel57.add(jTextField76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 20));

        jXPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField77.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jXPanel58.add(jTextField77, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, -1));

        jXPanel57.add(jXPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 410, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jXPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jXPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jXPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jXPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jXPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jXPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jXPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jXPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Previous");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Basic Information", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jXPanel52.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel16.setText("15. Place of Marriage");
        jXLabel16.setLineWrap(true);

        javax.swing.GroupLayout jXPanel52Layout = new javax.swing.GroupLayout(jXPanel52);
        jXPanel52.setLayout(jXPanel52Layout);
        jXPanel52Layout.setHorizontalGroup(
            jXPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel52Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel52Layout.setVerticalGroup(
            jXPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel52Layout.createSequentialGroup()
                .addComponent(jXLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel51.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel66.setText("                   (Office of the/House of/Barangay of/Church of/Mosque of)                                    (City/Municipality)                            (Province)          ");
        jXPanel51.add(jXLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 790, 20));

        tf_place_of_marriage.setText("ST. CATHERING EOF ALEXANDRIA PARISH                  DUMAGUETE CITY            NEGROS ORIENTAL");
        tf_place_of_marriage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel51.add(tf_place_of_marriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 20));

        jXPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel18.setText("16.) Date of Marriage");
        jXLabel18.setLineWrap(true);

        javax.swing.GroupLayout jXPanel56Layout = new javax.swing.GroupLayout(jXPanel56);
        jXPanel56.setLayout(jXPanel56Layout);
        jXPanel56Layout.setHorizontalGroup(
            jXPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel56Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel56Layout.setVerticalGroup(
            jXPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel56Layout.createSequentialGroup()
                .addComponent(jXLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel68.setText("Date:");
        jXLabel68.setLineWrap(true);
        jXPanel55.add(jXLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 20));

        jDateChooser6.setDate(new Date());
        jXPanel55.add(jDateChooser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, -1));

        jXPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel17.setText("17.) Time of Marriage");
        jXLabel17.setLineWrap(true);

        javax.swing.GroupLayout jXPanel54Layout = new javax.swing.GroupLayout(jXPanel54);
        jXPanel54.setLayout(jXPanel54Layout);
        jXPanel54Layout.setHorizontalGroup(
            jXPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel54Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel54Layout.setVerticalGroup(
            jXPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel54Layout.createSequentialGroup()
                .addComponent(jXLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_time_of_marriage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jXPanel41.add(tf_time_of_marriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 20));

        jXPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField56.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jXPanel42.add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, -1));

        jXPanel41.add(jXPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 410, 20));

        jXLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel71.setText("am/pm");
        jXLabel71.setLineWrap(true);
        jXPanel41.add(jXLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 10));

        jXPanel59.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel72.setText("18.) Certification of the Contracting Parties");
        jXLabel72.setLineWrap(true);

        javax.swing.GroupLayout jXPanel59Layout = new javax.swing.GroupLayout(jXPanel59);
        jXPanel59.setLayout(jXPanel59Layout);
        jXPanel59Layout.setHorizontalGroup(
            jXPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel59Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel59Layout.setVerticalGroup(
            jXPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel59Layout.createSequentialGroup()
                .addComponent(jXLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel60.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(cb_ccp1);
        cb_ccp1.setText("have not entered into a marriage settlement");
        cb_ccp1.setOpaque(false);
        jXPanel60.add(cb_ccp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 40));

        buttonGroup1.add(cb_ccp2);
        cb_ccp2.setSelected(true);
        cb_ccp2.setText("have entered, a copy of which is hereto attached /");
        cb_ccp2.setOpaque(false);
        jXPanel60.add(cb_ccp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jXPanel61.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel73.setText("19.) Certification of the Solemnizing Officer");
        jXLabel73.setLineWrap(true);

        javax.swing.GroupLayout jXPanel61Layout = new javax.swing.GroupLayout(jXPanel61);
        jXPanel61.setLayout(jXPanel61Layout);
        jXPanel61Layout.setHorizontalGroup(
            jXPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel61Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel61Layout.setVerticalGroup(
            jXPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel61Layout.createSequentialGroup()
                .addComponent(jXLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox3.setSelected(true);
        jCheckBox3.setText("c. the marriage was solemnized in accordance with the provisions of Presidential Decree No. 1083");
        jCheckBox3.setOpaque(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jXPanel62.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 510, 20));

        jTextField1.setText(" ");
        jXPanel62.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 180, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("at");
        jXPanel62.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 20, 20));

        jDateChooser1.setDate(new Date());
        jXPanel62.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, -1));

        jLabel2.setText("issued on");
        jXPanel62.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 20));

        jTextField2.setText(" ");
        jXPanel62.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 300, -1));

        jCheckBox4.setSelected(true);
        jCheckBox4.setText("a. Marriage License No.");
        jCheckBox4.setOpaque(false);
        jXPanel62.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jTextField3.setText(" ");
        jXPanel62.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 150, -1));

        jLabel3.setText("of Executive Order No. 209");
        jXPanel62.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 150, 20));

        jCheckBox5.setSelected(true);
        jCheckBox5.setText("b. no marriage license was necessary, the marriage being solemnized under Art.");
        jCheckBox5.setOpaque(false);
        jXPanel62.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        jTextField6.setText(" ");
        jXPanel62.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(Signature Over Printed Name of Solemnizing Office)");
        jXPanel62.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("(Position/Designation)");
        jXPanel62.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 280, -1));

        jTextField27.setText(" ");
        jXPanel62.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 280, -1));

        jTextField33.setText(" ");
        jXPanel62.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 880, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("(Religion/Religious Sect. Registry No. and Expiration Date, if applicable)");
        jXPanel62.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 820, -1));

        jXPanel63.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel74.setText("20.) Witnesses");
        jXLabel74.setLineWrap(true);

        javax.swing.GroupLayout jXPanel63Layout = new javax.swing.GroupLayout(jXPanel63);
        jXPanel63.setLayout(jXPanel63Layout);
        jXPanel63Layout.setHorizontalGroup(
            jXPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel63Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel63Layout.setVerticalGroup(
            jXPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel63Layout.createSequentialGroup()
                .addComponent(jXLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel64.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("1.) ");
        jXPanel64.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 20));

        jTextField35.setText(" ");
        jTextField35.setNextFocusableComponent(jTextField98);
        jXPanel64.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, -1));

        jTextField98.setText(" ");
        jTextField98.setNextFocusableComponent(jTextField99);
        jXPanel64.add(jTextField98, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 380, -1));

        jLabel73.setText("2.)");
        jXPanel64.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 20, 20));

        jTextField99.setText(" ");
        jTextField99.setNextFocusableComponent(jTextField100);
        jXPanel64.add(jTextField99, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 380, -1));

        jLabel74.setText("3.)");
        jXPanel64.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, 20));

        jTextField100.setText(" ");
        jTextField100.setNextFocusableComponent(jTextField106);
        jXPanel64.add(jTextField100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 380, -1));

        jLabel75.setText("4.)");
        jXPanel64.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 20, 20));

        jTextField101.setText(" ");
        jTextField101.setNextFocusableComponent(jTextField107);
        jXPanel64.add(jTextField101, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 380, -1));

        jLabel76.setText("10.)");
        jXPanel64.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 20, 20));

        jTextField102.setText(" ");
        jTextField102.setNextFocusableComponent(jTextField101);
        jXPanel64.add(jTextField102, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 380, -1));

        jLabel77.setText("9.)");
        jXPanel64.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 20, 20));

        jLabel78.setText("8.)");
        jXPanel64.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 20, 20));

        jTextField103.setText(" ");
        jTextField103.setNextFocusableComponent(jTextField102);
        jXPanel64.add(jTextField103, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 380, -1));

        jTextField104.setText(" ");
        jTextField104.setNextFocusableComponent(jTextField103);
        jXPanel64.add(jTextField104, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 380, -1));

        jLabel79.setText("7.)");
        jXPanel64.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 20, 20));

        jLabel80.setText("6.)");
        jXPanel64.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 20, 20));

        jTextField105.setText(" ");
        jTextField105.setNextFocusableComponent(jTextField104);
        jXPanel64.add(jTextField105, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 380, 20));

        jTextField106.setText(" ");
        jTextField106.setNextFocusableComponent(jTextField105);
        jXPanel64.add(jTextField106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 380, 20));

        jLabel81.setText("5.)");
        jXPanel64.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 20, 20));

        jTextField107.setText(" ");
        jTextField107.setNextFocusableComponent(jTextField108);
        jXPanel64.add(jTextField107, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 380, 20));

        jLabel82.setText("11.)");
        jXPanel64.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 20, 20));

        jLabel83.setText("12.)");
        jXPanel64.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 20, 20));

        jTextField108.setText(" ");
        jXPanel64.add(jTextField108, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 380, 20));

        jXPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel75.setText("21.) Received by");
        jXLabel75.setLineWrap(true);

        javax.swing.GroupLayout jXPanel65Layout = new javax.swing.GroupLayout(jXPanel65);
        jXPanel65.setLayout(jXPanel65Layout);
        jXPanel65Layout.setHorizontalGroup(
            jXPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel65Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel65Layout.setVerticalGroup(
            jXPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel65Layout.createSequentialGroup()
                .addComponent(jXLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Name if Print:");
        jXPanel66.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jTextField63.setText(" ");
        jXPanel66.add(jTextField63, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 310, -1));

        jLabel9.setText("Date:");
        jXPanel66.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jTextField73.setText(" ");
        jXPanel66.add(jTextField73, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 310, 20));

        jLabel10.setText("Position:");
        jXPanel66.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        jDateChooser2.setDate(new Date());
        jXPanel66.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 210, -1));

        jXPanel67.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel76.setText("22.) Registered by the Civil Registrar");
        jXLabel76.setLineWrap(true);

        javax.swing.GroupLayout jXPanel67Layout = new javax.swing.GroupLayout(jXPanel67);
        jXPanel67.setLayout(jXPanel67Layout);
        jXPanel67Layout.setHorizontalGroup(
            jXPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel67Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel67Layout.setVerticalGroup(
            jXPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel67Layout.createSequentialGroup()
                .addComponent(jXLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        jXPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Name:");
        jXPanel68.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jTextField78.setText(" ");
        jXPanel68.add(jTextField78, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 310, -1));

        jLabel12.setText("Date:");
        jXPanel68.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jTextField80.setText(" ");
        jXPanel68.add(jTextField80, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 310, 20));

        jLabel13.setText("Position:");
        jXPanel68.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        jDateChooser3.setDate(new Date());
        jXPanel68.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 210, -1));

        jXPanel70.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jXPanel70.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 880, 90));

        jXPanel71.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel78.setText("Remarks/Annotation (For LCRO/OCRG/Shari'a Circuit Regisrar Use Only)");
        jXLabel78.setLineWrap(true);

        javax.swing.GroupLayout jXPanel71Layout = new javax.swing.GroupLayout(jXPanel71);
        jXPanel71.setLayout(jXPanel71Layout);
        jXPanel71Layout.setHorizontalGroup(
            jXPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel71Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jXLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jXPanel71Layout.setVerticalGroup(
            jXPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel71Layout.createSequentialGroup()
                .addComponent(jXLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jXPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jXPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jXPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jXPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jXPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jXPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(jXPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jXPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jXPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jXPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jXPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jXPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jXPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jXPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jXPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jXPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jXPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(jXPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jXPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(jXPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jXPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jXPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jXPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jButton3.setText("Previous");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Next");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Other Information", jPanel5);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel21.setText("I");

        jTextField7.setText(" ");

        jLabel19.setText("of legal age, Solemnizing Officer of");

        jTextField4.setText(" ");

        jLabel20.setText("with address at");

        jTextField5.setText(" ");

        jLabel22.setText("after having sworn to in accordance with the law, do hereby depose and say.");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel23.setText("1.) That i have solemnized the marriage between");

        jTextField8.setText(" ");

        jLabel24.setText("and");

        jTextField9.setText(" ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jCheckBox6.setText("a.) That i have ascertained the qualifications of the contracting parties and have found no legal impediment for them to marry as required by Article 34 of the Family Code;");

        jCheckBox7.setText("b.) That this marriage was performed in articulo mortis or at the point of death;");

        jCheckBox8.setText("c.) That the contracting party/ies");

        jTextField10.setText(" ");

        jLabel25.setText("and");

        jTextField11.setText(" ");

        jLabel26.setText("death and physically unable to sign the foregoing certificate of marriage by signature of mark, one of the witnesses to the marriage; sign for him or her by writing the dying party's name and beneath");

        jLabel27.setText("it, the witness' own signature preceded by the preposition \"By\"");

        jCheckBox9.setText("d.) That the residence of either party is so located that there is no means of transportation to enable concerned party/parties to appear personally before the civil registrar");

        jCheckBox10.setText("e.) That the marriage was among Muslims or among members of the Ethnic Cultural Communities and that neither of them are under any legal in accordance with their customs and practices");

        jLabel28.setText("2.)");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox8)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel29.setText("3.) That i look the neccesary steps to ascertain the ages and relationships of the contracting parties and that neither of them are under any legal impediment to marry each other;");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel30.setText("4.) That i am executing this affidavit to attest to the truthfulness of the foregoing statements for all lega intents and purposes.");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel31.setText("In truth whereof, I have affixed my signature below this");

        jDateChooser7.setDate(new Date());

        jLabel32.setText("at");

        jTextField12.setText(" ");

        jLabel33.setText("SUBSCRIBED AND SWORN to before me this");

        jDateChooser8.setDate(new Date());

        jLabel34.setText("at");

        jTextField13.setText(" ");

        jLabel35.setText(", Philippines, affiant who exhibited to me his Community Tax Certificate");

        jTextField18.setText(" ");

        jLabel36.setText("issued on");

        jDateChooser9.setDate(new Date());

        jLabel37.setText("at");

        jTextField19.setText(" ");

        jLabel38.setText("Administering Officer");

        jTextField20.setText(" ");

        jLabel39.setText("Position/Title/Designation");

        jTextField21.setText(" ");

        jTextField43.setText(" ");

        jLabel40.setText("Address:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField13))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField43)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton8.setText("Next");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Previous");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Affidavit of Solemnizing Officer", jPanel9);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel41.setText("I");

        jTextField55.setText(" ");

        jLabel42.setText("of legal age, single/married/divorced/widow/widower, the residence and postal address");

        jTextField71.setText(" ");

        jLabel44.setText(", after having duly sworn in accordance with law do hereby depose and say:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel42))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel43.setText("1.) That i am the applicant for the delayed registration of");

        jTextField74.setText(" ");

        jCheckBox11.setText(" my marriage with");

        jLabel45.setText("in");

        jTextField75.setText(" ");

        jLabel46.setText("on");

        jDateChooser10.setDate(new Date());

        jCheckBox12.setText(" the marriage between");

        jTextField79.setText(" ");

        jLabel47.setText("and");

        jTextField81.setText(" ");

        jLabel48.setText("in");

        jTextField82.setText(" ");

        jLabel49.setText("on");

        jDateChooser11.setDate(new Date());

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel43))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jCheckBox12)
                                        .addGap(4, 4, 4)
                                        .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField81))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jCheckBox11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox11)
                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox12)
                    .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel50.setText("2.) That said marriage was solemnized by");

        jTextField83.setText(" ");

        jLabel51.setText("( Solemnizing Officer's name) under");

        jCheckBox13.setText("a. religious ceremony");

        jCheckBox14.setText("b. civil ceremony");

        jCheckBox15.setText("Muslim rites");

        jCheckBox16.setText("tribal rites");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jCheckBox13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel52.setText("3.) That the marriage was solemnized:");

        jTextField84.setText(" ");

        jCheckBox17.setText("a. with marriage license no.");

        jLabel53.setText("at");

        jTextField85.setText(" ");

        jLabel54.setText("on");

        jDateChooser12.setDate(new Date());

        jCheckBox18.setText("b. under article");

        jTextField86.setText(" ");

        jLabel55.setText("(marriages of exceptional character)");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                .addComponent(jCheckBox18)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel55))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jCheckBox17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox17)
                            .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(1, 1, 1)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox18)
                    .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel56.setText("4.) (If the applicant is either the wife or husband) That i am a citizen of");

        jTextField87.setText(" ");

        jLabel57.setText("and my spouse is a citizen of");

        jTextField88.setText(" ");

        jLabel58.setText("(If the applicant is other that the wife or husband) That the wife is a citizen of");

        jTextField89.setText(" ");

        jLabel59.setText("and the husband");

        jLabel60.setText("is a citizen of");

        jTextField90.setText(" ");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField90))
                            .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField89)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel59)))))
                .addGap(89, 89, 89))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel61.setText("5.) That the reason for the delay in registering our/their marriage is");

        jTextField92.setText(" ");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel62.setText("6.) That i am executing this affidavit to attest to the truthfulness of the foregoing statements for all legal intents and purposes.");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel63.setText("In truth whereof, I have affixed my signature below this");

        jDateChooser13.setDate(new Date());

        jLabel64.setText("at");

        jTextField70.setText(" ");

        jLabel65.setText("SUBSCRIBED AND SWORN to before me this");

        jDateChooser14.setDate(new Date());

        jLabel66.setText("at");

        jTextField91.setText(" ");

        jLabel67.setText(", Philippines, affiant who exhibited to me his Community Tax Certificate");

        jTextField93.setText(" ");

        jLabel68.setText("issued on");

        jDateChooser15.setDate(new Date());

        jLabel69.setText("at");

        jTextField94.setText(" ");

        jLabel70.setText("Administering Officer");

        jTextField95.setText(" ");

        jLabel71.setText("Position/Title/Designation");

        jTextField96.setText(" ");

        jTextField97.setText(" ");

        jLabel72.setText("Address:");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField70))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jDateChooser14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField91))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField97)))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Previous");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Affidavit of Delayed Reg. of Marriage", jPanel10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ok();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tf_h_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_h_fnameKeyReleased
        // TODO add your handling code here:
        type_name();
    }//GEN-LAST:event_tf_h_fnameKeyReleased

    private void tf_h_miKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_h_miKeyReleased
        // TODO add your handling code here:
        type_name();
    }//GEN-LAST:event_tf_h_miKeyReleased

    private void tf_h_lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_h_lnameKeyReleased
        // TODO add your handling code here:
        type_name();
    }//GEN-LAST:event_tf_h_lnameKeyReleased

    private void tf_w_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_w_fnameKeyReleased
        // TODO add your handling code here:
        type_name();
    }//GEN-LAST:event_tf_w_fnameKeyReleased

    private void tf_w_miKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_w_miKeyReleased
        // TODO add your handling code here:
        type_name();
    }//GEN-LAST:event_tf_w_miKeyReleased

    private void tf_w_lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_w_lnameKeyReleased
        // TODO add your handling code here:
        type_name();
    }//GEN-LAST:event_tf_w_lnameKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_ccp1;
    private javax.swing.JCheckBox cb_ccp2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser11;
    private com.toedter.calendar.JDateChooser jDateChooser12;
    private com.toedter.calendar.JDateChooser jDateChooser13;
    private com.toedter.calendar.JDateChooser jDateChooser14;
    private com.toedter.calendar.JDateChooser jDateChooser15;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private com.toedter.calendar.JDateChooser jDateChooser9;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField102;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel13;
    private org.jdesktop.swingx.JXLabel jXLabel14;
    private org.jdesktop.swingx.JXLabel jXLabel15;
    private org.jdesktop.swingx.JXLabel jXLabel16;
    private org.jdesktop.swingx.JXLabel jXLabel17;
    private org.jdesktop.swingx.JXLabel jXLabel18;
    private org.jdesktop.swingx.JXLabel jXLabel19;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel20;
    private org.jdesktop.swingx.JXLabel jXLabel21;
    private org.jdesktop.swingx.JXLabel jXLabel22;
    private org.jdesktop.swingx.JXLabel jXLabel23;
    private org.jdesktop.swingx.JXLabel jXLabel24;
    private org.jdesktop.swingx.JXLabel jXLabel25;
    private org.jdesktop.swingx.JXLabel jXLabel26;
    private org.jdesktop.swingx.JXLabel jXLabel27;
    private org.jdesktop.swingx.JXLabel jXLabel28;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel31;
    private org.jdesktop.swingx.JXLabel jXLabel32;
    private org.jdesktop.swingx.JXLabel jXLabel33;
    private org.jdesktop.swingx.JXLabel jXLabel34;
    private org.jdesktop.swingx.JXLabel jXLabel39;
    private org.jdesktop.swingx.JXLabel jXLabel40;
    private org.jdesktop.swingx.JXLabel jXLabel41;
    private org.jdesktop.swingx.JXLabel jXLabel42;
    private org.jdesktop.swingx.JXLabel jXLabel43;
    private org.jdesktop.swingx.JXLabel jXLabel44;
    private org.jdesktop.swingx.JXLabel jXLabel45;
    private org.jdesktop.swingx.JXLabel jXLabel46;
    private org.jdesktop.swingx.JXLabel jXLabel47;
    private org.jdesktop.swingx.JXLabel jXLabel48;
    private org.jdesktop.swingx.JXLabel jXLabel49;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel50;
    private org.jdesktop.swingx.JXLabel jXLabel51;
    private org.jdesktop.swingx.JXLabel jXLabel52;
    private org.jdesktop.swingx.JXLabel jXLabel53;
    private org.jdesktop.swingx.JXLabel jXLabel54;
    private org.jdesktop.swingx.JXLabel jXLabel55;
    private org.jdesktop.swingx.JXLabel jXLabel56;
    private org.jdesktop.swingx.JXLabel jXLabel57;
    private org.jdesktop.swingx.JXLabel jXLabel58;
    private org.jdesktop.swingx.JXLabel jXLabel59;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel60;
    private org.jdesktop.swingx.JXLabel jXLabel61;
    private org.jdesktop.swingx.JXLabel jXLabel62;
    private org.jdesktop.swingx.JXLabel jXLabel63;
    private org.jdesktop.swingx.JXLabel jXLabel64;
    private org.jdesktop.swingx.JXLabel jXLabel65;
    private org.jdesktop.swingx.JXLabel jXLabel66;
    private org.jdesktop.swingx.JXLabel jXLabel67;
    private org.jdesktop.swingx.JXLabel jXLabel68;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel71;
    private org.jdesktop.swingx.JXLabel jXLabel72;
    private org.jdesktop.swingx.JXLabel jXLabel73;
    private org.jdesktop.swingx.JXLabel jXLabel74;
    private org.jdesktop.swingx.JXLabel jXLabel75;
    private org.jdesktop.swingx.JXLabel jXLabel76;
    private org.jdesktop.swingx.JXLabel jXLabel78;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel10;
    private org.jdesktop.swingx.JXPanel jXPanel11;
    private org.jdesktop.swingx.JXPanel jXPanel12;
    private org.jdesktop.swingx.JXPanel jXPanel13;
    private org.jdesktop.swingx.JXPanel jXPanel14;
    private org.jdesktop.swingx.JXPanel jXPanel15;
    private org.jdesktop.swingx.JXPanel jXPanel16;
    private org.jdesktop.swingx.JXPanel jXPanel17;
    private org.jdesktop.swingx.JXPanel jXPanel18;
    private org.jdesktop.swingx.JXPanel jXPanel19;
    private org.jdesktop.swingx.JXPanel jXPanel20;
    private org.jdesktop.swingx.JXPanel jXPanel21;
    private org.jdesktop.swingx.JXPanel jXPanel22;
    private org.jdesktop.swingx.JXPanel jXPanel23;
    private org.jdesktop.swingx.JXPanel jXPanel24;
    private org.jdesktop.swingx.JXPanel jXPanel25;
    private org.jdesktop.swingx.JXPanel jXPanel26;
    private org.jdesktop.swingx.JXPanel jXPanel27;
    private org.jdesktop.swingx.JXPanel jXPanel28;
    private org.jdesktop.swingx.JXPanel jXPanel29;
    private org.jdesktop.swingx.JXPanel jXPanel30;
    private org.jdesktop.swingx.JXPanel jXPanel31;
    private org.jdesktop.swingx.JXPanel jXPanel32;
    private org.jdesktop.swingx.JXPanel jXPanel33;
    private org.jdesktop.swingx.JXPanel jXPanel34;
    private org.jdesktop.swingx.JXPanel jXPanel35;
    private org.jdesktop.swingx.JXPanel jXPanel36;
    private org.jdesktop.swingx.JXPanel jXPanel37;
    private org.jdesktop.swingx.JXPanel jXPanel38;
    private org.jdesktop.swingx.JXPanel jXPanel39;
    private org.jdesktop.swingx.JXPanel jXPanel4;
    private org.jdesktop.swingx.JXPanel jXPanel40;
    private org.jdesktop.swingx.JXPanel jXPanel41;
    private org.jdesktop.swingx.JXPanel jXPanel42;
    private org.jdesktop.swingx.JXPanel jXPanel43;
    private org.jdesktop.swingx.JXPanel jXPanel44;
    private org.jdesktop.swingx.JXPanel jXPanel45;
    private org.jdesktop.swingx.JXPanel jXPanel46;
    private org.jdesktop.swingx.JXPanel jXPanel47;
    private org.jdesktop.swingx.JXPanel jXPanel48;
    private org.jdesktop.swingx.JXPanel jXPanel49;
    private org.jdesktop.swingx.JXPanel jXPanel5;
    private org.jdesktop.swingx.JXPanel jXPanel50;
    private org.jdesktop.swingx.JXPanel jXPanel51;
    private org.jdesktop.swingx.JXPanel jXPanel52;
    private org.jdesktop.swingx.JXPanel jXPanel53;
    private org.jdesktop.swingx.JXPanel jXPanel54;
    private org.jdesktop.swingx.JXPanel jXPanel55;
    private org.jdesktop.swingx.JXPanel jXPanel56;
    private org.jdesktop.swingx.JXPanel jXPanel57;
    private org.jdesktop.swingx.JXPanel jXPanel58;
    private org.jdesktop.swingx.JXPanel jXPanel59;
    private org.jdesktop.swingx.JXPanel jXPanel6;
    private org.jdesktop.swingx.JXPanel jXPanel60;
    private org.jdesktop.swingx.JXPanel jXPanel61;
    private org.jdesktop.swingx.JXPanel jXPanel62;
    private org.jdesktop.swingx.JXPanel jXPanel63;
    private org.jdesktop.swingx.JXPanel jXPanel64;
    private org.jdesktop.swingx.JXPanel jXPanel65;
    private org.jdesktop.swingx.JXPanel jXPanel66;
    private org.jdesktop.swingx.JXPanel jXPanel67;
    private org.jdesktop.swingx.JXPanel jXPanel68;
    private org.jdesktop.swingx.JXPanel jXPanel7;
    private org.jdesktop.swingx.JXPanel jXPanel70;
    private org.jdesktop.swingx.JXPanel jXPanel71;
    private org.jdesktop.swingx.JXPanel jXPanel8;
    private org.jdesktop.swingx.JXPanel jXPanel9;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_h_fname;
    private javax.swing.JTextField tf_h_lname;
    private javax.swing.JTextField tf_h_mi;
    private javax.swing.JTextField tf_place_of_marriage;
    private javax.swing.JTextField tf_province;
    private javax.swing.JTextField tf_registry_no;
    private javax.swing.JTextField tf_time_of_marriage;
    private javax.swing.JTextField tf_w_fname;
    private javax.swing.JTextField tf_w_lname;
    private javax.swing.JTextField tf_w_mi;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        get_fields();
    }

    int ids = 0;

    public void do_pass(Marriage_contracts.to_marriage_contracts to) {
        ids = to.id;
        tf_province.setText(to.province);
        tf_city.setText(to.city);
        tf_registry_no.setText(to.registry_no);

        tf_h_fname.setText(to.h_fname);
        tf_h_mi.setText(to.h_mi);
        tf_h_lname.setText(to.h_lname);
        Date h_bday;
        try {
            h_bday = DateType.sf.parse(to.h_bday);
            jDateChooser4.setDate(h_bday);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] h_place_of_birth = to.h_place_of_birth.split("%");
        jTextField37.setText(h_place_of_birth[0]);
        jTextField40.setText(h_place_of_birth[1]);
        jTextField41.setText(h_place_of_birth[2]);
        String[] h_citizenship = to.h_citizenship.split("%");
        jTextField28.setText(h_citizenship[0]);
        jTextField29.setText(h_citizenship[1]);
        jTextField36.setText(to.h_residence);
        jTextField42.setText(to.h_religion);
        jTextField44.setText(to.h_civil_status);
        String[] h_father = to.h_father.split("%");
        jTextField45.setText(h_father[0]);
        jTextField50.setText(h_father[1]);
        jTextField51.setText(h_father[2]);
        jTextField65.setText(to.h_father_citizenship);
        String[] h_mother = to.h_mother.split("%");
        jTextField59.setText(h_mother[0]);
        jTextField60.setText(h_mother[1]);
        jTextField61.setText(h_mother[2]);
        jTextField76.setText(to.h_mother_citizenship);
        String[] h_consent_by = to.h_consent_by.split("%");
        jTextField62.setText(h_consent_by[0]);
        jTextField64.setText(h_consent_by[1]);
        jTextField69.setText(h_consent_by[2]);
        jTextField67.setText(to.h_consent_by_relation);
        jTextField72.setText(to.h_consent_by_residence);
        //-------- wife --------

        tf_w_fname.setText(to.w_fname);
        tf_w_mi.setText(to.w_mi);
        tf_w_lname.setText(to.w_lname);
        Date w_bday;
        try {
            w_bday = DateType.sf.parse(to.w_bday);
            jDateChooser5.setDate(w_bday);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] w_place_of_birth = to.w_place_of_birth.split("%");
        jTextField14.setText(w_place_of_birth[0]);
        jTextField15.setText(w_place_of_birth[1]);
        jTextField16.setText(w_place_of_birth[2]);
        String[] w_citizenship = to.w_citizenship.split("%");
        jTextField17.setText(w_citizenship[0]);
        jTextField23.setText(w_citizenship[1]);
        jTextField22.setText(to.w_residence);
        jTextField34.setText(to.w_religion);
        jTextField30.setText(to.w_civil_status);
        String[] w_father = to.w_father.split("%");
        jTextField24.setText(w_father[0]);
        jTextField25.setText(w_father[1]);
        jTextField26.setText(w_father[2]);
        jTextField46.setText(to.w_father_citizenship);
        String[] w_mother = to.w_mother.split("%");
        jTextField31.setText(w_mother[0]);
        jTextField38.setText(w_mother[1]);
        jTextField39.setText(w_mother[2]);
        jTextField57.setText(to.w_mother_citizenship);
        String[] w_consent_by = to.w_consent_by.split("%");
        jTextField52.setText(w_consent_by[0]);
        jTextField53.setText(w_consent_by[1]);
        jTextField54.setText(w_consent_by[2]);
        jTextField48.setText(to.w_consent_by_relation);
        jTextField32.setText(to.w_consent_by_residence);
        //------------------end--------------------
        tf_place_of_marriage.setText(to.place_of_marriage);
        try {
            Date date_of_marriage = DateType.sf.parse(to.date_of_marriage);
            jDateChooser6.setDate(date_of_marriage);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }
        tf_time_of_marriage.setText(to.time_of_marriage);
        String[] cert1 = to.certification_contracting_parties.split("%");
        System.out.println("Cert: " + cert1[0]);
        if (cert1[0].equals("1")) {
            cb_ccp2.setSelected(true);
        } else {
            cb_ccp1.setSelected(true);
        }

        String[] cert2 = to.certification_solemnizing_parties.split("%");
        if (cert2[0].equals("1")) {
            jCheckBox4.setSelected(true);
        } else {
            jCheckBox4.setSelected(false);
        }
        jTextField1.setText(cert2[1]);
        try {
            Date date = DateType.sf.parse(cert2[2]);
            jDateChooser1.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField2.setText(cert2[3]);

        if (cert2[4].equals("1")) {
            jCheckBox5.setSelected(true);
        } else {
            jCheckBox5.setSelected(false);
        }

        jTextField3.setText(cert2[5]);

        if (cert2[6].equals("1")) {
            jCheckBox3.setSelected(true);
        } else {
            jCheckBox3.setSelected(false);
        }

        jTextField6.setText(cert2[7]);
        jTextField27.setText(cert2[8]);
        jTextField33.setText(cert2[9]);

        String[] received_by = to.received_by.split("%");
        jTextField63.setText(received_by[0]);
        jTextField73.setText(received_by[1]);
        try {
            Date date = DateType.sf.parse(received_by[2]);
            jDateChooser2.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] registered_by = to.registered_by.split("%");
        jTextField78.setText(registered_by[0]);
        jTextField80.setText(registered_by[1]);
        try {
            Date date = DateType.sf.parse(registered_by[2]);
            jDateChooser3.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea1.setText(to.remarks);

        jTextField7.setText(to.solem_officer);
        jTextField4.setText(to.solem_of);
        jTextField5.setText(to.solem_at);

        String[] solem_one = to.solem_one.split("%");
        jTextField8.setText(solem_one[0]);
        jTextField9.setText(solem_one[1]);
        String[] solem_two = to.solem_two.split("%");
        if (solem_two[0].equals("1")) {
            jCheckBox6.setSelected(true);
        } else {
            jCheckBox6.setSelected(false);
        }
        if (solem_two[1].equals("1")) {
            jCheckBox7.setSelected(true);
        } else {
            jCheckBox7.setSelected(false);
        }
        if (solem_two[2].equals("1")) {
            jCheckBox8.setSelected(true);
        } else {
            jCheckBox8.setSelected(false);
        }
        jTextField10.setText(solem_two[3]);
        jTextField11.setText(solem_two[4]);
        if (solem_two[5].equals("1")) {
            jCheckBox9.setSelected(true);
        } else {
            jCheckBox9.setSelected(false);
        }
        if (solem_two[6].equals("1")) {
            jCheckBox10.setSelected(true);
        } else {
            jCheckBox10.setSelected(false);
        }
        String[] solem_administer = to.solem_administer.split("%");

        try {

            Date d1 = DateType.sf.parse(solem_administer[0]);
            jDateChooser7.setDate(d1);
            jTextField12.setText(solem_administer[1]);
            Date d2 = DateType.sf.parse(solem_administer[2]);
            jDateChooser8.setDate(d2);
            jTextField13.setText(solem_administer[3]);
            jTextField18.setText(solem_administer[4]);
            Date d3 = DateType.sf.parse(solem_administer[5]);
            jDateChooser9.setDate(d3);

            jTextField19.setText(solem_administer[6]);
            jTextField20.setText(solem_administer[7]);
            jTextField21.setText(solem_administer[8]);
            jTextField43.setText(solem_administer[9]);

        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTextField55.setText(to.affid_by);
        jTextField71.setText(to.affid_address);
        String[] affid_one = to.affid_one.split("%");
        if (affid_one[0].equals("1")) {
            jCheckBox11.setSelected(true);
        } else {
            jCheckBox11.setSelected(false);
        }
        jTextField74.setText(affid_one[1]);
        jTextField75.setText(affid_one[2]);
        try {
            Date d1 = DateType.sf.parse(affid_one[3]);
            Date d2 = DateType.sf.parse(affid_one[8]);
            jDateChooser10.setDate(d1);
            if (affid_one[4].equals("1")) {
                jCheckBox12.setSelected(true);
            } else {
                jCheckBox12.setSelected(false);
            }
            jTextField79.setText(affid_one[5]);
            jTextField81.setText(affid_one[6]);
            jTextField82.setText(affid_one[7]);
            jDateChooser11.setDate(d2);

        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] affid_two = to.affid_two.split("%");
        jTextField83.setText(affid_two[0]);
        jCheckBox13.setSelected(true);
        jCheckBox14.setSelected(true);
        jCheckBox15.setSelected(true);
        jCheckBox16.setSelected(true);
        if (affid_two[1].equals("0")) {
            jCheckBox13.setSelected(false);
        }
        if (affid_two[2].equals("0")) {
            jCheckBox14.setSelected(false);
        }
        if (affid_two[3].equals("0")) {
            jCheckBox15.setSelected(false);
        }
        if (affid_two[4].equals("0")) {
            jCheckBox16.setSelected(false);
        }
        String[] affid_three = to.affid_three.split("%");
        jCheckBox17.setSelected(true);
        if (affid_three[0].equals("0")) {
            jCheckBox17.setSelected(false);
        }
        jTextField84.setText(affid_three[1]);
        try {
            Date d = DateType.sf.parse(affid_three[2]);
            jDateChooser12.setDate(d);
            jTextField85.setText(affid_three[3]);
            jCheckBox18.setSelected(true);
            if (affid_three[4].equals("0")) {
                jCheckBox18.setSelected(false);
            }
            jTextField86.setText(affid_three[5]);

        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] affid_four = to.affid_four.split("%");
        jTextField87.setText(affid_four[0]);
        jTextField88.setText(affid_four[1]);
        jTextField89.setText(affid_four[2]);
        jTextField90.setText(affid_four[3]);
        jTextField92.setText(to.affid_five);

        String[] affid_administer = to.affid_administer.split("%");
        try {

            Date d1 = DateType.sf.parse(affid_administer[0]);
            jDateChooser13.setDate(d1);
            jTextField70.setText(affid_administer[1]);
            Date d2 = DateType.sf.parse(affid_administer[2]);
            jDateChooser14.setDate(d2);
            jTextField91.setText(affid_administer[3]);
            jTextField93.setText(affid_administer[4]);
            Date d3 = DateType.sf.parse(affid_administer[5]);
            jDateChooser15.setDate(d3);

            jTextField94.setText(affid_administer[6]);
            jTextField95.setText(affid_administer[7]);
            jTextField96.setText(affid_administer[8]);
            jTextField97.setText(affid_administer[9]);

        } catch (ParseException ex) {
            Logger.getLogger(Dlg_marriage_contract_add.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] witnesses = to.witnesses.split("%");
        jTextField35.setText(witnesses[0]);
        jTextField98.setText(witnesses[1]);
        jTextField99.setText(witnesses[2]);
        jTextField100.setText(witnesses[3]);
        jTextField104.setText(witnesses[4]);
        jTextField103.setText(witnesses[5]);
        jTextField102.setText(witnesses[6]);
        jTextField101.setText(witnesses[7]);
        jTextField106.setText(witnesses[8]);
        jTextField105.setText(witnesses[9]);
        jTextField107.setText(witnesses[10]);
        jTextField108.setText(witnesses[11]);
    }

    private void focus() {
        JTextField[] tf = {};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
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

    private void get_fields() {
        JTextField[] tf = {};
        JPanel[] pnl = {jPanel8, jPanel2, jPanel6, jPanel9, jPanel10};
        for (JPanel p : pnl) {
            for (Component c : p.getComponents()) {
                if (c instanceof JTextField) {
                    Focus_Fire.onFocus_lostFocus2(((JTextField) c));
                    Focus_Fire.select_all2(((JTextField) c));
                }
                if (c instanceof JPanel) {
                    for (Component c2 : ((JPanel) c).getComponents()) {
                        if (c2 instanceof JTextField) {
                            Focus_Fire.onFocus_lostFocus2(((JTextField) c2));
                            Focus_Fire.select_all2(((JTextField) c2));
                        }

                        if (c2 instanceof JPanel) {

                            for (Component c3 : ((JPanel) c2).getComponents()) {
                                if (c3 instanceof JTextField) {
                                    Focus_Fire.onFocus_lostFocus2(((JTextField) c3));
                                    Focus_Fire.select_all2(((JTextField) c3));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void type_name() {
        String husband = tf_h_fname.getText() + " " + tf_h_mi.getText() + " " + tf_h_lname.getText();
        String wife = tf_w_fname.getText() + " " + tf_w_mi.getText() + " " + tf_w_lname.getText();

        jTextField8.setText(husband);
        jTextField9.setText(wife);

        jTextField10.setText(husband);
        jTextField11.setText(wife);
    }

    private void ok() {
        int id = ids;
        String province = tf_province.getText();
        String city = tf_city.getText();
        String registry_no = tf_registry_no.getText();
        String place_of_marriage = tf_place_of_marriage.getText();
        String date_of_marriage = DateType.sf.format(jDateChooser6.getDate());
        String time_of_marriage = tf_time_of_marriage.getText();
        String certification_contracting_parties = "";
        if (cb_ccp2.isSelected()) {
            certification_contracting_parties = "1";
        } else {
            certification_contracting_parties = "0";
        }

        if (cb_ccp1.isSelected()) {
            certification_contracting_parties = certification_contracting_parties + "%1";
        } else {
            certification_contracting_parties = certification_contracting_parties + "%0";
        }
        System.out.println(certification_contracting_parties);
        String certification_solemnizing_parties = "";
        if (jCheckBox4.isSelected()) {
            certification_solemnizing_parties = "1%" + jTextField1.getText() + "%" + DateType.sf.format(jDateChooser1.getDate()) + "%" + jTextField2.getText();
        } else {
            certification_solemnizing_parties = "0%" + jTextField1.getText() + "%" + DateType.sf.format(jDateChooser1.getDate()) + "%" + jTextField2.getText();
        }
        if (jCheckBox5.isSelected()) {
            certification_solemnizing_parties = certification_solemnizing_parties + "%1%" + jTextField3.getText();
        } else {
            certification_solemnizing_parties = certification_solemnizing_parties + "%0%" + jTextField3.getText();
        }
        if (jCheckBox3.isSelected()) {
            certification_solemnizing_parties = certification_solemnizing_parties + "%1%" + jTextField6.getText() + "%" + jTextField27.getText() + "%" + jTextField33.getText();
        } else {
            certification_solemnizing_parties = certification_solemnizing_parties + "%0%" + jTextField6.getText() + "%" + jTextField27.getText() + "%" + jTextField33.getText();
        }
        String witnesses = jTextField35.getText() + "%" + jTextField98.getText() + "%" + jTextField99.getText() + "%" + jTextField100.getText()
                + "%" + jTextField104.getText() + "%" + jTextField103.getText() + "%" + jTextField102.getText()
                + "%" + jTextField101.getText() + "%" + jTextField106.getText() + "%" + jTextField105.getText() + "%" + jTextField107.getText() + "%" + jTextField108.getText();
        String received_by = jTextField63.getText() + "%" + jTextField73.getText() + "%" + DateType.sf.format(jDateChooser2.getDate());
        String registered_by = jTextField78.getText() + "%" + jTextField80.getText() + "%" + DateType.sf.format(jDateChooser3.getDate());
        String remarks = jTextArea1.getText();
        int status = 0;
        String date_added = DateType.datetime.format(new Date());
        String added_by = "";
        String h_ref_no = "";
        String h_fname = tf_h_fname.getText();
        String h_mi = tf_h_mi.getText();
        String h_lname = tf_h_lname.getText();
        String h_bday = DateType.sf.format(jDateChooser4.getDate());
        String h_place_of_birth = jTextField37.getText() + "%" + jTextField40.getText() + "%" + jTextField41.getText();
        String h_citizenship = jTextField28.getText() + "%" + jTextField29.getText();
        String h_residence = jTextField36.getText();
        String h_religion = jTextField42.getText();
        String h_civil_status = jTextField44.getText();
        String h_father = jTextField45.getText() + "%" + jTextField50.getText() + "%" + jTextField51.getText();
        String h_father_citizenship = jTextField65.getText();
        String h_mother = jTextField59.getText() + "%" + jTextField60.getText() + "%" + jTextField61.getText();
        String h_mother_citizenship = jTextField76.getText();
        String h_consent_by = jTextField62.getText() + "%" + jTextField64.getText() + "%" + jTextField69.getText();
        String h_consent_by_relation = jTextField67.getText();
        String h_consent_by_residence = jTextField72.getText();
        String w_ref_no = "";
        String w_fname = tf_w_fname.getText();
        String w_mi = tf_w_mi.getText();
        String w_lname = tf_w_lname.getText();
        String w_bday = DateType.sf.format(jDateChooser5.getDate());
        String w_place_of_birth = jTextField14.getText() + "%" + jTextField15.getText() + "%" + jTextField16.getText();
        String w_citizenship = jTextField17.getText() + "%" + jTextField23.getText();
        String w_residence = jTextField22.getText();
        String w_religion = jTextField34.getText();
        String w_civil_status = jTextField30.getText();
        String w_father = jTextField24.getText() + "%" + jTextField25.getText() + "%" + jTextField26.getText();
        String w_father_citizenship = jTextField46.getText();
        String w_mother = jTextField31.getText() + "%" + jTextField38.getText() + "%" + jTextField39.getText();
        String w_mother_citizenship = jTextField57.getText();
        String w_consent_by = jTextField52.getText() + "%" + jTextField53.getText() + "%" + jTextField54.getText();
        String w_consent_by_relation = jTextField48.getText();
        String w_consent_by_residence = jTextField32.getText();

        String solem_officer = jTextField7.getText();
        String solem_of = jTextField4.getText();
        String solem_at = jTextField5.getText();
        String solem_one = jTextField8.getText() + "%" + jTextField9.getText();
        String solem_two = "";
        if (jCheckBox6.isSelected()) {
            solem_two = "1";
        } else {
            solem_two = "0";
        }
        if (jCheckBox7.isSelected()) {
            solem_two = solem_two + "%" + "1";
        } else {
            solem_two = solem_two + "%" + "0";
        }
        if (jCheckBox8.isSelected()) {
            solem_two = solem_two + "%" + "1" + "%" + jTextField10.getText() + "%" + jTextField11.getText();
        } else {
            solem_two = solem_two + "%" + "0" + "%" + jTextField10.getText() + "%" + jTextField11.getText();
        }
        if (jCheckBox9.isSelected()) {
            solem_two = solem_two + "%" + "1";
        } else {
            solem_two = solem_two + "%" + "0";
        }
        if (jCheckBox10.isSelected()) {
            solem_two = solem_two + "%" + "1";
        } else {
            solem_two = solem_two + "%" + "0";
        }

        String solem_administer = DateType.sf.format(jDateChooser7.getDate()) + "%" + jTextField12.getText() + "%" + DateType.sf.format(jDateChooser8.getDate());
        solem_administer = solem_administer + "%" + jTextField13.getText() + "%" + jTextField18.getText() + "%" + DateType.sf.format(jDateChooser9.getDate()) + "%" + jTextField19.getText();
        solem_administer = solem_administer + "%" + jTextField20.getText() + "%" + jTextField21.getText() + "%" + jTextField43.getText();
        String affid_by = jTextField55.getText();
        String affid_address = jTextField71.getText();
        String affid_one = "";
        if (jCheckBox11.isSelected()) {
            affid_one = "1" + "%" + jTextField74.getText() + "%" + jTextField75.getText() + "%" + DateType.sf.format(jDateChooser10.getDate());
        } else {
            affid_one = "0" + "%" + jTextField74.getText() + "%" + jTextField75.getText() + "%" + DateType.sf.format(jDateChooser10.getDate());
        }

        if (jCheckBox12.isSelected()) {
            affid_one = affid_one + "%" + "1" + "%" + jTextField79.getText() + "%" + jTextField81.getText() + "%" + jTextField82.getText() + "%" + DateType.sf.format(jDateChooser11.getDate());
        } else {
            affid_one = affid_one + "%" + "0" + "%" + jTextField79.getText() + "%" + jTextField81.getText() + "%" + jTextField82.getText() + "%" + DateType.sf.format(jDateChooser11.getDate());
        }
        String affid_two = jTextField83.getText();
        if (jCheckBox13.isSelected()) {
            affid_two = affid_two + "%" + "1";
        } else {
            affid_two = affid_two + "%" + "0";
        }
        if (jCheckBox14.isSelected()) {
            affid_two = affid_two + "%" + "1";
        } else {
            affid_two = affid_two + "%" + "0";
        }

        if (jCheckBox15.isSelected()) {
            affid_two = affid_two + "%" + "1";
        } else {
            affid_two = affid_two + "%" + "0";
        }
        if (jCheckBox16.isSelected()) {
            affid_two = affid_two + "%" + "1";
        } else {
            affid_two = affid_two + "%" + "0";
        }

        String affid_three = "";
        if (jCheckBox17.isSelected()) {
            affid_three = "1" + "%" + jTextField84.getText() + "%" + DateType.sf.format(jDateChooser12.getDate()) + "%" + jTextField85.getText();
        } else {
            affid_three = "0" + "%" + jTextField84.getText() + "%" + DateType.sf.format(jDateChooser12.getDate()) + "%" + jTextField85.getText();
        }
        if (jCheckBox18.isSelected()) {
            affid_three = affid_three + "%" + "1" + "%" + jTextField86.getText();
        } else {
            affid_three = affid_three + "%" + "0" + "%" + jTextField86.getText();
        }

        String affid_four = jTextField87.getText() + "%" + jTextField88.getText() + "%" + jTextField89.getText() + "%" + jTextField90.getText();
        String affid_five = jTextField92.getText();
        String affid_administer = DateType.sf.format(jDateChooser13.getDate()) + "%" + jTextField70.getText() + "%" + DateType.sf.format(jDateChooser14.getDate());
        affid_administer = affid_administer + "%" + jTextField91.getText() + "%" + jTextField93.getText() + "%" + DateType.sf.format(jDateChooser15.getDate()) + "%" + jTextField19.getText();
        affid_administer = affid_administer + "%" + jTextField95.getText() + "%" + jTextField96.getText() + "%" + jTextField97.getText();

        Marriage_contracts.to_marriage_contracts to = new Marriage_contracts.to_marriage_contracts(id, province, city, registry_no, place_of_marriage, date_of_marriage, time_of_marriage, certification_contracting_parties, certification_solemnizing_parties, witnesses, received_by, registered_by, remarks, status, date_added, added_by, h_ref_no, h_fname, h_mi, h_lname, h_bday, h_place_of_birth, h_citizenship, h_residence, h_religion, h_civil_status, h_father, h_father_citizenship, h_mother, h_mother_citizenship, h_consent_by, h_consent_by_relation, h_consent_by_residence, w_ref_no, w_fname, w_mi, w_lname, w_bday, w_place_of_birth, w_citizenship, w_residence, w_religion, w_civil_status, w_father, w_father_citizenship, w_mother, w_mother_citizenship, w_consent_by, w_consent_by_relation, w_consent_by_residence, solem_officer, solem_of, solem_at, solem_one, solem_two, solem_administer, affid_by, affid_address, affid_one, affid_two, affid_three, affid_four, affid_five, affid_administer);

        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(to));
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import mijzcx.synapse.desk.utils.TableWidthUtilities;

/**
 *
 * @author Maytopacka
 */
public class TableRenderer2 {

    private static Callback callback;

    public void setCallback(Callback callback) {
        TableRenderer2.callback = callback;
    }

    public static interface Callback {

        void ok(OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {

        public final String[] output;
        public final int selected_row;

        public OutputData(String[] output, int selected_row) {
            this.output = output;
            this.selected_row = selected_row;
        }
    }

    public static void setModel(JTable tbl, Object[][] obj, String[] col_names, int[] tbl_widths_customers1) {
        tbl.setModel(new javax.swing.table.DefaultTableModel(
                obj,
                col_names) {

            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        int[] tbl_widths_customers = tbl_widths_customers1;
        for (int i = 0, n = tbl_widths_customers.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl, i, tbl_widths_customers[i]);
        }
        tbl.setRowHeight(30);
        tbl.setFont(new java.awt.Font("Arial", 0, 11));
    }

    public static void setPopup(final JTextField tf, Object[][] obj, final JLabel[] labels, final int[] tbl_widths_customers, String[] col_names) {
        final JPopupMenu popup = new JPopupMenu();
        Dimension d = tf.getSize();
//        if (!tf.getText().
//                isEmpty()) {
        popup.setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(Color.white);
        JScrollPane pl = new JScrollPane();
        final JTable tbl = new JTable();
        TableRenderer2.setModel(tbl, obj, col_names, tbl_widths_customers);
        ///----------------
        pl.setViewportView(tbl);
        p.add(pl);
        popup.add(p); // your component
        popup.setPopupSize(d.width, 150);
        popup.show(tf, 0, tf.getHeight());
        tf.grabFocus();
        tf.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (tbl.getRowCount() != 0) {
                        tbl.setRowSelectionInterval(0, 0);
                        tbl.grabFocus();
                    }
                }
            }
        });
        tbl.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tbl.getSelectedRow();
                int i = 0;
                for (JLabel lbl : labels) {
                    lbl.setText(tbl.getModel().getValueAt(row, i).toString());
                    i++;
                }
                String[] output = new String[tbl_widths_customers.length];
                int u = 0;
                for (int y : tbl_widths_customers) {
                    output[u] = tbl.getModel().getValueAt(row, u).toString();
                    u++;
                }
                tf.grabFocus();
                popup.setVisible(false);
                ok1(output, row);
            }

        });
        tbl.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    int row = tbl.getSelectedRow();
                    tbl.removeRowSelectionInterval(row, row);
                    tf.grabFocus();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int row = tbl.getSelectedRow();
                    int i = 0;
                    for (JLabel lbl : labels) {
                        lbl.setText(tbl.getModel().
                                getValueAt(row, i).
                                toString());
                        i++;
                    }

                    String[] output = new String[tbl_widths_customers.length];
                    int u = 0;
                    for (int y : tbl_widths_customers) {
                        output[u] = tbl.getModel().
                                getValueAt(row, u).
                                toString();
//                            System.out.println(output[u]+ " asdad");
                        u++;
                    }
//                        System.out.println("asdadsadad");
                    tf.grabFocus();
                    popup.setVisible(false);

                    ok1(output, row);
                }
            }
        });
//        }
//        else {
//            popup.hide();
//            tf.grabFocus();
//        }
    }

    public static void setPopup2(final JTextField tf, Object[][] obj, final JLabel[] labels, final int[] tbl_widths_customers, String[] col_names, int width) {
        final JPopupMenu popup = new JPopupMenu();
        Dimension d = tf.getSize();
        popup.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(Color.white);
        JScrollPane pl = new JScrollPane();
        final JTable tbl = new JTable();
        TableRenderer2.setModel(tbl, obj, col_names, tbl_widths_customers);
        ///----------------
        pl.setViewportView(tbl);
        p.add(pl);
        popup.add(p); // your component
        popup.setPopupSize(width, 150);
        popup.show(tf, 0, tf.getHeight());
        tf.grabFocus();
        tf.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (tbl.getRowCount() != 0) {
                        tbl.setRowSelectionInterval(0, 0);
                        tbl.grabFocus();
                    }
                }
            }
        });
        tbl.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tbl.getSelectedRow();
                int i = 0;
                for (JLabel lbl : labels) {
                    lbl.setText(tbl.getModel().getValueAt(row, i).toString());
                    i++;
                }
                String[] output = new String[tbl_widths_customers.length];
                int u = 0;
                for (int y : tbl_widths_customers) {
                    output[u] = tbl.getModel().getValueAt(row, u).toString();
                    u++;
                }
                tf.grabFocus();
                popup.setVisible(false);
                ok1(output, row);
            }

        });
        tbl.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    int row = tbl.getSelectedRow();
                    tbl.removeRowSelectionInterval(row, row);
                    tf.grabFocus();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int row = tbl.getSelectedRow();
                    int i = 0;
                    for (JLabel lbl : labels) {
                        lbl.setText(tbl.getModel().getValueAt(row, i).toString());
                        i++;
                    }
                    String[] output = new String[tbl_widths_customers.length];
                    int u = 0;
                    for (int y : tbl_widths_customers) {
                        output[u] = tbl.getModel().getValueAt(row, u).toString();
                        u++;
                    }
                    tf.grabFocus();
                    popup.setVisible(false);
                    ok1(output, row);
                }
            }
        });
    }

    public static void setPopup4(final JTextField tf, Object[][] obj, final JLabel[] labels, final int[] tbl_widths_customers, String[] col_names, int width) {
        final JPopupMenu popup = new JPopupMenu();
        Dimension d = tf.getSize();
        popup.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(Color.white);
        JScrollPane pl = new JScrollPane();
        final JTable tbl = new JTable();
        TableRenderer2.setModel(tbl, obj, col_names, tbl_widths_customers);
        ///----------------
        pl.setViewportView(tbl);
        p.add(pl);
        popup.add(p); // your component
        popup.setPopupSize(width, 450);
        popup.show(tf, 0, tf.getHeight());
        tf.grabFocus();
        tf.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (tbl.getRowCount() != 0) {
                        tbl.setRowSelectionInterval(0, 0);
                        tbl.grabFocus();
                    }
                }
            }
        });
        tbl.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tbl.getSelectedRow();
                int i = 0;
                for (JLabel lbl : labels) {
                    lbl.setText(tbl.getModel().getValueAt(row, i).toString());
                    i++;
                }
                String[] output = new String[tbl_widths_customers.length];
                int u = 0;
                for (int y : tbl_widths_customers) {
                    output[u] = tbl.getModel().getValueAt(row, u).toString();
                    u++;
                }
                tf.grabFocus();
                popup.setVisible(false);
                ok1(output, row);
            }

        });
        tbl.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    int row = tbl.getSelectedRow();
                    tbl.removeRowSelectionInterval(row, row);
                    tf.grabFocus();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int row = tbl.getSelectedRow();
                    int i = 0;
                    for (JLabel lbl : labels) {
                        lbl.setText(tbl.getModel().getValueAt(row, i).toString());
                        i++;
                    }
                    String[] output = new String[tbl_widths_customers.length];
                    int u = 0;
                    for (int y : tbl_widths_customers) {
                        output[u] = tbl.getModel().getValueAt(row, u).toString();
                        u++;
                    }
                    tf.grabFocus();
                    popup.setVisible(false);
                    ok1(output, row);
                }
            }
        });
    }

    public static void setPopup3(final JTextField tf, Object[][] obj, final JLabel[] labels, final int[] tbl_widths_customers, String[] col_names, int width) {
        final JPopupMenu popup = new JPopupMenu();
        Dimension d = tf.getSize();
        popup.setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBackground(Color.white);
        JScrollPane pl = new JScrollPane();
        final JTable tbl = new JTable();
        TableRenderer2.setModel(tbl, obj, col_names, tbl_widths_customers);
        ///----------------
        pl.setViewportView(tbl);
        p.add(pl);
        popup.add(p); // your component
        popup.setPopupSize(width, 350);
        popup.show(tf, 0, tf.getHeight());
        tf.grabFocus();
        tf.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (tbl.getRowCount() != 0) {
                        tbl.setRowSelectionInterval(0, 0);
                        tbl.grabFocus();
                    }
                }
            }
        });
        tbl.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tbl.getSelectedRow();
                int i = 0;
                for (JLabel lbl : labels) {
                    lbl.setText(tbl.getModel().getValueAt(row, i).toString());
                    i++;
                }
                String[] output = new String[tbl_widths_customers.length];
                int u = 0;
                for (int y : tbl_widths_customers) {
                    output[u] = tbl.getModel().getValueAt(row, u).toString();
                    u++;
                }
                tf.grabFocus();
                popup.setVisible(false);
                ok1(output, row);
            }

        });
        tbl.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    int row = tbl.getSelectedRow();
                    tbl.removeRowSelectionInterval(row, row);
                    tf.grabFocus();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int row = tbl.getSelectedRow();
                    int i = 0;
                    for (JLabel lbl : labels) {
                        lbl.setText(tbl.getModel().getValueAt(row, i).toString());
                        i++;
                    }
                    String[] output = new String[tbl_widths_customers.length];
                    int u = 0;
                    for (int y : tbl_widths_customers) {
                        output[u] = tbl.getModel().getValueAt(row, u).toString();
                        u++;
                    }
                    tf.grabFocus();
                    popup.setVisible(false);
                    ok1(output, row);
                }
            }
        });
    }

    private static void ok1(String[] output, int selected_row) {
        if (callback != null) {
            callback.ok(new OutputData(output, selected_row));
        }
    }
}

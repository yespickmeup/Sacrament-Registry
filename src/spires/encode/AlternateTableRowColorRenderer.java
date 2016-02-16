/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode;

/**
 *
 * @author i1
 */

import java.awt.Color;
import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author sandeep
 */
class AlternateTableRowColorRenderer extends DefaultTableCellRenderer {

    Color currColor = Color.white;

    public AlternateTableRowColorRenderer() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        if (row % 2 == 0) {
            currColor = Color.white;
        } else {
            currColor = new Color(240, 240, 240);
        }
        if (isSelected) {
            super.setForeground(table.getSelectionForeground());
            super.setBackground(table.getSelectionBackground());
        } else {
            super.setForeground(Color.black);
            super.setBackground(currColor);
        }
        setFont(table.getFont());
        setValue(value);
        return this;
    }
}

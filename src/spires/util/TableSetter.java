/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dummy
 */
public class TableSetter {

    public static void set_table(JTable table, String[] col_names, List<String[]> row_data, final int[] col_editable, int[] cols_to_center, int[] rows_to_right) {
        DefaultTableModel table_model = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                for(int i:col_editable){
                    if(i==colIndex){
                        return true;
                    }
                }
                return false;
            }
        };

        table.setModel(table_model);
        String[] col_holder = col_names;

        List<String[]> data_holder = row_data;
        table_model.setColumnIdentifiers(col_holder);

        for (String[] data : data_holder) {
            table_model.addRow(data);
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import org.jdesktop.swingx.combobox.ListComboBoxModel;

import SR.main.Main;

/**
 *
 * @author Dummy
 */
public class S3_cb_convenience {

    public static final String s_priest = "select name from officials p where designation='Priest'";
    public static final String s_priest1 = "select name from officials p where designation='Priest' and is_manager='" + "1" + "'";
    public static final String s_designation = "select name from designations p ";
    public static final String s_choir = "select p.name from choir p;";
    public static final String s_time = "select p.time_interval from mass_time p where type='" + "Intention" + "';";
    public static final String s_time_mat = "select p.scheduled_time from mass_schedules p where mass_type='" + "Marriage" + "';";
    public static final String s_time_bap = "select p.scheduled_time from mass_schedules p where mass_type='" + "Baptism" + "';";
    public static final String s_time_con = "select p.scheduled_time from mass_schedules p where mass_type='" + "Confirmation" + "';";
    public static final String s_time_fun = "select p.scheduled_time from mass_schedules p where mass_type='" + "Funeral" + "';";
    public static final String s_time_comm = "select p.time_interval from mass_time p where type='" + "Communion" + "';";
    public static final String s_time_acceptance = "select p.time_interval from mass_time p where type='" + "Acceptance" + "';";
    public static final String s_time_burial = "select p.time_interval from burial_mass_time p;";

    private static List<String> ret_values(String args) {


        List<String> datas = new ArrayList();
        try {
            Connection conn = MyConnection.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(args);
            while (rs.next()) {
                String name = rs.getString(1);
                datas.add(name);
                System.out.println(name);
            }

            return datas;
        } catch (Exception e) {

            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }


    }

    public static void cb_init(JComboBox combobox, String args) {

        combobox.setModel(new ListComboBoxModel(ret_values(args)));


    }
}

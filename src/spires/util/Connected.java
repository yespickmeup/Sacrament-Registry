/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Dummy
 */
public class Connected {

    public static String conn() {
        String if_con = "no";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from db_bulletin.users limit 1 ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                if_con = rs.getString(1);
            }
            return if_con;
        } catch (SQLException e) {
            if_con = "no";
            return if_con;

        } finally {
            MyConnection.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(conn());
    }
}

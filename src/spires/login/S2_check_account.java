/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import spires.users.Res;
import spires.util.MyConnection;


/**
 *
 * @author Dummy
 */
public class S2_check_account {

    public static Connection conn;

    public static String check_account(String user_name, String password) {


        String type = "none";

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select user_level,user_name,id,user_code from users where user_name='" + user_name + "'and password='" + password + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                type = rs.getString(1);
                Res.setUser_name(rs.getString(2));
                Res.setUser_id(rs.getString(3));
                Res.setUser_screename(rs.getString(4));
               
//                to_users.u.setUsername(rs.getString(2));
            }

            return type;

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.users;

import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author i1
 */
public class Users {

    public static class to_users {

        public final int id;
        public final String user_code;
        public final String user_name;
        public final String password;
        public final int user_level;
        public final String remarks;
        public final String created;
        public final String modified;

        public to_users(int id, String user_code, String user_name, String password, int user_level, String remarks, String created, String modified) {
            this.id = id;
            this.user_code = user_code;
            this.user_name = user_name;
            this.password = password;
            this.user_level = user_level;
            this.remarks = remarks;
            this.created = created;
            this.modified = modified;
        }
    }

    public static void add_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into users("
                    + "user_code"
                    + ",user_name"
                    + ",password"
                    + ",user_level"
                    + ",remarks"
                    + ",created"
                    + ",modified"
                    + ")values("
                    + ":user_code"
                    + ",:user_name"
                    + ",:password"
                    + ",:user_level"
                    + ",:remarks"
                    + ",:created"
                    + ",:modified"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("user_code", to_users.user_code)
                    .setString("user_name", to_users.user_name)
                    .setString("password", to_users.password)
                    .setNumber("user_level", to_users.user_level)
                    .setString("remarks", to_users.remarks)
                    .setString("created", to_users.created)
                    .setString("modified", to_users.modified)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update users set "
                    + "user_code= :user_code "
                    + ",user_name= :user_name "
                    + ",password= :password "
                    + ",user_level= :user_level "
                    + ",remarks= :remarks "
                    + ",created= :created "
                    + ",modified= :modified "
                    + " where id='" + to_users.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("user_code", to_users.user_code)
                    .setString("user_name", to_users.user_name)
                    .setString("password", to_users.password)
                    .setNumber("user_level", to_users.user_level)
                    .setString("remarks", to_users.remarks)
                    .setString("created", to_users.created)
                    .setString("modified", to_users.modified)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from users  "
                    + " where id='" + to_users.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_users> ret_data(String where) {
        List<to_users> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",user_code"
                    + ",user_name"
                    + ",password"
                    + ",user_level"
                    + ",remarks"
                    + ",created"
                    + ",modified"
                    + " from users"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String user_code = rs.getString(2);
                String user_name = rs.getString(3);
                String password = rs.getString(4);
                int user_level = rs.getInt(5);
                String remarks = rs.getString(6);
                String created = rs.getString(7);
                String modified = rs.getString(8);

                to_users to = new to_users(id, user_code, user_name, password, user_level, remarks, created, modified);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.churches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import spires.util.MyConnection;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import java.sql.SQLException;

/**
 *
 * @author i1
 */
public class Churches {

    public static class to_churches {

        public final int id;
        public final String name;
        public final String address;

        public to_churches(int id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }
    }

    public static void add_data(to_churches to_churches) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into churches("
                    + "name"
                    + ",address"
                    + ")values("
                    + ":name"
                    + ",:address"
                    + ")";

            s0 = SqlStringUtil.parse(s0).setString("name", to_churches.name).setString("address", to_churches.address).ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Churches.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_data(to_churches to_churches) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update churches set "
                    + "name= '" + to_churches.name + "'"
                    + ",address= '" + to_churches.address + "'"
                    + "where "
                    + " id ='" + to_churches.id + "' "
                    + " ";
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Churches.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_churches to_churches) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from churches where "
                    + " id ='" + to_churches.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Churches.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_churches> ret_data(String search) {
        List<to_churches> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",name"
                    + ",address"
                    + " from churches where "
                    + " name like'%" + search + "%' "
                    + " ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String address = rs.getString(3);

                to_churches to = new to_churches(id, name, address);
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

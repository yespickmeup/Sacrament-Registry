/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.purposes;

import spires.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class S1_purposes {

    public static class to_purposes {

        public final int id;
        public final String purpose;

        public to_purposes(int id, String purpose) {
            this.id = id;
            this.purpose = purpose;
        }
    }

    public static List<to_purposes> ret_data(String where) {
        List<to_purposes> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",purpose"
                    + " from purposes  "
                    + " " + where;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String purpose = rs.getString(2);

                to_purposes to = new to_purposes(id, purpose);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.banks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import spires.util.MyConnection;

/**
 *
 * @author Guinness
 */
public class Banks {

    public static class to_banks {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String bank;

        public to_banks(int id, String created_at, String updated_at, String created_by, String updated_by, int status, String bank) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.bank = bank;
        }
    }

    public static void add_data(to_banks to_banks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into banks("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",bank"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:bank"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_banks.created_at)
                    .setString("updated_at", to_banks.updated_at)
                    .setString("created_by", to_banks.created_by)
                    .setString("updated_by", to_banks.updated_by)
                    .setNumber("status", to_banks.status)
                    .setString("bank", to_banks.bank)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Banks.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_banks to_banks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update banks set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",bank= :bank "
                    + " where id='" + to_banks.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_banks.created_at)
                    .setString("updated_at", to_banks.updated_at)
                    .setString("created_by", to_banks.created_by)
                    .setString("updated_by", to_banks.updated_by)
                    .setNumber("status", to_banks.status)
                    .setString("bank", to_banks.bank)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Banks.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_banks to_banks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from banks  "
                    + " where id='" + to_banks.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Banks.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_banks> ret_data(String where) {
        List<to_banks> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",bank"
                    + " from banks"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                int status = rs.getInt(6);
                String bank = rs.getString(7);

                to_banks to = new to_banks(id, created_at, updated_at, created_by, updated_by, status, bank);
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

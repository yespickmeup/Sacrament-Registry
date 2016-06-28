/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.official_schedules;

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
public class Official_schedule_types {

    public static class to_official_schedule_types {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String schedule_type;

        public to_official_schedule_types(int id, String created_at, String updated_at, String created_by, String updated_by, int status, String schedule_type) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.schedule_type = schedule_type;
        }
    }

    public static void add_data(to_official_schedule_types to_official_schedule_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into official_schedule_types("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",schedule_type"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:schedule_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_official_schedule_types.created_at)
                    .setString("updated_at", to_official_schedule_types.updated_at)
                    .setString("created_by", to_official_schedule_types.created_by)
                    .setString("updated_by", to_official_schedule_types.updated_by)
                    .setNumber("status", to_official_schedule_types.status)
                    .setString("schedule_type", to_official_schedule_types.schedule_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Official_schedule_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_official_schedule_types to_official_schedule_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update official_schedule_types set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",schedule_type= :schedule_type "
                    + " where id='" + to_official_schedule_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_official_schedule_types.created_at)
                    .setString("updated_at", to_official_schedule_types.updated_at)
                    .setString("created_by", to_official_schedule_types.created_by)
                    .setString("updated_by", to_official_schedule_types.updated_by)
                    .setNumber("status", to_official_schedule_types.status)
                    .setString("schedule_type", to_official_schedule_types.schedule_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Official_schedule_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_official_schedule_types to_official_schedule_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from official_schedule_types  "
                    + " where id='" + to_official_schedule_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Official_schedule_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_official_schedule_types> ret_data(String where) {
        List<to_official_schedule_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",schedule_type"
                    + " from official_schedule_types"
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
                String schedule_type = rs.getString(7);

                to_official_schedule_types to = new to_official_schedule_types(id, created_at, updated_at, created_by, updated_by, status, schedule_type);
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

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
 * @author Maytopacka
 */
public class Official_schedules {

    public static class to_official_schedules {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String official;
        public final String official_id;
        public final String schedule_time_from;
        public final String schedule_time_to;
        public final String schedule_type;
        public final String schedule_address;
        public final String parishioner;
        public final String parishioner_contact_no;

        public to_official_schedules(int id, String created_at, String updated_at, String created_by, String updated_by, int status, String official, String official_id, String schedule_time_from, String schedule_time_to, String schedule_type, String schedule_address, String parishioner, String parishioner_contact_no) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.official = official;
            this.official_id = official_id;
            this.schedule_time_from = schedule_time_from;
            this.schedule_time_to = schedule_time_to;
            this.schedule_type = schedule_type;
            this.schedule_address = schedule_address;
            this.parishioner = parishioner;
            this.parishioner_contact_no = parishioner_contact_no;
        }
    }

    public static void add_data(to_official_schedules to_official_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into official_schedules("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",official"
                    + ",official_id"
                    + ",schedule_time_from"
                    + ",schedule_time_to"
                    + ",schedule_type"
                    + ",schedule_address"
                    + ",parishioner"
                    + ",parishioner_contact_no"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:official"
                    + ",:official_id"
                    + ",:schedule_time_from"
                    + ",:schedule_time_to"
                    + ",:schedule_type"
                    + ",:schedule_address"
                    + ",:parishioner"
                    + ",:parishioner_contact_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_official_schedules.created_at)
                    .setString("updated_at", to_official_schedules.updated_at)
                    .setString("created_by", to_official_schedules.created_by)
                    .setString("updated_by", to_official_schedules.updated_by)
                    .setNumber("status", to_official_schedules.status)
                    .setString("official", to_official_schedules.official)
                    .setString("official_id", to_official_schedules.official_id)
                    .setString("schedule_time_from", to_official_schedules.schedule_time_from)
                    .setString("schedule_time_to", to_official_schedules.schedule_time_to)
                    .setString("schedule_type", to_official_schedules.schedule_type)
                    .setString("schedule_address", to_official_schedules.schedule_address)
                    .setString("parishioner", to_official_schedules.parishioner)
                    .setString("parishioner_contact_no", to_official_schedules.parishioner_contact_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Official_schedules.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_official_schedules to_official_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update official_schedules set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",official= :official "
                    + ",official_id= :official_id "
                    + ",schedule_time_from= :schedule_time_from "
                    + ",schedule_time_to= :schedule_time_to "
                    + ",schedule_type= :schedule_type "
                    + ",schedule_address= :schedule_address "
                    + ",parishioner= :parishioner "
                    + ",parishioner_contact_no= :parishioner_contact_no "
                    + " where id='" + to_official_schedules.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_official_schedules.created_at)
                    .setString("updated_at", to_official_schedules.updated_at)
                    .setString("created_by", to_official_schedules.created_by)
                    .setString("updated_by", to_official_schedules.updated_by)
                    .setNumber("status", to_official_schedules.status)
                    .setString("official", to_official_schedules.official)
                    .setString("official_id", to_official_schedules.official_id)
                    .setString("schedule_time_from", to_official_schedules.schedule_time_from)
                    .setString("schedule_time_to", to_official_schedules.schedule_time_to)
                    .setString("schedule_type", to_official_schedules.schedule_type)
                    .setString("schedule_address", to_official_schedules.schedule_address)
                    .setString("parishioner", to_official_schedules.parishioner)
                    .setString("parishioner_contact_no", to_official_schedules.parishioner_contact_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Official_schedules.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_official_schedules to_official_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from official_schedules  "
                    + " where id='" + to_official_schedules.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Official_schedules.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_official_schedules> ret_data(String where) {
        List<to_official_schedules> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",official"
                    + ",official_id"
                    + ",schedule_time_from"
                    + ",schedule_time_to"
                    + ",schedule_type"
                    + ",schedule_address"
                    + ",parishioner"
                    + ",parishioner_contact_no"
                    + " from official_schedules"
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
                String official = rs.getString(7);
                String official_id = rs.getString(8);
                String schedule_time_from = rs.getString(9);
                String schedule_time_to = rs.getString(10);
                String schedule_type = rs.getString(11);
                String schedule_address = rs.getString(12);
                String parishioner = rs.getString(13);
                String parishioner_contact_no = rs.getString(14);

                to_official_schedules to = new to_official_schedules(id, created_at, updated_at, created_by, updated_by, status, official, official_id, schedule_time_from, schedule_time_to, schedule_type, schedule_address, parishioner, parishioner_contact_no);
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

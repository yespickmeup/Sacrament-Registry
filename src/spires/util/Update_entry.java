/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import SR.main.Main;
import mijzcx.synapse.desk.utils.Lg;

/**
 *
 * @author Dummy
 */
public class Update_entry {

    public static void main1(String[] args) {
        try {
            Connection conn = MyConnection.connect();
//            String s0="select ref_no from  baptism2_sponsors where ref_no='"+"6511"+"'";
            int i = 6956; //6956
            int i2 = 7197; //7197
            String s0 = "select ref_no from baptism2 where ref_no between '" + i + "' and '" + i2 + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int new_id = id + 1;

//                String s1="select sponsor from  baptism2_sponsors where ref_no='"+(id+1)+"'";
//                Statement stmt2 = conn.createStatement();
//                ResultSet rs2 = stmt2.executeQuery(s1);
//                while (rs2.next()) {
//                    String num = rs2.getString(1);
//                    System.out.println(num+ " ---");
//                }

                String s1 = "update baptism2_sponsors set ref_no='" + new_id + "' where ref_no='" + id + "' ";
                PreparedStatement stmt1 = conn.prepareStatement(s1);
                stmt1.execute();

                System.out.println("Updated" + " " + id + " - " + new_id);
            }
        } catch (Exception e) {
            MyConnection.close();
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void main2(String[] args) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "ref_id"
                    + " from " + "db_bulletin" + ".parishioners_1 "
                    + " where b_remarks is null order by ref_id asc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                String s1 = "select remarks from db_bulletin.baptism2 where ref_no='" + id + "'";
                Statement stmt1 = conn.createStatement();
                ResultSet rs1 = stmt1.executeQuery(s1);
                String name = "";
                if (rs1.next()) {
                    name = name + rs1.getString(1);
                }
                String s2 = "update db_bulletin.parishioners_1 set b_remarks='" + name + "' "
                        + "where ref_id='" + id + "'";
                PreparedStatement stmt2 = conn.prepareStatement(s2);
                stmt2.execute();
                Lg.i(Update_entry.class, "updated ref_id='" + id + "'" + " " + name);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update(String name, String minister, String id) {
        try {
            Connection conn = MyConnection.connect();


        } catch (Exception e) {
            MyConnection.close();
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
    public static void main(String[] args) {
        
      try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "ref_id,b_minister,b_sponsors"
                    + " from " + "db_bulletin" + ".parishioners_1 "
                    + " where b_book_no='"+"67A"+"'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                String id = rs.getString(1);
                String minister = rs.getString(2);
                String sponsor = rs.getString(3);
                System.out.println(id+" = "+minister+" = "+sponsor);
                String s2="update db_bulletin.parishioners_1 set b_minister='"+sponsor+"', b_sponsors='"+minister+"' where ref_id='"+id+"'";
                PreparedStatement stmt2 = conn.prepareStatement(s2);                
                stmt2.execute();
                Lg.s(Update_entry.class, "Successfully updated"+" "+id);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

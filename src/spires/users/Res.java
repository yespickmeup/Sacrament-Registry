/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.users;

import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Res {

    public static String user_id;
    public static String user_name;
    public static String user_screename;
    public static String password;
    public static String now;

    public static String getNow() {
        return DateType.now();
    }

    public static void setNow(String now) {
        Res.now = now;
    }

    public static String getUser_id() {
        try {
            return user_id;
        } catch (Exception e) {
            return "";
        }

    }

    public static void setUser_id(String user_id) {
        Res.user_id = user_id;
    }

    public static String getUser_name() {
        try {
            return user_name;
        } catch (Exception e) {
            return "";
        }

    }

    public static void setUser_name(String user_name) {
        Res.user_name = user_name;
    }

    public static String getUser_screename() {
        try {
            return user_screename;
        } catch (Exception e) {
            return "";
        }

    }

    public static void setUser_screename(String user_screename) {
        Res.user_screename = user_screename;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Res.password = password;
    }

}

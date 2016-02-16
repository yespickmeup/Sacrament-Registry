/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ronald
 */
public class MyDate {

    public static String jan_1_2014_to_2014_01_01(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("MMMMMMMMMM dd, yyyy");
            SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sf.parse(date);
            date = sf2.format(d);
            return date;
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String yyyy_mm_dd_to_slash(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sf2 = new SimpleDateFormat("MM/dd/yyyy");
            Date d = sf.parse(date);
            date = sf2.format(d);
            return date;
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String yyyy_mm_dd_to_MMMMMM_dd_yyy(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sf2 = new SimpleDateFormat("MMMMMMMMMMM dd, yyyy");
            Date d = sf.parse(date);
            date = sf2.format(d);
            return date;
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String datetime_to_time(String date) {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sf2 = new SimpleDateFormat("MMMMMMMMMMM dd, yyyy");
            Date d = DateType.datetime.parse(date);
            date = DateType.day_and_time.format(d);
            return date;
        } catch (ParseException ex) {
            return "";
        }
    }

    public static String date_to_yyyy_mm_dd(Date d) {
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
        String date = sf2.format(d);
        return date;
    }

    public static String report_date(Date from, Date to) {
        SimpleDateFormat sf2 = new SimpleDateFormat("MM/dd/yyyy");
        String date = "Date:[" + sf2.format(from) + "] - [" + sf2.format(to) + "]";
        return date;
    }

    public static String now() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sf.format(new Date());
        return date;
    }

    public static String date_to_string(Date Date) {
        String date = DateType.sf.format(Date);

        return date;
    }

    public static String datetime_to_yyyy_(Date Date) {
        String date = DateType.sf.format(Date);

        return date;
    }

    public static String now_sf() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sf.format(new Date());
        return date;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mijzcx.synapse.desk.utils.FitIn;

/**
 *
 * @author Dummy
 */
public class DateType {

    public static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat sf2 = new SimpleDateFormat("MMM d yyyy");
    public static SimpleDateFormat datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss aa");
    public static SimpleDateFormat time2 = new SimpleDateFormat("HH:mm aa");
    public static SimpleDateFormat sf1 = new SimpleDateFormat("EEE, MMM dd,yyyy");
    public static SimpleDateFormat d = new SimpleDateFormat("dd");
    public static SimpleDateFormat m = new SimpleDateFormat("MMMMMMMMMMM");
    public static SimpleDateFormat m1 = new SimpleDateFormat("MM");
    public static SimpleDateFormat y = new SimpleDateFormat("yyyy");
    public static SimpleDateFormat liquid = new SimpleDateFormat("EEEEEEEEEEE dd MMMMMMMMMMM yyyy");
    public static SimpleDateFormat day = new SimpleDateFormat("EEEEEEEEEEE");
    public static SimpleDateFormat day_1 = new SimpleDateFormat("EEEEEEEEEEE dd");
    public static SimpleDateFormat month_year = new SimpleDateFormat("MMMMMMMMMMM yyyy");
    public static SimpleDateFormat month_date = new SimpleDateFormat("MMMMMMMMMM dd, yyyy");
    public static SimpleDateFormat month_date2 = new SimpleDateFormat("MMM dd, yyyy");
    public static SimpleDateFormat day_and_time = new SimpleDateFormat("MMMMMMMMMM dd, yyyy HH:mm aa");
    public static SimpleDateFormat str = new SimpleDateFormat("MMMMMMMMMMM dd,yyyy (EEEEEEEE)");
    public static SimpleDateFormat slash = new SimpleDateFormat("MM/dd/yyyy");
    public static SimpleDateFormat slash2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss aa");
    public static SimpleDateFormat contract = new SimpleDateFormat("dd        MMMMMMMMMMM       yyyy");
    public static SimpleDateFormat contract2 = new SimpleDateFormat("dd                               MMMMMMMMMMM                           yyyy");
    public static SimpleDateFormat contract3 = new SimpleDateFormat("MMMMMMMMMMM                 yyyy");
    public static SimpleDateFormat contract4 = new SimpleDateFormat("dd                  MMMMMMMMMMM       yyyy");
    public static SimpleDateFormat contract5 = new SimpleDateFormat("              MMMMMMMMMMM,   yyyy");

    public static void main(String[] args) {
        System.out.println(nth("08"));
    }

    public static String nth(String day) {
        String nth = day;

        if (nth.startsWith("0")) {
            nth = nth.replaceAll("0", "");
        }

        if (nth.endsWith("0") || nth.endsWith("4") || nth.endsWith("5") || nth.
                endsWith("6") || nth.endsWith("7") || nth.endsWith("8") || nth.
                endsWith("9")) {
            nth = nth + "th";
        }
        if (nth.equals("1")) {
            nth = nth + "st";
        }
        if (nth.equals("2")) {
            nth = nth + "2nd";
        }
        if (nth.equals("3")) {
            nth = nth + "rd";
        }
        if (nth.equals("4")) {
            nth = nth + "th";
        }
        if (nth.equals("5")) {
            nth = nth + "th";
        }
        if (nth.equals("6")) {
            nth = nth + "th";
        }
        if (nth.equals("7")) {
            nth = nth + "th";
        }
        if (nth.equals("8")) {
            nth = nth + "th";
        }
        if (nth.equals("9")) {
            nth = nth + "th";
        }
        if (nth.equals("10")) {
            nth = nth + "th";
        }
        if (nth.equals("11")) {
            nth = nth + "th";
        }
        if (nth.equals("12")) {
            nth = nth + "th";
        }
        if (nth.equals("13")) {
            nth = nth + "th";
        }
        if (nth.equals("14")) {
            nth = nth + "th";
        }
        if (nth.equals("15")) {
            nth = nth + "th";
        }
        if (nth.equals("16")) {
            nth = nth + "th";
        }
        if (nth.equals("17")) {
            nth = nth + "th";
        }
        if (nth.equals("18")) {
            nth = nth + "th";
        }
        if (nth.equals("19")) {
            nth = nth + "th";
        }
        if (nth.equals("20")) {
            nth = nth + "th";
        }

        if (nth.equals("21")) {
            nth = nth + "st";
        }
        if (nth.equals("22")) {
            nth = nth + "nd";
        }
        if (nth.equals("23")) {
            nth = nth + "rd";
        }
        if (nth.equals("24")) {
            nth = nth + "th";
        }
        if (nth.equals("25")) {
            nth = nth + "th";
        }
        if (nth.equals("26")) {
            nth = nth + "th";
        }
        if (nth.equals("27")) {
            nth = nth + "th";
        }
        if (nth.equals("28")) {
            nth = nth + "th";
        }
        if (nth.equals("29")) {
            nth = nth + "th";
        }
        if (nth.equals("30")) {
            nth = nth + "th";
        }
        if (nth.equals("31")) {
            nth = nth + "st";
        }
        if (nth.equals("32")) {
            nth = nth + "nd";
        }
        return nth;
    }

    public static String convert_jan_1_2013_datetime(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.datetime.format(new Date());
        }
        try {
            d = DateType.datetime.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.day_and_time.format(d);
        return date;
    }

    public static String convert_sf_to_slash(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }

        try {
            d = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            return "";
        }
        date = DateType.slash.format(d);
        return date;
    }

    public static String convert_sf_to_contract(String datetime) {
        String date = "";
        Date dd = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }

        try {
            dd = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            return "";
        }
        date = DateType.contract.format(dd);
        return date;
    }

    public static String convert_sf_to_contract5(String datetime) {
        String date = "";
        Date dd = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }

        try {
            dd = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            return "";
        }
        date = DateType.contract5.format(dd);
        return date;
    }

    public static String convert_sf_to_contract4(String datetime) {
        String date = "";
        Date dd = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }

        try {
            dd = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            return "";
        }
        date = DateType.contract4.format(dd);
        return date;
    }

    public static String convert_sf_to_contract2(String datetime) {
        String date = "";
        Date dd = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }

        try {
            dd = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            return "";
        }
        date = DateType.contract2.format(dd);
        return date;
    }

    public static String convert_sf_to_contract3(String datetime) {
        String date = "";
        Date dd = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }

        try {
            dd = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            return "";
        }
        date = DateType.contract3.format(dd);
        return date;
    }

    public static String convert_jan_1_2013_date_db(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.month_date.format(new Date());
        }
        try {
            d = DateType.month_date.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.sf.format(d);
        return date;
    }

    public static String convert_jan_1_2013_date_db2(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.month_date.format(new Date());
        }
        try {
            d = DateType.month_date.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.sf.format(d);
        return date;
    }

    public static String convert_jan_1_2013_date_rep(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }
        try {
            d = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.month_date2.format(d);
        return date;
    }

    public static String convert_jan_1_2013_date_rep2(String datetime) {
        String date = "";
        Date d = new Date();
        if (datetime.isEmpty()) {
            datetime = DateType.sf.format(new Date());
        }
        try {
            d = DateType.sf.parse(datetime);
        } catch (ParseException ex) {
            Logger.getLogger(DateType.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        date = DateType.month_date.format(d);
        return date;
    }

    public static List<String> days() {
        List<String> days = new ArrayList();
        for (int i = 1; i < 32; i++) {
            String l = "" + i;
            String add = "";
            if (l.length() == 1) {
                add = "0" + l;
            } else {
                add = "" + l;
            }
            days.add(add);
        }
        return days;
    }

    public static List<String> months() {
        List<String> days = new ArrayList();
        for (int i = 1; i < 13; i++) {
            String l = "" + i;
            String add = "";
            if (l.length() == 1) {
                add = "0" + l;
            } else {
                add = "" + l;
            }
            days.add(add);
        }
        return days;
    }

    public static List<String> years() {
        List<String> days = new ArrayList();
        int now = FitIn.toInt(DateType.y.format(new Date()));
        int base = 1880;
        for (int i = base; i < now + 1; i++) {
            String l = "" + i;
            String add = "";
            if (l.length() == 1) {
                add = "0" + l;
            } else {
                add = "" + l;
            }
            days.add(add);
        }
        return days;
    }

    public static void main2(String[] args) {
        System.out.println(Arrays.asList(years()));
    }

    public static int getAge(Date start, Date end) {

        int y1 = FitIn.toInt(DateType.y.format(start));
        int y2 = FitIn.toInt(DateType.y.format(end));
        int total = y2 - y1;
        return total;
    }
}

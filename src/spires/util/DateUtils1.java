/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import mijzcx.synapse.desk.utils.FitIn;

/**
 *
 * @author i1
 */
public class DateUtils1 {

    public static void main(String[] args) {
        String d1 = "2013-09-01";
        System.out.println(ar_aging(d1, 30));
    }

    public static int ar_aging(String trans_date, int term) {
        int days = 0;
        Date date_from = new Date();
//        Date date_to = new Date();
        try {
            date_from = DateType.sf.parse(trans_date);
//            date_to = DateType.sf.parse(d2);
        } catch (ParseException ex) {
            Logger.getLogger(DateUtils1.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        Date due = add_day(date_from, term);

        days = count_days(due, new Date());

        return days;

    }

    public static Date add_day(Date date_added, int days) {
        date_added.setDate(date_added.getDate() + days);
        return date_added;
    }

    public static int count_days(Date date_from, Date date_to) {
        int count = 0;
        int d1_year = Integer.parseInt(DateType.y.format(date_from));
        int d1_month = Integer.parseInt(DateType.m1.format(date_from));
        int d1_day = Integer.parseInt(DateType.d.format(date_from));

        int d2_year = Integer.parseInt(DateType.y.format(date_to));
        int d2_month = Integer.parseInt(DateType.m1.format(date_to));
        int d2_day = Integer.parseInt(DateType.d.format(date_to));


        Calendar c1 = Calendar.getInstance();
        c1.set(d1_year, d1_month, d1_day);
        Calendar c2 = Calendar.getInstance();
        c2.set(d2_year, d2_month, d2_day);

        Date d1 = c1.getTime();
        Date d2 = c2.getTime();

        long diff = d2.getTime() - d1.getTime();
        int noofdays = (int) (diff / (1000 * 24 * 60 * 60));
        count = noofdays;
        return count;
    }
    
      public static int count_age(Date date_from, Date date_to) {
        int count = 0;
        int d1_year = Integer.parseInt(DateType.y.format(date_from));
        int d1_month = Integer.parseInt(DateType.m1.format(date_from));
        int d1_day = Integer.parseInt(DateType.d.format(date_from));

        int d2_year = Integer.parseInt(DateType.y.format(date_to));
        int d2_month = Integer.parseInt(DateType.m1.format(date_to));
        int d2_day = Integer.parseInt(DateType.d.format(date_to));


        Calendar c1 = Calendar.getInstance();
        c1.set(d1_year, d1_month, d1_day);
        Calendar c2 = Calendar.getInstance();
        c2.set(d2_year, d2_month, d2_day);

        Date d1 = c1.getTime();
        Date d2 = c2.getTime();

        long diff = d2.getTime() - d1.getTime();
        int noofdays = (int) (diff / (1000 * 24 * 60 * 60));
        long msyear=1000L * 60 * 60 * 24 * 365;
        long msdiff=c2.getTimeInMillis() - c1.getTimeInMillis();
        String year=String.valueOf(msdiff/msyear);
        count = noofdays;
        return FitIn.toInt(year);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mijzcx.synapse.desk.utils.FitIn;

/**
 *
 * @author Ronald
 */
public class Courier {

    public static class status {

        public final int id;
        public final String status;

        public status(int id, String status) {
            this.id = id;
            this.status = status;
        }

    }

    public static List<status> status() {
        List<status> datas = new ArrayList();
        status t1 = new status(1, "Active");
        status t2 = new status(0, "Inactive");
        datas.add(t1);
        datas.add(t2);
        return datas;
    }

    public static List<status> receipt_types() {
        List<status> datas = new ArrayList();
        status t1 = new status(1, "Receipt from Purchase W/O");
        status t2 = new status(2, "Receipt from Purchase Order");
        status t3 = new status(3, "Receipt from Returns");
        status t4 = new status(4, "Issuance from other Branch");
        status t5 = new status(5, "Other Receipt");
        datas.add(t1);
        datas.add(t2);
        datas.add(t3);
        datas.add(t4);
        datas.add(t5);
        return datas;
    }

    public static List<status> service_type() {
        List<status> datas = new ArrayList();
        status t1 = new status(1, "Service");
        status t2 = new status(2, "Receipt from Purchase Order");
        status t3 = new status(3, "Receipt from Returns");
        datas.add(t1);
        datas.add(t2);
        datas.add(t3);
        return datas;
    }

    public static List<status> account_types() {
        List<status> datas = new ArrayList();
        status t1 = new status(1, "Administrator");
        status t2 = new status(2, "Accounting");
        status t3 = new status(3, "Cashier");
        status t4 = new status(4, "Scheduler");
        status t5 = new status(5, "Encoder");
        datas.add(t1);
        datas.add(t2);
        datas.add(t3);
        datas.add(t4);
        datas.add(t5);
        return datas;
    }

    public static List<status> days() {
        List<status> datas = new ArrayList();
        for (int i = 1; i < 32; i++) {
            if (i < 10) {
                status t1 = new status(i, "0" + i);
                datas.add(t1);
            } else {
                status t1 = new status(i, "" + i);
                datas.add(t1);
            }

        }
        return datas;
    }

    public static List<status> months() {
        List<status> datas = new ArrayList();
        status t1 = new status(1, "January");
        status t2 = new status(2, "February");
        status t3 = new status(3, "March");
        status t4 = new status(4, "April");
        status t5 = new status(5, "May");
        status t6 = new status(6, "June");
        status t7 = new status(7, "July");
        status t8 = new status(8, "August");
        status t9 = new status(9, "September");
        status t10 = new status(10, "October");
        status t11 = new status(11, "November");
        status t12 = new status(12, "December");
        datas.add(t1);
        datas.add(t2);
        datas.add(t3);
        datas.add(t4);
        datas.add(t5);
        datas.add(t6);
        datas.add(t7);
        datas.add(t8);
        datas.add(t9);
        datas.add(t10);
        datas.add(t11);
        datas.add(t12);
        return datas;
    }

    public static List<status> years() {
        List<status> datas = new ArrayList();

        int year = FitIn.toInt(DateType.y.format(new Date()));
        for (int i = year - 200; i < year + 1; i++) {
            status t1 = new status(i, "" + i);
            datas.add(t1);
        }
        return datas;
    }

    public static void main(String[] args) {
        years();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.printing;

import spires.util.DateType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.util.CellReference;

/**
 *
 * @author Ronald
 */
public class Encoded_Funeral {

    public static class to_encoded {

        public final String index_no;
        public final String book_no;
        public final String page_no;
        public final String date_of_burial;
        public final String price;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String residence;
        public final String informant;
        public final String remarks;
        public final String parents;
        public final String date_of_burial2;
        public final int id;
        public to_encoded(String index_no, String book_no, String page_no, String date_of_burial, String price, String fname, String mi
                , String lname, String residence, String informant, String remarks,String parents,String date_of_burial2,int id) {
            this.index_no = index_no;
            this.book_no = book_no;
            this.page_no = page_no;
            this.date_of_burial = date_of_burial;
            this.price = price;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.residence = residence;
            this.informant = informant;
            this.remarks = remarks;
            this.parents=parents;
            this.date_of_burial2=date_of_burial2;
            this.id=id;
        }
    }

    public static List<to_encoded> showExcelData(List sheetData, String path) {

        FileInputStream fis;
        List<to_encoded> datas = new ArrayList();
        try {
            fis = new FileInputStream(path);
            int r = 0;
            int r_set = 1;
            int id = 0;
            for (int i = 0; i < sheetData.size(); i++) {
                List list = (List) sheetData.get(i);
                int size = list.size();
                String[] record = new String[11];
                int record_size = 0;
                for (int j = 0; j < list.size(); j++) {

                    CellReference cellReference = new CellReference("B3");
                    HSSFCell cell = (HSSFCell) list.get(j);
                    HSSFDataFormatter hdf = new HSSFDataFormatter();
                    String data = "";
                    if (j >= 11) {
                        break;
                    }
                    if (j >= 0 && j <= 2 || j == 7|| j == 10) {
                        data = "" + cell.getNumericCellValue();
                    } else if (j == 7||j == 10) {
                        data = "" + DateType.sf.format(getRoundedDate(cell.getNumericCellValue())) + "";

                    } else {
                        data = cell.getStringCellValue();
                    }
                    record[record_size] = data;
                    System.out.print(data + " | ");
                    record_size++;
                }
                String index_no=record[0];
                String book_no=record[1];
                String page_no=record[2];
                String date_of_burial=record[7];
                String price=record[9];
                String fname=record[3];
                String mi=record[4];
                String lname=record[5];
                String residence=record[8];
                String informant=record[6];
                String remarks="";
                String parents=record[6];
                String date_of_burial2=record[10];
                to_encoded t = new to_encoded(index_no, book_no, page_no, date_of_burial, price, fname, mi, lname, residence
                        , informant, remarks, parents,date_of_burial2,0);
                
                if (record[0] != null) {
                    datas.add(t);
                    System.out.println("");
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Encoded_Funeral.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datas;
    }

    public static Date getRoundedDate(double date) {
        int SECONDS_PER_DAY = 24 * 3600;

        int wholeDays = (int) Math.floor(date);
        double ms = date - wholeDays;

        /**
         * round the time part to seconds
         */
        int millisecondsInDay = (int) Math.round(SECONDS_PER_DAY * ms) * 1000;

        Calendar calendar = new GregorianCalendar(); // using default time-zone
        org.apache.poi.ss.usermodel.DateUtil.setCalendar(calendar, wholeDays, millisecondsInDay, false);

        return calendar.getTime();
    }
}

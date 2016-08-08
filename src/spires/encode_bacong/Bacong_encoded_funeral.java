/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode_bacong;

import spires.printing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import spires.encode.S1_encoding_baptism;
import spires.users.Res;
import spires.util.DateType;
import spires.util.MyConnection;

/**
 *
 * @author Maytopacka
 */
public class Bacong_encoded_funeral {

    public static class encoded {

        public final String index_no;
        public final String book_no;
        public final String page_no;
        public final String date_of_burial;
        public final String priest;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String residence;
        public final String informant;
        public final String remarks;
        public final String date_of_burial2;
        public final String age;
        public final String father;
        public final String mother;

        public encoded(String index_no, String book_no, String page_no, String date_of_burial, String priest, String fname, String mi, String lname, String residence, String informant, String remarks, String date_of_burial2, String age, String father, String mother) {
            this.index_no = index_no;
            this.book_no = book_no;
            this.page_no = page_no;
            this.date_of_burial = date_of_burial;
            this.priest = priest;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.residence = residence;
            this.informant = informant;
            this.remarks = remarks;
            this.date_of_burial2 = date_of_burial2;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

    }

    public static void main(String[] args) {

        String path = "C:\\Users\\Maytopacka\\Documents\\Spires\\Bacong\\2016\\Finalized\\death\\book14_ready.xls";
        FileInputStream fis = null;
        final List sheetData = new ArrayList();
        try {

            fis = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            while (rows.hasNext()) {
                HSSFRow row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();
                List data = new ArrayList();
                while (cells.hasNext()) {
                    HSSFCell cell = (HSSFCell) cells.next();
                    data.add(cell);
                }
                sheetData.add(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unsupported Format");
        } finally {

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Dlg_printing_funeral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        List<encoded> datas = showExcelData(sheetData, path);
        System.out.println("Size: " + datas.size());

        add_parishioners_1(datas, "13");
    }

    public static List<encoded> showExcelData(List sheetData, String path) {

        FileInputStream fis;
        List<encoded> datas = new ArrayList();
        try {
            fis = new FileInputStream(path);
            int r = 0;
            int r_set = 1;
            int id = 0;
            for (int i = 0; i < sheetData.size(); i++) {

                List list = (List) sheetData.get(i);
                int size = list.size();
                String[] record = new String[15];
                int record_size = 0;
                for (int j = 0; j < list.size(); j++) {

                    CellReference cellReference = new CellReference("B3");
                    HSSFCell cell = (HSSFCell) list.get(j);
                    HSSFDataFormatter hdf = new HSSFDataFormatter();
                    String data = "";
                    if (j >= 15) {
                        break;
                    }
                    if (cell.getCellType() == 0) {
                        if (j == 3 || j == 11) {
                            data = "" + DateType.sf.format(getRoundedDate(cell.getNumericCellValue())) + "";
                        } else {
                            data = "" + cell.getNumericCellValue();
                        }
                    } else {
                        data = cell.getStringCellValue();
                    }

                    record[record_size] = data;
//                    System.out.print(data + " | ");
                    record_size++;
                }
//                System.out.println("");
                Date db = getRoundedDate(FitIn.toDouble(record[3]));
                Date db1 = getRoundedDate(FitIn.toDouble(record[11]));

                String page_no = "" + FitIn.toInt(record[0]);
                String index_no = "" + FitIn.toInt(record[2]);
                String date_of_burial = DateType.sf.format(db);
                String priest = record[4];
                String fname = record[5];
                String mi = record[6];
                String lname = record[7];
                String residence = record[8];
                String informant = record[9];
                String remarks = record[10];
                String date_of_burial2 = DateType.sf.format(db1);
                String age = record[12];
                String father = record[13];
                String mother = record[14];

                if (FitIn.toInt(record[0]) != 0) {
                    if (priest.equalsIgnoreCase("n/a")) {
                        priest = "";
                    }
                    if (fname.equalsIgnoreCase("n/a")) {
                        fname = "";
                    }
                    if (mi.equalsIgnoreCase("n/a")) {
                        mi = "";
                    }
                    if (lname.equalsIgnoreCase("n/a")) {
                        lname = "";
                    }
                    if (residence.equalsIgnoreCase("n/a")) {
                        residence = "";
                    }
                    if (informant.equalsIgnoreCase("n/a")) {
                        informant = "";
                    }

                    if (remarks.equalsIgnoreCase("n/a")) {
                        remarks = "";
                    }
                    if (age.equalsIgnoreCase("n/a")) {
                        age = "";
                    }
                    if (father.equalsIgnoreCase("n/a")) {
                        father = "";
                    }
                    if (mother.equalsIgnoreCase("n/a")) {
                        mother = "";
                    }
                     if (record[3].equalsIgnoreCase("n/a")||record[3].isEmpty()) {
                        record[3] = "2016-01-01";
                    }
                      if (record[11].equalsIgnoreCase("n/a")||record[11].isEmpty()) {
                        record[11] = "2016-01-01";
                    }
                    System.out.println(page_no + " | " + index_no + " | " + record[3] + " | " + record[11] + " | " + residence
                            + " | " + fname + " | " + mi + " | " + lname + " | " + father + " | " + mother + " | " + informant + " | " + remarks + " | " + priest + " | " + "");

                    encoded coded = new encoded(index_no, page_no, page_no, record[3], priest, fname, mi, lname, residence, informant, remarks, record[11], age, father, mother);

                    datas.add(coded);
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

    public static void add_parishioners_1(List<encoded> datas, String book_no) {
        try {
            Connection conn = MyConnection.connect();
            for (encoded to_encoding_funeral2 : datas) {
                String s0 = "insert into encoding_funeral2("
                        + "index_no"
                        + ",book_no"
                        + ",page_no"
                        + ",date_of_burial"
                        + ",priest"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",residence"
                        + ",informant"
                        + ",date_added"
                        + ",user_name"
                        + ",remarks"
                        + ",date_of_burial2"
                        + ",age"
                        + ",father"
                        + ",mother"
                        + ")values("
                        + ":index_no"
                        + ",:book_no"
                        + ",:page_no"
                        + ",:date_of_burial"
                        + ",:priest"
                        + ",:fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:residence"
                        + ",:informant"
                        + ",:date_added"
                        + ",:user_name"
                        + ",:remarks"
                        + ",:date_of_burial2"
                        + ",:age"
                        + ",:father"
                        + ",:mother"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("index_no", to_encoding_funeral2.index_no)
                        .setString("book_no", book_no)
                        .setString("page_no", to_encoding_funeral2.page_no)
                        .setString("date_of_burial", to_encoding_funeral2.date_of_burial)
                        .setString("priest", to_encoding_funeral2.priest)
                        .setString("fname", to_encoding_funeral2.fname)
                        .setString("mi", to_encoding_funeral2.mi)
                        .setString("lname", to_encoding_funeral2.lname)
                        .setString("residence", to_encoding_funeral2.residence)
                        .setString("informant", to_encoding_funeral2.informant)
                        .setString("date_added", DateType.datetime.format(new Date()))
                        .setString("user_name", Res.getUser_name())
                        .setString("remarks", to_encoding_funeral2.remarks)
                        .setString("date_of_burial2", to_encoding_funeral2.date_of_burial2)
                        .setString("age", to_encoding_funeral2.age)
                        .setString("father", to_encoding_funeral2.father)
                        .setString("mother", to_encoding_funeral2.mother)
                        .ok();
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
                Lg.s(S1_encoding_baptism.class, "Successfully Added");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

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
public class Bacong_encoded_marriage {

    public static class encoded {

        public final String index_no;
        public final String book_no;
        public final String page_no;
        public final String date_of_marriage;
        public final String priest;
        public final String groom;
        public final String groom_age;
        public final String groom_status;
        public final String groom_father;
        public final String groom_mother;
        public final String groom_address;
        public final String bride;
        public final String bride_age;
        public final String bride_status;
        public final String bride_father;
        public final String bride_mother;
        public final String bride_address;
        public final String sponsors;
        public final String remarks;

        public encoded(String index_no, String book_no, String page_no, String date_of_marriage, String priest, String groom, String groom_age, String groom_status, String groom_father, String groom_mother, String groom_address, String bride, String bride_age, String bride_status, String bride_father, String bride_mother, String bride_address, String sponsors, String remarks) {
            this.index_no = index_no;
            this.book_no = book_no;
            this.page_no = page_no;
            this.date_of_marriage = date_of_marriage;
            this.priest = priest;
            this.groom = groom;
            this.groom_age = groom_age;
            this.groom_status = groom_status;
            this.groom_father = groom_father;
            this.groom_mother = groom_mother;
            this.groom_address = groom_address;
            this.bride = bride;
            this.bride_age = bride_age;
            this.bride_status = bride_status;
            this.bride_father = bride_father;
            this.bride_mother = bride_mother;
            this.bride_address = bride_address;
            this.sponsors = sponsors;
            this.remarks = remarks;
        }

    }

    public static void main(String[] args) {

        String path = "C:\\Users\\Maytopacka\\Documents\\Spires\\Bacong\\2016\\Finalized\\Marriage\\Book9_ready.xls";
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

        add_parishioners_1(datas, "9");
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
                String[] record = new String[17];
                int record_size = 0;
                for (int j = 0; j < list.size(); j++) {

                    CellReference cellReference = new CellReference("B3");
                    HSSFCell cell = (HSSFCell) list.get(j);
                    HSSFDataFormatter hdf = new HSSFDataFormatter();
                    String data = "";
                    if (j >= 17) {
                        break;
                    }
                    if (cell.getCellType() == 0) {
                        if (j == 2) {
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

                String page_no = "" + FitIn.toInt(record[0]);
                String index_no = "" + record[1];

                String date_of_marriage = DateType.sf.format(db);
                String priest = record[4];
                String groom = record[5];
                String groom_age = record[6];
                String groom_status = record[7];
                String groom_father = record[8];
                String groom_mother = record[9];
                String groom_address = record[10];
                String bride = record[11];
                String bride_age = record[12];
                String bride_status = record[13];
                String bride_father = record[12];
                String bride_mother = record[13];
                String bride_address = record[14];
                String sponsors = record[15];
                String remarks = record[16];

                if (FitIn.toInt(record[0]) != 0) {

                    if (priest.equalsIgnoreCase("n/a")) {
                        priest = "";
                    }
                    if (groom.equalsIgnoreCase("n/a")) {
                        groom = "";
                    }
                    if (groom_age.equalsIgnoreCase("n/a")) {
                        groom_age = "";
                    }
                    if (groom_status.equalsIgnoreCase("n/a")) {
                        groom_status = "";
                    }
                    if (groom_father.equalsIgnoreCase("n/a")) {
                        groom_father = "";
                    }
                    if (groom_mother.equalsIgnoreCase("n/a")) {
                        groom_mother = "";
                    }
                    if (groom_address.equalsIgnoreCase("n/a")) {
                        groom_address = "";
                    }
                    if (bride.equalsIgnoreCase("n/a")) {
                        bride = "";
                    }
                    if (bride_age.equalsIgnoreCase("n/a")) {
                        bride_age = "";
                    }
                    if (bride_status.equalsIgnoreCase("n/a")) {
                        bride_status = "";
                    }
                    if (bride_father.equalsIgnoreCase("n/a")) {
                        bride_father = "";
                    }
                    if (bride_mother.equalsIgnoreCase("n/a")) {
                        bride_mother = "";
                    }
                    if (bride_address.equalsIgnoreCase("n/a")) {
                        bride_address = "";
                    }

                    if (sponsors.equalsIgnoreCase("n/a")) {
                        sponsors = "";
                    }
                    if (remarks.equalsIgnoreCase("n/a")) {
                        remarks = "";
                    }

                    System.out.println(page_no + " | " + index_no + " | " + date_of_marriage + " | " + groom + " | " + bride
                    );

                    encoded coded = new encoded(index_no, page_no, page_no, date_of_marriage, priest, groom, groom_age, groom_status, groom_father, groom_mother, groom_address, bride, bride_age, bride_status, bride_father, bride_mother, bride_address, sponsors, remarks);

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
            for (encoded to_encoding_marriage : datas) {
                String s0 = "insert into encoding_marriage("
                        + "index_no"
                        + ",book_no"
                        + ",page_no"
                        + ",date_of_marriage"
                        + ",priest"
                        + ",groom"
                        + ",groom_status"
                        + ",groom_father"
                        + ",groom_mother"
                        + ",groom_address"
                        + ",bride"
                        + ",bride_status"
                        + ",bride_father"
                        + ",bride_mother"
                        + ",bride_address"
                        + ",sponsors"
                        + ",remarks"
                        + ")values("
                        + ":index_no"
                        + ",:book_no"
                        + ",:page_no"
                        + ",:date_of_marriage"
                        + ",:priest"
                        + ",:groom"
                        + ",:groom_status"
                        + ",:groom_father"
                        + ",:groom_mother"
                        + ",:groom_address"
                        + ",:bride"
                        + ",:bride_status"
                        + ",:bride_father"
                        + ",:bride_mother"
                        + ",:bride_address"
                        + ",:sponsors"
                        + ",:remarks"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("index_no", to_encoding_marriage.index_no)
                        .setString("book_no",book_no)
                        .setString("page_no", to_encoding_marriage.page_no)
                        .setString("date_of_marriage", to_encoding_marriage.date_of_marriage)
                        .setString("priest", to_encoding_marriage.priest)
                        .setString("groom", to_encoding_marriage.groom)
                        .setString("groom_status", to_encoding_marriage.groom_status)
                        .setString("groom_father", to_encoding_marriage.groom_father)
                        .setString("groom_mother", to_encoding_marriage.groom_mother)
                        .setString("groom_address", to_encoding_marriage.groom_address)
                        .setString("bride", to_encoding_marriage.bride)
                        .setString("bride_status", to_encoding_marriage.bride_status)
                        .setString("bride_father", to_encoding_marriage.bride_father)
                        .setString("bride_mother", to_encoding_marriage.bride_mother)
                        .setString("bride_address", to_encoding_marriage.bride_address)
                        .setString("sponsors", to_encoding_marriage.sponsors)
                        .setString("remarks", to_encoding_marriage.remarks)
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

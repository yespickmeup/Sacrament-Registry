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
import spires.util.DateType;
import spires.util.MyConnection;

/**
 *
 * @author Maytopacka
 */
public class Bacong_encoded_confirmation {

    public static class encoded {

        public final String page_no;
        public final String index_no;
        public final String date_of_confirmation;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String place_of_confirmation;
        public final String place_of_birth;
        public final String date_of_birth;
        public final String place_of_baptism;
        public final String date_of_baptism;
        public final String father;
        public final String mother;
        public final String sponsor;
        public final String notes;
        public final String parish_priest;
        public final String minister;

        public encoded(String page_no, String index_no, String date_of_confirmation, String fname, String mi, String lname, String place_of_confirmation, String place_of_birth, String date_of_birth, String place_of_baptism, String date_of_baptism, String father, String mother, String sponsor, String notes, String parish_priest, String minister) {
            this.page_no = page_no;
            this.index_no = index_no;
            this.date_of_confirmation = date_of_confirmation;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.place_of_confirmation = place_of_confirmation;
            this.place_of_birth = place_of_birth;
            this.date_of_birth = date_of_birth;
            this.place_of_baptism = place_of_baptism;
            this.date_of_baptism = date_of_baptism;
            this.father = father;
            this.mother = mother;
            this.sponsor = sponsor;
            this.notes = notes;
            this.parish_priest = parish_priest;
            this.minister = minister;
        }

    }

    public static void main(String[] args) {

        String path = "C:\\Users\\Maytopacka\\Documents\\Spires\\Bacong\\2016\\Finalized\\confirmation\\Book 3_ready.xls";
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

        add_parishioners_1(datas, "3");
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
                        if (j == 2 || j == 8 || j == 10) {
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
                Date db = getRoundedDate(FitIn.toDouble(record[2]));
                Date db1 = getRoundedDate(FitIn.toDouble(record[8]));
                Date db2 = getRoundedDate(FitIn.toDouble(record[10]));

                String page_no = "" + FitIn.toInt(record[0]);
                String index_no = "" + FitIn.toInt(record[1]);
                String date_of_confirmation = DateType.sf.format(db);
                String fname = record[3];
                String mi = record[4];
                String lname = record[5];
                String place_of_confirmation = record[6];
                String place_of_birth = record[7];
                String date_of_birth = DateType.sf.format(db1);
                String place_of_baptism = record[9];
                String date_of_baptism = DateType.sf.format(db2);
                String father = record[11];
                String mother = record[12];
                String sponsor = record[13];
                String notes = record[14];
                String parish_priest = record[15];
                String minister = record[16];

                if (FitIn.toInt(record[0]) != 0) {

                    if (fname.equalsIgnoreCase("n/a")) {
                        fname = "";
                    }
                    if (mi.equalsIgnoreCase("n/a")) {
                        mi = "";
                    }
                    if (lname.equalsIgnoreCase("n/a")) {
                        lname = "";
                    }
                    if (place_of_confirmation.equalsIgnoreCase("n/a")) {
                        place_of_confirmation = "";
                    }
                    if (place_of_birth.equalsIgnoreCase("n/a")) {
                        place_of_birth = "";
                    }
                    if (place_of_baptism.equalsIgnoreCase("n/a")) {
                        place_of_baptism = "";
                    }
                    if (father.equalsIgnoreCase("n/a")) {
                        father = "";
                    }
                    if (mother.equalsIgnoreCase("n/a")) {
                        mother = "";
                    }
                    if (sponsor.equalsIgnoreCase("n/a")) {
                        sponsor = "";
                    }
                    if (notes.equalsIgnoreCase("n/a")) {
                        notes = "";
                    }
                    if (parish_priest.equalsIgnoreCase("n/a")) {
                        parish_priest = "";
                    }
                    if (minister.equalsIgnoreCase("n/a")) {
                        minister = "";
                    }
                    if(record[8].equals("n/a")){
                        record[8]="2016-07-01";
                    }
                     if(record[10].equals("n/a")){
                        record[10]="2016-07-01";
                    }
                    System.out.println(page_no + " | " + index_no + " | " + record[2] + " | " + record[8] + " | " + record[10]
                            + " | " + fname + " | " + mi + " | " + lname + " | " + father + " | " + mother + " | " + sponsor + " | " + notes + " | " + parish_priest + " | " + minister);
                    encoded coded = new encoded(page_no, index_no, record[2], fname, mi, lname, place_of_confirmation, place_of_birth, record[8], place_of_baptism, record[10], father, mother, sponsor, notes, parish_priest, minister);

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
            for (encoded to_encoding_confirmation : datas) {
                String s0 = "insert into encoding_confirmation("
                        + "ref_no"
                        + ",date_added"
                        + ",user_name"
                        + ",fname"
                        + ",mi"
                        + ",lname"
                        + ",b_place"
                        + ",address"
                        + ",father"
                        + ",mother"
                        + ",b_day"
                        + ",conf_date"
                        + ",gender"
                        + ",book_no"
                        + ",page_no"
                        + ",index_no"
                        + ",priest"
                        + ",sponsors"
                        + ",remarks"
                        + ",bapt_date"
                        + ",bapt_place"
                        + ",status"
                        + ",place_of_confirmation"
                        + ",registry_no"
                        + ",address_of_parents"
                        + ")values("
                        + ":ref_no"
                        + ",:date_added"
                        + ",:user_name"
                        + ",:fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:b_place"
                        + ",:address"
                        + ",:father"
                        + ",:mother"
                        + ",:b_day"
                        + ",:conf_date"
                        + ",:gender"
                        + ",:book_no"
                        + ",:page_no"
                        + ",:index_no"
                        + ",:priest"
                        + ",:sponsors"
                        + ",:remarks"
                        + ",:bapt_date"
                        + ",:bapt_place"
                        + ",:status"
                        + ",:place_of_confirmation"
                        + ",:registry_no"
                        + ",:address_of_parents"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("ref_no", "")
                        .setString("date_added", DateType.now())
                        .setString("user_name", "")
                        .setString("fname", to_encoding_confirmation.fname)
                        .setString("mi", to_encoding_confirmation.mi)
                        .setString("lname", to_encoding_confirmation.lname)
                        .setString("b_place", to_encoding_confirmation.place_of_baptism)
                        .setString("address", "")
                        .setString("father", to_encoding_confirmation.father)
                        .setString("mother", to_encoding_confirmation.mother)
                        .setString("b_day", to_encoding_confirmation.date_of_birth)
                        .setString("conf_date", to_encoding_confirmation.date_of_confirmation)
                        .setString("gender", "")
                        .setString("book_no", book_no)
                        .setString("page_no", to_encoding_confirmation.page_no)
                        .setString("index_no", to_encoding_confirmation.index_no)
                        .setString("priest", to_encoding_confirmation.minister)
                        .setString("sponsors", to_encoding_confirmation.sponsor)
                        .setString("remarks", to_encoding_confirmation.notes)
                        .setString("bapt_date", to_encoding_confirmation.date_of_baptism)
                        .setString("bapt_place", to_encoding_confirmation.place_of_baptism)
                        .setNumber("status", 1)
                        .setString("place_of_confirmation", to_encoding_confirmation.place_of_confirmation)
                        .setString("registry_no", "")
                        .setString("address_of_parents", "")
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

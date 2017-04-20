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
public class Bacong_encoded_baptism {

    public final String page_no;
    public final String index_no;
    public String fname;
    public String mi;
    public String lname;
    public final String date_of_baptism;
    public String parish_priest;
    public String minister;
    public final String date_of_birth;
    public String place_of_birth;
    public String place_of_baptism;
    public String father;
    public String mother;
    public String sponsors;
    public String remarks;

    public Bacong_encoded_baptism(String page_no, String index_no, String fname, String mi, String lname, String date_of_baptism, String parish_priest, String minister, String date_of_birth, String place_of_birth, String place_of_baptism, String father, String mother, String sponsors, String remarks) {
        this.page_no = page_no;
        this.index_no = index_no;
        this.fname = fname;
        this.mi = mi;
        this.lname = lname;
        this.date_of_baptism = date_of_baptism;
        this.parish_priest = parish_priest;
        this.minister = minister;
        this.date_of_birth = date_of_birth;
        this.place_of_birth = place_of_birth;
        this.place_of_baptism = place_of_baptism;
        this.father = father;
        this.mother = mother;
        this.sponsors = sponsors;
        this.remarks = remarks;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setParish_priest(String parish_priest) {
        this.parish_priest = parish_priest;
    }

    public void setMinister(String minister) {
        this.minister = minister;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public void setPlace_of_baptism(String place_of_baptism) {
        this.place_of_baptism = place_of_baptism;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setSponsors(String sponsors) {
        this.sponsors = sponsors;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public static void main(String[] args) {

        String path = "C:\\Users\\Guinness\\Desktop\\St Augustine\\Sacrament\\Bapt\\book 36.xls";
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
//        System.out.println("Size: " + datas.size());

//        add_parishioners_1(datas, "35");
    }

    public static class encoded {

        public final String page_no;
        public final String index_no;
        public final String date_of_baptism;
        public final String date_of_birth;
        public final String place_of_birth;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String father;
        public final String mother;
        public final String sponsor;
        public final String notes;
        public final String parish_priest;
        public final String minister;

        public encoded(String page_no, String index_no, String date_of_baptism, String date_of_birth, String place_of_birth, String fname, String mi, String lname, String father, String mother, String sponsor, String notes, String parish_priest, String minister) {
            this.page_no = page_no;
            this.index_no = index_no;
            this.date_of_baptism = date_of_baptism;
            this.date_of_birth = date_of_birth;
            this.place_of_birth = place_of_birth;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.father = father;
            this.mother = mother;
            this.sponsor = sponsor;
            this.notes = notes;
            this.parish_priest = parish_priest;
            this.minister = minister;
        }

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
                    if (j >= 14) {
                        break;
                    }
                    if (cell.getCellType() == 0) {
                        if (j == 5 || j == 8) {
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
                Date db1 = getRoundedDate(FitIn.toDouble(record[3]));

                String page_no = "" + FitIn.toInt(record[0]);
                String index_no = "" + FitIn.toInt(record[1]);
                String date_of_baptism = DateType.sf.format(db);
                String date_of_birth = DateType.sf.format(db1);
                String place_of_birth = record[4];
                String fname = record[5];
                String mi = record[6];
                String lname = record[7];
                String father = record[8];
                String mother = record[9];
                String sponsor = record[10];
                String notes = record[11];
                String parish_priest = record[12];
                String minister = record[13];

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
//                    System.out.println(page_no + " | " + index_no + " | " + date_of_baptism + " | " + date_of_birth + " | " + place_of_birth
//                            + " | " + fname + " | " + mi + " | " + lname + " | " + father + " | " + mother + " | " + sponsor + " | " + notes + " | " + parish_priest + " | " + minister);
                    encoded coded = new encoded(page_no, index_no, date_of_baptism, date_of_birth, place_of_birth, fname, mi, lname, father, mother, sponsor, notes, parish_priest, minister);
                    datas.add(coded);
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Opening File");
            System.out.println(ex);

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

    public static void add_parishioners_1(List<encoded> datas, String book_no, int delete_existing_record) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            PreparedStatement stmt = conn.prepareStatement("");

            if (delete_existing_record == 1) {
                String s1 = "delete from parishioners_1 where "
                        + " b_book_no ='" + book_no + "' "
                        + " ";
                stmt.addBatch(s1);
            }
            for (encoded to_parishioners_1 : datas) {
                String s0 = "insert into parishioners_1("
                        + "fname"
                        + ",mi"
                        + ",lname"
                        + ",date_of_baptism"
                        + ",date_of_birth"
                        + ",place_of_birth"
                        + ",father"
                        + ",mother"
                        + ",date_added"
                        + ",bapt_place"
                        + ",b_date"
                        + ",b_book_no"
                        + ",b_page_no"
                        + ",b_index_no"
                        + ",b_sponsors"
                        + ",b_minister"
                        + ",b_date_added"
                        + ",b_remarks"
                        + ",b_time"
                        + ")values("
                        + ":fname"
                        + ",:mi"
                        + ",:lname"
                        + ",:date_of_baptism"
                        + ",:date_of_birth"
                        + ",:place_of_birth"
                        + ",:father"
                        + ",:mother"
                        + ",:date_added"
                        + ",:bapt_place"
                        + ",:b_date"
                        + ",:b_book_no"
                        + ",:b_page_no"
                        + ",:b_index_no"
                        + ",:b_sponsors"
                        + ",:b_minister"
                        + ",:b_date_added"
                        + ",:b_remarks"
                        + ",:b_time"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("fname", to_parishioners_1.fname)
                        .setString("mi", to_parishioners_1.mi)
                        .setString("lname", to_parishioners_1.lname)
                        .setString("date_of_baptism", to_parishioners_1.date_of_baptism)
                        .setString("date_of_birth", to_parishioners_1.date_of_birth)
                        .setString("place_of_birth", to_parishioners_1.place_of_birth)
                        .setString("father", to_parishioners_1.father)
                        .setString("mother", to_parishioners_1.mother)
                        .setString("date_added", DateType.datetime.format(new Date()))
                        .setString("bapt_place", "")
                        .setString("b_date", to_parishioners_1.date_of_baptism)
                        .setString("b_book_no", book_no)
                        .setString("b_page_no", to_parishioners_1.page_no)
                        .setString("b_index_no", to_parishioners_1.index_no)
                        .setString("b_sponsors", to_parishioners_1.sponsor)
                        .setString("b_minister", to_parishioners_1.minister)
                        .setString("b_date_added", DateType.datetime.format(new Date()))
                        .setString("b_remarks", to_parishioners_1.notes)
                        .setString("b_time", to_parishioners_1.parish_priest)
                        .ok();

                stmt.addBatch(s0);

            }
            stmt.executeBatch();
            conn.commit();
            Lg.s(S1_encoding_baptism.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}

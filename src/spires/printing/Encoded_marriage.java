/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.printing;

import static spires.printing.Encoded_Funeral.getRoundedDate;
import spires.util.DateType;
import java.awt.FileDialog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import mijzcx.synapse.desk.utils.FitIn;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;

/**
 *
 * @author Guinness
 */
public class Encoded_marriage {
//    INDEX	BOOK #	PAGE #	Date of Marriage	PRIEST	GROOM	GROOM STATUS	
//    GROOM FATHER	GROOM MOTHER	GROOM ADDRESS	BRIDE	BRIDE STATUS	BRIDE FATHER	
//    BRIDE MOTHER	BRIDE ADDRESS	SPONSORS

    public static class to_encoded {

        public final String index_no;
        public final String book_no;
        public final String page_no;
        public final String date_of_marriage;
        public final String priest;
        public final String groom;
        public final String groom_status;
        public final String groom_father;
        public final String groom_mother;
        public final String groom_address;
        public final String bride;
        public final String bride_status;
        public final String bride_father;
        public final String bride_mother;
        public final String bride_address;
        public final String sponsors;

        public to_encoded(String index_no, String book_no, String page_no, String date_of_marriage, String priest, String groom, String groom_status, String groom_father, String groom_mother, String groom_address, String bride, String bride_status, String bride_father, String bride_mother, String bride_address, String sponsors) {
            this.index_no = index_no;
            this.book_no = book_no;
            this.page_no = page_no;
            this.date_of_marriage = date_of_marriage;
            this.priest = priest;
            this.groom = groom;
            this.groom_status = groom_status;
            this.groom_father = groom_father;
            this.groom_mother = groom_mother;
            this.groom_address = groom_address;
            this.bride = bride;
            this.bride_status = bride_status;
            this.bride_father = bride_father;
            this.bride_mother = bride_mother;
            this.bride_address = bride_address;
            this.sponsors = sponsors;
        }
    }

    public static void main(String[] args) {
//        FileDialog fd = new FileDialog(new JDialog(), "Choose .XLS FILE");
//        fd.setVisible(true);
//        if (fd.getDirectory() == null) {
//            return;
//        }
//        String file = fd.getDirectory() + "" + fd.getFile();
//        file = file.replace("\\", "\\\\");
//        final String file2 = file;
//        
//        if (file == null || file.isEmpty()) {
//            return;
//        }
        String path = "C:\\Users\\Guinness\\Documents\\Projects\\Cathedral\\Final Encoded\\backup\\Marriage_RECORD\\Done\\book_1.xls";
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

        showExcelData(sheetData, path);
    }

    public static List<Encoded_marriage.to_encoded> showExcelData(List sheetData, String path) {

        FileInputStream fis;
        List<Encoded_marriage.to_encoded> datas = new ArrayList();
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
                    if (j >= 0 && j <= 3) {
                        data = "" + cell.getNumericCellValue();
                    } else if (j == 3) {
                        data = "" + DateType.sf.format(getRoundedDate(cell.getNumericCellValue())) + "";

                    } else {
                        data = cell.getStringCellValue();
                    }
                    record[record_size] = data;
                    System.out.print(data + " | ");
                    record_size++;
                }
                Date d=getRoundedDate(FitIn.toDouble(record[3]));
                String da=DateType.sf.format(d);

                Encoded_marriage.to_encoded t = new Encoded_marriage.to_encoded(record[0], record[1], record[2], da, record[4], record[5], record[6], record[7], record[8], record[9], record[10], record[11], record[12], record[13], record[14], record[15]);
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

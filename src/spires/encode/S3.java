/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.encode;

import spires.parishioners.S1_parishioner;
import spires.util.DateType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mijzcx.synapse.desk.utils.FitIn;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;

/**
 *
 * @author i1
 */
public class S3 {

    @SuppressWarnings("unchecked")
    public static List<to_encoded> showExcelData(List sheetData, String path) {

        FileInputStream fis;
        List<to_encoded> datas = new ArrayList();
        try {
            fis = new FileInputStream(path);
            int r = 0;
            int r_set = 1;
            int id = FitIn.toInt(S1_parishioner.increment_id()) + 5;// FitIn.toInt(S4_insert_to_db.increment_id_parishioners()) + 1;
//            System.out.println(sheetData.size()+ " ===");
            String prev_no="";
            for (int i = 1; i < sheetData.size(); i++) {
                List list = (List) sheetData.get(i);
                int size = list.size();
                List<String> record = new ArrayList();
//                System.out.println(list.size() + " ====");
                for (int j = 0; j < list.size(); j++) {
                    HSSFCell cell = (HSSFCell) list.get(j);
                    HSSFDataFormatter hdf = new HSSFDataFormatter();
                    String data = "";

                    if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
                        String mydata = cell.getStringCellValue();
                        data = data + "" + mydata + "";
                        record.add(data);
                    } else {
                        if (j == 5 || j == 10) {
                            data = data + DateType.sf.format(getRoundedDate(cell.
                                    getNumericCellValue())) + "";
                            record.add(data);
                        } else {
                            if(j==0){
                                prev_no=""+cell.getNumericCellValue();
                            }
                            data = data + cell.getNumericCellValue() + "";
                            record.add(data);
                        }
                    }
                    
                }
//               
                String[] aw = new String[size];
                int jj = 0;
                for (String s : record) {
                    aw[jj] = s;
                    jj++;
                }
                if (r == 24) {
                    r_set++;
                }
                
                if (aw[3].equals("n/a")) {
                    aw[3] = "";
                }
                int page_no = FitIn.toInt(aw[0]);
                if(page_no==0){
                    page_no=FitIn.toInt(prev_no);
                }
                String no = "" + id;
                String fname = aw[2];
                String mi = aw[3];
                String lname = aw[4];
                String b_day = aw[5];
//                String b_day = DateType.convert_jan_1_2013_date_db2(aw[5]);
                String b_place = aw[6];
                String father = aw[7];
                String mother = aw[8];
                String address = aw[9];
                if (address.equals("n/a")) {
                    address = "";
                }
                  String baptism =aw[10];
//                String baptism = DateType.convert_jan_1_2013_date_db2(aw[10]);
                String minister = aw[11];
                String sponsor = aw[12];
                String notes = aw[13];
                if (notes.equals("n/a")) {
                    notes = "";
                }
                if (notes.equals("ok")) {
                    notes = "";
                }
//
//                Date d = new Date();
//                try {
//                    d = DateType.sf2.parse(b_day);
//                } catch (ParseException ex) {
//                    Logger.getLogger(S3.class.getName()).
//                            log(Level.SEVERE, null, ex);
//                }
//                Date d2 = new Date();
//                try {
//                    d2 = DateType.sf2.parse(baptism);
//                } catch (ParseException ex) {
//                    Logger.getLogger(S3.class.getName()).
//                            log(Level.SEVERE, null, ex);
//                }

//                int year = FitIn.toInt(get2(DateType.y.format(d))) ;//- 100;
//                System.out.println(year+" ------------- "+FitIn.toInt(DateType.y.format(d)));
////                if (year < 1900) {
////                    year = 19 + FitIn.toInt(get2("" + year));
////                }
//                String month = get("" + FitIn.toInt(DateType.m1.format(d)));
//                String day = get("" + FitIn.toInt(DateType.d.format(d)));
//                String bday = "" + year + "-" + month + "-" + day;
//                b_day = bday;
//
//                int year2 = FitIn.toInt(get2(DateType.y.format(d2)));// - 100;
//                
////                if (year2 == -79) {
////                    year2 = 1921;
////                }
////                System.out.println(year2+" ----------------" + " "+year);
////                if (year2 < 1900) {
////                     
////                    year2 = FitIn.toInt(get2("" + year2));
////                }
//               
//                String month2 = get("" + FitIn.toInt(DateType.m1.format(d2)));
//                String day2 = get("" + FitIn.toInt(DateType.d.format(d2)));
//                String bapt = "" + year2 + "-" + month2 + "-" + day2;
//                baptism = bapt;
//                baptism = DateType.sf.format(d2);
//                b_day = DateType.sf.format(d);

                sponsor = sponsor.replace("*", "");
                father = father.replace("*", "");
                mother = mother.replace("*", "");
                fname = fname.replace("*", "");
                mi = mi.replace("*", "");
                lname = lname.replace("*", "");

                to_encoded t = new to_encoded(page_no, no, fname, mi, lname, b_day, b_place, father, mother, address, baptism, minister, sponsor, notes, FitIn.
                        toInt(aw[1]));
                System.out.println(i+" = "+page_no + " " + no + " " + b_day);
                datas.add(t);
                r++;
                id++;
//                System.out.println("");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(S3.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return datas;

    }

    public static String get(String num) {
        String n = num;
        if (num.length() == 1) {
            n = "0" + n;
        }
        return n;
    }

    public static String get2(String num) {
        String n = num;
        n = num.substring(2, 4);
        n = "19" + n;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(get2("1823"));
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
        org.apache.poi.ss.usermodel.DateUtil.setCalendar(calendar, wholeDays,
                millisecondsInDay, false);
        return calendar.getTime();
    }

    public static class to_encoded {

        public final int id;
        public final String ref_id;
        public final String fname;
        public final String mi;
        public final String lname;
        public String b_day;
        public final String b_place;
        public final String father;
        public final String mother;
        public final String address;
        public String baptism;
        public final String minister;
        public final String sponsor;
        public String notes;
        public final int page_no;

        public to_encoded(int id, String ref_id, String fname, String mi, String lname, String b_day, String b_place, String father, String mother, String address, String baptism, String minister, String sponsor, String notes, int page_no) {
            this.id = id;
            this.ref_id = ref_id;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.b_day = b_day;
            this.b_place = b_place;
            this.father = father;
            this.mother = mother;
            this.address = address;
            this.baptism = baptism;
            this.minister = minister;
            this.sponsor = sponsor;
            this.notes = notes;
            this.page_no = page_no;
        }

        public String getB_day() {
            return b_day;
        }

        public void setB_day(String b_day) {
            this.b_day = b_day;
        }

        public String getBaptism() {
            return baptism;
        }

        public void setBaptism(String baptism) {
            this.baptism = baptism;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.marriage_contracts;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Ronald
 */
public class Srpt_marriage_contract_back {

    public final List<Srpt_marriage_contract_back.field> fields;

    public Srpt_marriage_contract_back() {
        this.fields = new ArrayList();
    }

    public static class field {

        String witnesses5;
        String witnesses6;
        String witnesses7;
        String witnesses8;
        String witnesses9;
        String witnesses10;
        String witnesses11;
        String witnesses12;
        String solem_officer;
        String solem_of;
        String solem_at;
        String solem_one1;
        String solem_one2;
        String solem_two1;
        String solem_two2;
        String solem_two3;
        String solem_two4;
        String solem_two5;
        String solem_two6;
        String solem_two7;
        String solem_administer1;
        String solem_administer2;
        String solem_administer3;
        String solem_administer4;
        String solem_administer5;
        String solem_administer6;
        String solem_administer7;
        String solem_administer8;
        String solem_administer9;
        String solem_administer10;
        String affid_by;
        String affid_address;
        String affid_one1;
        String affid_one2;
        String affid_one3;
        String affid_one4;
        String affid_one5;
        String affid_one6;
        String affid_one7;
        String affid_one8;
        String affid_one9;
        String affid_two1;
        String affid_two2;
        String affid_two3;
        String affid_two4;
        String affid_two5;
        String affid_three1;
        String affid_three2;
        String affid_three3;
        String affid_three4;
        String affid_three5;
        String affid_three6;
        String affid_four1;
        String affid_four2;
        String affid_four3;
        String affid_four4;
        String affid_five;
        String affid_administer1;
        String affid_administer2;
        String affid_administer3;
        String affid_administer4;
        String affid_administer5;
        String affid_administer6;
        String affid_administer7;
        String affid_administer8;
        String affid_administer9;
        String affid_administer10;

        public field() {
        }

        public field(String witnesses5, String witnesses6, String witnesses7, String witnesses8, String witnesses9, String witnesses10, String witnesses11, String witnesses12, String solem_officer, String solem_of, String solem_at, String solem_one1, String solem_one2, String solem_two1, String solem_two2, String solem_two3, String solem_two4, String solem_two5, String solem_two6, String solem_two7, String solem_administer1, String solem_administer2, String solem_administer3, String solem_administer4, String solem_administer5, String solem_administer6, String solem_administer7, String solem_administer8, String solem_administer9, String solem_administer10, String affid_by, String affid_address, String affid_one1, String affid_one2, String affid_one3, String affid_one4, String affid_one5, String affid_one6, String affid_one7, String affid_one8, String affid_one9, String affid_two1, String affid_two2, String affid_two3, String affid_two4, String affid_two5, String affid_three1, String affid_three2, String affid_three3, String affid_three4, String affid_three5,String affid_three6, String affid_four1, String affid_four2, String affid_four3, String affid_four4, String affid_five, String affid_administer1, String affid_administer2, String affid_administer3, String affid_administer4, String affid_administer5, String affid_administer6, String affid_administer7, String affid_administer8, String affid_administer9, String affid_administer10) {
            this.witnesses5 = witnesses5;
            this.witnesses6 = witnesses6;
            this.witnesses7 = witnesses7;
            this.witnesses8 = witnesses8;
            this.witnesses9 = witnesses9;
            this.witnesses10 = witnesses10;
            this.witnesses11 = witnesses11;
            this.witnesses12 = witnesses12;
            this.solem_officer = solem_officer;
            this.solem_of = solem_of;
            this.solem_at = solem_at;
            this.solem_one1 = solem_one1;
            this.solem_one2 = solem_one2;
            this.solem_two1 = solem_two1;
            this.solem_two2 = solem_two2;
            this.solem_two3 = solem_two3;
            this.solem_two4 = solem_two4;
            this.solem_two5 = solem_two5;
            this.solem_two6 = solem_two6;
            this.solem_two7 = solem_two7;
            this.solem_administer1 = solem_administer1;
            this.solem_administer2 = solem_administer2;
            this.solem_administer3 = solem_administer3;
            this.solem_administer4 = solem_administer4;
            this.solem_administer5 = solem_administer5;
            this.solem_administer6 = solem_administer6;
            this.solem_administer7 = solem_administer7;
            this.solem_administer8 = solem_administer8;
            this.solem_administer9 = solem_administer9;
            this.solem_administer10 = solem_administer10;
            this.affid_by = affid_by;
            this.affid_address = affid_address;
            this.affid_one1 = affid_one1;
            this.affid_one2 = affid_one2;
            this.affid_one3 = affid_one3;
            this.affid_one4 = affid_one4;
            this.affid_one5 = affid_one5;
            this.affid_one6 = affid_one6;
            this.affid_one7 = affid_one7;
            this.affid_one8 = affid_one8;
            this.affid_one9 = affid_one9;
            this.affid_two1 = affid_two1;
            this.affid_two2 = affid_two2;
            this.affid_two3 = affid_two3;
            this.affid_two4 = affid_two4;
            this.affid_two5 = affid_two5;
            this.affid_three1 = affid_three1;
            this.affid_three2 = affid_three2;
            this.affid_three3 = affid_three3;
            this.affid_three4 = affid_three4;
            this.affid_three5 = affid_three5;
            this.affid_three6=affid_three6;
            this.affid_four1 = affid_four1;
            this.affid_four2 = affid_four2;
            this.affid_four3 = affid_four3;
            this.affid_four4 = affid_four4;
            this.affid_five = affid_five;
            this.affid_administer1 = affid_administer1;
            this.affid_administer2 = affid_administer2;
            this.affid_administer3 = affid_administer3;
            this.affid_administer4 = affid_administer4;
            this.affid_administer5 = affid_administer5;
            this.affid_administer6 = affid_administer6;
            this.affid_administer7 = affid_administer7;
            this.affid_administer8 = affid_administer8;
            this.affid_administer9 = affid_administer9;
            this.affid_administer10 = affid_administer10;
        }

        public String getAffid_three6() {
            return affid_three6;
        }

        public void setAffid_three6(String affid_three6) {
            this.affid_three6 = affid_three6;
        }

        
        public String getWitnesses5() {
            return witnesses5;
        }

        public void setWitnesses5(String witnesses5) {
            this.witnesses5 = witnesses5;
        }

        public String getWitnesses6() {
            return witnesses6;
        }

        public void setWitnesses6(String witnesses6) {
            this.witnesses6 = witnesses6;
        }

        public String getWitnesses7() {
            return witnesses7;
        }

        public void setWitnesses7(String witnesses7) {
            this.witnesses7 = witnesses7;
        }

        public String getWitnesses8() {
            return witnesses8;
        }

        public void setWitnesses8(String witnesses8) {
            this.witnesses8 = witnesses8;
        }

        public String getWitnesses9() {
            return witnesses9;
        }

        public void setWitnesses9(String witnesses9) {
            this.witnesses9 = witnesses9;
        }

        public String getWitnesses10() {
            return witnesses10;
        }

        public void setWitnesses10(String witnesses10) {
            this.witnesses10 = witnesses10;
        }

        public String getWitnesses11() {
            return witnesses11;
        }

        public void setWitnesses11(String witnesses11) {
            this.witnesses11 = witnesses11;
        }

        public String getWitnesses12() {
            return witnesses12;
        }

        public void setWitnesses12(String witnesses12) {
            this.witnesses12 = witnesses12;
        }

        public String getSolem_officer() {
            return solem_officer;
        }

        public void setSolem_officer(String solem_officer) {
            this.solem_officer = solem_officer;
        }

        public String getSolem_of() {
            return solem_of;
        }

        public void setSolem_of(String solem_of) {
            this.solem_of = solem_of;
        }

        public String getSolem_at() {
            return solem_at;
        }

        public void setSolem_at(String solem_at) {
            this.solem_at = solem_at;
        }

        public String getSolem_one1() {
            return solem_one1;
        }

        public void setSolem_one1(String solem_one1) {
            this.solem_one1 = solem_one1;
        }

        public String getSolem_one2() {
            return solem_one2;
        }

        public void setSolem_one2(String solem_one2) {
            this.solem_one2 = solem_one2;
        }

        public String getSolem_two1() {
            return solem_two1;
        }

        public void setSolem_two1(String solem_two1) {
            this.solem_two1 = solem_two1;
        }

        public String getSolem_two2() {
            return solem_two2;
        }

        public void setSolem_two2(String solem_two2) {
            this.solem_two2 = solem_two2;
        }

        public String getSolem_two3() {
            return solem_two3;
        }

        public void setSolem_two3(String solem_two3) {
            this.solem_two3 = solem_two3;
        }

        public String getSolem_two4() {
            return solem_two4;
        }

        public void setSolem_two4(String solem_two4) {
            this.solem_two4 = solem_two4;
        }

        public String getSolem_two5() {
            return solem_two5;
        }

        public void setSolem_two5(String solem_two5) {
            this.solem_two5 = solem_two5;
        }

        public String getSolem_two6() {
            return solem_two6;
        }

        public void setSolem_two6(String solem_two6) {
            this.solem_two6 = solem_two6;
        }

        public String getSolem_two7() {
            return solem_two7;
        }

        public void setSolem_two7(String solem_two7) {
            this.solem_two7 = solem_two7;
        }

        public String getSolem_administer1() {
            return solem_administer1;
        }

        public void setSolem_administer1(String solem_administer1) {
            this.solem_administer1 = solem_administer1;
        }

        public String getSolem_administer2() {
            return solem_administer2;
        }

        public void setSolem_administer2(String solem_administer2) {
            this.solem_administer2 = solem_administer2;
        }

        public String getSolem_administer3() {
            return solem_administer3;
        }

        public void setSolem_administer3(String solem_administer3) {
            this.solem_administer3 = solem_administer3;
        }

        public String getSolem_administer4() {
            return solem_administer4;
        }

        public void setSolem_administer4(String solem_administer4) {
            this.solem_administer4 = solem_administer4;
        }

        public String getSolem_administer5() {
            return solem_administer5;
        }

        public void setSolem_administer5(String solem_administer5) {
            this.solem_administer5 = solem_administer5;
        }

        public String getSolem_administer6() {
            return solem_administer6;
        }

        public void setSolem_administer6(String solem_administer6) {
            this.solem_administer6 = solem_administer6;
        }

        public String getSolem_administer7() {
            return solem_administer7;
        }

        public void setSolem_administer7(String solem_administer7) {
            this.solem_administer7 = solem_administer7;
        }

        public String getSolem_administer8() {
            return solem_administer8;
        }

        public void setSolem_administer8(String solem_administer8) {
            this.solem_administer8 = solem_administer8;
        }

        public String getSolem_administer9() {
            return solem_administer9;
        }

        public void setSolem_administer9(String solem_administer9) {
            this.solem_administer9 = solem_administer9;
        }

        public String getSolem_administer10() {
            return solem_administer10;
        }

        public void setSolem_administer10(String solem_administer10) {
            this.solem_administer10 = solem_administer10;
        }

        public String getAffid_by() {
            return affid_by;
        }

        public void setAffid_by(String affid_by) {
            this.affid_by = affid_by;
        }

        public String getAffid_address() {
            return affid_address;
        }

        public void setAffid_address(String affid_address) {
            this.affid_address = affid_address;
        }

        public String getAffid_one1() {
            return affid_one1;
        }

        public void setAffid_one1(String affid_one1) {
            this.affid_one1 = affid_one1;
        }

        public String getAffid_one2() {
            return affid_one2;
        }

        public void setAffid_one2(String affid_one2) {
            this.affid_one2 = affid_one2;
        }

        public String getAffid_one3() {
            return affid_one3;
        }

        public void setAffid_one3(String affid_one3) {
            this.affid_one3 = affid_one3;
        }

        public String getAffid_one4() {
            return affid_one4;
        }

        public void setAffid_one4(String affid_one4) {
            this.affid_one4 = affid_one4;
        }

        public String getAffid_one5() {
            return affid_one5;
        }

        public void setAffid_one5(String affid_one5) {
            this.affid_one5 = affid_one5;
        }

        public String getAffid_one6() {
            return affid_one6;
        }

        public void setAffid_one6(String affid_one6) {
            this.affid_one6 = affid_one6;
        }

        public String getAffid_one7() {
            return affid_one7;
        }

        public void setAffid_one7(String affid_one7) {
            this.affid_one7 = affid_one7;
        }

        public String getAffid_one8() {
            return affid_one8;
        }

        public void setAffid_one8(String affid_one8) {
            this.affid_one8 = affid_one8;
        }

        public String getAffid_one9() {
            return affid_one9;
        }

        public void setAffid_one9(String affid_one9) {
            this.affid_one9 = affid_one9;
        }

        public String getAffid_two1() {
            return affid_two1;
        }

        public void setAffid_two1(String affid_two1) {
            this.affid_two1 = affid_two1;
        }

        public String getAffid_two2() {
            return affid_two2;
        }

        public void setAffid_two2(String affid_two2) {
            this.affid_two2 = affid_two2;
        }

        public String getAffid_two3() {
            return affid_two3;
        }

        public void setAffid_two3(String affid_two3) {
            this.affid_two3 = affid_two3;
        }

        public String getAffid_two4() {
            return affid_two4;
        }

        public void setAffid_two4(String affid_two4) {
            this.affid_two4 = affid_two4;
        }

        public String getAffid_two5() {
            return affid_two5;
        }

        public void setAffid_two5(String affid_two5) {
            this.affid_two5 = affid_two5;
        }

        public String getAffid_three1() {
            return affid_three1;
        }

        public void setAffid_three1(String affid_three1) {
            this.affid_three1 = affid_three1;
        }

        public String getAffid_three2() {
            return affid_three2;
        }

        public void setAffid_three2(String affid_three2) {
            this.affid_three2 = affid_three2;
        }

        public String getAffid_three3() {
            return affid_three3;
        }

        public void setAffid_three3(String affid_three3) {
            this.affid_three3 = affid_three3;
        }

        public String getAffid_three4() {
            return affid_three4;
        }

        public void setAffid_three4(String affid_three4) {
            this.affid_three4 = affid_three4;
        }

        public String getAffid_three5() {
            return affid_three5;
        }

        public void setAffid_three5(String affid_three5) {
            this.affid_three5 = affid_three5;
        }

        public String getAffid_four1() {
            return affid_four1;
        }

        public void setAffid_four1(String affid_four1) {
            this.affid_four1 = affid_four1;
        }

        public String getAffid_four2() {
            return affid_four2;
        }

        public void setAffid_four2(String affid_four2) {
            this.affid_four2 = affid_four2;
        }

        public String getAffid_four3() {
            return affid_four3;
        }

        public void setAffid_four3(String affid_four3) {
            this.affid_four3 = affid_four3;
        }

        public String getAffid_four4() {
            return affid_four4;
        }

        public void setAffid_four4(String affid_four4) {
            this.affid_four4 = affid_four4;
        }

        public String getAffid_five() {
            return affid_five;
        }

        public void setAffid_five(String affid_five) {
            this.affid_five = affid_five;
        }

        public String getAffid_administer1() {
            return affid_administer1;
        }

        public void setAffid_administer1(String affid_administer1) {
            this.affid_administer1 = affid_administer1;
        }

        public String getAffid_administer2() {
            return affid_administer2;
        }

        public void setAffid_administer2(String affid_administer2) {
            this.affid_administer2 = affid_administer2;
        }

        public String getAffid_administer3() {
            return affid_administer3;
        }

        public void setAffid_administer3(String affid_administer3) {
            this.affid_administer3 = affid_administer3;
        }

        public String getAffid_administer4() {
            return affid_administer4;
        }

        public void setAffid_administer4(String affid_administer4) {
            this.affid_administer4 = affid_administer4;
        }

        public String getAffid_administer5() {
            return affid_administer5;
        }

        public void setAffid_administer5(String affid_administer5) {
            this.affid_administer5 = affid_administer5;
        }

        public String getAffid_administer6() {
            return affid_administer6;
        }

        public void setAffid_administer6(String affid_administer6) {
            this.affid_administer6 = affid_administer6;
        }

        public String getAffid_administer7() {
            return affid_administer7;
        }

        public void setAffid_administer7(String affid_administer7) {
            this.affid_administer7 = affid_administer7;
        }

        public String getAffid_administer8() {
            return affid_administer8;
        }

        public void setAffid_administer8(String affid_administer8) {
            this.affid_administer8 = affid_administer8;
        }

        public String getAffid_administer9() {
            return affid_administer9;
        }

        public void setAffid_administer9(String affid_administer9) {
            this.affid_administer9 = affid_administer9;
        }

        public String getAffid_administer10() {
            return affid_administer10;
        }

        public void setAffid_administer10(String affid_administer10) {
            this.affid_administer10 = affid_administer10;
        }

    }

    public static void main(String[] args) {

        String where = "";
        List<Srpt_marriage_contract_back.field> fields1 = new ArrayList();
        String witnesses5 = "";
        String witnesses6 = "";
        String witnesses7 = "";
        String witnesses8 = "";
        String witnesses9 = "";
        String witnesses10 = "";
        String witnesses11 = "";
        String witnesses12 = "";
        String solem_officer = "";
        String solem_of = "";
        String solem_at = "";
        String solem_one1 = "";
        String solem_one2 = "";
        String solem_two1 = "";
        String solem_two2 = "";
        String solem_two3 = "";
        String solem_two4 = "";
        String solem_two5 = "";
        String solem_two6 = "";
        String solem_two7 = "";
        String solem_administer1 = "";
        String solem_administer2 = "";
        String solem_administer3 = "";
        String solem_administer4 = "";
        String solem_administer5 = "";
        String solem_administer6 = "";
        String solem_administer7 = "";
        String solem_administer8 = "";
        String solem_administer9 = "";
        String solem_administer10 = "";
        String affid_by = "";
        String affid_address = "";
        String affid_one1 = "";
        String affid_one2 = "";
        String affid_one3 = "";
        String affid_one4 = "";
        String affid_one5 = "";
        String affid_one6 = "";
        String affid_one7 = "";
        String affid_one8 = "";
        String affid_one9 = "";
        String affid_two1 = "";
        String affid_two2 = "";
        String affid_two3 = "";
        String affid_two4 = "";
        String affid_two5 = "";
        String affid_three1 = "";
        String affid_three2 = "";
        String affid_three3 = "";
        String affid_three4 = "";
        String affid_three5 = "";
        String affid_three6="";
        String affid_four1 = "";
        String affid_four2 = "";
        String affid_four3 = "";
        String affid_four4 = "";
        String affid_five = "";
        String affid_administer1 = "";
        String affid_administer2 = "";
        String affid_administer3 = "";
        String affid_administer4 = "";
        String affid_administer5 = "";
        String affid_administer6 = "";
        String affid_administer7 = "";
        String affid_administer8 = "";
        String affid_administer9 = "";
        String affid_administer10 = "";

        Srpt_marriage_contract_back.field field = new field(witnesses5, witnesses6, witnesses7, witnesses8, witnesses9, witnesses10, witnesses11, witnesses12, solem_officer, solem_of, solem_at, solem_one1, solem_one2, solem_two1, solem_two2, solem_two3, solem_two4, solem_two5, solem_two6, solem_two7, solem_administer1, solem_administer2, solem_administer3, solem_administer4, solem_administer5, solem_administer6, solem_administer7, solem_administer8, solem_administer9, solem_administer10, affid_by, affid_address, affid_one1, affid_one2, affid_one3, affid_one4, affid_one5, affid_one6, affid_one7, affid_one8, affid_one9, affid_two1, affid_two2, affid_two3, affid_two4, affid_two5, affid_three1, affid_three2, affid_three3, affid_three4, affid_three5,affid_three6, affid_four1, affid_four2, affid_four3, affid_four4, affid_five, affid_administer1, affid_administer2, affid_administer3, affid_administer4, affid_administer5, affid_administer6, affid_administer7, affid_administer8, affid_administer9, affid_administer10);
        fields1.add(field);
        Srpt_marriage_contract_back rpt = new Srpt_marriage_contract_back();
        rpt.fields.addAll(fields1);
        String jrxml = "rpt_marriage_contract_back.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_marriage_contract_back.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_marriage_contract_back to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
}

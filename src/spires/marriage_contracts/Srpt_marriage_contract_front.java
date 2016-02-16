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
public class Srpt_marriage_contract_front {

    public final List<Srpt_marriage_contract_front.field> fields;

    public Srpt_marriage_contract_front() {
        this.fields = new ArrayList();
    }

    public static class field {

        String province;
        String city;
        String registry_no;
        String place_of_marriage;
        String date_of_marriage;
        String time_of_marriage;
        String certification_contracting_parties1;
        String certification_contracting_parties2;
        String certification_solemnizing_parties1;
        String certification_solemnizing_parties2;
        String certification_solemnizing_parties3;
        String certification_solemnizing_parties4;
        String certification_solemnizing_parties5;
        String certification_solemnizing_parties6;
        String certification_solemnizing_parties7;
        String certification_solemnizing_parties8;
        String certification_solemnizing_parties9;
        String certification_solemnizing_parties10;
        String witnesses;
        String received_by1;
        String received_by2;
        String received_by3;
        String registered_by1;
        String registered_by2;
        String registered_by3;
        String remarks;
        String h_ref_no;
        String h_fname;
        String h_mi;
        String h_lname;
        String h_bday;
        String h_place_of_birth1;
        String h_place_of_birth2;
        String h_place_of_birth3;
        String h_citizenship1;
        String h_citizenship2;
        String h_residence;
        String h_religion;
        String h_civil_status;
        String h_father1;
        String h_father2;
        String h_father3;
        String h_father_citizenship;
        String h_mother1;
        String h_mother2;
        String h_mother3;
        String h_mother_citizenship;
        String h_consent_by1;
        String h_consent_by2;
        String h_consent_by3;
        String h_consent_by_relation;
        String h_consent_by_residence;
        String w_ref_no;
        String w_fname;
        String w_mi;
        String w_lname;
        String w_bday;
        String w_place_of_birth1;
        String w_place_of_birth2;
        String w_place_of_birth3;
        String w_citizenship1;
        String w_citizenship2;
        String w_residence;
        String w_religion;
        String w_civil_status;
        String w_father1;
        String w_father2;
        String w_father3;
        String w_father_citizenship;
        String w_mother1;
        String w_mother2;
        String w_mother3;
        String w_mother_citizenship;
        String w_consent_by1;
        String w_consent_by2;
        String w_consent_by3;
        String w_consent_by_relation;
        String w_consent_by_residence;
        String witnesses1;
        String witnesses2;
        String witnesses3;
        String witnesses4;
        String certification_contracting_parties3;
        String h_pob1;
        String h_pob2;
        String h_pob3;
        String w_pob1;
        String w_pob2;
        String w_pob3;
      
        public field() {
        }

        public field(String province, String city, String registry_no, String place_of_marriage, String date_of_marriage, String time_of_marriage, String certification_contracting_parties1, String certification_contracting_parties2, String certification_solemnizing_parties1, String certification_solemnizing_parties2, String certification_solemnizing_parties3, String certification_solemnizing_parties4, String certification_solemnizing_parties5, String certification_solemnizing_parties6, String certification_solemnizing_parties7, String certification_solemnizing_parties8, String certification_solemnizing_parties9, String certification_solemnizing_parties10, String witnesses, String received_by1, String received_by2, String received_by3, String registered_by1, String registered_by2, String registered_by3, String remarks, String h_ref_no, String h_fname, String h_mi, String h_lname, String h_bday, String h_place_of_birth1, String h_place_of_birth2, String h_place_of_birth3, String h_citizenship1, String h_citizenship2, String h_residence, String h_religion, String h_civil_status, String h_father1, String h_father2, String h_father3, String h_father_citizenship, String h_mother1, String h_mother2, String h_mother3, String h_mother_citizenship, String h_consent_by1, String h_consent_by2, String h_consent_by3, String h_consent_by_relation, String h_consent_by_residence, String w_ref_no, String w_fname, String w_mi, String w_lname, String w_bday, String w_place_of_birth1, String w_place_of_birth2, String w_place_of_birth3, String w_citizenship1, String w_citizenship2, String w_residence, String w_religion, String w_civil_status, String w_father1, String w_father2, String w_father3, String w_father_citizenship, String w_mother1, String w_mother2, String w_mother3, String w_mother_citizenship, String w_consent_by1, String w_consent_by2, String w_consent_by3, String w_consent_by_relation
                , String w_consent_by_residence,String witnesses1,String witnesses2,String witnesses3
                ,String witnesses4
                ,String certification_contracting_parties3
                ,String h_pob1,String h_pob2,String h_pob3,String w_pob1,String w_pob2,String w_pob3
        ) {
            this.province = province;
            this.city = city;
            this.registry_no = registry_no;
            this.place_of_marriage = place_of_marriage;
            this.date_of_marriage = date_of_marriage;
            this.time_of_marriage = time_of_marriage;
            this.certification_contracting_parties1 = certification_contracting_parties1;
            this.certification_contracting_parties2 = certification_contracting_parties2;
            this.certification_solemnizing_parties1 = certification_solemnizing_parties1;
            this.certification_solemnizing_parties2 = certification_solemnizing_parties2;
            this.certification_solemnizing_parties3 = certification_solemnizing_parties3;
            this.certification_solemnizing_parties4 = certification_solemnizing_parties4;
            this.certification_solemnizing_parties5 = certification_solemnizing_parties5;
            this.certification_solemnizing_parties6 = certification_solemnizing_parties6;
            this.certification_solemnizing_parties7 = certification_solemnizing_parties7;
            this.certification_solemnizing_parties8 = certification_solemnizing_parties8;
            this.certification_solemnizing_parties9 = certification_solemnizing_parties9;
            this.certification_solemnizing_parties10 = certification_solemnizing_parties10;
            this.witnesses = witnesses;
            this.received_by1 = received_by1;
            this.received_by2 = received_by2;
            this.received_by3 = received_by3;
            this.registered_by1 = registered_by1;
            this.registered_by2 = registered_by2;
            this.registered_by3 = registered_by3;
            this.remarks = remarks;
            this.h_ref_no = h_ref_no;
            this.h_fname = h_fname;
            this.h_mi = h_mi;
            this.h_lname = h_lname;
            this.h_bday = h_bday;
            this.h_place_of_birth1 = h_place_of_birth1;
            this.h_place_of_birth2 = h_place_of_birth2;
            this.h_place_of_birth3 = h_place_of_birth3;
            this.h_citizenship1 = h_citizenship1;
            this.h_citizenship2 = h_citizenship2;
            this.h_residence = h_residence;
            this.h_religion = h_religion;
            this.h_civil_status = h_civil_status;
            this.h_father1 = h_father1;
            this.h_father2 = h_father2;
            this.h_father3 = h_father3;
            this.h_father_citizenship = h_father_citizenship;
            this.h_mother1 = h_mother1;
            this.h_mother2 = h_mother2;
            this.h_mother3 = h_mother3;
            this.h_mother_citizenship = h_mother_citizenship;
            this.h_consent_by1 = h_consent_by1;
            this.h_consent_by2 = h_consent_by2;
            this.h_consent_by3 = h_consent_by3;
            this.h_consent_by_relation = h_consent_by_relation;
            this.h_consent_by_residence = h_consent_by_residence;
            this.w_ref_no = w_ref_no;
            this.w_fname = w_fname;
            this.w_mi = w_mi;
            this.w_lname = w_lname;
            this.w_bday = w_bday;
            this.w_place_of_birth1 = w_place_of_birth1;
            this.w_place_of_birth2 = w_place_of_birth2;
            this.w_place_of_birth3 = w_place_of_birth3;
            this.w_citizenship1 = w_citizenship1;
            this.w_citizenship2 = w_citizenship2;
            this.w_residence = w_residence;
            this.w_religion = w_religion;
            this.w_civil_status = w_civil_status;
            this.w_father1 = w_father1;
            this.w_father2 = w_father2;
            this.w_father3 = w_father3;
            this.w_father_citizenship = w_father_citizenship;
            this.w_mother1 = w_mother1;
            this.w_mother2 = w_mother2;
            this.w_mother3 = w_mother3;
            this.w_mother_citizenship = w_mother_citizenship;
            this.w_consent_by1 = w_consent_by1;
            this.w_consent_by2 = w_consent_by2;
            this.w_consent_by3 = w_consent_by3;
            this.w_consent_by_relation = w_consent_by_relation;
            this.w_consent_by_residence = w_consent_by_residence;
            this.witnesses1=witnesses1;
            this.witnesses2=witnesses2;
            this.witnesses3=witnesses3;
            this.witnesses4=witnesses4;
            this.certification_contracting_parties3=certification_contracting_parties3;
            this.h_pob1=h_pob1;
            this.h_pob2=h_pob2;
            this.h_pob3=h_pob3;
            this.w_pob1=w_pob1;
            this.w_pob2=w_pob2;
            this.w_pob3=w_pob3;
        }

        
       
        
        public String getCertification_contracting_parties3() {
            return certification_contracting_parties3;
        }

        public void setCertification_contracting_parties3(String certification_contracting_parties3) {
            this.certification_contracting_parties3 = certification_contracting_parties3;
        }

        
        public String getWitnesses1() {
            return witnesses1;
        }

        public void setWitnesses1(String witnesses1) {
            this.witnesses1 = witnesses1;
        }

        public String getWitnesses2() {
            return witnesses2;
        }

        public void setWitnesses2(String witnesses2) {
            this.witnesses2 = witnesses2;
        }

        public String getWitnesses3() {
            return witnesses3;
        }

        public void setWitnesses3(String witnesses3) {
            this.witnesses3 = witnesses3;
        }

        public String getWitnesses4() {
            return witnesses4;
        }

        public void setWitnesses4(String witnesses4) {
            this.witnesses4 = witnesses4;
        }

        
        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getRegistry_no() {
            return registry_no;
        }

        public void setRegistry_no(String registry_no) {
            this.registry_no = registry_no;
        }

        public String getPlace_of_marriage() {
            return place_of_marriage;
        }

        public void setPlace_of_marriage(String place_of_marriage) {
            this.place_of_marriage = place_of_marriage;
        }

        public String getDate_of_marriage() {
            return date_of_marriage;
        }

        public void setDate_of_marriage(String date_of_marriage) {
            this.date_of_marriage = date_of_marriage;
        }

        public String getTime_of_marriage() {
            return time_of_marriage;
        }

        public void setTime_of_marriage(String time_of_marriage) {
            this.time_of_marriage = time_of_marriage;
        }

        public String getCertification_contracting_parties1() {
            return certification_contracting_parties1;
        }

        public void setCertification_contracting_parties1(String certification_contracting_parties1) {
            this.certification_contracting_parties1 = certification_contracting_parties1;
        }

        public String getCertification_contracting_parties2() {
            return certification_contracting_parties2;
        }

        public void setCertification_contracting_parties2(String certification_contracting_parties2) {
            this.certification_contracting_parties2 = certification_contracting_parties2;
        }

        public String getCertification_solemnizing_parties1() {
            return certification_solemnizing_parties1;
        }

        public void setCertification_solemnizing_parties1(String certification_solemnizing_parties1) {
            this.certification_solemnizing_parties1 = certification_solemnizing_parties1;
        }

        public String getCertification_solemnizing_parties2() {
            return certification_solemnizing_parties2;
        }

        public void setCertification_solemnizing_parties2(String certification_solemnizing_parties2) {
            this.certification_solemnizing_parties2 = certification_solemnizing_parties2;
        }

        public String getCertification_solemnizing_parties3() {
            return certification_solemnizing_parties3;
        }

        public void setCertification_solemnizing_parties3(String certification_solemnizing_parties3) {
            this.certification_solemnizing_parties3 = certification_solemnizing_parties3;
        }

        public String getCertification_solemnizing_parties4() {
            return certification_solemnizing_parties4;
        }

        public void setCertification_solemnizing_parties4(String certification_solemnizing_parties4) {
            this.certification_solemnizing_parties4 = certification_solemnizing_parties4;
        }

        public String getCertification_solemnizing_parties5() {
            return certification_solemnizing_parties5;
        }

        public void setCertification_solemnizing_parties5(String certification_solemnizing_parties5) {
            this.certification_solemnizing_parties5 = certification_solemnizing_parties5;
        }

        public String getCertification_solemnizing_parties6() {
            return certification_solemnizing_parties6;
        }

        public void setCertification_solemnizing_parties6(String certification_solemnizing_parties6) {
            this.certification_solemnizing_parties6 = certification_solemnizing_parties6;
        }

        public String getCertification_solemnizing_parties7() {
            return certification_solemnizing_parties7;
        }

        public void setCertification_solemnizing_parties7(String certification_solemnizing_parties7) {
            this.certification_solemnizing_parties7 = certification_solemnizing_parties7;
        }

        public String getCertification_solemnizing_parties8() {
            return certification_solemnizing_parties8;
        }

        public void setCertification_solemnizing_parties8(String certification_solemnizing_parties8) {
            this.certification_solemnizing_parties8 = certification_solemnizing_parties8;
        }

        public String getCertification_solemnizing_parties9() {
            return certification_solemnizing_parties9;
        }

        public void setCertification_solemnizing_parties9(String certification_solemnizing_parties9) {
            this.certification_solemnizing_parties9 = certification_solemnizing_parties9;
        }

        public String getCertification_solemnizing_parties10() {
            return certification_solemnizing_parties10;
        }

        public void setCertification_solemnizing_parties10(String certification_solemnizing_parties10) {
            this.certification_solemnizing_parties10 = certification_solemnizing_parties10;
        }

        public String getWitnesses() {
            return witnesses;
        }

        public void setWitnesses(String witnesses) {
            this.witnesses = witnesses;
        }

        public String getReceived_by1() {
            return received_by1;
        }

        public void setReceived_by1(String received_by1) {
            this.received_by1 = received_by1;
        }

        public String getReceived_by2() {
            return received_by2;
        }

        public void setReceived_by2(String received_by2) {
            this.received_by2 = received_by2;
        }

        public String getReceived_by3() {
            return received_by3;
        }

        public void setReceived_by3(String received_by3) {
            this.received_by3 = received_by3;
        }

        public String getRegistered_by1() {
            return registered_by1;
        }

        public void setRegistered_by1(String registered_by1) {
            this.registered_by1 = registered_by1;
        }

        public String getRegistered_by2() {
            return registered_by2;
        }

        public void setRegistered_by2(String registered_by2) {
            this.registered_by2 = registered_by2;
        }

        public String getRegistered_by3() {
            return registered_by3;
        }

        public void setRegistered_by3(String registered_by3) {
            this.registered_by3 = registered_by3;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getH_ref_no() {
            return h_ref_no;
        }

        public void setH_ref_no(String h_ref_no) {
            this.h_ref_no = h_ref_no;
        }

        public String getH_fname() {
            return h_fname;
        }

        public void setH_fname(String h_fname) {
            this.h_fname = h_fname;
        }

        public String getH_mi() {
            return h_mi;
        }

        public void setH_mi(String h_mi) {
            this.h_mi = h_mi;
        }

        public String getH_lname() {
            return h_lname;
        }

        public void setH_lname(String h_lname) {
            this.h_lname = h_lname;
        }

        public String getH_bday() {
            return h_bday;
        }

        public void setH_bday(String h_bday) {
            this.h_bday = h_bday;
        }

        public String getH_place_of_birth1() {
            return h_place_of_birth1;
        }

        public void setH_place_of_birth1(String h_place_of_birth1) {
            this.h_place_of_birth1 = h_place_of_birth1;
        }

        public String getH_place_of_birth2() {
            return h_place_of_birth2;
        }

        public void setH_place_of_birth2(String h_place_of_birth2) {
            this.h_place_of_birth2 = h_place_of_birth2;
        }

        public String getH_place_of_birth3() {
            return h_place_of_birth3;
        }

        public void setH_place_of_birth3(String h_place_of_birth3) {
            this.h_place_of_birth3 = h_place_of_birth3;
        }

        public String getH_citizenship1() {
            return h_citizenship1;
        }

        public void setH_citizenship1(String h_citizenship1) {
            this.h_citizenship1 = h_citizenship1;
        }

        public String getH_citizenship2() {
            return h_citizenship2;
        }

        public void setH_citizenship2(String h_citizenship2) {
            this.h_citizenship2 = h_citizenship2;
        }

        public String getH_residence() {
            return h_residence;
        }

        public void setH_residence(String h_residence) {
            this.h_residence = h_residence;
        }

        public String getH_religion() {
            return h_religion;
        }

        public void setH_religion(String h_religion) {
            this.h_religion = h_religion;
        }

        public String getH_civil_status() {
            return h_civil_status;
        }

        public void setH_civil_status(String h_civil_status) {
            this.h_civil_status = h_civil_status;
        }

        public String getH_father1() {
            return h_father1;
        }

        public void setH_father1(String h_father1) {
            this.h_father1 = h_father1;
        }

        public String getH_father2() {
            return h_father2;
        }

        public void setH_father2(String h_father2) {
            this.h_father2 = h_father2;
        }

        public String getH_father3() {
            return h_father3;
        }

        public void setH_father3(String h_father3) {
            this.h_father3 = h_father3;
        }

        public String getH_father_citizenship() {
            return h_father_citizenship;
        }

        public void setH_father_citizenship(String h_father_citizenship) {
            this.h_father_citizenship = h_father_citizenship;
        }

        public String getH_mother1() {
            return h_mother1;
        }

        public void setH_mother1(String h_mother1) {
            this.h_mother1 = h_mother1;
        }

        public String getH_mother2() {
            return h_mother2;
        }

        public void setH_mother2(String h_mother2) {
            this.h_mother2 = h_mother2;
        }

        public String getH_mother3() {
            return h_mother3;
        }

        public void setH_mother3(String h_mother3) {
            this.h_mother3 = h_mother3;
        }

        public String getH_mother_citizenship() {
            return h_mother_citizenship;
        }

        public void setH_mother_citizenship(String h_mother_citizenship) {
            this.h_mother_citizenship = h_mother_citizenship;
        }

        public String getH_consent_by1() {
            return h_consent_by1;
        }

        public void setH_consent_by1(String h_consent_by1) {
            this.h_consent_by1 = h_consent_by1;
        }

        public String getH_consent_by2() {
            return h_consent_by2;
        }

        public void setH_consent_by2(String h_consent_by2) {
            this.h_consent_by2 = h_consent_by2;
        }

        public String getH_consent_by3() {
            return h_consent_by3;
        }

        public void setH_consent_by3(String h_consent_by3) {
            this.h_consent_by3 = h_consent_by3;
        }

        public String getH_consent_by_relation() {
            return h_consent_by_relation;
        }

        public void setH_consent_by_relation(String h_consent_by_relation) {
            this.h_consent_by_relation = h_consent_by_relation;
        }

        public String getH_consent_by_residence() {
            return h_consent_by_residence;
        }

        public void setH_consent_by_residence(String h_consent_by_residence) {
            this.h_consent_by_residence = h_consent_by_residence;
        }

        public String getW_ref_no() {
            return w_ref_no;
        }

        public void setW_ref_no(String w_ref_no) {
            this.w_ref_no = w_ref_no;
        }

        public String getW_fname() {
            return w_fname;
        }

        public void setW_fname(String w_fname) {
            this.w_fname = w_fname;
        }

        public String getW_mi() {
            return w_mi;
        }

        public void setW_mi(String w_mi) {
            this.w_mi = w_mi;
        }

        public String getW_lname() {
            return w_lname;
        }

        public void setW_lname(String w_lname) {
            this.w_lname = w_lname;
        }

        public String getW_bday() {
            return w_bday;
        }

        public void setW_bday(String w_bday) {
            this.w_bday = w_bday;
        }

        public String getW_place_of_birth1() {
            return w_place_of_birth1;
        }

        public void setW_place_of_birth1(String w_place_of_birth1) {
            this.w_place_of_birth1 = w_place_of_birth1;
        }

        public String getW_place_of_birth2() {
            return w_place_of_birth2;
        }

        public void setW_place_of_birth2(String w_place_of_birth2) {
            this.w_place_of_birth2 = w_place_of_birth2;
        }

        public String getW_place_of_birth3() {
            return w_place_of_birth3;
        }

        public void setW_place_of_birth3(String w_place_of_birth3) {
            this.w_place_of_birth3 = w_place_of_birth3;
        }

        public String getW_citizenship1() {
            return w_citizenship1;
        }

        public void setW_citizenship1(String w_citizenship1) {
            this.w_citizenship1 = w_citizenship1;
        }

        public String getW_citizenship2() {
            return w_citizenship2;
        }

        public void setW_citizenship2(String w_citizenship2) {
            this.w_citizenship2 = w_citizenship2;
        }

        public String getW_residence() {
            return w_residence;
        }

        public void setW_residence(String w_residence) {
            this.w_residence = w_residence;
        }

        public String getW_religion() {
            return w_religion;
        }

        public void setW_religion(String w_religion) {
            this.w_religion = w_religion;
        }

        public String getW_civil_status() {
            return w_civil_status;
        }

        public void setW_civil_status(String w_civil_status) {
            this.w_civil_status = w_civil_status;
        }

        public String getW_father1() {
            return w_father1;
        }

        public void setW_father1(String w_father1) {
            this.w_father1 = w_father1;
        }

        public String getW_father2() {
            return w_father2;
        }

        public void setW_father2(String w_father2) {
            this.w_father2 = w_father2;
        }

        public String getW_father3() {
            return w_father3;
        }

        public void setW_father3(String w_father3) {
            this.w_father3 = w_father3;
        }

        public String getW_father_citizenship() {
            return w_father_citizenship;
        }

        public void setW_father_citizenship(String w_father_citizenship) {
            this.w_father_citizenship = w_father_citizenship;
        }

        public String getW_mother1() {
            return w_mother1;
        }

        public void setW_mother1(String w_mother1) {
            this.w_mother1 = w_mother1;
        }

        public String getW_mother2() {
            return w_mother2;
        }

        public void setW_mother2(String w_mother2) {
            this.w_mother2 = w_mother2;
        }

        public String getW_mother3() {
            return w_mother3;
        }

        public void setW_mother3(String w_mother3) {
            this.w_mother3 = w_mother3;
        }

        public String getW_mother_citizenship() {
            return w_mother_citizenship;
        }

        public void setW_mother_citizenship(String w_mother_citizenship) {
            this.w_mother_citizenship = w_mother_citizenship;
        }

        public String getW_consent_by1() {
            return w_consent_by1;
        }

        public void setW_consent_by1(String w_consent_by1) {
            this.w_consent_by1 = w_consent_by1;
        }

        public String getW_consent_by2() {
            return w_consent_by2;
        }

        public void setW_consent_by2(String w_consent_by2) {
            this.w_consent_by2 = w_consent_by2;
        }

        public String getW_consent_by3() {
            return w_consent_by3;
        }

        public void setW_consent_by3(String w_consent_by3) {
            this.w_consent_by3 = w_consent_by3;
        }

        public String getW_consent_by_relation() {
            return w_consent_by_relation;
        }

        public void setW_consent_by_relation(String w_consent_by_relation) {
            this.w_consent_by_relation = w_consent_by_relation;
        }

        public String getW_consent_by_residence() {
            return w_consent_by_residence;
        }

        public void setW_consent_by_residence(String w_consent_by_residence) {
            this.w_consent_by_residence = w_consent_by_residence;
        }

        public String getH_pob1() {
            return h_pob1;
        }

        public void setH_pob1(String h_pob1) {
            this.h_pob1 = h_pob1;
        }

        public String getH_pob2() {
            return h_pob2;
        }

        public void setH_pob2(String h_pob2) {
            this.h_pob2 = h_pob2;
        }

        public String getH_pob3() {
            return h_pob3;
        }

        public void setH_pob3(String h_pob3) {
            this.h_pob3 = h_pob3;
        }

        public String getW_pob1() {
            return w_pob1;
        }

        public void setW_pob1(String w_pob1) {
            this.w_pob1 = w_pob1;
        }

        public String getW_pob2() {
            return w_pob2;
        }

        public void setW_pob2(String w_pob2) {
            this.w_pob2 = w_pob2;
        }

        public String getW_pob3() {
            return w_pob3;
        }

        public void setW_pob3(String w_pob3) {
            this.w_pob3 = w_pob3;
        }
        
    }

    public static void main(String[] args) {

        String where = "";
        List<Srpt_marriage_contract_front.field> fields1 = new ArrayList();
        String province = "";
        String city = "";
        String registry_no = "";
        String place_of_marriage = "";
        String date_of_marriage = "";
        String time_of_marriage = "";
        String certification_contracting_parties1 = "";
        String certification_contracting_parties2 = "";
        String certification_solemnizing_parties1 = "";
        String certification_solemnizing_parties2 = "";
        String certification_solemnizing_parties3 = "";
        String certification_solemnizing_parties4 = "";
        String certification_solemnizing_parties5 = "";
        String certification_solemnizing_parties6 = "";
        String certification_solemnizing_parties7 = "";
        String certification_solemnizing_parties8 = "";
        String certification_solemnizing_parties9 = "";
        String certification_solemnizing_parties10 = "";
        String witnesses = "";
        String received_by1 = "";
        String received_by2 = "";
        String received_by3 = "";
        String registered_by1 = "";
        String registered_by2 = "";
        String registered_by3 = "";
        String remarks = "";
        String h_ref_no = "";
        String h_fname = "";
        String h_mi = "";
        String h_lname = "";
        String h_bday = "";
        String h_place_of_birth1 = "";
        String h_place_of_birth2 = "";
        String h_place_of_birth3 = "";
        String h_citizenship1 = "";
        String h_citizenship2 = "";
        String h_residence = "";
        String h_religion = "";
        String h_civil_status = "";
        String h_father1 = "";
        String h_father2 = "";
        String h_father3 = "";
        String h_father_citizenship = "";
        String h_mother1 = "";
        String h_mother2 = "";
        String h_mother3 = "";
        String h_mother_citizenship = "";
        String h_consent_by1 = "";
        String h_consent_by2 = "";
        String h_consent_by3 = "";
        String h_consent_by_relation = "";
        String h_consent_by_residence = "";
        String w_ref_no = "";
        String w_fname = "";
        String w_mi = "";
        String w_lname = "";
        String w_bday = "";
        String w_place_of_birth1 = "";
        String w_place_of_birth2 = "";
        String w_place_of_birth3 = "";
        String w_citizenship1 = "";
        String w_citizenship2 = "";
        String w_residence = "";
        String w_religion = "";
        String w_civil_status = "";
        String w_father1 = "";
        String w_father2 = "";
        String w_father3 = "";
        String w_father_citizenship = "";
        String w_mother1 = "";
        String w_mother2 = "";
        String w_mother3 = "";
        String w_mother_citizenship = "";
        String w_consent_by1 = "";
        String w_consent_by2 = "";
        String w_consent_by3 = "";
        String w_consent_by_relation = "";
        String w_consent_by_residence = "";
        String witnesses1="";
        String witnesses2="";
        String witnesses3="";
        String witnesses4="";
        String h_pob1="1";
        String h_pob2="2";
        String h_pob3="3";
        String w_pob1="4";
        String w_pob2="5";
        String w_pob3="6";
        Srpt_marriage_contract_front.field field = new field(province, city, registry_no, place_of_marriage, date_of_marriage, time_of_marriage
                , certification_contracting_parties1, certification_contracting_parties2, certification_solemnizing_parties1
                , certification_solemnizing_parties2, certification_solemnizing_parties3, certification_solemnizing_parties4, certification_solemnizing_parties5, certification_solemnizing_parties6, certification_solemnizing_parties7, certification_solemnizing_parties8, certification_solemnizing_parties9, certification_solemnizing_parties10, witnesses, received_by1, received_by2, received_by3, registered_by1, registered_by2, registered_by3, remarks, h_ref_no, h_fname, h_mi, h_lname, h_bday, h_place_of_birth1, h_place_of_birth2, h_place_of_birth3, h_citizenship1, h_citizenship2, h_residence, h_religion, h_civil_status, h_father1, h_father2, h_father3, h_father_citizenship, h_mother1, h_mother2, h_mother3, h_mother_citizenship, h_consent_by1, h_consent_by2, h_consent_by3, h_consent_by_relation, h_consent_by_residence, w_ref_no, w_fname, w_mi, w_lname, w_bday, w_place_of_birth1, w_place_of_birth2, w_place_of_birth3, w_citizenship1, w_citizenship2, w_residence, w_religion, w_civil_status, w_father1, w_father2, w_father3, w_father_citizenship, w_mother1, w_mother2, w_mother3, w_mother_citizenship
                , w_consent_by1, w_consent_by2, w_consent_by3, w_consent_by_relation, w_consent_by_residence
                , witnesses1,witnesses2,witnesses3,witnesses4
                , "",h_pob1,h_pob2,h_pob3,w_pob1,w_pob2,w_pob3);
       
        fields1.add(field);
        Srpt_marriage_contract_front rpt = new Srpt_marriage_contract_front();
        rpt.fields.addAll(fields1);
        String jrxml = "rpt_marriage_contract_front.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_marriage_contract_front.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_marriage_contract_front to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
}

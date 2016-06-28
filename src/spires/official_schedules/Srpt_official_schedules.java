/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.official_schedules;

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
import spires.util.DateType;

/**
 *
 * @author Guinness
 */
public class Srpt_official_schedules {

    public final List<field> fields;

    public Srpt_official_schedules() {
        this.fields = new ArrayList();
    }

    public static class field {

        String official;
        String official_id;
        String schedule_date;
        String schedule_time;
        String schedule_type;
        String schedule_address;
        String parishioner;
        String parishioner_contact_no;

        public field() {
        }

        public field(String official, String official_id, String schedule_date, String schedule_time, String schedule_type, String schedule_address, String parishioner, String parishioner_contact_no) {
            this.official = official;
            this.official_id = official_id;
            this.schedule_date = schedule_date;
            this.schedule_time = schedule_time;
            this.schedule_type = schedule_type;
            this.schedule_address = schedule_address;
            this.parishioner = parishioner;
            this.parishioner_contact_no = parishioner_contact_no;
        }

        public String getOfficial() {
            return official;
        }

        public void setOfficial(String official) {
            this.official = official;
        }

        public String getOfficial_id() {
            return official_id;
        }

        public void setOfficial_id(String official_id) {
            this.official_id = official_id;
        }

        public String getSchedule_date() {
            return schedule_date;
        }

        public void setSchedule_date(String schedule_date) {
            this.schedule_date = schedule_date;
        }

        public String getSchedule_time() {
            return schedule_time;
        }

        public void setSchedule_time(String schedule_time) {
            this.schedule_time = schedule_time;
        }

        public String getSchedule_type() {
            return schedule_type;
        }

        public void setSchedule_type(String schedule_type) {
            this.schedule_type = schedule_type;
        }

        public String getSchedule_address() {
            return schedule_address;
        }

        public void setSchedule_address(String schedule_address) {
            this.schedule_address = schedule_address;
        }

        public String getParishioner() {
            return parishioner;
        }

        public void setParishioner(String parishioner) {
            this.parishioner = parishioner;
        }

        public String getParishioner_contact_no() {
            return parishioner_contact_no;
        }

        public void setParishioner_contact_no(String parishioner_contact_no) {
            this.parishioner_contact_no = parishioner_contact_no;
        }

    }

    public static void main(String[] args) {

        List<Srpt_official_schedules.field> fields = new ArrayList();
        List<Official_schedules.to_official_schedules> datas = Official_schedules.ret_data("");
        for (Official_schedules.to_official_schedules to : datas) {
            String official = to.official;
            String official_id = to.official_id;
            String schedule_date = DateType.convert_mon_datetime3(to.schedule_time_from);
            String schedule_time = DateType.convert_slash_datetime3(to.schedule_time_from) + " - " + DateType.convert_slash_datetime3(to.schedule_time_to);;
            String schedule_type = to.schedule_type;
            String schedule_address = to.schedule_address;
            String parishioner = to.parishioner;
            String parishioner_contact_no = to.parishioner_contact_no;
            Srpt_official_schedules.field field = new field(official, official_id, schedule_date, schedule_time, schedule_type, schedule_address, parishioner, parishioner_contact_no);
            fields.add(field);
        }
        Srpt_official_schedules rpt = new Srpt_official_schedules();
        rpt.fields.addAll(fields);
        String jrxml = "rpt_official_schedules.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_official_schedules.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_official_schedules to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

}

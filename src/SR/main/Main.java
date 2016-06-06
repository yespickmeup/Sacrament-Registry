/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SR.main;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.*;
import spires.pnl.Dashboard;

import spires.util.Center;

/**
 *
 * @author u2
 */
public class Main {

    public void start() {
        Application.setSystemLookAndFeel();
        Dashboard dialog = new Dashboard();
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/SR/main/spi (Custom) (Custom).png"));
        dialog.setIconImage(image);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {

        Window p = (Window) new JFrame();
        loading nd = loading.create(p, true);
        nd.setTitle("");
//        nd.do_pass("");
        nd.setCallback(new loading.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, loading.OutputData data) {
                closeDialog.ok();
            }
        });
        Center.setCenter(nd);

        nd.setVisible(true);
        try {
            String conf = (args.length > 0
                    ? args[0]
                    : null);
            Properties prop = new Properties();

            String userHome = System.getProperty("user.home");
            System.out.println(userHome);
            conf = (conf == null
                    ? "sacrament_registry.conf"
                    : conf);
            System.out.println(conf);
            File file = new File(userHome + "/" + conf);
            if (file.exists()) {
                InputStream is = new FileInputStream(file);
                prop.load(is);
            } else {
                file = new File(conf);
                if (file.exists()) {
                    InputStream is = new FileInputStream(file);
                    prop.load(is);
                }
            }

            Properties info = new Properties();
            info.setProperty("proxool.maximum-connection-count", "5000000");

            System.setProperty("entityName", prop.getProperty("entityName", "Intelink-One"));
            System.setProperty("pdf.reader.loc", prop.getProperty("pdf.reader.loc", "AcroRd32.exe"));
            System.setProperty("instanceSocket", prop.getProperty("instanceSocket", "800"));
            System.setProperty("HOST_CONN_PYOP_SEND", prop.getProperty("server_conn", "localhost"));
            System.setProperty("HOST_PARAM_PYOP_SEND", prop.getProperty("server_param", "?user=root&password=password"));
            System.setProperty("pool_host", prop.getProperty("pool_host", "localhost"));
            System.setProperty("pool_user", prop.getProperty("pool_user", "root"));
            System.setProperty("pool_password", prop.getProperty("pool_password", "password"));
            System.out.println(prop.getProperty("pool_host", "localhost"));

            System.setProperty("cashiering_for", prop.getProperty("cashiering_for", "coop"));
            System.setProperty("version", prop.getProperty("version", "retail"));
            System.setProperty("admin", prop.getProperty("admin", "false"));
            System.setProperty("img_path", prop.getProperty("img_path", "C:\\Users\\Dummy\\"));
            System.setProperty("license", prop.getProperty("license", ""));
            System.setProperty("terminal", prop.getProperty("terminal", "T1"));
            System.setProperty("receipt_printer_disabled", prop.getProperty("receipt_printer_disabled", "true"));
            System.setProperty("receipt_printer_show_dialog", prop.getProperty("receipt_printer_show_dialog", "false"));
            System.setProperty("receipt_printer", prop.getProperty("receipt_printer", ""));
            System.setProperty("report_printer_show_dialog", prop.getProperty("report_printer_show_dialog", "false"));
            System.setProperty("report_printer", prop.getProperty("report_printer", ""));
            //RECEIPT STMS
            System.setProperty("receipt_store_name", prop.getProperty("receipt_store_name", "SYNAPSE"));
            System.setProperty("receipt_infos", prop.getProperty("receipt_infos", "DUMAGUETE CITY"));
            System.setProperty("receipt_footer", prop.getProperty("receipt_footer", "THIS IS NOT AN OFFICIAL RECEIPT\nThank you come again!!!"));

            System.setProperty("stock_lenient", prop.getProperty("stock_lenient", "false"));
            System.setProperty("touch", prop.getProperty("touch", "false"));
            System.setProperty("do_print", prop.getProperty("do_print", "false"));
            System.setProperty("open_drawer", prop.getProperty("open_drawer", "false"));
            System.setProperty("mydb", prop.getProperty("mydb", "db_bulletin"));
            System.setProperty("time", prop.getProperty("time", "full"));
            System.setProperty("ui_items", prop.getProperty("ui_items", "list"));

            System.setProperty("strict_cashout", prop.getProperty("strict_cashout", "false"));
            String mydb = System.getProperty("mydb", "db_bulletin");

            //RECEIPT CONFIGS
            System.setProperty("business_name", prop.getProperty("business_name", "Synapse Software Tech"));
            System.setProperty("operated_by", prop.getProperty("operated_by", "Operated by: Ronald Pascua"));
            System.setProperty("address", prop.getProperty("address", "Address: Dumaguete City"));
            System.setProperty("telephone_number", prop.getProperty("telephone_number", "Tel No: 09261625529"));
            System.setProperty("tin_no", prop.getProperty("tin_no", "TIN #: 0343434"));
            System.setProperty("min_no", prop.getProperty("min_no", "MIN NO: 345345"));
            System.setProperty("serial_no", prop.getProperty("serial_no", "Serial No. 32234"));
            System.setProperty("permit_no", prop.getProperty("permit_no", "Permit No:435345"));
            System.setProperty("pos_no", prop.getProperty("pos_no", "POS No:000001 "));
            System.setProperty("print_to_receipts", prop.getProperty("print_to_receipts", "false"));
            System.setProperty("slogan", prop.getProperty("slogan", ""));

            System.setProperty("cashier_print", prop.getProperty("cashier_print", "false"));

            System.setProperty("print_baptism", prop.getProperty("print_baptism", "default"));
            System.setProperty("print_confirmation", prop.getProperty("print_confirmation", "default"));
            System.setProperty("print_death", prop.getProperty("print_death", "default"));
            System.setProperty("print_marriage", prop.getProperty("print_marriage", "default"));

            Lg.$.severe(System.getProperty("receipt_printer"));

            new Main().start();
        } catch (Exception ex) {
//                    Lg.$.severe(ex.getMessage());
            throw new RuntimeException(ex);
        }

    }

    public void aw() {
    }

    public static class ImgPath {

        public static String path;

        public ImgPath(String username) {
            path = username;
        }

        public static String getPath() {
            return path;
        }

        public static void setPath(String path) {
            Main.ImgPath.path = path;
        }
    }
}

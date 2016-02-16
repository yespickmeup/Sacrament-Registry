/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.awt.Toolkit;
import java.io.File;
import java.io.InputStream;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import spires.pnl.Dashboard;



/**
 *
 * @author i1
 */
public class Wallpaper {

    public static void do_set(String img_url, JFrame pn) {
        JLabel l = new JLabel();
        File fi = new File("/home/i1/AYAW ABRIHI/store/src/bgs/800X600_2 copy.png");
        InputStream is = Dashboard.class.getResourceAsStream(img_url);
//        InputStream is1 = Wallpaper.class.getResourceAsStream(img_url);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        System.out.println(xSize + " " + ySize);
        l.setSize(xSize, ySize);

        ImageMounter2.do_set(l, is);
        pn.add(l);

//        j.add(pn);


    }

    public static void do_set(String img_url, JPanel pn) {
        JLabel l = new JLabel();
        File fi = new File("/home/i1/AYAW ABRIHI/store/src/bgs/800X600_2 copy.png");
        InputStream is = Dashboard.class.getResourceAsStream(img_url);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        System.out.println(xSize + " " + ySize);
        l.setSize(xSize, ySize);
        System.out.println(is);
        ImageMounter2.do_set(l, is);
        pn.add(l);

//        j.add(pn);


    }

    public static void do_set(String img_url, JDialog pn) {
        JLabel l = new JLabel();
        File fi = new File("/home/i1/AYAW ABRIHI/store/src/bgs/800X600_2 copy.png");
        InputStream is = Dashboard.class.getResourceAsStream(img_url);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        System.out.println(xSize + " " + ySize);
        l.setSize(xSize, ySize);

        ImageMounter2.do_set(l, is);
        pn.add(l);

//        j.add(pn);


    }
}

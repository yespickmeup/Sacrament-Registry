/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JDialog;

/**
 *
 * @author Dummy
 */
public class Maximize {

    public static void set(JDialog comp) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());

//        Center.setCenter(nd);
      
        comp.setVisible(true);
          comp.setSize(xSize, ySize);
       
    }
      public static void set(JComponent comp) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());

//        Center.setCenter(nd);
        comp.setVisible(true);
        comp.setSize(xSize, ySize);
    }
}

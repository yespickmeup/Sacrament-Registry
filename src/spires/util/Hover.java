/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Guinness
 */
public class Hover {

    public static void set(JButton[] btns) {
        for (final JButton btn : btns) {
            btn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new java.awt.Color(217, 104, 17));

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new java.awt.Color(255, 255, 255));
                }

            });
        }

    }
}

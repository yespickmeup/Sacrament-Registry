/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.util.TimerTask;
import javax.security.auth.callback.Callback;
import javax.swing.SwingUtilities;

/**
 *
 * @author Carlo
 */
public class cc {

    private static Callback callback;

    public void setCallback(Callback callback) {
        cc.callback = callback;
    }

    public static interface Callback {

        void ok(String time);
    }
    static int s = 60;
    static int m = 30;
    static int h = 0;
    static String ti = "";

    public static void testUtilTimer() {
        final java.util.Timer utilTimer = new java.util.Timer();
        utilTimer.schedule(
                new TimerTask() {

                    @Override
                    public void run() {
                        SwingUtilities.invokeLater(
                                new Runnable() {

                                    @Override
                                    public void run() {
                                        if (m != 0) {
                                            s--;
                                            if (s == 0) {
                                                s = 59;
                                                m--;
                                                if (m == 0 && h != 0) {
                                                    m = 59;
                                                }
                                            }
                                            ti = m + " : " + s;
                                            callback.ok(ti);
                                        } else {
                                            callback.ok("STOP");
                                            utilTimer.cancel();
                                        }
                                    }
                                });
                    }
                },
                0,
                1000);
    }

    public static void main(String[] args) {
//        testUtilTimer();

      
    }
}

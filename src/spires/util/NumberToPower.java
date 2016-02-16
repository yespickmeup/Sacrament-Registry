/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

/**
 *
 * @author Dummy
 */
public class NumberToPower {

    public static String set(String n) {
        String new_str = "";

        int row = n.length();
        try {
            new_str = n.substring(row - 1, row);
//            if (new_str.equals("1")) {
//                new_str = n + "st";
//            }
//            if (new_str.equals("2")) {
//                new_str = n + "nd";
//            }
//            if (new_str.equals("3")) {
//                new_str = n + "rd";
//            }
            if (Integer.parseInt(n) > 10 && Integer.parseInt(n) < 20) {

                new_str = n + "th";

            } else {
                if (new_str.equals("1")) {
                    new_str = n + "st";
                } else if (new_str.equals("2")) {
                    new_str = n + "nd";
                } else if (new_str.equals("3")) {
                    new_str = n + "rd";
                } else {
                    new_str = n + "th";
                }
            }

            if(new_str.startsWith("0")){
                new_str=new_str.substring(1, new_str.length());
            }
            System.out.println(new_str);
            return new_str;
        } catch (Exception e) {
            return "";
        }
    }

    public static void main(String[] args) {
        set("01200");
    }
}

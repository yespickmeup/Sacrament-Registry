/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.test;

/**
 *
 * @author Guinness
 */
public class Array {

    public static void main(String[] args) {
        String s = "1%2";
        String[] list = set(s, 4);

    }

    public static String[] set(String stmt, int size) {
        String[] aw = stmt.split("%");
        String[] n_list = new String[size];
        for (int i = 0; i < size; i++) {
            try {
                n_list[i] = aw[i];

            } catch (Exception e) {
                n_list[i] = "";
            }
           
        }
        return n_list;
    }

}

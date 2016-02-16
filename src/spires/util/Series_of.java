/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spires.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dummy
 */
public class Series_of {
    
    static SimpleDateFormat sf=new SimpleDateFormat("yyyy");
    public static String series(){
        
        int year2=Integer.parseInt(sf.format(new Date()));
        int year1=year2-1;
        
        String series=""+year1+ " - "+year2;
        return series;
    }
    public static void main(String[] args) {
        System.out.println(series());
    }
    
}

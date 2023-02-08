/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclasstesting;

/**
 *
 * @author user
 */
public class RoundingDoubleValueForSpecificDecimalPlaces {
    public static void main(String[] args) {
        double d = 5.899090900;
        //rounding for 6 decimal places
        System.out.println(Math.round(d*1000000.00)/1000000.00);
            
    }
            
    
}

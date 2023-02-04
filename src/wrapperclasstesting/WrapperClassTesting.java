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
public class WrapperClassTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        if (i.intValue() == j.intValue()) {
            System.out.println("Values are equlas");
        } else {
            System.out.println("Values are not equals");
        }
        if (i == j) {
            System.out.println("Objects are equlas");
        } else {
            System.out.println("Objects are not equals");
        }
    }

}

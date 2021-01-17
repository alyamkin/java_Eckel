/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package initializationex14;

/**
 *
 * @author Andrey
 */

class Go {
    static String s1 = "run";
    static String s2, s3;
    
    static {
        s2 = "drive car";
        s3 = "fly plane";
        System.out.println("s2 & s3 initialized");
    }
    static void how() {
        System.out.println(s1 + " or " + s2 + " or " + s3);
    }
    
    Go() {
        System.out.println("Go()");
    }
}
public class InitializationEx14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inside main()");
        Go.how();
        System.out.println("Go.s1: " + Go.s1);
        
    }

    static Go g1 = new Go();
    static Go g2 = new Go();
    
}

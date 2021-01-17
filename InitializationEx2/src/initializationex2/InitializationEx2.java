/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex2;

/**
 *
 * @author Andrey
 */
class Tester1 {
    String s1;
    String s2 = "hello";
    String s3;
    Tester1() { s3 = "good-bye"; }
}


public class InitializationEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tester1 t = new Tester1();
        System.out.println("t.s1: " + t.s1);
        System.out.println("t.s2: " + t.s2);
        System.out.println("t.s3: " + t.s3);
    }
    
}

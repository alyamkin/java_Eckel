/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex15;

/**
 *
 * @author Andrey
 */
class Pencil {
    String str;
    {
        str = "A pencil";
        System.out.println("initializtion string " + str);
    }
    Pencil() {
        System.out.println("Inside pencil constructor");
    }
}
public class InitializationEx15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Insile main method");
        Pencil p1 = new Pencil();
    }
    
}

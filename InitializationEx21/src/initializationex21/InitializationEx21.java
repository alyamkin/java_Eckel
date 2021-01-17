/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex21;

/**
 *
 * @author Andrey
 */

public class InitializationEx21 {
    public enum Bills {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(Bills b : Bills.values()) {
            System.out.println(b + ", ordinal " + b.ordinal());
        }
    }
    
}

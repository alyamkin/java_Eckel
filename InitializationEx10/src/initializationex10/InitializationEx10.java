/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex10;

/**
 *
 * @author Andrey
 */
class Test {
    protected void finalize() {
        System.out.println("Message from finalize");
    }
}
public class InitializationEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test test = new Test();
        test = null;
        System.gc();
    }
    
}

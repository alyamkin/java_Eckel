/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessex06;

/**
 *
 * @author lyamkin
 */

class Test1 {
    protected int num1 = 5;
}

public class AccessEx06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test.num1);
    }
    
    
    
}

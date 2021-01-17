/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex17;

/**
 *
 * @author Andrey
 */
class Test{
    Test(String str) {
        System.out.println(str);
    }
}
public class InitializationEx17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test [] testObjArr = new Test[]{new Test("One"), new Test("Two"), new Test("Three")};
    }
    
}

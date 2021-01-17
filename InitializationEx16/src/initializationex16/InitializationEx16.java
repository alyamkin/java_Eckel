/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex16;

/**
 *
 * @author Andrey
 */
class Test {
    String [] strArr = new String[]{"One", "Two","Three"};
}
public class InitializationEx16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test test = new Test();
        for(String str : test.strArr) {
            System.out.println(str);
        }
    }
    
}

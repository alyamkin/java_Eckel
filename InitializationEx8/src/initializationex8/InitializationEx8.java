/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex8;

/**
 *
 * @author Andrey
 */
class Test {
    public void method1() {
        method2();
        this.method2();
    }
    public void method2() {
        System.out.println("Method2");
    }
}
public class InitializationEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test test = new Test();
        test.method1();
    }
    
}

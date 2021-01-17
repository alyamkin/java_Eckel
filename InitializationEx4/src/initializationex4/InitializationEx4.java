/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex4;

class Test4 {
    Test4() {
        System.out.println("Test3 class");
    }
    
    Test4(String message){
        this();
        System.out.println(message);
    }
    
}
public class InitializationEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test4 test = new Test4("This is overloaded Test4(String message)");
    }
    
}

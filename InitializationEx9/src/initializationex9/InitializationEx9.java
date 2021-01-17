/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex9;

/**
 *
 * @author Andrey
 */
class Test {
    Test() {
        this("This is message from Default Constructor");
    }
    
    Test(String message){
        System.out.println(message);
    }
            
}
public class InitializationEx9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test test = new Test();
    }
    
}

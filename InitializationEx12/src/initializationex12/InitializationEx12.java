/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex12;

class Tank {
    boolean isFull = false;
    
    Tank(boolean condition) {
        isFull = condition;
    }
    
    public void fill() {
        isFull = true;
    }
    
    public void empty() {
        isFull = false;
    }
    
    protected void finalize() {
        if(isFull) {
            System.out.println("Error: still full");
        }
    }
}
public class InitializationEx12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tank tank1 = new Tank(true);
        tank1.empty();
        Tank tank2 = new Tank(true);
        tank2.empty();
        tank1 = null;
        tank2 = null;
        
        System.gc();
    }
    
}

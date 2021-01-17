/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesex03;

abstract class Applience {
    
    Applience() {
        System.out.println("Inside Applience class");
        print();
    }
    abstract void print();
}

class MicroWave extends Applience {
    int timeMin = 2;
    
    MicroWave() {
        System.out.println("Inside MicroWave class");
    }
    @Override
    void print() {
        System.out.println("Microwave print() timeMin = " + timeMin);
    }
    
}


public class InterfacesEx03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Applience microWave = new MicroWave();
        
    }
    
}

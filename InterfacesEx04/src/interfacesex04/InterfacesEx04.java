/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesex04;

abstract class Applience1 {
    
}

abstract class Applience2 {
    public abstract void print(); 
}

class MicroWave1 extends Applience1 {
    
    void print() {
        System.out.println("MicroWave1.print()");
    } 
}

class MicroWave2 extends Applience2 {
    
    @Override
    public void print() {
        System.out.println("MicroWave2.print()");
    } 
}

public class InterfacesEx04 {
    static void callPrint1(Applience1 appl1) {
        ((MicroWave1)appl1).print();
    }
    
    static void callPrint2(Applience2 appl2) {
        appl2.print();
    }
    public static void main(String[] args) {
        MicroWave1 microW1 = new MicroWave1();
        InterfacesEx04.callPrint1(microW1);
        MicroWave2 microW2 = new MicroWave2();
        InterfacesEx04.callPrint2(microW2);
    }
    
}

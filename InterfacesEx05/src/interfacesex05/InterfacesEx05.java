/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesex05;

import java.util.Date;
import testPakage.TimeInfo;

/**
 *
 * @author Andrey
 */
public class InterfacesEx05 implements TimeInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }

    @Override
    public void getCurrentDate() {
        System.out.println("InterfacesEx05.getCurrentDate()");
    }

    @Override
    public void printCurrentDate() {
        System.out.println("InterfacesEx05.printCurrentDate()");
    }

    @Override
    public void setCurrentDate() {
        System.out.println("InterfacesEx05.setCurrentDate()");
    }
    
}

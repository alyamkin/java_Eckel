/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorsex11ex12shift;

/**
 *
 * @author Andrey
 */
public class OperatorsEx11Ex12Shift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 0x80000000;
        for (int i = 0; i < 32; i++) {
            System.out.printf("%d - %s\n",number, Integer.toBinaryString(number));
            number >>= 1;
        }
        System.out.println("______________________________________");
        System.out.println();
        int number2 = 0xffffffff;
        for (int i = 0; i < 31; i++) {
            System.out.printf("%d - %s\n",number2, Integer.toBinaryString(number2));
            number2 <<= 1;
        }
        
        System.out.println("______________________________________");
        System.out.println(number2);
       
        for (int i = 0; i < 32; i++) {
            System.out.printf("%d - %s\n",number2, Integer.toBinaryString(number2));
            number2 >>>= 1;
        }
        
        System.out.println("______________________________________");
        System.out.println();
        int number3 = 3;
        for (int i = 0; i < 10; i++) {
            System.out.println(number3 <<= 2);
        }
    }
    
}

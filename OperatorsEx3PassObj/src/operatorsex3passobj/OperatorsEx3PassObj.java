/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorsex3passobj;

/**
 *
 * @author Andrey
 */
public class OperatorsEx3PassObj {

    static void f(Letter y) {
        y.c = 0.5;
    }
    
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 1.5;
        System.out.println(x.c);
        f(x);
        System.out.println(x.c);
    }
    
}

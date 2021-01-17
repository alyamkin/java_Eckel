/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex19;

/**
 *
 * @author Andrey
 */
public class InitializationEx19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        showStrings("One", "Two", "Three");
        showStrings(new String[]{"1","2","3"});
    }
    
    public static void showStrings(String... args) {
        for(String str : args) {
            System.out.println(str);
        }
    }
    
}

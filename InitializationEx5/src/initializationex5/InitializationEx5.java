/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initializationex5;

class Dog {
    public void bark() {
        System.out.println("Bark");
    }
    public void bark(int number, float number2) {
        System.out.println("Baaaark!");
    }
    public void bark(float number, int number2) {
        System.out.println("Boooork!");
    }
}
public class InitializationEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog = new Dog();
        dog.bark();
        dog.bark(0, 5.2f);
        dog.bark(5.2f, 0);
    }
    
}

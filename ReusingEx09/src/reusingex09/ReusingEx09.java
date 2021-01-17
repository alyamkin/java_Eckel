
package reusingex09;

class Component1 {

    public Component1() {
        System.out.println("Inside Component1");
    }
    
}   
class Component2 {

    public Component2() {
        System.out.println("Inside Component2");
    }
    
}   
class Component3 {

    public Component3() {
        System.out.println("Inside Component3");
    }
    
}   
class Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();
    
    public Root() {
        System.out.println("Inside Root default");
    }
    
}
class Stem extends Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();
    
    public Stem() {
        System.out.println("Inside Stem default");
    }
    
}

public class ReusingEx09 {

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
    
}

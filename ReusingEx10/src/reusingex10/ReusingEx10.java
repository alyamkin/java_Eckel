package reusingex10;

class Component1 {

    public Component1(int i) {
        System.out.println("Inside Component1 " + i);
    }

}

class Component2 {

    public Component2(int i) {
        System.out.println("Inside Component2 " + i);
    }

}

class Component3 {

    public Component3(int i) {
        System.out.println("Inside Component3 " + i);
    }

}

class Root {

    int i;
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Root(int i) {
        this.i = i;
        System.out.println("Inside Root default " + i++);
        component1 = new Component1(i++);
        component2 = new Component2(i++);
        component3 = new Component3(i++);
    }

}

class Stem extends Root {

    int i;
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Stem(int i) {
        super(i);
        this.i = i;
        System.out.println("Inside Stem default " + i++);
        component1 = new Component1(i++);
        component2 = new Component2(i++);
        component3 = new Component3(i++);
    }

}

public class ReusingEx10 {

    public static void main(String[] args) {
        Stem stem = new Stem(1);
    }

}

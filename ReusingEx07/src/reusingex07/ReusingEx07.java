package reusingex07;

class A {

    public A() {
        System.out.println("Inside A");
    }

    public A(int i) {
        System.out.println("Inside A(int i) " + i);
    }
}

class B{

    public B() {
        System.out.println("Inside B");
    }

    public B(int i) {
        System.out.println("Inside B(int i) " + i);
    }
}

class C extends A {
    public C(int i) {
        super(i);
        B b = new B(i);
        System.out.println("Inside C(int i) " + i);
        
    }

    B b = new B();

}

public class ReusingEx07 {

    public static void main(String[] args) {
        C c = new C(10);
    }

}

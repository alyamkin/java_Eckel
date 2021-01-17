package reusingex05;

class A {

    public A() {
        System.out.println("Inside A");
    }
}

class B {

    public B() {
        System.out.println("Inside B");
    }
}

class C extends A {
    B b = new B();

}

public class ReusingEx05 {

    public static void main(String[] args) {
        C c = new C();
    }
}

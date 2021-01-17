
package polymorphismex12_1;

class Dog extends Animal {
    Shared shared;
    Dog(Shared shared) {
        System.out.println("The Dog constructed");
        this.shared = shared;
        this.shared.addRef();
    }
}

class Cat extends Animal {
    Shared shared;
    Cat(Shared shared) {
        System.out.println("The Cat constructed");
        this.shared = shared;
        this.shared.addRef();
    }
    
}

class Shared {
    private static int counter = 0;
    private final long id = counter++;
    private int reference = 0;

    public Shared() {
        System.out.println("The Shared object has constructed!");
    }
    
    
    public void addRef() {
        reference++;
    }
    
    public String toString() {
        return "id = " + id + " Number of objects = " + counter + " Number of references " + reference;
    }
    
    
}

public class Animal {
    public static void main(String...args) {
        Shared shared = new Shared();
        Animal[] animalArr =  {new Dog(shared), new Cat(shared),new Dog(shared), new Cat(shared)};
        System.out.println(shared);
    }
}

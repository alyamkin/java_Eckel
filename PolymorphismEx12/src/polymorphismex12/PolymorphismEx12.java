
package polymorphismex12;

class Roden {
    Shared shared;
    public Roden(Shared shared) {
        this.shared = shared;
        this.shared.addRef();
    }
    public void move() {
        System.out.println("Roden.move()");
    }
}

class Mouse extends Roden{
    
    Shared shared;
    public Mouse(Shared shared) {
        super(shared);
        this.shared = shared;
        this.shared.addRef();
    }
    @Override
    public void move() {
        System.out.println("Mouse.move()");
    }
}
class Gerbil extends Roden{
    Shared shared;
    public Gerbil(Shared shared) {
        super(shared);
        this.shared = shared;
        this.shared.addRef();
    }
    @Override
    public void move() {
        System.out.println("Gerbil.move()");
    }
}
class Hamster extends Roden{
    Shared shared;
    public Hamster(Shared shared) {
        super(shared);
        this.shared = shared;
        this.shared.addRef();
    }
    @Override
    public void move() {
        System.out.println("Hamster.move()");
    }
}

class Shared {
    private int refcount = 0;
    private static int counter = 0;
    private final int id = counter++;
    
    Shared() {
        
    }
    
    public String toString() {
    return "Shared" + " refcount = " + refcount + " counter = " + counter + " id = " + id;
    }
    
    public void addRef() {
        refcount++;
    }
}

public class PolymorphismEx12 {


    public static void main(String[] args) {
        Shared shared = new Shared();
        Shared shared2 = new Shared();
        Roden [] rodens = {new Mouse(shared2), new Gerbil(shared2), new Hamster(shared2)};
        
        for(Roden roden : rodens) {
            roden.move();
        }
        
        System.out.println(shared);
        System.out.println(shared2);
    }
    
}

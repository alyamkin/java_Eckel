
package polymorphismex09;

class Roden {
    public void move() {
        System.out.println("Roden.move()");
    }
}

class Mouse extends Roden{
    @Override
    public void move() {
        System.out.println("Mouse.move()");
    }
}
class Gerbil extends Roden{
    @Override
    public void move() {
        System.out.println("Gerbil.move()");
    }
}
class Hamster extends Roden{
    @Override
    public void move() {
        System.out.println("Hamster.move()");
    }
}
public class PolymorphismEx09 {


    public static void main(String[] args) {
        Roden [] rodens = {new Mouse(), new Gerbil(), new Hamster()};
        
        for(Roden roden : rodens) {
            roden.move();
        }
    }
    
}


package interfacesex07;

interface Roden {
    public void move();
}

class Mouse implements Roden{
    @Override
    public void move() {
        System.out.println("Mouse.move()");
    }
}
class Gerbil implements Roden{
    @Override
    public void move() {
        System.out.println("Gerbil.move()");
    }
}
class Hamster implements Roden{
    @Override
    public void move() {
        System.out.println("Hamster.move()");
    }
}
public class InterfacesEx07 {


    public static void main(String[] args) {
        Roden [] rodens = {new Mouse(), new Gerbil(), new Hamster()};
        
        for(Roden roden : rodens) {
            roden.move();
        }
    }
    
}

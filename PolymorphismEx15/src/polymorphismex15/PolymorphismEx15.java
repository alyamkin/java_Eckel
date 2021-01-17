
package polymorphismex15;

class Vehicle {
    
    public Vehicle() {
        System.out.println("Vehicle() before move()");
        System.out.println("Vehicle constructed");
        move();
        System.out.println("Vehicle() after move()");
        
    }
    
    public final void move() {
        System.out.println("Vehicle.move()");
    }
}

class Car extends Vehicle {
    int numOfWheels = 4;
    
    public Car(int wheelsNum) {
        System.out.println("Car constructed");
        numOfWheels = wheelsNum;
        System.out.println("Car.Car() , numOfWheels = " + numOfWheels);
    }
    
    public void move1() {
        System.out.println("Car.move() , numOfWheels = " + numOfWheels);
        
    }
}
public class PolymorphismEx15 {


    public static void main(String[] args) {
        new Car(10);
        
    }
    
}

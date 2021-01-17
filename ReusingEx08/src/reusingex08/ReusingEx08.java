package reusingex08;

class Vehicle {

    public Vehicle() {
        System.out.println("Inside Vehicle no-arg constructor");
    }

    public Vehicle(int i) {
        System.out.println("Inside Vehicle non default constructor " + i);
    }

}

class Car extends Vehicle {

    public Car() {
        System.out.println("Inside Car no-arg constructor");
        
    }

    public Car(int i) {
        super(i);
        System.out.println("Inside Car arg constructor");
    }
    
}

public class ReusingEx08 {

    public static void main(String[] args) {
        Car car = new Car(10);
    }

}

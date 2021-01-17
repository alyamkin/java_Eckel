
package polymorphispex10;

class Vehicle {
    public void method1() {
        System.out.println("Vehicle.method1()");
        method2();
    }
    
    public void method2() {
        System.out.println("Vehicle.method2()");
    }
}

class Car extends Vehicle{
    @Override
    public void method2() {
        System.out.println("Car.method2()");
    }
}

public class PolymorphispEx10 {


    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.method1();
    }
    
}

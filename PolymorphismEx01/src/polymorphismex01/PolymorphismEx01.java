package polymorphismex01;

class Cycle {

    int wheels;

    public Cycle(int wheels) {
        this.wheels = wheels;
    }

    protected void ride() {
        System.out.println("Inside Cycle.ride()");
    }

    protected int wheels() {
        return wheels;
    }
}

class Unicycle extends Cycle {

    public Unicycle(int wheels) {
        super(wheels);
    }

    public void ride() {
        System.out.println("Inside Unicycle.ride()");
    }
}

class Bicycle extends Cycle {

    public Bicycle(int wheels) {
        super(wheels);
    }

    public void ride() {
        System.out.println("Inside Bicycle.ride()");
    }
}

class Tricycle extends Cycle {

    public Tricycle(int wheels) {
        super(wheels);
    }

    public void ride() {
        System.out.println("Inside Tricycle.ride()");
    }
}

public class PolymorphismEx01 {

    public static void ride(Cycle cycle) {
        System.out.println("number of wheels: " + cycle.wheels());
        
    }

    public static void main(String[] args) {
        ride(new Unicycle(1));
        ride(new Bicycle(2));
        ride(new Tricycle(3));
    }

}

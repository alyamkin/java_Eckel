package polymorphismex17;

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
    
    public void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {

    public Bicycle(int wheels) {
        super(wheels);
    }

    public void ride() {
        System.out.println("Inside Bicycle.ride()");
    }
    
    public void balance() {
        System.out.println("Bicycle.balance()");
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

public class PolymorphismEx17 {

    public static void ride(Cycle cycle) {
        System.out.println("number of wheels: " + cycle.wheels());
        
    }

    public static void main(String[] args) {
        Cycle[] cycleList = {new Unicycle(1),new Bicycle(2),new Tricycle(3)};
        
        for(Cycle cycle : cycleList) {
            if(cycle instanceof Unicycle) {
                ((Unicycle) cycle).balance();
            }else if(cycle instanceof Bicycle) {
                ((Bicycle) cycle).balance();
            }
        }
        
    }

}

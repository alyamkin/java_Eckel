
package interfacesex08;

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {   
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

class Display {
    static int counter = 0;
    Display() {
        counter++;
        System.out.println("Display test : " + counter);
    }
}

interface FastFood {
    void getInfo();
}
public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    
    Sandwich() {
        System.out.println("Sandwich()");
    }
    
    public static void main(String...args) {
        Sandwich sandwich = new Sandwich();
        sandwich.getInfo();
    }

    @Override
    public void getInfo() {
        System.out.println("This is Fast food");
    }
}


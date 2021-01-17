
package reusingex1;

class Kitchen {
    Microwave microwave;
    
    public Kitchen() {
        System.out.println("Inside Kitchen");
    }
    
    public void installMicrowave() {
        microwave = new Microwave("Panasonic");
        System.out.println("Microwave installed");
    }
}

class Microwave {
    String name;
    
    public Microwave(String name) {
        this.name = name;
        System.out.println("Inside Microwave");
    }
}

public class ReusingEx1 {


    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.installMicrowave();
    }
    
}


package polymorphismex16;

class Actor {
    public void act() {
        System.out.println("Actor.act()");
    }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }
    
    public void performPlay() {
        actor.act();
    }
}

class AlertStatus {
    public void alert(){};
}

class AlertCollision extends AlertStatus{
    public void alert() {
        System.out.println("Collision may happened");
    }
}

class AlertDamage extends AlertStatus{
    public void alert() {
        System.out.println("Critical damage");
    }
}

class AlertOverload extends AlertStatus{
    public void alert() {
        System.out.println("Critical overload");
    }
}

class Starship {
    private AlertStatus alertStatus = new AlertOverload();
    
    public void change() {
        alertStatus = new AlertDamage();
    }
    
    public void indicateAlert() {
        alertStatus.alert();
    }
}



public class Transmogrify {
    public static void main(String...args) {
        Starship starShip = new Starship();
        starShip.indicateAlert();
        starShip.change();
        starShip.indicateAlert();
    }
}

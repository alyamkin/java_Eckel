
package interfaces;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {System.out.println("ActionCharacter.fight()");};
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    @Override
    public void swim() {
        System.out.println("Hero.swim()");
    }

    @Override
    public void fly() {
        System.out.println("Hero.swim");
    }

}
public class Adventure {
    public static void t(CanFight x) {x.fight();}
    public static void u(CanSwim x) {x.swim();}
    public static void v(CanFly x) {x.fly();}
    public static void w(ActionCharacter x) {x.fight();}
    
    public static void main(String...args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}

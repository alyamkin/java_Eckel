package reusingex11;

class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append("dilute()");
    }

    public void apply() {
        append("apply()");
    }

    public void scrub() {
        append("scrub()");
    }

    public String toString() {
        return s;
    }
}

class Detergent {

    private String s = "Detergent";
    private Cleanser cleanser = new Cleanser();

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append(" DetergentDelegation.scrub()");
        cleanser.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    @Override
    public String toString() {
        return s + " " + cleanser;
    }

}

public class ReusingEx11 {

    public static void main(String[] args) {
        Detergent deter = new Detergent();
        deter.dilute();
        deter.apply();
        deter.scrub();
        deter.foam();
        System.out.println(deter);
    }

}

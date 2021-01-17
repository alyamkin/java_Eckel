/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesex09;

enum Note {
    MIDDLE_C;
}

abstract class Instrument {

    int i;

    abstract void play(Note n);

    abstract void adjust();

    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {

    @Override
    void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {

    @Override
    void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {

    @Override
    void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {

    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {

    public String toString() {
        return "Woodwing";
    }
}

public class Music {

    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] orchestra) {
        for (Instrument i : orchestra) {
            tune(i);
        }
    }

    public static void main(String... arg) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()

        };
        
        tuneAll(orchestra);
    }

}

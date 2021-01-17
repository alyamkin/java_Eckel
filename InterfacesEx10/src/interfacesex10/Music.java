/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesex10;

enum Note {
    MIDDLE_C;
}

interface Playable {
    void play(Note n);
}

abstract class Instrument {

    int i;

    abstract void adjust();
    
    abstract void test();

    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument implements Playable{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    void adjust() {
        System.out.println(this + ".adjust()");
    }
    
    void test() {
        System.out.println(this + ".test()");
    }

    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument implements Playable{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    void adjust() {
        System.out.println(this + ".adjust()");
    }
    
    void test() {
        System.out.println(this + ".test()");
    }

    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument implements Playable{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    void adjust() {
        System.out.println(this + ".adjust()");
    }
    
    void test() {
        System.out.println(this + ".test()");
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

    static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
        ((Instrument)i).test();
    }

    static void tuneAll(Playable[] orchestra) {
        for (Playable i : orchestra) {
            tune(i);
        }
    }

    public static void main(String... arg) {
        Playable [] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()

        };
        
        tuneAll(orchestra);
    }

}

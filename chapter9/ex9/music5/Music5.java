//: chapter9/ex9/music5/Music5.java
// Interfaces.
package chapter9.ex9.music5;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;

interface Instrument {
    // Compile-time constant:
    int VALUE = 5; // static & final
    // Cannot have method definitions:
    void play(Note n);
    void adjust();
}

abstract class Adjust {
    public void play(Note n) { print(this + ".play() " + n); }
    public void adjust() {print(this + " .adjust()");}
}

class Wind extends Adjust implements Instrument {
    public void play(Note n) {
        print(this + ".play() " + n);
    }
    public String toString() { return "Wind"; }
    public void adjust() { print(this + " .adjust()"); }
}

class Percussion implements Instrument {
    public void play(Note n) {
        print(this + " .play() " + n);
    }
    public String toString() { return "Percussion"; }
    public void adjust() { print(this + " .adjust()"); }
}

class Stringed implements Instrument {
    public void play(Note n) {
        print(this + " .play()" + n);
    }
    public String toString() { return "Stringed"; }
    public void adjust() { print(this + " .adjust()"); }
}

class Brass extends Wind {
    public String toString() { return "Brass";}
}

class Woodwing extends Wind {
    public String toString() { return "Woodwind"; }
}

public class Music5 {
    // Doesn't care about type. so new types added to the system still work right：
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e) 
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwing()
        };
        tuneAll(orchestra);
    }    
}

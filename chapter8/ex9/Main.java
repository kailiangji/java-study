// chapter8/ex9/Main.java
// TIJ4 Chapter Polymorphism, Exercise 9
/* Create an inheritance hierarchy of Rodent:Mouse, Gerbil, Hamster, etc. In the
* base class, provide methods that are common to all Rodents, and override these
* in the derived classes to perform different behaviors depending on the
* specific type of Rodent. Create an array of Rodent, fill it with different
* specific types of Rodents, and call your base-class methods to see what 
* happens.
*/

import java.util.*;
import static net.mindview.util.Print.*;

class RandomRodentGenerator {
    private Random rand = new Random();
    public Rodent next() {
	switch(rand.nextInt(3)) {
	default:
	case 0: return new Mouse();
	case 1: return new Rat();
	case 2: return new Squirrel();			
	}
    }
}

class Rodent {
    private String name = "Rodent";
    protected void eat() { print("Rodent.eat()"); }
    protected void run() { print("Rodent.run()"); }
    protected void sleep() { print("Rodent.sleep()"); }
    public String toString() { return name; }
}

class Mouse extends Rodent {
    private String name = "Mouse";
    protected void eat() { print("Mouse.eat()"); }
    protected void run() { print("Mouse.run()"); }
    protected void sleep() { print("Mouse.sleep()"); }
    public String toString() { return name; }
}

class Rat extends Rodent {
    private String name = "Rat";
    protected void eat() { print("Rat.eat()"); }
    protected void run() { print("Rat.run()"); }
    protected void sleep() { print("Rat.sleep()"); }
    public String toString() { return name; }
}

class Squirrel extends Rodent {
    private String name = "Squirrel";
    protected void eat() { print("Squirrel.eat()"); }
    protected void run() { print("Squirrel.run()"); }
    protected void sleep() { print("Squirrel.sleep()"); }
    public String toString() { return name; }
}

public class Main {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args) {
	Rodent[] rodents = new Rodent[10];
	for(Rodent r : rodents) {
	    r = gen.next();
	    print(r + ": ");
	    r.eat();
	    r.run();
	    r.sleep();			
	}		
    }
}

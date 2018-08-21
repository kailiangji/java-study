// chapter9/ex1/Main.java
// TIJ4 Chapter Interface, Exercise 1

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

abstract class Rodent {
    private String name = "Rodent";
    abstract protected void eat();
    abstract protected void run();
    abstract protected void sleep();
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

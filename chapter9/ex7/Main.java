// chapter9/ex7/Main.java

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

interface Rodent {
    //private String name = "Rodent";
    void eat();
    void run();
    void sleep();
    public String toString();
}

class Mouse implements Rodent {
    private String name = "Mouse";
    public void eat() { print("Mouse.eat()"); }
    public void run() { print("Mouse.run()"); }
    public void sleep() { print("Mouse.sleep()"); }
    public String toString() { return name; }
}

class Rat implements Rodent {
    private String name = "Rat";
    public void eat() { print("Rat.eat()"); }
    public void run() { print("Rat.run()"); }
    public void sleep() { print("Rat.sleep()"); }
    public String toString() { return name; }
}

class Squirrel implements Rodent {
    private String name = "Squirrel";
    public void eat() { print("Squirrel.eat()"); }
    public void run() { print("Squirrel.run()"); }
    public void sleep() { print("Squirrel.sleep()"); }
    public String toString() { return name; }
}

public class Main {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args) {
	Rodent[] rodents = {new Mouse(), new Rat(), new Squirrel()};
	for(Rodent r : rodents) {
	    r = gen.next();
	    print(r + ": ");
	    r.eat();
	    r.run();
	    r.sleep();			
	}		
    }
}

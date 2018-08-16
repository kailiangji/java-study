//: reusing/Detergent.java
// Inheritance syntax & properties

import static net.mindview.util.Print.*;

class Cleaner {
    private String s = "Cleanser";
    public void append(String a) { s += a;}
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }

    public static void main(String[] args) {
	Cleaner x = new Cleaner();
	x.dilute(); x.apply(); x.scrub();
	print(x);
    }
}

public class Detergent {
    private Cleaner cleaner = new Cleaner();
    public void append(String a) { cleaner.append(a); }
    public void dilute() { cleaner.dilute(); }
    public void apply() { cleaner.apply(); }
    // Change a method:
    public void scrub() {
	append(" Detergent.scrub()");
	cleaner.scrub(); // call the base-class version
    }

    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    public String toString() { return cleaner.toString();}
    // Test the new class:
    public static void main(String[] args) {
	Detergent x = new Detergent();
	x.dilute();
	x.apply();
	x.scrub();
	x.foam();
	print(x);
	print("Testing base class:");
	Cleaner.main(args);
    }
}

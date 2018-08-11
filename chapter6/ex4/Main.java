//: Main.java
import chapter6.ex4.a.*;

public class Main {
    public static void main(String[] args) {
	A a = new A();
	B b = new B();
	a.visitB();
	//b.visitB();
	//visitB() has protected access in B b.visitB();
    }
}

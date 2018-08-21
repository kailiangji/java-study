//: chapter9/ex2/Main.java
// Create an abstract class, in which there are not any abstract method.

abstract class A {
    public String toString() {return "A";}
}

public class Main {
    public static void main(String[] args) {
	A a = new A(); // a cannot be created
    }
}

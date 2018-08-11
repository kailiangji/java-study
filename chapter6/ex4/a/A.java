//: A.java
package chapter6.ex4.a;

public class A {
    
    public void visitB() {
	B b = new B();
	b.visitB();
    }
}

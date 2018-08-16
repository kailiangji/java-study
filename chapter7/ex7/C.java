//: C.java

class A {
    private String name;
    A(String s) {
	name = s;
    }
    public String toString() { return name + "A"; }
}

class B {
    private String name;
    B(String s) {
	name = s;
    }
    public String toString() { return name + "B"; }
}

public class C extends A {
    B b = new B("A");
    C() {
	super("A");
    }
    public static void main(String[] args) {
	C x = new C();
    }
}


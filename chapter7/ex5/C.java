//: C.java

class A {
    public String toString() { return "A"; }
}

class B {
    public String toString() { return "B"; }
}

public class C extends A {
    B b = new B();

    public static void main(String[] args) {
	C x = new C();
    }
}


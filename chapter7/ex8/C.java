//: C.java

class A {
    A(String s) {
	System.out.println("A constructor" + s);
    }
}

class C extends A {
    C() { super("hi"); }
    C(String s) { super(s); }
    public static void main(String[] args) {
	C c1 = new C();
	C c2 = new C("hello");
    }
}

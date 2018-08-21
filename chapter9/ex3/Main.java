//: chapter9/ex3/Main.java

abstract class A {
    A() {
	print();
    }
    abstract void print();
}

class B extends A {
    private int i = 10;
    
    public void print() {
	System.out.printf("the number is %d\n", i);
    }
}

public class Main {
    public static void main(String[] args) {
	B x = new B();
	x.print();
    }
}

//: B.java

class A {
    public String toString() {return "A";}
    public void printName() {System.out.println(toString());}
}

public class B extends A{
    public String toString() {return "B";}

    public static void main(String[] args) {
	A x = new A();
	A y = new B();
	x.printName();
	y.printName();
    }
}

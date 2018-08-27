//: chapter10/ex1/Outer.java

public class Outer {

    class Inner {
        Inner() {
            System.out.println("Inner class constructor");
        }
    }

    public Inner CreateInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.CreateInner();
    }
}
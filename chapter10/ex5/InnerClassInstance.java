//: chapter10/ex5/InnerClassInstance.java

class Outer {
    class Inner {
        Inner() {
            System.out.println("Inner class Constructor");
        }
    }
}

public class InnerClassInstance {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
    }
}
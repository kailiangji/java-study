//: chapter10/ex3/Outer.java

public class Outer {
    private String name;

    Outer() {
        name = "Outer";
    }

    class Inner {
        Inner() {
            System.out.println("Inner class constructor");
        }

        public String toString() {
            return name;
        }
    }

    public Inner CreateInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.CreateInner();
        System.out.println(i.toString());
    }
}
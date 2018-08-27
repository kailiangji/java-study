//: chapter10/ex18/Ex18.java

public class Ex18 {
    public static class Inner {
        Inner() {
            System.out.println("Inner class constructor");
        }
    }

    public static void main(String[] args) {
        Inner i = new Inner();
    }
}
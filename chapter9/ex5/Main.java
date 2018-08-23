//: Main.java
import chapter9.ex5.b.B;
import chapter9.ex5.a.A;

public class Main {
    public static void main(String[] args) {
	A b = new B();
	b.whoAmI();
	System.out.printf("I am %d years old.\n", b.howOld());
    }
}

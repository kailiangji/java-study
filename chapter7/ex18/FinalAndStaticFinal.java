//: chapter7/ex18/FinalAndStaticFinal.java
// Tell the difference between final and static final fields.

public class FinalAndStaticFinal {
    final int a;
    static final int B = 10;

    public int get_a() { return a; }
    public int get_b() { return B; }

    FinalAndStaticFinal(int i, int j) {
	a = i;
    }

    public static void main(String[] args) {
	FinalAndStaticFinal f1 = new FinalAndStaticFinal(1,10);
	FinalAndStaticFinal f2 = new FinalAndStaticFinal(3,10);
	System.out.printf("f1.a = %d, f1.b = %d\n", f1.get_a(), f1.get_b()); // f1.a = 1, f1.b = 2
	System.out.printf("f2.a = %d, f2.b = %d\n", f2.get_a(), f2.get_b()); // f2.a = 3, f2.b = 2
    }
}

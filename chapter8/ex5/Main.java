//: chapter8/ex5/Main.java

public class Main {
    public static void main(String[] args) {
	Unicycle u = new Unicycle();
	Bicycle b = new Bicycle();
	Tricycle t = new Tricycle();

	u.ride(u);
	b.ride(b);
	t.ride(t);
    }
}

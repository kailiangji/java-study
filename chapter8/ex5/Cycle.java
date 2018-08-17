//: chapter8/ex5/Cycle.java

public class Cycle {
    int wheels() {return 0;}
    void ride(Cycle c) {
	System.out.printf("This Cycle has %d wheels\n", wheels());
    }
}

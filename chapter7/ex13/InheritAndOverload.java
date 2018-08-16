//: InheritAndOverload.java
// Create a class with a method that is overloaded three
// times. Inherit a new class, add a new overloading of the method,
// and show that all four methods are available in the derived class.
import static net.mindview.util.Print.*;

class OverloadMethods {
    public void OverloadMethod(int i) {
	printf("%d\n",i);
    }

    public void OverloadMethod(int i, int j) {
	printf("%d, %d\n",i, j);
    }

    public void OverloadMethod(int i, int j, int k) {
	printf("%d, %d, %d\n",i, j, k);
    }
}

public class InheritAndOverload extends OverloadMethods {
    public void OverloadMethod(double i) {
	printf("%f\n", i);
    }

    public static void main(String[] args) {
	InheritAndOverload x = new InheritAndOverload();
	x.OverloadMethod(1);
	x.OverloadMethod(1,2);
	x.OverloadMethod(1,2,3);
	x.OverloadMethod(1.2);
    }
}

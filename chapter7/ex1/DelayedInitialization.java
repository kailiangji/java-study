//: DelayedInitialization.java
// Example of using Delayed initialization.

class A {
    private String hi;

    public String SayHi() {
	if(hi == null)
	    hi = "Bonjour";
	return hi;
    }
}

public class DelayedInitialization {
    public static void main(String[] args) {
	A a = new A();
	System.out.println(a.SayHi() + " Java");
    }
}

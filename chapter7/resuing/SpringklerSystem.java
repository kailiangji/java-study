//: reusing/SpringklerSystem.java
// Composition for code reuse

class WaterSource {
    private String s;
    WaterSource() {
	System.out.println("WaterSource()");
	s = "Constructed";
    }
    public String toString() {return s;}
}

public class SpringklerSystem {
    private String v1, v2, v3, v4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
	return
	    "v1 = " + v1 + " " +
	    "v2 = " + v2 + " " +
	    "v3 = " + v3 + " " +
	    "v4 = " + v4 + " " +
	    "i = " + i + " " + "f = " + f + " " +
	    "source = " + source;
    }

    public static void main(String[] args) {
	SpringklerSystem springklers = new SpringklerSystem();
	System.out.println(springklers);
    }
}

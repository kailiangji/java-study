//: chapter7/ex16/Frog.java

public class Frog extends Amphibian {
    Frog() {
	super(2);
    }
    public static void main(String[] args) {
	Frog frog = new Frog();
	frog.HowOldAreYou(frog);
    }
}

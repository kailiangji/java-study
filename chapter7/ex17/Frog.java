//: chapter7/ex17/Frog.java

public class Frog extends Amphibian {
    Frog() {
	super(2);
    }

    @Override public void HowOldAreYou(Amphibian a) {
	System.out.println("I am a frog");
	super.HowOldAreYou(a);
    }
    public static void main(String[] args) {
	Frog frog = new Frog();
	frog.HowOldAreYou(frog);
    }
}

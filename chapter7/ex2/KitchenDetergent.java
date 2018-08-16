//: KitchenDetergent.java

import static net.mindview.util.Print.*;

public class KitchenDetergent extends Detergent {
    public void scrub() {
	append(" KitchenDatergent.scrub()");
	super.scrub();
    }

    public void sterilize() {
	append(" sterilize()");
    }

    public static void main(String[] args) {
	KitchenDetergent x = new KitchenDetergent();
	x.dilute();
	x.apply();
	x.scrub();
	x.foam();
	x.sterilize();
	print(x);
	print("Testing Detergent class:");
	Detergent.main(args);
    }
}

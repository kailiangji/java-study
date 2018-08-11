//: Main.java
import debug.*;

public class Main {
    public static void main(String[] args) {
	Debug d = new Debug();
	d.debug("Hello");
	debugoff.DebugOff d1 = new debugoff.DebugOff();
	d1.debug();
    }
}

//: chapter8/ex13/ReferenceCounting.java
// finalize()
import static net.mindview.util.Print.*;
import java.util.concurrent.TimeUnit;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
	print("Creating " + this);
    }

    public void addRef() {refcount++; }

    protected void dispose() {
	refcount--;
	if(refcount==0)
	    print("Disposing " + this);
    }
    public String toString() {return "Shared " + id;}

    protected void finalize() {
	print("finalize()");
	if(refcount > 0)
	    print("Error: reference counter not Zero");
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
	print("Creating " + this);
	this.shared = shared;
	this.shared.addRef();
    }
    protected void dispose() {
	print("disposing " + this);
	shared.dispose();
    }
    public String toString() {return "Composing " + id; }
}

public class ReferenceCounting {
    public static void main(String[] args) {
	Shared shared = new Shared();
	Composing[] composing = {
	    new Composing(shared),
	    new Composing(shared),
	    new Composing(shared),
	    new Composing(shared),
	    new Composing(shared),
	    new Composing(shared)};
	for(Composing c : composing)
	    c.dispose();
	new Composing(shared);
	new Composing(shared);
	System.gc(); // why this not work?
	shared.finalize();
	try {
	    TimeUnit.SECONDS.sleep( 5 );
	    System.out.println( "延时1秒，完成了");
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
}

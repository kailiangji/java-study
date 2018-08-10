//: Main.java

public class Main {

    static void describe(Money m) {
	System.out.print("This kind of Money is ");
	switch(m) {
	case ONE:
	    System.out.println("1 YUAN");
	    break;
	case TWO:
	    System.out.println("2 YUAN");
	    break;
	case FIVE:
	    System.out.println("5 YUAN");
	    break;
	case TEN:
	    System.out.println("10 YUAN");
	    break;
	case TWENTY:
	    System.out.println("20 YUAN");
	    break;
	default:
	    break;
	}
    }
    
    public static void main(String[] args) {
	for(Money rmb : Money.values())
	    System.out.println("Value: " + rmb + "  ordinal: " + rmb.ordinal());

	for(Money rmb : Money.values())
	    describe(rmb);
    }
}

public class VarMainArg {
    public static void main(String... args) {
	for(String s : args)
	    System.out.print(s + " ");
	System.out.println();
    }
}

//: VarString.java

public class VarString {
    static void f(String... args) {
	for(String s : args)
	    System.out.print(s + " ");
	System.out.println();
    }

    public static void main(String[] args) {
	f("one","two","three");
	f(new String[]{"four", "five", "six"});
    }
}

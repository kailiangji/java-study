class A {
    A(String s) {
	System.out.println(s);
    }
}

public class ObjectArray {
    public static void main(String[] args) {
	A[] arr = new A[5]; // no printing
	A[] arr1 = new A[]{new A("a"), new A("b"), new A("c")};
    }
}

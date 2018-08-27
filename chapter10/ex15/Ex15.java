//: chapter15/ex15/Ex15.java

class A {
    private int i;
    A(int input) {
        i = input;
    }
    public int getI() { return i; }
}

class Ex15 {
    public A getA(int input) {
        return new A(input) {};
    }
    public static void main(String[] args) {
        Ex15 x = new Ex15();
        System.out.printf("%d\n", x.getA(100).getI());
    }
}
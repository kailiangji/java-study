//: chapter10/ex8.Ex8.java

public class Ex8 {
    public class Inner {
        private int i = 10;
    }

    void getInnerI() {
        Inner i = new Inner();
        System.out.printf("%d\n",i.i);
    }

    public static void main(String[] args) {
        Ex8 e = new Ex8();
        e.getInnerI();
    }
}
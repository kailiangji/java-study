//: chapter10/ex26/Ex26.java

class A {
    class B {
        private int i;
        B(int i) {
            this.i = i;
        }

        public void getI() {
            System.out.printf("%d\n", i);
        }
    }
}

public class Ex26 extends A.B {
    Ex26(A a) {
        a.super(10);
    }

    public static void main(String[] args) {
        A a = new A();
        Ex26 e = new Ex26(a);
        e.getI();
    }
}
//: chapter10/ex19/Ex19.java

class A {
    static class B {
        static class C {
            C() {
                System.out.println(getClass());
            }
        }
        B() {
            System.out.println(getClass());
        }
    }
    A() {
        System.out.println(getClass());
    }
}

public class Ex19 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = new A.B();
        A.B.C c = new A.B.C();
    }
}
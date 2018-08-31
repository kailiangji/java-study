//: chapter10/ex23/Ex23.java

interface U {
    void f1();
    void f2();
    void f3();
}

class A {
    U makeU() {
        return new U() {
            public void f1() {
                System.out.println("U.f1()");
            }
            public void f2() {
                System.out.println("U.f2()");
            }
            public void f3() {
                System.out.println("U.f3()");
            }
        };
    }
}

class B {
    U[] uarr = new U[3];
    int index = 0;

    void store(U u) {
        if(index < uarr.length) {
            uarr[index] = u;    
            index++;    
        } else {
            System.out.println("index out of rage");
        }
    }

    void empty(int i) {
        if(i > 0 && i < uarr.length) {
            uarr[i] = null;
        }
    }

    void traverse() {
        for(U u : uarr) {
            if(u != null) {
                u.f1();
                u.f2();
                u.f3();
            }
        }
    }
}

public class Ex23 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.store(a.makeU());
        b.store(a.makeU());
        b.store(a.makeU());
        b.traverse();
        b.empty(2);
        b.traverse();
    }
}
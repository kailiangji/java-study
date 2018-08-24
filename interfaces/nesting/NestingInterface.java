//: interfaces/nesting/NestingInterfaces.java
package interfaces.nesting;

class A {
    
    interface B {
        void f();
    }

    public class Bimp implements B {
        public void f() {}
    }

    private class Bimp2 implements B {
        public void f() {} // in a private class, the public method meaningful?
    }

    public interface C {
        void f();
    }

    class Cimp implements C {
        public void f() {}
    }

    private class Cimp2 implements C {
        public void f() {}
    }

    private interface D {
        void f();
    }

    private class Dimp implements D {
        public void f() {}
    }

    public class Dimp2 implements D {
        public void f() {}
    }

    public D getD() { return new Dimp2(); }
    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }
    // Redundant "public"
    public interface H {
        void f();
    }
    void g();
    // Cannot be private within an interface:
    //! private interface I {}
}

public class NestingInterface {
    public class Bimp implements A.B {
        public void f() {}
    }
    class Cimp implements A.C {
        public void f() {}
    }

    // Cannot implement a private interface except within that interface's 
    // defining class:
    //! class Dimp implements A.D {
    //!    public void f() {}
    //! }

    class EGimp implements E.G {
        public void f() {}
    }

    class Eimp2 implements E {
        public void g() {}
        class EG implements E.G {
            public void f() {}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        // Cannot access A.D:
        //! A.D ad = a.getD();
        // Does not return anything but A.D:
        //! A.Dimp2 di2 = a.getD();
        // Cannot access a member of the interface:
        //! a.getD().f();
        // Only another A can do anything with getD():
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
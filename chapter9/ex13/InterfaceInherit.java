//: chapter9/ex13/InterfaceInherit.java
import static net.mindview.util.Print.*;
interface Iface {
    void f();
}

interface IIface1 extends Iface {
    void f1();
}

interface IIface2 extends Iface {
    void f2();
}

interface IIface3 extends IIface1, IIface2 {
    void f3();
}

public class InterfaceInherit implements IIface3 {
    public void f() { print("f()"); }
    public void f1() { print("f1()"); }
    public void f2() { print("f2()"); }
    public void f3() { print("f3()"); }
    public static void main(String[] args) {
        InterfaceInherit x = new InterfaceInherit();
        x.f();
        x.f1();
        x.f2();
        x.f3();
    }
}
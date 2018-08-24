//: chapter9/ex14/InterfaceInherit.java
import static net.mindview.util.Print.*;

interface I1 {
    int add1(int i);
    int add2(int i);
}

interface I2 {
    int add3(int i);
    int add4(int i);
}

interface I3 {
    int add5(int i);
    int add6(int i);
}

interface I4 extends I1, I2, I3 {
    int add7(int i);
}

abstract class C5 {
    abstract public int add8(int i);
}

public class InterfaceAbstractInherit extends C5 implements I4 {  
    public int add1(int i) { return i+1; }
    public int add2(int i) { return i+2; }
    public int add3(int i) { return i+3; }
    public int add4(int i) { return i+4; }
    public int add5(int i) { return i+5; }
    public int add6(int i) { return i+6; }
    public int add7(int i) { return i+7; }
    public int add8(int i) { return i+8; }
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        InterfaceAbstractInherit x = new InterfaceAbstractInherit();
        print(x.add1(i));
        print(x.add2(i));
        print(x.add3(i));
        print(x.add4(i));
        print(x.add5(i));
        print(x.add6(i));
        print(x.add7(i));
        print(x.add8(i));
    }
}
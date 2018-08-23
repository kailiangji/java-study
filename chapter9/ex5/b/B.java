//: chapter9/ex5/b/B.java

package chapter9.ex5.b;
import chapter9.ex5.a.*;

public class B implements A {
    public void whoAmI() {
        System.out.println("I am B");
    }

    public int howOld() { return A.AGE; }
}
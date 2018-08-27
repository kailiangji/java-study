//: chapter10/ex6/pkg2/InnerI.java
package chapter10.ex6.pkg2;
import chapter10.ex6.pkg1.*;

public class InnerI {
    protected class ImplementI implements I {
        public String name() {
            return "InnerI.implementI";
        }
    }
}

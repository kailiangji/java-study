//: chapter10/ex20/Ex20.java

interface I {
    String name();
    class InnerInterface {
        InnerInterface() {
            System.out.println("Innerterface constructor");
        }
    }
}

class ImplementI implements I {
    public String name() {
        return getClass().getSimpleName();
    }
}

public class Ex20 {
    public static void main(String[] args) {
        ImplementI i = new ImplementI();
        I.InnerInterface ii = new I.InnerInterface();
        System.out.println(i.name());
    }
}
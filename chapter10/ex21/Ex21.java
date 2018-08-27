//: chapter10/ex21/Ex21.java

interface I {
    String name();
    class ImplementI {
        public static void getName(I i) {
            System.out.println(i.name());
        }
    }
}
public class Ex21 implements I {
    public String name() {
        return getClass().getSimpleName();
    }

    public static void main(String[] args) {
        I i = new Ex21();
        I.ImplementI.getName(i);
    }
}
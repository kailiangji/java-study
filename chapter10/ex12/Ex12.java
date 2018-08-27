//: chapter10/ex12/Ex12.java

interface Inner {
    void changeI();
}

public class Ex12 {
    private int i = 10;
    private void Iplusplus() {
        i++;
    }

    public int getI() {
        return i;
    }

    public void UseInner() {
        Inner inner = new Inner() {
            public void changeI() {
                i = 11;
                Iplusplus();
            }
        };
        inner.changeI();
    }

    public static void main(String[] args) {
        Ex12 e = new Ex12();
        System.out.println(e.getI());
        e.UseInner();
        System.out.println(e.getI());
    }
}
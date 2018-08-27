//: chapter10/ex7/Ex7.java

public class EX7 {
    private int i = 10;
    private void Iplusplus() {
        i++;
    }

    public class Inner {
        public void changeI() {
            i = 11;
            Iplusplus();
        }
    } 

    public int getI() {
        return i;
    }

    public void UseInner() {
        Inner i = new Inner();
        i.changeI();
    }

    public static void main(String[] args) {
        EX7 e = new EX7();
        System.out.println(e.getI());
        e.UseInner();
        System.out.println(e.getI());
    }
}
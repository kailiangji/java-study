//: chapter10/ex13/Ex13.java

interface Iface {
    String getName();
}

public class Ex13 {
    public Iface getIface() {
        return new Iface() {
            public String getName() {
                return "InstanceOfIface";
            }
        };
    }

    public static void main(String[] args) {
        Ex13 e = new Ex13();
        Iface i = e.getIface();
        System.out.println(i.getName());
    }
}
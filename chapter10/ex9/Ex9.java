//: chapter10/ex9/Ex9.java

interface Iface {
    String getName();
}

public class Ex9 {
    public Iface getIface() {
        class InstanceOfIface implements Iface {
            public String getName() {
                return "InstanceOfIface";
            }
        }
        
        return new InstanceOfIface();
    }

    public static void main(String[] args) {
        Ex9 e = new Ex9();
        Iface i = e.getIface();
        System.out.println(i.getName());
    }
}
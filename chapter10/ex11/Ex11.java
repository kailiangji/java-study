//: chapter10/ex11/Ex11.java

class Outer {
    private class Inner implements Iface {
        public String getName() {
            return "Inner";
        }
    }
    
    public Iface getIface() {
        return new Inner();
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Outer e = new Outer();
        Iface i = e.getIface();
        System.out.println(i.getName());

        //! Ex11.Inner ii = (Ex11.Inner)i;
        //! System.out.println(ii.getName());
    }
}
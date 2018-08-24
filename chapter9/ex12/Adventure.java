//: chapter9/ex12/Adventure.java
// Multiple interfaces.

interface CanFlight {
    void flight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void flight() {}
}

class Hero extends ActionCharacter implements CanFlight, CanSwim, CanFly, CanClimb {
    public void swim() {}
    public void fly() {}
    public void climb() {}
}

public class Adventure {
    public static void t(CanFlight x) { x.flight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void f(CanClimb x) { x.climb(); }
    public static void w(ActionCharacter x) { x.flight(); }
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        f(h);
    }
}
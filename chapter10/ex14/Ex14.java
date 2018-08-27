//: chapter10/ex14/Ex14.java

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destory();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class Ex14 {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destory();
    }
    static void w (Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster(){
            public void menace() {}
            public void destory() {}
        };
        u(barney);
        v(barney);
        Vampire vlad = new Vampire(){
            public void menace() {}
            public void destory() {}
            public void kill() {}
            public void drinkBlood() {}
        };
        u(vlad);
        v(vlad);
        w(vlad);
    }
}


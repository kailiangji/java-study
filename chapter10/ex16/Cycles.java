//: chapter10/ex16/Cycles.java

interface Cycle {
    int num();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public int num() { return 1; }
    public static CycleFactory factory = 
    new CycleFactory() {
        public Cycle getCycle() {return new Unicycle(); }
    };
}

class Bicycle implements Cycle {
    public int num() { return 2; }
    public static CycleFactory factory = 
    new CycleFactory() {
        public Cycle getCycle() {return new Bicycle(); }
    };
}

class Tricycle implements Cycle {
    public int num() { return 3; }
    public static CycleFactory factory = 
    new CycleFactory() {
        public Cycle getCycle() {return new Tricycle(); }
    };
}

public class Cycles {
    public static void buyCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        System.out.printf("I got a cycle of %d wheels\n", c.num());
    }

    public static void main(String[] args) {
        buyCycle(Unicycle.factory);
        buyCycle(Bicycle.factory);
        buyCycle(Tricycle.factory);
    }
}
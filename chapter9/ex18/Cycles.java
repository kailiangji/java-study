//: chapter9/ex18/Cycles.java

interface Cycle {
    int num();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public int num() { return 1; }
}

class Bicycle implements Cycle {
    public int num() { return 2; }
}

class Tricycle implements Cycle {
    public int num() { return 3; }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Cycles {
    public static void buyCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        System.out.printf("I got a cycle of %d wheels\n", c.num());
    }

    public static void main(String[] args) {
        buyCycle(new UnicycleFactory());
        buyCycle(new BicycleFactory());
        buyCycle(new TricycleFactory());
    }
}
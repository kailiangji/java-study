//: chapter9/ex19/Toss.java
import java.util.*;

interface Toss {
    void play();
}

interface TossFactory {
    Toss getToss();
}

class CoinToss implements Toss {
    public void play() {
        Random rand = new Random();
        if ((rand.nextInt() % 2) == 0) {
            System.out.println("Coin: this is positive");
        } else {
            System.out.println("Coin: this is negative");
        }
    }
}

class DiceToss implements Toss {
    public void play() {
        Random rand = new Random();
        if ((rand.nextInt() % 6) > 2) {
            System.out.println("Dice: this is positive");
        } else {
            System.out.println("Dice: this is negative");
        }
    }
}

class CoinTossFactory implements TossFactory {
    public Toss getToss() {
        return new CoinToss();
    }
}

class DiceTossFactory implements TossFactory {
    public Toss getToss() {
        return new DiceToss();
    }
}

public class Tosses {
    public static void playToss(TossFactory factory) {
        Toss t = factory.getToss();
        t.play();
    }

    public static void main(String[] args) {
        playToss(new CoinTossFactory());
        playToss(new DiceTossFactory());
    }
}
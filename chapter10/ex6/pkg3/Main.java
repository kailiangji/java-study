//: chapter10/ex6/pkg3/Main.java

import chapter10.ex6.pkg1.*;
import chapter10.ex6.pkg2.*;

public class Main extends InnerI {
    public I instanceI () {
        return this.new ImplementI();
    }
    public static void main(String[] args) {
        Main m = new Main();
        //InnerI.ImplementI i = m.new ImplementI();
        //System.out.println(i.name());
        System.out.println(m.instanceI().name());
    }
}
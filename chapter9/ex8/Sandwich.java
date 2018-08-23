//: chapter9/ex8/Sandwich.java
// Order of constructor calls.
package chapter9.ex8;
import static net.mindview.util.Print.*;
interface FastFood {
    void WhatIsThis();
    int Price();
}

class Meal {
    Meal() { print("Meal()"); }
}

class Bread {
    Bread() { print("Bread()"); }
}

class Cheese {
    Cheese() { print("Cheese()");}
}

class Lettuce {
    Lettuce() { print("Lettuce"); }
}

class Lunch extends Meal {
    Lunch() { print("Lunch()");}
}

class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()"); }
}
 public class Sandwich extends PortableLunch {
     private Bread b = new Bread();
     private Cheese c = new Cheese();
     private Lettuce l = new Lettuce();
     public Sandwich() { print("Sandwich()"); }
     public void WhatIsThis() { print("This is Sandwich"); }
     public int Price() {return 10;}
     public static void main(String[] args) {
         Sandwich s = new Sandwich();
	 s.WhatIsThis();
	 System.out.printf("The price is %d\n", s.Price());
     } 
 }

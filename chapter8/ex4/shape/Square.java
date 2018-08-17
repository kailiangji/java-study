//: chapter8/ex4/shape/Square.java
package chapter8.ex4.shape;
import static net.mindview.util.Print.*;

public class Square extends Shape {
    @Override public void draw() { print("Square.draw()"); }
    @Override public void erase() { print("Square.erase()"); }
    @Override public void printMsg() { print("This is a Square"); }
}///:~

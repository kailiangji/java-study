//: chapter8/ex4/shape/Circle.java
package chapter8.ex4.shape;
import static net.mindview.util.Print.*;

public class Circle extends Shape {
    @Override public void draw() { print("Circle.draw()"); }
    @Override public void erase() { print("Circle.erase()"); }
    @Override public void printMsg() {print("This is a Circle"); }
}///:~

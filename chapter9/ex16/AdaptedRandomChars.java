//: chapter9/ex16/AdaptedRandomChars.java
import java.nio.*;
import java.util.*;

public class AdaptedRandomChars implements Readable {
    private static Random rand = new Random();
    public char next() { return (char)rand.nextInt(128); }
    private int count;
    public AdaptedRandomChars(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0) return -1;
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars(10));
        while(s.hasNext())
            System.out.println(s.next() + " ");
    }
}
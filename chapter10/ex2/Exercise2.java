//: chapter10/ex10/Exercise2.java

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;
    
    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if(i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}

public class Exercise2 {
    private String s;
    Exercise2(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(2);
        s.add(new Exercise2("Hello"));
        s.add(new Exercise2("Java"));
        
        Selector selector = s.selector();

        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.print("\n");
    }
}
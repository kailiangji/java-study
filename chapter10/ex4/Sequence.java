//: chapter10/ex4/Sequence.java
// Holds a sequence of Objects.

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
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

        public Sequence outer() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(11);
        
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        SequenceSelector selector = (SequenceSelector)sequence.selector();

        selector.outer().add("10");
        
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.print("\n");
    }
}
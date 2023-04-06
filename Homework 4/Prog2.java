import java.util.LinkedList;

public class Prog2 {
    public class Queue {
        private LinkedList<Object> list = new LinkedList<Object>();

        public void enqueue(Object item) {
            list.addLast(item);
        }

        public Object dequeue() {
            return list.removeFirst();
        }

        public Object first() {
            return list.getFirst();
        }
    }
}

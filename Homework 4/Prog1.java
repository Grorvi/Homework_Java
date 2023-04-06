public class Prog1 {
    public LinkedList reverseLinkedList(LinkedList list) {
        LinkedList prev = null;
        LinkedList current = list;
        LinkedList next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list = prev;
        return list;
    }
}

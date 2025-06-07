package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        // Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("element1");
        deque.add("element2");
        deque.add("element3");
        // Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }

        deque.offer("element1");
        deque.offer("element2");
        deque.add("element3");
        deque.offerFirst("element4");
        System.out.println("After offerFirst Traversal...");
        for (String s: deque) {
            System.out.println(s);
        }
        // deque.poll();
        // deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for (String s: deque) {
            System.out.println(s);
        }
    }
}

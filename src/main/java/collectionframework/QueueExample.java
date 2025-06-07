package collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> elementQueue = new LinkedList<>();

        elementQueue.add("element1");
        elementQueue.add("element2");
        elementQueue.add("element3");
        elementQueue.add("element4");

        System.out.println("WaitingQueue : " + elementQueue);

        String name = elementQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + elementQueue);

        name = elementQueue.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + elementQueue);

        elementQueue.add("element5");
        elementQueue.add("element6");

        System.out.println("is waitingQueue empty? : " + elementQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of waitingQueue : " + elementQueue.size());

        // Check if the Queue contains an element
        String userName = "Keshav";
        if(elementQueue.contains(userName)) {
            System.out.println("WaitingQueue contains " + userName);
        } else {
            System.out.println("Waiting Queue doesn't contain " + userName);
        }

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        String firstElementInTheWaitingQueue =  elementQueue.element();
        System.out.println("Waiting Queue (element()) : " + firstElementInTheWaitingQueue);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
        firstElementInTheWaitingQueue = elementQueue.peek();
        System.out.println("Waiting Queue : " + firstElementInTheWaitingQueue);

        System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
        for(String element : elementQueue) {
            System.out.println(element);
        }
    }
}

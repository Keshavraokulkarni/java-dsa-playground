package collectionframework;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");

        System.out.println("Initial LinkedList : " + fruits);

        // Adding an element at the specified position in the LinkedList
        fruits.add(2, "Watermelon");

        System.out.println("After add(2, \"D\") : " + fruits);

        // Adding an element at the beginning of the LinkedList
        fruits.addFirst("Strawberry");
        System.out.println("After addFirst(\"Strawberry\") : " + fruits);

        // Adding an element at the end of the LinkedList
        // (This method is equivalent to the add() method)
        fruits.addLast("Orange");
        System.out.println("After addLast(\"F\") : " + fruits);

        // Adding all the elements from an existing collection to
        // the end of the LinkedList
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Grapes");
        moreFruits.add("Pyrus");

        fruits.addAll(moreFruits);
        System.out.println("After addAll(moreFruits) : " + fruits);
    }
}

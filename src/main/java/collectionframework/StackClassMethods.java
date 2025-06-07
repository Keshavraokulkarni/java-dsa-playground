package collectionframework;

import java.util.Stack;

public class StackClassMethods {
    public static void main(String[] args) {
        pushMethod();
        searchMethod();
        popMethod();
        peekMethod();
        emptyMethod();
    }

    private static void searchMethod() {
        // creating stack
        Stack< String > stack = new Stack < > ();

        // populating stack
        stack.push("Java");
        stack.push("JEE");
        stack.push("C");
        stack.push("C++");
        stack.push("Spring");
        stack.push("Hibernate");

        // searching 'Spring' element
        System.out.println("Searching 'Spring' in stack: " + stack.search("Spring"));
    }

    private static void pushMethod() {
        // creating stack
        Stack < String > stack = new Stack < > ();

        // populating stack
        stack.push("Java");
        stack.push("JEE");
        stack.push("C");
        stack.push("C++");
        stack.push("Spring");
        stack.push("Hibernate");

        // checking elements
        System.out.println("Elements in the stack: " + stack);
    }

    private static void popMethod() {
        // creating stack
        Stack < String > stack = new Stack < > ();

        // populating stack
        stack.push("Java");
        stack.push("JEE");
        stack.push("C");
        stack.push("C++");
        stack.push("Spring");
        stack.push("Hibernate");

        // removing top object
        System.out.println("Removed object is: " + stack.pop());

        // elements after remove
        System.out.println("Elements after remove: " + stack);
    }

    private static void peekMethod() {
        // creating stack
        Stack < String > stack = new Stack < > ();

        // populating stack
        stack.push("Java");
        stack.push("JEE");
        stack.push("C");
        stack.push("C++");
        stack.push("Spring");
        stack.push("Hibernate");

        // checking the top object
        System.out.println("Top object is: " + stack.peek());
    }

    private static void emptyMethod() {
        // creating stack
        Stack < String > stack = new Stack < > ();

        // populating stack
        stack.push("Java");
        stack.push("JEE");
        stack.push("C");
        stack.push("C++");
        stack.push("Spring");
        stack.push("Hibernate");

        // checking stack
        System.out.println("Is stack empty: " + stack.empty());
    }
}

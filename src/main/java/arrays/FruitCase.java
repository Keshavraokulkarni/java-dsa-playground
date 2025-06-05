package arrays;

public class FruitCase {

    /*
    Write a snippet that:

Declares an array of your 3 favorite fruits.
Prints how many fruits are in the array using length.
Prints the last fruit using the length - 1 trick.
     */

    private static void printFruit(String[] fruits) {
        System.out.println("Fruits List:");
        for(int i=0;i<fruits.length;i++) {
            System.out.println(fruits[i]);
        }
    }

    private static void printLastFruit(String[] fruits) {
        if (fruits.length > 0) {
            System.out.println("Last fruit: " + fruits[fruits.length - 1]);
        } else {
            System.out.println("No fruits to display.");
        }
    }

    private static void printReverseOrder(String[] fruits) {
        System.out.println("printing fruits in reverse order:");
        if (fruits.length > 0) {
            for(int i= fruits.length-1;i>=0;i--) {
                System.out.println(fruits[i]);
            }
        } else {
            System.out.println("No fruits to display.");
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Orange"};
        printFruit(fruits);
        printLastFruit(fruits);
        printReverseOrder(fruits);
    }
}

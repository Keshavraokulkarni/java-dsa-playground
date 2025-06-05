package STRING;

public class StringExample {
    /*
    Write a small Java program that:

Declares a String variable with your name.
Prints the length of your name.
Prints the first and last characters of your name.
     */
    public static void main(String[] args) {
        String name = "Keshav";
        System.out.println("Length of name:"+name.length());
        System.out.println("First charecter:"+name.charAt(0));
        System.out.println("Last charecter:"+name.charAt(name.length()-1));
    }
}

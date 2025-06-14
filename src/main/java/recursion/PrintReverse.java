package recursion;

public class PrintReverse {

    public static void printReverseOrder(int n) {
        if(n == 0) return;

        printReverseOrder(n - 1);
        System.out.println("n="+n);
    }

    public static void main(String[] args) {
        printReverseOrder(5);
    }
}

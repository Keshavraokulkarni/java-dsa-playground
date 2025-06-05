package recursion;

public class Factorial {

    public static long factorial(long n) {

        if(n==0 || n==1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of number:"+factorial(5));
    }
}

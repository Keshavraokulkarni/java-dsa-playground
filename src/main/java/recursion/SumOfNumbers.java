package recursion;

public class SumOfNumbers {

    private static int sumOfNumbers(int n,int total) {
        if(n <= 0) return total;
        return sumOfNumbers(n - 1,total+n);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(5,0));
    }
}

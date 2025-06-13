package bitManipulation;

public class SumOfTwoIntegers {

    private static int getSum(int a,int b) {
       while (b != 0) {
            int carry = (a & b) << 1 ; // Carry is AND of a and b shifted left
            a = a ^ b;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
/*
        given 2 integers a and b, return the sum of the 2 integers without using the operators + and -
        using bit manipulation
        */
       int a = 3;
       int b = 1;
       int sum = getSum(a,b);
        System.out.println("Sum of 2 integers:"+sum);

    }
}

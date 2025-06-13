package bitManipulation;

public class BitManipulationExample {

    public static void main(String[] args) {
        // Kth Bit check
        int n = 5; //101
        int k = 2;
        boolean isSet = (n & (1 << k)) != 0;
        System.out.println("Kth bit is set to 1 ? "+ isSet); //true

        //set Kth Bit
        int n1 = 4; //100
        int k1 = 0;
        n1 = n1 | (1 << k1);
        System.out.println("Set the Kth Bit:"+n1); //5

        //clear the Kth Bit
        int n2 = 7;
        int k2 = 1;
        n2 = n2 & ~(1 << k2);
        System.out.println("clear the Kth bit:"+n2);

        //Toggling the bit
        int n3 = 4; //100
        int k3 = 0;
        n3 = n3 ^ (1 << k3); //101
        System.out.println("After toggling:"+n3); //n3=101=5

        //counting number of 1's
        int n4 = 5;
        int count = 0;
        while (n4 !=0) {
            System.out.println("n4:"+n4);
            System.out.println("n4 - 1:"+(n4 - 1));
            System.out.println("n4 & (n4 - 1):"+(n4 & (n4 - 1))); // 1: 5=101 & 4=100 -> 100 ...2: 4=100 3=011 -> 000
            n4 = n4 & (n4 - 1); // drop the lowest set
            count++;
        }
        System.out.println("number of 1's:"+count);

        //Swap 2 numbers without temp variable
        int i = 5, j=4;
        System.out.println("Before swapping: i="+i+" & j="+j);
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
        System.out.println("After swapping: i="+i+" & j="+j);

        //Checking given number is Odd or even
        int n5 = 5;
        if((n5 & 1) == 0) {
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given number is Odd");
        }

        //is powerOf 2
        int n6 = 4;
        boolean isPowerOfTwo = (( n & (n-1)) == 0 && n!=0);
        System.out.println("given number:"+n6+"isPowerOfTwo:"+isPowerOfTwo);
    }
}

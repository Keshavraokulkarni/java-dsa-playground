package bitManipulation;

public class ReverseBits {
    public static int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            // Shift reversed to the left to make space for the next bit
            reversed <<= 1;
            // Add the last bit of n to reversed
            reversed |= (n & 1);
            // Shift n to the right to process the next bit
            n >>= 1;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int n = 1100; // Example input
        int reversed = reverseBits(n);
        System.out.println("Reversed bits: " + reversed); // Output: 964176192
    }
}

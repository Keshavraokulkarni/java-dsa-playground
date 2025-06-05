package SlidingWindow;

public class SlidingWindowFixedSize {

    private static int findMaxSum(int[] arr, int k) {
        int n = arr.length;
        if(n < k) {
            throw new IllegalArgumentException("Array length must be greater than or equal to "+ k);
        }

        int maxSum = 0, windowSum = 0;

        //Calculate the sum of the fist window of size k
        for(int i=0; i<k;i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        //Slide the window from second window to end
        for(int i=k;i< n ; i++) {
            windowSum = windowSum + (arr[i] - arr[i - k]);
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println("Final Maximum sum of subarray of size "+ k +": "+findMaxSum(arr,k) );
    }
}

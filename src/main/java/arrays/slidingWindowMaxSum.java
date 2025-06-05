package arrays;

public class slidingWindowMaxSum
{
    static int slidingWindowMaxSum(int[] arr) {
        int maxSum = 0, windowSum = 0, k = 2;
        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - k + 1];
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,-1,0,1,1};
        System.out.println("Max sum of Array:"+slidingWindowMaxSum(arr));

    }
}

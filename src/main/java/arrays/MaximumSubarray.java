package arrays;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currSum=nums[0] , maxSum=0;

        for(int i=1;i<nums.length;i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println("Maximum subArray sum:"+maxSubArray(arr));
    }
}

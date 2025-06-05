package SlidingWindow;

public class SlidingWindowVariableSize {

    private static int minSubArrayLen(int[] nums, int target) {
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int left = 0;

        for(int right = 0; right < nums.length ; right++) {
            windowSum += nums[right];

            //Shrink the window from the left as long as the windowSum is >= target
            while (windowSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println("Min length of subarray with sum >="+ target+ " : " + minSubArrayLen(nums,target));
    }
}

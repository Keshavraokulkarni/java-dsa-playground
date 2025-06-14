package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    private static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;
        for(int j=0;j<nums.length;j++) {
            if(nums[j] != 0) {
                nums[nonZeroIndex++] = nums[j];
            }
        }
        for(int k=nonZeroIndex;k<nums.length;k++) {
            nums[k] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
    }
}

package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    /* O(n2) solution
     for(int i=1; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j]+nums[j-i] == target){
                    return new int[] {j-i,j};
                }
            }
        }
        return null;
     */

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("Two sum values are:"+ Arrays.toString(twoSum(nums, target)));
    }
}

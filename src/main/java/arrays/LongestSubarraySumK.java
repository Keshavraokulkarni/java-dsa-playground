package arrays;

import java.util.HashMap;

public class LongestSubarraySumK {
    public static int longestSubArrayWithSumK(int[] arr,int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for(int i=0;i< arr.length;i++) {
            sum += arr[i];

            if(sum == k) {
                maxLen = i+1;
            }
            if(map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum-k));
            }

            if(!map.containsKey(sum)) {
                map.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        int subArrayLength = longestSubArrayWithSumK(arr,k);
        if(subArrayLength == 0) {
            System.out.println("longest sub array not found for sum K:"+k);
        } else {
            System.out.println("Length of longest sub array:"+subArrayLength);
        }

    }
}

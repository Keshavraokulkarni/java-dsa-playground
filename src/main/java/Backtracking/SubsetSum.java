package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public List<List<Integer>> findSubsets(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int remaining, int start, List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (remaining < 0) return;

        for (int i = start; i < nums.length; i++) {
            // Include nums[i] in the current subset
            current.add(nums[i]);

            // Recur with reduced target and move to the next element
            backtrack(nums, remaining - nums[i], i + 1, current, result);

            // Backtrack by removing nums[i]
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        SubsetSum subsetSum = new SubsetSum();
        int[] nums = {2, 3, 5, 7};
        int target = 7;
        List<List<Integer>> subsets = subsetSum.findSubsets(nums, target);

        // Print subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}

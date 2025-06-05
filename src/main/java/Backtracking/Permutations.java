package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<String> generatePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        backtrack(permutations, new StringBuilder(), str.toCharArray(), new boolean[str.length()]);
        return permutations;
    }

    private void backtrack(List<String> permutations, StringBuilder current, char[] chars, boolean[] used) {
        if (current.length() == chars.length) {
            permutations.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;

            // Choose
            current.append(chars[i]);
            used[i] = true;

            // Explore
            backtrack(permutations, current, chars, used);

            // Un-choose (backtrack)
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        List<String> result = permutations.generatePermutations("ABC");

        // Print permutations
        for (String perm : result) {
            System.out.println(perm);
        }
    }
}

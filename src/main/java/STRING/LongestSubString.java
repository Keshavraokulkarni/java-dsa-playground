package STRING;

import java.util.HashSet;

public class LongestSubString {

    private int findLongestSubString(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right=0;right < s.length();right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,right - left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubString longestSubString=new LongestSubString();
        System.out.println("Longest substring length:"+longestSubString.findLongestSubString("aacabbcc"));
    }
}

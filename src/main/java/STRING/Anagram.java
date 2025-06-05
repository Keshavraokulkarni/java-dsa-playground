package STRING;

import java.util.Arrays;

public class Anagram {

    private static boolean isAnagram(String s,String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        System.out.println("sArray: "+ Arrays.toString(sArray) + " tArray: "+ Arrays.toString(tArray));

        return Arrays.equals(sArray,tArray);
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("isAnagram: "+isAnagram(s,t));

    }
}

package STRING;

public class ReverseString
{
    public static void main(String[] args) {
        String str="Hello";
        int left = 0;
        int right=str.length() - 1;
        char[] s=str.toCharArray();

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        String reversed = String.valueOf(s);
        System.out.println("Reversed String: "+ reversed);
    }
}

package arrays;

import java.util.Arrays;

public class SplitArray {

  public static void main(String[] args) {
    int[] original = {0,1,2,3,4,5,6,7,8};
    int givenIndex = 3;
    int[] splitpart1 = Arrays.copyOfRange(original,0,givenIndex);
    int[] splitpart2 = Arrays.copyOfRange(original,givenIndex,original.length);

    System.out.println(Arrays.toString(splitpart1));
    System.out.println(Arrays.toString(splitpart2));

  }
}

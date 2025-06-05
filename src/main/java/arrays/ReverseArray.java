package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ReverseArray {

  public static void main(String[] args) {
   /* int[] original = {1,2,3,4,5};
    int[] reverse = new int[original.length];

    for(int i=original.length-1,j=0;i>=0;i--,j++) {
      reverse[j] = original[i];
    }
    System.out.println(Arrays.toString(reverse)); */

    int[] original = {1,2,3,4,5};
    int[] reverse = new int[original.length];

    for(int i=0;i<original.length;i++) {
      reverse[i] = original[original.length - i - 1];
    }
    System.out.println(Arrays.toString(reverse));

    System.out.println("======================");
    //using swapping
    for(int i=0; i< original.length/2;i++) {
      int temp = original[i];
      original[i] = original[original.length - i - 1];
      original[original.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(original));

    System.out.println("======================");

    Integer[] arr= {1,2,3,4,6};
    Collections.reverse(Arrays.asList(arr));
    System.out.println(Arrays.toString(arr));


    System.out.println("======================");
    //using stack
    Stack<Integer> stack = new Stack<>();
    for(int val : original) {
      stack.push(val);
    }
    for(int i=0;i<original.length;i++) {
      original[i] = stack.pop();
    }
    System.out.println(Arrays.toString(original));
  }

}

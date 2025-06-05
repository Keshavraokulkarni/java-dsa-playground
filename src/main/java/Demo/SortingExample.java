package Demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingExample {

  public static void frequencyCheck(char[] chars) {
    Map<Character,Integer> frequencyMap=new HashMap<>();

    for(char c: chars) {
        frequencyMap.put(c,frequencyMap.get(c)+1);

    }

  }


  public static void sorting(int[] num) {
    int low = 0;
    int high = num.length-1;
    int mid;

    //[1,2,0,2]
    while (low < high) {
      mid = low + (high - low) / 2;
      if(num[mid] == 1) {
        continue;
      }
      if (num[mid] == 0) {
        int temp = num[mid];
        num[mid] = num[low];
        num[low] = temp;
        low++;
      } else if (num[mid] == 2) {
        int temp1= num[mid];
        num[mid] = num[high];
        num[high] = temp1;
        high--;
      }
    }
    System.out.println(Arrays.toString(num));
  }

  public static void main(String[] args) {
    int[] n=new int[]{1,2,0,2,1};
    sorting(n);
  }
}
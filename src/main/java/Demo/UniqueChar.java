package Demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueChar
{

  private static void getUniqueCharecter(String str) {
    HashMap<Character,Integer> map=new LinkedHashMap<>();

    for(int i=0;i<str.length();i++) {

      if(map.containsKey(str.charAt(i))) {
        map.put(str.charAt(i),map.get(str.charAt(i))+1);
      }
      else {
        map.put(str.charAt(i),1);
      }
    }

    for(Entry<Character,Integer> entry : map.entrySet()) {
      if(entry.getValue()==1) {
        System.out.println("Unique char:"+entry.getKey());
        break;
      }
    }
  }

  private static void getSumOfTwoNumbers(int[] num,int sum) {
    Map<Integer,Boolean> map=new HashMap<>();

    for(int i=0;i<num.length;i++) {
      if(map.containsKey(sum-num[i])) {
        System.out.println("pairs:"+num[i] +","+ (sum-num[i]));
      }
      else {
        map.put(num[i],true);
      }
    }

   /* for(Entry<Integer,Boolean> entry: map.entrySet()) {

      if (map.containsKey(sum - entry.getKey())) {
        System.out.println("Pairs:"+ entry.getKey() +","+entry.getValue());
      }
    } */
  }

  public static void main(String[] args) {
  /*  String str="";
    getUniqueCharecter(str.toLowerCase()); */

    int[] num=new int[] {2,4,5,6,8};
    int sum=10;

    getSumOfTwoNumbers(num,sum);

    /*
    2,4,5,6,8, sum=10
output: 2,8 & 4,6
     */
  }
}

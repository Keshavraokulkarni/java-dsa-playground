package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayTraversal
{

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};

    for(int i=0; i < arr.length;i++) {
      System.out.println(arr[i]);
    }

    System.out.println("------------------");
    for(int element : arr) {
      System.out.println(element);
    }

    System.out.println("------------------");
    Arrays.stream(arr).forEach(System.out::println);

    System.out.println("------------------");
    Integer[] array = {1,2,3,4,5};
    for(Iterator<Integer> iterator=Arrays.asList(array).iterator(); iterator.hasNext();) {
      Integer element = iterator.next();
      System.out.println(element);
    }

    System.out.println("------------------");
    List<Integer> list= Arrays.asList(array);
    list.forEach(System.out::println);

  }

}

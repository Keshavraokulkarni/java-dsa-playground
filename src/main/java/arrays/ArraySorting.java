package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraySorting {

  public static void main(String[] args) {
    int[] arr= {3,1,4,1,5,9};
    Arrays.sort(arr);
    Arrays.stream(arr).forEach(System.out::println);
    System.out.println("=============");

    List<Integer> list = Arrays.asList(1,8,9,4,2);
    Collections.sort(list); //Comparable
    list.stream().forEach(System.out::println);
    System.out.println("=============");

    int[] data = new int[] { 5, 4, 2, 1, 3 };
    data = Arrays.stream(data).
        boxed().
        sorted((a, b) -> a.compareTo(b)). //currently sorting asc, if you want sort descending b.compareTo(a))
            mapToInt(i -> i).
        toArray();

    Arrays.stream(data).forEach(System.out::println);
    System.out.println("=============");

    int[] arr2 = { 5, 4, 2, 1, 3 };
    int[] sortedArr2 = Arrays.stream(arr2).sorted().toArray();
    Arrays.stream(sortedArr2).forEach(System.out::println);
    System.out.println("=============");
  }
}

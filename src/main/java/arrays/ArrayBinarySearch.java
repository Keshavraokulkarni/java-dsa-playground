package arrays;

import java.util.Arrays;
import java.util.List;

/*
The binarySearch method performs a search on a sorted array by repeatedly dividing the search interval in half.
If the value of the search key is less than the item in the middle of the interval,
it narrows the interval to the lower half.
Otherwise, it narrows it to the upper half.
The search ends when the value is found or the interval is empty.
 */
public class ArrayBinarySearch {

  public static int binarySearch(int[] sortedArray, int elementToFind) {
    int left = 0;
    int right = sortedArray.length - 1;
    while (left <= right) {
      int mid = left + (right - left ) / 2;

      if(sortedArray[mid] == elementToFind) {
        return mid;
      }

      if(sortedArray[mid] < elementToFind) {
        left = mid + 1 ;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static int arraySearchUsingArrays(int[] arr, int key) {
    return Arrays.binarySearch(arr, key);
  }


  public static boolean containsElementUsingArrayList(Integer[] arr, Integer key) {
    List<Integer> list = Arrays.asList(arr);
    return list.contains(key);
  }


  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int elementToFind = 4;

    int index = binarySearch(arr,elementToFind);

    if(index == -1) {
      System.out.println("element not found in the array");
    } else {
      System.out.println("Elemetn found in the array at index:" + index);
    }

    System.out.println("------------------");

    int indexVal = arraySearchUsingArrays(arr,elementToFind);
    if(indexVal == -1) {
      System.out.println("element not found in the array");
    } else {
      System.out.println("Elemetn found in the array at index:" + indexVal);
    }

    System.out.println("----------------------");

    if (containsElementUsingArrayList(new Integer[]{1, 2, 3, 4, 5}, elementToFind))
      System.out.println("element found");
    else {
      System.out.println("element not found");
    }
  }
}

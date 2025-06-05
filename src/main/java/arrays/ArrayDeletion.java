package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDeletion {
  public static int[] deleteElement(int[] originalArray,int index) {
    if(index < 0 || index > originalArray.length) {
      System.out.println("invalid index");
      return originalArray;
    }

    int[] newArr = new int[originalArray.length - 1];

    for(int i=0,j=0;i< originalArray.length;i++) {
      if(i != index) {
        newArr[j++] = originalArray[i];
      }
    }
    return newArr;
  }

  public static int[] shiftElementsToDelete(int[] array, int index) {
    if (index < 0 || index >= array.length) {
      throw new IllegalArgumentException("Index out of bounds");
    }
    for (int i = index; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[array.length - 1] = 0; // or null, depending on the array type
    return array;
  }

  public static Integer[] removeElementUsingArrayList(Integer[] original, Integer element) {
    List<Integer> list = new ArrayList<>(Arrays.asList(original));
    list.remove(element);
    return list.toArray(new Integer[0]);
  }


  public static void main(String[] args) {
    int[] arr=new int[] {1,2,3,4,5,6};
    int indexToDelete = 2;

    arr = deleteElement(arr,indexToDelete);

    for(int element : arr) {
      System.out.println(element + " ");
    }

    System.out.println("--------");
    arr = shiftElementsToDelete(arr,3);
    for(int element : arr) {
      System.out.println(element + " ");
    }

    System.out.println("---------");
    Integer[] array= {1,2,3,4,5};
    array = removeElementUsingArrayList(array,3);
    for(int element : array) {
      System.out.print(element + " ");
    }
  }

}

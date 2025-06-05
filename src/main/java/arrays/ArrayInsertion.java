package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInsertion {

  private static int[] insertElement(int[] originalArray, int elementToInsert,int index) {

    if(index < 0 || index > originalArray.length) {
      System.out.println("Invalid index");
      return originalArray;
    }

    int[] newArray = new int[originalArray.length + 1];

    for(int i=0,j=0;i<newArray.length;i++) {
      if(i == index) {
        newArray[i] = elementToInsert;
      } else {
        newArray[i] = originalArray[j++];
      }

    }
    return newArray;
  }

  public static int[] insertElementUsingArrayCopy(int[] original, int element, int index) {
    int[] newArray = new int[original.length + 1];
    System.arraycopy(original, 0, newArray, 0, index);
    newArray[index] = element;
    System.arraycopy(original, index, newArray, index + 1, original.length - index);
    return newArray;
  }

  public static Integer[] insertElementUsingArrayList(Integer[] original, int element) {
    List<Integer> list = new ArrayList<>(Arrays.asList(original));
    list.add(element);
    return list.toArray(new Integer[0]);
  }


  public static int[] insertElementUsingShift(int[] original, int element, int index) {
    int[] newArray = new int[original.length + 1];
    for (int i = 0; i < index; i++) {
      newArray[i] = original[i];
    }
    newArray[index] = element;
    for (int i = index + 1; i < newArray.length; i++) {
      newArray[i] = original[i - 1];
    }
    return newArray;
  }



  public static void main(String[] args) {
    int[] arr = {1,2,3,5,6};
    int elementToInsert = 4;
    int index = 3;

    arr = insertElement(arr,elementToInsert,index);
    System.out.println("After inserting element in given index :");
    for(int element : arr ) {
      System.out.print(element + " ");
    }

    System.out.println("------");
    arr = insertElementUsingArrayCopy(arr,4,3);
    System.out.println("After inserting element in given index :");
    for(int element : arr ) {
      System.out.print(element + " ");
    }

    System.out.println("------");
    arr = insertElementUsingShift(arr,4,3);
    System.out.println("After inserting element in given index :");
    for(int element : arr ) {
      System.out.print(element + " ");
    }

    System.out.println("------");
    Integer[] array= {1,2,3,5,6};
    array = insertElementUsingArrayList(array,4);
    Arrays.stream(array).forEach(System.out::print);
  }



}

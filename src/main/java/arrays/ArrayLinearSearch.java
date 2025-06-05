package arrays;

public class ArrayLinearSearch {

  public static int linearSearch(int[] array,int elementToFind) {
    for(int i=0;i<array.length;i++) {
      if(array[i] == elementToFind) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int elementToFind = 3;
    int index = linearSearch(arr,elementToFind);

    if(index == -1) {
      System.out.println("eleement not found in the array.");
    } else {
      System.out.println("Eelement found at index:" + index);
    }

  }
}

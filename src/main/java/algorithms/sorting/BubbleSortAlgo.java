package algorithms.sorting;


class BubbleSort {
  void bubbleSort(int arr[]) {
    int n = arr.length;
    System.out.println("Before Sorting:");
    printArray(arr);
    for (int i = 0; i < n-1; i++)
      for (int j = 0; j < n-i-1; j++)
        if (arr[j] > arr[j+1]) {
          // swap arr[j+1] and arr[j]
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
    System.out.println("\nAfter Sorting:");
    printArray(arr);
  }

  void printArray(int arr[]) {
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

public class BubbleSortAlgo {

  public static void main(String[] args) {
    BubbleSort bubbleSort=new BubbleSort();
    int[] arr= {3,7,5,1,9,8};
    bubbleSort.bubbleSort(arr);
  }
}

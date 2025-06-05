package arrays;

public class RotateArray {
  // Function to rotate an array by k steps
  public static void rotate(int[] arr, int k) {
    int n = arr.length;
    // Normalize the number of rotations
    k = k % n;
    if (k < 0) {
      // Convert negative rotation to positive by adding array length
      k += n;
    }

    // Create a temporary array to hold the rotated parts
    int[] temp = new int[n];

    // Copy the elements from the original array to the temp array in rotated order
    for (int i = 0; i < n; i++) {
      temp[(i + k) % n] = arr[i];
    }

    // Copy the rotated elements back into the original array
    for (int i = 0; i < n; i++) {
      arr[i] = temp[i];
    }
  }

  public static void main(String[] args) {
    int[] myArray = {1, 2, 3, 4, 5, 6, 7};
    int k = 3; // Number of steps to rotate the array

    rotate(myArray, k);

    // Print the rotated array
    for (int value : myArray) {
      System.out.print(value + " ");
    }

    System.out.println("=============");
    rotateWithReversal(myArray,k);
    // Print the rotated array
    for (int value : myArray) {
      System.out.print(value + " ");
    }
  }

  public static void rotateWithReversal(int[] arr, int d) {
    if (arr == null || arr.length == 0 || d < 0) {
      throw new IllegalArgumentException("Invalid parameters");
    }
    int n = arr.length;
    // Normalize the number of rotations
    d = d % n;
    // Reverse the first part
    reverse(arr, 0, d - 1);
    // Reverse the second part
    reverse(arr, d, n - 1);
    // Reverse the whole array
    reverse(arr, 0, n - 1);
  }

  private static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

}

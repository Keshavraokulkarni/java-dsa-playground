package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        for(int i=0;i<arr.length - 1; i++) {
            int minIdx = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {3,7,1,8,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}

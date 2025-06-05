package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeArray {

  public static void main(String[] args) {
    int[] arr1 = {3,5,6,1,3,4};
    int[] arr2 = {4,5,1,32,4};

    int firstArrLength = arr1.length;
    int secondArrLength = arr2.length;

    int[] mergedArray = new int[firstArrLength + secondArrLength];

    System.arraycopy(arr1,0,mergedArray,0,firstArrLength);

    System.arraycopy(arr2,0,mergedArray,firstArrLength,secondArrLength);

    System.out.println("Merged Array:" + Arrays.toString(mergedArray));

    System.out.println("==================");

    int[] mergedArray2 = Stream.of(arr1,arr2).flatMapToInt(IntStream::of).toArray();
    System.out.println("Merged Array2:"+Arrays.toString(mergedArray2));

    System.out.println("==================");

    Integer[] array1 = {3,5,6,1,3,4};
    Integer[] array2 = {4,5,1,32,4};
    List<Integer> list = new ArrayList<>(Arrays.asList(array1));
    list.addAll(Arrays.asList(array2));
    Integer[] mergedArray3 = list.toArray(new Integer[0]);
    System.out.println("Merged Array3:"+Arrays.toString(mergedArray3));

  }

}

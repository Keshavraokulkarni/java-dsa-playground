package arrays;

import java.util.Arrays;

public class ArrayInsert
{
  int[] arr1;
  int[] arr2;
  int n=5;
  private void createArray() {
    arr1 = new int[6];
    for(int i=0;i<n;i++) {
      arr1[i] = i+2;
    }
    arr2=new int[] {1,2,3,4,5};
  }

  private void insertElemnet() {
    int x=25;
    int position=4;
    for(int i=5;i>=position;i--)
      arr1[i] = arr1[i - 1];
    arr1[position - 1] = x;

  }
  private void printArray() {
    System.out.println("Print Array1-");
    for(int element:arr1) {
      System.out.println(element);
    }

    System.out.println("Print Array2-");
    System.out.println(Arrays.toString(Arrays.stream(arr2).toArray()));
  }

  private boolean search(int x) {
    for(int i : arr1) {
      if(i==x)
        return true;
    }
    return false;
  }

  private void updateValue(int pos,int x) {
    arr1[pos] = x;
    System.out.println("After the update value in position:"+pos);
  }

  public static void main(String[] args) {
    ArrayInsert arrayInsert=new ArrayInsert();
    arrayInsert.createArray();
    arrayInsert.insertElemnet();
    arrayInsert.printArray();
    System.out.println("found element: "+arrayInsert.search(25));
    arrayInsert.updateValue(5,35);
    arrayInsert.printArray();
  }

}

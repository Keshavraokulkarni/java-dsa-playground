package arrays;

public class UpdateArray {

  public static void main(String[] args) {
    int[] num= {1,2,3,4,7};

    int indexToUpdate = 4;
    int newValue = 5;

    num[indexToUpdate] = newValue;

    System.out.println("After update array:");
    for(int number: num) {
      System.out.print(number + " ");
    }
  }
}

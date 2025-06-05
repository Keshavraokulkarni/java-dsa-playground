package recursion;

public class ArraySum {

  public static int sumOfArray(int[] arr,int n)
  {
    if(n== 0)
      return arr[n];

    return arr[n] + sumOfArray(arr,n-1);
  }

  public static void main(String[] args) {
    int[] arr=new int[] {2,4,6,8};
    System.out.println("Sum: "+sumOfArray(arr,arr.length-1));
  }

}

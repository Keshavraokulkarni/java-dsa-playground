package LearningAB.basics;

import java.util.Scanner;

public class KeyboardRead
{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 2 Numbers:");
    int num1=s.nextInt();
    int num2=s.nextInt();
    int sum=num1 + num2;
    //s.next() Read word
    //s.nextLine() Read sentences
    //s.hasNextInt() will check next number given is integer or not
    System.out.println("Sum is:"+sum);
  }
}

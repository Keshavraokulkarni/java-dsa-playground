package LearningAB.basics;

public class PrintUnicode
{
  public static void main(String[] args) {
    for (char c = 0x0900; c <= 0x0970; c++) {
      System.out.println(c + " "+ Integer.toHexString(c));
    }
  }

}

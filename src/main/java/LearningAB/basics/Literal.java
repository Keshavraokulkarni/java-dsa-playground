package LearningAB.basics;

public class Literal
{

  public static void main(String[] args) {
    byte b1=10; //decimal
    byte b2= 0b1010; //binary
    byte b3=012; //octal
    byte b4=0XA; //HexaDecimal
    long l=99_99_99_999l; // underscore "_" for reading purpose
    // int i=125l; not allowed - compitable
    float f=12.56f;
    double d=12.56;
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
  }

}

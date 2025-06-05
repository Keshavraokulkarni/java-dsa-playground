package LearningAB.Inheritance;

public class SubB extends SuperA {

  int k;

  void showk() {
    System.out.println("k:" + k);
  }

  void sum() {
    System.out.println("sum:" + (i + j + k));
  }
}
  class SimpleInheritance {

    public static void main(String[] args) {
      SuperA obj1=new SuperA();
      SubB obj2=new SubB();

      obj1.i=10;
      obj1.j=11;
      obj1.showx();
      obj1.showij();

      obj2.i=1;
      obj2.j=2;
      obj2.k=3;
      obj2.showk();
      obj2.showij();
      obj2.sum();
    }
  }



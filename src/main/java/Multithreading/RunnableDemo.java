package Multithreading;

class Runners implements Runnable {

  public void run() {
    for(int i=0;i<10; i++) {
      System.out.println("Hello: "+i);

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
public class RunnableDemo {

  public static void main(String[] args) {
    Thread t1=new Thread(new Runners());
    Thread t2=new Thread(new Runners());

    t1.start();
    t2.start();
  }


}

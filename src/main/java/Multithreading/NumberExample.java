package Multithreading;

public class NumberExample implements Runnable
{


  @Override
  public void run() {
    synchronized (this) {
      for (int i = 1; i <= 20; i++) {
        if ((i % 2 == 0) && Thread.currentThread().getName().equals("even")) {
          System.out.println("even Thread:" + Thread.currentThread().getName());
          System.out.println(i);
        }
        else {
          System.out.println("odd Thread:" + Thread.currentThread().getName());
          System.out.println(i);
        }
        try {
          wait();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        notify();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    NumberExample obj=new NumberExample();
    Thread odd=new Thread(obj);
    odd.setName("odd");
    Thread even=new Thread(obj);
    odd.setName("even");
    odd.start();
    even.start();

  }
}

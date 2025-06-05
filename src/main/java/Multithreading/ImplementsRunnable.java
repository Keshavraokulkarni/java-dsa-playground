package Multithreading;

public class ImplementsRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("Implements Runnable demo");
  }

  public static void main(String[] args) {
    ImplementsRunnable implementsRunnable=new ImplementsRunnable();
    Thread thread=new Thread(implementsRunnable);
    thread.start();
  }
}

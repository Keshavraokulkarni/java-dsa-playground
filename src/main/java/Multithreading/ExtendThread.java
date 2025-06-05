package Multithreading;

public class ExtendThread extends Thread
{
  public void run()
  {
    System.out.println("Extend Thread demo");
  }

  public static void main(String[] args) {
    ExtendThread extendThread=new ExtendThread();
    extendThread.start();
  }

}

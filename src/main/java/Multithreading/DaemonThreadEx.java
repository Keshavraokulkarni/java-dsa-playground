package Multithreading;

public class DaemonThreadEx extends Thread
{

  public DaemonThreadEx(String name)
  {
    super(name);
  }

  public void run() {
    if(Thread.currentThread().isDaemon()) {
      System.out.println(getName() +" is daemon thread");
    }
    else {
      System.out.println(getName() + " is user thread");
    }
  }

  public static void main(String[] args) {
    DaemonThreadEx t1=new DaemonThreadEx("t1");
    DaemonThreadEx t2=new DaemonThreadEx("t2");

    t1.setDaemon(true);
    t2.start();
    t1.start();
  }
}

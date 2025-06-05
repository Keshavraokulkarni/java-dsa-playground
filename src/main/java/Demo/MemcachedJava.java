package Demo;

import java.io.IOException;
import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava
{

  public static void main(String[] args) throws IOException {
    MemcachedClient mcc = new MemcachedClient(new InetSocketAddress("10.93.64.132", 5000));
    System.out.println("Connection to server sucessfully");
    //System.out.println("set status:"+mcc.set("count", 900, "5").isDone());

    // Get value from cache
    System.out.println("Get from Cache:"+mcc.get("count"));

     mcc.flush();
    // now clear all this data
    System.out.println("Clear data:"+mcc.flush().isDone());

  }
}

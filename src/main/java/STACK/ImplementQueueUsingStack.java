package STACK;

import java.util.Stack;

public class ImplementQueueUsingStack
{
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();

    static void enQueue(int data) {
        s1.push(data);
    }

    static int deQueue() {
        int x=-1;
        if(s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        if(s2.isEmpty()) {
            while (!s1.isEmpty()) {
                x = s1.pop();
                s2.push(x);
            }
        }
        x = s2.pop();
        return x;
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack.enQueue(10);
        ImplementQueueUsingStack.enQueue(20);
        ImplementQueueUsingStack.enQueue(30);

        System.out.println("Dequeue:"+deQueue());
        System.out.println("Dequeue:"+deQueue());
        System.out.println("Dequeue:"+deQueue());
        System.out.println("Dequeue:"+deQueue());
    }
}

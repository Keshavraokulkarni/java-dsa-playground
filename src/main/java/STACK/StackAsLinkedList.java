package STACK;

public class StackAsLinkedList
{
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if(root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data +" pushed to stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if(root == null) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if(root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }

    public static void main(String[] args) {
        StackAsLinkedList stackAsLinkedList = new StackAsLinkedList();
        stackAsLinkedList.push(10);
        stackAsLinkedList.push(20);
        stackAsLinkedList.push(30);

        System.out.println(stackAsLinkedList.pop() + " popped from stack");

        System.out.println("Top element is:"+stackAsLinkedList.peek());

        System.out.println(stackAsLinkedList.pop() + " popped from stack");
        System.out.println(stackAsLinkedList.pop() + " popped from stack");
        System.out.println(stackAsLinkedList.pop() + " popped from stack");
        System.out.println(stackAsLinkedList.pop() + " popped from stack");


    }
}

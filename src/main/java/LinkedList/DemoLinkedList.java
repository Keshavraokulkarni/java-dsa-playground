package LinkedList;

public class DemoLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data,int position) {
        Node newNode = new Node(data);
        if(position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for(int i=1; temp != null && i < position;i++) {
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void display() {
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void delete(int key) {
        Node temp = head, prev = null;

        if(temp !=null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data !=key) {
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("\nkey not found in the list");
            return;
        }
            prev.next = temp.next;
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return merge(left,right);

    }

    private Node merge(Node left, Node right) {
        if(left == null) {
            return right;
        }
        if(right == null) {
            return left;
        }

        Node result;

        if(left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return  result;
    }

    public void sort() {
        head = mergeSort(head);
    }


    private Node getMiddle(Node head) {
        if(head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



    public static void main(String[] args) {
        DemoLinkedList list = new DemoLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.display();
        list.delete(20);
        list.delete(20);
        System.out.println("\nAfter delete:");
        list.display();
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.display();
        list.insertAtPosition(30,1);
        list.insertAtPosition(19,0);
        list.insertAtPosition(7,3);
        list.insertAtPosition(40,0);
        System.out.println("Before sort:");
        list.display();
        list.sort();
        System.out.println("After sort:");
        list.display();
    }
}

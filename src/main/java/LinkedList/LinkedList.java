package LinkedList;

class Node {
  int data;
  Node next;
    }
public class LinkedList {
  Node head;

  void insertAtFront(int data) {
    Node new_node= new Node();

    new_node.data = data;
    new_node.next = head;

    head = new_node;
  }

  void removeFirstNode() {
    if(head == null)
      return;

    Node temp = head;
    System.out.println("will going to remove:"+temp.data);
    head = head.next;
  }

  void insertAtEnd(int data) {
    Node node=new Node();

    if(head == null) {
      head = new Node();
      head.data = data;
      return;
    }
    node.data = data;
    //inserting at last node so make next it as null
    node.next = null;

    Node last = head;
    while (last.next !=null)
      last = last.next;

    last.next = node;

    return;
  }

  void  insertAfterGivenNode(Node prev_node, int data) {
    if(prev_node == null) {
      System.out.println("The given previous node cannot be null");
      return;
    }

    Node node = new Node();
    node.data = data;

    node.next = prev_node.next;

    prev_node.next = node;
  }

  void printList() {
    Node node = head;
    while (node !=null) {
      System.out.print(node.data );
      if(node.next !=null)
      System.out.print("->");
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insertAtFront(5);
    list.insertAtFront(4);
    list.insertAtFront(3);
    list.insertAtFront(2);
    list.insertAtFront(1);

    System.out.println("After insert at front:");
    list.printList();
    list.removeFirstNode();
    System.out.println("Afte removing first node:");
    list.printList();

    list.insertAtEnd(6);
    System.out.println("After insert at end:");
    list.printList();
    list.insertAfterGivenNode(list.head, 67);
    System.out.println("After insert after given node:");
    list.printList();
  }
}

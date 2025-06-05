package Queue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue {
    private Node front, rear;

    // Constructor
    public LinkedListQueue() {
        this.front = this.rear = null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Add an element to the queue (enqueue)
    public void enqueue(int element) {
        Node newNode = new Node(element);

        // If the queue is empty, both front and rear are the new node
        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(element + " enqueued to queue");
            return;
        }

        // Otherwise, add the new node at the rear and update the rear pointer
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(element + " enqueued to queue");
    }

    // Remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        // Remove the front node and update the front pointer
        int element = this.front.data;
        this.front = this.front.next;

        // If the front becomes null, set the rear to null as well (queue is empty)
        if (this.front == null) {
            this.rear = null;
        }

        System.out.println(element + " dequeued from queue");
        return element;
    }

    // Get the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        // Add elements to the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        // Peek at the front element
        System.out.println("Front element is: " + queue.peek());

        // Remove elements from the queue
        queue.dequeue();
        queue.dequeue();

        // Peek again after dequeuing
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}

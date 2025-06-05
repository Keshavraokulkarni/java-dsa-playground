package Queue;

class ArrayQueue {
    private int[] queue;  // Array to store elements
    private int front;     // Front index of the queue
    private int rear;      // Rear index of the queue
    private int size;      // Current size of the queue
    private int capacity;  // Capacity of the queue

    // Constructor
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Add an element to the queue (enqueue)
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;  // Circular increment
        queue[rear] = element;
        size++;
        System.out.println(element + " enqueued to queue");
    }

    // Remove an element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int element = queue[front];
        front = (front + 1) % capacity;  // Circular increment
        size--;
        System.out.println(element + " dequeued from queue");
        return element;
    }

    // Get the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    // Get the size of the queue
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);  // Create a queue of size 5

        // Add elements to the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Try to enqueue another element when the queue is full
        queue.enqueue(60);

        // Get the front element
        System.out.println("Front element is: " + queue.peek());

        // Remove elements from the queue
        queue.dequeue();
        queue.dequeue();

        // Get the new front element after dequeuing
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}

package shiyan5;

public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    // Constructor with default capacity
    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int v) {
        if (size >= elements.length) {
            increaseArraySize();
        }
        elements[size++] = v;
    }

    // Method to remove and return an element from the queue
    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = elements[0];
        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return element;
    }

    // Method to check if the queue is empty
    public boolean empty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int getSize() {
        return size;
    }

    // Method to increase the array size
    private void increaseArraySize() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    // Test program
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue 20 numbers
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        // Dequeue and display all numbers
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}

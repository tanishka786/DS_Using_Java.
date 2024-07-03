import java.util.LinkedList;

class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    // Method to add an item to the queue.
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // Method to remove an item from the queue. Returns null if queue is empty.
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }

    // Method to get the front item of the queue without removing it.
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return queue.getFirst();
    }

    // Method to check if the queue is empty.
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to get the size of the queue.
    public int size() {
        return queue.size();
    }
    
    // Method to print all elements in the queue.
    public void printQueue() {
        System.out.println("Queue elements:");
        for (T item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);

        myQueue.printQueue(); // Output: Queue elements: 10 20 30 40

        System.out.println("Dequeue: " + myQueue.dequeue()); // Output: Dequeue: 10
        System.out.println("Peek: " + myQueue.peek()); // Output: Peek: 20

        myQueue.printQueue(); // Output: Queue elements: 20 30 40
    }
}
                                              

output:-        java -cp /tmp/3UECwsmeE7/Queue
Queue elements:
10 20 30 40 
Dequeue: 10
Peek: 20
Queue elements:
20 30 40 

=== Code Execution Successful ===
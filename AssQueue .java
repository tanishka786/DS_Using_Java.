class Queue {
      
    private int front;
    private int rear;
    private int maxSize;
    private int arr[];
      
    Queue(int maxSize) {
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arr = new int[this.maxSize];
    }
      
    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }
            
    public boolean enqueue(int data) {
        if (isFull()) {
            return false;
        } else {
            arr[++rear] = data;
            return true;
        }
    }

    public void display() {
        if(isEmpty())
            System.out.println("Queue is empty!");
        else {
            for (int index = front; index <= rear; index++) {
                System.out.println(arr[index]);
            }
        }
    }
            
    public boolean isEmpty() {
        if (front > rear)
            return true;
        return false;
    }
            
    public int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int data = arr[this.front];
            arr[front++] = Integer.MIN_VALUE;
            return data;
        }
    }

    public int getMaxSize() {
        return maxSize;
    }
}

public class QueueAssignment {

    public static void main(String[] args) {
            
        Queue queue = new Queue(7);
        queue.enqueue(13983);
        queue.enqueue(10080);
        queue.enqueue(7113);
        queue.enqueue(2520);
        queue.enqueue(2500);

        Queue outputQueue = findEvenlyDivisibleNumbers(queue, 5); // Change divisor as needed
            
        System.out.println("Evenly divisible numbers:");
        outputQueue.display();

    }
      
    public static Queue findEvenlyDivisibleNumbers(Queue queue, int divisor) {
        Queue resultQueue = new Queue(queue.getMaxSize()); // Create a new Queue for results
        
        while (!queue.isEmpty()) {
            int number = queue.dequeue();
            if (number % divisor == 0) {
                resultQueue.enqueue(number); // Enqueue number if divisible by divisor
            }
        }
        
        return resultQueue;
    }
}

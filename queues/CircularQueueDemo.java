package dsa.queues;

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.enqueue(1);
        cq.enqueue(2);
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
    }
}

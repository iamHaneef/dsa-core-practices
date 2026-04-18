package dsa.queues;

public class QueueDemo {
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation();
        q.enqueue(5);
        q.enqueue(10);
        q.peek();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}

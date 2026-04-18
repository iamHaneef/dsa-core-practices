package DataStructure.Circular_queue;

import DataStructure.Queue.Queue;

public class Demo_queue {

    public static void main(String[] args)
    {
        Queues queue = new Queues();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        //queue.enqueue(60);

        queue.dequeue();
        //queue.enqueue(70);

       // queue.peek();

    }

}

package DataStructure.Circular_queue;

public class Queues {

    int rear = -1;
    int front = 0;

    int size=0;

    int max_size = 5;
    int[] queue = new int[max_size];


    public void enqueue(int val)
    {
        if(size == max_size)
        {
            System.out.println("queue is full");
        }
        else
        {
            rear = (rear+1) % max_size;
            queue[rear] = val;
            size++;
            System.out.println(val + " is added ");
        }
    }

    public void dequeue()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty ");
        }
        else {
            System.out.println(queue[front] + " is removed");
            front = (front+1) % max_size;

            size--;
        }
    }

    public void peek()
    {
        if(size == 0)
        {
            System.out.println("Queue is empty ");
        }
        else
        {
            System.out.println(queue[front] + " is peek element");
        }
    }

}

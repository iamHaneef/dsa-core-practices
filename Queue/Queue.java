package DataStructure.Queue;

public class Queue {

    int front = 0;
    int rear = -1;

    int size = 0;

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
            rear++;
            queue[rear] = val;
            System.out.println(val + " is added");

            size++;

        }
    }

    public void dequeue()
    {
        if(size == 0 )
        {
            System.out.println("queue is empty");

        }
        else {

                System.out.println(queue[front] + " is removed");
                front++;

                size--;

        }
    }

    public void peek()
    {
        if(size == 0)
        {
            System.out.println("queue is empty");
        }
        else {
            System.out.println("peek element is : " + queue[front]);

        }
    }

}

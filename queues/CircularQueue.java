package dsa.queues;

public class CircularQueue {
    int size = 5;
    int[] queue = new int[size];
    int front = -1;
    int rear = -1;

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front = 0;
            rear = (rear + 1) % size;
            queue[rear] = data;
            System.out.println(data + " is added");
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue[front] + " is removed");
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
    }
}

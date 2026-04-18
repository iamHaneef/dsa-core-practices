package dsa.stacks;

public class StackImplementation {
    int top = -1;
    int size = 5;
    int[] stack = new int[size];

    public void push(int val) {
        if (top >= size - 1) {
            System.out.println("stack is full");
        } else {
            top++;
            stack[top] = val;
            System.out.println(val + " is Pushed");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            int temp = stack[top];
            top--;
            System.out.println(temp + " is popped");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println(stack[top] + " is peek element");
        }
    }
}

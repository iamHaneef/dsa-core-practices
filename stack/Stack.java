package DataStructure.Stack;

public class Stack {

    int top = -1;
    int size = 5;
    int[] stack = new int[size];

    // push operation

    public void push(int val)
    {
        if(top >= size)
        {
            System.out.println("stack is full");
        }
        else
        {
            top++;
            stack[top] = val;
            System.out.println(val + " is Pushed");
        }
    }

    // pop operation
    public void pop()
    {
        if(top == -1)
        {
            System.out.println("stack is empty");
        }
        else {
            int temp = stack[top];
            top--;
            System.out.println(temp + " is poped");
        }
    }

    //peek
    public void peek()
    {
        if(top == -1)
        {
            System.out.println("stack is empty");
        }
        else {
            System.out.println(stack[top] + " is peek element");
        }
    }

}

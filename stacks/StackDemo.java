package dsa.stacks;

public class StackDemo {
    public static void main(String[] args) {
        StackImplementation s = new StackImplementation();
        s.push(10);
        s.push(20);
        s.peek();
        s.pop();
        s.pop();
        s.pop();
    }
}

package core_java;

public class CallByValue {
    int data = 50;

    void change(int data) {
        data = data + 100; // change in local variable
    }

    public static void main(String args[]) {
        CallByValue op = new CallByValue();

        System.out.println("before change " + op.data);
        op.change(500);
        System.out.println("after change " + op.data);
    }
}

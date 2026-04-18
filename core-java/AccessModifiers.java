package core_java;

class Bank {
    public String name;
    private int amount;
    protected int age;

    public Bank(String name, int amount, int age) {
        this.name = name;
        this.amount = amount;
        this.age = age;
    }

    public int getAmount() {
        return amount;
    }

    public int getAge() {
        return age;
    }
}

class Second extends Bank {
    public Second(String name, int amount, int age) {
        super(name, amount, age);
    }

    void display() {
        System.out.println("protected age : " + age);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Bank b1 = new Bank("haneef", 1000, 21);
        System.out.println("Public name: " + b1.name);

        // Private access via getter
        System.out.println("Private amount (via getter): " + b1.getAmount());

        // Protected access via getter
        System.out.println("Protected age (via getter): " + b1.getAge());

        // Protected access via subclass
        Second s = new Second("Ali ", 20000, 30);
        s.display();
    }
}

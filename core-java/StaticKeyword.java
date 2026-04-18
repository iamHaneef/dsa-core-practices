package core_java;

class Student {
    int id;
    String name;
    static String college = "GCT"; // static variable

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class StaticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Haneef");
        Student s2 = new Student(222, "Ali");

        s1.display();
        s2.display();
    }
}

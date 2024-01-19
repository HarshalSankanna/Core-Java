class Person {
    void message() {
        System.out.println("I am in person class");
    }
}

class Student extends Person {
    void message() {
        System.out.println("I am in student class");
    }

    void Display() {
        message();
        super.message();
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Student s = new Student();
        s.Display();
    }
}

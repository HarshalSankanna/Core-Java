class Person {
    Person() {
        System.out.println("This is person class constructor");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("This Student class Constructor");
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class A {
    void showA() {
        System.out.println("From class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("From class B");
    }
}

class C extends A {
    void showC() {
        System.out.println("From class C");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.showA();
        obj1.showB();
        C obj2 = new C();
        obj2.showA();
        obj2.showC();
    }
}
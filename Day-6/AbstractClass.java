abstract class Test {
    abstract void m1();

    abstract void m2();

    abstract void m3();

    void m4() {
        System.out.println("m4 non-abstract method");
    }
}

public class AbstractClass extends Test {
    void m1() {
        System.out.println("m1 abstract class");
    }

    void m2() {
        System.out.println("m2 abstract class");
    }

    void m3() {
        System.out.println("m3 abstract class");
    }

    public static void main(String[] args) {
        AbstractClass aC = new AbstractClass();
        aC.m1();
        aC.m2();
        aC.m3();
        aC.m4();

        Test t = new AbstractClass();
        t.m1();
        t.m2();
        t.m3();
        t.m4();
    }
}

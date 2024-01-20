interface I1 {
    void m3();

    default void m2() {
        System.out.println("Default method");
    }

    static void m1() {
        System.out.println("Static method");
    }
}

public class StaticMethod implements I1 {
    public void m3() {
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        StaticMethod sM = new StaticMethod();
        sM.m3();
        sM.m2();
        I1.m1();
    }
}

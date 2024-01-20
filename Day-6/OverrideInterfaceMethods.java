interface I1 {
    default void m1() {
        System.out.println("m1 method");
    }
}

public class OverrideInterfaceMethods implements I1 {
    public void m1() {
        System.out.println("overriden m1 method from main class");
    }

    public static void main(String[] args) {
        OverrideInterfaceMethods O = new OverrideInterfaceMethods();
        O.m1();
    }
}

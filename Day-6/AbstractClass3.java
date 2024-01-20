abstract class Test {
    Test() {
        System.out.println("Abstract class constructor");
    }
}

public class AbstractClass3 extends Test {
    AbstractClass3() {
        System.out.println("Normal class constructor");
    }

    public static void main(String[] args) {
        new AbstractClass3();
    }
}

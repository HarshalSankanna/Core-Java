class FinalMethod {
    final void demo() {
        System.out.println("Final class method");
    }
}

public class Final2 extends FinalMethod {
    // void demo() {
    // System.out.println("ABC class method");
    // }

    public static void main(String[] args) {
        Final2 f = new Final2();
        f.demo();
    }
}
public class Static1 {
    // static variable
    static int num = staticMethod();

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int staticMethod() {
        System.out.println("from staticMethod");
        return 40;
    }

    // static main method
    public static void main(String[] args) {
        System.out.println("num: " + num);
        System.out.println("from main");
    }
}

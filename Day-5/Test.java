public class Test {
    Test() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Test();
        System.gc();
        StringBuffer s1 = new StringBuffer("Mohit");
        StringBuffer s2 = new StringBuffer("Rajat");
        s1 = s2;
        System.out.println(s1);
        System.out.println(s2);
        // mohit will be eligible for garbage collection
    }
}

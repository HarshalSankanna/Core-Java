public class Overloading {

    public void add(int a) {
        System.out.println(a + a);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Overloading O = new Overloading();
        O.add(7);
        O.add(7, 9);
        O.add(7, 9, 21);
    }
}

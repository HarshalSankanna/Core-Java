public class VarArgs2 {
    void m1(int... a) {
        System.out.println("Variable argument: " + a);
    }

    void m1(int a) {
        System.out.println("Normal arguments: " + a);
    }

    public static void main(String[] args) {
        VarArgs2 V = new VarArgs2();
        V.m1(10);
    }
}

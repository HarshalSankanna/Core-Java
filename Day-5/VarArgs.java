public class VarArgs {
    void m1(char ch, int... a) {
        System.out.print(ch);
        for (int i : a) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarArgs A = new VarArgs();
        A.m1('A');
        A.m1('B', 10);
        A.m1('C', 10, 20);
        A.m1('D', 10, 20, 30, 40);
    }
}

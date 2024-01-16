public class Question1 {
    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 10; a < b; a++, b--) {
            if (a == 3) {
                continue;
            }
            System.out.print(a + " " + b);
            System.out.println();
        }
    }
}

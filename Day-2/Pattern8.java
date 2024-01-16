public class Pattern8 {
    public static void main(String[] args) {
        int sp = 0;
        for (int i = 1; i <= 7; i = i + 2) {
            for (int j = 3; j >= sp; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            sp++;
        }
    }
}

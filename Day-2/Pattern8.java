public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j += 2) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

public class Pattern7 {
    public static void main(String[] args) {
        int space = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            space++;
            System.out.println();
        }
    }
}

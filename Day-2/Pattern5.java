public class Pattern5 {
    public static void main(String[] args) {
        int space = 3;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }
}

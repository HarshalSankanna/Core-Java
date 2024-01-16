public class Pattern3 {
    public static void main(String[] args) {
        int n = 1;
        int sum;
        for (int i = 1; i <= 4; i++) {
            sum = 0;
            for (int j = 1; j <= 4; j++) {
                System.out.print(n + " ");
                sum = sum + n;
                n++;
            }
            System.out.print(" ---> " + sum);
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        System.out.print("Enter value of X: ");
        int X = sc.nextInt();
        double sum = 1;
        int j, factorial;
        for (int i = 1; i <= n; i++) {
            j = i;
            factorial = 1;
            while (j > 1 && j != 0) {
                factorial = factorial * j;
                j--;
            }
            sum = sum + (Math.pow(X, i)) / factorial;
        }
        System.out.println(sum);
    }
}

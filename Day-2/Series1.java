import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        System.out.print("Enter value of X: ");
        int X = sc.nextInt();
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + (Math.pow(X, i)) / i;
        }
        System.out.println(sum);
    }
}

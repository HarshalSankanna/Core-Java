import java.util.Scanner;

public class MulWIthoutStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int product = 0;
        for (int i = 0; i < b; i++) {
            product = product + a;
        }
        System.out.println("The product is: " + product);
    }
}

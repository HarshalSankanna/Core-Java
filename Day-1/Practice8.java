import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        int price = sc.nextInt();
        System.out.print("Are you a student? answer in \"yes\" or \"no\": ");
        String user = sc.next();
        if (user.equals("yes")) {
            if (price >= 500) {
                double discountPercentage = 10;
                int newPrice = (int) (price - (discountPercentage / 100) * price);
                System.out.println("New price: " + newPrice);
            } else {
                double discountPercentage = 5;
                int newPrice = (int) (price - (discountPercentage / 100) * price);
                System.out.println("New price: " + newPrice);
            }
        } else {
            if (price >= 500) {
                double discountPercentage = 8;
                int newPrice = (int) (price - (discountPercentage / 100) * price);
                System.out.println("New price: " + newPrice);
            } else {
                double discountPercentage = 2;
                int newPrice = (int) (price - (discountPercentage / 100) * price);
                System.out.println("New price: " + newPrice);
            }
        }
    }
}

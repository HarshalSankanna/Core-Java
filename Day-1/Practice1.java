import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of paper 1: ");
        int p1 = sc.nextInt();
        System.out.print("Enter marks of paper 2: ");
        int p2 = sc.nextInt();
        System.out.print("Enter marks of paper 3: ");
        int p3 = sc.nextInt();
        if (p1 < 45 || p2 < 45 || p3 < 45) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Result: Pass");
        }
    }
}

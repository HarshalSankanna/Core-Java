import java.util.Scanner;

class Num {
    int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

    int power(int b, int e) {
        int ans = 1;
        for (int i = 1; i <= e; i++) {
            ans = ans * b;
        }
        return ans;
    }
}

public class MenuMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int e = 4;
        Num n1 = new Num();
        int ch = 0;
        while (true) {
            System.out.println();
            System.out.println("Enter 1 for factorial");
            System.out.println("Enter 2 for power");
            System.out.println("Enter 3 to exit");
            System.out.print("Select any choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println();
                    System.out.println("Answer: " + n1.factorial(n));
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Answer: " + n1.power(n, e));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
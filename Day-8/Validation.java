import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userNames[] = {
                "harshal",
                "anirudh",
                "rohan",
                "viraj",
                "raman"
        };

        String passwords[] = {
                "1234567",
                "123456",
                "12345",
                "654321",
                "45678"
        };

        boolean flag = false;

        System.out.print("Enter your name: ");
        String name = sc.next();
        for (int i = 0; i < userNames.length; i++) {
            if (name.equals(userNames[i])) {
                flag = true;
                System.out.print("Enter password: ");
                String password = sc.next();
                boolean passwordMatched = false;
                for (int j = 0; j < passwords.length; j++) {
                    if (password.equals(passwords[j])) {
                        passwordMatched = true;
                        System.out.println("Validation successful!");
                        break;
                    }
                }
                if (!passwordMatched) {
                    System.out.println("Incorrect password");
                }
                break;
            }
        }
        if (!flag) {
            System.out.println("Invalid username");
        }
    }
}

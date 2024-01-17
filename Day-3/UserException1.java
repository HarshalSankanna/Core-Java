import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        System.out.println(str);
    }
}

class UserException1 {
    static void status(int age) throws InvalidAgeException {
        if (age > 18) {
            System.out.println("Eligible for marriage");
        } else {
            throw new InvalidAgeException("Not able to marry try after some time");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        UserException1.status(age);
    }
}

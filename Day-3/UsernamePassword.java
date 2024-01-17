import java.util.Scanner;

class InvalidUsernamePasswordException extends Exception {
    public InvalidUsernamePasswordException() {
        System.out.println("Invalid username or password");
    }
}

public class UsernamePassword {
    public static void main(String[] args) throws InvalidUsernamePasswordException {
        String userName = "Harshal";
        String password = "21903";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String nameInput = sc.next();
        System.out.print("Enter password: ");
        String passInput = sc.next();
        if (userName.equals(nameInput) && password.equals(passInput)) {
            System.out.println("Authentication completed!");
        } else {
            throw new InvalidUsernamePasswordException();
        }
    }
}

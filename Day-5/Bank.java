import java.util.Scanner;

class BankAccount {
    int accNo;
    String cName;
    String cCity;
    long balance;
    long depositAmt;
    Scanner sc = new Scanner(System.in);

    public BankAccount() {
        balance = 1000;
    }

    public void inputData() {
        System.out.print("Enter your name: ");
        cName = sc.nextLine();
        System.out.print("Enter your city: ");
        cCity = sc.nextLine();
        accNo++;
    }

    public void display() {
        System.out.println("Account number: " + accNo);
        System.out.println("Name: " + cName);
        System.out.println("City: " + cCity);
        System.out.println("Funds: " + balance);
    }

    public void deposit() {
        System.out.print("Enter amount: ");
        depositAmt = sc.nextInt();
        balance = balance + depositAmt;
        System.out.println("Deposit successful!");
        System.out.println("Current amount: " + balance);
    }

    public void withdraw(long amt) {
        if (amt > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance = balance - amt;
            System.out.println("Amount withdrawed successfully!");
            System.out.println("Current amount: " + balance);
        }
    }
}

class SavingsAccount extends BankAccount {
    public void withdraw(long amt) {
        if (balance - amt < 1000) {
            System.out.println("Insufficient funds");
        } else {
            balance = balance - amt;
            System.out.println("Amount withdrawed successfully!");
            System.out.println("Current amount: " + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        BankAccount B = new BankAccount();
        SavingsAccount S = new SavingsAccount();
        int accType = 0;
        long withdrawAmt = 0;
        while (true) {
            System.out.println();
            System.out.println("Enter 1 to create normal account");
            System.out.println("Enter 2 to create savings account");
            System.out.println("Enter 3 to check balance");
            System.out.println("Enter 4 to deposit funds");
            System.out.println("Enter 5 to withdraw funds");
            System.out.println("Enter 6 to exit");
            System.out.println();
            System.out.print("Select option: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    B.inputData();
                    accType = 1;
                    break;
                case 2:
                    S.inputData();
                    accType = 2;
                    break;
                case 3:
                    if (accType == 1) {
                        B.display();
                    } else if (accType == 2) {
                        S.display();
                    } else {
                        System.out.println("Create an account first");
                    }
                    break;
                case 4:
                    if (accType == 1) {
                        B.deposit();
                    } else if (accType == 2) {
                        S.deposit();
                    } else {
                        System.out.println("Create an account first");
                    }
                    break;
                case 5:
                    System.out.print("Enter amount to withdraw: ");
                    withdrawAmt = sc.nextInt();
                    if (accType == 1) {
                        B.withdraw(withdrawAmt);
                    } else if (accType == 2) {
                        S.withdraw(withdrawAmt);
                    } else {
                        System.out.println("Create an account first");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

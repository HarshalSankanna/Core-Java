import java.util.Scanner;

interface RBI {
    void calculateInterest();

    double minSavingRate = 4.0;
    double minCurrentRate = 4.0;
}

abstract class BankAccount {
    static long accno;
    static double balance;
    static String name, city;
    static char accType;
    static Scanner sc = new Scanner(System.in);

    public BankAccount() {
        balance = 1000.0;
    }

    public static void inputData() {
        System.out.println("Enter Details");
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter City: ");
        city = sc.next();
        System.out.print("Enter Account number: ");
        accno = sc.nextLong();
        System.out.println("Enter Account type(s/c): ");
        accType = sc.next().charAt(0);
        System.out.println("Your initial balance is: " + balance + "\n");
    }

    public void display() {
        System.out.println("\nName: " + name + "\nAccount number: " + accno + "\nCity: " + city + "\nBalance: "
                + balance + "\nType: " + accType + "\n");
    }

    public abstract void deposit();

    public abstract void withdraw();
}

class SavingsAccount extends BankAccount {
    static Scanner sc = new Scanner(System.in);
    double rate = 4.0;

    public void deposit() {
        System.out.println("Enter amount to be deposited: ");
        double amt = 0;
        amt = sc.nextDouble();
        balance += amt;
        System.out.println("Your balance is: " + balance + "\n");
    }

    public void withdraw() {
        if (balance <= 1000) {
            System.out.println("Your balance is below 1000. Cant withdraw now.");
        } else {
            System.out.println("Enter amount to be withdrawn: ");
            double wdraw = sc.nextDouble();
            balance -= wdraw;
            System.out.println("Your balance is: " + balance);
        }
    }
}

class Interest1 extends SavingsAccount implements RBI {
    public void calculateInterest() {
        if (super.rate >= minSavingRate)
            System.out.println("Your interest is: " + ((super.rate * balance) / 100));
        else
            System.out.println("Must maintain minimum rate");
    }
}

class CurrentAccount extends BankAccount {
    double rate = 2.0;
    static Scanner sc = new Scanner(System.in);

    public void deposit() {
        System.out.println("Enter amount to be deposited: ");
        double amt = 0;
        amt = sc.nextDouble();
        balance += amt;
        System.out.println("Your balance is: " + balance + "\n");
    }

    public void withdraw() {
        System.out.println("Enter amount to be withdrawn: ");
        double wdraw = sc.nextDouble();
        balance -= wdraw;
        System.out.println("Your balance is: " + balance);
    }
}

class Interest2 extends CurrentAccount implements RBI {
    public void calculateInterest() {
        if (super.rate >= minCurrentRate)
            System.out.println("Your interest is: " + ((super.rate * balance) / 100));
        else
            System.out.println("Must maintain minimum rate");
    }
}

class Banking3 {
    static SavingsAccount ob = new SavingsAccount();
    static CurrentAccount ob2 = new CurrentAccount();
    static Interest1 t1 = new Interest1();
    static Interest2 t2 = new Interest2();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print(
                    "1. Input data\n2. Display data\n3. Deposit\n4. Withdraw\n5. View Interest\n6. Exit\nEnter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ob.inputData();
                    break;
                case 2:
                    ob.display();
                    break;
                case 3:
                    if (ob.accType == 's')
                        ob.deposit();
                    else
                        ob2.deposit();
                    break;
                case 4:
                    if (ob.accType == 's')
                        ob.withdraw();
                    else
                        ob2.withdraw();
                    break;
                case 5:
                    if (ob.accType == 's')
                        t1.calculateInterest();
                    else
                        t2.calculateInterest();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
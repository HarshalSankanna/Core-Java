import java.util.Scanner;

class Student {

    Scanner sc = new Scanner(System.in);
    int rollNo[] = new int[10];
    String name[] = new String[10];
    String city[] = new String[10];
    String mob[] = new String[10];
    int i = 0;
    int stuRno = 0;
    int option = 0;

    public void input() {
        System.out.println();
        System.out.print("Enter roll number: ");
        rollNo[i] = sc.nextInt();
        System.out.print("Enter your name: ");
        name[i] = sc.next();
        System.out.print("City: ");
        city[i] = sc.next();
        System.out.print("Mobile number: ");
        mob[i] = sc.next();
        i++;
    }

    public void showInfo() {
        System.out.println();
        System.out.println("Roll no\t\tName\t\tCity\t\tMobile number");
        for (int j = 0; j < i; j++) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println(rollNo[j] + "\t\t" + name[j] + "\t\t" + city[j] + "\t\t" + mob[j]);
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public void delete() {
        System.out.print("Enter your roll no: ");
        stuRno = sc.nextInt();
        for (int j = 0; j < rollNo.length; j++) {
            if (stuRno == rollNo[j]) {
                for (int k = j; k < i; k++) {
                    rollNo[j] = rollNo[j + 1];
                    name[j] = name[j + 1];
                    city[j] = city[j + 1];
                    mob[j] = mob[j + 1];
                }
                --i;
            }
        }

    }

    public void update() {
        System.out.println();
        System.out.print("Enter your roll no: ");
        stuRno = sc.nextInt();
        for (int j = 0; j < rollNo.length; j++) {
            if (stuRno == rollNo[j]) {
                System.out.println("Enter 1 for name");
                System.out.println("Enter 2 for city");
                System.out.println("Enter 3 for mobile number");
                System.out.println();
                System.out.print("Select a choice to update: ");
                option = sc.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String sname = sc.next();
                        name[j] = sname;
                        System.out.println("Data updated!");
                        break;
                    case 2:
                        System.out.print("Enter new city: ");
                        String scity = sc.next();
                        city[j] = scity;
                        System.out.println("Data updated!");
                        break;
                    case 3:
                        System.out.print("Enter new mobile number: ");
                        String smob = sc.next();
                        mob[j] = smob;
                        System.out.println("Data updated!");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}

public class Crud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int ch = 0;
        while (true) {
            System.out.println();
            System.out.println("Enter 1 for data input");
            System.out.println("Enter 2 to see info");
            System.out.println("Enter 3 to delete a student");
            System.out.println("Enter 4 to update info");
            System.out.println("Enter 5 to exit");
            System.out.println();
            System.out.print("Select a choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    s.input();
                    break;
                case 2:
                    s.showInfo();
                    break;
                case 3:
                    s.delete();
                    break;
                case 4:
                    s.update();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
class Employee {
    int eno;
    String ename;
    String esal;
    String city;

    public Employee(int eno, String ename, String esal, String city) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.city = city;
    }

    public Employee() {
    }

    void work() {
        System.out.println(ename + " is working");
    }

    void getSalary() {
        System.out.println("Salary: " + esal);
    }

    void addEmployee() {
        System.out.println("Employee added: " + ename);
    }
}

class HRManager extends Employee {

    public HRManager(int no, String name, String sal, String city) {
        super(no, name, sal, city);
    }

    public HRManager() {

    }

    void work() {
        System.out.println("HR is working");
    }

    void showEmployee() {
        System.out.println("Employee number: " + eno);
        System.out.println("Employee name: " + ename);
        System.out.println("Employee salary: " + esal);
        System.out.println("Employee city: " + city);
    }
}

public class OverrideQ {
    public static void main(String[] args) {
        HRManager HR = new HRManager(1, "Harshal", "1000000", "Pune");
        HR.work();
        HR.showEmployee();
    }
}

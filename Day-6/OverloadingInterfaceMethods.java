interface It1 {
    double m1(int a, String str);

    int m1(char ch);
}

public class OverloadingInterfaceMethods implements It1 {
    public double m1(int a, String str) {
        System.out.println("m1 2-arguments method");
        return 22.2;
    }

    public int m1(char ch) {
        System.out.println("m1 1-argument method");
        return 40;
    }

    public static void main(String[] args) {
        OverloadingInterfaceMethods O = new OverloadingInterfaceMethods();
        double d = O.m1(10, "Hello");
        System.out.println("Value = " + d);
        int i = O.m1('H');
        System.out.println("Value = " + i);
    }
}

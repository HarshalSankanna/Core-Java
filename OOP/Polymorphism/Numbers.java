public class Numbers {
    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, double b) {
        return a + b + b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(6, 3));
    }
}

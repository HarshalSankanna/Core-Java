public class PowerFour {
    public static void main(String[] args) {
        int n = 625;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (Math.pow(i, 4) == n) {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
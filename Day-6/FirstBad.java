public class FirstBad {
    public static void main(String[] args) {
        int n = 5;
        int bad = 4;
        for (int i = 1; i <= n; i += 2) {
            if (isBadVersion(i) && i != bad) {
                if (isBadVersion(i - 1)) {
                    System.out.println(i - 1);
                    System.exit(0);
                }
            } else if (isBadVersion(i)) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }

    static public boolean isBadVersion(int n) {
        int bad = 4;
        if (n >= bad) {
            return true;
        } else {
            return false;
        }

    }
}

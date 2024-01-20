public class FirstBad {
    public static void main(String[] args) {
        int n = 5;
        int bad = 4;
        for (int i = 1; i <= n; i++) {
            System.out.println(isBadVersion(i, bad));
        }
    }

    static public boolean isBadVersion(int n, int bad) {
        if (n >= bad) {
            return true;
        } else {
            return false;
        }

    }
}

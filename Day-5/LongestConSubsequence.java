import java.util.Arrays;

public class LongestConSubsequence {
    public static void main(String[] args) {
        int a[] = { 1, 9, 3, 1, 0, 4, 20, 2 };
        int count = 1;
        int max = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] == 1) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 1;
            }
        }
        System.out.println(max);
    }
}

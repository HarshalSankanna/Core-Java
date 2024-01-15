import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a;

            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(Arrays.toString(arr));
    }
}
import java.util.Arrays;

public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        int oN = n;
        int num1 = n % 10;
        n = n / 10;
        int num2 = n % 10;
        n = n / 10;
        int num3 = n % 10;
        int arr[] = { num1, num2, num3 };
        System.out.println(Arrays.toString(arr));
        int fact;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            fact = 1;
            for (int j = 1; j <= arr[i]; j++) {
                fact = fact * j;

            }
            sum = sum + fact;
        }
        System.out.println(sum);
        if (sum == oN) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

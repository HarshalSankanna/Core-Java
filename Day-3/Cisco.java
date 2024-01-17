public class Cisco {
    public static void main(String[] args) {
        int N = 10;
        int arr[] = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
        int sumOfN = (N * (N + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sumOfN - sum);
    }
}
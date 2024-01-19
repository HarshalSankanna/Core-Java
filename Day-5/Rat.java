public class Rat {
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int arr[] = { 2, 8, 3, 5, 7, 4, 1, 2 };
        int sum = 0;
        int count = 0;
        if (arr.length == 0) {
            System.out.println("-1");
            System.exit(0);
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count++;
            if (sum >= r * unit) {
                break;
            }
        }
        System.out.println(count);

    }
}

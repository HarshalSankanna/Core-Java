public class Armstrong2 {
    public static void main(String[] args) {
        int count = 0;
        int number, originalNumber, digits, sum;
        for (int i = 1; i <= 5000; i++) {
            number = i;
            originalNumber = number;
            sum = 0;
            digits = 0;
            while (number != 0) {
                number = number / 10;
                digits++;
            }
            number = originalNumber;
            while (number != 0) {
                int rem = number % 10;
                number = number / 10;
                sum = (int) (sum + Math.pow((double) rem, (double) digits));
            }
            if (sum == originalNumber) {
                System.out.println(sum);
                count++;
            }
        }
        System.out.println("The number of armstrong numbers from 1 to 5000 = " + count);
    }
}

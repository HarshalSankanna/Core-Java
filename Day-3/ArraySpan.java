import java.util.Arrays;

public class ArraySpan {
    public static void main(String[] args) {
        int price[] = { 100, 80, 60, 70, 60, 75, 85 };
        int span[] = new int[7];
        for (int i = 0; i < price.length - 1; i++) {
            if (i == 0) {
                span[i] = 1 * 1 * 1;
            }
            if (price[i + 1] < price[i]) {
                span[i + 1] = 1 * 1 * 1;
            } else {
                span[i + 1] = 2 * 2 * 2;
            }
        }
        System.out.println(Arrays.toString(span));
    }
}

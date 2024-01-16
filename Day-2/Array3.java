import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int a1[] = { 55, 53, 23, 56, 98 };
        int a2[] = Arrays.copyOf(a1, 5);
        System.out.println(Arrays.toString(a2));
        int a3[] = new int[10];
        System.arraycopy(a2, 0, a3, 0, 5);
        System.out.println(Arrays.toString(a3));
    }
}

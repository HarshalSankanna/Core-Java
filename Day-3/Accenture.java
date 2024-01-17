import java.util.Arrays;

public class Accenture {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        byte b1[] = new byte[s1.length()];
        byte b2[] = new byte[s1.length()];
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                b1[i] = (byte) s1.toLowerCase().charAt(i);
                b2[i] = (byte) s2.toLowerCase().charAt(i);
            }
            Sort(b1, b1.length);
            Sort(b2, b2.length);
            if (Arrays.equals(b1, b2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }

    static void Sort(byte arr[], int n) {
        byte i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
}

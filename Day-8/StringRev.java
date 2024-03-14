import java.util.Arrays;

public class StringRev {
    public static void main(String[] args) {
        String str = "learning java is very easy from ashish sir";
        String arrString[] = str.split(" ");
        System.out.println(Arrays.toString(arrString));
        String res = "";
        // for (int i = arrString.length - 1; i >= 0; i--) {
        // res = res + arrString[i] + " ";
        // }
        for (int i = 0; i < arrString.length; i++) {
            res = arrString[i] + " " + res;
        }
        System.out.println(res);
    }
}

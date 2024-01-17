public class Fanny {
    public static void main(String[] args) {
        String str = "Welcome to meitt";
        String ans = "";
        char ch = 'i';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}

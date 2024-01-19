public class StringMath {
    public static void main(String[] args) {
        String s = "abbccccc";
        int count = 1;
        String str = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                str += s.charAt(i);
                if (count > 1) {
                    str += count;
                }
                count = 1;
            }
        }
        str += s.charAt(s.length() - 1);
        if (count > 1) {
            str += count;
        }
        System.out.println(str);
    }
}
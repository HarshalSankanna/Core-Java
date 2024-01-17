public class PyStringCalc {
    public static void main(String[] args) {
        String str1 = "ycce";
        String str2 = "yctce";
        int operations = 0, count = 0;
        if (str1.length() < str2.length()) {
            operations = str2.length() - str1.length();
        } else if (str1.length() > str2.length()) {
            operations = str1.length() - str2.length();
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    count++;
                }
            }
            operations = count;
        }
        System.out.println(operations);
    }
}

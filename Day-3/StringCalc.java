public class StringCalc {
    public static void main(String[] args) {
        String str1 = "acce";
        String str2 = "actryce";
        int count = 0;
        int operations = 0;
        boolean isSame = false;
        if (str1.equals(str2)) {
            isSame = false;
        }
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    count++;
                }
            }
            operations = count;
        } else {
            count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    count++;
                } else if (str1.charAt(i) != str2.charAt(i)) {
                    for (int j = i + 1; j < str2.length(); j++) {
                        if (str1.charAt(i) == str2.charAt(j)) {
                            count++;
                            break;
                        }
                    }
                }
            }

            operations = str2.length() - count;
        }
        if (!isSame) {
            System.out.println(operations);
        }
    }
}

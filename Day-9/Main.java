public class Main {
    public static void main(String[] args) {
        System.out.println(reduceString("aabbbbeeeeffggg")); // Output: a2b4e4f2g3
        System.out.println(reduceString("abbccccc")); // Output: ab2c5
    }

    public static String reduceString(String input) {
        StringBuilder result = new StringBuilder();

        char prev = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == prev) {
                count++;
            } else {
                result.append(prev);
                if (count > 1) {
                    result.append(count);
                }
                prev = current;
                count = 1;
            }
        }

        result.append(prev);
        if (count > 1) {
            result.append(count);
        }

        return result.toString();
    }
}

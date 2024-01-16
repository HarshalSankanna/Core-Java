public class Array2 {
    public static void main(String[] args) {
        String[] str = { "Ashish", "Prashant", "Sandip", "Ashish", "Rahul", "Manoj", "Prashant" };
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]) && i != j) {
                    System.out.println("Duplicate string: " + str[i]);
                }
            }
        }
    }
}
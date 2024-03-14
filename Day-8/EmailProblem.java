public class EmailProblem {
    public static void main(String[] args) {
        String arr[] = {
                "rajsingh@gmail.com",
                "test@gmail.com",
                "rajkumar@gmail.com",
                "harshal@gmail.com",
                "rohan@gmail.com"
        };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith("raj")) {
                System.out.println(arr[i]);
            }
        }
    }
}

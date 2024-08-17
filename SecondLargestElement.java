class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = { 6, 4, 1, 7, 12, 9, 34 };
        int secondLargest = findSecondLargest(nums);
        System.out.println("Second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array length should be more than 1");
            System.exit(0);
        }
        int firstMax = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("All the elements in the array are same");
            System.exit(0);
        }

        return secondMax;
    }
}
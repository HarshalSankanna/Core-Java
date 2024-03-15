public class Main1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 2;
        int[] rotatedArray = rotateArray(nums, k);
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        return rotated;
    }
}

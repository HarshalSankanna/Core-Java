import java.util.Arrays;

public class DiffArray {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3 };
        int nums2[] = { 2, 4, 6 };
        int ans[][] = new int[2][nums1.length];
        ans[0] = distinct(nums1, nums2);
        ans[1] = distinct(nums2, nums1);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[] distinct(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length];
        int flag = 0;
        int arrCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            flag = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag++;
                }
            }
            if (flag == 0) {
                ans[arrCount] = arr1[i];
                arrCount++;
            }
        }
        int finalArr[] = new int[arrCount];
        arrCount = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != 0) {
                finalArr[arrCount] = ans[i];
                arrCount++;
            }
        }
        return finalArr;
    }
}

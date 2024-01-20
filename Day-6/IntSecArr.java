import java.util.Arrays;

public class IntSecArr {
    public static void main(String[] args) {
        // int nums1[] = { 1, 2, 2, 1 };
        // int nums2[] = { 2, 2 };
        int nums1[] = { 4, 9, 5 };
        int nums2[] = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(distinct(nums1, nums2)));
    }

    static int[] distinct(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length];
        int flag = 1;
        int arrCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            flag = 1;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = 0;
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

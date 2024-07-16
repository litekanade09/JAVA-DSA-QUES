import java.util.Scanner;

public class triplets {
    public static int triplets(int nums1[], int nums2[], int k) {

        int n = nums1.length, m = nums2.length;
        int ct = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((nums1[i] / (nums2[j] * k)) == 0) {
                    ct++;
                }
            }
        }
        return ct;

    }

    public static void main(String[] args) {
        int nums1[] = {2, 3, 4};
        int nums2[] = {2, 3, 4};
        int k = 1;
        System.out.print(triplets(nums1, nums2, k));
    }
}

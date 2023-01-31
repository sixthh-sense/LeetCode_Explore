package Arrays101;

import java.util.Arrays;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[index];
            index += 1;
        }
        Arrays.sort(nums1);
    }
}

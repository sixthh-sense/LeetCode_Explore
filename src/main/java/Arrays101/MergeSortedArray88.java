package Arrays101;

import java.util.Arrays;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = 0; i < m + n; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[index];
                index += 1;
            }
            if (index == n) { // if i don't put this, runtime error(index) coming
                break;
            }
        }
        Arrays.sort(nums1);
    }
}

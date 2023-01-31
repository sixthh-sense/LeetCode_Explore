package Arrays101;

import java.util.Arrays;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // My solution
//        int index = 0;
//        for (int i = m; i < m + n; i++) {
//            nums1[i] = nums2[index];
//            index += 1;
//        }
//        Arrays.sort(nums1);

        /* LeetCode sample: 0ms submission  */
        int[] result = new int[m+n];
        int i=0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++]; // it starts with 0, after it's increased by 1
            } else {
                result[k++] = nums2[j++];
            }
        }
        while(i < m) {
            result[k++] = nums1[i++];
        }
        while(j < n) {
            result[k++] = nums2[j++];
        }
        for(i = 0; i < m + n; i++)
            nums1[i] = result[i];
    }
}

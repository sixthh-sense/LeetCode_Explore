package Arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArray88Test {

    @Test
    void case1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        test(nums1, m, nums2, n, expected);
    }

    @Test
    void case2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        test(nums1, m, nums2, n, expected);
    }

    @Test
    void case3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        test(nums1, m, nums2, n, expected);
    }

    private void test(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        MergeSortedArray88 merge88 = new MergeSortedArray88();
        merge88.merge(nums1, m, nums2, n);
        assertThat(nums1).usingDefaultElementComparator().isEqualTo(expected);
    }
}
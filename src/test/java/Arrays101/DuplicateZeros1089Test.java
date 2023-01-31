package Arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DuplicateZeros1089Test {

    @Test
    void case1() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        test(arr, expected);
    }

    @Test
    void case2() {
        int[] arr = {1, 2, 3};
        int[] expected = {1, 2, 3};
        test(arr, expected);
    }

    private void test(int[] arr, int[] expected) {
        DuplicateZeros1089 duplicate1089 = new DuplicateZeros1089();
        duplicate1089.duplicateZeros(arr);
        assertThat(arr).usingDefaultElementComparator().isEqualTo(expected);
    }
}
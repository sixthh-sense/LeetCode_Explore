package Arrays101;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquaresOfASortedArray977Test {

    @Test
    void case1() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        test(nums, expected);
    }

    @Test
    void case2() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] expected = {4, 9, 9, 49, 121};
        test(nums, expected);
    }

    private void test(int[] nums, int[] expected) {
        SquaresOfASortedArray977 squares977 = new SquaresOfASortedArray977();
        int[] actual = squares977.sortedSquares(nums);
        assertThat(actual).usingDefaultElementComparator().isEqualTo(expected);
    }
}
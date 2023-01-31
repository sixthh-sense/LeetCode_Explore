package Arrays101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigits1295Test {

    @Test
    void case1() {
        test(new int[]{12, 345, 2, 6, 7896}, 2);
    }

    @Test
    void case2() {
        test(new int[]{555, 901, 482, 1771}, 1);
    }

    private void test(int[] nums, int expected) {
        FindNumbersWithEvenNumberOfDigits1295 find1295 = new FindNumbersWithEvenNumberOfDigits1295();
        int actual = find1295.findNumbers(nums);
        assertEquals(expected, actual);
    }
}
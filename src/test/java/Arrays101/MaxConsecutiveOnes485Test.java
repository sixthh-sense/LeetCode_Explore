package Arrays101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnes485Test {

//    @Test
//    void findMaxConsecutiveOnes() {
//        assertAll(() -> test(new int[]{1, 1, 0, 1, 1, 1}, 3),
//                () -> test(new int[]{1, 0, 1, 1, 0, 1}, 2));
//    }

    @Test
    void case1() {
        test(new int[]{1, 1, 0, 1, 1, 1}, 3);
    }

    @Test
    void case2() {
        test(new int[]{1, 0, 1, 1, 0, 1}, 2);
    }

    private void test(int[] nums, int expected) {
        MaxConsecutiveOnes485 maxConsecutive = new MaxConsecutiveOnes485();
        int actual = maxConsecutive.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);
    }
}
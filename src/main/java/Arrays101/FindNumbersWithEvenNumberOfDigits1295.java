package Arrays101;

// Given an array nums of integers, return how many of them contain an even number of digits.

public class FindNumbersWithEvenNumberOfDigits1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (Integer.toString(num).length() % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
}

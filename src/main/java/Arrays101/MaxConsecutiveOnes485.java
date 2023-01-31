package Arrays101;

// given a binary array nums, return the maximum number of consecutive 1's in the array

public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
           if (nums[i] == 1) {
               count += 1;
               /* Rather than putting this here (in case when the consecutive doesn't end witn aan zero)
               if (i == length -1 && max <= count) {
                   max = count;
               }
               */
           } else {
               if (max <= count) { // It's okay to use max = Math.max(max, count) as well
                   max = count;
               }
               count = 0;
           }
        }
        // It's 1ms faster to put that code outside 'for' loop
        if (max <= count) {
            max = count;
        }
        return max;
    }
}

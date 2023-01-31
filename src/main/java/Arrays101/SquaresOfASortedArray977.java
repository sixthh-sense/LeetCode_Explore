package Arrays101;

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = nums[i] * nums[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}

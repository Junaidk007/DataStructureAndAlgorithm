// Given an array of positive integers nums and a positive integer target, return the minimal 
// length of a subarray whose sum is greater than or equal to target. If there is no such subarray, 
// return 0 instead.

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.


public class Question2 {
    public static int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;

        while(high < nums.length) {
            sum = sum + nums[high];

            while(sum >= target) {
                int currLen = high - low + 1;
                if(currLen < len) len = currLen;
                sum = sum - nums[low++];
            }

            high++;
        }

        if(len == Integer.MAX_VALUE) return 0;

        return len;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}    
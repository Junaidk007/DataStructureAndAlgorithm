// You are given an integer array nums. The absolute sum of a subarray [nums[l], nums[l+1], ..., nums[r-1], nums[r]] is abs(nums[l] + nums[l+1] + ... + nums[r-1] + nums[r]).
// Return the maximum absolute sum of any (possibly empty) subarray of nums.

// Example 1:
// Input: nums = [1,-3,2,3,-4]
// Output: 5
// Explanation: The subarray [2,3] has one of the largest absolute sums |2+3| = 5.

// Example 2:
// Input: nums = [2,-5,1,-4,3,-2]
// Output: 8
// Explanation: The subarray [-5,1,-4] has one of the largest absolute sums |-5+1-4| = 8.


public class Question5 {
    public static int maxAbsoluteSum(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            minEnding = Math.min(nums[i], minEnding + nums[i]);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }

    public static void main(String[] args) {
        int[] nums = {1, -3, 2, 3, -4};
        System.out.println(maxAbsoluteSum(nums));
    }
}

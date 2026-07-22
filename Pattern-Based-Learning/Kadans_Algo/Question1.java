// Given an integer array nums, find the subarray with the largest sum, and return its sum.
// A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Example 2:
// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.

// Example 3:
// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


public class Question1 {
    public static int maxSubArray(int[] nums) {
        int bestEnding = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = bestEnding + nums[i];

            bestEnding = Math.max(v1, v2);
            result = Math.max(result, bestEnding);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}

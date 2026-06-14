// Given an integer array nums of length n and an integer target, find three integers at distinct indices
// in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.


// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

import java.util.Arrays;

public class Question8 {
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int max_diff = Integer.MAX_VALUE;
        int result = 0;

        Arrays.sort(nums);

        for(int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - sum);

                if(diff < max_diff) {
                    max_diff = diff;
                    result = sum;
                }

                if(sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}

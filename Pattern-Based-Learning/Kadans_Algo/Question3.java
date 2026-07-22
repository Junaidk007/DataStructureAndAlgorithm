// Given an integer array nums, find a subarray that has the largest product, and return the product.

// Example 1:
// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.

// Example 2:
// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


public class Question3 {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = maxProd * nums[i];
            int v3 = minProd * nums[i];

            minProd = Math.min(v1, Math.min(v2, v3));
            maxProd = Math.max(v1, Math.max(v3, v2));

            result = Math.max(result, Math.max(maxProd, minProd));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums));
    }
}

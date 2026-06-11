// Given an integer array nums sorted in non-decreasing order, return an array of the 
// squares of each number sorted in non-decreasing order.

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]


public class Question5 {
    public static int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        int[] ans = new int[nums.length];


        while (i <= j) {
            if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
                ans[j-i] = nums[i] * nums[i];
                i++;
            } else {
                ans[j-i] = nums[j] * nums[j];
                j--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        int[] ans = sortedSquares(nums);
        
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

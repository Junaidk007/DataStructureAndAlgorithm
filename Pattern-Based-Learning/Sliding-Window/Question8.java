// Given a binary array nums and an integer k, return the maximum number of 
// consecutive 1's in the array if you can flip at most k 0's.

 

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


public class Question8 {
    public static int longestOnes(int[] nums, int k) {
        int[] freq = new int[2];
        int low = 0;
        int maxLen = 0;

        for(int high = 0; high < nums.length; high++) {
            freq[nums[high]]++;
            int currLen = high - low + 1;

            int diff = currLen - freq[1];

            while(diff > k) {
                freq[nums[low]]--;
                low++;
                currLen = high - low + 1;
                diff = currLen - freq[1];
            }

            if(currLen > maxLen) maxLen = currLen;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}

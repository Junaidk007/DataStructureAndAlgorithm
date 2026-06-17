// Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

// Note: A subarray is a contiguous part of any given array.

// Examples:

// Input: arr[] = [100, 200, 300, 400], k = 2
// Output: 700
// Explanation: arr2 + arr3 = 700, which is maximum.



public class Question1 {
    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low = 0;
        int high = k - 1;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i = low; i <= high; i++) {
            currSum = currSum + arr[i];
            maxSum = currSum;
        }
        
        while(high < arr.length) {
            low++; 
            high++;
            
            if(high == arr.length) break;
            
            currSum = currSum - arr[low - 1] + arr[high];
            
            if(currSum > maxSum) maxSum = currSum;
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println(maxSubarraySum(arr, k));
    }
}

// Given an array arr[] of integers, find the minimum sum of any contiguous subarray.

// Example 1:
// Input: arr[] = [3, -4, 2, -1, -1, 2]
// Output: -5
// Explanation: The contiguous subarray [-4, 2, -1, -1] has minimum sum -5.

// Example 2:
// Input: arr[] = [2, 6, 8, 1, 4]
// Output: 1
// Explanation: The contiguous subarray [1] has minimum sum 1.


public class Question2 {
    public static int smallestSumSubarray(int[] arr) {
        int bestEnding = arr[0];
        int result = arr[0];

        for(int i = 1; i < arr.length; i++) {
            int v1 = arr[i];
            int v2 = bestEnding + arr[i];

            bestEnding = Math.min(v1, v2);
            result = Math.min(result, bestEnding);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -1, -1, 2};
        System.out.println(smallestSumSubarray(arr));
    }
}

// You are given an integer array arr. You can choose at most one element and delete it from the array.
// Return the maximum sum for a non-empty subarray with at most one element deleted.

// Example 1:
// Input: arr = [1,-2,0,3]
// Output: 4
// Explanation: Because we can choose [1, -2, 0, 3] and drop -2, thus the subarray [1, 0, 3] becomes the maximum value.

// Example 2:
// Input: arr = [1,-2,-2,3]
// Output: 3
// Explanation: We just choose [3] and it's the maximum sum.

// Example 3:
// Input: arr = [-1,-1,-1,-1]
// Output: -1
// Explanation: The final subarray needs to be non-empty, so we cannot choose [-1] and delete -1 from it, then get an empty subarray. We have to choose one -1.


public class Question4 {
    public static int maximumSum(int[] arr) {

        int noDelete = arr[0];
        int delete = Integer.MIN_VALUE;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int prevNoDelete = noDelete;
            int prevDelete = delete;

            noDelete = Math.max(prevNoDelete + arr[i], arr[i]);

            if (prevDelete == Integer.MIN_VALUE) {
                delete = prevNoDelete;          // delete current element
            } else {
                delete = Math.max(prevNoDelete, prevDelete + arr[i]);
            }

            res = Math.max(res, Math.max(noDelete, delete));
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 3};
        System.out.println(maximumSum(arr));
    }
}

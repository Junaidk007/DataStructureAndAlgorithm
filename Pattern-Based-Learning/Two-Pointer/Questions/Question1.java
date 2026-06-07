// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
// find two numbers such that they add up to a specific target number. 
// Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
// Return the indices of the two numbers index1 and index2, each incremented by one, 
// as an integer array [index1, index2] of length 2.


// Example 1:

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

public class Question1 {
    public static int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];

        int i = 0;
        int j = numbers.length - 1;     // [2, 7, 11, 15]  
                                        //  ^          ^
                                        //  i          j
        while (i < j) {   // in two pointer where i == j or i cross j we will stop the loop
            if (numbers[i] + numbers[j] == target) {
                ans[0] = ++i;
                ans[1] = ++j;
                break;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int []numbers = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
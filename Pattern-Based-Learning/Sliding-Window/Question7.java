// You are given a string s and an integer k. You can choose any character of the string and change it 
// to any other uppercase English character. You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get after performing the 
// above operations.

 

// Example 1:

// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.



public class Question7 {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int low = 0;
        int maxLen = 1;

        for(int high = 0; high < s.length(); high++) {
            freq[s.charAt(high) - 'A']++;
            int maxCount = maxCount(freq);
            int currLen = high - low + 1;
            int diff = currLen - maxCount;

            while(diff > k) {
                freq[s.charAt(low) - 'A']--;
                low++;
                maxCount = maxCount(freq);
                currLen = high - low + 1;
                diff = currLen - maxCount;
            }

            if(currLen > maxLen) maxLen = currLen;
        }

        return maxLen;
    }

    public static int maxCount(int[] arr) {
        int maxCount = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= maxCount) maxCount = arr[i];
        }

        return maxCount;
    }


    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }
}

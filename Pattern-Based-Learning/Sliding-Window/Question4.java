// Given a string s, find the length of the longest substring without duplicate characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are 
// also correct answers.


import java.util.HashMap;

public class Question4 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int maxLen = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for(int high = 0; high < n; high++) {
            char ch = s.charAt(high);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            int k = high - low + 1;

            while(freq.size() < k) {
                char lch = s.charAt(low++);
                freq.put(lch, freq.get(lch) - 1);
                if(freq.get(lch) == 0) freq.remove(lch);
                k = high - low + 1;
            }

            if(maxLen < k) maxLen = k;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
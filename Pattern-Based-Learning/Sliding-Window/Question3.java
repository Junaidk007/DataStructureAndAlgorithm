// You are given a string s consisting only lowercase alphabets and an integer k. 
// Your task is to find the length of the longest substring that contains exactly 
// k distinct characters.

// Note : If no such substring exists, return -1. 

// Examples:

// Input: s = "aabacbebebe", k = 3
// Output: 7
// Explanation: The longest substring with exactly 3 distinct characters is "cbebebe",
//  which includes 'c', 'b', and 'e'.

import java.util.HashMap;

public class Question3 {
    public static int longestKSubstr(String s, int k) {
        int high;
        int low = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int len = -1;

        for(high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            while (freq.size() > k) {
                char lch = s.charAt(low);
                freq.put(lch, freq.get(lch) - 1);
                if(freq.get(lch) == 0) freq.remove(lch);
                low++;
            }

            if(freq.size() == k) {
                int currLen = high - low + 1;
                if(currLen > len) len = currLen;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestKSubstr(s, k));
    }
}

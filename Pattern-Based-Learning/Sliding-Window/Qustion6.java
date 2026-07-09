// Given two strings s and t of lengths m and n respectively, return the minimum window 
// substring of s such that every character in t (including duplicates) is included in the 
// window. If there is no such substring, return the empty string "".

// The testcases will be generated such that the answer is unique.


// Example 1:

// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.


public class Qustion6 {
    public static String minWindow(String s, String t) {
        int[] freq = new int[128];

        if(s.length() < t.length()) return "";

        for(char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int low = 0;
        int required = t.length();
        int matched = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
    
        for(int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            freq[ch]--;

            if(freq[ch] >= 0) matched++;

            while(matched == required) {
                if(high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    start = low;
                }

                char lch = s.charAt(low);
                freq[lch]++;
                if(freq[lch] > 0) matched--;
                low++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}

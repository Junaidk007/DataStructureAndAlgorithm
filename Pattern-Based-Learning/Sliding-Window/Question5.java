// You are visiting a farm that has a single row of fruit trees arranged from left to right. 
// The trees are represented by an integer array fruits where fruits[i] is the type of fruit the 
// ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you 
// must follow:

// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit 
// on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every 
// tree (including the start tree) while moving to the right. The picked fruits must fit in 
// one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// Given the integer array fruits, return the maximum number of fruits you can pick.

 

// Example 1:

// Input: fruits = [1,2,1]
// Output: 3
// Explanation: We can pick from all 3 trees.


//                                 take the refrence of Question no.3

import java.util.HashMap;

public class Question5 {
    public static int totalFruit(int[] fruits) {
        int low = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int len = -1;

        for(int high = 0; high < fruits.length; high++) {
            freq.put(fruits[high], freq.getOrDefault(fruits[high], 0) + 1);

            while (freq.size() > 2) {
                int lch = fruits[low];
                freq.put(lch, freq.get(lch) - 1);
                if(freq.get(lch) == 0) freq.remove(lch);
                low++;
            }

            if(freq.size() <= 2) {
                int currLen = high - low + 1;
                if(currLen > len) len = currLen;
            }
        }

        return len; 
    }

    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(totalFruit(fruits));
    }
}

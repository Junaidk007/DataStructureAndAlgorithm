// Given an array arr[] of distinct integers and a value sum, find the count of triplets (i, j, k), 
// having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.

// Examples :

// Input: sum = 2, arr[] = [-2, 0, 1, 3]
// Output:  2
// Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). 
// Input: sum = 12, arr[] = [5, 1, 3, 4, 7]
// Output: 4
// Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4).

import java.util.Arrays;

public class Question9 {
    static int countTriplets(int sum, int arr[]) {
        // code here
        int count = 0;
        int n = arr.length;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n - 2; i++) {
            
            int j = i + 1;
            int k = n - 1;
            
            while(j < k) {
                
                int calc = arr[i] + arr[j] + arr[k];
                
                if(calc < sum) {
                    
                    count += (k - j);
                    j++;
                    
                } else {
                    k--;
                }
            }
            
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 0, 1, 3};
        int sum = 2;
        System.out.println(countTriplets(sum, arr));
    }
}

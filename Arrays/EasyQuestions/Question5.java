// Given an unsorted array arr and a number k which is smaller than the size of the array. 
// Return true if the array contains any duplicate within k distance throughout the array else false.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 1, 2, 3, 4], k = 3
// Output: false


public class Question5 {
     static boolean checkDuplicatesWithinK(int[] arr, int k) {
        int n = arr.length;

        // travers all elemnets
        for(int i = 0; i < n; i++) {

            // compares K elements with i
            for(int c = 1; c <= k && (i + c) < n; c++) { // loop only k elements 

                int j = i + c; // i + c means next elements after i  eg. if i = 1 then j will be 
                // i + c; 1 + c where c is  <= k 
                
                if (arr[i] == arr[j]) return true;
            }
        }

        return false;
     }

     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 8};

        int k = 3;

        System.out.println(checkDuplicatesWithinK(arr, k));
    }
}

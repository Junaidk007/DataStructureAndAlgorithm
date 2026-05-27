// You are given a sorted array arr[] containing positive integers. 
// Your task is to remove all duplicate elements from this array such that each element appears only once. 
// Return an array containing these distinct elements in the same order as they appeared.

// Examples :

// Input: arr[] = [2, 2, 2, 2, 2]
// Output: [2]



public class Question3 {
    public static void removeDuplicates(int[] arr) {
        
        System.out.print(arr[0] + " ");

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) continue;
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};

        removeDuplicates(arr);
    }        
}

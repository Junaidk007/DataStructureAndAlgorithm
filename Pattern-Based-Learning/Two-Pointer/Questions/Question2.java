// Given an array arr[] consisting of only 0's and 1's. Modify the array in-place(without using extra space) 
// to segregate 0s onto the left side and 1s onto the right side of the array.

// Examples :

// Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
// Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
// Explanation:  After segregation, all the 0's are on the left and 1's are on the right. 
// Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].



public class Question2 {
    static void segregate0and1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            while (arr[i] == 0 && i < j) {
                i++;
            }
            while (arr[j] == 1 && i < j) {
                j--;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1};
        segregate0and1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

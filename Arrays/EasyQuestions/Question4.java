// You are given an array of integers arr[]. You have to reverse the given array.

// Note: Modify the array in place.

// Examples:

// Input: arr = [1, 4, 3, 2, 6, 5]
// Output: [5, 6, 2, 3, 4, 1]


public class Question4 {
    public static  void reverseArray(int arr[]) {

        int lastIdx = arr.length - 1;

        for(int i = 0; i < arr.length/2; i++) {

            int temp = arr[i];

            arr[i] = arr[lastIdx - i];

            arr[lastIdx - i] = temp;

        }        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        reverseArray(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}

// You are given an array arr of positive integers. Your task is to find all the leaders in the array. 
// An element is considered a leader if it is greater than or equal to all elements to its right. 
// The rightmost element is always a leader.

// Examples:

// Input: arr = [16, 17, 4, 3, 5, 2]
// Output: [17, 5, 2]
// Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.



public class Question2 {
    public static void getLeaders(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) break;
                if(j == arr.length - 1) System.out.print(arr[i] + " ");
            }
        }

        System.out.print(arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

       getLeaders(arr);

    }
}

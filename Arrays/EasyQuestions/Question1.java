// You are given an array arr[], the task is to return a list elements of arr in 
// alternate order (starting from index 0).

// Examples:

// Input: arr[] = [1, 2, 3, 4]
// Output: 1 3


class Question1 {
    public static  int[] getAlternate(int[] arr) {
        int size = (arr.length + 1) / 2;

        int[] altArr = new int[size];

        int k = 0;

        for(int i = 0; i < arr.length; i += 2) {

            altArr[k] = arr[i];

            k++;
        }

        return altArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        int[] altArr = getAlternate(arr);

        for(int i = 0; i < altArr.length; i++) {
            System.out.print(altArr[i] + " ");
        }
    }
}
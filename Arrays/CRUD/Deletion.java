package CRUD;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 5};

        int arrSize = arr.length;

        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + ", ");
        }

        int deleteIdx = 2;  // index of the element to be deleted

        for(int i = deleteIdx; i < arrSize -1; i++) { // loop to delete the element
            arr[i] = arr[i + 1];
        }

        arrSize--;

        System.out.println();

        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + ", ");
        }
    }     
}

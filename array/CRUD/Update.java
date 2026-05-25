package CRUD;

public class Update {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 0};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[4] = 5;

        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }    
}

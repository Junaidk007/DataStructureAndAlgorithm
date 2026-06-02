public class Question7 {
    static void rotateArr(int arr[], int d) {

        for(int i = 0; i < d; i++) {

            int temp = arr[0];

            for(int j = 1; j < arr.length; j++) {

                arr[j - 1] = arr[j];

                if(j == arr.length - 1) arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int d = 2;

        rotateArr(arr, d);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

class Creation {
    public static void main(String[] args) {

        // Creation of array

        int[] method1 = new int[5];

        int[] method2 = {1, 3, 5, 7};

        // storing values in array for method 1

        method1[0] = 4;
        method1[2] = 6;

        // or
        
        for (int i = 0; i < method1.length; i++) {

            method1[i] = i*2;

        }

    }
}
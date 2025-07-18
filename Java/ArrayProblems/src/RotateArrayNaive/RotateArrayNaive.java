package RotateArrayNaive;

public class RotateArrayNaive {

    static void rotateArr(int[] arr, int d){
        int n= arr.length;

        //Rotation repeated d times
        for (int i = 0; i < d; i++) {

            //Inner loop will rotate all elements once
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
//Time Complexity: O(n*d), the outer loop runs d times, and within each iteration,
//The inner loop shifts all n elements of the array by one position, resulting in a total of n*d operations.
//Auxiliary Space: O(1)
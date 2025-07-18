package RotateArrayNaive;

public class RotateArrayTempArr {

    static void rotateArr(int[] arr, int d) {

        int n = arr.length;
        int[] temp = new int[n];

        // Handle case when d > n, like if d is 12 in 5 element array its same as 12 % 5 i.e 2 rotations
        d %= n;

        for (int i = 0; i < n-d; i++) {
            temp[i] = arr[d + i]; // Copy last n - d elements to the front of temp
        }

        for (int i = 0; i < d; i++) {
            temp[n-d + i] = arr[i]; // Copy first d elements to the end of temp
        }

        for (int i = 0; i < n; i++) // Copy temp back to arr
            arr[i] = temp[i];

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
//Time complexity: O(n), where n is the size of input array arr[].
//Auxiliary Space: O(n)
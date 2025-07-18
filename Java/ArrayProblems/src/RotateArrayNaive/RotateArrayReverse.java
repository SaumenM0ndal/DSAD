package RotateArrayNaive;

public class RotateArrayReverse {

    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d %= n;

        //First, reverse the first d elements
        reverse(arr, 0, d-1);

        //Then reverse the last n-d elements
        reverse(arr, d, n-1);

        //Finally reverse the full array with these changes
        reverse(arr, 0, n-1);
    }

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
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

//Time Complexity: O(n)
//Auxiliary Space: O(1)
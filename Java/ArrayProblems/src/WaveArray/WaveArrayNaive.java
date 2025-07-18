package WaveArray;

import java.util.Arrays;

public class WaveArrayNaive {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sortInWave (int[] arr, int n) {
        //Sort the array, then traverse with Increment step by 2

        Arrays.sort(arr);

        for(int i = 0; i < n-1; i+=2)
            swap(arr, i, i+1);
    }

    public static void main(String[] args)
    {
        WaveArrayNaive ob = new WaveArrayNaive();
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
//O(n Log n) time and O(1) Space
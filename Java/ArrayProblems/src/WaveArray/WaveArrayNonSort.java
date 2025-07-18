package WaveArray;

public class WaveArrayNonSort {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sortInWave (int[] arr, int n) {

        //Traverse full array in step of 2
        for (int i = 0; i < n; i+=2) {
            //Swap odd and even index elements
            if (i > 0 && arr[i - 1] > arr[i]) {
                swap(arr, i, i - 1);
            }
            if (i < n - 1 && arr[i + 1] > arr[i]) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void main(String[] args)
    {
        WaveArrayNonSort ob = new WaveArrayNonSort();
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i+" ");
    }
}
//O(n) Time and O(1) Space
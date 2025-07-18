package ThirdLargestElement;

import java.util.Arrays;

public class ThirdLargestElementNaive {

    static int getThirdLargestElement(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        return arr[n-3];
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 34, 10, 1, 1};
//        int[] arr = {10, 5, 10};
//        int[] arr = {10, 10, 10};
        System.out.println(getThirdLargestElement(arr));
    }
}

//O(nlog n) time and O(1) space
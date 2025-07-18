package SecondLargestElement;

import java.util.Arrays;

public class SecondLargestElementNaive {

    static int getSecondLargestElement(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        //n-2 is index of second-largest element, we start from there
        //We are traversing backwards and find first largest element which isn't the largest one
        for (int i = n - 2; i>= 0; i--) {
            if (arr[i] != arr[n-1]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 34, 10, 1, 1};
//        int[] arr = {10, 5, 10};
//        int[] arr = {10, 10, 10};
        System.out.println(getSecondLargestElement(arr));
    }
}

//TC is O(n*log(n)), as sorting the array takes O(n*log(n)) time
//and traversing the array can take O(n) time in the worst case, so total time complexity = (n*log(n) + n) = O(n*log(n))
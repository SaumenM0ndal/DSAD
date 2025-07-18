package MaxProductTriplet;

import java.util.Arrays;

public class MaxProductTripletSorting {

    static int maxProd(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        //So the biggest product will be either prod of last 3
        //OR prod of first 2 negatives which becomes positive and then multiply that with biggest
        //If instead of first 2 neg we get 3 neg or only 1 neg, biggest will go to prod of last 3 again, just remember
        return Math.max(arr[0]*arr[1]*arr[n-1],
                arr[n-1]*arr[n-2]*arr[n-3]);
    }

    public static void main(String[] args) {

        int[] arr = {-10, -3, 5, 6, -20};
        System.out.println(maxProd(arr));
    }
}

//Time O(n*log(n)) and Space O(1)
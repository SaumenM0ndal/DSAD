package AdjacentDuplicate;

import java.util.Arrays;

public class AdjacentDuplicateNaive {

    static int[] duplicateK(int[] arr, int k) {
        int n = arr.length;
        int[] resultArr = new int[n*2]; //New arr which at max has double size, in case all elements can have duplicates
        int index = 0;

        //Add element at index i to the same index in resultArr and increment resultArr index
        for (int i = 0;i < n; i++) {
            resultArr[index] = arr[i];
            index++;

            //If adjacent element is equal to k add k to it
            if (arr[i] == k) {
                resultArr[index++] = k;
            }
        }

        //Resize and trim till index length, which is OG arr size
        return Arrays.copyOf(resultArr, index);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int k = 0;
        int[] ans = duplicateK(arr, k);

        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}

//O(n) Time and O(n) Space, two pointer approach gives better solution
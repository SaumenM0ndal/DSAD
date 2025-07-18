package ArrayLeaders;

import java.util.ArrayList;

public class ArrayLeadersNaive {
    static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) //If next element is larger already then just exit loop
                    break;
            }
            //If we reach end of loop without finding a bigger element then add that element as leader
            if (j == n)
                result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = leaders(arr);

        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
}
// O(n^2) Time and O(1) Space:
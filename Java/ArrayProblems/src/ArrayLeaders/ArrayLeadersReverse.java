package ArrayLeaders;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeadersReverse {

    static ArrayList<Integer> leaders(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int maxRight = arr[n-1]; //Last element, its always leader so add it
        result.add(maxRight);

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        //We get leaders but in reverse, so reverse it
        Collections.reverse(result);
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
// O(n) Time and O(1) Space:
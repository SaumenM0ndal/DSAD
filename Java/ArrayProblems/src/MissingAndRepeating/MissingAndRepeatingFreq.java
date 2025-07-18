package MissingAndRepeating;

import java.util.ArrayList;

public class MissingAndRepeatingFreq {

    static ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;
        int repeating = -1;
        int missing = -1;
        int[] freq = new int[n+1]; //n+1 cuz first index 0 will have 0 freq and elements range from 1 to n, and arrays start from 0 so have to work around that


        //freq arr tracks freq of each element
        //At index arr[i] if element is found, at same index in freq, count is inc by 1
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++; //
        }

        for (int i = 1; i <= n; i++) { //i <= n cuz value range till index n (not just n-1 like usual)
            if (freq[i] == 0)
                missing = i;
            else if (freq[i] == 2)
                repeating = i;
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement(arr);

        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}

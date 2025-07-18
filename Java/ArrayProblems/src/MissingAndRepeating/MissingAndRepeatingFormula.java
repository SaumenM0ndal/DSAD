package MissingAndRepeating;

import java.util.ArrayList;

public class MissingAndRepeatingFormula {

    static ArrayList<Integer> findTwoElement(int[] arr){
          int n = arr.length;
          int m = 0, r = 0;

          int s = (n * (n + 1)) / 2;    //Both formulas
          int ssq = (n * (n + 1) * (2 * n + 1)) / 6;

          //Subtract actual values from expected values
        for (int i = 0; i < arr.length; i++) {
            s -= arr[i];  //missing - repeating
            ssq -= arr[i] * arr[i]; //missing² − repeating²
        }

        m = (s + ssq / s) / 2; //IDFK
        r = m - s;

        ArrayList<Integer> result = new ArrayList<>();
        result.add(r);
        result.add(m);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement(arr);

        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}

package ClosestDistanceBetweenStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestDistanceBetweenStrings {
    static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;

        //If current word equals word1, update d1.
        //If current word equals word2, update d2.
        for(int i = 0; i < s.size(); i++) {
            if (s.get(i).equals(word1)) {
                d1 = i;
            }
            if (s.get(i).equals(word2)) {
                d2 = i;
            }

            if(d1 != -1 && d2 != -1) {
                ans = Math.min(ans, Math.abs(d1 - d2));
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        ArrayList<String> S =
                new ArrayList<>(Arrays.asList("the",
                        "quick", "brown", "fox", "quick"));

        String word1 = "the", word2 = "fox";

        System.out.println(shortestDistance(S, word1, word2));
    }
}

//Time Complexity: O(n*m), where n is number of strings and m is size of maximum string.
//Auxiliary Space: O(1)

package LongestCommonPrefixSorting;

import java.util.Arrays;

public class LongestCommonPrefixSorting {

    static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) //We only need to compare up to the length of the shorter string to avoid StringIndexOutOfBoundsException.
            i++;

        return first.substring(0, i);

    }

    public static void main(String[] args){
        String[] arr = { "geeksforgeeks", "geeks",
                "geek", "geezer" };
        System.out.println(longestCommonPrefix(arr));
    }
}

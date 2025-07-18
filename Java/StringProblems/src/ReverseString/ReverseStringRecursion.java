package ReverseString;

public class ReverseStringRecursion {

    static void reverseStringRec(char[] s, int l, int r) {
        if (l >= r)
            return;

        char t = s[l];
        s[l] = s[r];
        s[r] = t;

        reverseStringRec(s, l+1, r-1);
    }

    // Function to reverse a string and display it
    static String reverseString(String s) {
        char[] arr = s.toCharArray();
        reverseStringRec(arr, 0, arr.length - 1);
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(reverseString(s));
    }
}

//Time Complexity: O(n) for backward traversal
//Auxiliary Space: O(n) for storing the reversed string.
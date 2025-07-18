package ReverseString;

public class ReverseStringReverseTraverse {

    static String reverseString(String s) {
        StringBuilder rev = new StringBuilder();
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        String rev = reverseString(s);
        System.out.print(rev);
    }
}

//Time Complexity: O(n) for backward traversal
//Auxiliary Space: O(n) for storing the reversed string.

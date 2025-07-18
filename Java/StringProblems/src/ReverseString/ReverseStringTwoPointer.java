package ReverseString;

public class ReverseStringTwoPointer {
    static String reverseString(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;

        StringBuilder rev = new StringBuilder(s);
        while (left < right) {
            char temp = rev.charAt(left);
            rev.setCharAt(left, rev.charAt(right));
            rev.setCharAt(right, temp);
            left++;
            right--;
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
//Auxiliary Space: O(1) for in-place reversed string.
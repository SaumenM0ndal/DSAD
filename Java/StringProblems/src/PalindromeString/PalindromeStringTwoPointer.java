package PalindromeString;

public class PalindromeStringTwoPointer {

    static int isPalindrome(String s) {

        int left = 0;
        int right = s.length() -1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return 0;
            left++;
            right--;
        }
        return 1;
    }

    public static void main(String[] args) {
        String s = "ablba";
        System.out.println(isPalindrome(s));
    }
}

//Time Complexity: O(n), where n is the length of the input string.
//Auxiliary Space: O(1), no extra data structures used.
package PalindromeString;

public class PalindromeStringOnePointer {
    static int isPalindrome(String s){
        int n = s.length();

        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1))
                return 0;
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
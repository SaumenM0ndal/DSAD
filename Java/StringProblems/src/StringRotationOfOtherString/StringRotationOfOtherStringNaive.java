package StringRotationOfOtherString;

public class StringRotationOfOtherStringNaive {

    static boolean areRotations(String s1, String s2) {
        int n = s1.length();

        for (int i = 0; i < n; i++) {

            if (s1.equals(s2))
                return true;

            char last = s1.charAt(n - 1);
            s1 = last + s1.substring(0, n-1);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";

        System.out.println(areRotations(s1, s2));
    }
}

//O(n^2) Time and O(1) Space bcz each rotation in loop creates new string
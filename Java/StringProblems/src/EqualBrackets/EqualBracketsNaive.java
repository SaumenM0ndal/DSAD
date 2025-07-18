package EqualBrackets;

public class EqualBracketsNaive {

    static int findEqlPoint(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int openCount = 0;
            int closeCount = 0;

            for (int j = 0; j < i; j++) { //count open brackets before i
                if (s.charAt(j) == '(')
                    openCount++;
            }

            for (int j = i; j < n; j++) { //count close brackets after i
                if (s.charAt(j) == ')')
                    closeCount++;
            }
            if (openCount == closeCount)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s ="(())))(";
        System.out.println(findEqlPoint(s));
    }
}
//O(n^2) Time and O(1) Space
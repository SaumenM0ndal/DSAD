package EqualBrackets;

public class EqualBracketsOneVar {

    static int findEqlPoint(String s) {
        int n = s.length();
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < n; i++) { //Count all closing brackets first
            if (s.charAt(i) == ')')
                closeCount++;
        }

        for (int i = 0; i < n; i++) {
            if (openCount == closeCount)
                return i;

            if (s.charAt(i) == '(')
                openCount++;

            if (s.charAt(i) == ')')
                closeCount--;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "((())())";
        System.out.println(findEqlPoint(s));
    }
}

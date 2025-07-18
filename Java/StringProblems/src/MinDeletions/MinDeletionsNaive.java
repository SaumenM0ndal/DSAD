package MinDeletions;

public class MinDeletionsNaive {

    static int minDelRec (int i, int j, String s) {

        //Edge case
        if (i >= j)
            return 0;

        //If first and last char are same
        if (s.charAt(i) == s.charAt(j))
            return minDelRec(i+1, j-1, s);

        //If not...
        return 1 + Math.min(minDelRec(i, j-1, s), minDelRec(i+1, j , s));
    }

    static int minDeletions(String s) {

        return minDelRec(0, s.length() -1, s);
    }

    public static void main(String[] args) {
        String s = "aebcbda";
        System.out.println(minDeletions(s));
    }
}

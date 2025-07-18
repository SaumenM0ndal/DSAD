package StringRotationOfOtherString;

public class StringRotationOfOtherStringInBuilt {

    static boolean areRotations(String s1, String s2){
        return s1.length() == s2.length() &&
                (s1+s1).contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";

        System.out.println(areRotations(s1, s2));
    }
}

//Time Complexity: O(n)
//Auxiliary Space: O(1)
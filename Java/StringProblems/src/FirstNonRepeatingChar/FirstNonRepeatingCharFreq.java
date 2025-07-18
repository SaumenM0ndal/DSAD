package FirstNonRepeatingChar;

public class FirstNonRepeatingCharFreq {
    static int MAX_CHAR = 26;

    static char nonRep(String s) {
        int[] freq = new int[MAX_CHAR];

        for(char c: s.toCharArray()) {
            freq[c - 'a']++;
        }

        for(char c: s.toCharArray()) {
            if (freq[c - 'a'] == 1)
                return c;
        }
        return '$';
    }


    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(nonRep(s));
    }
}
//Time: O(n)
//Space: O(MAX_CHAR) → since array size is fixed (26 letters)
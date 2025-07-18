package KAnagrams;

public class KAnagramsTwoHashTables {
    static int MAX_CHAR = 26;

    static boolean arekAnagrams(String str1, String str2, int k) {
        int m = str1.length();
        int n = str2.length();

        if (m != n)
            return false;

        int[] count1 = new int[MAX_CHAR];
        int[] count2 = new int[MAX_CHAR];
        int count = 0;

        //It counts how many times each letter appears in the string str1.
        //like in 'aba' a-a at 0 is 0, b-a at 1 is 1, a-a at 2 is 0 but now count goes from 1 to 2 for this...
        for (int i = 0; i < n; i++)
            count1[str1.charAt(i) - 'a']++;

        for (int i = 0; i < n; i++)
            count2[str2.charAt(i) - 'a']++;

        // Count number of characters that are different in both strings
        // Then add the less one to count
        for (int i = 0; i < MAX_CHAR; i++)
            if(count1[i] < count2[i])
                count += Math.abs(count1[i] - count2[i]);

        return (count <= k);

    }

    public static void main(String args[])
    {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 2;
        if (arekAnagrams(str1, str2, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

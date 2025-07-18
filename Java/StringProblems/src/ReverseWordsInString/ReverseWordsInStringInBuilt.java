package ReverseWordsInString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInStringInBuilt {

    static String reverseWords(String str){

        List<String> words = new ArrayList<>();
        String [] parts = str.split("\\."); //Multiple dots are single dot in this regex

        for (String word : parts) {
            if (!word.isEmpty()) { //Bcz two dots regex will have like one of the words empty like this - ,"",
                words.add(word);
            }
        }

        Collections.reverse(words);
        return String.join(".", words);

    }

    public static void main(String[] args) {
        String str = "..geeks..for.geeks.";
        System.out.println(reverseWords(str));
    }
}

//Time Complexity: O(n) for backward traversal
//Auxiliary Space: O(n) for storing the reversed string.
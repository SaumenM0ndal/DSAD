package ReverseWordsInString;

import java.util.Stack;

public class ReverseWordsInStringStack {
    static String reverseWords (String str) {
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();

        //As long as no dot is encountered, add the char to word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.') {
                word.append(str.charAt(i));
            }

            else if (!word.isEmpty()) {
                stack.push(word.toString());
                word.setLength(0);
            }
        }

        //If dot comes and word has some chars, push that set of char to stack and reset 'word'


        //For last word
        if (!word.isEmpty()) {
            stack.push(word.toString());
        }

        //Rebuild string in reverse, add words and consequent dots
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(".");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "..geeks..for.geeks.";
        System.out.println(reverseWords(str));
    }
}

//Time Complexity: O(n) for backward traversal
//Auxiliary Space: O(n) for storing the reversed string.
package ReverseString;

import java.util.Stack;

public class ReverseStringStack {

    static String reverseString(String s) {
        Stack<Character> st =  new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        StringBuilder rev = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            rev.append(st.pop());
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(reverseString(s));
    }
}

//Time Complexity: O(n) for backward traversal
//Auxiliary Space: O(n) for storing the reversed string.
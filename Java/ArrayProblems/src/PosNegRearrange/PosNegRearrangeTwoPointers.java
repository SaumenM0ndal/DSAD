package PosNegRearrange;

import java.util.ArrayList;
import java.util.Arrays;

public class PosNegRearrangeTwoPointers {

    static void rearrange(ArrayList<Integer> arr) {

        ArrayList<Integer> pos = new ArrayList<>(); //these arraylists will contain pos and negs from og arraylist
        ArrayList<Integer> neg = new ArrayList<>();

        //Traverse and add pos to pos AL and negs to neg AL
        for( int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                pos.add(arr.get(i));
            }
            else {
                neg.add(arr.get(i));
            }
        }

        //Now we put them back to OG array, where even indices have pos and odd have negs
        //2 points to traverse through those 2 AL
        int posIndex = 0, negIndex = 0;
        int i = 0;

        while (posIndex < pos.size() && negIndex < neg.size()) {
            if (i % 2 == 0) {
                arr.set(i++, pos.get(posIndex++));
            }
            else {
                arr.set(i++, neg.get(negIndex++));
            }
        }

        //Now add remaining pos or negs to OG AL
        while (posIndex < pos.size()) {
            arr.set(i++, pos.get(posIndex++));
        }

        while (negIndex < neg.size()) {
            arr.set(i++, neg.get(negIndex++));
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));
        rearrange(arr);
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
    }
}

//O(n) Time and O(n) Space
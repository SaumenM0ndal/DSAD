package RemoveDuplicates;

import java.util.HashSet;

public class RemoveDuplicatesHashSet {

    static int removeDuplicates(int[] arr) {
        int index = 0;
        HashSet<Integer> hashset = new HashSet<>(); //Sets can't have duplicates, we are using hashSet here


        for (int i = 0; i < arr.length; i++) {
            if (!hashset.contains(arr[i])) {//If element is not in set put it there
                hashset.add(arr[i]);
                arr[index] = arr[i];
                index++;
            }
        }
        // Return the size of the array
        // with unique elements
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//O(n) Time and O(n) Space, works for sorted or unsorted array
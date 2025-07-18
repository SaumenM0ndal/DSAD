package RemoveDuplicates;

public class RemoveDuplicatesOnlySortedArray {

    static int removeDuplicates(int[] arr) {
        int n  = arr.length;
        int index = 1; //hold the index of the next distinct item. Since there is nothing before the first item,
        // we consider it as the first distinct item and begin index with 1

        if (n <= 1)
            return n;

        //If current element is unequal to prev element, put it at position of 'index'
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i-1]) {
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

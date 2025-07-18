package AdjacentDuplicate;

public class AdjacentDuplicateTwoPointer {
    private static int count(int[] arr, int k) { //Had to create separate method for count of k
        int count = 0;

        for(int i = 0; i < arr.length; i++)
            if (arr[i] == k) {
                count++;
            }
        return count;
    }

    static int[] duplicateK(int[] arr, int k) {
        int n  = arr.length;
        int count = count(arr, k);
        int writeIndex = n+count -1; //writeIndex initialized to size of array plus sum of duplicates -1
        int current = n-1; //Since we will traverse in reverse

        //This will keep current element in its correct position if it is within n
        //And write the current element to the write position.
        while (current >= 0 && writeIndex >= 0) {
            if (writeIndex < n) {
                arr[writeIndex] = arr[current];
            }
            writeIndex--;


            if(arr[current] == k) { //If the current element is k, we need to write one more k for the duplication.
                if (writeIndex < n) { //Again, write the duplicate only if the position is within bounds.
                    arr[writeIndex] = k;
                }
                writeIndex--;
            }
            --current;

        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int k = 0;
        int[] ans = duplicateK(arr, k);

        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}

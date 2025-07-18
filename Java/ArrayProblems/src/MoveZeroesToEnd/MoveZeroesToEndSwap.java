package MoveZeroesToEnd;

public class MoveZeroesToEndSwap {

    static void moveZeroesToEnd(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 12, 3, 0, 5, 0};
        moveZeroesToEnd(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//Time Complexity: O(n), as we are traversing the array only once.
//Auxiliary Space: O(1)
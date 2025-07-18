package MoveZeroesToEnd;

public class MoveZeroesToEndTwoPass {

    static void moveZeroesToEnd(int[] arr){
        int n  = arr.length;
        int count = 0;

        //Replace non-zero element at
        //index(count) with the element at index we're at, and increment count
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        //Non-zeroes at in front now
        //Now from count upto n fill with zeroes
        while (count < n) {
            arr[count] = 0;
            count++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 7, 0, 5, 0};
        moveZeroesToEnd(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//Time Complexity: O(n), as we are traversing the array only twice.
//Auxiliary Space: O(1)
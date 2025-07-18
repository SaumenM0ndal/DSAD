package MoveZeroesToEnd;

public class MoveZeroesToEndNaive {

    static void moveZeroesToEnd(int[] arr){
        int n = arr.length;

        //Move non-zero elements to temp, fill rest of the spaces with 0 till length of array is met
        //Then move temp back to OG array
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i]; //Or we can just write temp[j++] = arr[i], same thing
                j++;
            }
        }

        while (j < n) {
            temp[j] = 0; //Or just temp[j++] = 0
            j++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroesToEnd(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//O(n) Time and O(n) Space
package SecondLargestElement;

public class SecondLargestElementOnePass {

    static int getSecondLargestElement(int[] arr) {

        int n = arr.length;
        int largest = -1, secondLargest = -1;

        for(int i = 0; i < n; i++) {

            // If arr[i] > largest, update second largest with
            // largest and largest with arr[i]
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            // If arr[i] < largest and arr[i] > second largest,
            // update second largest with arr[i]
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 34, 10, 1, 1};
//        int[] arr = {10, 5, 10};
//        int[] arr = {10, 10, 10};
        System.out.println(getSecondLargestElement(arr));
    }
}
//Time Complexity: O(n), as we are traversing the array only once.
//Auxiliary space: O(1)
package SecondLargestElement;

public class SecondLargestElementTwoPass {

    static int getSecondLargestElement(int[] arr) {

        int n = arr.length;
        int largest = -1, secondLargest = -1;

        //get largest element
        for(int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        //Each index traversed, update second-largest element to element at index IF greater than previous second largest
        //AND not equal to the largest element
        for(int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
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

//Time Complexity: O(2*n) = O(n), as we are traversing the array two times.
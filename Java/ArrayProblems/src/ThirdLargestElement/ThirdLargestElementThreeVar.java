package ThirdLargestElement;

public class ThirdLargestElementThreeVar {

    static int getThirdLargestElement(int[] arr){

        int n = arr.length;
        int largest = Integer.MIN_VALUE,
            secondLargest = Integer.MIN_VALUE,
            thirdLargest = Integer.MIN_VALUE;

        // If arr[i] is greater than first,
        // set third to second, second to
        // first and first to arr[i].
        for (int i = 0; i < n; i++){
            if(arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 34, 10, 1, 1};
//        int[] arr = {10, 5, 10};
//        int[] arr = {10, 10, 10};
        System.out.println(getThirdLargestElement(arr));
    }
}

//O(n) time and O(1) space
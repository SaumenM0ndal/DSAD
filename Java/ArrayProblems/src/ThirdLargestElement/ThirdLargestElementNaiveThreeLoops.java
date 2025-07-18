package ThirdLargestElement;

public class ThirdLargestElementNaiveThreeLoops {

    static int getThirdLargestElement(int[] arr) {
        int n = arr.length;

        //First loop to get largest, second for second-largest, third for third-largest ez

        int largest = Integer.MIN_VALUE; // can initialize to anything actually
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < largest && arr[i] > secondLargest)
                secondLargest = arr[i];
        }


        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < secondLargest && arr[i] > thirdLargest)
                thirdLargest = arr[i];
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
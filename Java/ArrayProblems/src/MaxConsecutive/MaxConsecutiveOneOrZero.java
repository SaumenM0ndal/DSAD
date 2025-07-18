package MaxConsecutive;

public class MaxConsecutiveOneOrZero {

    static int maxConsecutiveCount(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;

        int maxCount = 0,
            count = 1;

        //start from index 1 bcz we'll be comparing current index with previous one i-1 as we traverse
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
         return Math.max(maxCount,count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveCount(arr));
    }
}

//O(n) Time and O(1) Space
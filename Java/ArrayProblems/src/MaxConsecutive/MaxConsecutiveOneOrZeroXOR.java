package MaxConsecutive;

public class MaxConsecutiveOneOrZeroXOR {

    static int maxConsecutiveCount(int[] arr){
        int n = arr.length;
        if (n == 0)
            return 0;

        int maxCount = 0,
            count = 1,
            prev = -1;

        for (int num : arr) {
            if ((prev ^ num) == 0) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
            prev = num;
        }
        return Math.max(maxCount, count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecutiveCount(arr));
    }
}

//O(n) Time and O(1) Space
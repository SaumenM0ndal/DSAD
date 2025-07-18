package ReverseSubgroupOfGivenSize;

public class ReverseSubgroupOfGivenSize {

    static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;

        //Two pointer approach for reversing, left and right
        //Left inc by 1, right dec by 1
        for (int i = 0; i < n; i+=k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); //i+k-1 is the last index of subgroup

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 5;

        reverseInGroups(arr, k);

        // Print modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//Time complexity: O(n)
//Auxiliary space: O(1)
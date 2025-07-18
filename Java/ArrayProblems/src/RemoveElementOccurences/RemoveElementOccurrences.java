package RemoveElementOccurences;

public class RemoveElementOccurrences {

    static int removeElement(int[] arr, int ele) {
        int n = arr.length;
        int k = 0; //Counter to track non-equal element

        for (int i = 0; i < n; i++) {
            if (arr[i] != ele) {
                arr[k] = arr[i];

                k++;
            }
        }
        return k; // Return count of non equal elements
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int ele = 2;
        System.out.println(removeElement(arr, ele));
    }
}

//Time Complexity: O(n), where n is the number of elements in arr[]
//Auxiliary Space: O(1)
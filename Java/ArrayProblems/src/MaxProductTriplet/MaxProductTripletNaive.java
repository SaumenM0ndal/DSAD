package MaxProductTriplet;

public class MaxProductTripletNaive {

    static int maxProd(int[] arr) {
        int n = arr.length;
        int max_product = Integer.MIN_VALUE;
        //We are checking every triplet with 3 for loops
        //We start from index 0 and go till n-3 to keep space for other 2 which are n-1 and n
        //then we start from i+1 and j+1 respectively so each element is unique
        //otherwise it'll pick same element if we start from j=0 and k=0
        for(int i = 0; i < n-2; i++)
            for(int j = i+1; j < n-1; j++)
                for(int k = j+1; k < n; k++) {
                    max_product = Math.max(max_product, arr[i]*arr[j]*arr[k]);
                }
        return max_product;
    }

    public static void main(String[] args) {

        int[] arr = {10, 3, 5, 6, 20};
        System.out.println(maxProd(arr));
    }
}

//Time Complexity: O(n3)
//Auxiliary Space: O(1)
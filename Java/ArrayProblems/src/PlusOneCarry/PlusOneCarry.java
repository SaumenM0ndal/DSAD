package PlusOneCarry;

public class PlusOneCarry {

    static int[] addOne(int[] arr){
        int n = arr.length;
        int carry = 1;

        //Reverse traverse array
        //adding 1 to units
        //Then go to tens
        //Update carry
        for (int i = n-1; i >=0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        //If carry still remains, we need to add it at the beginning of number
        //We do this with new array one size bigger than OG array, then assign carry to first index on new one
        if (carry > 0) {
            int[] newArr = new int[n + 1];
            newArr[0] = carry;
            System.arraycopy(arr, 0, newArr, 1, n);
            return newArr;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] res = addOne(arr);
        for(int i : res) {
            System.out.print(i);
        }
    }
}

//O(n) Time and O(1) Space

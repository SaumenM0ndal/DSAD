package DigitalRoot;

public class DigitalRootNaive {

    static int digitalRoot(int n) {
        int sum = 0;

        //Repetitively calculate sum until
        //it becomes single digit, once single digit sum is found loop stops and comes out
        while (n > 0 || sum > 9) {
            // If n becomes 0, make that number n to sum
            // and start a new iteration by resetting sum to 0.
            //This will trigger when all digits are extracted
            if (n == 0) {
                n = sum;
                sum = 0;
            }

            sum +=  n % 10;
            n /= 10;
        }
        return  sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(digitalRoot(n));
    }
}

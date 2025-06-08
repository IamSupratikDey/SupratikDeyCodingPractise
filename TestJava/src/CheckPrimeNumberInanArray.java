import java.util.*;

public class CheckPrimeNumberInanArray {

    /**
     * When you are seeing any prime - think about sqrt
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to return boolean array indicating prime status
    public static boolean[] checkPrimes(int[] nums) {
        boolean[] result = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = isPrime(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 5, 6, 7, 9, 11, 15};
        boolean[] primes = checkPrimes(input);

        // Print results
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " is prime? " + primes[i]);
        }
    }
}

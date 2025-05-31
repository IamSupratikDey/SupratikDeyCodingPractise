import java.util.Scanner;

public class CheckPalindromeNumber {

    /**
     * Time complexity for this code is O(log₁₀ n)
     * Space complexity O(1)
     * Suppose you have a number n. The number of digits in n is equal to: digits(n)=⌊log10(n)⌋+1
     * @param number
     * @return
     */
    public static boolean isPalindrome(int number)
    {
        int reverseNumner = 0;
        int realNumber =  number;
        while(number>0)
        {
            int reminnder = number%10;
            reverseNumner  = reverseNumner*10 + reminnder;
            number = number/10;
        }

        return realNumber == reverseNumner;

    }



    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        int number = sc.nextInt();

        System.out.println(isPalindrome(number) ?
                "The number is a palindrome number" :
                "The number is not a palindrome number");

    }
}

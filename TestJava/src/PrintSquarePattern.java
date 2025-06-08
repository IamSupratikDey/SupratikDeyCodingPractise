import java.util.Scanner;

public class PrintSquarePattern {

    public static void printSquarePattern(int number)
    {
        for(int i=1; i<=number; i++)
        {
            for(int j=1; j<=number; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");

        int number = sc.nextInt();
        printSquarePattern(number);

    }
}

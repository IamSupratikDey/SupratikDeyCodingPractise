
import java.util.*;
public class SelectionSortInJava {

    static int[]  selectionSortForTheGivenArray(int[] arr) {

        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            int min = i;
            for (int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }


        return arr;
    }

    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display the array elements
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }

        scanner.close();
        int[] resultArray =selectionSortForTheGivenArray(numbers);
        System.out.println("The sorted array is :");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + resultArray[i]);
        }


    }
    }


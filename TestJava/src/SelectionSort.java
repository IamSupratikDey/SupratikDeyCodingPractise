import java.util.*;
public class SelectionSort {

    public static void selectionSort(int [] arr)
    {
        int size = arr.length;
        int min = Integer.MAX_VALUE ;
        for(int i=0; i<size-1; i++)
        {
            int mini = i;
            for(int j=i+1; j<size; j++)
            {

                if(arr[j]<arr[mini])
                {
                   mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        sc.close();

        selectionSort(arr);
    }

}

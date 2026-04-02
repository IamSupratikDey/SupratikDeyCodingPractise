import java.util.*;

public class BuyAndSellStocks {

    public static int determineMaxProfitByBuyAndSellingStocks(int [] arr, int size)
    {
        int price = arr[0];
        int maxProfit = 0;

        for(int i=1;i<size; i++)
        {
            int cost = arr[i] - price;
            maxProfit = Math.max(maxProfit,cost);
            price = Math.min(price,arr[i]);
        }

        return maxProfit;
    }

    public static void findTheSecondHighestElementInanArray(int [] arr, int size)
    {
      Integer highest = null, secondHighest = null;

      for(int number : arr)
      {
          if(highest==null || number > highest)
          {
              secondHighest = highest;
              highest = number;
          } else if ((secondHighest==null || number > secondHighest) && number!=highest) {

              secondHighest = number;
          }
      }

        if (secondHighest != null) {
            System.out.println("Second highest: " + secondHighest);
        } else {
            System.out.println("No distinct second highest value.");
        }
    }


    public static void findTheSecondLargestElementInArray(int arr[], int size)
    {
        Integer smallest=null,  secondSmallest = null;

        for(int number:arr)
        {
            if(smallest==null || number<smallest)
            {
                secondSmallest=smallest;
                smallest=number;
            }

            else if ( (secondSmallest==null || number<secondSmallest) && number!=smallest )
            {
                secondSmallest=number;
            }
        }

        if (secondSmallest != null) {
            System.out.println("Second smallest: " + secondSmallest);
        } else {
            System.out.println("No distinct second smallest value.");
        }
    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int maxProfit = determineMaxProfitByBuyAndSellingStocks(array,size);
        System.out.println(maxProfit);

        findTheSecondHighestElementInanArray(array,size);
        findTheSecondLargestElementInArray(array,size);
    }
}

import java.util.*;

/**
 * Brute force method to find the largest subarray from a given string
 */
public class LargestSubarray {

    public static void printTheLargestSubstringUsingSlidingWindow(String str)
    {
        int size = str.length();
        int l = 0, r = 0;
        int maxLength = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>(255);

        while (r<size)
        {
            if(map.containsKey(str.charAt(r)))
            {
                if(map.getOrDefault(str.charAt(r),r)>l)
                {
                    l=map.getOrDefault(str.charAt(r),r)+1;
                }
            }

            int length = r-l+1;
            maxLength = Math.max(maxLength,length);
            map.put(str.charAt(r),r);
            r++;
        }
        System.out.println(maxLength);
    }
    public static void printTheLargestSubStringAndLength(String str)
    {
        int strLength = str.length();
        int maxans = Integer.MIN_VALUE;
        for(int i=0; i<strLength; i++)
        {
            Set < Character > se = new HashSet < > ();
            for(int j=i; j<strLength; j++ )
            {
                if(se.contains(str.charAt(j)))
                {
                    maxans = Math.max(maxans, j-i+1);
                    break;
                }

                se.add(str.charAt(j));
            }
        }
        System.out.println(maxans);
    }

    /**
     * This method is finding the maximum element from an given array
     * Using sliding window technique with doubly ended queue
     * -> Requirement to complete this function
     *    1.One Double ended queue
     *    2.One resultant array/list to store the maximum element from subarray
     * Returns an array

     */
    public static int[] findTheMaximumFromAGivenSubArray(int [] arr, int size, int k)
    {
        int [] resulttantArray = new int[size-k+1];
        if(arr==null || arr.length==0 || k<= 0)
        {
            return new int[0];
        }

        /**
         * Array dequeue will store array indices
         */
        Deque <Integer> storeMax = new ArrayDeque<>();
        for (int i=0; i<size; i++)
        {
            while (!storeMax.isEmpty() && storeMax.peekFirst() < i-k+1)
            {
                storeMax.pollFirst();
            }

            /**
             * this I am doing because we are storing the value in the dequeue in descending order that is Large to small
             */
            while (!storeMax.isEmpty() && arr[storeMax.peekLast()] < arr[i])
            {
                storeMax.pollLast();
            }

            /**
             * This will store the element in rear side of the dequeue
             */
            storeMax.offerLast(i);

            /**
             * Now the final check -> This condition checks if you've processed at least k elements—meaning the sliding window is now full and can start producing results.
             * Why peekFirst -> Because in the dequeue we are storing t
             */

            if(i>=k-1)
            {
                resulttantArray[i-k+1] = arr[storeMax.peekFirst()];
            }
        }
        return resulttantArray;

    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
        sc.close();
        printTheLargestSubStringAndLength(input);
        printTheLargestSubstringUsingSlidingWindow(input);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int [] arrayNumber = findTheMaximumFromAGivenSubArray(array,size, 3);
        System.out.println("The arrayElements are " + java.util.Arrays.toString(arrayNumber));


    }


}

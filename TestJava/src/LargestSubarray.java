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
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        System.out.println("You entered: " + input);
        sc.close();
//        printTheLargestSubStringAndLength(input);
        printTheLargestSubstringUsingSlidingWindow(input);
    }


}

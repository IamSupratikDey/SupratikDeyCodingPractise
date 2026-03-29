import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PritnArrayElementAppearingTwiceOrMore {


    public static int[] printArrayElementAppearingTwiceOrMore(int [] inputArray)
    {
        HashMap<Integer, Integer> currentMap = new HashMap<>();
        int size  = inputArray.length;
        int[] resultantArray = new int [size];
        int index = 0;

        for(int i=0; i<size; i++)
        {
            currentMap.put(inputArray[i], currentMap.getOrDefault(inputArray[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> mpp:currentMap.entrySet())
        {
            if(mpp.getValue()>=2)
            {
                resultantArray[index] = mpp.getKey();
                index++;
            }
        }

        return resultantArray;

    }



    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input array");
        int inputArraySize = sc.nextInt();
        int [] inputArray = new int [inputArraySize];
        int [] resultantArray = new int [inputArraySize];
        System.out.println("Enter the elements of the array");

        for(int i=0; i<inputArraySize; i++)
        {
            inputArray[i] = sc.nextInt();
        }

        resultantArray = printArrayElementAppearingTwiceOrMore(inputArray);
        for(int i=0; i<inputArraySize; i++)
        {
            System.out.println(resultantArray[i]);
        }
    }
}

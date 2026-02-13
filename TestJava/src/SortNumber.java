import java.util.Scanner;

public class SortNumber {

    public static void printTheArrayInOrder(int[] inputArray) {
        int size = inputArray.length;

        // Count and separate in a single pass
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < size; i++) {
            if (inputArray[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create optimally-sized arrays
        int[] oddArray = new int[oddCount];
        int[] evenArray = new int[evenCount];

        // Fill arrays in single pass
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < size; i++) {
            if (inputArray[i] % 2 == 0) {
                evenArray[evenIndex++] = inputArray[i];
            } else {
                oddArray[oddIndex++] = inputArray[i];
            }
        }

        // Sort arrays
        sortDescending(oddArray);
        sortAscending(evenArray);

        // Print results
        printArray(oddArray);
        printArray(evenArray);
    }

    // Optimized descending sort using selection sort
    private static void sortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Only swap if needed
            if (maxIndex != i) {
                swap(arr, i, maxIndex);
            }
        }
    }

    // Optimized ascending sort using selection sort
    private static void sortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Only swap if needed
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }

    // Reusable swap method
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reusable print method
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();
        int[] inputArray = new int[arraySize];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = sc.nextInt();
        }

        printTheArrayInOrder(inputArray);

        sc.close();
    }

}

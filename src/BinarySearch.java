public class BinarySearch {
    public static int binarySearchWithTrace(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int step = 1;

        System.out.println("Executing Binary Search for Target: " + target);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("Step " + step + ": Low = " + low + ", High = " + high +
                    ", Mid = " + mid + " (Value at Mid: " + arr[mid] + ")");
            if (arr[mid] == target) {
                System.out.println("-> Match found at index " + mid + "!\n");
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
                System.out.println("-> " + target + " is greater than " + arr[mid] + ". Updating Low to " + low + ".\n");
            }
            else {
                high = mid - 1;
                System.out.println("-> " + target + " is less than " + arr[mid] + ". Updating High to " + high + ".\n");
            }
            step++;
        }
        System.out.println("Target " + target + " not found in the dataset.\n");
        return -1;
    }
}

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int j = low;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < pivot) {
                j++;
                System.out.println("Swapping " + arr[i] + " and " + arr[j]);
                ArrayUtils.swap(arr, i, j);
            }
        }

        System.out.println("Final Swap: Pivot " + pivot + " with " + arr[j]);
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int par = partition(arr, low, high);
            quickSort(arr, low, par - 1);
            quickSort(arr, par + 1, high);
        }
    }
}
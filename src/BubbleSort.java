public class BubbleSort {
    static void bubbleSort(int[] arr) {
        boolean QuickExit = true;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]) {
                    ArrayUtils.swap(arr, i, j);
                    QuickExit = false;
                }
            }
            if (QuickExit){
                break;
            }
        }
    }
}

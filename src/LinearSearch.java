public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        int comparisons = 0;
        for (int j : arr) {
            comparisons++;
            if (j == target) {
                System.out.println(target + " in " + comparisons + " comparisons.");
                return comparisons;
            }
        }
        System.out.println(target + " not found after " + comparisons + " comparisons.");
        return comparisons;
    }
}

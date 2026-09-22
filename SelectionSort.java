public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};
        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }

            System.out.print("After pass " + (i + 1) + ": ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        System.out.println("Total comparisons: " + comparisons);
        System.out.println("Total swaps: " + swaps);
    }
}
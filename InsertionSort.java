public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};
        int comparisons = 0;
        int shifts = 0;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                comparisons++;
                arr[j + 1] = arr[j];
                shifts++;
                j--;
            }
            if (j >= 0) {
                comparisons++;
            }
            arr[j + 1] = key;

            System.out.print("After pass " + i + ": ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        System.out.println("Total comparisons: " + comparisons);
        System.out.println("Total shifts: " + shifts);
    }
}
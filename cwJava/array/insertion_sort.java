package cwJava.array;

public class insertion_sort {

        public static int[] insertionSortIncreasing(int[] arr) {
            int n = arr.length;
            int[] sortedArr = new int[n];

            // Copy the elements from the original array to the sorted array
            for (int i = 0; i < n; i++) {
                sortedArr[i] = arr[i];
            }

            for (int i = 1; i < n; i++) {
                int key = sortedArr[i];
                int j = i - 1;

                while (j >= 0 && sortedArr[j] > key) {
                    sortedArr[j + 1] = sortedArr[j];
                    j--;
                }

                sortedArr[j + 1] = key;
            }

            return sortedArr;
        }

        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Original Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            int[] sortedArray = insertionSortIncreasing(arr);

            System.out.println("\nSorted Array (Increasing Order):");
            for (int num : sortedArray) {
                System.out.print(num + " ");
            }
        }

}

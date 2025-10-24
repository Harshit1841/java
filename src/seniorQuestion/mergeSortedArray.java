public class mergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Merge both arrays in sorted order
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2;
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        // Print merged array;
        System.out.print("Merged Sorted Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}


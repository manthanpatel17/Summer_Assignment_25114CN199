public class MergeSortedArrays {
    
    // Function to merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m];
        
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for mergedArray
        
        // Traverse both arrays and copy the smaller element
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of arr1, if any
        while (i < n) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of arr2, if any
        while (j < m) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};
        
        int[] result = merge(arr1, arr2);
        
        System.out.println("First Array: " + Arrays.toString(arr1));
        System.out.println("Second Array: " + Arrays.toString(arr2));
        System.out.println("Merged Sorted Array: " + Arrays.toString(result));
    }
}
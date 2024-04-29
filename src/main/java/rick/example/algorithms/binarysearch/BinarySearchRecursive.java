/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.binarysearch;

/**
 * this class contains a method that implement the binary search recursively
 * The assumptions is always the array is ascending ordered
 */
public class BinarySearchRecursive {

    public int findBinaryRecursive(int[] arr, int key, int low, int high) {

        if (high < low) {
            return -1;
        }

        int middle = low + (high - low) / 2;

        if (arr[middle] == key) {
            return middle;
        } else if (arr[middle] > key) {
            return findBinaryRecursive(arr, key, low, middle - 1);
        } else {
            return findBinaryRecursive(arr, key, middle + 1, high);
        }
    }
}

/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.binarysearch;


/**
 * This class contains a method that, given a key as input, returns the index ceiling of the key
 * in an ordered array
 * The ceiling is the key or the smallest bigger number of the key
 * In the case nothing is found returns -1
 */
public class BinarySearchCeiling {
    public int findBinarySearchCeiling(int[] sortedArray, int key) {

        int end = sortedArray.length - 1;
        int start = 0;
        if (key > sortedArray[end]) {
            return -1;
        }
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (key > sortedArray[middle]) {
                start = middle + 1;
            }
            if (key < sortedArray[middle]) {
                end = middle - 1;
            }
            if (key == sortedArray[middle]) {
                return middle;
            }
        }
        // since the loop is running until 'start <= end', so at the end of the while loop, 'start == end+1'
        // we are not able to find the element in the given array, so the next big number will be arr[start]
        return start;
    }
}

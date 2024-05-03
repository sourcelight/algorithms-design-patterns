/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.binarysearch;


/**
 * this class contains a method that performs a binary search
 * over an ordered array without taking care the ascending or descending ordering
 */
public class AgnosticOrderBinarySearch {

    int findBinarySearchAgnostic(int[] orderedArray, int key) {
        int low = 0;
        int high = orderedArray.length-1;

        boolean isAscending = orderedArray[high] - orderedArray[low] > 0;

        while (low <= high) {

            int middle = low + (high - low) / 2;

            if (orderedArray[middle] == key) {
                return middle;
            }
            if (isAscending) {

                if (orderedArray[middle] < key) {
                    low = middle + 1;
                }

                if (orderedArray[middle] > key) {
                    high = middle - 1;
                }

            } else {

                if (orderedArray[middle] < key) {
                    high = middle - 1;
                }

                if (orderedArray[middle] > key) {
                    low = middle + 1;
                }

            }

        }
        return -1;

    }


}

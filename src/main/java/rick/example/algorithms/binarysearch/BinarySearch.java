/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.binarysearch;


/**
 * This class contains a method that search a key into
 * an ordered array, the time complexity is O(log(n)).
 * It splits every time the search in 2 halves
 */
public class BinarySearch {


    public int findBinarySearch(int[] orderedArray, int key) {
        //int index = Integer.MAX_VALUE;
        int index = -1;
        int low = 0;
        int high = orderedArray.length - 1;
        int middle;

        while (low <= high) {

            //It's a rounded value to the floor
            middle = low + (high - low) / 2;
            System.out.println("middle: "+middle+" low: "+low+" high: "+high);
            if (orderedArray[middle] < key) {
                low = middle + 1;
            }
            if (orderedArray[middle] > key) {
                high = middle - 1;
            }
            if (orderedArray[middle] == key) {
                index = middle;
                break;
            }
        }

        return index;
    }
}

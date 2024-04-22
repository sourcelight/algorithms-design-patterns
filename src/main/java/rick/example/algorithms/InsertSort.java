/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms;

/**
 * this class order array with a Time complexity of O(n^2)
 * and it's good for data structures not too large
 *
 * @see <a href="https://www.youtube.com/watch?v=wwYtlfF57Q0">...</a>
 */
public class InsertSort {

    public void insertSort(int[] arr) {

        //we analyse the array from left to the right, and we escape the first element(i=1) because it's already ordered with itself
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}

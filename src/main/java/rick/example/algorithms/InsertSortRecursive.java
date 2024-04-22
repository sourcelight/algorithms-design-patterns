/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms;


/**
 * It assumes the first n-1 items are sorted and insert the n item and put in the right position.
 * an array of 1 element is already sorted
 * We have the base case(return if n<=1, do nothing, already sorted) and the recursive case(insert the n item in the correct position inside the (n-1) previously ordered)
 * Note the overloaded recursive method with 2 arguments: array and array size(decreasing for each iteration)
 */
public class InsertSortRecursive {


    public void sortInsertion(int[] arr) {
        sortInsertion(arr, arr.length);

    }

    public void sortInsertion(int[] arr, int n) {
        if (n <= 1)
            return;
        sortInsertion(arr, n - 1);

        int j = n - 1;

        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }

    }


}

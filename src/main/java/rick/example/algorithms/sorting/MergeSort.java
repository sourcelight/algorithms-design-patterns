/**
 * @author: Riccardo_Bruno
 * @project: design-pattern
 */


package rick.example.algorithms.sorting;


import java.util.stream.Stream;


/**
 * @see <a href="https://www.baeldung.com/java-merge-sort#:~:text=Merge%20sort%20is%20a%20%E2%80%9Cdivide,final%20solution%20to%20the%20problem.">reference</a>
 *
 * 3 steps:
 * base: in the case I got only one elment I return and do nothing, already ordered
 * mergeSort: I create 2 subarrays:left and right(by the middle pivot calculation) from the "full" array, I fill them and invoke recursively the mergeSort alogirthm on the 2 previously subarrays
 * I invoke the merge method: it does the heavy lift: ordering and merging the 2 sub arrays into the "full array"
 *
 */

public class MergeSort {

    public void merge(int[] arr, int[] l, int[] r, int left, int right) {

        //I compare each subarray and put in order the value accordingly in the main array
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        //in case i!=j I fill out the remaining elements

        while (i < left) {
            arr[k++] = l[i++];
        }

        while (j < right) {
            arr[k++] = r[j++];
        }


    }

    /**
     *This algorithm has the worst case complexity of O(nlog(n))
     */
    public void mergeSort(int[] arr, int n) {

        //stop recursion when the array's size is 1
        if (n < 2) {
            return;
        }
        int middle = n / 2;

        //let's split the array in 2 parts:left and right around the middle
        int[] l = new int[middle];
        int[] r = new int[n - middle];
        int i = 0;
        //let's fill the l array
        while (i < middle) {
            l[i] = arr[i++];
        }


        for (int k = middle; k < n; k++) {
            r[k - middle] = arr[k];
        }

        //we invoke recursively mergeSort for the left and right subarray
        mergeSort(l, middle);
        mergeSort(r, n - middle);

        //we invoke the merge algorithm(it creates a merge and reassembles it)
        merge(arr, l, r, middle, n - middle);


    }

}

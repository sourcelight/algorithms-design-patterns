/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.slidingwindows;

public class ArrayAveragesSizeK {
    /**
     * the method returns the average of any contiguous window of k
     * @param arr
     * @param k
     * @return
     */
    public double[] findAverages(int[] arr, int k) {

        int sizeArr = arr.length;
        double sum = 0;
        int winStart = 0;

        double[] result = new double[sizeArr - k + 1];

        for (int winEnd = 0; winEnd < sizeArr; winEnd++) {//winEnd++ increment the end of the window forward
            sum += arr[winEnd];//I add the next element in the window
            if (winEnd >= k - 1) {//Now I'm inside the window, before was useless doing any other elaboration
                result[winStart] = sum / k;
                sum -= arr[winStart];//I remove the  element from the previous window
                winStart++;//I slide the start of the windows forward
            }
        }
        return result;
    }
}

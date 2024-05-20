/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.binarysearch;

public class BinarySearchSortedCircularCharacterNextBigger {


    /**
     * @param sortedInputCharArray
     * @param key
     * @return
     * @apiNote Assumptions: the input array is done by lower case letters
     * <p>
     * this method returns the smallest letter in the given ascending sorted array
     * bigger than the input key
     * The input array is considered circular: the first letter follows the last letter
     * so the bigger key of the array and the last letter of the array are considered the first letter of the array
     */
    public char findNexBiggerCharacterCircular(char[] sortedInputCharArray, char key) {

        int n = sortedInputCharArray.length;
        //because of the circular array considerations
        if (key < sortedInputCharArray[0] || key > sortedInputCharArray[n - 1]) {
            return sortedInputCharArray[0];
        }

        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;

            //note that we skip the condition "key == sortedInputCharArray[middle]" because we want the next letter !
            if (key >= sortedInputCharArray[middle]) {
                start = middle + 1;
            } else {//case of key < sortedInputCharArray[middle]
                end = middle - 1;
            }
        }
        //we end up when start = end+1, and in the case of the key is last letter of the array
        //we need to take "0" i.e. start would be "end +1" => n -1 +1 = n and so the module to be 0
        // in all the other cases(start < n ) => start%n = start
        return sortedInputCharArray[start % n];
    }
}

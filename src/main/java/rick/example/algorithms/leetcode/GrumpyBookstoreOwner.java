/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.leetcode;


/**
 * @see <a href="https://leetcode.com/problems/grumpy-bookstore-owner/solutions/5344081/beats-100-explained-with-video-c-java-python-js-sliding-window-interview-solution/">Solution</a>
 * {@link <a href="https://www.youtube.com/watch?v=pLCZsQki-d4">better explanation from video</a>}
 */
public class GrumpyBookstoreOwner {

    /**
     * The method returns the max number of satisfied customers in a day
     * note that the size array of customers and grumpy is the same
     * We calculate:
     * 1 the initial number of satisfied customers with no tricks
     * 2 the max extra number of satisfied customers
     * we add the two results above
     *
     * @param customers is the array of customer at each minute
     * @param grumpy    is the array when the owner is grumpy at a specific minute
     * @param minutes   is the continuous time applied by the owner to "obscure" the grumpy behaviour to the customers
     * @return the max number of satisfied customers in a day
     */
    int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int n = customers.length;
        int initialSatisfied = 0;
        int current = 0;//The current extra in a window where grumpy[i] ==1

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {//When grumpy is not present all the customers are satisfied
                initialSatisfied += customers[i];
            } else if (i < minutes) {
                current += customers[i];
            }
        }
        int maxExtra = current;
        //till this point I have calculated the initial satisfaction(with no tricks)
        //and a possible extra satisfaction till the "first window"

        //I continue to calculate the extra max satisfaction on all the other windows
        //sliding the window(removing the last element and adding  a new element)
        for (int i = minutes; i < n; i++) {
            //I add the new customer in the window, I have to consider only the grumpy[i]==1(the extra ones)
            current += customers[i] * grumpy[i];
            //I remove the possible old customer(grumpy[i] ==1) from the window
            current -= customers[i - minutes] * grumpy[i - minutes];
            maxExtra = Math.max(maxExtra, current);//I calculate the new possible max satisfaction

        }
        return initialSatisfied + maxExtra;
    }


}

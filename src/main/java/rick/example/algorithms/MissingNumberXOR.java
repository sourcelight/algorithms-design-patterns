/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms;

/**
 * this class contains a method that find the missing number
 * leveraging the XOR properties: A^A = 0, A^0 = A
 * and commutative and associative properties
 * Instead of summing all numbers from 1 to N and removing
 * all the numbers of the array(we risk an overflow)
 * We exploit the XOR property because only the missing nuber will give the result itself(all the others provide 0)
 */
public class MissingNumberXOR {

    static{
        System.out.println("inside a static block !");
    }

    public int findXORMissingNumber(int[] arr) {

        //+1 because one number is missing on the array
        int n = arr.length + 1;
        int x1 = 1;
        //x1 is the XOR sum of n numbers
        for (int i = 2; i <= n; i++) {
            x1 ^= i;
        }
        //x2 is the XOR sum of array numbers
        int x2 = arr[0];
        for (int i = 1; i < n - 1; i++) {
            x2 ^= arr[i];
        }
        //because of the associative property this is the XOR operation of all the previous single numbers
        //all the equals number go to zero, only the mismatch(missing) remains
        return x1 ^ x2;
    }

}

/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.binarysearch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BinarySearchSortedCircularCharacterNextBiggerTest {


    @Test
    void test_givenSortedCircularArrayCharacter_whenKeyCharacterLowerThanMaxArrayCharacter_thenGotNextOneCharacter() {

        char[] sortedInputCharArray = {'a', 'c', 'f', 'h', 'm'};
        char key = 'e';
        BinarySearchSortedCircularCharacterNextBigger binarySearchSortedCircularCharacterNextBigger = new BinarySearchSortedCircularCharacterNextBigger();
        char actualChar = binarySearchSortedCircularCharacterNextBigger.findNexBiggerCharacterCircular(sortedInputCharArray, key);
        char expectedChar = 'f';
        Assert.assertEquals(expectedChar, actualChar);
    }

    @Test
    void test_givenSortedCircularArrayCharacter_whenKeyCharacterEqualThanMaxArrayCharacter_thenGotFirstArrayCharacter() {

        char[] sortedInputCharArray = {'a', 'c', 'f', 'h', 'm'};
        char key = 'm';
        BinarySearchSortedCircularCharacterNextBigger binarySearchSortedCircularCharacterNextBigger = new BinarySearchSortedCircularCharacterNextBigger();
        char actualChar = binarySearchSortedCircularCharacterNextBigger.findNexBiggerCharacterCircular(sortedInputCharArray, key);
        char expectedChar = 'a';
        Assert.assertEquals(expectedChar, actualChar);
    }



    @Test
    void test_givenSortedCircularArrayCharacter_whenKeyCharacterBiggerThanMaxArrayCharacter_thenGotFirstArrayCharacter() {

        char[] sortedInputCharArray = {'a', 'c', 'f', 'h', 'm'};
        char key = 'o';
        BinarySearchSortedCircularCharacterNextBigger binarySearchSortedCircularCharacterNextBigger = new BinarySearchSortedCircularCharacterNextBigger();
        char actualChar = binarySearchSortedCircularCharacterNextBigger.findNexBiggerCharacterCircular(sortedInputCharArray, key);
        char expectedChar = 'a';
        Assert.assertEquals(expectedChar, actualChar);
    }


}

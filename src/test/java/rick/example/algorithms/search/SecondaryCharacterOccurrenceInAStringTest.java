/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.search;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SecondaryCharacterOccurrenceInAStringTest {


    @Test
    void test_givenInputString_whenFindSecondaryOccurence_thenGetSecondOccurenceCharacter(){
        String test = "aaaabnbncccccccdde";
        SecondaryCharacterOccurrenceInAString secondaryCharacterOccurrenceInAString = new SecondaryCharacterOccurrenceInAString();
        char expectedChar = 'a';
        char actualChar =secondaryCharacterOccurrenceInAString.findSecondaryOccurrence(test);
        Assert.assertEquals(expectedChar,actualChar);
    }



}

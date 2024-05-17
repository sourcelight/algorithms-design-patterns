/**
 * @author: Riccardo_Bruno
 * @project: algorithms-design-patterns
 */


package rick.example.algorithms.search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondaryCharacterOccurrenceInAString {
    /**
     * method that returns the second frequent character in the input string
     *
     * @param input
     * @return
     */
    public char findSecondaryOccurrence(String input) {

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();
        //I create an hashmap where I have the occurrence presentation for each key(character)
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //I order the entry set in the ascending order according to the value(frequency presentation) and not based on the key
        List<Map.Entry<Character, Integer>> list = map.entrySet().stream()
         .sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue())).collect(Collectors.toList());


        //because I require the second mos frequent I have to start from the end of the array(they are ordered in ascending order)
        return list.get(list.size() - 2).getKey();
    }
}

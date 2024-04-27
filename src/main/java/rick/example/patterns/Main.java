package rick.example.patterns;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> list = List.of("Anseas","Biloc","Aliba","Drenis").stream()
                .map(a -> a + a)
                .filter(e -> e.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());


        System.out.println(list);
    }
}
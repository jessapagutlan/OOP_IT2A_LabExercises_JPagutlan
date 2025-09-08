import java.util.*;
import java.util.stream.Collectors;

public class Exer1_Declarative {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "house", "sun", "computer", "car");

        List<String> longWords = words.stream()
                                      .filter(word -> word.length() > 3)
                                      .collect(Collectors.toList());

        System.out.println("Words with more than 3 letters (Declarative): " + longWords);
    }
}


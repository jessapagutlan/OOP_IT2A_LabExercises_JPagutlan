import java.util.*;

public class Exer1_Functional {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "house", "sun", "computer", "car");

        System.out.println("Words with more than 3 letters (Functional):");
        words.stream()
             .filter(word -> word.length() > 3)
             .forEach(System.out::println);
    }
}
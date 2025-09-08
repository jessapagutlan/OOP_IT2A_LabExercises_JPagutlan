import java.util.*;

public class Exer1_Imperative {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "house", "sun", "computer", "car");
        List<String> longWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() > 3) {
                longWords.add(word);
            }
        }

        System.out.println("Words with more than 3 letters (Imperative): " + longWords);
    }
}
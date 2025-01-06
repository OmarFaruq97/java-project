package SeventhClass;
import java.util.*;

public class CountLettersINArray {
    public static void main(String[] args) {
        String[] cars = {"corolla", "bmw", "ferry","toyota","tesla"};
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (String word : cars) {

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
                }
            }
        }
        System.out.println("Letter frequencies:");
        for (char letter : letterCount.keySet()) {
            System.out.println(letter + ": " + letterCount.get(letter));
        }
    }
}

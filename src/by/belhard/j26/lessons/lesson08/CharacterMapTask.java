package by.belhard.j26.lessons.lesson08;

import java.util.HashMap;
import java.util.Map;

public class CharacterMapTask {

    public static void main(String[] args) {

        String input = "Mama myla ramu";

        Map<Character, Integer> characterMap = new HashMap<>();

        /*for (char c : input.toUpperCase().toCharArray()) {
            if (!characterMap.containsKey(c)) {
                characterMap.put(c, 1);
            } else {
                characterMap.put(c, characterMap.get(c) + 1);
            }
        }*/

        String string = input.toUpperCase();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!characterMap.containsKey(chars[i])) {
                characterMap.put(chars[i], 1);
            } else {
                characterMap.put(chars[i], characterMap.get(chars[i]) + 1);
            }
        }

        characterMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

package codewars;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        Set<String> duplicates = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (Character.toString(text.charAt(i)).equalsIgnoreCase(Character.toString(text.charAt(j)))) {
                    duplicates.add(Character.toString(text.charAt(i)).toLowerCase());
                    break;
                }
            }
        }
        return duplicates.size();
    }

    public static int duplicateCount2(String text) {
        Map<Character, Integer> symbols = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (symbols.containsKey(text.charAt(i))){
                int amount = symbols.get(text.charAt(i));
                symbols.put(text.charAt(i), amount + 1);
            } else {
                symbols.put(text.charAt(i), 1);
            }
        }
        return (int) symbols.entrySet().stream()
                .filter(s -> s.getValue() > 1)
                .count();
    }
}

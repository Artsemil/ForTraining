package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_283 {
    private boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> allChars = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (allChars.containsKey(magazine.charAt(i))) {
                int amount = allChars.get(magazine.charAt(i));
                allChars.put(magazine.charAt(i), amount + 1);
            } else allChars.put(magazine.charAt(i), 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (allChars.containsKey(ransomNote.charAt(i))) {
                if (allChars.get(ransomNote.charAt(i)) > 1) {
                    int amount = allChars.get(ransomNote.charAt(i));
                    allChars.put(ransomNote.charAt(i), amount - 1);
                } else allChars.remove(ransomNote.charAt(i));
            } else return false;
        }
        return true;
    }
}

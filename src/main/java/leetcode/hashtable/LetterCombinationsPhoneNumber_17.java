package leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber_17 {
    public List<String> letterCombinations(String digits) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(2, "abc");
        numbers.put(3, "def");
        numbers.put(4, "ghi");
        numbers.put(5, "jkl");
        numbers.put(6, "mno");
        numbers.put(7, "pqrs");
        numbers.put(8, "tuv");
        numbers.put(9, "wxyz");
        List<String> result = new ArrayList<>();
        char[] num = digits.toCharArray();
        for (int i = 0; i < num.length; i++) {
            String str = numbers.get(Integer.parseInt(String.valueOf(num[i])));
            for (int j = 0; j<str.length(); j++){

            }
        }

        return result;

    }
}

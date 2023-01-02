package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public int romanToInt(String s) {
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        int len = s.length();
        int sum = numbers.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (numbers.get(s.charAt(i)) >= numbers.get(s.charAt(i + 1))) {
                sum = sum + numbers.get(s.charAt(i));
            }
            else {
                sum = sum - numbers.get(s.charAt(i));
            }
        }
        return sum;
    }
}

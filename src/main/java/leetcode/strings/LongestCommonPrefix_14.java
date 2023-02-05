package leetcode.strings;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            String res = first.substring(0, first.length() - i);
            if (Arrays.stream(strs).allMatch(s -> s.indexOf(res) == 0)) {
                return res;
            }
        }
        return "";
    }


    public String bestSolution(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}

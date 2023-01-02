package codewars;

import java.util.Arrays;

public class Meeting {

    public static String meeting(String s) {
        String[] peoples = s.split(";");
        swapNameAndLastName(peoples);
        Arrays.sort(peoples);
        return parseArrayToString(peoples);
    }

    private static void swapNameAndLastName(String[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == ':') {
                    str[i] = str[i].substring(j + 1).toUpperCase() + ", " + str[i].substring(0, j).toUpperCase();
                }
            }
        }
    }

    private static String parseArrayToString(String[] str) {
        String result = "";
        for (String s : str) {
            result += "(" + s + ")";
        }
        return result;
    }
}

package codewars;

import java.util.Arrays;

public class FruitMachine {
    public static int fruit(final String[][] reels, final int[] spins) {

        String[] reel = {"Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack"};
        String[] items = {reels[0][spins[0]], reels[1][spins[1]], reels[2][spins[2]]};
        if (items[0].equals(items[1]) && items[0].equals(items[2])) {
            return (10 - Arrays.asList(reel).indexOf(items[0])) * 10;
        }
        String item = "";
        String extra = "";
        if (items[0].equals(items[1])) {
            item = items[0];
            extra = items[2];
        }
        else if (items[0].equals(items[2])) {
            item = items[0];
            extra = items[1];
        }
        else if (items[1].equals(items[2])) {
            item = items[1];
            extra = items[0];
        }
        if (!item.equals("")) {
            int result = 10 - Arrays.asList(reel).indexOf(item);
            if (extra.equals("Wild")) {
                result = result * 2;
            }
            return result;
        }
        return 0;
    }
}

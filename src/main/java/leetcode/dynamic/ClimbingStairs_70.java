package leetcode.dynamic;

public class ClimbingStairs_70 {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] steps = new int[n + 1];

        steps[1] = 1;
        steps[2] = 2;
        int result;
        for (int i = 2; i < n; i++) {
            steps[i + 1] = steps[i] + steps[i - 1];
        }
        result = steps[n];
        return result;
    }

}

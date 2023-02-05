package leetcode.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {

    public int majorityElement(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        Map<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (elements.containsKey(nums[i])) {
                int amount = elements.get(nums[i]) + 1;
                if (amount > len / 2) {
                    return nums[i];
                }
                elements.put(nums[i], amount);
            } else {
                elements.put(nums[i], 1);
            }
        }
        return 0;
    }


    public int solution2(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];
    }
}

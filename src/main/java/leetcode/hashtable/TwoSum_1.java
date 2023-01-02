package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            int secondNum = target - nums[i];
            if (map.containsKey(secondNum)){
                return new int[]{map.get(secondNum), i};
            } else{
                map.put(nums[i], i);
            }

        }
        return null;
    }
}

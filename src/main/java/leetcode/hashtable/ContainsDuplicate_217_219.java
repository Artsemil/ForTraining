package leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate_217_219 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> table = new HashSet<>();
        for (int i = 0; i< nums.length; i++){
            if (table.contains(nums[i])){
                return true;
            }
            else {
                table.add(nums[i]);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            if (!table.containsKey(nums[i])){
                table.put(nums[i], i);
            }
            else {
                if(i - table.get(nums[i]) <= k){
                    return true;
                }
                else{
                    table.put(nums[i], i);
                }
            }
        }

        return false;
    }
}

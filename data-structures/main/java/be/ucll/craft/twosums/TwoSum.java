package be.ucll.craft.twosums;

import java.util.HashMap;
import java.util.Map;

//This is the naive implementation of the Two Sum problem
// what is the current big O time complexity?
// can you improve it to O(n) time complexity?

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

 
    public static int[] twoSumNew(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (pairs.containsKey(diff)) {
                return new int[] { pairs.get(diff), i };
            }
            pairs.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}

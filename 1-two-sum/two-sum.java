import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int req_ele = target - nums[i];

            // Check if the required element exists in the HashMap
            if (hm.containsKey(req_ele)) {
                return new int[]{hm.get(req_ele), i}; // Return indices of the two numbers
            }

            // Store the current number and its index in the HashMap
            hm.put(nums[i], i);
        }

        return new int[]{}; // Return an empty array if no solution is found
    }
}

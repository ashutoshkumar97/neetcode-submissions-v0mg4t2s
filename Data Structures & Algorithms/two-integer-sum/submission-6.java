class Solution {
    public int[] twoSum(int[] nums, int target) {
        // [3, 4, 5, 6], target 10

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // check if (10 - 3) exists in the map
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}

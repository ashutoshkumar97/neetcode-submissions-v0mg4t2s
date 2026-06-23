class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int x=0; x<nums.length;x++){
            int comp = target - nums[x];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp), x};
            }
            map.put(nums[x], x);
        }
        return new int[]{-1, -1};
    }
}

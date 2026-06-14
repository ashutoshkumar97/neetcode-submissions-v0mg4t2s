class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length || k==0) {
            return nums;
        }
        

        Map<Integer, Integer> map = new TreeMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return map.entrySet().stream()
        .sorted((a,b)-> b.getValue() - a.getValue())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
        //return new int[]{};
    }
}

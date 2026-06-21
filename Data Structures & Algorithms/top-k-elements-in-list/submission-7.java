class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int e: nums){
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        System.out.println("data with map"+map);

        List<Map.Entry<Integer, Integer>> values = new ArrayList<>(map.entrySet());
        
        Collections.sort(values, (a,b) -> b.getValue() - a.getValue());
        System.out.println("values in list"+values);

        int[] result = new int[k];
        for(int j=0; j<k; j++){
            result[j] = values.get(j).getKey(); 
        }
        System.out.println("final array"+Arrays.toString(result));
        return result;

    }
}

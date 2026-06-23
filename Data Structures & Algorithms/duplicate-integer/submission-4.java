class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean res = false;
        for(int a: nums){
            if(!set.add(a)){
                return true;
            }else{
                res = false;
            }
            
        }

        return res;

    }
}
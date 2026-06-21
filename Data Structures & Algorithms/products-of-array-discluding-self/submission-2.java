class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        for(int x=0; x<nums.length;x++){
            int pro = 1;
            for(int y=0; y<nums.length;y++){
                if(x != y){
                    pro = pro * nums[y];
                }
            }
            result[x] = pro;
        }
        return result;
    }
}  

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int x=1; x<nums.length; x++){
            result[x] = nums[x-1] * result[x-1];
        } 
        System.out.println(Arrays.toString(result));

         int suffix = 1;
        for(int y=nums.length-1; y>=0; y--){
            result[y] =result[y] * suffix;
            suffix = suffix * nums[y];
        } 

        System.out.println(Arrays.toString(result));
        return result; 
    }
}  

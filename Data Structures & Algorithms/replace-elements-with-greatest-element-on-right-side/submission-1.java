class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int rightMost = -1;
        for(int x = len-1; x>=0; x--){
            result[x] = rightMost;
            rightMost = Math.max(rightMost, arr[x]);
        }


        return result;
        
    }
}
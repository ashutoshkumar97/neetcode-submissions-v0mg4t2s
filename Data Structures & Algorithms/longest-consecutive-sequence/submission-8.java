public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int longest = 0, currentElement = nums[0], streak = 0, i = 0;

        while (i < nums.length) {
            if (currentElement != nums[i]) {
                currentElement = nums[i];
                streak = 0;
            }
            while (i < nums.length && nums[i] == currentElement) {
                i++;
            }
            streak++;
            currentElement++;
            longest = Math.max(longest, streak);
        }
        return longest;
    }
}
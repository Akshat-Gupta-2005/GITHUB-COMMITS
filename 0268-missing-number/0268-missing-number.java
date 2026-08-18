class Solution {
    public int missingNumber(int[] nums) {
        int x = (nums.length*(nums.length+1))/2;
        for (int i = 0 ; i < nums.length ; i++) x = x-nums[i];
        return x;
    }
}
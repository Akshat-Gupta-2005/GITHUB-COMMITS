class Solution {
    public int maxSubArray(int[] nums) {
        int rs = 0;
        int ms = Integer.MIN_VALUE;


        for (int i = 0 ; i < nums.length ; i++){
            rs += nums[i];
            if (rs > ms) ms = rs;
            if (rs < 0) rs = 0;
        }

        return ms;

    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int r =  0;
        int csum = 0;
        int msum = Integer.MIN_VALUE;

        while(r < n){
            csum += nums[r];
            msum = Math.max(msum , csum);

            if (csum < 0){
                csum = 0;
            }
            r++;
        }

        return msum;
    }
}
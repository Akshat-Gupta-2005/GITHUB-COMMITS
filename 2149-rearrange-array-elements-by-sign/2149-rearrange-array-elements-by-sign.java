class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        if (n == 0) return ans;
        int pi = 0;
        int ni = 1;
        for (int i = 0 ; i < n ; i++){
            if (nums[i] > 0){
                ans[pi] = nums[i];
                pi +=2;
            }else{
                ans[ni] = nums[i];
                ni +=2;
            }
        }

        return ans;
    }
}
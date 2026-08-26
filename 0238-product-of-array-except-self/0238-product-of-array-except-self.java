class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre = 1;
        int post = 1;

        int n = nums.length;
        int [] ans = new int[n];
        Arrays.fill(ans, 1);

        for (int i =  0; i < n ; i++){
            ans[i] = ans[i] * pre;
            pre = pre * nums[i];
            ans[n-1-i] = ans[n-1-i] * post;
            post = post * nums[n-1-i];
        }

        return ans;
    }
}
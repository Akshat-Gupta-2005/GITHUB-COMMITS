class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n <2 ) return n;
        Arrays.sort(nums);
        int max = 1;
        int l = 0;
        int r = 1;

        while(r < n){
            if (nums[r] == nums[r-1] + 1){
                max = max > (r-l+1) ? max : (r-l+1);
                r++;
            }else if(nums[r] == nums[r-1]){
                r++;
                l++;
            }else{
                l = r;
                r++;
            }
        }

        return max;
    }
}
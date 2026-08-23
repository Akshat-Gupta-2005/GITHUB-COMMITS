class Solution {
    public int minOperations(int[] nums) {
        int c = 0;
        int i = 0;
        int n = nums.length;
        if (n == 1 && nums[0] == 0) return 1;
        if (n == 1 && nums[0] == 1) return 0;

        while(i<nums.length && nums[i] == 1) i++;
        if (i>=nums.length) return 0;
        for (int j  = i +1 ; j < nums.length;j++){
            if (nums[j] != nums[j-1]){
                c++;
            }
        }

        return c+1;
    }
}
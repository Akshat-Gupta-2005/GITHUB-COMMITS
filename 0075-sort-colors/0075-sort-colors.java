class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int n0 = -1;
        int n2 = n;

        int n1 = 0;

        while(n1<n2){
            if (nums[n1] == 2){
                int temp = nums[n1];
                nums[n1] = nums[n2-1];
                nums[n2-1] = temp;
                n2--;
            }else if (nums[n1] == 0){
                int temp = nums[n1];
                nums[n1] = nums[n0+1];
                nums[n0+1] = temp;
                n0++;
                n1++;
            }else{
                n1++;
            }
        }

        return ;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        if (n == 1) return false;
        for (int i = 0 ; i < n ; i++){
            if (s.contains(nums[i])) return true;
            s.add(nums[i]);
        }

        return n != s.size();
    }
}
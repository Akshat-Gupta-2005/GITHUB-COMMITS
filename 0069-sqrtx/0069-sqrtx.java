class Solution {
    public int mySqrt(int x) {
        // if (x == 0) return x;
        // if (x < 4) return 1;

        // int l = 2 , r = x/2 ;
        // int mid = 0;
        // int ans = 0;
        // while(l<=r){
        //      mid = l + (r - l)/2;

        //     if (mid <= x/mid) {
        //         ans = mid;
        //         l = mid +1;
        //     }
        //     else r = mid -1;
        // }

        // return ans;
        if (x == 0) return 0;
        if (x < 4) return 1;
        int l = 0 , r = x/2;
        int ans = 0;

        while(l<=r){
            int mid = l + (r-l)/2;

            if (mid <= x/mid) {
                ans = mid;
                l = mid+1;
            }else{
                r = mid - 1;
            }
        }

        return ans;
    }
}
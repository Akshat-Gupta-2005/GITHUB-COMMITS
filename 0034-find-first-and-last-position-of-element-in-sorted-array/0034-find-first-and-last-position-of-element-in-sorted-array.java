class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int l = 0, r = nums.length - 1, f=-1, l2 =-1;

        // while(l<=r){
        //     int mid = l + (r-l)/2;

        //     if (nums[mid] == target){
        //         f = mid;
        //         r = mid - 1;
        //     }else if (nums[mid] > target){
        //         r = mid - 1;
        //     }else{
        //         l = mid +1;
        //     }
        // }
        // l = 0;
        // r = nums.length - 1;
        // while(l<=r){
        //     int mid = l + (r-l)/2;

        //     if (nums[mid] == target){
        //         l2 = mid;
        //         l = mid + 1;
        //     }else if (nums[mid] > target){
        //         r = mid - 1;
        //     }else{
        //         l = mid +1;
        //     }
        // }

        // return new int[]{f,l2};


        int la = -1;
        int ra = -1;

        int l = 0 , r = nums.length - 1;
        while(l<=r){
            int mid = l + (r-l)/2;

            if (nums[mid] == target){
                la = mid;
                r = mid - 1;
            }

            else if (nums[mid] < target){
                l = mid+1;
            }else r = mid - 1;
        }
        l = 0 ;
        r = nums.length - 1;
        while(l<=r){
            int mid = l + (r-l)/2;

            if (nums[mid] == target){
                ra = mid;
                l = mid + 1;
            }

            else if (nums[mid] < target){
                l = mid+1;
            }else r = mid - 1;
        }

        return new int[]{la,ra};

    }
}